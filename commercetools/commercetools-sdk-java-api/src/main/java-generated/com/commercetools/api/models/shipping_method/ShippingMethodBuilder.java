
package com.commercetools.api.models.shipping_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodBuilder {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private String key;

    private String name;

    @Nullable
    private String description;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString localizedDescription;

    private com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory;

    private java.util.List<com.commercetools.api.models.shipping_method.ZoneRate> zoneRates;

    private Boolean isDefault;

    @Nullable
    private String predicate;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    public ShippingMethodBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ShippingMethodBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ShippingMethodBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ShippingMethodBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public ShippingMethodBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public ShippingMethodBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ShippingMethodBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public ShippingMethodBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ShippingMethodBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    public ShippingMethodBuilder localizedDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString localizedDescription) {
        this.localizedDescription = localizedDescription;
        return this;
    }

    public ShippingMethodBuilder taxCategory(
            final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    public ShippingMethodBuilder zoneRates(final com.commercetools.api.models.shipping_method.ZoneRate... zoneRates) {
        this.zoneRates = new ArrayList<>(Arrays.asList(zoneRates));
        return this;
    }

    public ShippingMethodBuilder zoneRates(
            final java.util.List<com.commercetools.api.models.shipping_method.ZoneRate> zoneRates) {
        this.zoneRates = zoneRates;
        return this;
    }

    public ShippingMethodBuilder isDefault(final Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    public ShippingMethodBuilder predicate(@Nullable final String predicate) {
        this.predicate = predicate;
        return this;
    }

    public ShippingMethodBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
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

    @Nullable
    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getLocalizedDescription() {
        return this.localizedDescription;
    }

    public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory() {
        return this.taxCategory;
    }

    public java.util.List<com.commercetools.api.models.shipping_method.ZoneRate> getZoneRates() {
        return this.zoneRates;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    @Nullable
    public String getPredicate() {
        return this.predicate;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public ShippingMethod build() {
        return new ShippingMethodImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name,
            description, localizedDescription, taxCategory, zoneRates, isDefault, predicate, custom);
    }

    public static ShippingMethodBuilder of() {
        return new ShippingMethodBuilder();
    }

    public static ShippingMethodBuilder of(final ShippingMethod template) {
        ShippingMethodBuilder builder = new ShippingMethodBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.localizedDescription = template.getLocalizedDescription();
        builder.taxCategory = template.getTaxCategory();
        builder.zoneRates = template.getZoneRates();
        builder.isDefault = template.getIsDefault();
        builder.predicate = template.getPredicate();
        builder.custom = template.getCustom();
        return builder;
    }

}
