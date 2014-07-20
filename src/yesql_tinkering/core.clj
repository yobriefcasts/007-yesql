(ns yesql-tinkering.core
  (:require [yesql.core :refer [defquery defqueries]]
            [clojure.pprint :refer [pprint]]))

(def db-spec {:classname    "org.h2.Driver"
              :subprotocol  "h2"
              :subname      "./resources/demo.db"
              :user         "sa"
              :password     "" })

(defquery get-all-people "sql/get-all-people.sql")

(defquery get-people-by-surname "sql/get-people-by-surname.sql")

(defqueries "sql/get-persons.sql")

(defquery insert-person! "sql/insert-person.sql")

(defquery insert-person<! "sql/insert-person.sql")

