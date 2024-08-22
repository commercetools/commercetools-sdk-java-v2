
package com.commercetools.api.models.cart_discount;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This mode determines how absolute Discounts are applied on Line Items or Custom Line Items.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface DiscountApplicationMode extends JsonEnum {

    /**
    <p>Distributes the Discount proportionately across eligible Line Items or Custom Line Items.</p> */
    DiscountApplicationMode PROPORTIONATE_DISTRIBUTION = DiscountApplicationModeEnum.PROPORTIONATE_DISTRIBUTION;
    /**
    <p>Distributes the Discount evenly across eligible Line Items or Custom Line Items.</p> */
    DiscountApplicationMode EVEN_DISTRIBUTION = DiscountApplicationModeEnum.EVEN_DISTRIBUTION;
    /**
    <p>Applies the Discount individually to eligible Line Item or Custom Line Item.</p> */
    DiscountApplicationMode INDIVIDUAL_APPLICATION = DiscountApplicationModeEnum.INDIVIDUAL_APPLICATION;

    /**
     * possible values of DiscountApplicationMode
     */
    enum DiscountApplicationModeEnum implements DiscountApplicationMode {
        /**
         * ProportionateDistribution
         */
        PROPORTIONATE_DISTRIBUTION("ProportionateDistribution"),

        /**
         * EvenDistribution
         */
        EVEN_DISTRIBUTION("EvenDistribution"),

        /**
         * IndividualApplication
         */
        INDIVIDUAL_APPLICATION("IndividualApplication");
        private final String jsonName;

        private DiscountApplicationModeEnum(final String jsonName) {
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
     * factory method for a enum value of DiscountApplicationMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static DiscountApplicationMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new DiscountApplicationMode() {
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
    public static Optional<DiscountApplicationMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static DiscountApplicationMode[] values() {
        return DiscountApplicationModeEnum.values();
    }

}
