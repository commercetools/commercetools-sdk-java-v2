
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodDraftImpl implements ShippingMethodDraft {

    private String key;

    private String name;

    private String description;

    private com.commercetools.api.models.common.LocalizedString localizedDescription;

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    private java.util.List<com.commercetools.api.models.shipping_method.ZoneRateDraft> zoneRates;

    private Boolean isDefault;

    private String predicate;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @JsonCreator
    ShippingMethodDraftImpl(@JsonProperty("key") final String key, @JsonProperty("name") final String name,
            @JsonProperty("description") final String description,
            @JsonProperty("localizedDescription") final com.commercetools.api.models.common.LocalizedString localizedDescription,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory,
            @JsonProperty("zoneRates") final java.util.List<com.commercetools.api.models.shipping_method.ZoneRateDraft> zoneRates,
            @JsonProperty("isDefault") final Boolean isDefault, @JsonProperty("predicate") final String predicate,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.localizedDescription = localizedDescription;
        this.taxCategory = taxCategory;
        this.zoneRates = zoneRates;
        this.isDefault = isDefault;
        this.predicate = predicate;
        this.custom = custom;
    }

    public ShippingMethodDraftImpl() {
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public com.commercetools.api.models.common.LocalizedString getLocalizedDescription() {
        return this.localizedDescription;
    }

    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    public java.util.List<com.commercetools.api.models.shipping_method.ZoneRateDraft> getZoneRates() {
        return this.zoneRates;
    }

    /**
    *  <p>If <code>true</code> the shipping method will be the default one in a project.</p>
    */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
    *  <p>A Cart predicate which can be used to more precisely select a shipping method for a cart.</p>
    */
    public String getPredicate() {
        return this.predicate;
    }

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setLocalizedDescription(
            final com.commercetools.api.models.common.LocalizedString localizedDescription) {
        this.localizedDescription = localizedDescription;
    }

    public void setTaxCategory(
            final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
    }

    public void setZoneRates(final com.commercetools.api.models.shipping_method.ZoneRateDraft... zoneRates) {
        this.zoneRates = new ArrayList<>(Arrays.asList(zoneRates));
    }

    public void setZoneRates(
            final java.util.List<com.commercetools.api.models.shipping_method.ZoneRateDraft> zoneRates) {
        this.zoneRates = zoneRates;
    }

    public void setIsDefault(final Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setPredicate(final String predicate) {
        this.predicate = predicate;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingMethodDraftImpl that = (ShippingMethodDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(name, that.name)
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
        return new HashCodeBuilder(17, 37).append(key)
                .append(name)
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
