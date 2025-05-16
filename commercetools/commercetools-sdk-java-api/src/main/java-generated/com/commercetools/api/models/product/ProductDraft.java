
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.category.CategoryResourceIdentifier;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_type.ProductTypeResourceIdentifier;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ProductDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDraft productDraft = ProductDraft.builder()
 *             .productType(productTypeBuilder -> productTypeBuilder)
 *             .name(nameBuilder -> nameBuilder)
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDraftImpl.class)
public interface ProductDraft
        extends com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<ProductDraft> {

    /**
     *  <p>The Product Type defining the Attributes for the Product. Cannot be changed later.</p>
     * @return productType
     */
    @NotNull
    @Valid
    @JsonProperty("productType")
    public ProductTypeResourceIdentifier getProductType();

    /**
     *  <p>Name of the Product.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product. It must be unique across a Project, but a Product can have the same slug in different Locales. It must match the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @return slug
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>User-defined unique identifier for the Product.</p>
     *  <p>This field is optional for backwards compatibility reasons, but we strongly recommend setting it. Keys are mandatory for importing Products with the Import API and the Merchant Center.</p>
     *  <p>To update a Product using the Import API or Merchant Center, the Product <code>key</code> must match the pattern <code>^[A-Za-z0-9_-]{2,256}$</code>.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Description of the Product.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Categories assigned to the Product.</p>
     * @return categories
     */
    @Valid
    @JsonProperty("categories")
    public List<CategoryResourceIdentifier> getCategories();

    /**
     *  <p>Numerical values to allow ordering of Products within specified Categories. If the referenced Categories are not also assigned in the <code>categories</code> field, an InvalidOperation error is returned.</p>
     * @return categoryOrderHints
     */
    @Valid
    @JsonProperty("categoryOrderHints")
    public CategoryOrderHints getCategoryOrderHints();

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
     *  <p>The Product Variant to be the Master Variant for the Product. Required if <code>variants</code> are provided also.</p>
     * @return masterVariant
     */
    @Valid
    @JsonProperty("masterVariant")
    public ProductVariantDraft getMasterVariant();

    /**
     *  <p>The additional Product Variants for the Product.</p>
     * @return variants
     */
    @Valid
    @JsonProperty("variants")
    public List<ProductVariantDraft> getVariants();

    /**
     *  <p>The Tax Category to be assigned to the Product.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <p>Used by Product Suggestions, but is also considered for a full text search.</p>
     * @return searchKeywords
     */
    @Valid
    @JsonProperty("searchKeywords")
    public SearchKeywords getSearchKeywords();

    /**
     *  <p>State to be assigned to the Product.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
     *  <p>If <code>true</code>, the Product is published immediately to the current projection.</p>
     * @return publish
     */

    @JsonProperty("publish")
    public Boolean getPublish();

    /**
     *  <p>Specifies the type of prices used when looking up a price for the Product.</p>
     * @return priceMode
     */

    @JsonProperty("priceMode")
    public ProductPriceModeEnum getPriceMode();

    /**
     *  <p>The Product Type defining the Attributes for the Product. Cannot be changed later.</p>
     * @param productType value to be set
     */

    public void setProductType(final ProductTypeResourceIdentifier productType);

    /**
     *  <p>Name of the Product.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product. It must be unique across a Project, but a Product can have the same slug in different Locales. It must match the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>User-defined unique identifier for the Product.</p>
     *  <p>This field is optional for backwards compatibility reasons, but we strongly recommend setting it. Keys are mandatory for importing Products with the Import API and the Merchant Center.</p>
     *  <p>To update a Product using the Import API or Merchant Center, the Product <code>key</code> must match the pattern <code>^[A-Za-z0-9_-]{2,256}$</code>.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Description of the Product.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Categories assigned to the Product.</p>
     * @param categories values to be set
     */

    @JsonIgnore
    public void setCategories(final CategoryResourceIdentifier... categories);

    /**
     *  <p>Categories assigned to the Product.</p>
     * @param categories values to be set
     */

    public void setCategories(final List<CategoryResourceIdentifier> categories);

    /**
     *  <p>Numerical values to allow ordering of Products within specified Categories. If the referenced Categories are not also assigned in the <code>categories</code> field, an InvalidOperation error is returned.</p>
     * @param categoryOrderHints value to be set
     */

    public void setCategoryOrderHints(final CategoryOrderHints categoryOrderHints);

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
     *  <p>The Product Variant to be the Master Variant for the Product. Required if <code>variants</code> are provided also.</p>
     * @param masterVariant value to be set
     */

    public void setMasterVariant(final ProductVariantDraft masterVariant);

    /**
     *  <p>The additional Product Variants for the Product.</p>
     * @param variants values to be set
     */

    @JsonIgnore
    public void setVariants(final ProductVariantDraft... variants);

    /**
     *  <p>The additional Product Variants for the Product.</p>
     * @param variants values to be set
     */

    public void setVariants(final List<ProductVariantDraft> variants);

    /**
     *  <p>The Tax Category to be assigned to the Product.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    /**
     *  <p>Used by Product Suggestions, but is also considered for a full text search.</p>
     * @param searchKeywords value to be set
     */

    public void setSearchKeywords(final SearchKeywords searchKeywords);

    /**
     *  <p>State to be assigned to the Product.</p>
     * @param state value to be set
     */

    public void setState(final StateResourceIdentifier state);

    /**
     *  <p>If <code>true</code>, the Product is published immediately to the current projection.</p>
     * @param publish value to be set
     */

    public void setPublish(final Boolean publish);

    /**
     *  <p>Specifies the type of prices used when looking up a price for the Product.</p>
     * @param priceMode value to be set
     */

    public void setPriceMode(final ProductPriceModeEnum priceMode);

    /**
     * factory method
     * @return instance of ProductDraft
     */
    public static ProductDraft of() {
        return new ProductDraftImpl();
    }

    /**
     * factory method to create a shallow copy ProductDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDraft of(final ProductDraft template) {
        ProductDraftImpl instance = new ProductDraftImpl();
        instance.setProductType(template.getProductType());
        instance.setName(template.getName());
        instance.setSlug(template.getSlug());
        instance.setKey(template.getKey());
        instance.setDescription(template.getDescription());
        instance.setCategories(template.getCategories());
        instance.setCategoryOrderHints(template.getCategoryOrderHints());
        instance.setMetaTitle(template.getMetaTitle());
        instance.setMetaDescription(template.getMetaDescription());
        instance.setMetaKeywords(template.getMetaKeywords());
        instance.setMasterVariant(template.getMasterVariant());
        instance.setVariants(template.getVariants());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setSearchKeywords(template.getSearchKeywords());
        instance.setState(template.getState());
        instance.setPublish(template.getPublish());
        instance.setPriceMode(template.getPriceMode());
        return instance;
    }

    public ProductDraft copyDeep();

    /**
     * factory method to create a deep copy of ProductDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDraft deepCopy(@Nullable final ProductDraft template) {
        if (template == null) {
            return null;
        }
        ProductDraftImpl instance = new ProductDraftImpl();
        instance.setProductType(com.commercetools.api.models.product_type.ProductTypeResourceIdentifier
                .deepCopy(template.getProductType()));
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setKey(template.getKey());
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setCategories(Optional.ofNullable(template.getCategories())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.category.CategoryResourceIdentifier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCategoryOrderHints(
            com.commercetools.api.models.product.CategoryOrderHints.deepCopy(template.getCategoryOrderHints()));
        instance.setMetaTitle(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaTitle()));
        instance.setMetaDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaDescription()));
        instance.setMetaKeywords(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaKeywords()));
        instance.setMasterVariant(
            com.commercetools.api.models.product.ProductVariantDraft.deepCopy(template.getMasterVariant()));
        instance.setVariants(Optional.ofNullable(template.getVariants())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product.ProductVariantDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTaxCategory(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier
                .deepCopy(template.getTaxCategory()));
        instance.setSearchKeywords(
            com.commercetools.api.models.product.SearchKeywords.deepCopy(template.getSearchKeywords()));
        instance.setState(com.commercetools.api.models.state.StateResourceIdentifier.deepCopy(template.getState()));
        instance.setPublish(template.getPublish());
        instance.setPriceMode(template.getPriceMode());
        return instance;
    }

    /**
     * builder factory method for ProductDraft
     * @return builder
     */
    public static ProductDraftBuilder builder() {
        return ProductDraftBuilder.of();
    }

    /**
     * create builder for ProductDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDraftBuilder builder(final ProductDraft template) {
        return ProductDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDraft(Function<ProductDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDraft>";
            }
        };
    }
}
