
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MultiBuyLineItemsTarget
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MultiBuyLineItemsTarget multiBuyLineItemsTarget = MultiBuyLineItemsTarget.builder()
 *             .predicate("{predicate}")
 *             .triggerQuantity(1)
 *             .discountedQuantity(1)
 *             .selectionMode(SelectionMode.CHEAPEST)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MultiBuyLineItemsTargetImpl.class)
public interface MultiBuyLineItemsTarget extends CartDiscountTarget {

    /**
     * discriminator value for MultiBuyLineItemsTarget
     */
    String MULTI_BUY_LINE_ITEMS = "multiBuyLineItems";

    /**
     *  <p>Valid LineItem target predicate. The Discount will be applied to Line Items that are matched by the predicate.</p>
     * @return predicate
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Number of Line Items to be present in order to trigger an application of this Discount.</p>
     * @return triggerQuantity
     */
    @NotNull
    @JsonProperty("triggerQuantity")
    public Integer getTriggerQuantity();

    /**
     *  <p>Number of Line Items that are discounted per application of this Discount.</p>
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
     *  <p>Valid LineItem target predicate. The Discount will be applied to Line Items that are matched by the predicate.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     *  <p>Number of Line Items to be present in order to trigger an application of this Discount.</p>
     * @param triggerQuantity value to be set
     */

    public void setTriggerQuantity(final Integer triggerQuantity);

    /**
     *  <p>Number of Line Items that are discounted per application of this Discount.</p>
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
     * @return instance of MultiBuyLineItemsTarget
     */
    public static MultiBuyLineItemsTarget of() {
        return new MultiBuyLineItemsTargetImpl();
    }

    /**
     * factory method to copy an instance of MultiBuyLineItemsTarget
     * @param template instance to be copied
     * @return copy instance
     */
    public static MultiBuyLineItemsTarget of(final MultiBuyLineItemsTarget template) {
        MultiBuyLineItemsTargetImpl instance = new MultiBuyLineItemsTargetImpl();
        instance.setPredicate(template.getPredicate());
        instance.setTriggerQuantity(template.getTriggerQuantity());
        instance.setDiscountedQuantity(template.getDiscountedQuantity());
        instance.setMaxOccurrence(template.getMaxOccurrence());
        instance.setSelectionMode(template.getSelectionMode());
        return instance;
    }

    /**
     * builder factory method for MultiBuyLineItemsTarget
     * @return builder
     */
    public static MultiBuyLineItemsTargetBuilder builder() {
        return MultiBuyLineItemsTargetBuilder.of();
    }

    /**
     * create builder for MultiBuyLineItemsTarget instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MultiBuyLineItemsTargetBuilder builder(final MultiBuyLineItemsTarget template) {
        return MultiBuyLineItemsTargetBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMultiBuyLineItemsTarget(Function<MultiBuyLineItemsTarget, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MultiBuyLineItemsTarget> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MultiBuyLineItemsTarget>() {
            @Override
            public String toString() {
                return "TypeReference<MultiBuyLineItemsTarget>";
            }
        };
    }
}
