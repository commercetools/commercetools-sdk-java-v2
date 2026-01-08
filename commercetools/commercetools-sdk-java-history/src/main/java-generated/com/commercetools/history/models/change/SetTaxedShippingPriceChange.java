
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.TaxedPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered when there is a recalculation after an Order Edit.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTaxedShippingPriceChange setTaxedShippingPriceChange = SetTaxedShippingPriceChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetTaxedShippingPriceChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetTaxedShippingPriceChangeImpl.class)
public interface SetTaxedShippingPriceChange extends Change {

    /**
     * discriminator value for SetTaxedShippingPriceChange
     */
    String SET_TAXED_SHIPPING_PRICE_CHANGE = "SetTaxedShippingPriceChange";

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
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public TaxedPrice getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TaxedPrice getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final TaxedPrice previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final TaxedPrice nextValue);

    /**
     * factory method
     * @return instance of SetTaxedShippingPriceChange
     */
    public static SetTaxedShippingPriceChange of() {
        return new SetTaxedShippingPriceChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetTaxedShippingPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetTaxedShippingPriceChange of(final SetTaxedShippingPriceChange template) {
        SetTaxedShippingPriceChangeImpl instance = new SetTaxedShippingPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetTaxedShippingPriceChange copyDeep();

    /**
     * factory method to create a deep copy of SetTaxedShippingPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetTaxedShippingPriceChange deepCopy(@Nullable final SetTaxedShippingPriceChange template) {
        if (template == null) {
            return null;
        }
        SetTaxedShippingPriceChangeImpl instance = new SetTaxedShippingPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.TaxedPrice.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.TaxedPrice.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetTaxedShippingPriceChange
     * @return builder
     */
    public static SetTaxedShippingPriceChangeBuilder builder() {
        return SetTaxedShippingPriceChangeBuilder.of();
    }

    /**
     * create builder for SetTaxedShippingPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTaxedShippingPriceChangeBuilder builder(final SetTaxedShippingPriceChange template) {
        return SetTaxedShippingPriceChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetTaxedShippingPriceChange(Function<SetTaxedShippingPriceChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetTaxedShippingPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetTaxedShippingPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetTaxedShippingPriceChange>";
            }
        };
    }
}
