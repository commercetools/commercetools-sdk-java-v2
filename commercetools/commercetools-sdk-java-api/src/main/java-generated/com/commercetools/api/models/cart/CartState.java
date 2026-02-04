
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Indicates the current status of a Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CartState extends JsonEnum {

    /**
    <p>The default state where a Cart can be updated and ordered. A <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> can have more than one active Cart.</p> */
    CartState ACTIVE = CartStateEnum.ACTIVE;
    /**
    <p>An anonymous Cart was merged into a Customer's Cart on <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/login:POST" rel="nofollow">sign-in</a>, and no further operations are allowed on the Cart.</p> */
    CartState MERGED = CartStateEnum.MERGED;
    /**
    <p>A Cart was <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders:POST" rel="nofollow">ordered</a>, and no further operations are allowed on the Cart.</p> */
    CartState ORDERED = CartStateEnum.ORDERED;
    /**
    <p>A Cart is <a href="https://docs.commercetools.com/apis/ctp:api:type:FrozenCarts" rel="nofollow">frozen</a>. Update actions that can change the price of (Custom) Line Items are not allowed.</p>
    <ul>
     <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddLineItemAction" rel="nofollow">Add LineItem</a></li>
     <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartChangeLineItemQuantityAction" rel="nofollow">Change LineItem Quantity</a></li>
     <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveLineItemAction" rel="nofollow">Remove LineItem</a></li>
     <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetLineItemDistributionChannelAction" rel="nofollow">Set LineItem DistributionChannel</a></li>
     <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetLineItemSupplyChannelAction" rel="nofollow">Set LineItem SupplyChannel</a></li>
     <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddCustomLineItemAction" rel="nofollow">Add CustomLineItem</a></li>
     <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartChangeCustomLineItemQuantityAction" rel="nofollow">Change CustomLineItem Quantity</a></li>
     <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveCustomLineItemAction" rel="nofollow">Remove CustomLineItem</a></li>
     <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartChangeTaxModeAction" rel="nofollow">Change TaxMode</a></li>
     <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetLineItemPriceAction" rel="nofollow">Set LineItem Price</a></li>
     <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetLineItemTotalPriceAction" rel="nofollow">Set LineItem TotalPrice</a></li>
    </ul>
    <p>Additionally, when using the <code>HardFreeze</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:FreezeStrategy" rel="nofollow">FreezeStrategy</a>, the following update actions are also not allowed:</p>
    <ul>
     <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingMethodAction" rel="nofollow">Set ShippingMethod</a></li>
     <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetCustomShippingMethodAction" rel="nofollow">Set CustomShippingMethod</a></li>
    </ul> */
    CartState FROZEN = CartStateEnum.FROZEN;

    /**
     * possible values of CartState
     */
    enum CartStateEnum implements CartState {
        /**
         * Active
         */
        ACTIVE("Active"),

        /**
         * Merged
         */
        MERGED("Merged"),

        /**
         * Ordered
         */
        ORDERED("Ordered"),

        /**
         * Frozen
         */
        FROZEN("Frozen");
        private final String jsonName;

        private CartStateEnum(final String jsonName) {
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
     * factory method for a enum value of CartState
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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
    public static Optional<CartState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static CartState[] values() {
        return CartStateEnum.values();
    }

}
