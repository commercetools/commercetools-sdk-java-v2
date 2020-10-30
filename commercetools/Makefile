SHELL := /bin/bash
PACKAGE_DIR ?= $(LIB_NAME)

generate_sdk:
	rmf-codegen generate -o "commercetools-sdk-java-$(LIB_NAME)/src/main/java-generated" -t JAVA_CLIENT -b "com/commercetools/$(LIB_NAME)" $(GEN_RAML_FILE)
