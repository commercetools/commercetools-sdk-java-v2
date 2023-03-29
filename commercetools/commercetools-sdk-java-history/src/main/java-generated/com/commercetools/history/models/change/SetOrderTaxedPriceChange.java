
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.TaxMode;
import com.commercetools.history.models.common.TaxedItemPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetOrderTaxedPriceChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetOrderTaxedPriceChange setOrderTaxedPriceChange = SetOrderTaxedPriceChange.builder()
 *             .change("{change}")
 *             .taxMode(TaxMode.PLATFORM)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetOrderTaxedPriceChangeImpl.class)
public interface SetOrderTaxedPriceChange extends Change {

    /**
     * discriminator value for SetOrderTaxedPriceChange
     */
    String SET_ORDER_TAXED_PRICE_CHANGE = "SetOrderTaxedPriceChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setOrderTaxedPrice</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return taxMode
     */
    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TaxedItemPrice getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public TaxedItemPrice getPreviousValue();

    /**
     *  <p>Update action for <code>setOrderTaxedPrice</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set taxMode
     * @param taxMode value to be set
     */

    public void setTaxMode(final TaxMode taxMode);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final TaxedItemPrice nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final TaxedItemPrice previousValue);

    /**
     * factory method
     * @return instance of SetOrderTaxedPriceChange
     */
    public static SetOrderTaxedPriceChange of() {
        return new SetOrderTaxedPriceChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetOrderTaxedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetOrderTaxedPriceChange of(final SetOrderTaxedPriceChange template) {
        SetOrderTaxedPriceChangeImpl instance = new SetOrderTaxedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setTaxMode(template.getTaxMode());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetOrderTaxedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetOrderTaxedPriceChange deepCopy(@Nullable final SetOrderTaxedPriceChange template) {
        if (template == null) {
            return null;
        }
        SetOrderTaxedPriceChangeImpl instance = new SetOrderTaxedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setTaxMode(template.getTaxMode());
        instance.setNextValue(com.commercetools.history.models.common.TaxedItemPrice.deepCopy(template.getNextValue()));
        instance.setPreviousValue(
            com.commercetools.history.models.common.TaxedItemPrice.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for SetOrderTaxedPriceChange
     * @return builder
     */
    public static SetOrderTaxedPriceChangeBuilder builder() {
        return SetOrderTaxedPriceChangeBuilder.of();
    }

    /**
     * create builder for SetOrderTaxedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetOrderTaxedPriceChangeBuilder builder(final SetOrderTaxedPriceChange template) {
        return SetOrderTaxedPriceChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetOrderTaxedPriceChange(Function<SetOrderTaxedPriceChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetOrderTaxedPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetOrderTaxedPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetOrderTaxedPriceChange>";
            }
        };
    }
}
