(ns batik-tests.core
  (:require [clojure.java.io :as io])
  (:import (org.apache.batik.transcoder TranscoderInput
                                        TranscoderOutput
                                        Transcoder)
           (org.apache.fop.svg PDFTranscoder)))

(defprotocol Transcodable
  (transcode! [coder in-stream out-stream]))


(extend-protocol Transcodable
  Transcoder
  (transcode! [this src dest]
    (let [in-stream (io/input-stream src)
          out-stream (io/output-stream dest)
          in-trancoder (TranscoderInput. in-stream)
          out-transcoder (TranscoderOutput. out-stream)]
      (.transcode this in-trancoder out-transcoder)
      (.flush out-stream)
      (.close out-stream)
      (.close in-stream))))


;;(transcode! (PDFTranscoder.) "resources/in.svg" "resources/out.pdf")
