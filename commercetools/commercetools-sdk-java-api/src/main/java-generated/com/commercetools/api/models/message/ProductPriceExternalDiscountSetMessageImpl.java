
package com.commercetools.api.models.message;

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
public class ProductPriceExternalDiscountSetMessageImpl implements ProductPriceExternalDiscountSetMessage, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private Long sequenceNumber;

    private com.commercetools.api.models.common.Reference resource;

    private Long resourceVersion;

    private String type;

    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    private Integer variantId;

    private String variantKey;

    private String sku;

    private String priceId;

    private com.commercetools.api.models.common.DiscountedPrice discounted;

    private Boolean staged;

    @JsonCreator
    ProductPriceExternalDiscountSetMessageImpl(@JsonProperty("id") final String id,
            @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("sequenceNumber") final Long sequenceNumber,
            @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource,
            @JsonProperty("resourceVersion") final Long resourceVersion,
            @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers,
            @JsonProperty("variantId") final Integer variantId, @JsonProperty("variantKey") final String variantKey,
            @JsonProperty("sku") final String sku, @JsonProperty("priceId") final String priceId,
            @JsonProperty("discounted") final com.commercetools.api.models.common.DiscountedPrice discounted,
            @JsonProperty("staged") final Boolean staged) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.sequenceNumber = sequenceNumber;
        this.resource = resource;
        this.resourceVersion = resourceVersion;
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        this.variantId = variantId;
        this.variantKey = variantKey;
        this.sku = sku;
        this.priceId = priceId;
        this.discounted = discounted;
        this.staged = staged;
        this.type = PRODUCT_PRICE_EXTERNAL_DISCOUNT_SET;
    }

    public ProductPriceExternalDiscountSetMessageImpl() {
        this.type = PRODUCT_PRICE_EXTERNAL_DISCOUNT_SET;
    }

    /**
    *  <p>Platform-generated unique identifier of the Message.</p>
    */
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

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    public Integer getVariantId() {
        return this.variantId;
    }

    public String getVariantKey() {
        return this.variantKey;
    }

    public String getSku() {
        return this.sku;
    }

    public String getPriceId() {
        return this.priceId;
    }

    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    public Boolean getStaged() {
        return this.staged;
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

    public void setSequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public void setResource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
    }

    public void setResourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public void setResourceUserProvidedIdentifiers(
            final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
    }

    public void setVariantId(final Integer variantId) {
        this.variantId = variantId;
    }

    public void setVariantKey(final String variantKey) {
        this.variantKey = variantKey;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setPriceId(final String priceId) {
        this.priceId = priceId;
    }

    public void setDiscounted(final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductPriceExternalDiscountSetMessageImpl that = (ProductPriceExternalDiscountSetMessageImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(sequenceNumber, that.sequenceNumber)
                .append(resource, that.resource)
                .append(resourceVersion, that.resourceVersion)
                .append(type, that.type)
                .append(resourceUserProvidedIdentifiers, that.resourceUserProvidedIdentifiers)
                .append(variantId, that.variantId)
                .append(variantKey, that.variantKey)
                .append(sku, that.sku)
                .append(priceId, that.priceId)
                .append(discounted, that.discounted)
                .append(staged, that.staged)
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
                .append(sequenceNumber)
                .append(resource)
                .append(resourceVersion)
                .append(type)
                .append(resourceUserProvidedIdentifiers)
                .append(variantId)
                .append(variantKey)
                .append(sku)
                .append(priceId)
                .append(discounted)
                .append(staged)
                .toHashCode();
    }

}
