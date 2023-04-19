
package com.commercetools.importapi.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Every Import Operation is assigned with one of the following states.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProcessingState extends JsonEnum {

    /**
    	<p>Initial state assigned if the format (JSON structure and fields) meets the Import API's specification. The resource import is in progress.</p>

    */
    ProcessingState PROCESSING = ProcessingStateEnum.PROCESSING;
    /**
    	<p>Either the request payload is missing the data as per the Import API's specification or even though the references were resolved, the data does not meet the validation constraints.</p>

    */
    ProcessingState VALIDATION_FAILED = ProcessingStateEnum.VALIDATION_FAILED;
    /**
    	<p>Import Request contains key references to resources that are currently not present in commercetools Composable Commerce.</p>

    */
    ProcessingState UNRESOLVED = ProcessingStateEnum.UNRESOLVED;
    /**
    	<p>Waiting for a master variant to arrive. The Product Import has required attributes and thus a master variant that provides those is required.</p>

    */
    ProcessingState WAIT_FOR_MASTER_VARIANT = ProcessingStateEnum.WAIT_FOR_MASTER_VARIANT;
    /**
    	<p>Resource was successfully imported.</p>

    */
    ProcessingState IMPORTED = ProcessingStateEnum.IMPORTED;
    /**
    	<p>Resource could not be imported. References were resolved, but the system could not import the data due to an internal server error and the limit of retry has been reached.</p>

    */
    ProcessingState REJECTED = ProcessingStateEnum.REJECTED;

    /**
     * possible values of ProcessingState
     */
    enum ProcessingStateEnum implements ProcessingState {
        /**
         * processing
         */
        PROCESSING("processing"),

        /**
         * validationFailed
         */
        VALIDATION_FAILED("validationFailed"),

        /**
         * unresolved
         */
        UNRESOLVED("unresolved"),

        /**
         * waitForMasterVariant
         */
        WAIT_FOR_MASTER_VARIANT("waitForMasterVariant"),

        /**
         * imported
         */
        IMPORTED("imported"),

        /**
         * rejected
         */
        REJECTED("rejected");
        private final String jsonName;

        private ProcessingStateEnum(final String jsonName) {
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
     * factory method for a enum value of ProcessingState
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ProcessingState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ProcessingState() {
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
     * @param value the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<ProcessingState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ProcessingState[] values() {
        return ProcessingStateEnum.values();
    }

}
