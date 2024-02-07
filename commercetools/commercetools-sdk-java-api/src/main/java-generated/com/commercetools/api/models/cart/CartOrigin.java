
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Indicates who created the Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CartOrigin extends JsonEnum {

    /**
    <p>Cart was created by a Customer.</p>
    <p>This is the default value.</p> */
    CartOrigin CUSTOMER = CartOriginEnum.CUSTOMER;
    /**
    <p>Cart was created by a merchant on behalf of a Customer.</p> */
    CartOrigin MERCHANT = CartOriginEnum.MERCHANT;
    /**
    <p>Cart was created as part of a Quote.</p> */
    CartOrigin QUOTE = CartOriginEnum.QUOTE;

    /**
     * possible values of CartOrigin
     */
    enum CartOriginEnum implements CartOrigin {
        /**
         * Customer
         */
        CUSTOMER("Customer"),

        /**
         * Merchant
         */
        MERCHANT("Merchant"),

        /**
         * Quote
         */
        QUOTE("Quote");
        private final String jsonName;

        private CartOriginEnum(final String jsonName) {
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
     * factory method for a enum value of CartOrigin
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static CartOrigin findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new CartOrigin() {
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
    public static Optional<CartOrigin> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static CartOrigin[] values() {
        return CartOriginEnum.values();
    }

}
