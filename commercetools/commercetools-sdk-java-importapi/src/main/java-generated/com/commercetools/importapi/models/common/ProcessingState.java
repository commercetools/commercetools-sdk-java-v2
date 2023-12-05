
package com.commercetools.importapi.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Every Import Operation is assigned one of the following states.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProcessingState extends JsonEnum {

    /**
    	<p>The initial state assigned if the request payload (JSON structure and fields) meets Import API specifications. The resource import is in progress.</p>

    */
    ProcessingState PROCESSING = ProcessingStateEnum.PROCESSING;
    /**
    	<p>Either the request payload is missing the data as per Import API specifications, or even though the references were resolved, the data does not meet validation constraints.</p>

    */
    ProcessingState VALIDATION_FAILED = ProcessingStateEnum.VALIDATION_FAILED;
    /**
    	<p>The import request contains <a href="ctp:import:type:KeyReference">KeyReferences</a> to resources that do not exist in your Composable Commerce Project.</p>

    */
    ProcessingState UNRESOLVED = ProcessingStateEnum.UNRESOLVED;
    /**
    	<p>Products must have at least one Product Variant, also known as the Master Variant. If you import a Product without a Master Variant, the import request will have this status until another import request includes Master Variant data for the Product.</p>

    */
    ProcessingState WAIT_FOR_MASTER_VARIANT = ProcessingStateEnum.WAIT_FOR_MASTER_VARIANT;
    /**
    	<p>The resource was successfully imported.</p>

    */
    ProcessingState IMPORTED = ProcessingStateEnum.IMPORTED;
    /**
    	<p>The resource could not be imported. References were resolved, but the system could not import the data due to an internal server error and the retry limit was reached.</p>

    */
    ProcessingState REJECTED = ProcessingStateEnum.REJECTED;
    /**
    	<p>The import request was canceled and the resource was not imported.</p>

    */
    ProcessingState CANCELED = ProcessingStateEnum.CANCELED;

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
        REJECTED("rejected"),

        /**
         * canceled
         */
        CANCELED("canceled");
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
     * @param jsonName the json value to be wrapped
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
