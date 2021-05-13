(defproject org.cyverse/permissions-client "2.8.2-SNAPSHOT"
  :description "A Clojure client library for the CyVerse permissions service."
  :url "https://github.com/cyverse-de/permissions-client"
  :license {:name "BSD"
            :url "http://iplantcollaborative.org/sites/default/files/iPLANT-LICENSE.txt"}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :plugins [[test2junit "1.2.2"]]
  :dependencies [[cheshire "5.6.3"]
                 [clj-http "3.4.1"]
                 [com.cemerick/url "0.1.1" :exclusions [com.cemerick/clojurescript.test]]
                 [medley "0.8.4"]
                 [org.clojure/clojure "1.8.0"]]
  :profiles {:test {:dependencies [[clj-http-fake "1.0.3"]]}
             :repl {:source-paths ["repl"]}})
