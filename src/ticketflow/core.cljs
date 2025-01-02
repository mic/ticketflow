(ns ticketflow.core
  (:require [reagent.core :as r]
            [reagent.dom :as r.dom]
            ["react-dom/client" :as ReactDOM]
            [axios]
            [moment]))

(defonce root (ReactDOM/createRoot (.getElementById js/document "app")))

;; (defn init []
;;   (js/console.log "ClojureScript is working!"))

(defn app []
  [:div "Hello, React 18 with Reagent!"])

(defn mount []
  (.render root (r/as-element [app])))

(defn init []
  (mount))