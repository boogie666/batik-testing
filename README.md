# batik-tests

A Clojure library designed to ... well, that part is up to you.

## Usage

text-anchor must have a valid value or it must not exist
  valid values are "start | middle | end | inherit"
  inherit should be the default not empty string

css props should not be vendor prefixed. font-smoothing not -webkit-font-smoothing
  transparent is not a valid fill style. should be fill="none"


invalid svg tags must not exists in svg (the noscript tag is invalid)

any used xml namespaces need to be added to the root svg node

## License

Copyright © 2017 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
