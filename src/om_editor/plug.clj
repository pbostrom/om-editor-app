(ns om-editor.plug
  (:require [clojure.pprint :as pprint]
;            [leiningen.core.project :as proj]
            [clojure.java.io :as io]))

(defn print-deps
  []
; (pprint/pprint (proj/read (io/as-file (io/resource "META-INF/leiningen/om-codemirror/om-codemirror/project.clj")))
  (pprint/pprint (read-string (slurp (io/resource "META-INF/leiningen/om-codemirror/om-codemirror/project.clj")))))

(read-string (slurp (io/resource "META-INF/leiningen/om-codemirror/om-codemirror/project.clj")))

(defn print-project [group artifact]
  (let [pfile (str "META-INF/leiningen/" group "/" artifcat "/project.clj")])
  (read-string (slurp (clojure.java.io/resource pfile))))
