
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.DiscountOnTotalPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderAddDiscountCodeAction" rel="nofollow">Add DiscountCode</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderRemoveDiscountCodeAction" rel="nofollow">Remove DiscountCode</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderAddLineItemAction" rel="nofollow">Add LineItem</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderRemoveLineItemAction" rel="nofollow">Remove LineItem</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDiscountOnTotalPriceChange setDiscountOnTotalPriceChange = SetDiscountOnTotalPriceChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetDiscountOnTotalPriceChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDiscountOnTotalPriceChangeImpl.class)
public interface SetDiscountOnTotalPriceChange extends Change {

    /**
     * discriminator value for SetDiscountOnTotalPriceChange
     */
    String SET_DISCOUNT_ON_TOTAL_PRICE_CHANGE = "SetDiscountOnTotalPriceChange";

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
    public DiscountOnTotalPrice getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public DiscountOnTotalPrice getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final DiscountOnTotalPrice previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final DiscountOnTotalPrice nextValue);

    /**
     * factory method
     * @return instance of SetDiscountOnTotalPriceChange
     */
    public static SetDiscountOnTotalPriceChange of() {
        return new SetDiscountOnTotalPriceChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetDiscountOnTotalPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDiscountOnTotalPriceChange of(final SetDiscountOnTotalPriceChange template) {
        SetDiscountOnTotalPriceChangeImpl instance = new SetDiscountOnTotalPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetDiscountOnTotalPriceChange copyDeep();

    /**
     * factory method to create a deep copy of SetDiscountOnTotalPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDiscountOnTotalPriceChange deepCopy(@Nullable final SetDiscountOnTotalPriceChange template) {
        if (template == null) {
            return null;
        }
        SetDiscountOnTotalPriceChangeImpl instance = new SetDiscountOnTotalPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.DiscountOnTotalPrice.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.DiscountOnTotalPrice.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetDiscountOnTotalPriceChange
     * @return builder
     */
    public static SetDiscountOnTotalPriceChangeBuilder builder() {
        return SetDiscountOnTotalPriceChangeBuilder.of();
    }

    /**
     * create builder for SetDiscountOnTotalPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDiscountOnTotalPriceChangeBuilder builder(final SetDiscountOnTotalPriceChange template) {
        return SetDiscountOnTotalPriceChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDiscountOnTotalPriceChange(Function<SetDiscountOnTotalPriceChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDiscountOnTotalPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDiscountOnTotalPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDiscountOnTotalPriceChange>";
            }
        };
    }
}
