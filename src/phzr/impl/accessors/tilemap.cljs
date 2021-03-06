(ns phzr.impl.accessors.tilemap)

(def tilemap-constants
  {:csv "CSV"
   :east "EAST"
   :north "NORTH"
   :south "SOUTH"
   :tiled-json "TILED_JSON"
   :west "WEST"})

(def tilemap-get-properties
  {:collide-indexes "collideIndexes"
   :collision "collision"
   :current-layer "currentLayer"
   :debug-map "debugMap"
   :format "format"
   :game "game"
   :height "height"
   :height-in-pixels "heightInPixels"
   :imagecollections "imagecollections"
   :images "images"
   :key "key"
   :layer "layer"
   :layers "layers"
   :objects "objects"
   :orientation "orientation"
   :properties "properties"
   :tile-height "tileHeight"
   :tile-width "tileWidth"
   :tiles "tiles"
   :tilesets "tilesets"
   :version "version"
   :width "width"
   :width-in-pixels "widthInPixels"})

(def tilemap-set-properties
  {:collide-indexes "collideIndexes"
   :collision "collision"
   :current-layer "currentLayer"
   :debug-map "debugMap"
   :format "format"
   :game "game"
   :height "height"
   :height-in-pixels "heightInPixels"
   :imagecollections "imagecollections"
   :images "images"
   :key "key"
   :layer "layer"
   :layers "layers"
   :objects "objects"
   :orientation "orientation"
   :properties "properties"
   :tile-height "tileHeight"
   :tile-width "tileWidth"
   :tiles "tiles"
   :tilesets "tilesets"
   :version "version"
   :width "width"
   :width-in-pixels "widthInPixels"})