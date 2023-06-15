
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.TaxedPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShippingInfoTaxedPriceChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingInfoTaxedPriceChange setShippingInfoTaxedPriceChange = SetShippingInfoTaxedPriceChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetShippingInfoTaxedPriceChangeImpl.class)
public interface SetShippingInfoTaxedPriceChange extends Change {

    /**
     * discriminator value for SetShippingInfoTaxedPriceChange
     */
    String SET_SHIPPING_INFO_TAXED_PRICE_CHANGE = "SetShippingInfoTaxedPriceChange";

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
     * @return instance of SetShippingInfoTaxedPriceChange
     */
    public static SetShippingInfoTaxedPriceChange of() {
        return new SetShippingInfoTaxedPriceChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetShippingInfoTaxedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetShippingInfoTaxedPriceChange of(final SetShippingInfoTaxedPriceChange template) {
        SetShippingInfoTaxedPriceChangeImpl instance = new SetShippingInfoTaxedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetShippingInfoTaxedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetShippingInfoTaxedPriceChange deepCopy(@Nullable final SetShippingInfoTaxedPriceChange template) {
        if (template == null) {
            return null;
        }
        SetShippingInfoTaxedPriceChangeImpl instance = new SetShippingInfoTaxedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.TaxedPrice.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.TaxedPrice.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetShippingInfoTaxedPriceChange
     * @return builder
     */
    public static SetShippingInfoTaxedPriceChangeBuilder builder() {
        return SetShippingInfoTaxedPriceChangeBuilder.of();
    }

    /**
     * create builder for SetShippingInfoTaxedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingInfoTaxedPriceChangeBuilder builder(final SetShippingInfoTaxedPriceChange template) {
        return SetShippingInfoTaxedPriceChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetShippingInfoTaxedPriceChange(Function<SetShippingInfoTaxedPriceChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetShippingInfoTaxedPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShippingInfoTaxedPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShippingInfoTaxedPriceChange>";
            }
        };
    }
}
