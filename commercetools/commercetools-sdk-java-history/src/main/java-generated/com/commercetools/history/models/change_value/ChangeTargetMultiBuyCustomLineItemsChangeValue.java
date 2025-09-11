
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.SelectionMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ChangeTargetMultiBuyCustomLineItemsChangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTargetMultiBuyCustomLineItemsChangeValue changeTargetMultiBuyCustomLineItemsChangeValue = ChangeTargetMultiBuyCustomLineItemsChangeValue.builder()
 *             .predicate("{predicate}")
 *             .triggerQuantity(1)
 *             .discountedQuantity(1)
 *             .maxOccurrence(1)
 *             .selectionMode(SelectionMode.CHEAPEST)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("multiBuyCustomLineItems")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTargetMultiBuyCustomLineItemsChangeValueImpl.class)
public interface ChangeTargetMultiBuyCustomLineItemsChangeValue extends ChangeTargetChangeValue {

    /**
     * discriminator value for ChangeTargetMultiBuyCustomLineItemsChangeValue
     */
    String MULTI_BUY_CUSTOM_LINE_ITEMS = "multiBuyCustomLineItems";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Valid <span>CustomLineItem target predicate</span>.</p>
     * @return predicate
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Quantity of Custom Line Items that triggered the application of the discount.</p>
     * @return triggerQuantity
     */
    @NotNull
    @JsonProperty("triggerQuantity")
    public Integer getTriggerQuantity();

    /**
     *  <p>Quantity of Custom Line Items discounted per application of this discount.</p>
     * @return discountedQuantity
     */
    @NotNull
    @JsonProperty("discountedQuantity")
    public Integer getDiscountedQuantity();

    /**
     *  <p>Maximum number of times the discount is applicable.</p>
     * @return maxOccurrence
     */
    @NotNull
    @JsonProperty("maxOccurrence")
    public Integer getMaxOccurrence();

    /**
     *  <p>SelectionMode based on which particular Custom Line Items were discounted.</p>
     * @return selectionMode
     */
    @NotNull
    @JsonProperty("selectionMode")
    public SelectionMode getSelectionMode();

    /**
     *  <p>Valid <span>CustomLineItem target predicate</span>.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     *  <p>Quantity of Custom Line Items that triggered the application of the discount.</p>
     * @param triggerQuantity value to be set
     */

    public void setTriggerQuantity(final Integer triggerQuantity);

    /**
     *  <p>Quantity of Custom Line Items discounted per application of this discount.</p>
     * @param discountedQuantity value to be set
     */

    public void setDiscountedQuantity(final Integer discountedQuantity);

    /**
     *  <p>Maximum number of times the discount is applicable.</p>
     * @param maxOccurrence value to be set
     */

    public void setMaxOccurrence(final Integer maxOccurrence);

    /**
     *  <p>SelectionMode based on which particular Custom Line Items were discounted.</p>
     * @param selectionMode value to be set
     */

    public void setSelectionMode(final SelectionMode selectionMode);

    /**
     * factory method
     * @return instance of ChangeTargetMultiBuyCustomLineItemsChangeValue
     */
    public static ChangeTargetMultiBuyCustomLineItemsChangeValue of() {
        return new ChangeTargetMultiBuyCustomLineItemsChangeValueImpl();
    }

    /**
     * factory method to create a shallow copy ChangeTargetMultiBuyCustomLineItemsChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeTargetMultiBuyCustomLineItemsChangeValue of(
            final ChangeTargetMultiBuyCustomLineItemsChangeValue template) {
        ChangeTargetMultiBuyCustomLineItemsChangeValueImpl instance = new ChangeTargetMultiBuyCustomLineItemsChangeValueImpl();
        instance.setPredicate(template.getPredicate());
        instance.setTriggerQuantity(template.getTriggerQuantity());
        instance.setDiscountedQuantity(template.getDiscountedQuantity());
        instance.setMaxOccurrence(template.getMaxOccurrence());
        instance.setSelectionMode(template.getSelectionMode());
        return instance;
    }

    public ChangeTargetMultiBuyCustomLineItemsChangeValue copyDeep();

    /**
     * factory method to create a deep copy of ChangeTargetMultiBuyCustomLineItemsChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeTargetMultiBuyCustomLineItemsChangeValue deepCopy(
            @Nullable final ChangeTargetMultiBuyCustomLineItemsChangeValue template) {
        if (template == null) {
            return null;
        }
        ChangeTargetMultiBuyCustomLineItemsChangeValueImpl instance = new ChangeTargetMultiBuyCustomLineItemsChangeValueImpl();
        instance.setPredicate(template.getPredicate());
        instance.setTriggerQuantity(template.getTriggerQuantity());
        instance.setDiscountedQuantity(template.getDiscountedQuantity());
        instance.setMaxOccurrence(template.getMaxOccurrence());
        instance.setSelectionMode(template.getSelectionMode());
        return instance;
    }

    /**
     * builder factory method for ChangeTargetMultiBuyCustomLineItemsChangeValue
     * @return builder
     */
    public static ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder builder() {
        return ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder.of();
    }

    /**
     * create builder for ChangeTargetMultiBuyCustomLineItemsChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder builder(
            final ChangeTargetMultiBuyCustomLineItemsChangeValue template) {
        return ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTargetMultiBuyCustomLineItemsChangeValue(
            Function<ChangeTargetMultiBuyCustomLineItemsChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTargetMultiBuyCustomLineItemsChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTargetMultiBuyCustomLineItemsChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTargetMultiBuyCustomLineItemsChangeValue>";
            }
        };
    }
}
