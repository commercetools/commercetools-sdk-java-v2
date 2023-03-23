
package com.commercetools.api.models.product;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.review.ReviewRatingStatistics;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductProjection
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductProjection productProjection = ProductProjection.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .productType(productTypeBuilder -> productTypeBuilder)
 *             .name(nameBuilder -> nameBuilder)
 *             .slug(slugBuilder -> slugBuilder)
 *             .plusCategories(categoriesBuilder -> categoriesBuilder)
 *             .masterVariant(masterVariantBuilder -> masterVariantBuilder)
 *             .plusVariants(variantsBuilder -> variantsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductProjectionImpl.class)
public interface ProductProjection extends BaseResource, ProductDataLike, ProductProjectionMixin,
        com.commercetools.api.models.DomainResource<ProductProjection>, com.commercetools.api.models.WithKey {

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
     *  <p>User-defined unique identifier of the Product.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Date and time (UTC) the ProductProjection was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the ProductProjection was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>The ProductType defining the Attributes of the Product.</p>
     * @return productType
     */
    @NotNull
    @Valid
    @JsonProperty("productType")
    public ProductTypeReference getProductType();

    /**
     *  <p>Name of the Product.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Description of the Product.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product. Must be unique across a Project, but can be the same for Products in different locales. Matches the pattern <code>[a-zA-Z0-9_\-]{2,256}</code>. For good performance, indexes are provided for the first 15 <code>languages</code> set in the Project.</p>
     * @return slug
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>Categories assigned to the Product.</p>
     * @return categories
     */
    @NotNull
    @Valid
    @JsonProperty("categories")
    public List<CategoryReference> getCategories();

    /**
     *  <p>Order of Product in Categories.</p>
     * @return categoryOrderHints
     */
    @Valid
    @JsonProperty("categoryOrderHints")
    public CategoryOrderHints getCategoryOrderHints();

    /**
     *  <p>Title of the Product displayed in search results.</p>
     * @return metaTitle
     */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
     *  <p>Description of the Product displayed in search results below the meta title.</p>
     * @return metaDescription
     */
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    /**
     *  <p>Keywords that give additional information about the Product to search engines.</p>
     * @return metaKeywords
     */
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    /**
     *  <p>Used by Product Suggestions, but is also considered for a full text search.</p>
     * @return searchKeywords
     */
    @Valid
    @JsonProperty("searchKeywords")
    public SearchKeywords getSearchKeywords();

    /**
     *  <p><code>true</code> if the staged data is different from the current data.</p>
     * @return hasStagedChanges
     */

    @JsonProperty("hasStagedChanges")
    public Boolean getHasStagedChanges();

    /**
     *  <p><code>true</code> if the Product is published.</p>
     * @return published
     */

    @JsonProperty("published")
    public Boolean getPublished();

    /**
     *  <p>The Master Variant of the Product.</p>
     * @return masterVariant
     */
    @NotNull
    @Valid
    @JsonProperty("masterVariant")
    public ProductVariant getMasterVariant();

    /**
     *  <p>Additional Product Variants.</p>
     * @return variants
     */
    @NotNull
    @Valid
    @JsonProperty("variants")
    public List<ProductVariant> getVariants();

    /**
     *  <p>The TaxCategory of the Product.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryReference getTaxCategory();

    /**
     *  <p>State of the Product.</p>
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
     *  <p>Indicates whether the Prices of the Product Projection are embedded or standalone. Projecting Prices only works with <code>Embedded</code>, there is currently no support for <code>Standalone</code>.</p>
     * @return priceMode
     */

    @JsonProperty("priceMode")
    public ProductPriceModeEnum getPriceMode();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setKey(final String key);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setProductType(final ProductTypeReference productType);

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    public void setSlug(final LocalizedString slug);

    @JsonIgnore
    public void setCategories(final CategoryReference... categories);

    public void setCategories(final List<CategoryReference> categories);

    public void setCategoryOrderHints(final CategoryOrderHints categoryOrderHints);

    public void setMetaTitle(final LocalizedString metaTitle);

    public void setMetaDescription(final LocalizedString metaDescription);

    public void setMetaKeywords(final LocalizedString metaKeywords);

    public void setSearchKeywords(final SearchKeywords searchKeywords);

    public void setHasStagedChanges(final Boolean hasStagedChanges);

    public void setPublished(final Boolean published);

    public void setMasterVariant(final ProductVariant masterVariant);

    @JsonIgnore
    public void setVariants(final ProductVariant... variants);

    public void setVariants(final List<ProductVariant> variants);

    public void setTaxCategory(final TaxCategoryReference taxCategory);

    public void setState(final StateReference state);

    public void setReviewRatingStatistics(final ReviewRatingStatistics reviewRatingStatistics);

    public void setPriceMode(final ProductPriceModeEnum priceMode);

    public static ProductProjection of() {
        return new ProductProjectionImpl();
    }

    public static ProductProjection of(final ProductProjection template) {
        ProductProjectionImpl instance = new ProductProjectionImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setProductType(template.getProductType());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setSlug(template.getSlug());
        instance.setCategories(template.getCategories());
        instance.setCategoryOrderHints(template.getCategoryOrderHints());
        instance.setMetaTitle(template.getMetaTitle());
        instance.setMetaDescription(template.getMetaDescription());
        instance.setMetaKeywords(template.getMetaKeywords());
        instance.setSearchKeywords(template.getSearchKeywords());
        instance.setHasStagedChanges(template.getHasStagedChanges());
        instance.setPublished(template.getPublished());
        instance.setMasterVariant(template.getMasterVariant());
        instance.setVariants(template.getVariants());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setState(template.getState());
        instance.setReviewRatingStatistics(template.getReviewRatingStatistics());
        instance.setPriceMode(template.getPriceMode());
        return instance;
    }

    public static ProductProjectionBuilder builder() {
        return ProductProjectionBuilder.of();
    }

    public static ProductProjectionBuilder builder(final ProductProjection template) {
        return ProductProjectionBuilder.of(template);
    }

    default <T> T withProductProjection(Function<ProductProjection, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductProjection> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductProjection>() {
            @Override
            public String toString() {
                return "TypeReference<ProductProjection>";
            }
        };
    }
}
