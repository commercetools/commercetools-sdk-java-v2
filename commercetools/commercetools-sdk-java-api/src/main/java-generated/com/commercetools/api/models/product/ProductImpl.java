
package com.commercetools.api.models.product;

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
public class ProductImpl implements Product, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    private com.commercetools.api.models.product_type.ProductTypeReference productType;

    private com.commercetools.api.models.product.ProductCatalogData masterData;

    private com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory;

    private com.commercetools.api.models.state.StateReference state;

    private com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics;

    @JsonCreator
    ProductImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("key") final String key,
            @JsonProperty("productType") final com.commercetools.api.models.product_type.ProductTypeReference productType,
            @JsonProperty("masterData") final com.commercetools.api.models.product.ProductCatalogData masterData,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory,
            @JsonProperty("state") final com.commercetools.api.models.state.StateReference state,
            @JsonProperty("reviewRatingStatistics") final com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.key = key;
        this.productType = productType;
        this.masterData = masterData;
        this.taxCategory = taxCategory;
        this.state = state;
        this.reviewRatingStatistics = reviewRatingStatistics;
    }

    public ProductImpl() {
    }

    /**
    *  <p>Platform-generated unique identifier of the Product.</p>
    */
    public String getId() {
        return this.id;
    }

    /**
    *  <p>The current version of the product.</p>
    */
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
    *  <p>User-defined unique identifier of the Product.
    *  <em>Product keys are different from ProductVariant keys.</em></p>
    */
    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.product_type.ProductTypeReference getProductType() {
        return this.productType;
    }

    /**
    *  <p>The product data in the master catalog.</p>
    */
    public com.commercetools.api.models.product.ProductCatalogData getMasterData() {
        return this.masterData;
    }

    public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory() {
        return this.taxCategory;
    }

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
    *  <p>Statistics about the review ratings taken into account for this product.</p>
    */
    public com.commercetools.api.models.review.ReviewRatingStatistics getReviewRatingStatistics() {
        return this.reviewRatingStatistics;
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

    public void setProductType(final com.commercetools.api.models.product_type.ProductTypeReference productType) {
        this.productType = productType;
    }

    public void setMasterData(final com.commercetools.api.models.product.ProductCatalogData masterData) {
        this.masterData = masterData;
    }

    public void setTaxCategory(final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory) {
        this.taxCategory = taxCategory;
    }

    public void setState(final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
    }

    public void setReviewRatingStatistics(
            final com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics) {
        this.reviewRatingStatistics = reviewRatingStatistics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductImpl that = (ProductImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(key, that.key)
                .append(productType, that.productType)
                .append(masterData, that.masterData)
                .append(taxCategory, that.taxCategory)
                .append(state, that.state)
                .append(reviewRatingStatistics, that.reviewRatingStatistics)
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
                .append(productType)
                .append(masterData)
                .append(taxCategory)
                .append(state)
                .append(reviewRatingStatistics)
                .toHashCode();
    }

}
