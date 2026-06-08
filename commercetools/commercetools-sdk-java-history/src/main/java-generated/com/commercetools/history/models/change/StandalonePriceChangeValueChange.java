
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceChangeValueAction" rel="nofollow">Change Value</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceChangeValueChange standalonePriceChangeValueChange = StandalonePriceChangeValueChange.builder()
 *             .change("{change}")
 *             .staged(true)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceChangeValueChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceChangeValueChangeImpl.class)
public interface StandalonePriceChangeValueChange extends Change {

    /**
     * discriminator value for StandalonePriceChangeValueChange
     */
    String STANDALONE_PRICE_CHANGE_VALUE_CHANGE = "StandalonePriceChangeValueChange";

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
    public Money getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Money getNextValue();

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

    public void setPreviousValue(final Money previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Money nextValue);

    /**
     * factory method
     * @return instance of StandalonePriceChangeValueChange
     */
    public static StandalonePriceChangeValueChange of() {
        return new StandalonePriceChangeValueChangeImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceChangeValueChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceChangeValueChange of(final StandalonePriceChangeValueChange template) {
        StandalonePriceChangeValueChangeImpl instance = new StandalonePriceChangeValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setStaged(template.getStaged());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public StandalonePriceChangeValueChange copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceChangeValueChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceChangeValueChange deepCopy(@Nullable final StandalonePriceChangeValueChange template) {
        if (template == null) {
            return null;
        }
        StandalonePriceChangeValueChangeImpl instance = new StandalonePriceChangeValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setStaged(template.getStaged());
        instance.setPreviousValue(com.commercetools.history.models.common.Money.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Money.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceChangeValueChange
     * @return builder
     */
    public static StandalonePriceChangeValueChangeBuilder builder() {
        return StandalonePriceChangeValueChangeBuilder.of();
    }

    /**
     * create builder for StandalonePriceChangeValueChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceChangeValueChangeBuilder builder(final StandalonePriceChangeValueChange template) {
        return StandalonePriceChangeValueChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceChangeValueChange(Function<StandalonePriceChangeValueChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceChangeValueChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceChangeValueChange>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceChangeValueChange>";
            }
        };
    }
}
