SHELL := /bin/bash
PACKAGE_DIR ?= $(LIB_NAME)

generate_sdk:
	rmf-codegen generate -o "$(PACKAGE_DIR)/commercetools-$(LIB_NAME)-generated/src/main/java" -t JAVA_CLIENT -b "com/commercetools/$(LIB_NAME)" $(GEN_RAML_FILE)


