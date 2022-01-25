
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StoreImpl implements Store, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    private java.util.List<String> languages;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> distributionChannels;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> supplyChannels;

    private java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> productSelections;

    private com.commercetools.api.models.type.CustomFields custom;

    @JsonCreator
    StoreImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("languages") final java.util.List<String> languages,
            @JsonProperty("distributionChannels") final java.util.List<com.commercetools.api.models.channel.ChannelReference> distributionChannels,
            @JsonProperty("supplyChannels") final java.util.List<com.commercetools.api.models.channel.ChannelReference> supplyChannels,
            @JsonProperty("productSelections") final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> productSelections,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.key = key;
        this.name = name;
        this.languages = languages;
        this.distributionChannels = distributionChannels;
        this.supplyChannels = supplyChannels;
        this.productSelections = productSelections;
        this.custom = custom;
    }

    public StoreImpl() {
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

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
    *  <p>User-specific unique identifier for the store.
    *  The <code>key</code> is mandatory and immutable.
    *  It is used to reference the store.</p>
    */
    public String getKey() {
        return this.key;
    }

    /**
    *  <p>The name of the store</p>
    */
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    /**
    *  <p>Set of References to a Channel with <code>ProductDistribution</code> role</p>
    */
    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getDistributionChannels() {
        return this.distributionChannels;
    }

    /**
    *  <p>Set of ResourceIdentifiers of Channels with <code>InventorySupply</code> role</p>
    */
    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getSupplyChannels() {
        return this.supplyChannels;
    }

    /**
    *  <p>Set of References to Product Selections along with settings.
    *  If <code>productSelections</code> is empty all products in the project are available in this Store.
    *  If <code>productSelections</code> is not empty but there exists no <code>active</code> Product Selection then no Product is available in this Store.</p>
    */
    public java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> getProductSelections() {
        return this.productSelections;
    }

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

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setLanguages(final String... languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
    }

    public void setLanguages(final java.util.List<String> languages) {
        this.languages = languages;
    }

    public void setDistributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... distributionChannels) {
        this.distributionChannels = new ArrayList<>(Arrays.asList(distributionChannels));
    }

    public void setDistributionChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> distributionChannels) {
        this.distributionChannels = distributionChannels;
    }

    public void setSupplyChannels(final com.commercetools.api.models.channel.ChannelReference... supplyChannels) {
        this.supplyChannels = new ArrayList<>(Arrays.asList(supplyChannels));
    }

    public void setSupplyChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> supplyChannels) {
        this.supplyChannels = supplyChannels;
    }

    public void setProductSelections(
            final com.commercetools.api.models.store.ProductSelectionSetting... productSelections) {
        this.productSelections = new ArrayList<>(Arrays.asList(productSelections));
    }

    public void setProductSelections(
            final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> productSelections) {
        this.productSelections = productSelections;
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

        StoreImpl that = (StoreImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(key, that.key)
                .append(name, that.name)
                .append(languages, that.languages)
                .append(distributionChannels, that.distributionChannels)
                .append(supplyChannels, that.supplyChannels)
                .append(productSelections, that.productSelections)
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
                .append(languages)
                .append(distributionChannels)
                .append(supplyChannels)
                .append(productSelections)
                .append(custom)
                .toHashCode();
    }

}
