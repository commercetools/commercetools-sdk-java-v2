
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCalculationMode
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TaxCalculationMode extends JsonEnum {

    TaxCalculationMode LINE_ITEM_LEVEL = TaxCalculationModeEnum.LINE_ITEM_LEVEL;

    TaxCalculationMode UNIT_PRICE_LEVEL = TaxCalculationModeEnum.UNIT_PRICE_LEVEL;

    /**
     * possible values of TaxCalculationMode
     */
    enum TaxCalculationModeEnum implements TaxCalculationMode {
        /**
         * LineItemLevel
         */
        LINE_ITEM_LEVEL("LineItemLevel"),

        /**
         * UnitPriceLevel
         */
        UNIT_PRICE_LEVEL("UnitPriceLevel");
        private final String jsonName;

        private TaxCalculationModeEnum(final String jsonName) {
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
     * factory method for a enum value of TaxCalculationMode
     * if no enum has been found an anonymous instance will be created
     * @return enum instance
     */
    @JsonCreator
    public static TaxCalculationMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new TaxCalculationMode() {
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
     * @return optional of enum instance
     */
    public static Optional<TaxCalculationMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static TaxCalculationMode[] values() {
        return TaxCalculationModeEnum.values();
    }

}
