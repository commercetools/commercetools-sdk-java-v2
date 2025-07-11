
package com.commercetools.importapi.models.orders;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The rounding mode representation used in <code>Order.priceRoundingMode</code> and <code>Order.taxRoundingMode</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface RoundingMode extends JsonEnum {

    RoundingMode HALF_EVEN = RoundingModeEnum.HALF_EVEN;

    RoundingMode HALF_UP = RoundingModeEnum.HALF_UP;

    RoundingMode HALF_DOWN = RoundingModeEnum.HALF_DOWN;

    /**
     * possible values of RoundingMode
     */
    enum RoundingModeEnum implements RoundingMode {
        /**
         * HalfEven
         */
        HALF_EVEN("HalfEven"),

        /**
         * HalfUp
         */
        HALF_UP("HalfUp"),

        /**
         * HalfDown
         */
        HALF_DOWN("HalfDown");
        private final String jsonName;

        private RoundingModeEnum(final String jsonName) {
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
     * factory method for a enum value of RoundingMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static RoundingMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new RoundingMode() {
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
    public static Optional<RoundingMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static RoundingMode[] values() {
        return RoundingModeEnum.values();
    }

}
