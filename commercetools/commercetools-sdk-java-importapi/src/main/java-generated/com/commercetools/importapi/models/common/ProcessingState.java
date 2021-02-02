
package com.commercetools.importapi.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>This enumeration describes the processing state of an import operation.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ProcessingState {

    /**
    	<p>The validation of the import resource failed.</p>

    */
    ProcessingState VALIDATION_FAILED = ProcessingStateEnum.VALIDATION_FAILED;
    /**
    	<p>This is an initial state of the import resource, it might contain unresolved references and needs to be resolved further.</p>

    */
    ProcessingState UNRESOLVED = ProcessingStateEnum.UNRESOLVED;
    /**
    	<p>Wait for a master variant to arrive. The product import has required attributes and thus requires a master variant that provides those.</p>

    */
    ProcessingState WAIT_FOR_MASTER_VARIANT = ProcessingStateEnum.WAIT_FOR_MASTER_VARIANT;
    /**
    	<p>The import resource was imported successfully.</p>

    */
    ProcessingState IMPORTED = ProcessingStateEnum.IMPORTED;
    /**
    	<p>The import resource is being deleted.</p>

    */
    ProcessingState DELETE = ProcessingStateEnum.DELETE;
    /**
    	<p>The import resource was deleted successfully.</p>

    */
    ProcessingState DELETED = ProcessingStateEnum.DELETED;
    /**
    	<p>The import resource couldn't be imported or deleted after several retries.</p>

    */
    ProcessingState REJECTED = ProcessingStateEnum.REJECTED;

    enum ProcessingStateEnum implements ProcessingState {
        VALIDATION_FAILED("ValidationFailed"),

        UNRESOLVED("Unresolved"),

        WAIT_FOR_MASTER_VARIANT("WaitForMasterVariant"),

        IMPORTED("Imported"),

        DELETE("Delete"),

        DELETED("Deleted"),

        REJECTED("Rejected");
        private final String jsonName;

        private ProcessingStateEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

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
        });
    }

    public static Optional<ProcessingState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ProcessingState[] values() {
        return ProcessingStateEnum.values();
    }
}
