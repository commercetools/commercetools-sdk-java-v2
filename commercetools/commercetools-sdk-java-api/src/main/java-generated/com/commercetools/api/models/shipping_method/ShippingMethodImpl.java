
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ShippingMethod
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodImpl implements ShippingMethod, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    private String name;

    private com.commercetools.api.models.common.LocalizedString localizedName;

    @Deprecated
    private String description;

    private com.commercetools.api.models.common.LocalizedString localizedDescription;

    private com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory;

    private java.util.List<com.commercetools.api.models.shipping_method.ZoneRate> zoneRates;

    private Boolean isDefault;

    private String predicate;

    private com.commercetools.api.models.type.CustomFields custom;

    @JsonCreator
    ShippingMethodImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("key") final String key, @JsonProperty("name") final String name,
            @JsonProperty("localizedName") final com.commercetools.api.models.common.LocalizedString localizedName,
            @JsonProperty("description") final String description,
            @JsonProperty("localizedDescription") final com.commercetools.api.models.common.LocalizedString localizedDescription,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory,
            @JsonProperty("zoneRates") final java.util.List<com.commercetools.api.models.shipping_method.ZoneRate> zoneRates,
            @JsonProperty("isDefault") final Boolean isDefault, @JsonProperty("predicate") final String predicate,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.key = key;
        this.name = name;
        this.localizedName = localizedName;
        this.description = description;
        this.localizedDescription = localizedDescription;
        this.taxCategory = taxCategory;
        this.zoneRates = zoneRates;
        this.isDefault = isDefault;
        this.predicate = predicate;
        this.custom = custom;
    }

    public ShippingMethodImpl() {
    }

    /**
     *  <p>Unique identifier of the ShippingMethod.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the ShippingMethod.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the ShippingMethod was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the ShippingMethod was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>User-defined unique identifier of the ShippingMethod.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the ShippingMethod.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Localized name of the ShippingMethod.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getLocalizedName() {
        return this.localizedName;
    }

    /**
     *  <p>Description of the ShippingMethod.</p>
     */
    @Deprecated
    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>Localized description of the ShippingMethod.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getLocalizedDescription() {
        return this.localizedDescription;
    }

    /**
     *  <p>TaxCategory of all ZoneRates of the ShippingMethod.</p>
     */

    public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>Defines ShippingRates (prices) for specific Zones.</p>
     */

    public java.util.List<com.commercetools.api.models.shipping_method.ZoneRate> getZoneRates() {
        return this.zoneRates;
    }

    /**
     *  <p>If <code>true</code> this ShippingMethod is the Project's default ShippingMethod.</p>
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     *  <p>Valid Cart predicate to select a ShippingMethod for a Cart.</p>
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     *  <p>Custom Fields of the ShippingMethod.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setLocalizedName(final com.commercetools.api.models.common.LocalizedString localizedName) {
        this.localizedName = localizedName;
    }

    @Deprecated
    public void setDescription(final String description) {
        this.description = description;
    }

    public void setLocalizedDescription(
            final com.commercetools.api.models.common.LocalizedString localizedDescription) {
        this.localizedDescription = localizedDescription;
    }

    public void setTaxCategory(final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory) {
        this.taxCategory = taxCategory;
    }

    public void setZoneRates(final com.commercetools.api.models.shipping_method.ZoneRate... zoneRates) {
        this.zoneRates = new ArrayList<>(Arrays.asList(zoneRates));
    }

    public void setZoneRates(final java.util.List<com.commercetools.api.models.shipping_method.ZoneRate> zoneRates) {
        this.zoneRates = zoneRates;
    }

    public void setIsDefault(final Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setPredicate(final String predicate) {
        this.predicate = predicate;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingMethodImpl that = (ShippingMethodImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(key, that.key)
                .append(name, that.name)
                .append(localizedName, that.localizedName)
                .append(description, that.description)
                .append(localizedDescription, that.localizedDescription)
                .append(taxCategory, that.taxCategory)
                .append(zoneRates, that.zoneRates)
                .append(isDefault, that.isDefault)
                .append(predicate, that.predicate)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(lastModifiedBy)
                .append(createdBy)
                .append(key)
                .append(name)
                .append(localizedName)
                .append(description)
                .append(localizedDescription)
                .append(taxCategory)
                .append(zoneRates)
                .append(isDefault)
                .append(predicate)
                .append(custom)
                .toHashCode();
    }

}
