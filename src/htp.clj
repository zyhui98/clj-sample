(ns htp
  (:use org.httpkit.server))

(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "hello ithomer.net"})

(run-server app {:ip "127.0.0.1" :port 8888 :thread 10})
(println "look at: http://127.0.0.1:8888")
