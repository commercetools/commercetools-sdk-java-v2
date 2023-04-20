
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodDraft shippingMethodDraft = ShippingMethodDraft.builder()
 *             .name("{name}")
 *             .taxCategory(taxCategoryBuilder -> taxCategoryBuilder)
 *             .plusZoneRates(zoneRatesBuilder -> zoneRatesBuilder)
 *             .isDefault(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodDraftBuilder implements Builder<ShippingMethodDraft> {

    @Nullable
    private String key;

    private String name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString localizedName;

    @Deprecated
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

    /**
     *  <p>User-defined unique identifier for the ShippingMethod.</p>
     * @param key value to be set
     * @return Builder
     */

    public ShippingMethodDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the ShippingMethod.</p>
     * @param name value to be set
     * @return Builder
     */

    public ShippingMethodDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Localized name of the ShippingMethod.</p>
     * @param builder function to build the localizedName value
     * @return Builder
     */

    public ShippingMethodDraftBuilder localizedName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.localizedName = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Localized name of the ShippingMethod.</p>
     * @param builder function to build the localizedName value
     * @return Builder
     */

    public ShippingMethodDraftBuilder withLocalizedName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.localizedName = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Localized name of the ShippingMethod.</p>
     * @param localizedName value to be set
     * @return Builder
     */

    public ShippingMethodDraftBuilder localizedName(
            @Nullable final com.commercetools.api.models.common.LocalizedString localizedName) {
        this.localizedName = localizedName;
        return this;
    }

    /**
     *  <p>Description of the ShippingMethod.</p>
     * @param description value to be set
     * @return Builder
     */
    @Deprecated
    public ShippingMethodDraftBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Localized description of the ShippingMethod.</p>
     * @param builder function to build the localizedDescription value
     * @return Builder
     */

    public ShippingMethodDraftBuilder localizedDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.localizedDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Localized description of the ShippingMethod.</p>
     * @param builder function to build the localizedDescription value
     * @return Builder
     */

    public ShippingMethodDraftBuilder withLocalizedDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.localizedDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Localized description of the ShippingMethod.</p>
     * @param localizedDescription value to be set
     * @return Builder
     */

    public ShippingMethodDraftBuilder localizedDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString localizedDescription) {
        this.localizedDescription = localizedDescription;
        return this;
    }

    /**
     *  <p>TaxCategory for all ZoneRates of the ShippingMethod.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public ShippingMethodDraftBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>TaxCategory for all ZoneRates of the ShippingMethod.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public ShippingMethodDraftBuilder withTaxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>TaxCategory for all ZoneRates of the ShippingMethod.</p>
     * @param taxCategory value to be set
     * @return Builder
     */

    public ShippingMethodDraftBuilder taxCategory(
            final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p>Defines ShippingRates (prices) for specific zones.</p>
     * @param zoneRates value to be set
     * @return Builder
     */

    public ShippingMethodDraftBuilder zoneRates(
            final com.commercetools.api.models.shipping_method.ZoneRateDraft... zoneRates) {
        this.zoneRates = new ArrayList<>(Arrays.asList(zoneRates));
        return this;
    }

    /**
     *  <p>Defines ShippingRates (prices) for specific zones.</p>
     * @param zoneRates value to be set
     * @return Builder
     */

    public ShippingMethodDraftBuilder zoneRates(
            final java.util.List<com.commercetools.api.models.shipping_method.ZoneRateDraft> zoneRates) {
        this.zoneRates = zoneRates;
        return this;
    }

    /**
     *  <p>Defines ShippingRates (prices) for specific zones.</p>
     * @param zoneRates value to be set
     * @return Builder
     */

    public ShippingMethodDraftBuilder plusZoneRates(
            final com.commercetools.api.models.shipping_method.ZoneRateDraft... zoneRates) {
        if (this.zoneRates == null) {
            this.zoneRates = new ArrayList<>();
        }
        this.zoneRates.addAll(Arrays.asList(zoneRates));
        return this;
    }

    /**
     *  <p>Defines ShippingRates (prices) for specific zones.</p>
     * @param builder function to build the zoneRates value
     * @return Builder
     */

    public ShippingMethodDraftBuilder plusZoneRates(
            Function<com.commercetools.api.models.shipping_method.ZoneRateDraftBuilder, com.commercetools.api.models.shipping_method.ZoneRateDraftBuilder> builder) {
        if (this.zoneRates == null) {
            this.zoneRates = new ArrayList<>();
        }
        this.zoneRates
                .add(builder.apply(com.commercetools.api.models.shipping_method.ZoneRateDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Defines ShippingRates (prices) for specific zones.</p>
     * @param builder function to build the zoneRates value
     * @return Builder
     */

    public ShippingMethodDraftBuilder withZoneRates(
            Function<com.commercetools.api.models.shipping_method.ZoneRateDraftBuilder, com.commercetools.api.models.shipping_method.ZoneRateDraftBuilder> builder) {
        this.zoneRates = new ArrayList<>();
        this.zoneRates
                .add(builder.apply(com.commercetools.api.models.shipping_method.ZoneRateDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Defines ShippingRates (prices) for specific zones.</p>
     * @param builder function to build the zoneRates value
     * @return Builder
     */

    public ShippingMethodDraftBuilder addZoneRates(
            Function<com.commercetools.api.models.shipping_method.ZoneRateDraftBuilder, com.commercetools.api.models.shipping_method.ZoneRateDraft> builder) {
        return plusZoneRates(builder.apply(com.commercetools.api.models.shipping_method.ZoneRateDraftBuilder.of()));
    }

    /**
     *  <p>Defines ShippingRates (prices) for specific zones.</p>
     * @param builder function to build the zoneRates value
     * @return Builder
     */

    public ShippingMethodDraftBuilder setZoneRates(
            Function<com.commercetools.api.models.shipping_method.ZoneRateDraftBuilder, com.commercetools.api.models.shipping_method.ZoneRateDraft> builder) {
        return zoneRates(builder.apply(com.commercetools.api.models.shipping_method.ZoneRateDraftBuilder.of()));
    }

    /**
     *  <p>If <code>true</code> the ShippingMethod will be the Project's default ShippingMethod.</p>
     * @param isDefault value to be set
     * @return Builder
     */

    public ShippingMethodDraftBuilder isDefault(final Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     *  <p>Valid Cart predicate to select a ShippingMethod for a Cart.</p>
     * @param predicate value to be set
     * @return Builder
     */

    public ShippingMethodDraftBuilder predicate(@Nullable final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>Custom Fields for the ShippingMethod.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ShippingMethodDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the ShippingMethod.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ShippingMethodDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the ShippingMethod.</p>
     * @param custom value to be set
     * @return Builder
     */

    public ShippingMethodDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the ShippingMethod.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the ShippingMethod.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Localized name of the ShippingMethod.</p>
     * @return localizedName
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getLocalizedName() {
        return this.localizedName;
    }

    /**
     *  <p>Description of the ShippingMethod.</p>
     * @return description
     */
    @Deprecated
    @Nullable
    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>Localized description of the ShippingMethod.</p>
     * @return localizedDescription
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getLocalizedDescription() {
        return this.localizedDescription;
    }

    /**
     *  <p>TaxCategory for all ZoneRates of the ShippingMethod.</p>
     * @return taxCategory
     */

    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>Defines ShippingRates (prices) for specific zones.</p>
     * @return zoneRates
     */

    public java.util.List<com.commercetools.api.models.shipping_method.ZoneRateDraft> getZoneRates() {
        return this.zoneRates;
    }

    /**
     *  <p>If <code>true</code> the ShippingMethod will be the Project's default ShippingMethod.</p>
     * @return isDefault
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     *  <p>Valid Cart predicate to select a ShippingMethod for a Cart.</p>
     * @return predicate
     */

    @Nullable
    public String getPredicate() {
        return this.predicate;
    }

    /**
     *  <p>Custom Fields for the ShippingMethod.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds ShippingMethodDraft with checking for non-null required values
     * @return ShippingMethodDraft
     */
    public ShippingMethodDraft build() {
        Objects.requireNonNull(name, ShippingMethodDraft.class + ": name is missing");
        Objects.requireNonNull(taxCategory, ShippingMethodDraft.class + ": taxCategory is missing");
        Objects.requireNonNull(zoneRates, ShippingMethodDraft.class + ": zoneRates is missing");
        Objects.requireNonNull(isDefault, ShippingMethodDraft.class + ": isDefault is missing");
        return new ShippingMethodDraftImpl(key, name, localizedName, description, localizedDescription, taxCategory,
            zoneRates, isDefault, predicate, custom);
    }

    /**
     * builds ShippingMethodDraft without checking for non-null required values
     * @return ShippingMethodDraft
     */
    public ShippingMethodDraft buildUnchecked() {
        return new ShippingMethodDraftImpl(key, name, localizedName, description, localizedDescription, taxCategory,
            zoneRates, isDefault, predicate, custom);
    }

    /**
     * factory method for an instance of ShippingMethodDraftBuilder
     * @return builder
     */
    public static ShippingMethodDraftBuilder of() {
        return new ShippingMethodDraftBuilder();
    }

    /**
     * create builder for ShippingMethodDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
