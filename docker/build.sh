#!/usr/bin/env bash

profile=$1

if [[ -z "$profile" ]]
then
  printf "Please provide spring profile.\n"
  printf "Example: $0 {standard|whitelabel}"
  exit 1
fi

docker build \
  --file docker/Dockerfile \
  --build-arg PROFILE=$profile \
  --tag "profile-build-test:latest" \
  .
