
package com.commercetools.api.models.tax_category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxCategoryBuilder {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String name;

    @Nullable
    private String description;

    private java.util.List<com.commercetools.api.models.tax_category.TaxRate> rates;

    @Nullable
    private String key;

    public TaxCategoryBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public TaxCategoryBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public TaxCategoryBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public TaxCategoryBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public TaxCategoryBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public TaxCategoryBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public TaxCategoryBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public TaxCategoryBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    public TaxCategoryBuilder rates(final com.commercetools.api.models.tax_category.TaxRate... rates) {
        this.rates = new ArrayList<>(Arrays.asList(rates));
        return this;
    }

    public TaxCategoryBuilder rates(final java.util.List<com.commercetools.api.models.tax_category.TaxRate> rates) {
        this.rates = rates;
        return this;
    }

    public TaxCategoryBuilder key(@Nullable final String key) {
        this.key = key;
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

    public String getName() {
        return this.name;
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    public java.util.List<com.commercetools.api.models.tax_category.TaxRate> getRates() {
        return this.rates;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public TaxCategory build() {
        return new TaxCategoryImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name, description,
            rates, key);
    }

    public static TaxCategoryBuilder of() {
        return new TaxCategoryBuilder();
    }

    public static TaxCategoryBuilder of(final TaxCategory template) {
        TaxCategoryBuilder builder = new TaxCategoryBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.rates = template.getRates();
        builder.key = template.getKey();
        return builder;
    }

}
