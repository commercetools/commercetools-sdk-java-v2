
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface DiscountCodeState {

    DiscountCodeState NOT_ACTIVE = DiscountCodeStateEnum.NOT_ACTIVE;

    DiscountCodeState DOES_NOT_MATCH_CART = DiscountCodeStateEnum.DOES_NOT_MATCH_CART;

    DiscountCodeState MATCHES_CART = DiscountCodeStateEnum.MATCHES_CART;

    DiscountCodeState MAX_APPLICATION_REACHED = DiscountCodeStateEnum.MAX_APPLICATION_REACHED;

    DiscountCodeState APPLICATION_STOPPED_BY_PREVIOUS_DISCOUNT = DiscountCodeStateEnum.APPLICATION_STOPPED_BY_PREVIOUS_DISCOUNT;

    DiscountCodeState NOT_VALID = DiscountCodeStateEnum.NOT_VALID;

    enum DiscountCodeStateEnum implements DiscountCodeState {
        NOT_ACTIVE("NotActive"),

        DOES_NOT_MATCH_CART("DoesNotMatchCart"),

        MATCHES_CART("MatchesCart"),

        MAX_APPLICATION_REACHED("MaxApplicationReached"),

        APPLICATION_STOPPED_BY_PREVIOUS_DISCOUNT("ApplicationStoppedByPreviousDiscount"),

        NOT_VALID("NotValid");
        private final String jsonName;

        private DiscountCodeStateEnum(final String jsonName) {
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
    public static DiscountCodeState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new DiscountCodeState() {
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

    public static Optional<DiscountCodeState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static DiscountCodeState[] values() {
        return DiscountCodeStateEnum.values();
    }
}
