
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethod shippingMethod = ShippingMethod.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name("{name}")
 *             .taxCategory(taxCategoryBuilder -> taxCategoryBuilder)
 *             .plusZoneRates(zoneRatesBuilder -> zoneRatesBuilder)
 *             .isDefault(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodBuilder implements Builder<ShippingMethod> {

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
    private com.commercetools.api.models.common.LocalizedString localizedName;

    @Deprecated
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

    /**
     *  <p>Unique identifier of the ShippingMethod.</p>
     */

    public ShippingMethodBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the ShippingMethod.</p>
     */

    public ShippingMethodBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ShippingMethod was initially created.</p>
     */

    public ShippingMethodBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ShippingMethod was last updated.</p>
     */

    public ShippingMethodBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public ShippingMethodBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public ShippingMethodBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public ShippingMethodBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public ShippingMethodBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the ShippingMethod.</p>
     */

    public ShippingMethodBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the ShippingMethod.</p>
     */

    public ShippingMethodBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Localized name of the ShippingMethod.</p>
     */

    public ShippingMethodBuilder localizedName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.localizedName = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Localized name of the ShippingMethod.</p>
     */

    public ShippingMethodBuilder localizedName(
            @Nullable final com.commercetools.api.models.common.LocalizedString localizedName) {
        this.localizedName = localizedName;
        return this;
    }

    /**
     *  <p>Description of the ShippingMethod.</p>
     */
    @Deprecated
    public ShippingMethodBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Localized description of the ShippingMethod.</p>
     */

    public ShippingMethodBuilder localizedDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.localizedDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Localized description of the ShippingMethod.</p>
     */

    public ShippingMethodBuilder localizedDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString localizedDescription) {
        this.localizedDescription = localizedDescription;
        return this;
    }

    /**
     *  <p>TaxCategory of all ZoneRates of the ShippingMethod.</p>
     */

    public ShippingMethodBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder, com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder> builder) {
        this.taxCategory = builder.apply(com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>TaxCategory of all ZoneRates of the ShippingMethod.</p>
     */

    public ShippingMethodBuilder taxCategory(
            final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p>Defines ShippingRates (prices) for specific Zones.</p>
     */

    public ShippingMethodBuilder zoneRates(final com.commercetools.api.models.shipping_method.ZoneRate... zoneRates) {
        this.zoneRates = new ArrayList<>(Arrays.asList(zoneRates));
        return this;
    }

    /**
     *  <p>Defines ShippingRates (prices) for specific Zones.</p>
     */

    public ShippingMethodBuilder zoneRates(
            final java.util.List<com.commercetools.api.models.shipping_method.ZoneRate> zoneRates) {
        this.zoneRates = zoneRates;
        return this;
    }

    /**
     *  <p>Defines ShippingRates (prices) for specific Zones.</p>
     */

    public ShippingMethodBuilder plusZoneRates(
            final com.commercetools.api.models.shipping_method.ZoneRate... zoneRates) {
        if (this.zoneRates == null) {
            this.zoneRates = new ArrayList<>();
        }
        this.zoneRates.addAll(Arrays.asList(zoneRates));
        return this;
    }

    /**
     *  <p>Defines ShippingRates (prices) for specific Zones.</p>
     */

    public ShippingMethodBuilder plusZoneRates(
            Function<com.commercetools.api.models.shipping_method.ZoneRateBuilder, com.commercetools.api.models.shipping_method.ZoneRateBuilder> builder) {
        if (this.zoneRates == null) {
            this.zoneRates = new ArrayList<>();
        }
        this.zoneRates.add(builder.apply(com.commercetools.api.models.shipping_method.ZoneRateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Defines ShippingRates (prices) for specific Zones.</p>
     */

    public ShippingMethodBuilder withZoneRates(
            Function<com.commercetools.api.models.shipping_method.ZoneRateBuilder, com.commercetools.api.models.shipping_method.ZoneRateBuilder> builder) {
        this.zoneRates = new ArrayList<>();
        this.zoneRates.add(builder.apply(com.commercetools.api.models.shipping_method.ZoneRateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>If <code>true</code> this ShippingMethod is the Project's default ShippingMethod.</p>
     */

    public ShippingMethodBuilder isDefault(final Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     *  <p>Valid Cart predicate to select a ShippingMethod for a Cart.</p>
     */

    public ShippingMethodBuilder predicate(@Nullable final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>Custom Fields of the ShippingMethod.</p>
     */

    public ShippingMethodBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the ShippingMethod.</p>
     */

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
    public com.commercetools.api.models.common.LocalizedString getLocalizedName() {
        return this.localizedName;
    }

    @Deprecated
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
        Objects.requireNonNull(id, ShippingMethod.class + ": id is missing");
        Objects.requireNonNull(version, ShippingMethod.class + ": version is missing");
        Objects.requireNonNull(createdAt, ShippingMethod.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ShippingMethod.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(name, ShippingMethod.class + ": name is missing");
        Objects.requireNonNull(taxCategory, ShippingMethod.class + ": taxCategory is missing");
        Objects.requireNonNull(zoneRates, ShippingMethod.class + ": zoneRates is missing");
        Objects.requireNonNull(isDefault, ShippingMethod.class + ": isDefault is missing");
        return new ShippingMethodImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name,
            localizedName, description, localizedDescription, taxCategory, zoneRates, isDefault, predicate, custom);
    }

    /**
     * builds ShippingMethod without checking for non null required values
     */
    public ShippingMethod buildUnchecked() {
        return new ShippingMethodImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name,
            localizedName, description, localizedDescription, taxCategory, zoneRates, isDefault, predicate, custom);
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
