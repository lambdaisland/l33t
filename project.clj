;; project.clj
(defproject l33t "0.1.0"
  :dependencies [[org.clojure/clojure "1.9.0-alpha15"]
                 [org.clojure/clojurescript "1.9.521"]]

  :plugins [[lein-cljsbuild "1.1.5"]]

  :cljsbuild {:builds [{:id "prod"
                        :source-paths ["src"]
                        :compiler {:main l33t.core
                                   :output-to "package/index.js"
                                   :target :nodejs
                                   :output-dir "target"
                                   :externs ["externs.js"]
                                   :optimizations :advanced
                                   :pretty-print true
                                   :parallel-build true}}]})
