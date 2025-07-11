
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeState
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface DiscountCodeState extends JsonEnum {

    DiscountCodeState NOT_ACTIVE = DiscountCodeStateEnum.NOT_ACTIVE;

    DiscountCodeState DOES_NOT_MATCH_CART = DiscountCodeStateEnum.DOES_NOT_MATCH_CART;

    DiscountCodeState MATCHES_CART = DiscountCodeStateEnum.MATCHES_CART;

    DiscountCodeState MAX_APPLICATION_REACHED = DiscountCodeStateEnum.MAX_APPLICATION_REACHED;

    DiscountCodeState APPLICATION_STOPPED_BY_PREVIOUS_DISCOUNT = DiscountCodeStateEnum.APPLICATION_STOPPED_BY_PREVIOUS_DISCOUNT;

    DiscountCodeState APPLICATION_STOPPED_BY_GROUP_BEST_DEAL = DiscountCodeStateEnum.APPLICATION_STOPPED_BY_GROUP_BEST_DEAL;

    DiscountCodeState NOT_VALID = DiscountCodeStateEnum.NOT_VALID;

    /**
     * possible values of DiscountCodeState
     */
    enum DiscountCodeStateEnum implements DiscountCodeState {
        /**
         * NotActive
         */
        NOT_ACTIVE("NotActive"),

        /**
         * DoesNotMatchCart
         */
        DOES_NOT_MATCH_CART("DoesNotMatchCart"),

        /**
         * MatchesCart
         */
        MATCHES_CART("MatchesCart"),

        /**
         * MaxApplicationReached
         */
        MAX_APPLICATION_REACHED("MaxApplicationReached"),

        /**
         * ApplicationStoppedByPreviousDiscount
         */
        APPLICATION_STOPPED_BY_PREVIOUS_DISCOUNT("ApplicationStoppedByPreviousDiscount"),

        /**
         * ApplicationStoppedByGroupBestDeal
         */
        APPLICATION_STOPPED_BY_GROUP_BEST_DEAL("ApplicationStoppedByGroupBestDeal"),

        /**
         * NotValid
         */
        NOT_VALID("NotValid");
        private final String jsonName;

        private DiscountCodeStateEnum(final String jsonName) {
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
     * factory method for a enum value of DiscountCodeState
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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
    public static Optional<DiscountCodeState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static DiscountCodeState[] values() {
        return DiscountCodeStateEnum.values();
    }

}
