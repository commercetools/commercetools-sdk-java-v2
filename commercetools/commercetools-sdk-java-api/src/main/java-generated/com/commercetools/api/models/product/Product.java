
package com.commercetools.api.models.product;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.review.ReviewRatingStatistics;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.commercetools.api.models.warning.WarningObject;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Product
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Product product = Product.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .productType(productTypeBuilder -> productTypeBuilder)
 *             .masterData(masterDataBuilder -> masterDataBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductImpl.class)
public interface Product extends BaseResource, ProductMixin, com.commercetools.api.models.DomainResource<Product>,
        com.commercetools.api.models.Referencable<Product>, com.commercetools.api.models.ResourceIdentifiable<Product>,
        com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the Product.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Product.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Product was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Product was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the Product.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the Product.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier of the Product.</p>
     *  <p>This is different from the <code>key</code> of a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The Product Type defining the Attributes of the Product. Cannot be changed.</p>
     * @return productType
     */
    @NotNull
    @Valid
    @JsonProperty("productType")
    public ProductTypeReference getProductType();

    /**
     *  <p>Contains the current and the staged representation of the product information.</p>
     * @return masterData
     */
    @NotNull
    @Valid
    @JsonProperty("masterData")
    public ProductCatalogData getMasterData();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> of the Product.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryReference getTaxCategory();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the Product.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>Review statistics of the Product.</p>
     * @return reviewRatingStatistics
     */
    @Valid
    @JsonProperty("reviewRatingStatistics")
    public ReviewRatingStatistics getReviewRatingStatistics();

    /**
     *  <p>Type of Price to be used when looking up a price for the Product.</p>
     * @return priceMode
     */

    @JsonProperty("priceMode")
    public ProductPriceModeEnum getPriceMode();

    /**
     *  <p>Warnings about processing of a request. Appears in response to requests with response status code <code>202 Accepted</code>.</p>
     * @return warnings
     */
    @Valid
    @JsonProperty("warnings")
    public List<WarningObject> getWarnings();

    /**
     *  <p>Unique identifier of the Product.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Product.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the Product was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the Product was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the Product.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the Product.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>User-defined unique identifier of the Product.</p>
     *  <p>This is different from the <code>key</code> of a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The Product Type defining the Attributes of the Product. Cannot be changed.</p>
     * @param productType value to be set
     */

    public void setProductType(final ProductTypeReference productType);

    /**
     *  <p>Contains the current and the staged representation of the product information.</p>
     * @param masterData value to be set
     */

    public void setMasterData(final ProductCatalogData masterData);

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> of the Product.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryReference taxCategory);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the Product.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     *  <p>Review statistics of the Product.</p>
     * @param reviewRatingStatistics value to be set
     */

    public void setReviewRatingStatistics(final ReviewRatingStatistics reviewRatingStatistics);

    /**
     *  <p>Type of Price to be used when looking up a price for the Product.</p>
     * @param priceMode value to be set
     */

    public void setPriceMode(final ProductPriceModeEnum priceMode);

    /**
     *  <p>Warnings about processing of a request. Appears in response to requests with response status code <code>202 Accepted</code>.</p>
     * @param warnings values to be set
     */

    @JsonIgnore
    public void setWarnings(final WarningObject... warnings);

    /**
     *  <p>Warnings about processing of a request. Appears in response to requests with response status code <code>202 Accepted</code>.</p>
     * @param warnings values to be set
     */

    public void setWarnings(final List<WarningObject> warnings);

    /**
     * factory method
     * @return instance of Product
     */
    public static Product of() {
        return new ProductImpl();
    }

    /**
     * factory method to create a shallow copy Product
     * @param template instance to be copied
     * @return copy instance
     */
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
        instance.setPriceMode(template.getPriceMode());
        instance.setWarnings(template.getWarnings());
        return instance;
    }

    public Product copyDeep();

    /**
     * factory method to create a deep copy of Product
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Product deepCopy(@Nullable final Product template) {
        if (template == null) {
            return null;
        }
        ProductImpl instance = new ProductImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setKey(template.getKey());
        instance.setProductType(
            com.commercetools.api.models.product_type.ProductTypeReference.deepCopy(template.getProductType()));
        instance.setMasterData(
            com.commercetools.api.models.product.ProductCatalogData.deepCopy(template.getMasterData()));
        instance.setTaxCategory(
            com.commercetools.api.models.tax_category.TaxCategoryReference.deepCopy(template.getTaxCategory()));
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        instance.setReviewRatingStatistics(
            com.commercetools.api.models.review.ReviewRatingStatistics.deepCopy(template.getReviewRatingStatistics()));
        instance.setPriceMode(template.getPriceMode());
        instance.setWarnings(Optional.ofNullable(template.getWarnings())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.warning.WarningObject::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for Product
     * @return builder
     */
    public static ProductBuilder builder() {
        return ProductBuilder.of();
    }

    /**
     * create builder for Product instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductBuilder builder(final Product template) {
        return ProductBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProduct(Function<Product, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.PRODUCT;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Product> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Product>() {
            @Override
            public String toString() {
                return "TypeReference<Product>";
            }
        };
    }
}
