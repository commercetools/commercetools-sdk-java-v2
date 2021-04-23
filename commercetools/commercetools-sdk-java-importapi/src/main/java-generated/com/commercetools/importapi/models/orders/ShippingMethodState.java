
package com.commercetools.importapi.models.orders;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ShippingMethodState {

    ShippingMethodState DOES_NOT_MATCH_CART = ShippingMethodStateEnum.DOES_NOT_MATCH_CART;

    ShippingMethodState MATCHES_CART = ShippingMethodStateEnum.MATCHES_CART;

    enum ShippingMethodStateEnum implements ShippingMethodState {
        DOES_NOT_MATCH_CART("DoesNotMatchCart"),

        MATCHES_CART("MatchesCart");
        private final String jsonName;

        private ShippingMethodStateEnum(final String jsonName) {
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
    public static ShippingMethodState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ShippingMethodState() {
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

    public static Optional<ShippingMethodState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ShippingMethodState[] values() {
        return ShippingMethodStateEnum.values();
    }
}
