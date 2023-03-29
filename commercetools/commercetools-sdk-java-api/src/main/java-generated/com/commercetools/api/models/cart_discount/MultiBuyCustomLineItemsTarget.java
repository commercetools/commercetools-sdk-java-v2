
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This Discount target is similar to <code>MultiBuyLineItems</code>, but is applied on Custom Line Items instead of Line Items.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MultiBuyCustomLineItemsTarget multiBuyCustomLineItemsTarget = MultiBuyCustomLineItemsTarget.builder()
 *             .predicate("{predicate}")
 *             .triggerQuantity(1)
 *             .discountedQuantity(1)
 *             .selectionMode(SelectionMode.CHEAPEST)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MultiBuyCustomLineItemsTargetImpl.class)
public interface MultiBuyCustomLineItemsTarget extends CartDiscountTarget {

    /**
     * discriminator value for MultiBuyCustomLineItemsTarget
     */
    String MULTI_BUY_CUSTOM_LINE_ITEMS = "multiBuyCustomLineItems";

    /**
     *  <p>Valid CustomLineItems target predicate. The Discount will be applied to Custom Line Items that are matched by the predicate.</p>
     * @return predicate
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Number of Custom Line Items to be present in order to trigger an application of this Discount.</p>
     * @return triggerQuantity
     */
    @NotNull
    @JsonProperty("triggerQuantity")
    public Integer getTriggerQuantity();

    /**
     *  <p>Number of Custom Line Items that are discounted per application of this Discount.</p>
     * @return discountedQuantity
     */
    @NotNull
    @JsonProperty("discountedQuantity")
    public Integer getDiscountedQuantity();

    /**
     *  <p>Maximum number of times this Discount can be applied.</p>
     * @return maxOccurrence
     */

    @JsonProperty("maxOccurrence")
    public Integer getMaxOccurrence();

    /**
     *  <p>Discounts particular Line Items only according to the SelectionMode.</p>
     * @return selectionMode
     */
    @NotNull
    @JsonProperty("selectionMode")
    public SelectionMode getSelectionMode();

    /**
     *  <p>Valid CustomLineItems target predicate. The Discount will be applied to Custom Line Items that are matched by the predicate.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     *  <p>Number of Custom Line Items to be present in order to trigger an application of this Discount.</p>
     * @param triggerQuantity value to be set
     */

    public void setTriggerQuantity(final Integer triggerQuantity);

    /**
     *  <p>Number of Custom Line Items that are discounted per application of this Discount.</p>
     * @param discountedQuantity value to be set
     */

    public void setDiscountedQuantity(final Integer discountedQuantity);

    /**
     *  <p>Maximum number of times this Discount can be applied.</p>
     * @param maxOccurrence value to be set
     */

    public void setMaxOccurrence(final Integer maxOccurrence);

    /**
     *  <p>Discounts particular Line Items only according to the SelectionMode.</p>
     * @param selectionMode value to be set
     */

    public void setSelectionMode(final SelectionMode selectionMode);

    /**
     * factory method
     * @return instance of MultiBuyCustomLineItemsTarget
     */
    public static MultiBuyCustomLineItemsTarget of() {
        return new MultiBuyCustomLineItemsTargetImpl();
    }

    /**
     * factory method to create a shallow copy MultiBuyCustomLineItemsTarget
     * @param template instance to be copied
     * @return copy instance
     */
    public static MultiBuyCustomLineItemsTarget of(final MultiBuyCustomLineItemsTarget template) {
        MultiBuyCustomLineItemsTargetImpl instance = new MultiBuyCustomLineItemsTargetImpl();
        instance.setPredicate(template.getPredicate());
        instance.setTriggerQuantity(template.getTriggerQuantity());
        instance.setDiscountedQuantity(template.getDiscountedQuantity());
        instance.setMaxOccurrence(template.getMaxOccurrence());
        instance.setSelectionMode(template.getSelectionMode());
        return instance;
    }

    /**
     * factory method to create a deep copy of MultiBuyCustomLineItemsTarget
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MultiBuyCustomLineItemsTarget deepCopy(@Nullable final MultiBuyCustomLineItemsTarget template) {
        if (template == null) {
            return null;
        }
        MultiBuyCustomLineItemsTargetImpl instance = new MultiBuyCustomLineItemsTargetImpl();
        instance.setPredicate(template.getPredicate());
        instance.setTriggerQuantity(template.getTriggerQuantity());
        instance.setDiscountedQuantity(template.getDiscountedQuantity());
        instance.setMaxOccurrence(template.getMaxOccurrence());
        instance.setSelectionMode(template.getSelectionMode());
        return instance;
    }

    /**
     * builder factory method for MultiBuyCustomLineItemsTarget
     * @return builder
     */
    public static MultiBuyCustomLineItemsTargetBuilder builder() {
        return MultiBuyCustomLineItemsTargetBuilder.of();
    }

    /**
     * create builder for MultiBuyCustomLineItemsTarget instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MultiBuyCustomLineItemsTargetBuilder builder(final MultiBuyCustomLineItemsTarget template) {
        return MultiBuyCustomLineItemsTargetBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMultiBuyCustomLineItemsTarget(Function<MultiBuyCustomLineItemsTarget, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MultiBuyCustomLineItemsTarget> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MultiBuyCustomLineItemsTarget>() {
            @Override
            public String toString() {
                return "TypeReference<MultiBuyCustomLineItemsTarget>";
            }
        };
    }
}
