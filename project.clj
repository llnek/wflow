;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defproject io.czlab/flux "2.0.1"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :description "A simple workflow engine"
  :url "https://github.com/llnek/flux"

  :dependencies [[io.czlab/basal "2.0.1"]]

  :plugins [[cider/cider-nrepl "0.22.4"]
            [lein-codox "0.10.7"]]

  :profiles {:provided {:dependencies
                        [[org.clojure/clojure "1.10.1" :scope "provided"]]}
             :uberjar {:aot :all}}

  :global-vars {*warn-on-reflection* true}
  :target-path "out/%s"
  :aot :all

  :coordinate! "czlab"
  :omit-source true

  :java-source-paths ["src/main/java" "src/test/java"]
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]

  :test-selectors {:core :test-core}

  :jvm-opts ["-Dlog4j.configurationFile=file:attic/log4j2.xml"]
  :javac-options ["-source" "11"
                  "-target" "11"
                  "-Xlint:unchecked" "-Xlint:-options" "-Xlint:deprecation"])

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;EOF


