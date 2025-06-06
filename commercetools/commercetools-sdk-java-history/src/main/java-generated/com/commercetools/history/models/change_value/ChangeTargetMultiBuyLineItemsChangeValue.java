
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
 * ChangeTargetMultiBuyLineItemsChangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTargetMultiBuyLineItemsChangeValue changeTargetMultiBuyLineItemsChangeValue = ChangeTargetMultiBuyLineItemsChangeValue.builder()
 *             .predicate("{predicate}")
 *             .triggerQuantity(1)
 *             .discountedQuantity(1)
 *             .maxOccurrence(1)
 *             .selectionMode(SelectionMode.CHEAPEST)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("multiBuyLineItems")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTargetMultiBuyLineItemsChangeValueImpl.class)
public interface ChangeTargetMultiBuyLineItemsChangeValue extends ChangeTargetChangeValue {

    /**
     * discriminator value for ChangeTargetMultiBuyLineItemsChangeValue
     */
    String MULTI_BUY_LINE_ITEMS = "multiBuyLineItems";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Valid LineItem target predicate.</p>
     * @return predicate
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Quantity of Line Items that triggered the application of the discount.</p>
     * @return triggerQuantity
     */
    @NotNull
    @JsonProperty("triggerQuantity")
    public Integer getTriggerQuantity();

    /**
     *  <p>Quantity of Line Items discounted per application of this discount.</p>
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
     *  <p>SelectionMode based on which particular Line Items were discounted.</p>
     * @return selectionMode
     */
    @NotNull
    @JsonProperty("selectionMode")
    public SelectionMode getSelectionMode();

    /**
     *  <p>Valid LineItem target predicate.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     *  <p>Quantity of Line Items that triggered the application of the discount.</p>
     * @param triggerQuantity value to be set
     */

    public void setTriggerQuantity(final Integer triggerQuantity);

    /**
     *  <p>Quantity of Line Items discounted per application of this discount.</p>
     * @param discountedQuantity value to be set
     */

    public void setDiscountedQuantity(final Integer discountedQuantity);

    /**
     *  <p>Maximum number of times the discount is applicable.</p>
     * @param maxOccurrence value to be set
     */

    public void setMaxOccurrence(final Integer maxOccurrence);

    /**
     *  <p>SelectionMode based on which particular Line Items were discounted.</p>
     * @param selectionMode value to be set
     */

    public void setSelectionMode(final SelectionMode selectionMode);

    /**
     * factory method
     * @return instance of ChangeTargetMultiBuyLineItemsChangeValue
     */
    public static ChangeTargetMultiBuyLineItemsChangeValue of() {
        return new ChangeTargetMultiBuyLineItemsChangeValueImpl();
    }

    /**
     * factory method to create a shallow copy ChangeTargetMultiBuyLineItemsChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeTargetMultiBuyLineItemsChangeValue of(final ChangeTargetMultiBuyLineItemsChangeValue template) {
        ChangeTargetMultiBuyLineItemsChangeValueImpl instance = new ChangeTargetMultiBuyLineItemsChangeValueImpl();
        instance.setPredicate(template.getPredicate());
        instance.setTriggerQuantity(template.getTriggerQuantity());
        instance.setDiscountedQuantity(template.getDiscountedQuantity());
        instance.setMaxOccurrence(template.getMaxOccurrence());
        instance.setSelectionMode(template.getSelectionMode());
        return instance;
    }

    public ChangeTargetMultiBuyLineItemsChangeValue copyDeep();

    /**
     * factory method to create a deep copy of ChangeTargetMultiBuyLineItemsChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeTargetMultiBuyLineItemsChangeValue deepCopy(
            @Nullable final ChangeTargetMultiBuyLineItemsChangeValue template) {
        if (template == null) {
            return null;
        }
        ChangeTargetMultiBuyLineItemsChangeValueImpl instance = new ChangeTargetMultiBuyLineItemsChangeValueImpl();
        instance.setPredicate(template.getPredicate());
        instance.setTriggerQuantity(template.getTriggerQuantity());
        instance.setDiscountedQuantity(template.getDiscountedQuantity());
        instance.setMaxOccurrence(template.getMaxOccurrence());
        instance.setSelectionMode(template.getSelectionMode());
        return instance;
    }

    /**
     * builder factory method for ChangeTargetMultiBuyLineItemsChangeValue
     * @return builder
     */
    public static ChangeTargetMultiBuyLineItemsChangeValueBuilder builder() {
        return ChangeTargetMultiBuyLineItemsChangeValueBuilder.of();
    }

    /**
     * create builder for ChangeTargetMultiBuyLineItemsChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTargetMultiBuyLineItemsChangeValueBuilder builder(
            final ChangeTargetMultiBuyLineItemsChangeValue template) {
        return ChangeTargetMultiBuyLineItemsChangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTargetMultiBuyLineItemsChangeValue(
            Function<ChangeTargetMultiBuyLineItemsChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTargetMultiBuyLineItemsChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTargetMultiBuyLineItemsChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTargetMultiBuyLineItemsChangeValue>";
            }
        };
    }
}
