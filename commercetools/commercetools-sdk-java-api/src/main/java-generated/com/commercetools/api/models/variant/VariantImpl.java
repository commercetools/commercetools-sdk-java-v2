
package com.commercetools.api.models.variant;

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
 *  <p>A Variant represents a single Variant with both current (published) and staged (draft) data. Variants are writable resources that support create, update, and delete operations.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantImpl implements Variant, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    private Integer variantId;

    private com.commercetools.api.models.product.ProductReference product;

    private Boolean published;

    private com.commercetools.api.models.variant.VariantData current;

    private com.commercetools.api.models.variant.VariantData staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("key") final String key, @JsonProperty("variantId") final Integer variantId,
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product,
            @JsonProperty("published") final Boolean published,
            @JsonProperty("current") final com.commercetools.api.models.variant.VariantData current,
            @JsonProperty("staged") final com.commercetools.api.models.variant.VariantData staged) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.key = key;
        this.variantId = variantId;
        this.product = product;
        this.published = published;
        this.current = current;
        this.staged = staged;
    }

    /**
     * create empty instance
     */
    public VariantImpl() {
    }

    /**
     *  <p>Unique identifier of the Variant.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Variant.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Variant was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Variant was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the Variant.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Variant.</p>
     */

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>User-defined unique identifier of the Variant. This is different from <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> <code>key</code>.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>A unique, sequential identifier of the Variant within the parent Product.</p>
     */

    public Integer getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Reference to the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Variant belongs to.</p>
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p><code>true</code> if the Variant is published, <code>false</code> if it is unpublished.</p>
     */

    public Boolean getPublished() {
        return this.published;
    }

    /**
     *  <p>The current data of the Variant.</p>
     */

    public com.commercetools.api.models.variant.VariantData getCurrent() {
        return this.current;
    }

    /**
     *  <p>The staged data of the Variant. Only present if there are staged changes that differ from the current data.</p>
     */

    public com.commercetools.api.models.variant.VariantData getStaged() {
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

    public void setKey(final String key) {
        this.key = key;
    }

    public void setVariantId(final Integer variantId) {
        this.variantId = variantId;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
    }

    public void setPublished(final Boolean published) {
        this.published = published;
    }

    public void setCurrent(final com.commercetools.api.models.variant.VariantData current) {
        this.current = current;
    }

    public void setStaged(final com.commercetools.api.models.variant.VariantData staged) {
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantImpl that = (VariantImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(key, that.key)
                .append(variantId, that.variantId)
                .append(product, that.product)
                .append(published, that.published)
                .append(current, that.current)
                .append(staged, that.staged)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(key, that.key)
                .append(variantId, that.variantId)
                .append(product, that.product)
                .append(published, that.published)
                .append(current, that.current)
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
                .append(key)
                .append(variantId)
                .append(product)
                .append(published)
                .append(current)
                .append(staged)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .append("lastModifiedBy", lastModifiedBy)
                .append("createdBy", createdBy)
                .append("key", key)
                .append("variantId", variantId)
                .append("product", product)
                .append("published", published)
                .append("current", current)
                .append("staged", staged)
                .build();
    }

    @Override
    public Variant copyDeep() {
        return Variant.deepCopy(this);
    }
}
