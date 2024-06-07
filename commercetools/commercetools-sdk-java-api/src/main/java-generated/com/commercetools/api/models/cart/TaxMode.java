
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Indicates how taxes are set on the Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TaxMode extends JsonEnum {

    /**
    <ul>
     <li><p>Tax Rates are selected automatically from the TaxCategories based on the Cart <code>shippingAddress</code>. This is the default tax mode for a new Cart.</p></li>
     <li><p>The <code>totalNet</code>, <code>totalGross</code>, and <code>taxPortions</code> fields are calculated based on the <code>taxRoundingMode</code>.</p></li>
    </ul> */
    TaxMode PLATFORM = TaxModeEnum.PLATFORM;
    /**
    <ul>
     <li><p>Tax Rates are set externally with ExternalTaxRateDraft. A Cart can be ordered only if all Line Items, Custom Line Items, and the Shipping Method have an external Tax Rate set.</p></li>
     <li><p>The <code>totalNet</code>, <code>totalGross</code>, and <code>taxPortions</code> fields are calculated based on the <code>taxRoundingMode</code>.</p></li>
    </ul> */
    TaxMode EXTERNAL = TaxModeEnum.EXTERNAL;
    /**
    <ul>
     <li><p>Tax amounts, Tax Rates, and tax portions are set externally with ExternalTaxAmountDraft. A Cart can be ordered only if the Cart and all Line Items, Custom Line Items, and the Shipping Method have an external tax amount and rate set.</p></li>
     <li><p>The Cart <code>taxedPrice</code> field must be set using Set Cart Total Tax. The Cart <code>taxedShippingPrice</code> field is always empty in this tax mode.</p></li>
     <li><p>Price-affecting update actions on Carts require external recalculation of the total gross price. In these cases, <code>taxedPrice</code> and <code>taxRate</code> are removed and must be set again. The order in which the individual update actions are issued is important:</p>
      <ol>
       <li><p>Issue the price-affecting update action(s).</p></li>
       <li><p>Update the tax amounts using Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount.</p>
        <ul>
         <li><p>If the update action changes the Line Item price, for Line Items with <code>Platform</code> LineItemPriceMode, you must issue Set LineItem TaxAmount in a <em>separate</em> request.</p></li>
         <li><p>If the update action removes the externally set tax amount for the Shipping Method, you must issue Set ShippingMethod TaxAmount in a <em>separate</em> request.</p></li>
        </ul></li>
       <li><p>Update the <code>taxedPrice</code> on Cart using Set Cart Total Tax.</p></li>
      </ol></li>
     <li><p>Tax-inclusive pricing should be avoided when using TaxMode <code>ExternalAmount</code> because <code>taxedItemPrice.totalNet</code> is automatically set by the platform to the Line Item's <code>totalPrice</code>.</p></li>
    </ul> */
    TaxMode EXTERNAL_AMOUNT = TaxModeEnum.EXTERNAL_AMOUNT;
    /**
    <ul>
     <li>No taxes are added to the Cart.</li>
     <li>This tax mode cannot be set on the My Carts API.</li>
    </ul> */
    TaxMode DISABLED = TaxModeEnum.DISABLED;

    /**
     * possible values of TaxMode
     */
    enum TaxModeEnum implements TaxMode {
        /**
         * Platform
         */
        PLATFORM("Platform"),

        /**
         * External
         */
        EXTERNAL("External"),

        /**
         * ExternalAmount
         */
        EXTERNAL_AMOUNT("ExternalAmount"),

        /**
         * Disabled
         */
        DISABLED("Disabled");
        private final String jsonName;

        private TaxModeEnum(final String jsonName) {
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
     * factory method for a enum value of TaxMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static TaxMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new TaxMode() {
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
    public static Optional<TaxMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static TaxMode[] values() {
        return TaxModeEnum.values();
    }

}
