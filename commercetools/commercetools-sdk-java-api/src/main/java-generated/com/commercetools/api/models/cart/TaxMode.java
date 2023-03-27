
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Indicates how taxes are set on the Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TaxMode {

    /**
    	<p>Tax Rates are selected automatically from the <a href="ctp:api:type:TaxCategory">TaxCategories</a> based on the <a href="ctp:api:type:Cart">Cart</a> <code>shippingAddress</code>.
    	This is the default tax mode for a new Cart.</p>
    	<p><code>totalNet</code>, <code>totalGross</code>, and <code>taxPortions</code> fields are calculated based on the <code>taxRoundingMode</code>.</p>

    */
    TaxMode PLATFORM = TaxModeEnum.PLATFORM;
    /**
    	<p>Tax Rates are set externally per <a href="ctp:api:type:ExternalTaxRateDraft">ExternalTaxRateDraft</a>.
    	A Cart can be ordered only if all Line Items, Custom Line Items, and the Shipping Method have an external Tax Rate set.</p>
    	<p><code>totalNet</code>, <code>totalGross</code>, and <code>taxPortions</code> fields are calculated based on the <code>taxRoundingMode</code>.</p>

    */
    TaxMode EXTERNAL = TaxModeEnum.EXTERNAL;
    /**
    	<p>Tax amounts, Tax Rates, and tax portions are set externally per <a href="ctp:api:type:ExternalTaxAmountDraft">ExternalTaxAmountDraft</a>.
    	A Cart can be ordered only if the Cart and all Line Items, Custom Line Items, and the Shipping Method have an external tax amount and rate set.</p>
    	<p>Price-specific update actions on Carts require external recalculation of the total gross price.
    	Hence, the <code>externalTaxAmount</code> is removed in these cases and must be reset with <a href="ctp:api:type:CartSetLineItemTaxAmountAction">Set LineItem TaxAmount</a>, <a href="ctp:api:type:CartSetCustomLineItemTaxAmountAction">Set CustomLineItem TaxAmount</a>, or <a href="ctp:api:type:CartSetShippingMethodTaxAmountAction">Set ShippingMethod TaxAmount</a> update actions.</p>

    */
    TaxMode EXTERNAL_AMOUNT = TaxModeEnum.EXTERNAL_AMOUNT;
    /**
    	<p>No taxes are added to the Cart.</p>
    	<p>Note that this tax mode cannot be set on the <a href="/../api/projects/me-carts">My Carts</a> API.</p>

    */
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
