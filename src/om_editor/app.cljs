(ns om-editor.app
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [om-codemirror.core :as cm]
            [cljs.core.async :refer [put! <! chan]]
            [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(enable-console-print!)

(def app-state (atom {}))

(defn cm-app [app owner]
  (reify
    om/IWillMount
    (will-mount [_]
      (let [comm (chan)]
        (om/set-state! owner :comm comm)
        (go (while true
              (let [e (<! comm)]
                (println "hotkey" e))))))
    om/IRenderState
    (render-state [_ {:keys [comm]}]
      (dom/div nil
        (dom/div #js {:className "cm-box"}
          (om/build cm/editor app
            {:init-state {:comm comm}}))))))

(om/root cm-app app-state {:target (.getElementById js/document "cmapp")})
