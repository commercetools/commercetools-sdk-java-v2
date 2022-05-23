
package com.commercetools.importapi.models.products;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.CategoryKeyReference;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.common.ProductTypeKeyReference;
import com.commercetools.importapi.models.common.StateKeyReference;
import com.commercetools.importapi.models.common.TaxCategoryKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The data representation for a Product to be imported that is persisted as a Product in the Project.</p>
 *  <p>This is the minimal representation required for creating a Product in commercetools.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductImport productImport = ProductImport.builder()
 *             .key("{key}")
 *             .name(nameBuilder -> nameBuilder)
 *             .productType(productTypeBuilder -> productTypeBuilder)
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductImportImpl.class)
public interface ProductImport extends ImportResource {

    /**
     <*  <p>Maps to <code>Product.name</code>.</p>>
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     <*  <p>The <code>productType</code> of a Product. Maps to <code>Product.productType</code>. The Reference to the ProductType with which the Product is associated. If referenced ProductType does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary ProductType is created.</p>>
     */
    @NotNull
    @Valid
    @JsonProperty("productType")
    public ProductTypeKeyReference getProductType();

    /**
     <*  <p>Human-readable identifiers usually used as deep-link URL to the related product. Each slug must be unique across a Project, but a product can have the same slug for different languages. Allowed are alphabetic, numeric, underscore (_) and hyphen (-) characters.</p>>
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     <*  <p>Maps to <code>Product.description</code>.</p>>
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     <*  <p>Maps to <code>Product.categories</code>. The References to the Categories with which the Product is associated. If referenced Categories do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Categories are created.</p>>
     */
    @Valid
    @JsonProperty("categories")
    public List<CategoryKeyReference> getCategories();

    /**
     <*  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
    *  <pre><code>{
    *    "de": "Hundefutter",
    *    "en": "dog food"
    *  }
    *  </code></pre>>
     */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
     <*  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
    *  <pre><code>{
    *    "de": "Hundefutter",
    *    "en": "dog food"
    *  }
    *  </code></pre>>
     */
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    /**
     <*  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
    *  <pre><code>{
    *    "de": "Hundefutter",
    *    "en": "dog food"
    *  }
    *  </code></pre>>
     */
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    /**
     <*  <p>The Reference to the TaxCategory with which the Product is associated. If referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary TaxCategory is created.</p>>
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryKeyReference getTaxCategory();

    /**
     <*  <p>Search keywords are primarily used by the suggester but are also considered for the full-text search. SearchKeywords is a JSON object where the keys are of IETF language tag. The value to a language tag key is an array of SearchKeyword for the specific language.</p>
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
    *  </code></pre>>
     */
    @Valid
    @JsonProperty("searchKeywords")
    public SearchKeywords getSearchKeywords();

    /**
     <*  <p>The Reference to the State with which the Product is associated. If referenced State does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary State is created.</p>>
     */
    @Valid
    @JsonProperty("state")
    public StateKeyReference getState();

    /**
     <*  <p>If <code>publish</code> is set to either <code>true</code> or <code>false</code>, both staged and current projections are set to the same value provided by the import data. If <code>publish</code> is not set, the staged projection is set to the provided import data, but the current projection stays unchanged. However, if the import data contains no update, that is, if it matches the staged projection of the existing Product in the platform, the import induces no change in the existing Product whether <code>publish</code> is set or not.</p>>
     */

    @JsonProperty("publish")
    public Boolean getPublish();

    public void setName(final LocalizedString name);

    public void setProductType(final ProductTypeKeyReference productType);

    public void setSlug(final LocalizedString slug);

    public void setDescription(final LocalizedString description);

    @JsonIgnore
    public void setCategories(final CategoryKeyReference... categories);

    public void setCategories(final List<CategoryKeyReference> categories);

    public void setMetaTitle(final LocalizedString metaTitle);

    public void setMetaDescription(final LocalizedString metaDescription);

    public void setMetaKeywords(final LocalizedString metaKeywords);

    public void setTaxCategory(final TaxCategoryKeyReference taxCategory);

    public void setSearchKeywords(final SearchKeywords searchKeywords);

    public void setState(final StateKeyReference state);

    public void setPublish(final Boolean publish);

    public static ProductImport of() {
        return new ProductImportImpl();
    }

    public static ProductImport of(final ProductImport template) {
        ProductImportImpl instance = new ProductImportImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setProductType(template.getProductType());
        instance.setSlug(template.getSlug());
        instance.setDescription(template.getDescription());
        instance.setCategories(template.getCategories());
        instance.setMetaTitle(template.getMetaTitle());
        instance.setMetaDescription(template.getMetaDescription());
        instance.setMetaKeywords(template.getMetaKeywords());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setSearchKeywords(template.getSearchKeywords());
        instance.setState(template.getState());
        instance.setPublish(template.getPublish());
        return instance;
    }

    public static ProductImportBuilder builder() {
        return ProductImportBuilder.of();
    }

    public static ProductImportBuilder builder(final ProductImport template) {
        return ProductImportBuilder.of(template);
    }

    default <T> T withProductImport(Function<ProductImport, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductImport>() {
            @Override
            public String toString() {
                return "TypeReference<ProductImport>";
            }
        };
    }
}
