(defproject om-editor "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2227"]
                 [om-codemirror "0.2.0-SNAPSHOT"]
                 [om "0.6.5-SNAPSHOT"]]

  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-cljsasset "0.1.0-SNAPSHOT"]]

  :cljsasset {:js []
              :css []
              :js-output {:dir "resources/js"
                          :file "assets.js"}
              :css-output {:dir "resources/css"
                           :file "assets.css"}}

  :cljsbuild { 
    :builds [{:source-paths ["src"]
              :compiler {
                :output-to "app.js"
                :output-dir "out"
                :optimizations :whitespace
                :source-map "app.js.map"}}]})
