#!/bin/sh

#normal

case "$1" in
  stdsort)
    cat -n Privat Dienstlich | sort -k 2 | uniq
;;
  sort)
    cat -n Privat Dienstlich | sort -k 3 | uniq
;;
  caesar)
      echo "CAESAR" | tr 'A-Z' 'D-ZA-C'
;;
  klar)
      echo "Klartext" |tr 'a-z' 'A-Z' | tr 'A-Z' 'D-ZA-C'
;;
  klein)
        echo "$2" | tr 'A-Za-z' 'D-ZA-Cd-za-c'
;;
  echo)
      echo '"'
;;
  rot13)
    echo "$2" |tr 'a-z' 'A-Z' | tr 'A-Z' 'N-ZA-M'
;;
  rot13klein)
    echo "$2" | tr 'A-Za-z' 'N-Mn-m'
;;
*)
  echo "Probiers mit {stdsort|sort|caesar|klar|klein|echo|rot13|rot13klein}"
;;
esac
