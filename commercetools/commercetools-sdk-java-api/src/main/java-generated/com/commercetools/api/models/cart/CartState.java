
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
    <p>The default state where a Cart can be updated and ordered.</p> */
    CartState ACTIVE = CartStateEnum.ACTIVE;
    /**
    <p>An anonymous Cart was merged into a Customer's Cart on sign-in, and no further operations are allowed on the Cart.</p> */
    CartState MERGED = CartStateEnum.MERGED;
    /**
    <p>A Cart was ordered, and no further operations are allowed on the Cart.</p> */
    CartState ORDERED = CartStateEnum.ORDERED;
    /**
    <p>A Cart is frozen. Update actions that can change the price of (Custom) Line Items are not allowed.</p>
    <ul>
     <li>Add LineItem</li>
     <li>Change LineItem Quantity</li>
     <li>Remove LineItem</li>
     <li>Set LineItem DistributionChannel</li>
     <li>Set LineItem SupplyChannel</li>
     <li>Add CustomLineItem</li>
     <li>Change CustomLineItem Quantity</li>
     <li>Remove CustomLineItem</li>
     <li>Change TaxMode</li>
     <li>Set LineItem Price</li>
     <li>Set LineItem TotalPrice</li>
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
