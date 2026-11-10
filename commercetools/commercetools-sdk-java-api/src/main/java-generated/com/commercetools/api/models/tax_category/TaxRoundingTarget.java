
package com.commercetools.api.models.tax_category;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>For a <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> that is included in the price, this value determines which of the two derived amounts the <a href="https://docs.commercetools.com/apis/ctp:api:type:RoundingMode" rel="nofollow">RoundingMode</a> set by <code>taxRoundingMode</code> is applied to. The other amount is the exact difference from the gross price, so <code>totalNet</code> plus <code>totalTax</code> on <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxedPrice" rel="nofollow">TaxedPrice</a> always equals <code>totalGross</code>.</p>
 *  <p>This field has no effect if <code>includedInPrice</code> is <code>false</code>. In that case, the net price is supplied exactly, so rounding the gross price and rounding the tax amount give the same result.</p>
 *  <p>For more information, see <span>Tax rounding target</span>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TaxRoundingTarget extends JsonEnum {

    /**
    <p><code>taxRoundingMode</code> is applied to the net price and the tax amount is the exact remainder.</p>
    <p>For example, with a rate of 20% included in a gross price of 1.23 and <code>taxRoundingMode: HalfEven</code>, the net price rounds to 1.02 and the tax amount is 0.21.</p>
    <p>This is the default value for a new Tax Rate.</p> */
    TaxRoundingTarget NET = TaxRoundingTargetEnum.NET;
    /**
    <p><code>taxRoundingMode</code> is applied to the tax amount and the net price is the exact remainder.</p>
    <p>For example, with a rate of 20% included in a gross price of 1.23 and <code>taxRoundingMode: HalfEven</code>, the tax amount rounds to 0.20 and the net price is 1.03.</p> */
    TaxRoundingTarget TAX = TaxRoundingTargetEnum.TAX;

    /**
     * possible values of TaxRoundingTarget
     */
    enum TaxRoundingTargetEnum implements TaxRoundingTarget {
        /**
         * Net
         */
        NET("Net"),

        /**
         * Tax
         */
        TAX("Tax");
        private final String jsonName;

        private TaxRoundingTargetEnum(final String jsonName) {
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
     * factory method for a enum value of TaxRoundingTarget
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static TaxRoundingTarget findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new TaxRoundingTarget() {
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
    public static Optional<TaxRoundingTarget> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static TaxRoundingTarget[] values() {
        return TaxRoundingTargetEnum.values();
    }

}
