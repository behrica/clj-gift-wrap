(defproject clj-gift-wrap "0.0.1-SNAPSHOT"
  :description "Utility for create interop wrappers in clojure synta style"
  :dependencies [[org.clojure/clojure "1.10.0"]
  				 [inflections "0.7.3"]
  				 [org.fife.ui/rsyntaxtextarea "2.0.3"]]
  :main clj-gift-wrap.core
  :dev-dependencies [[lein-autodoc "0.9.0"]]
  :autodoc 	{:name "Gift Wrappers" :page-title "RText"})
