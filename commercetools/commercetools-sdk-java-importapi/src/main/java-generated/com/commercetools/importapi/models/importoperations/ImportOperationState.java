
package com.commercetools.importapi.models.importoperations;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Describes the validation state of a newly created ImportOperation.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ImportOperationState extends JsonEnum {

    /**
    <p>The import is in process. This is the initial state of the ImportOperation.</p> */
    ImportOperationState PROCESSING = ImportOperationStateEnum.PROCESSING;
    /**
    <p>The validation of the import resource failed.</p> */
    ImportOperationState VALIDATION_FAILED = ImportOperationStateEnum.VALIDATION_FAILED;

    /**
     * possible values of ImportOperationState
     */
    enum ImportOperationStateEnum implements ImportOperationState {
        /**
         * processing
         */
        PROCESSING("processing"),

        /**
         * validationFailed
         */
        VALIDATION_FAILED("validationFailed");
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

    /**
     * the JSON value
     * @return json value
     */
    @JsonValue
    String getJsonName();

    /**
     * the enum value
     * @return name
     */
    String name();

    /**
     * convert value to string
     * @return string representation
     */
    String toString();

    /**
     * factory method for a enum value of ImportOperationState
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<ImportOperationState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ImportOperationState[] values() {
        return ImportOperationStateEnum.values();
    }

}
