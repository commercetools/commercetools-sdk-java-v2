
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Reference;
import com.commercetools.history.models.common.TaxMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered when the Tax Category of a Shipping Method associated with an Order has changed.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingMethodTaxCategoryChange setShippingMethodTaxCategoryChange = SetShippingMethodTaxCategoryChange.builder()
 *             .change("{change}")
 *             .taxMode(TaxMode.PLATFORM)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetShippingMethodTaxCategoryChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetShippingMethodTaxCategoryChangeImpl.class)
public interface SetShippingMethodTaxCategoryChange extends Change {

    /**
     * discriminator value for SetShippingMethodTaxCategoryChange
     */
    String SET_SHIPPING_METHOD_TAX_CATEGORY_CHANGE = "SetShippingMethodTaxCategoryChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Indicates how Tax Rates are set.</p>
     * @return taxMode
     */
    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Indicates how Tax Rates are set.</p>
     * @param taxMode value to be set
     */

    public void setTaxMode(final TaxMode taxMode);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Reference previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Reference nextValue);

    /**
     * factory method
     * @return instance of SetShippingMethodTaxCategoryChange
     */
    public static SetShippingMethodTaxCategoryChange of() {
        return new SetShippingMethodTaxCategoryChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetShippingMethodTaxCategoryChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetShippingMethodTaxCategoryChange of(final SetShippingMethodTaxCategoryChange template) {
        SetShippingMethodTaxCategoryChangeImpl instance = new SetShippingMethodTaxCategoryChangeImpl();
        instance.setChange(template.getChange());
        instance.setTaxMode(template.getTaxMode());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetShippingMethodTaxCategoryChange copyDeep();

    /**
     * factory method to create a deep copy of SetShippingMethodTaxCategoryChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetShippingMethodTaxCategoryChange deepCopy(
            @Nullable final SetShippingMethodTaxCategoryChange template) {
        if (template == null) {
            return null;
        }
        SetShippingMethodTaxCategoryChangeImpl instance = new SetShippingMethodTaxCategoryChangeImpl();
        instance.setChange(template.getChange());
        instance.setTaxMode(template.getTaxMode());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Reference.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Reference.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetShippingMethodTaxCategoryChange
     * @return builder
     */
    public static SetShippingMethodTaxCategoryChangeBuilder builder() {
        return SetShippingMethodTaxCategoryChangeBuilder.of();
    }

    /**
     * create builder for SetShippingMethodTaxCategoryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingMethodTaxCategoryChangeBuilder builder(final SetShippingMethodTaxCategoryChange template) {
        return SetShippingMethodTaxCategoryChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetShippingMethodTaxCategoryChange(Function<SetShippingMethodTaxCategoryChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetShippingMethodTaxCategoryChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShippingMethodTaxCategoryChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShippingMethodTaxCategoryChange>";
            }
        };
    }
}
