#!/usr/bin/env bash

./gradlew clean build bintrayUpload --info -Dpublish=true -x test