
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.SelectionMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Shape of the value for cart discounts multiBuyCustomLineItems target.</p>
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
     *
     * @return predicate
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Quantity of line items that need to be present in order to trigger an application of this discount.</p>
     * @return triggerQuantity
     */
    @NotNull
    @JsonProperty("triggerQuantity")
    public Integer getTriggerQuantity();

    /**
     *  <p>Quantity of line items that are discounted per application of this discount.</p>
     * @return discountedQuantity
     */
    @NotNull
    @JsonProperty("discountedQuantity")
    public Integer getDiscountedQuantity();

    /**
     *  <p>Maximum number of applications of this discount.</p>
     * @return maxOccurrence
     */
    @NotNull
    @JsonProperty("maxOccurrence")
    public Integer getMaxOccurrence();

    /**
     *
     * @return selectionMode
     */
    @NotNull
    @JsonProperty("selectionMode")
    public SelectionMode getSelectionMode();

    /**
     * set predicate
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     *  <p>Quantity of line items that need to be present in order to trigger an application of this discount.</p>
     * @param triggerQuantity value to be set
     */

    public void setTriggerQuantity(final Integer triggerQuantity);

    /**
     *  <p>Quantity of line items that are discounted per application of this discount.</p>
     * @param discountedQuantity value to be set
     */

    public void setDiscountedQuantity(final Integer discountedQuantity);

    /**
     *  <p>Maximum number of applications of this discount.</p>
     * @param maxOccurrence value to be set
     */

    public void setMaxOccurrence(final Integer maxOccurrence);

    /**
     * set selectionMode
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
     * factory method to copy an instance of ChangeTargetMultiBuyCustomLineItemsChangeValue
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
