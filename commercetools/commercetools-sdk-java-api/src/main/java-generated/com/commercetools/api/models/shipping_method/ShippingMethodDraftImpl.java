
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 * ShippingMethodDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodDraftImpl implements ShippingMethodDraft, ModelBase {

    private String key;

    private String name;

    private com.commercetools.api.models.common.LocalizedString localizedName;

    @Deprecated
    private String description;

    private com.commercetools.api.models.common.LocalizedString localizedDescription;

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    private java.util.List<com.commercetools.api.models.shipping_method.ZoneRateDraft> zoneRates;

    private Boolean active;

    private Boolean isDefault;

    private String predicate;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    private String carrier;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingMethodDraftImpl(@JsonProperty("key") final String key, @JsonProperty("name") final String name,
            @JsonProperty("localizedName") final com.commercetools.api.models.common.LocalizedString localizedName,
            @JsonProperty("description") final String description,
            @JsonProperty("localizedDescription") final com.commercetools.api.models.common.LocalizedString localizedDescription,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory,
            @JsonProperty("zoneRates") final java.util.List<com.commercetools.api.models.shipping_method.ZoneRateDraft> zoneRates,
            @JsonProperty("active") final Boolean active, @JsonProperty("isDefault") final Boolean isDefault,
            @JsonProperty("predicate") final String predicate,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores,
            @JsonProperty("carrier") final String carrier) {
        this.key = key;
        this.name = name;
        this.localizedName = localizedName;
        this.description = description;
        this.localizedDescription = localizedDescription;
        this.taxCategory = taxCategory;
        this.zoneRates = zoneRates;
        this.active = active;
        this.isDefault = isDefault;
        this.predicate = predicate;
        this.custom = custom;
        this.stores = stores;
        this.carrier = carrier;
    }

    /**
     * create empty instance
     */
    public ShippingMethodDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier for the ShippingMethod.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Unique name for the ShippingMethod within a <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> for all ZoneRates of the ShippingMethod.</p>
     */

    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>Defines <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRate" rel="nofollow">ShippingRates</a> (prices) for specific zones.</p>
     */

    public java.util.List<com.commercetools.api.models.shipping_method.ZoneRateDraft> getZoneRates() {
        return this.zoneRates;
    }

    /**
     *  <p>Whether the ShippingMethod can be used during the creation or update of a Cart or Order.</p>
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     *  <p>Whether the ShippingMethod will be the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>'s default ShippingMethod. When retrieving <span>matching Shipping Methods</span>, it is returned as the first item in the array. This flag does not automatically apply the Shipping Method to Carts.</p>
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     *  <p>Valid <span>Cart predicate</span> to select a ShippingMethod for a Cart.</p>
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     *  <p>Custom Fields for the ShippingMethod.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <ul>
     *   <li>If defined and not empty, the Shipping Method applies to <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> with a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that matches any Store in this field.</li>
     *   <li>If not defined or empty, the Shipping Method applies to all Carts, irrespective of a Store.</li>
     *  </ul>
     *  <p>If the number of referenced Stores exceeds the <span>Stores per Shipping Method limit</span>, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
     */

    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    /**
     *  <p>Name of the carrier that delivers the parcel, for example <code>DHL</code>.</p>
     */

    public String getCarrier() {
        return this.carrier;
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

    public void setActive(final Boolean active) {
        this.active = active;
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

    public void setStores(final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
    }

    public void setStores(final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
    }

    public void setCarrier(final String carrier) {
        this.carrier = carrier;
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
                .append(localizedName, that.localizedName)
                .append(description, that.description)
                .append(localizedDescription, that.localizedDescription)
                .append(taxCategory, that.taxCategory)
                .append(zoneRates, that.zoneRates)
                .append(active, that.active)
                .append(isDefault, that.isDefault)
                .append(predicate, that.predicate)
                .append(custom, that.custom)
                .append(stores, that.stores)
                .append(carrier, that.carrier)
                .append(key, that.key)
                .append(name, that.name)
                .append(localizedName, that.localizedName)
                .append(description, that.description)
                .append(localizedDescription, that.localizedDescription)
                .append(taxCategory, that.taxCategory)
                .append(zoneRates, that.zoneRates)
                .append(active, that.active)
                .append(isDefault, that.isDefault)
                .append(predicate, that.predicate)
                .append(custom, that.custom)
                .append(stores, that.stores)
                .append(carrier, that.carrier)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(name)
                .append(localizedName)
                .append(description)
                .append(localizedDescription)
                .append(taxCategory)
                .append(zoneRates)
                .append(active)
                .append(isDefault)
                .append(predicate)
                .append(custom)
                .append(stores)
                .append(carrier)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("name", name)
                .append("localizedName", localizedName)
                .append("description", description)
                .append("localizedDescription", localizedDescription)
                .append("taxCategory", taxCategory)
                .append("zoneRates", zoneRates)
                .append("active", active)
                .append("isDefault", isDefault)
                .append("predicate", predicate)
                .append("custom", custom)
                .append("stores", stores)
                .append("carrier", carrier)
                .build();
    }

    @Override
    public ShippingMethodDraft copyDeep() {
        return ShippingMethodDraft.deepCopy(this);
    }
}
