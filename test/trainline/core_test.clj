(ns trainline.core-test
  (:require [clojure.test :refer :all]
            [trainline.core :refer :all]))

(deftest parse-test
  (let [json (slurp "example.json")]
    (testing "Can parse JSON"
      (is (= (:reservationNumber (parse-reservation json)) "2141684966")))))
