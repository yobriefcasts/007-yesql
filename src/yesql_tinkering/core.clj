(ns yesql-tinkering.core
  (:require [yesql.core :refer [defquery]]))

(def db-spec {:classname    "org.h2.Driver"
              :subprotocol  "h2"
              :subname      "./resources/demo.db"
              :user         "sa"
              :password     "" })
