#!/bin/bash
x=1
for (( ; ; ))
do
  curl -insecure https://localhost:8080/music/users/
  x=$((x+1))
  echo "Hit $x times"
done