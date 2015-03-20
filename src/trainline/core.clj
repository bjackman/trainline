(ns trainline.core
  (:require [cheshire.core])
  (:gen-class))

(defn parse-reservation [json]
  (first (cheshire.core/parse-string json true)))

(defn -main [& args]
  (let [info (parse-reservation (slurp "example.json"))]
    (let [reservation (:reservationFor info)]
      (println (:name reservation)))))
