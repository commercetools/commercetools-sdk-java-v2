
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.RoundingMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderChangePriceRoundingModeAction" rel="nofollow">Change Price Rounding Mode</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangePriceRoundingModeChange changePriceRoundingModeChange = ChangePriceRoundingModeChange.builder()
 *             .change("{change}")
 *             .previousValue(RoundingMode.HALF_EVEN)
 *             .nextValue(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangePriceRoundingModeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangePriceRoundingModeChangeImpl.class)
public interface ChangePriceRoundingModeChange extends Change {

    /**
     * discriminator value for ChangePriceRoundingModeChange
     */
    String CHANGE_PRICE_ROUNDING_MODE_CHANGE = "ChangePriceRoundingModeChange";

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
    @JsonProperty("previousValue")
    public RoundingMode getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public RoundingMode getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final RoundingMode previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final RoundingMode nextValue);

    /**
     * factory method
     * @return instance of ChangePriceRoundingModeChange
     */
    public static ChangePriceRoundingModeChange of() {
        return new ChangePriceRoundingModeChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangePriceRoundingModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangePriceRoundingModeChange of(final ChangePriceRoundingModeChange template) {
        ChangePriceRoundingModeChangeImpl instance = new ChangePriceRoundingModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangePriceRoundingModeChange copyDeep();

    /**
     * factory method to create a deep copy of ChangePriceRoundingModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangePriceRoundingModeChange deepCopy(@Nullable final ChangePriceRoundingModeChange template) {
        if (template == null) {
            return null;
        }
        ChangePriceRoundingModeChangeImpl instance = new ChangePriceRoundingModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangePriceRoundingModeChange
     * @return builder
     */
    public static ChangePriceRoundingModeChangeBuilder builder() {
        return ChangePriceRoundingModeChangeBuilder.of();
    }

    /**
     * create builder for ChangePriceRoundingModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangePriceRoundingModeChangeBuilder builder(final ChangePriceRoundingModeChange template) {
        return ChangePriceRoundingModeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangePriceRoundingModeChange(Function<ChangePriceRoundingModeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangePriceRoundingModeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangePriceRoundingModeChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangePriceRoundingModeChange>";
            }
        };
    }
}
