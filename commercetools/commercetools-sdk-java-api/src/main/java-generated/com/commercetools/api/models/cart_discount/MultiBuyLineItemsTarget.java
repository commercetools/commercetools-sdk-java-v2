
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MultiBuyLineItemsTargetImpl.class)
public interface MultiBuyLineItemsTarget extends CartDiscountTarget {

    String MULTI_BUY_LINE_ITEMS = "multiBuyLineItems";

    /**
    *  <p>A valid line item target predicate. The discount will be applied to line items that are matched by the predicate.</p>
    */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
    *  <p>Quantity of line items that need to be present in order to trigger an application of this discount.</p>
    */
    @NotNull
    @JsonProperty("triggerQuantity")
    public Integer getTriggerQuantity();

    /**
    *  <p>Quantity of line items that are discounted per application of this discount.</p>
    */
    @NotNull
    @JsonProperty("discountedQuantity")
    public Integer getDiscountedQuantity();

    /**
    *  <p>Maximum number of applications of this discount.</p>
    */

    @JsonProperty("maxOccurrence")
    public Integer getMaxOccurrence();

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
}
