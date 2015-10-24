(defproject data-tables "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 ;; Backend dependencies
                 [compojure "1.3.4"]
                 [ring/ring-core "1.3.2" :exclusions [javax.servlet/servlet-api]]
                 [ring/ring-servlet "1.3.2" :exclusions [javax.servlet/servlet-api]]
                 [ring/ring-defaults "0.1.2" :exclusions [javax.servlet/servlet-api]]
                 [cc.qbits/jet "0.5.4"]
                 [org.clojure/clojurescript "1.7.122"]
                 [secretary "1.2.3"]
                 [reforms "0.4.0"]
                 [reagent "0.5.1"]]

  :source-paths ["src/clj"]
  :main data-tables.core
  :plugins [[lein-cljsbuild "1.0.6"]]

  :clean-targets ^{:protect false} ["resources/public/js/compiled" "target" "test/js"]

  :cljsbuild {:builds [{:id "prod"
                        :source-paths ["src/cljs"]
                        :compiler {:output-to "resources/public/js/app.js"
                                   :output-dir "resources/public/js/out"
                                   :source-map true
                                   :optimizations :none
                                   :asset-path "/static/js/out"
                                   :main "data-Tables.core"
                                   :pretty-print true}}]})
