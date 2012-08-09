#!/bin/bash
for (( ; ; ))
do
  curl http://localhost:8080/music/users/
  curl http://localhost:8080/music/users/12a89fe1ee5
  curl http://localhost:8080/music/users/12a89fe1ee5/collections
  curl http://localhost:8080/music/users/12a89fe1ee5/playlists
  curl http://localhost:8080/music/users/playlists/12a8a1dfb15
done