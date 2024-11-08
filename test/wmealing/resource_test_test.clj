(ns wmealing.resource-test-test
  (:require [clojure.test :refer :all]
            [wmealing.resource-test :refer :all]))

(deftest a-test
  (testing "Loading a file from a resource works"
    (is (= "this is hello.txt\n" (slurp (load-text-file) ) )))  )
