
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Indicates how a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> freeze behaves. For detailed behavior on each of these strategies, see <span>Freeze a Cart</span>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface FreezeStrategy extends JsonEnum {

    /**
    <p>More lenient Cart freeze strategy that locks prices as they were when the Cart was frozen. This is the default strategy when not explicitly specified, ensuring backwards compatibility.</p> */
    FreezeStrategy SOFT_FREEZE = FreezeStrategyEnum.SOFT_FREEZE;
    /**
    <p>Stricter Cart freeze strategy that, in addition to the <code>SoftFreeze</code> behavior, also freezes Cart Discounts, Discount Codes, and Shipping Methods, ensuring the final price remains unchanged.</p> */
    FreezeStrategy HARD_FREEZE = FreezeStrategyEnum.HARD_FREEZE;

    /**
     * possible values of FreezeStrategy
     */
    enum FreezeStrategyEnum implements FreezeStrategy {
        /**
         * SoftFreeze
         */
        SOFT_FREEZE("SoftFreeze"),

        /**
         * HardFreeze
         */
        HARD_FREEZE("HardFreeze");
        private final String jsonName;

        private FreezeStrategyEnum(final String jsonName) {
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
     * factory method for a enum value of FreezeStrategy
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static FreezeStrategy findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new FreezeStrategy() {
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
    public static Optional<FreezeStrategy> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static FreezeStrategy[] values() {
        return FreezeStrategyEnum.values();
    }

}
