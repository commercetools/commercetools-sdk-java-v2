
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDataImpl.class)
public interface ProductData extends ProductDataLike, ProductProjectionMixin {

    /**
     *  <p>Name of the Product.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Categories assigned to the Product.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("categories")
    public List<CategoryReference> getCategories();

    /**
     *  <p>Numerical values to allow ordering of Products within a specified Category.</p>
     */
    @Valid
    @JsonProperty("categoryOrderHints")
    public CategoryOrderHints getCategoryOrderHints();

    /**
     *  <p>Description of the Product.</p>
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product. Must be unique across a Project, but can be the same for Products in different Locales. Matches the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>Title of the Product displayed in search results.</p>
     */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
     *  <p>Description of the Product displayed in search results below the meta title.</p>
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
     *  <p>The Master Variant of the Product.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("masterVariant")
    public ProductVariant getMasterVariant();

    /**
     *  <p>Additional Product Variants.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("variants")
    public List<ProductVariant> getVariants();

    /**
     *  <p>Used by Product Suggestions, but is also considered for a full text search.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("searchKeywords")
    public SearchKeywords getSearchKeywords();

    public void setName(final LocalizedString name);

    @JsonIgnore
    public void setCategories(final CategoryReference... categories);

    public void setCategories(final List<CategoryReference> categories);

    public void setCategoryOrderHints(final CategoryOrderHints categoryOrderHints);

    public void setDescription(final LocalizedString description);

    public void setSlug(final LocalizedString slug);

    public void setMetaTitle(final LocalizedString metaTitle);

    public void setMetaDescription(final LocalizedString metaDescription);

    public void setMetaKeywords(final LocalizedString metaKeywords);

    public void setMasterVariant(final ProductVariant masterVariant);

    @JsonIgnore
    public void setVariants(final ProductVariant... variants);

    public void setVariants(final List<ProductVariant> variants);

    public void setSearchKeywords(final SearchKeywords searchKeywords);

    public static ProductData of() {
        return new ProductDataImpl();
    }

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
        return instance;
    }

    public static ProductDataBuilder builder() {
        return ProductDataBuilder.of();
    }

    public static ProductDataBuilder builder(final ProductData template) {
        return ProductDataBuilder.of(template);
    }

    default <T> T withProductData(Function<ProductData, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductData> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductData>() {
            @Override
            public String toString() {
                return "TypeReference<ProductData>";
            }
        };
    }
}
