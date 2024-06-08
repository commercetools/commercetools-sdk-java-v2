
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.TaxMode;
import com.commercetools.history.models.common.TaxRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Set ShippingMethod TaxRate update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingMethodTaxRateChange setShippingMethodTaxRateChange = SetShippingMethodTaxRateChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .taxMode(TaxMode.PLATFORM)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetShippingMethodTaxRateChangeImpl.class)
public interface SetShippingMethodTaxRateChange extends Change {

    /**
     * discriminator value for SetShippingMethodTaxRateChange
     */
    String SET_SHIPPING_METHOD_TAX_RATE_CHANGE = "SetShippingMethodTaxRateChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public TaxRate getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TaxRate getNextValue();

    /**
     *  <p><code>"External"</code></p>
     * @return taxMode
     */
    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final TaxRate previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final TaxRate nextValue);

    /**
     *  <p><code>"External"</code></p>
     * @param taxMode value to be set
     */

    public void setTaxMode(final TaxMode taxMode);

    /**
     * factory method
     * @return instance of SetShippingMethodTaxRateChange
     */
    public static SetShippingMethodTaxRateChange of() {
        return new SetShippingMethodTaxRateChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetShippingMethodTaxRateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetShippingMethodTaxRateChange of(final SetShippingMethodTaxRateChange template) {
        SetShippingMethodTaxRateChangeImpl instance = new SetShippingMethodTaxRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setTaxMode(template.getTaxMode());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetShippingMethodTaxRateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetShippingMethodTaxRateChange deepCopy(@Nullable final SetShippingMethodTaxRateChange template) {
        if (template == null) {
            return null;
        }
        SetShippingMethodTaxRateChangeImpl instance = new SetShippingMethodTaxRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.TaxRate.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.TaxRate.deepCopy(template.getNextValue()));
        instance.setTaxMode(template.getTaxMode());
        return instance;
    }

    /**
     * builder factory method for SetShippingMethodTaxRateChange
     * @return builder
     */
    public static SetShippingMethodTaxRateChangeBuilder builder() {
        return SetShippingMethodTaxRateChangeBuilder.of();
    }

    /**
     * create builder for SetShippingMethodTaxRateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingMethodTaxRateChangeBuilder builder(final SetShippingMethodTaxRateChange template) {
        return SetShippingMethodTaxRateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetShippingMethodTaxRateChange(Function<SetShippingMethodTaxRateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetShippingMethodTaxRateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShippingMethodTaxRateChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShippingMethodTaxRateChange>";
            }
        };
    }
}
