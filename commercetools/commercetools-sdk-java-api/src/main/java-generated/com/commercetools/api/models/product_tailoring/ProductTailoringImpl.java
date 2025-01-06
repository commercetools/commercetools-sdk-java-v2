
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>A single ProductTailoring representation contains the <em>current</em> and the <em>staged</em> representation of its product data tailored per Store.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringImpl implements ProductTailoring, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    private com.commercetools.api.models.store.StoreKeyReference store;

    private com.commercetools.api.models.product.ProductReference product;

    private Boolean published;

    private com.commercetools.api.models.product_tailoring.ProductTailoringData current;

    private com.commercetools.api.models.product_tailoring.ProductTailoringData staged;

    private Boolean hasStagedChanges;

    private java.util.List<com.commercetools.api.models.warning.WarningObject> warnings;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTailoringImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("key") final String key,
            @JsonProperty("store") final com.commercetools.api.models.store.StoreKeyReference store,
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product,
            @JsonProperty("published") final Boolean published,
            @JsonProperty("current") final com.commercetools.api.models.product_tailoring.ProductTailoringData current,
            @JsonProperty("staged") final com.commercetools.api.models.product_tailoring.ProductTailoringData staged,
            @JsonProperty("hasStagedChanges") final Boolean hasStagedChanges,
            @JsonProperty("warnings") final java.util.List<com.commercetools.api.models.warning.WarningObject> warnings) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.key = key;
        this.store = store;
        this.product = product;
        this.published = published;
        this.current = current;
        this.staged = staged;
        this.hasStagedChanges = hasStagedChanges;
        this.warnings = warnings;
    }

    /**
     * create empty instance
     */
    public ProductTailoringImpl() {
    }

    /**
     *  <p>Unique identifier of the ProductTailoring.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the ProductTailoring.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the ProductTailoring was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the ProductTailoring was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the ProductTailoring.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the ProductTailoring.</p>
     */

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>User-defined unique identifier of the ProductTailoring.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The Store to which the ProductTailoring belongs.</p>
     */

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p>Reference to the Product the ProductTailoring belongs to.</p>
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p><code>true</code> if the ProductTailoring is published.</p>
     */

    public Boolean getPublished() {
        return this.published;
    }

    /**
     *  <p>Current (published) data of the ProductTailoring.</p>
     */

    public com.commercetools.api.models.product_tailoring.ProductTailoringData getCurrent() {
        return this.current;
    }

    /**
     *  <p>Staged (unpublished) data of the ProductTailoring.</p>
     */

    public com.commercetools.api.models.product_tailoring.ProductTailoringData getStaged() {
        return this.staged;
    }

    /**
     *  <p><code>true</code> if the <code>staged</code> data is different from the <code>current</code> data.</p>
     */

    public Boolean getHasStagedChanges() {
        return this.hasStagedChanges;
    }

    /**
     *  <p>Warnings about processing of a request. Appears in response to requests with response status code <code>202 Accepted</code>.</p>
     */

    public java.util.List<com.commercetools.api.models.warning.WarningObject> getWarnings() {
        return this.warnings;
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

    public void setStore(final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
    }

    public void setPublished(final Boolean published) {
        this.published = published;
    }

    public void setCurrent(final com.commercetools.api.models.product_tailoring.ProductTailoringData current) {
        this.current = current;
    }

    public void setStaged(final com.commercetools.api.models.product_tailoring.ProductTailoringData staged) {
        this.staged = staged;
    }

    public void setHasStagedChanges(final Boolean hasStagedChanges) {
        this.hasStagedChanges = hasStagedChanges;
    }

    public void setWarnings(final com.commercetools.api.models.warning.WarningObject... warnings) {
        this.warnings = new ArrayList<>(Arrays.asList(warnings));
    }

    public void setWarnings(final java.util.List<com.commercetools.api.models.warning.WarningObject> warnings) {
        this.warnings = warnings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTailoringImpl that = (ProductTailoringImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(key, that.key)
                .append(store, that.store)
                .append(product, that.product)
                .append(published, that.published)
                .append(current, that.current)
                .append(staged, that.staged)
                .append(hasStagedChanges, that.hasStagedChanges)
                .append(warnings, that.warnings)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(key, that.key)
                .append(store, that.store)
                .append(product, that.product)
                .append(published, that.published)
                .append(current, that.current)
                .append(staged, that.staged)
                .append(hasStagedChanges, that.hasStagedChanges)
                .append(warnings, that.warnings)
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
                .append(store)
                .append(product)
                .append(published)
                .append(current)
                .append(staged)
                .append(hasStagedChanges)
                .append(warnings)
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
                .append("store", store)
                .append("product", product)
                .append("published", published)
                .append("current", current)
                .append("staged", staged)
                .append("hasStagedChanges", hasStagedChanges)
                .append("warnings", warnings)
                .build();
    }

}
