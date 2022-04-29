
package com.commercetools.api.models.product_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductDiscountBuilder implements Builder<ProductDiscount> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.product_discount.ProductDiscountValue value;

    private String predicate;

    private String sortOrder;

    private Boolean isActive;

    private java.util.List<com.commercetools.api.models.common.Reference> references;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    public ProductDiscountBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ProductDiscountBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ProductDiscountBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ProductDiscountBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public ProductDiscountBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public ProductDiscountBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public ProductDiscountBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public ProductDiscountBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ProductDiscountBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductDiscountBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public ProductDiscountBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public ProductDiscountBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductDiscountBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public ProductDiscountBuilder value(
            final com.commercetools.api.models.product_discount.ProductDiscountValue value) {
        this.value = value;
        return this;
    }

    public ProductDiscountBuilder value(
            Function<com.commercetools.api.models.product_discount.ProductDiscountValueBuilder, Builder<? extends com.commercetools.api.models.product_discount.ProductDiscountValue>> builder) {
        this.value = builder.apply(com.commercetools.api.models.product_discount.ProductDiscountValueBuilder.of())
                .build();
        return this;
    }

    public ProductDiscountBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    public ProductDiscountBuilder sortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public ProductDiscountBuilder isActive(final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public ProductDiscountBuilder references(final com.commercetools.api.models.common.Reference... references) {
        this.references = new ArrayList<>(Arrays.asList(references));
        return this;
    }

    public ProductDiscountBuilder references(
            final java.util.List<com.commercetools.api.models.common.Reference> references) {
        this.references = references;
        return this;
    }

    public ProductDiscountBuilder plusReferences(final com.commercetools.api.models.common.Reference... references) {
        if (this.references == null) {
            this.references = new ArrayList<>();
        }
        this.references.addAll(Arrays.asList(references));
        return this;
    }

    public ProductDiscountBuilder plusReferences(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        if (this.references == null) {
            this.references = new ArrayList<>();
        }
        this.references.add(builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    public ProductDiscountBuilder withReferences(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.references = new ArrayList<>();
        this.references.add(builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    public ProductDiscountBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public ProductDiscountBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
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

    public com.commercetools.api.models.product_discount.ProductDiscountValue getValue() {
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

    public java.util.List<com.commercetools.api.models.common.Reference> getReferences() {
        return this.references;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    public ProductDiscount build() {
        Objects.requireNonNull(id, ProductDiscount.class + ": id is missing");
        Objects.requireNonNull(version, ProductDiscount.class + ": version is missing");
        Objects.requireNonNull(createdAt, ProductDiscount.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ProductDiscount.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(name, ProductDiscount.class + ": name is missing");
        Objects.requireNonNull(value, ProductDiscount.class + ": value is missing");
        Objects.requireNonNull(predicate, ProductDiscount.class + ": predicate is missing");
        Objects.requireNonNull(sortOrder, ProductDiscount.class + ": sortOrder is missing");
        Objects.requireNonNull(isActive, ProductDiscount.class + ": isActive is missing");
        Objects.requireNonNull(references, ProductDiscount.class + ": references is missing");
        return new ProductDiscountImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name, key,
            description, value, predicate, sortOrder, isActive, references, validFrom, validUntil);
    }

    /**
     * builds ProductDiscount without checking for non null required values
     */
    public ProductDiscount buildUnchecked() {
        return new ProductDiscountImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name, key,
            description, value, predicate, sortOrder, isActive, references, validFrom, validUntil);
    }

    public static ProductDiscountBuilder of() {
        return new ProductDiscountBuilder();
    }

    public static ProductDiscountBuilder of(final ProductDiscount template) {
        ProductDiscountBuilder builder = new ProductDiscountBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.name = template.getName();
        builder.key = template.getKey();
        builder.description = template.getDescription();
        builder.value = template.getValue();
        builder.predicate = template.getPredicate();
        builder.sortOrder = template.getSortOrder();
        builder.isActive = template.getIsActive();
        builder.references = template.getReferences();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
