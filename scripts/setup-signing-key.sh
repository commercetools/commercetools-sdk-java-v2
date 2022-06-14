#!/bin/bash

set -e

# Decrypt credentials
echo ${DECRYPTER} | base64 --decode > decrypter.json
echo ${SIGNING_KEY} | base64 --decode > signing_key.enc
echo ${PASSPHRASE} | base64 --decode > signing_passphrase.enc

gcloud auth activate-service-account --key-file decrypter.json

echo "Decrypt signing secrets"

gcloud kms decrypt \
  --project=commercetools-platform \
  --location=global \
  --keyring=teamcity \
  --key=jvm-sdk \
  --ciphertext-file=signing_key.enc \
  --plaintext-file=signing_key.asc

gcloud kms decrypt \
  --project=commercetools-platform \
  --location=global \
  --keyring=teamcity \
  --key=jvm-sdk \
  --ciphertext-file=signing_passphrase.enc \
  --plaintext-file=signing_passphrase.txt

# Import the GPG key
set +e
echo "Importing the signing key"
gpg --import --no-tty --batch --yes signing_key.asc
set -e

# List available GPG keys
gpg -K

KEYNAME=`gpg --with-colons --keyid-format long --list-keys automation@commercetools.de | grep fpr | cut -d ':' -f 10`

mkdir -p ~/.gradle
touch ~/.gradle/gradle.properties

echo "signing.gnupg.executable=gpg" >> ~/.gradle/gradle.properties
echo "signing.gnupg.keyName=$KEYNAME" >> ~/.gradle/gradle.properties
echo "signing.gnupg.passphrase=$(<signing_passphrase.txt)" >> ~/.gradle/gradle.properties

rm -rf signing_passphrase.txt signing_passphrase.enc signing_key.enc decrypter.json signing_key.asc

