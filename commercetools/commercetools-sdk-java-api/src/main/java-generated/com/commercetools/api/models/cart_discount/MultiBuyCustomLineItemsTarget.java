
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MultiBuyCustomLineItemsTargetImpl.class)
public interface MultiBuyCustomLineItemsTarget extends CartDiscountTarget {

    String MULTI_BUY_CUSTOM_LINE_ITEMS = "multiBuyCustomLineItems";

    /**
    *  <p>A valid custom line item target predicate. The discount will be applied to custom line items that are
    *  matched by the predicate.</p>
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
}
