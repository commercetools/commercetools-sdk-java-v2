
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Indicates the state of a Discount Code in a Cart.</p>
 *  <p>If an Order is created from a Cart with a state other than <code>MatchesCart</code> or <code>ApplicationStoppedByGroupBestDeal</code>, a DiscountCodeNonApplicable error is returned.</p>
 *  <p>For Orders created from a Cart with a <code>ApplicationStoppedByGroupBestDeal</code> state, the discount code is not applied.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface DiscountCodeState extends JsonEnum {

    /**
    <p>The Discount Code is not active or does not contain any active Cart Discounts.</p> */
    DiscountCodeState NOT_ACTIVE = DiscountCodeStateEnum.NOT_ACTIVE;
    /**
    <p>The Discount Code is not valid or does not contain any valid Cart Discounts. Validity is determined by the CartDiscount <code>validFrom</code> and <code>validUntil</code> dates.</p> */
    DiscountCodeState NOT_VALID = DiscountCodeStateEnum.NOT_VALID;
    /**
    <p>The Discount Code is active and contains at least one active and valid Cart Discount. The DiscountCode <code>cartPredicate</code> does not match the Cart or the contained active discount's cart predicates do no match the Cart.</p> */
    DiscountCodeState DOES_NOT_MATCH_CART = DiscountCodeStateEnum.DOES_NOT_MATCH_CART;
    /**
    <p>The Discount Code is active and contains at least one active and valid Cart Discount. The DiscountCode <code>cartPredicate</code> matches the Cart and at least one of the contained active discount's cart predicates matches the Cart.</p> */
    DiscountCodeState MATCHES_CART = DiscountCodeStateEnum.MATCHES_CART;
    /**
    <p>The <code>maxApplications</code> or <code>maxApplicationsPerCustomer</code> for a DiscountCode has been reached.</p> */
    DiscountCodeState MAX_APPLICATION_REACHED = DiscountCodeStateEnum.MAX_APPLICATION_REACHED;
    /**
    <p>The Discount Code is active, but further Cart Discounts are not applied as a Cart Discount with <code>StopAfterThisDiscount</code> StackingMode is applied.</p> */
    DiscountCodeState APPLICATION_STOPPED_BY_PREVIOUS_DISCOUNT = DiscountCodeStateEnum.APPLICATION_STOPPED_BY_PREVIOUS_DISCOUNT;
    /**
    <p>The Discount Code is active, but Cart Discounts from a Discount Group are not applied as another Cart Discount from that Discount Group, offering a better deal, is applied.</p> */
    DiscountCodeState APPLICATION_STOPPED_BY_GROUP_BEST_DEAL = DiscountCodeStateEnum.APPLICATION_STOPPED_BY_GROUP_BEST_DEAL;

    /**
     * possible values of DiscountCodeState
     */
    enum DiscountCodeStateEnum implements DiscountCodeState {
        /**
         * NotActive
         */
        NOT_ACTIVE("NotActive"),

        /**
         * NotValid
         */
        NOT_VALID("NotValid"),

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
        APPLICATION_STOPPED_BY_GROUP_BEST_DEAL("ApplicationStoppedByGroupBestDeal");
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
