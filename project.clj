(defproject batik-tests "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 ;; [org.apache.xmlgraphics/batik-transcoder "1.9.1"]
                 ;; [org.apache.xmlgraphics/batik-bridge "1.9.1"]
                 ;; [org.apache.xmlgraphics/batik-svggen "1.9.1"]
                 [org.clojars.pallix/batik "1.7.0"]
                 [org.apache.xmlgraphics/fop "1.0"]]


  :mirrors {"batik" {:id "batik"
                     :url "https://mvnrepository.com/artifact/"}})
