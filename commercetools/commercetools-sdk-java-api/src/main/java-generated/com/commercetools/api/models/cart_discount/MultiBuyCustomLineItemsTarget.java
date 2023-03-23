
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    public void setPredicate(final String predicate);

    public void setTriggerQuantity(final Integer triggerQuantity);

    public void setDiscountedQuantity(final Integer discountedQuantity);

    public void setMaxOccurrence(final Integer maxOccurrence);

    public void setSelectionMode(final SelectionMode selectionMode);

    public static MultiBuyCustomLineItemsTarget of() {
        return new MultiBuyCustomLineItemsTargetImpl();
    }

    public static MultiBuyCustomLineItemsTarget of(final MultiBuyCustomLineItemsTarget template) {
        MultiBuyCustomLineItemsTargetImpl instance = new MultiBuyCustomLineItemsTargetImpl();
        instance.setPredicate(template.getPredicate());
        instance.setTriggerQuantity(template.getTriggerQuantity());
        instance.setDiscountedQuantity(template.getDiscountedQuantity());
        instance.setMaxOccurrence(template.getMaxOccurrence());
        instance.setSelectionMode(template.getSelectionMode());
        return instance;
    }

    public static MultiBuyCustomLineItemsTargetBuilder builder() {
        return MultiBuyCustomLineItemsTargetBuilder.of();
    }

    public static MultiBuyCustomLineItemsTargetBuilder builder(final MultiBuyCustomLineItemsTarget template) {
        return MultiBuyCustomLineItemsTargetBuilder.of(template);
    }

    default <T> T withMultiBuyCustomLineItemsTarget(Function<MultiBuyCustomLineItemsTarget, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MultiBuyCustomLineItemsTarget> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MultiBuyCustomLineItemsTarget>() {
            @Override
            public String toString() {
                return "TypeReference<MultiBuyCustomLineItemsTarget>";
            }
        };
    }
}
