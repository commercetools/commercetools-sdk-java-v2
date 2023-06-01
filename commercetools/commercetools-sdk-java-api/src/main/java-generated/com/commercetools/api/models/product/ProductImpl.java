package com.commercetools.api.models.product;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.product.ProductCatalogData;
import com.commercetools.api.models.product.ProductPriceModeEnum;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.review.ReviewRatingStatistics;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>An abstract sellable good with a set of Attributes defined by a Product Type. Products themselves are not sellable. Instead, they act as a parent structure for Product Variants. Each Product must have at least one Product Variant, which is called the Master Variant. A single Product representation contains the <em>current</em> and the <em>staged</em> representation of its product data.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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
    
    
    private com.commercetools.api.models.product.ProductPriceModeEnum priceMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("key") final String key, @JsonProperty("productType") final com.commercetools.api.models.product_type.ProductTypeReference productType, @JsonProperty("masterData") final com.commercetools.api.models.product.ProductCatalogData masterData, @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory, @JsonProperty("state") final com.commercetools.api.models.state.StateReference state, @JsonProperty("reviewRatingStatistics") final com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics, @JsonProperty("priceMode") final com.commercetools.api.models.product.ProductPriceModeEnum priceMode) {
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
        this.priceMode = priceMode;
    }
    /**
     * create empty instance
     */
    public ProductImpl() {
    }

    /**
     *  <p>Unique identifier of the Product.</p>
     */
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Current version of the Product.</p>
     */
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Date and time (UTC) the Product was initially created.</p>
     */
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    /**
     *  <p>Date and time (UTC) the Product was last updated.</p>
     */
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    /**
     *  <p>User-defined unique identifier of the Product.</p>
     *  <p>This is different from the <code>key</code> of a ProductVariant.</p>
     */
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>The Product Type defining the Attributes of the Product. Cannot be changed.</p>
     */
    
    public com.commercetools.api.models.product_type.ProductTypeReference getProductType(){
        return this.productType;
    }
    
    /**
     *  <p>Contains the current and the staged representation of the product information.</p>
     */
    
    public com.commercetools.api.models.product.ProductCatalogData getMasterData(){
        return this.masterData;
    }
    
    /**
     *  <p>The TaxCategory of the Product.</p>
     */
    
    public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory(){
        return this.taxCategory;
    }
    
    /**
     *  <p>State of the Product.</p>
     */
    
    public com.commercetools.api.models.state.StateReference getState(){
        return this.state;
    }
    
    /**
     *  <p>Review statistics of the Product.</p>
     */
    
    public com.commercetools.api.models.review.ReviewRatingStatistics getReviewRatingStatistics(){
        return this.reviewRatingStatistics;
    }
    
    /**
     *  <p>Type of Price to be used when looking up a price for the Product.</p>
     */
    
    public com.commercetools.api.models.product.ProductPriceModeEnum getPriceMode(){
        return this.priceMode;
    }

    
    public void setId(final String id){
        this.id = id;
    }
    
    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    
    public void setCreatedAt(final java.time.ZonedDateTime createdAt){
        this.createdAt = createdAt;
    }
    
    
    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
        this.lastModifiedAt = lastModifiedAt;
    }
    
    
    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
        this.lastModifiedBy = lastModifiedBy;
    }
    
    
    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy){
        this.createdBy = createdBy;
    }
    
    
    public void setKey(final String key){
        this.key = key;
    }
    
    
    public void setProductType(final com.commercetools.api.models.product_type.ProductTypeReference productType){
        this.productType = productType;
    }
    
    
    public void setMasterData(final com.commercetools.api.models.product.ProductCatalogData masterData){
        this.masterData = masterData;
    }
    
    
    public void setTaxCategory(final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory){
        this.taxCategory = taxCategory;
    }
    
    
    public void setState(final com.commercetools.api.models.state.StateReference state){
        this.state = state;
    }
    
    
    public void setReviewRatingStatistics(final com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics){
        this.reviewRatingStatistics = reviewRatingStatistics;
    }
    
    
    public void setPriceMode(final com.commercetools.api.models.product.ProductPriceModeEnum priceMode){
        this.priceMode = priceMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductImpl that = (ProductImpl) o;
    
        return new EqualsBuilder()
                .append(id, that.id)
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
                .append(priceMode, that.priceMode)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(id)
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
            .append(priceMode)
            .toHashCode();
    }

}
