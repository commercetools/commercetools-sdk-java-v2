
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This mode indicates how the price is set for the Line Item.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface LineItemPriceMode extends JsonEnum {

    LineItemPriceMode PLATFORM = LineItemPriceModeEnum.PLATFORM;

    LineItemPriceMode EXTERNAL_PRICE = LineItemPriceModeEnum.EXTERNAL_PRICE;

    LineItemPriceMode EXTERNAL_TOTAL = LineItemPriceModeEnum.EXTERNAL_TOTAL;

    /**
     * possible values of LineItemPriceMode
     */
    enum LineItemPriceModeEnum implements LineItemPriceMode {
        /**
         * Platform
         */
        PLATFORM("Platform"),

        /**
         * ExternalPrice
         */
        EXTERNAL_PRICE("ExternalPrice"),

        /**
         * ExternalTotal
         */
        EXTERNAL_TOTAL("ExternalTotal");
        private final String jsonName;

        private LineItemPriceModeEnum(final String jsonName) {
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
     * factory method for a enum value of LineItemPriceMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static LineItemPriceMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new LineItemPriceMode() {
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
    public static Optional<LineItemPriceMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static LineItemPriceMode[] values() {
        return LineItemPriceModeEnum.values();
    }

}
