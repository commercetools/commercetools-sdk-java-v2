
package com.commercetools.importapi.models.importoperations;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Describes the validation state of a newly created <a href="#importoperation">ImportOperation</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ImportOperationState {

    /**
    	<p>This is an initial state of import resource and is currently unresolved.</p>

    */
    ImportOperationState UNRESOLVED = ImportOperationStateEnum.UNRESOLVED;
    /**
    	<p>The validation of the import resource failed.</p>

    */
    ImportOperationState VALIDATION_FAILED = ImportOperationStateEnum.VALIDATION_FAILED;

    enum ImportOperationStateEnum implements ImportOperationState {
        UNRESOLVED("Unresolved"),

        VALIDATION_FAILED("ValidationFailed");
        private final String jsonName;

        private ImportOperationStateEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    String toString();

    @JsonCreator
    public static ImportOperationState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ImportOperationState() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }

            public String toString() {
                return value;
            }
        });
    }

    public static Optional<ImportOperationState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ImportOperationState[] values() {
        return ImportOperationStateEnum.values();
    }
}
