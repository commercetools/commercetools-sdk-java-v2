SHELL := /bin/bash
PACKAGE_DIR ?= $(LIB_NAME)

generate_sdk:
	rmf-codegen generate -o "commercetools/$(PACKAGE_DIR)/generated/src/main/java" -t JAVA_COMPLETE -b "com/commercetools/$(LIB_NAME)" $(GEN_RAML_FILE)


