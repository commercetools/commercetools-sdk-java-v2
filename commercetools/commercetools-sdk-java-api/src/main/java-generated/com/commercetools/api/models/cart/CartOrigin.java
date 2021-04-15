
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface CartOrigin {

    CartOrigin CUSTOMER = CartOriginEnum.CUSTOMER;

    CartOrigin MERCHANT = CartOriginEnum.MERCHANT;

    enum CartOriginEnum implements CartOrigin {
        CUSTOMER("Customer"),

        MERCHANT("Merchant");
        private final String jsonName;

        private CartOriginEnum(final String jsonName) {
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
        });
    }

    public static Optional<CartOrigin> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static CartOrigin[] values() {
        return CartOriginEnum.values();
    }
}
