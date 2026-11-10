
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Determines how to manually merge an anonymous Cart with an existing Customer Cart. For more information about merge mode behaviors, merge rules, and tax recalculation, see <span>Merge a Cart</span>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CartMergeMode extends JsonEnum {

    /**
    <p>Merges the anonymous Cart with the existing Customer Cart.</p> */
    CartMergeMode MERGE_WITH_EXISTING_CUSTOMER_CART = CartMergeModeEnum.MERGE_WITH_EXISTING_CUSTOMER_CART;
    /**
    <p>Uses the anonymous Cart as the new active Customer Cart, replacing the existing one. No items from the previous active Cart are merged.</p> */
    CartMergeMode USE_AS_NEW_ACTIVE_CUSTOMER_CART = CartMergeModeEnum.USE_AS_NEW_ACTIVE_CUSTOMER_CART;

    /**
     * possible values of CartMergeMode
     */
    enum CartMergeModeEnum implements CartMergeMode {
        /**
         * MergeWithExistingCustomerCart
         */
        MERGE_WITH_EXISTING_CUSTOMER_CART("MergeWithExistingCustomerCart"),

        /**
         * UseAsNewActiveCustomerCart
         */
        USE_AS_NEW_ACTIVE_CUSTOMER_CART("UseAsNewActiveCustomerCart");
        private final String jsonName;

        private CartMergeModeEnum(final String jsonName) {
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
     * factory method for a enum value of CartMergeMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static CartMergeMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new CartMergeMode() {
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
    public static Optional<CartMergeMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static CartMergeMode[] values() {
        return CartMergeModeEnum.values();
    }

}
