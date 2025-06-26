
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Contains all the data of a Product and its Product Variants.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductData productData = ProductData.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .plusCategories(categoriesBuilder -> categoriesBuilder)
 *             .slug(slugBuilder -> slugBuilder)
 *             .masterVariant(masterVariantBuilder -> masterVariantBuilder)
 *             .plusVariants(variantsBuilder -> variantsBuilder)
 *             .searchKeywords(searchKeywordsBuilder -> searchKeywordsBuilder)
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDataImpl.class)
public interface ProductData extends ProductDataLike {

    /**
     *  <p>Name of the Product.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Categories assigned to the Product.</p>
     * @return categories
     */
    @NotNull
    @Valid
    @JsonProperty("categories")
    public List<CategoryReference> getCategories();

    /**
     *  <p>Numerical values to allow ordering of Products within a specified Category.</p>
     * @return categoryOrderHints
     */
    @Valid
    @JsonProperty("categoryOrderHints")
    public CategoryOrderHints getCategoryOrderHints();

    /**
     *  <p>Description of the Product.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product. Must be unique across a Project, but can be the same for Products in different Locales. Matches the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @return slug
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>Title of the Product as used by search engines.</p>
     * @return metaTitle
     */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
     *  <p>Description of the Product as used by search engines.</p>
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
     *  <p>Used by Product Suggestions, but is also considered for a full text search.</p>
     * @return searchKeywords
     */
    @NotNull
    @Valid
    @JsonProperty("searchKeywords")
    public SearchKeywords getSearchKeywords();

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @return attributes
     */
    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>Name of the Product.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Categories assigned to the Product.</p>
     * @param categories values to be set
     */

    @JsonIgnore
    public void setCategories(final CategoryReference... categories);

    /**
     *  <p>Categories assigned to the Product.</p>
     * @param categories values to be set
     */

    public void setCategories(final List<CategoryReference> categories);

    /**
     *  <p>Numerical values to allow ordering of Products within a specified Category.</p>
     * @param categoryOrderHints value to be set
     */

    public void setCategoryOrderHints(final CategoryOrderHints categoryOrderHints);

    /**
     *  <p>Description of the Product.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product. Must be unique across a Project, but can be the same for Products in different Locales. Matches the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>Title of the Product as used by search engines.</p>
     * @param metaTitle value to be set
     */

    public void setMetaTitle(final LocalizedString metaTitle);

    /**
     *  <p>Description of the Product as used by search engines.</p>
     * @param metaDescription value to be set
     */

    public void setMetaDescription(final LocalizedString metaDescription);

    /**
     *  <p>Keywords that give additional information about the Product to search engines.</p>
     * @param metaKeywords value to be set
     */

    public void setMetaKeywords(final LocalizedString metaKeywords);

    /**
     *  <p>The Master Variant of the Product.</p>
     * @param masterVariant value to be set
     */

    public void setMasterVariant(final ProductVariant masterVariant);

    /**
     *  <p>Additional Product Variants.</p>
     * @param variants values to be set
     */

    @JsonIgnore
    public void setVariants(final ProductVariant... variants);

    /**
     *  <p>Additional Product Variants.</p>
     * @param variants values to be set
     */

    public void setVariants(final List<ProductVariant> variants);

    /**
     *  <p>Used by Product Suggestions, but is also considered for a full text search.</p>
     * @param searchKeywords value to be set
     */

    public void setSearchKeywords(final SearchKeywords searchKeywords);

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<Attribute> attributes);

    /**
     * factory method
     * @return instance of ProductData
     */
    public static ProductData of() {
        return new ProductDataImpl();
    }

    /**
     * factory method to create a shallow copy ProductData
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductData of(final ProductData template) {
        ProductDataImpl instance = new ProductDataImpl();
        instance.setName(template.getName());
        instance.setCategories(template.getCategories());
        instance.setCategoryOrderHints(template.getCategoryOrderHints());
        instance.setDescription(template.getDescription());
        instance.setSlug(template.getSlug());
        instance.setMetaTitle(template.getMetaTitle());
        instance.setMetaDescription(template.getMetaDescription());
        instance.setMetaKeywords(template.getMetaKeywords());
        instance.setMasterVariant(template.getMasterVariant());
        instance.setVariants(template.getVariants());
        instance.setSearchKeywords(template.getSearchKeywords());
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    public ProductData copyDeep();

    /**
     * factory method to create a deep copy of ProductData
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductData deepCopy(@Nullable final ProductData template) {
        if (template == null) {
            return null;
        }
        ProductDataImpl instance = new ProductDataImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setCategories(Optional.ofNullable(template.getCategories())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.category.CategoryReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCategoryOrderHints(
            com.commercetools.api.models.product.CategoryOrderHints.deepCopy(template.getCategoryOrderHints()));
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setMetaTitle(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaTitle()));
        instance.setMetaDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaDescription()));
        instance.setMetaKeywords(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaKeywords()));
        instance.setMasterVariant(
            com.commercetools.api.models.product.ProductVariant.deepCopy(template.getMasterVariant()));
        instance.setVariants(Optional.ofNullable(template.getVariants())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product.ProductVariant::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setSearchKeywords(
            com.commercetools.api.models.product.SearchKeywords.deepCopy(template.getSearchKeywords()));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product.Attribute::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductData
     * @return builder
     */
    public static ProductDataBuilder builder() {
        return ProductDataBuilder.of();
    }

    /**
     * create builder for ProductData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDataBuilder builder(final ProductData template) {
        return ProductDataBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductData(Function<ProductData, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductData> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductData>() {
            @Override
            public String toString() {
                return "TypeReference<ProductData>";
            }
        };
    }
}
