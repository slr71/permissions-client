(defproject org.cyverse/permissions-client "2.8.2-SNAPSHOT"
  :description "A Clojure client library for the CyVerse permissions service."
  :url "https://github.com/cyverse-de/permissions-client"
  :license {:name "BSD"
            :url "http://iplantcollaborative.org/sites/default/files/iPLANT-LICENSE.txt"}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :plugins [[jonase/eastwood "0.4.2"]
            [lein-ancient "0.7.0"]
            [test2junit "1.2.2"]]
  :dependencies [[cheshire "5.10.0"]
                 [clj-http "3.12.1"]
                 [com.cemerick/url "0.1.1" :exclusions [com.cemerick/clojurescript.test]]
                 [medley "1.3.0"]
                 [org.clojure/clojure "1.10.3"]]
  :profiles {:dev {:dependencies [[clj-http-fake "1.0.3"]]}
             :repl {:source-paths ["repl"]}})
