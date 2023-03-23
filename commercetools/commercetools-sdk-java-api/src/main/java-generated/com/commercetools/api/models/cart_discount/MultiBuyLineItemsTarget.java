
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

    public void setPredicate(final String predicate);

    public void setTriggerQuantity(final Integer triggerQuantity);

    public void setDiscountedQuantity(final Integer discountedQuantity);

    public void setMaxOccurrence(final Integer maxOccurrence);

    public void setSelectionMode(final SelectionMode selectionMode);

    public static MultiBuyLineItemsTarget of() {
        return new MultiBuyLineItemsTargetImpl();
    }

    public static MultiBuyLineItemsTarget of(final MultiBuyLineItemsTarget template) {
        MultiBuyLineItemsTargetImpl instance = new MultiBuyLineItemsTargetImpl();
        instance.setPredicate(template.getPredicate());
        instance.setTriggerQuantity(template.getTriggerQuantity());
        instance.setDiscountedQuantity(template.getDiscountedQuantity());
        instance.setMaxOccurrence(template.getMaxOccurrence());
        instance.setSelectionMode(template.getSelectionMode());
        return instance;
    }

    public static MultiBuyLineItemsTargetBuilder builder() {
        return MultiBuyLineItemsTargetBuilder.of();
    }

    public static MultiBuyLineItemsTargetBuilder builder(final MultiBuyLineItemsTarget template) {
        return MultiBuyLineItemsTargetBuilder.of(template);
    }

    default <T> T withMultiBuyLineItemsTarget(Function<MultiBuyLineItemsTarget, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MultiBuyLineItemsTarget> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MultiBuyLineItemsTarget>() {
            @Override
            public String toString() {
                return "TypeReference<MultiBuyLineItemsTarget>";
            }
        };
    }
}
