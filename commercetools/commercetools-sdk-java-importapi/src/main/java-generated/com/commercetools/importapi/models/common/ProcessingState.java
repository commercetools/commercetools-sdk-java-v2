
package com.commercetools.importapi.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Every Import Operation is assigned with one of the following states.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProcessingState {

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

    enum ProcessingStateEnum implements ProcessingState {
        PROCESSING("processing"),

        VALIDATION_FAILED("validationFailed"),

        UNRESOLVED("unresolved"),

        WAIT_FOR_MASTER_VARIANT("waitForMasterVariant"),

        IMPORTED("imported"),

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

    @JsonValue
    String getJsonName();

    String name();

    String toString();

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

    public static Optional<ProcessingState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ProcessingState[] values() {
        return ProcessingStateEnum.values();
    }

}
