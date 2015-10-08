(ns babelfeesh.test-runner
  (:require
   [cljs.test :refer-macros [run-tests]]
   [babelfeesh.core-test]))

(enable-console-print!)

(defn runner []
  (if (cljs.test/successful?
       (run-tests
        'babelfeesh.core-test))
    0
    1))
