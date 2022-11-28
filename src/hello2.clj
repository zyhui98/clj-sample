(ns hello2
  (:require [java-time.api :as t])
  (:gen-class :main true)
)
(import  java.util.concurrent.TimeUnit)

(defn time-str
      "Returns a string representation of a datetime in the local time zone."
      [instant]
      (t/format
        (t/with-zone (t/formatter "hh:mm a") (t/zone-id))
        instant))

(defn -main [& args]
      (println "Hello 6, the time is" (time-str (t/instant)))
      (println "Hello 7, the time is" (time-str (t/instant)))
      (println "Hello 8, the time is" (time-str (t/instant)))
      (println "Hello 9, the time is" (time-str (t/instant)))
      (println "Hello world2, the time is" (time-str (t/instant)))
      (println "Hello world2, the time is" (time-str (t/instant)))
      )

