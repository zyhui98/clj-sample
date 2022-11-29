(ns jbyf)

(def data (clojure.java.io/file "deps.edn"))
;; This program displays Hello World
(defn example [opts]

   (if (= 2 2 )
        (println (.exists data))
        (println (+ 1 9))))
