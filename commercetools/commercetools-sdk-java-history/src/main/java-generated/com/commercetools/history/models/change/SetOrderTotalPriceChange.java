
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
 *  <p>Change triggered automatically due to a user-initiated change.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetOrderTotalPriceChange setOrderTotalPriceChange = SetOrderTotalPriceChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetOrderTotalPriceChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetOrderTotalPriceChangeImpl.class)
public interface SetOrderTotalPriceChange extends Change {

    /**
     * discriminator value for SetOrderTotalPriceChange
     */
    String SET_ORDER_TOTAL_PRICE_CHANGE = "SetOrderTotalPriceChange";

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
     * @return instance of SetOrderTotalPriceChange
     */
    public static SetOrderTotalPriceChange of() {
        return new SetOrderTotalPriceChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetOrderTotalPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetOrderTotalPriceChange of(final SetOrderTotalPriceChange template) {
        SetOrderTotalPriceChangeImpl instance = new SetOrderTotalPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetOrderTotalPriceChange copyDeep();

    /**
     * factory method to create a deep copy of SetOrderTotalPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetOrderTotalPriceChange deepCopy(@Nullable final SetOrderTotalPriceChange template) {
        if (template == null) {
            return null;
        }
        SetOrderTotalPriceChangeImpl instance = new SetOrderTotalPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(com.commercetools.history.models.common.Money.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Money.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetOrderTotalPriceChange
     * @return builder
     */
    public static SetOrderTotalPriceChangeBuilder builder() {
        return SetOrderTotalPriceChangeBuilder.of();
    }

    /**
     * create builder for SetOrderTotalPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetOrderTotalPriceChangeBuilder builder(final SetOrderTotalPriceChange template) {
        return SetOrderTotalPriceChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetOrderTotalPriceChange(Function<SetOrderTotalPriceChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetOrderTotalPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetOrderTotalPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetOrderTotalPriceChange>";
            }
        };
    }
}
