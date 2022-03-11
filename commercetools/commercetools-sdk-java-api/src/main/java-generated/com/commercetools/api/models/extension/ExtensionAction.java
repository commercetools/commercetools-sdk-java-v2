
package com.commercetools.api.models.extension;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>An Extension gets called during any of the following requests of an API call, but before the result is persisted.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ExtensionAction {

    /**
    	<p>An Extension gets called during a Create request.</p>

    */
    ExtensionAction CREATE = ExtensionActionEnum.CREATE;
    /**
    	<p>An Extension gets called during an Update request.</p>

    */
    ExtensionAction UPDATE = ExtensionActionEnum.UPDATE;

    enum ExtensionActionEnum implements ExtensionAction {
        CREATE("Create"),

        UPDATE("Update");
        private final String jsonName;

        private ExtensionActionEnum(final String jsonName) {
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
    public static ExtensionAction findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ExtensionAction() {
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

    public static Optional<ExtensionAction> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ExtensionAction[] values() {
        return ExtensionActionEnum.values();
    }
}
