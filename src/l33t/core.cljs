;; src/l33t/core.cljs
(ns l33t.core
  (:require [clojure.string :as str]
            [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn -main [& args]
  (-> (str/join " " args)
      (str/replace #"cker\b" "xor")
      (str/replace #"e|E" "3")
      (str/replace #"i|I" "1")
      (str/replace #"o|O" "0")
      (str/replace #"s|S" "5")
      (str/replace #"a|A" "4")
      (str/replace #"t|T" "7")
      (str/replace #"b|B" "6")
      (str/replace #"c|C" "(")
      println))

(set! *main-cli-fn* -main)
