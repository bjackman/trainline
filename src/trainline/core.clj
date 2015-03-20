(ns trainline.core
  (:require [cheshire.core])
  (:gen-class))

(defn parse-reservation [json]
  (first (cheshire.core/parse-string json true)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
