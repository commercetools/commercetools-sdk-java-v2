
package com.commercetools.api.models.business_unit;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Defines whether the Stores of the Business Unit are set directly on the Business Unit or are inherited from its parent unit.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface BusinessUnitStoreMode {

    /**
    	<p>Stores are defined on the Business Unit.</p>

    */
    BusinessUnitStoreMode EXPLICIT = BusinessUnitStoreModeEnum.EXPLICIT;
    /**
    	<p>Stores are inherited from the first parent in the hierarchy that has Stores defined. Up to four Business Units can be set as children-of-children within a hierarchy.</p>

    */
    BusinessUnitStoreMode FROM_PARENT = BusinessUnitStoreModeEnum.FROM_PARENT;

    enum BusinessUnitStoreModeEnum implements BusinessUnitStoreMode {
        EXPLICIT("Explicit"),

        FROM_PARENT("FromParent");
        private final String jsonName;

        private BusinessUnitStoreModeEnum(final String jsonName) {
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
    public static BusinessUnitStoreMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new BusinessUnitStoreMode() {
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

    public static Optional<BusinessUnitStoreMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static BusinessUnitStoreMode[] values() {
        return BusinessUnitStoreModeEnum.values();
    }

}
