(defproject trainline "0.1.0-SNAPSHOT"
  :description "Convert email webhooks to event webhooks"
  :url "https://github.com/bjackman/trainline"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot trainline.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
