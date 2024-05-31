
package com.commercetools.api.predicates.expansion.cart;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class CartExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private CartExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static CartExpansionBuilderDsl of() {
        return new CartExpansionBuilderDsl(Collections.emptyList());
    }

    public static CartExpansionBuilderDsl of(final List<String> path) {
        return new CartExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.customer_group.CustomerGroupReferenceExpansionBuilderDsl customerGroup() {
        return com.commercetools.api.predicates.expansion.customer_group.CustomerGroupReferenceExpansionBuilderDsl
                .of(appendOne(path, "customerGroup"));
    }

    public com.commercetools.api.predicates.expansion.cart.LineItemExpansionBuilderDsl lineItems() {
        return com.commercetools.api.predicates.expansion.cart.LineItemExpansionBuilderDsl
                .of(appendOne(path, "lineItems[*]"));
    }

    public com.commercetools.api.predicates.expansion.cart.LineItemExpansionBuilderDsl lineItems(long index) {
        return com.commercetools.api.predicates.expansion.cart.LineItemExpansionBuilderDsl
                .of(appendOne(path, "lineItems[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.cart.CustomLineItemExpansionBuilderDsl customLineItems() {
        return com.commercetools.api.predicates.expansion.cart.CustomLineItemExpansionBuilderDsl
                .of(appendOne(path, "customLineItems[*]"));
    }

    public com.commercetools.api.predicates.expansion.cart.CustomLineItemExpansionBuilderDsl customLineItems(
            long index) {
        return com.commercetools.api.predicates.expansion.cart.CustomLineItemExpansionBuilderDsl
                .of(appendOne(path, "customLineItems[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.cart.ShippingInfoExpansionBuilderDsl shippingInfo() {
        return com.commercetools.api.predicates.expansion.cart.ShippingInfoExpansionBuilderDsl
                .of(appendOne(path, "shippingInfo"));
    }

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl shippingCustomFields() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "shippingCustomFields"));
    }

    public com.commercetools.api.predicates.expansion.cart.DiscountCodeInfoExpansionBuilderDsl discountCodes() {
        return com.commercetools.api.predicates.expansion.cart.DiscountCodeInfoExpansionBuilderDsl
                .of(appendOne(path, "discountCodes[*]"));
    }

    public com.commercetools.api.predicates.expansion.cart.DiscountCodeInfoExpansionBuilderDsl discountCodes(
            long index) {
        return com.commercetools.api.predicates.expansion.cart.DiscountCodeInfoExpansionBuilderDsl
                .of(appendOne(path, "discountCodes[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.cart_discount.CartDiscountReferenceExpansionBuilderDsl refusedGifts() {
        return com.commercetools.api.predicates.expansion.cart_discount.CartDiscountReferenceExpansionBuilderDsl
                .of(appendOne(path, "refusedGifts[*]"));
    }

    public com.commercetools.api.predicates.expansion.cart_discount.CartDiscountReferenceExpansionBuilderDsl refusedGifts(
            long index) {
        return com.commercetools.api.predicates.expansion.cart_discount.CartDiscountReferenceExpansionBuilderDsl
                .of(appendOne(path, "refusedGifts[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.order.PaymentInfoExpansionBuilderDsl paymentInfo() {
        return com.commercetools.api.predicates.expansion.order.PaymentInfoExpansionBuilderDsl
                .of(appendOne(path, "paymentInfo"));
    }

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl custom() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "custom"));
    }

    public com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl lastModifiedBy() {
        return com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl
                .of(appendOne(path, "lastModifiedBy"));
    }

    public com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl createdBy() {
        return com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl
                .of(appendOne(path, "createdBy"));
    }
}
