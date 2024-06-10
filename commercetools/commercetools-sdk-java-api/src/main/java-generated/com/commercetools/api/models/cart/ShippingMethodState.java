
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Determines whether the selected ShippingMethod is allowed for the Cart. For more information, see Predicates.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ShippingMethodState extends JsonEnum {

    /**
    <p>The ShippingMethod <code>predicate</code> does not match the Cart.</p>
    <p>Ordering this Cart returns an ShippingMethodDoesNotMatchCart error.</p> */
    ShippingMethodState DOES_NOT_MATCH_CART = ShippingMethodStateEnum.DOES_NOT_MATCH_CART;
    /**
    <p>Either the ShippingMethod <code>predicate</code> matches the Cart or there is no <code>predicate</code> defined.</p> */
    ShippingMethodState MATCHES_CART = ShippingMethodStateEnum.MATCHES_CART;

    /**
     * possible values of ShippingMethodState
     */
    enum ShippingMethodStateEnum implements ShippingMethodState {
        /**
         * DoesNotMatchCart
         */
        DOES_NOT_MATCH_CART("DoesNotMatchCart"),

        /**
         * MatchesCart
         */
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
     * factory method for a enum value of ShippingMethodState
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<ShippingMethodState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ShippingMethodState[] values() {
        return ShippingMethodStateEnum.values();
    }

}
