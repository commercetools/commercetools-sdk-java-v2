SHELL := /bin/bash
CHANGES_PENDING := `git status --porcelain -- ':(exclude)*gen.properties' | grep -c ^ || true`
API_RAML ?= $(RAML_FILE)
IMPORT_RAML ?= $(RAML_FILE)
ML_RAML ?= $(RAML_FILE)
HISTORY_RAML ?= $(RAML_FILE)
CPUS := `./tools/numcpu.sh`

.PHONY: build build_api_sdk build_import_sdk build_import_sdk build_ml_sdk gen_api_sdk gen_import_sdk gen_ml_sdk gen_history_sdk

build: codegen_install gen_api_sdk gen_import_sdk gen_ml_sdk gen_history_sdk prettify verify
build_api_sdk: codegen_install gen_api_sdk prettify verify
build_import_sdk: codegen_install gen_import_sdk prettify verify
build_ml_sdk: codegen_install gen_ml_sdk prettify verify
build_history_sdk: codegen_install gen_history_sdk prettify verify

gen_api_sdk: generate_api
gen_import_sdk: generate_import
gen_ml_sdk: generate_ml
gen_history_sdk: generate_history

prettify:
	./gradlew spotlessApply

verify:
	./gradlew clean test

codegen_install:
	curl -o- -s https://raw.githubusercontent.com/vrapio/rmf-codegen/master/scripts/install.sh | bash

generate_api:
	$(MAKE) -C commercetools LIB_NAME="api" GEN_RAML_FILE=../$(API_RAML) generate_sdk

generate_import:
	$(MAKE) -C commercetools LIB_NAME="importapi" GEN_RAML_FILE=../$(IMPORT_RAML) generate_sdk

generate_ml:
	$(MAKE) -C commercetools LIB_NAME="ml" PACKAGE_DIR="machine-learning" GEN_RAML_FILE=../$(ML_RAML) generate_sdk

generate_history:
	$(MAKE) -C commercetools LIB_NAME="history" GEN_RAML_FILE=../$(HISTORY_RAML) generate_sdk

check_pending:
	git status --porcelain -- ':(exclude)*gen.properties'
	@echo "CHANGES_PENDING=$(CHANGES_PENDING)" >> $GITHUB_ENV
