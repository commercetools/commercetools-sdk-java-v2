
package com.commercetools.importapi.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Represents the status of a resource under an import process. Every resource has the initial state <code>processing</code>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ProcessingState {

    /**
    	<p>This is an initial state of import resource and is currently in progress.</p>

    */
    ProcessingState PROCESSING = ProcessingStateEnum.PROCESSING;
    /**
    	<p>The validation of the import resource failed.</p>

    */
    ProcessingState VALIDATION_FAILED = ProcessingStateEnum.VALIDATION_FAILED;
    /**
    	<p>Import operation contains key references to other resources that are not present in platform yet.</p>

    */
    ProcessingState UNRESOLVED = ProcessingStateEnum.UNRESOLVED;
    /**
    	<p>Wait for a master variant to arrive. The product import has required attributes and thus requires a master variant that provides those.</p>

    */
    ProcessingState WAIT_FOR_MASTER_VARIANT = ProcessingStateEnum.WAIT_FOR_MASTER_VARIANT;
    /**
    	<p>The resource was successfully imported.</p>

    */
    ProcessingState IMPORTED = ProcessingStateEnum.IMPORTED;
    /**
    	<p>The resource could not be imported.</p>

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
