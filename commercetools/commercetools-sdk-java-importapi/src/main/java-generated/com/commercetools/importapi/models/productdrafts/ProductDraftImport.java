
package com.commercetools.importapi.models.productdrafts;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

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

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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
     *  <p>User-defined unique identifier. If a Product with this <code>key</code> exists, it will be updated with the imported data.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

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
     *  <p>Determines the published status and current/staged projection of the Product. For more information, see Managing the published state of Products.</p>
     * @return publish
     */

    @JsonProperty("publish")
    public Boolean getPublish();

    /**
     *  <p>Determines the type of Prices the API uses. If not provided, the existing <code>Product.priceMode</code> is not changed.</p>
     * @return priceMode
     */

    @JsonProperty("priceMode")
    public ProductPriceModeEnum getPriceMode();

    /**
     *  <p>User-defined unique identifier. If a Product with this <code>key</code> exists, it will be updated with the imported data.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The <code>productType</code> of a Product. Maps to <code>Product.productType</code>. The Reference to the ProductType with which the ProductDraft is associated. If referenced ProductType does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary ProductType is created.</p>
     * @param productType value to be set
     */

    public void setProductType(final ProductTypeKeyReference productType);

    /**
     * set name
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related product. Each slug must be unique across a project, but a product can have the same slug for different languages. Allowed are alphabetic, numeric, underscore (_) and hyphen (-) characters.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>Maps to <code>Product.description</code>.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>The Reference to the Categories with which the ProductDraft is associated. If referenced Categories do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Categories are created.</p>
     * @param categories values to be set
     */

    @JsonIgnore
    public void setCategories(final CategoryKeyReference... categories);

    /**
     *  <p>The Reference to the Categories with which the ProductDraft is associated. If referenced Categories do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Categories are created.</p>
     * @param categories values to be set
     */

    public void setCategories(final List<CategoryKeyReference> categories);

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @param metaTitle value to be set
     */

    public void setMetaTitle(final LocalizedString metaTitle);

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @param metaDescription value to be set
     */

    public void setMetaDescription(final LocalizedString metaDescription);

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @param metaKeywords value to be set
     */

    public void setMetaKeywords(final LocalizedString metaKeywords);

    /**
     *  <p>The master Product variant. Required if the <code>variants</code> array contains a Product Variant.</p>
     * @param masterVariant value to be set
     */

    public void setMasterVariant(final ProductVariantDraftImport masterVariant);

    /**
     *  <p>An array of related Product Variants.</p>
     * @param variants values to be set
     */

    @JsonIgnore
    public void setVariants(final ProductVariantDraftImport... variants);

    /**
     *  <p>An array of related Product Variants.</p>
     * @param variants values to be set
     */

    public void setVariants(final List<ProductVariantDraftImport> variants);

    /**
     *  <p>The Reference to the TaxCategory with which the ProductDraft is associated. If referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary TaxCategory is created.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryKeyReference taxCategory);

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
     * @param searchKeywords value to be set
     */

    public void setSearchKeywords(final SearchKeywords searchKeywords);

    /**
     *  <p>The Reference to the State with which the ProductDraft is associated. If referenced State does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary State is created.</p>
     * @param state value to be set
     */

    public void setState(final StateKeyReference state);

    /**
     *  <p>Determines the published status and current/staged projection of the Product. For more information, see Managing the published state of Products.</p>
     * @param publish value to be set
     */

    public void setPublish(final Boolean publish);

    /**
     *  <p>Determines the type of Prices the API uses. If not provided, the existing <code>Product.priceMode</code> is not changed.</p>
     * @param priceMode value to be set
     */

    public void setPriceMode(final ProductPriceModeEnum priceMode);

    /**
     * factory method
     * @return instance of ProductDraftImport
     */
    public static ProductDraftImport of() {
        return new ProductDraftImportImpl();
    }

    /**
     * factory method to create a shallow copy ProductDraftImport
     * @param template instance to be copied
     * @return copy instance
     */
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

    public ProductDraftImport copyDeep();

    /**
     * factory method to create a deep copy of ProductDraftImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDraftImport deepCopy(@Nullable final ProductDraftImport template) {
        if (template == null) {
            return null;
        }
        ProductDraftImportImpl instance = new ProductDraftImportImpl();
        instance.setKey(template.getKey());
        instance.setProductType(
            com.commercetools.importapi.models.common.ProductTypeKeyReference.deepCopy(template.getProductType()));
        instance.setName(com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setSlug(com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setDescription(
            com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setCategories(Optional.ofNullable(template.getCategories())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.CategoryKeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setMetaTitle(
            com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getMetaTitle()));
        instance.setMetaDescription(
            com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getMetaDescription()));
        instance.setMetaKeywords(
            com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getMetaKeywords()));
        instance.setMasterVariant(com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport
                .deepCopy(template.getMasterVariant()));
        instance.setVariants(Optional.ofNullable(template.getVariants())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTaxCategory(
            com.commercetools.importapi.models.common.TaxCategoryKeyReference.deepCopy(template.getTaxCategory()));
        instance.setSearchKeywords(
            com.commercetools.importapi.models.products.SearchKeywords.deepCopy(template.getSearchKeywords()));
        instance.setState(com.commercetools.importapi.models.common.StateKeyReference.deepCopy(template.getState()));
        instance.setPublish(template.getPublish());
        instance.setPriceMode(template.getPriceMode());
        return instance;
    }

    /**
     * builder factory method for ProductDraftImport
     * @return builder
     */
    public static ProductDraftImportBuilder builder() {
        return ProductDraftImportBuilder.of();
    }

    /**
     * create builder for ProductDraftImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDraftImportBuilder builder(final ProductDraftImport template) {
        return ProductDraftImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDraftImport(Function<ProductDraftImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDraftImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDraftImport>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDraftImport>";
            }
        };
    }
}
