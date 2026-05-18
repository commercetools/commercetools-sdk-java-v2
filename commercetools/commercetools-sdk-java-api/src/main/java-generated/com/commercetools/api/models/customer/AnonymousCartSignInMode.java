
package com.commercetools.api.models.customer;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Determines how an anonymous Cart is handled when a Customer signs in. For more information, see <span>Cart merge during sign-in and sign-up</span>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AnonymousCartSignInMode extends JsonEnum {

    /**
    <p>The content of an anonymous <span>Cart is merged during sign-in</span> with the Customer's most recently modified active Cart.</p> */
    AnonymousCartSignInMode MERGE_WITH_EXISTING_CUSTOMER_CART = AnonymousCartSignInModeEnum.MERGE_WITH_EXISTING_CUSTOMER_CART;
    /**
    <p>Uses the anonymous Cart as the new active Customer Cart, replacing the existing one. No items from the previous active Cart are merged.</p> */
    AnonymousCartSignInMode USE_AS_NEW_ACTIVE_CUSTOMER_CART = AnonymousCartSignInModeEnum.USE_AS_NEW_ACTIVE_CUSTOMER_CART;

    /**
     * possible values of AnonymousCartSignInMode
     */
    enum AnonymousCartSignInModeEnum implements AnonymousCartSignInMode {
        /**
         * MergeWithExistingCustomerCart
         */
        MERGE_WITH_EXISTING_CUSTOMER_CART("MergeWithExistingCustomerCart"),

        /**
         * UseAsNewActiveCustomerCart
         */
        USE_AS_NEW_ACTIVE_CUSTOMER_CART("UseAsNewActiveCustomerCart");
        private final String jsonName;

        private AnonymousCartSignInModeEnum(final String jsonName) {
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
     * factory method for a enum value of AnonymousCartSignInMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static AnonymousCartSignInMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new AnonymousCartSignInMode() {
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
    public static Optional<AnonymousCartSignInMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static AnonymousCartSignInMode[] values() {
        return AnonymousCartSignInModeEnum.values();
    }

}
