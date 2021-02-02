
package com.commercetools.api.models.cart_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MultiBuyCustomLineItemsTargetBuilder {

    private String predicate;

    private Integer triggerQuantity;

    private Integer discountedQuantity;

    @Nullable
    private Integer maxOccurrence;

    private com.commercetools.api.models.cart_discount.SelectionMode selectionMode;

    public MultiBuyCustomLineItemsTargetBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    public MultiBuyCustomLineItemsTargetBuilder triggerQuantity(final Integer triggerQuantity) {
        this.triggerQuantity = triggerQuantity;
        return this;
    }

    public MultiBuyCustomLineItemsTargetBuilder discountedQuantity(final Integer discountedQuantity) {
        this.discountedQuantity = discountedQuantity;
        return this;
    }

    public MultiBuyCustomLineItemsTargetBuilder maxOccurrence(@Nullable final Integer maxOccurrence) {
        this.maxOccurrence = maxOccurrence;
        return this;
    }

    public MultiBuyCustomLineItemsTargetBuilder selectionMode(
            final com.commercetools.api.models.cart_discount.SelectionMode selectionMode) {
        this.selectionMode = selectionMode;
        return this;
    }

    public String getPredicate() {
        return this.predicate;
    }

    public Integer getTriggerQuantity() {
        return this.triggerQuantity;
    }

    public Integer getDiscountedQuantity() {
        return this.discountedQuantity;
    }

    @Nullable
    public Integer getMaxOccurrence() {
        return this.maxOccurrence;
    }

    public com.commercetools.api.models.cart_discount.SelectionMode getSelectionMode() {
        return this.selectionMode;
    }

    public MultiBuyCustomLineItemsTarget build() {
        return new MultiBuyCustomLineItemsTargetImpl(predicate, triggerQuantity, discountedQuantity, maxOccurrence,
            selectionMode);
    }

    public static MultiBuyCustomLineItemsTargetBuilder of() {
        return new MultiBuyCustomLineItemsTargetBuilder();
    }

    public static MultiBuyCustomLineItemsTargetBuilder of(final MultiBuyCustomLineItemsTarget template) {
        MultiBuyCustomLineItemsTargetBuilder builder = new MultiBuyCustomLineItemsTargetBuilder();
        builder.predicate = template.getPredicate();
        builder.triggerQuantity = template.getTriggerQuantity();
        builder.discountedQuantity = template.getDiscountedQuantity();
        builder.maxOccurrence = template.getMaxOccurrence();
        builder.selectionMode = template.getSelectionMode();
        return builder;
    }

}
