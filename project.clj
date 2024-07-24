(defproject org.cyverse/permissions-client "2.8.5-SNAPSHOT"
  :description "A Clojure client library for the CyVerse permissions service."
  :url "https://github.com/cyverse-de/permissions-client"
  :license {:name "BSD"
            :url "https://cyverse.org/license"}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :plugins [[jonase/eastwood "1.4.3"]
            [lein-ancient "0.7.0"]
            [test2junit "1.4.4"]]
  :dependencies [[cheshire "5.13.0"]
                 [clj-http "3.13.0"]
                 [com.cemerick/url "0.1.1" :exclusions [com.cemerick/clojurescript.test]]
                 [com.github.seancorfield/honeysql "2.6.1147"]
                 [medley "1.4.0"]
                 [org.clojure/clojure "1.11.3"]]
  :profiles {:dev {:dependencies [[clj-http-fake "1.0.4"]]}
             :repl {:source-paths ["repl"]}})
