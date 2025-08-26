
package com.commercetools.checkout.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Type of resource the value should reference. Supported resource type identifiers are:</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ReferenceTypeId extends JsonEnum {

    /**
    <p>References a <span>Cart</span>.</p> */
    ReferenceTypeId CART = ReferenceTypeIdEnum.CART;
    /**
    <p>References an <span>Order</span>.</p> */
    ReferenceTypeId ORDER = ReferenceTypeIdEnum.ORDER;
    /**
    <p>References a <span>Payment</span>.</p> */
    ReferenceTypeId PAYMENT = ReferenceTypeIdEnum.PAYMENT;
    /**
    <p>References an <span>Application</span>.</p> */
    ReferenceTypeId APPLICATION = ReferenceTypeIdEnum.APPLICATION;
    /**
    <p>References a <span>Payment Integration</span>.</p> */
    ReferenceTypeId PAYMENT_INTEGRATION = ReferenceTypeIdEnum.PAYMENT_INTEGRATION;

    /**
     * possible values of ReferenceTypeId
     */
    enum ReferenceTypeIdEnum implements ReferenceTypeId {
        /**
         * cart
         */
        CART("cart"),

        /**
         * order
         */
        ORDER("order"),

        /**
         * payment
         */
        PAYMENT("payment"),

        /**
         * application
         */
        APPLICATION("application"),

        /**
         * payment-integration
         */
        PAYMENT_INTEGRATION("payment-integration");
        private final String jsonName;

        private ReferenceTypeIdEnum(final String jsonName) {
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
     * factory method for a enum value of ReferenceTypeId
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ReferenceTypeId findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ReferenceTypeId() {
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
    public static Optional<ReferenceTypeId> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ReferenceTypeId[] values() {
        return ReferenceTypeIdEnum.values();
    }

}
