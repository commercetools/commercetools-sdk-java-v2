
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

    /**
     * possible values of BusinessUnitStoreMode
     */
    enum BusinessUnitStoreModeEnum implements BusinessUnitStoreMode {
        /**
         * Explicit
         */
        EXPLICIT("Explicit"),

        /**
         * FromParent
         */
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
     * factory method for a enum value of BusinessUnitStoreMode
     * if no enum has been found an anonymous instance will be created
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @return optional of enum instance
     */
    public static Optional<BusinessUnitStoreMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static BusinessUnitStoreMode[] values() {
        return BusinessUnitStoreModeEnum.values();
    }

}
