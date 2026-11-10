
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Indicates how the price of a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">Line Item</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a> is selected during Order creation.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface PriceSelectionMode extends JsonEnum {

    PriceSelectionMode FIXED = PriceSelectionModeEnum.FIXED;

    PriceSelectionMode DYNAMIC = PriceSelectionModeEnum.DYNAMIC;

    /**
     * possible values of PriceSelectionMode
     */
    enum PriceSelectionModeEnum implements PriceSelectionMode {
        /**
         * Fixed
         */
        FIXED("Fixed"),

        /**
         * Dynamic
         */
        DYNAMIC("Dynamic");
        private final String jsonName;

        private PriceSelectionModeEnum(final String jsonName) {
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
     * factory method for a enum value of PriceSelectionMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static PriceSelectionMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new PriceSelectionMode() {
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
    public static Optional<PriceSelectionMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static PriceSelectionMode[] values() {
        return PriceSelectionModeEnum.values();
    }

}
