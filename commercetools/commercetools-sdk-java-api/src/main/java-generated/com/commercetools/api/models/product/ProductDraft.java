
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.category.CategoryResourceIdentifier;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_type.ProductTypeResourceIdentifier;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     */
    @NotNull
    @Valid
    @JsonProperty("productType")
    public ProductTypeResourceIdentifier getProductType();

    /**
     *  <p>Name of the Product.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product. It must be unique across a Project, but a Product can have the same slug in different Locales. It must match the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>User-defined unique identifier for the Product.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Description of the Product.</p>
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Categories assigned to the Product.</p>
     */
    @Valid
    @JsonProperty("categories")
    public List<CategoryResourceIdentifier> getCategories();

    /**
     *  <p>Numerical values to allow ordering of Products within a specified Category.</p>
     */
    @Valid
    @JsonProperty("categoryOrderHints")
    public CategoryOrderHints getCategoryOrderHints();

    /**
     *  <p>Title of the Product displayed in search results.</p>
     */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
     *  <p>Description of the Product displayed in search results.</p>
     */
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    /**
     *  <p>Keywords that give additional information about the Product to search engines.</p>
     */
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    /**
     *  <p>The Product Variant to be the Master Variant for the Product. Required if <code>variants</code> are provided also.</p>
     */
    @Valid
    @JsonProperty("masterVariant")
    public ProductVariantDraft getMasterVariant();

    /**
     *  <p>The additional Product Variants for the Product.</p>
     */
    @Valid
    @JsonProperty("variants")
    public List<ProductVariantDraft> getVariants();

    /**
     *  <p>The Tax Category to be assigned to the Product.</p>
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <p>Used by Product Suggestions, but is also considered for a full text search.</p>
     */
    @Valid
    @JsonProperty("searchKeywords")
    public SearchKeywords getSearchKeywords();

    /**
     *  <p>State to be assigned to the Product.</p>
     */
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
     *  <p>If <code>true</code>, the Product is published immediately to the current projection.</p>
     */

    @JsonProperty("publish")
    public Boolean getPublish();

    /**
     *  <p>Specifies the type of prices used when looking up a price for the Product.</p>
     */

    @JsonProperty("priceMode")
    public ProductPriceModeEnum getPriceMode();

    public void setProductType(final ProductTypeResourceIdentifier productType);

    public void setName(final LocalizedString name);

    public void setSlug(final LocalizedString slug);

    public void setKey(final String key);

    public void setDescription(final LocalizedString description);

    @JsonIgnore
    public void setCategories(final CategoryResourceIdentifier... categories);

    public void setCategories(final List<CategoryResourceIdentifier> categories);

    public void setCategoryOrderHints(final CategoryOrderHints categoryOrderHints);

    public void setMetaTitle(final LocalizedString metaTitle);

    public void setMetaDescription(final LocalizedString metaDescription);

    public void setMetaKeywords(final LocalizedString metaKeywords);

    public void setMasterVariant(final ProductVariantDraft masterVariant);

    @JsonIgnore
    public void setVariants(final ProductVariantDraft... variants);

    public void setVariants(final List<ProductVariantDraft> variants);

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    public void setSearchKeywords(final SearchKeywords searchKeywords);

    public void setState(final StateResourceIdentifier state);

    public void setPublish(final Boolean publish);

    public void setPriceMode(final ProductPriceModeEnum priceMode);

    public static ProductDraft of() {
        return new ProductDraftImpl();
    }

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

    public static ProductDraftBuilder builder() {
        return ProductDraftBuilder.of();
    }

    public static ProductDraftBuilder builder(final ProductDraft template) {
        return ProductDraftBuilder.of(template);
    }

    default <T> T withProductDraft(Function<ProductDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDraft>";
            }
        };
    }
}
