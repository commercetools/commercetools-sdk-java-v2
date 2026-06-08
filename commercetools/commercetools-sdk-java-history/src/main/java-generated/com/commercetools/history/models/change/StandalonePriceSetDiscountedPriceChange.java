
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.DiscountedPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetDiscountedPriceAction" rel="nofollow">Set Discounted Price</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetDiscountedPriceChange standalonePriceSetDiscountedPriceChange = StandalonePriceSetDiscountedPriceChange.builder()
 *             .change("{change}")
 *             .staged(true)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceSetDiscountedPriceChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceSetDiscountedPriceChangeImpl.class)
public interface StandalonePriceSetDiscountedPriceChange extends Change {

    /**
     * discriminator value for StandalonePriceSetDiscountedPriceChange
     */
    String STANDALONE_PRICE_SET_DISCOUNTED_PRICE_CHANGE = "StandalonePriceSetDiscountedPriceChange";

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
     *  <p>Indicates if the change was applied to the staged or current price.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public DiscountedPrice getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public DiscountedPrice getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Indicates if the change was applied to the staged or current price.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final DiscountedPrice previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final DiscountedPrice nextValue);

    /**
     * factory method
     * @return instance of StandalonePriceSetDiscountedPriceChange
     */
    public static StandalonePriceSetDiscountedPriceChange of() {
        return new StandalonePriceSetDiscountedPriceChangeImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceSetDiscountedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceSetDiscountedPriceChange of(final StandalonePriceSetDiscountedPriceChange template) {
        StandalonePriceSetDiscountedPriceChangeImpl instance = new StandalonePriceSetDiscountedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setStaged(template.getStaged());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public StandalonePriceSetDiscountedPriceChange copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceSetDiscountedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceSetDiscountedPriceChange deepCopy(
            @Nullable final StandalonePriceSetDiscountedPriceChange template) {
        if (template == null) {
            return null;
        }
        StandalonePriceSetDiscountedPriceChangeImpl instance = new StandalonePriceSetDiscountedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setStaged(template.getStaged());
        instance.setPreviousValue(
            com.commercetools.history.models.common.DiscountedPrice.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.DiscountedPrice.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceSetDiscountedPriceChange
     * @return builder
     */
    public static StandalonePriceSetDiscountedPriceChangeBuilder builder() {
        return StandalonePriceSetDiscountedPriceChangeBuilder.of();
    }

    /**
     * create builder for StandalonePriceSetDiscountedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetDiscountedPriceChangeBuilder builder(
            final StandalonePriceSetDiscountedPriceChange template) {
        return StandalonePriceSetDiscountedPriceChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceSetDiscountedPriceChange(
            Function<StandalonePriceSetDiscountedPriceChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetDiscountedPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetDiscountedPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceSetDiscountedPriceChange>";
            }
        };
    }
}
