
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Indicates who created the Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CartOrigin {

    /**
    	<p>Cart was created by a Customer.</p>
    	<p>This is the default value.</p>

    */
    CartOrigin CUSTOMER = CartOriginEnum.CUSTOMER;
    /**
    	<p>Cart was created by a merchant on behalf of a Customer.</p>

    */
    CartOrigin MERCHANT = CartOriginEnum.MERCHANT;
    /**
    	<p>Cart was created as part of a Quote (BETA).</p>

    */
    CartOrigin QUOTE = CartOriginEnum.QUOTE;

    enum CartOriginEnum implements CartOrigin {
        CUSTOMER("Customer"),

        MERCHANT("Merchant"),

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

    @JsonValue
    String getJsonName();

    String name();

    String toString();

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

    public static Optional<CartOrigin> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static CartOrigin[] values() {
        return CartOriginEnum.values();
    }
}
