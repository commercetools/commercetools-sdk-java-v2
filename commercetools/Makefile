SHELL := /bin/bash
PACKAGE_DIR ?= $(LIB_NAME)

generate_sdk: generate_sdk_main generate_sdk_test

generate_sdk_main:
	rmf-codegen generate -o "commercetools-sdk-java-$(LIB_NAME)/src/main/java-generated" -t JAVA_CLIENT -b "com/commercetools/$(LIB_NAME)" --mappingFile "commercetools-sdk-java-$(LIB_NAME)/typesmap.properties" $(GEN_RAML_FILE)

generate_sdk_test:
	rmf-codegen generate -o "commercetools-sdk-java-$(LIB_NAME)/src/test/java-generated" -t JAVA_TEST -b "com/commercetools/$(LIB_NAME)" --mappingFile "commercetools-sdk-java-$(LIB_NAME)/typesmap.properties" $(GEN_RAML_FILE)
