
package com.commercetools.importapi.models.productdrafts;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.CategoryKeyReference;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.common.ProductPriceModeEnum;
import com.commercetools.importapi.models.common.ProductTypeKeyReference;
import com.commercetools.importapi.models.common.StateKeyReference;
import com.commercetools.importapi.models.common.TaxCategoryKeyReference;
import com.commercetools.importapi.models.products.SearchKeywords;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The representation of a Product Draft for the import purpose.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDraftImport productDraftImport = ProductDraftImport.builder()
 *             .key("{key}")
 *             .productType(productTypeBuilder -> productTypeBuilder)
 *             .name(nameBuilder -> nameBuilder)
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDraftImportImpl.class)
public interface ProductDraftImport extends ImportResource {

    /**
     *  <p>The <code>productType</code> of a Product. Maps to <code>Product.productType</code>. The Reference to the ProductType with which the ProductDraft is associated. If referenced ProductType does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary ProductType is created.</p>
     * @return productType
     */
    @NotNull
    @Valid
    @JsonProperty("productType")
    public ProductTypeKeyReference getProductType();

    /**
     *
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related product. Each slug must be unique across a project, but a product can have the same slug for different languages. Allowed are alphabetic, numeric, underscore (_) and hyphen (-) characters.</p>
     * @return slug
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>Maps to <code>Product.description</code>.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>The Reference to the Categories with which the ProductDraft is associated. If referenced Categories do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Categories are created.</p>
     * @return categories
     */
    @Valid
    @JsonProperty("categories")
    public List<CategoryKeyReference> getCategories();

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @return metaTitle
     */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @return metaDescription
     */
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @return metaKeywords
     */
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    /**
     *  <p>The master Product variant. Required if the <code>variants</code> array contains a Product Variant.</p>
     * @return masterVariant
     */
    @Valid
    @JsonProperty("masterVariant")
    public ProductVariantDraftImport getMasterVariant();

    /**
     *  <p>An array of related Product Variants.</p>
     * @return variants
     */
    @Valid
    @JsonProperty("variants")
    public List<ProductVariantDraftImport> getVariants();

    /**
     *  <p>The Reference to the TaxCategory with which the ProductDraft is associated. If referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary TaxCategory is created.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryKeyReference getTaxCategory();

    /**
     *  <p>Search keywords are primarily used by the suggester but are also considered for the full-text search. SearchKeywords is a JSON object where the keys are of IETF language tag. The value to a language tag key is an array of SearchKeyword for the specific language.</p>
     *  <pre><code>{
     *    "en": [
     *      { "text": "Multi tool" },
     *      { "text": "Swiss Army Knife", "suggestTokenizer": { "type": "whitespace" } }
     *    ],
     *    "de": [
     *      {
     *        "text": "Schweizer Messer",
     *        "suggestTokenizer": {
     *          "type": "custom",
     *          "inputs": ["schweizer messer", "offiziersmesser", "sackmesser"]
     *        }
     *      }
     *    ]
     *  }
     *  </code></pre>
     * @return searchKeywords
     */
    @Valid
    @JsonProperty("searchKeywords")
    public SearchKeywords getSearchKeywords();

    /**
     *  <p>The Reference to the State with which the ProductDraft is associated. If referenced State does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary State is created.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateKeyReference getState();

    /**
     *  <p>If <code>publish</code> is set to either <code>true</code> or <code>false</code>, both staged and current projections are set to the same value provided by the import data. If <code>publish</code> is not set, the staged projection is set to the provided import data, but the current projection stays unchanged. However, if the import data contains no update, that is, if it matches the staged projection of the existing Product, the import induces no change in the existing Product whether <code>publish</code> is set or not.</p>
     * @return publish
     */

    @JsonProperty("publish")
    public Boolean getPublish();

    /**
     *  <p>Determines the type of Prices the API uses. See ProductPriceMode for more details. If not provided, the existing <code>Product.priceMode</code> is not changed.</p>
     * @return priceMode
     */

    @JsonProperty("priceMode")
    public ProductPriceModeEnum getPriceMode();

    public void setProductType(final ProductTypeKeyReference productType);

    public void setName(final LocalizedString name);

    public void setSlug(final LocalizedString slug);

    public void setDescription(final LocalizedString description);

    @JsonIgnore
    public void setCategories(final CategoryKeyReference... categories);

    public void setCategories(final List<CategoryKeyReference> categories);

    public void setMetaTitle(final LocalizedString metaTitle);

    public void setMetaDescription(final LocalizedString metaDescription);

    public void setMetaKeywords(final LocalizedString metaKeywords);

    public void setMasterVariant(final ProductVariantDraftImport masterVariant);

    @JsonIgnore
    public void setVariants(final ProductVariantDraftImport... variants);

    public void setVariants(final List<ProductVariantDraftImport> variants);

    public void setTaxCategory(final TaxCategoryKeyReference taxCategory);

    public void setSearchKeywords(final SearchKeywords searchKeywords);

    public void setState(final StateKeyReference state);

    public void setPublish(final Boolean publish);

    public void setPriceMode(final ProductPriceModeEnum priceMode);

    public static ProductDraftImport of() {
        return new ProductDraftImportImpl();
    }

    public static ProductDraftImport of(final ProductDraftImport template) {
        ProductDraftImportImpl instance = new ProductDraftImportImpl();
        instance.setKey(template.getKey());
        instance.setProductType(template.getProductType());
        instance.setName(template.getName());
        instance.setSlug(template.getSlug());
        instance.setDescription(template.getDescription());
        instance.setCategories(template.getCategories());
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

    public static ProductDraftImportBuilder builder() {
        return ProductDraftImportBuilder.of();
    }

    public static ProductDraftImportBuilder builder(final ProductDraftImport template) {
        return ProductDraftImportBuilder.of(template);
    }

    default <T> T withProductDraftImport(Function<ProductDraftImport, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDraftImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDraftImport>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDraftImport>";
            }
        };
    }
}
