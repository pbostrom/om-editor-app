(defproject om-editor-app "0.1.0-SNAPSHOT"
  :description "Example app using om-codemirror"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2322"]
                 [om-codemirror "0.2.0"]
                 [pbostrom/om "0.7.3"]]

  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-cljsasset "0.1.0"]]

  ;; :cljsasset {:js-output {:dir "resources/public/js"
  ;;                         :file "assets.js"}
  ;;             :css-output {:dir "resources/public/css"
  ;;                          :file "assets.css"}}

  :cljsbuild {
    :builds [{:source-paths ["src"]
              :compiler {
                :output-to "app.js"
                :output-dir "out"
                :optimizations :whitespace
                :source-map "app.js.map"}}]})
