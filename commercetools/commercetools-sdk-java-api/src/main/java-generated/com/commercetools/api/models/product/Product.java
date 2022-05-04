
package com.commercetools.api.models.product;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.review.ReviewRatingStatistics;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductImpl.class)
public interface Product extends BaseResource, com.commercetools.api.models.DomainResource<Product>,
        com.commercetools.api.models.Referencable<Product>, com.commercetools.api.models.ResourceIdentifiable<Product> {

    /**
    *  <p>Platform-generated unique identifier of the Product.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>The current version of the product.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
    *  <p>User-defined unique identifier of the Product.
    *  <em>Product keys are different from ProductVariant keys.</em></p>
    */

    @JsonProperty("key")
    public String getKey();

    @NotNull
    @Valid
    @JsonProperty("productType")
    public ProductTypeReference getProductType();

    /**
    *  <p>The product data in the master catalog.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("masterData")
    public ProductCatalogData getMasterData();

    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryReference getTaxCategory();

    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
    *  <p>Statistics about the review ratings taken into account for this product.</p>
    */
    @Valid
    @JsonProperty("reviewRatingStatistics")
    public ReviewRatingStatistics getReviewRatingStatistics();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setKey(final String key);

    public void setProductType(final ProductTypeReference productType);

    public void setMasterData(final ProductCatalogData masterData);

    public void setTaxCategory(final TaxCategoryReference taxCategory);

    public void setState(final StateReference state);

    public void setReviewRatingStatistics(final ReviewRatingStatistics reviewRatingStatistics);

    public static Product of() {
        return new ProductImpl();
    }

    public static Product of(final Product template) {
        ProductImpl instance = new ProductImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setProductType(template.getProductType());
        instance.setMasterData(template.getMasterData());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setState(template.getState());
        instance.setReviewRatingStatistics(template.getReviewRatingStatistics());
        return instance;
    }

    public static ProductBuilder builder() {
        return ProductBuilder.of();
    }

    public static ProductBuilder builder(final Product template) {
        return ProductBuilder.of(template);
    }

    default <T> T withProduct(Function<Product, T> helper) {
        return helper.apply(this);
    }

    @Override
    public default com.commercetools.api.models.common.ResourceIdentifier toResourceIdentifier() {
        return com.commercetools.api.models.product.ProductResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default com.commercetools.api.models.common.Reference toReference() {
        return com.commercetools.api.models.product.ProductReference.builder().id(getId()).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Product> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Product>() {
            @Override
            public String toString() {
                return "TypeReference<Product>";
            }
        };
    }
}
