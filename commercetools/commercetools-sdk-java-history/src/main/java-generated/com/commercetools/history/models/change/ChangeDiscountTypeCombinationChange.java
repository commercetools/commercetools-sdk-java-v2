
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.DiscountTypeCombination;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProjectSetDiscountsConfigurationAction" rel="nofollow">Set Discounts Configuration</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeDiscountTypeCombinationChange changeDiscountTypeCombinationChange = ChangeDiscountTypeCombinationChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeDiscountTypeCombinationChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeDiscountTypeCombinationChangeImpl.class)
public interface ChangeDiscountTypeCombinationChange extends Change {

    /**
     * discriminator value for ChangeDiscountTypeCombinationChange
     */
    String CHANGE_DISCOUNT_TYPE_COMBINATION_CHANGE = "ChangeDiscountTypeCombinationChange";

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
    public DiscountTypeCombination getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public DiscountTypeCombination getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final DiscountTypeCombination previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final DiscountTypeCombination nextValue);

    /**
     * factory method
     * @return instance of ChangeDiscountTypeCombinationChange
     */
    public static ChangeDiscountTypeCombinationChange of() {
        return new ChangeDiscountTypeCombinationChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeDiscountTypeCombinationChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeDiscountTypeCombinationChange of(final ChangeDiscountTypeCombinationChange template) {
        ChangeDiscountTypeCombinationChangeImpl instance = new ChangeDiscountTypeCombinationChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeDiscountTypeCombinationChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeDiscountTypeCombinationChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeDiscountTypeCombinationChange deepCopy(
            @Nullable final ChangeDiscountTypeCombinationChange template) {
        if (template == null) {
            return null;
        }
        ChangeDiscountTypeCombinationChangeImpl instance = new ChangeDiscountTypeCombinationChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.DiscountTypeCombination.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.DiscountTypeCombination.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ChangeDiscountTypeCombinationChange
     * @return builder
     */
    public static ChangeDiscountTypeCombinationChangeBuilder builder() {
        return ChangeDiscountTypeCombinationChangeBuilder.of();
    }

    /**
     * create builder for ChangeDiscountTypeCombinationChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeDiscountTypeCombinationChangeBuilder builder(
            final ChangeDiscountTypeCombinationChange template) {
        return ChangeDiscountTypeCombinationChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeDiscountTypeCombinationChange(Function<ChangeDiscountTypeCombinationChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeDiscountTypeCombinationChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeDiscountTypeCombinationChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeDiscountTypeCombinationChange>";
            }
        };
    }
}
