
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface CartState {

    CartState ACTIVE = CartStateEnum.ACTIVE;

    CartState MERGED = CartStateEnum.MERGED;

    CartState ORDERED = CartStateEnum.ORDERED;

    enum CartStateEnum implements CartState {
        ACTIVE("Active"),

        MERGED("Merged"),

        ORDERED("Ordered");
        private final String jsonName;

        private CartStateEnum(final String jsonName) {
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
    public static CartState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new CartState() {
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

    public static Optional<CartState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static CartState[] values() {
        return CartStateEnum.values();
    }
}
