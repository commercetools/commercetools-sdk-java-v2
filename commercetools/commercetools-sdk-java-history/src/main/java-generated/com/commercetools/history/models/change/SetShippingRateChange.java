
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
 * SetShippingRateChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingRateChange setShippingRateChange = SetShippingRateChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetShippingRateChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetShippingRateChangeImpl.class)
public interface SetShippingRateChange extends Change {

    /**
     * discriminator value for SetShippingRateChange
     */
    String SET_SHIPPING_RATE_CHANGE = "SetShippingRateChange";

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
     * @return instance of SetShippingRateChange
     */
    public static SetShippingRateChange of() {
        return new SetShippingRateChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetShippingRateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetShippingRateChange of(final SetShippingRateChange template) {
        SetShippingRateChangeImpl instance = new SetShippingRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetShippingRateChange copyDeep();

    /**
     * factory method to create a deep copy of SetShippingRateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetShippingRateChange deepCopy(@Nullable final SetShippingRateChange template) {
        if (template == null) {
            return null;
        }
        SetShippingRateChangeImpl instance = new SetShippingRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(com.commercetools.history.models.common.Money.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Money.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetShippingRateChange
     * @return builder
     */
    public static SetShippingRateChangeBuilder builder() {
        return SetShippingRateChangeBuilder.of();
    }

    /**
     * create builder for SetShippingRateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingRateChangeBuilder builder(final SetShippingRateChange template) {
        return SetShippingRateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetShippingRateChange(Function<SetShippingRateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetShippingRateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShippingRateChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShippingRateChange>";
            }
        };
    }
}
