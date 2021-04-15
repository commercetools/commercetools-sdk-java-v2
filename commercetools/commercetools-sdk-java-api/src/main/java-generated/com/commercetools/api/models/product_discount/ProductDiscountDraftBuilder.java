
package com.commercetools.api.models.product_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountDraftBuilder {

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.product_discount.ProductDiscountValueDraft value;

    private String predicate;

    private String sortOrder;

    private Boolean isActive;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    public ProductDiscountDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public ProductDiscountDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public ProductDiscountDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public ProductDiscountDraftBuilder value(
            final com.commercetools.api.models.product_discount.ProductDiscountValueDraft value) {
        this.value = value;
        return this;
    }

    public ProductDiscountDraftBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    public ProductDiscountDraftBuilder sortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public ProductDiscountDraftBuilder isActive(final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public ProductDiscountDraftBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public ProductDiscountDraftBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public com.commercetools.api.models.product_discount.ProductDiscountValueDraft getValue() {
        return this.value;
    }

    public String getPredicate() {
        return this.predicate;
    }

    public String getSortOrder() {
        return this.sortOrder;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    public ProductDiscountDraft build() {
        return new ProductDiscountDraftImpl(name, key, description, value, predicate, sortOrder, isActive, validFrom,
            validUntil);
    }

    public static ProductDiscountDraftBuilder of() {
        return new ProductDiscountDraftBuilder();
    }

    public static ProductDiscountDraftBuilder of(final ProductDiscountDraft template) {
        ProductDiscountDraftBuilder builder = new ProductDiscountDraftBuilder();
        builder.name = template.getName();
        builder.key = template.getKey();
        builder.description = template.getDescription();
        builder.value = template.getValue();
        builder.predicate = template.getPredicate();
        builder.sortOrder = template.getSortOrder();
        builder.isActive = template.getIsActive();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
