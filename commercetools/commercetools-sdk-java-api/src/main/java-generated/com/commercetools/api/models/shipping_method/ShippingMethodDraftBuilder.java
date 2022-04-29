
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ShippingMethodDraftBuilder implements Builder<ShippingMethodDraft> {

    @Nullable
    private String key;

    private String name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString localizedName;

    @Nullable
    private String description;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString localizedDescription;

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    private java.util.List<com.commercetools.api.models.shipping_method.ZoneRateDraft> zoneRates;

    private Boolean isDefault;

    @Nullable
    private String predicate;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    public ShippingMethodDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public ShippingMethodDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ShippingMethodDraftBuilder localizedName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.localizedName = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ShippingMethodDraftBuilder localizedName(
            @Nullable final com.commercetools.api.models.common.LocalizedString localizedName) {
        this.localizedName = localizedName;
        return this;
    }

    public ShippingMethodDraftBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    public ShippingMethodDraftBuilder localizedDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.localizedDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    public ShippingMethodDraftBuilder localizedDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString localizedDescription) {
        this.localizedDescription = localizedDescription;
        return this;
    }

    public ShippingMethodDraftBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public ShippingMethodDraftBuilder taxCategory(
            final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    public ShippingMethodDraftBuilder zoneRates(
            final com.commercetools.api.models.shipping_method.ZoneRateDraft... zoneRates) {
        this.zoneRates = new ArrayList<>(Arrays.asList(zoneRates));
        return this;
    }

    public ShippingMethodDraftBuilder zoneRates(
            final java.util.List<com.commercetools.api.models.shipping_method.ZoneRateDraft> zoneRates) {
        this.zoneRates = zoneRates;
        return this;
    }

    public ShippingMethodDraftBuilder plusZoneRates(
            final com.commercetools.api.models.shipping_method.ZoneRateDraft... zoneRates) {
        if (this.zoneRates == null) {
            this.zoneRates = new ArrayList<>();
        }
        this.zoneRates.addAll(Arrays.asList(zoneRates));
        return this;
    }

    public ShippingMethodDraftBuilder plusZoneRates(
            Function<com.commercetools.api.models.shipping_method.ZoneRateDraftBuilder, com.commercetools.api.models.shipping_method.ZoneRateDraftBuilder> builder) {
        if (this.zoneRates == null) {
            this.zoneRates = new ArrayList<>();
        }
        this.zoneRates
                .add(builder.apply(com.commercetools.api.models.shipping_method.ZoneRateDraftBuilder.of()).build());
        return this;
    }

    public ShippingMethodDraftBuilder withZoneRates(
            Function<com.commercetools.api.models.shipping_method.ZoneRateDraftBuilder, com.commercetools.api.models.shipping_method.ZoneRateDraftBuilder> builder) {
        this.zoneRates = new ArrayList<>();
        this.zoneRates
                .add(builder.apply(com.commercetools.api.models.shipping_method.ZoneRateDraftBuilder.of()).build());
        return this;
    }

    public ShippingMethodDraftBuilder isDefault(final Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    public ShippingMethodDraftBuilder predicate(@Nullable final String predicate) {
        this.predicate = predicate;
        return this;
    }

    public ShippingMethodDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public ShippingMethodDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getLocalizedName() {
        return this.localizedName;
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getLocalizedDescription() {
        return this.localizedDescription;
    }

    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    public java.util.List<com.commercetools.api.models.shipping_method.ZoneRateDraft> getZoneRates() {
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
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public ShippingMethodDraft build() {
        Objects.requireNonNull(name, ShippingMethodDraft.class + ": name is missing");
        Objects.requireNonNull(taxCategory, ShippingMethodDraft.class + ": taxCategory is missing");
        Objects.requireNonNull(zoneRates, ShippingMethodDraft.class + ": zoneRates is missing");
        Objects.requireNonNull(isDefault, ShippingMethodDraft.class + ": isDefault is missing");
        return new ShippingMethodDraftImpl(key, name, localizedName, description, localizedDescription, taxCategory,
            zoneRates, isDefault, predicate, custom);
    }

    /**
     * builds ShippingMethodDraft without checking for non null required values
     */
    public ShippingMethodDraft buildUnchecked() {
        return new ShippingMethodDraftImpl(key, name, localizedName, description, localizedDescription, taxCategory,
            zoneRates, isDefault, predicate, custom);
    }

    public static ShippingMethodDraftBuilder of() {
        return new ShippingMethodDraftBuilder();
    }

    public static ShippingMethodDraftBuilder of(final ShippingMethodDraft template) {
        ShippingMethodDraftBuilder builder = new ShippingMethodDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.localizedName = template.getLocalizedName();
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
