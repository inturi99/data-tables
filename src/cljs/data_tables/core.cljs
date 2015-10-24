  (ns data-tables.core
    (:require [reagent.core :as reagent]))

  (defn home-render []
    [:table.table.table-striped.table-bordered 
     {:cell-spacing "0" :width "100%"}

     [:thead>tr 
      [:th "Title"]
      [:th "URL"]
      [:th "Tags"]]

     [:tbody
      [:tr 
       [:td "Technoidentity"]
       [:td "www.technoidentity.com"]
       [:td "Technoidentity"]]

      [:tr 
       [:td "VendeepTechnoidentity"]
       [:td "www.technoidentity.com"]
       [:td "Technoidentity"]]
      
      [:tr 
       [:td "RRSolutions"]
       [:td "www.technoidentity.com"]
       [:td "Technoidentity"]]
      
      [:tr 
       [:td "SIKKIMILP"]
       [:td "www.technoidentity.com"]
       [:td "Technoidentity"]]

      [:tr 
       [:td "SNTONLINE"]
       [:td "www.technoidentity.com"]
       [:td "Technoidentity"]]
      [:tr 
       [:td "Cybervillage"]
       [:td "www.technoidentity.com"]
       [:td "Technoidentity"]]

      [:tr 
       [:td "ReitzIndia"]
       [:td "www.technoidentity.com"]
       [:td "Technoidentity"]]
      [:tr 
       [:td "Reliance Dimond Tools"]
       [:td "www.technoidentity.com"]
       [:td "Technoidentity"]]
      [:tr 
       [:td "Taxontource"]
       [:td "www.technoidentity.com"]
       [:td "Technoidentity"]]
      [:tr 
       [:td "FileTracking"]
       [:td "www.technoidentity.com"]
       [:td "Technoidentity"]]
      [:tr 
       [:td "BlueFlox"]
       [:td "www.technoidentity.com"]
       [:td "Technoidentity"]]
      [:tr 
       [:td "AnimalHusbandry"]
       [:td "www.technoidentity.com"]
       [:td "Technoidentity"]]

      ]])

  (defn home-did-mount [this]
    (.DataTable (js/$ (reagent/dom-node this))))


  (defn home []
    (reagent/create-class {:reagent-render home-render
                           :component-did-mount home-did-mount}))

  (defn ^:export main []
    (reagent/render [home]
                    (.getElementById js/document "app")))

