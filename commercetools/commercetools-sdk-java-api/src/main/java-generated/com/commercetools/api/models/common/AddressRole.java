
package com.commercetools.api.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Indicates the role of an address.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AddressRole extends JsonEnum {

    /**
    <p>The address is used as a shipping address.</p> */
    AddressRole SHIPPING = AddressRoleEnum.SHIPPING;
    /**
    <p>The address is used as a billing address.</p> */
    AddressRole BILLING = AddressRoleEnum.BILLING;

    /**
     * possible values of AddressRole
     */
    enum AddressRoleEnum implements AddressRole {
        /**
         * Shipping
         */
        SHIPPING("Shipping"),

        /**
         * Billing
         */
        BILLING("Billing");
        private final String jsonName;

        private AddressRoleEnum(final String jsonName) {
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
     * factory method for a enum value of AddressRole
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static AddressRole findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new AddressRole() {
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
    public static Optional<AddressRole> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static AddressRole[] values() {
        return AddressRoleEnum.values();
    }

}
