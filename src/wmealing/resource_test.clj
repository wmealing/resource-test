(ns wmealing.resource-test
  (:gen-class)
  (:require [clojure.java.io :as io]))

(def data-file )

(defn load-text-file []
  (io/resource
   "hello.txt" )
  )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
;;  (println (slurp (load-text-file)))
  (println (clojure.java.io/resource "."))
  )
