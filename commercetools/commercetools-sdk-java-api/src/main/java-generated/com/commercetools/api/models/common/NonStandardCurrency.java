
package com.commercetools.api.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Currencies whose fraction digits are not compliant with <span>ISO 4217</span>.</p>
 *  <p>These currencies are treated separately (from their ISO equivalents); for example, a Product Discount for <code>HUF0</code> will not apply to a <code>HUF</code> price.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface NonStandardCurrency extends JsonEnum {

    /**
    <p>Czech Koruna with <code>0</code> fraction digits</p> */
    NonStandardCurrency CZK0 = NonStandardCurrencyEnum.CZK0;
    /**
    <p>Hungarian Forint with <code>0</code> fraction digits</p> */
    NonStandardCurrency HUF0 = NonStandardCurrencyEnum.HUF0;
    /**
    <p>Israeli New Shekel with <code>0</code> fraction digits</p> */
    NonStandardCurrency ILS0 = NonStandardCurrencyEnum.ILS0;
    /**
    <p>Kazakhstani Tenge with <code>0</code> fraction digits</p> */
    NonStandardCurrency KZT0 = NonStandardCurrencyEnum.KZT0;
    /**
    <p>Turkish Lira with <code>0</code> fraction digits</p> */
    NonStandardCurrency TRY0 = NonStandardCurrencyEnum.TRY0;
    /**
    <p>Taiwan Dollar with <code>0</code> fraction digits</p> */
    NonStandardCurrency TWD0 = NonStandardCurrencyEnum.TWD0;

    /**
     * possible values of NonStandardCurrency
     */
    enum NonStandardCurrencyEnum implements NonStandardCurrency {
        /**
         * CZK0
         */
        CZK0("CZK0"),

        /**
         * HUF0
         */
        HUF0("HUF0"),

        /**
         * ILS0
         */
        ILS0("ILS0"),

        /**
         * KZT0
         */
        KZT0("KZT0"),

        /**
         * TRY0
         */
        TRY0("TRY0"),

        /**
         * TWD0
         */
        TWD0("TWD0");
        private final String jsonName;

        private NonStandardCurrencyEnum(final String jsonName) {
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
     * factory method for a enum value of NonStandardCurrency
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static NonStandardCurrency findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new NonStandardCurrency() {
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
    public static Optional<NonStandardCurrency> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static NonStandardCurrency[] values() {
        return NonStandardCurrencyEnum.values();
    }

}
