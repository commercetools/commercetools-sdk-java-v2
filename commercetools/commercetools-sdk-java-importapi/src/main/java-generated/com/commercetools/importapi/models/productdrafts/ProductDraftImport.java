
package com.commercetools.importapi.models.productdrafts;

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
import com.commercetools.importapi.models.products.SearchKeywords;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The representation of a Product Draft for the import purpose.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDraftImportImpl.class)
public interface ProductDraftImport extends ImportResource {

    /**
    *  <p>The <code>productType</code> of a <a href="/../api/projects/products#product">Product</a>.
    *  Maps to <code>Product.productType</code>.
    *  The Reference to the <a href="/../api/projects/productTypes#producttype">ProductType</a> with which the ProductDraft is associated.
    *  If referenced ProductType does not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>unresolved</code> until the necessary ProductType is created.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("productType")
    public ProductTypeKeyReference getProductType();

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>Human-readable identifiers usually used as deep-link URL to the related product. Each slug must be unique across a project,
    *  but a product can have the same slug for different languages. Allowed are alphabetic, numeric, underscore (_) and hyphen (-) characters.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
    *  <p>Maps to <code>Product.description</code>.</p>
    */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
    *  <p>The Reference to the <a href="/../api/projects/categories#category">Categories</a> with which the ProductDraft is associated.
    *  If referenced Categories do not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>unresolved</code> until the necessary Categories are created.</p>
    */
    @Valid
    @JsonProperty("categories")
    public List<CategoryKeyReference> getCategories();

    /**
    *  <p>A localized string is a JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values the corresponding strings used for that language.</p>
    *  <pre><code class="language-json">{
    *    &quot;de&quot;: &quot;Hundefutter&quot;,
    *    &quot;en&quot;: &quot;dog food&quot;
    *  }
    *  </code></pre>
    */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
    *  <p>A localized string is a JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values the corresponding strings used for that language.</p>
    *  <pre><code class="language-json">{
    *    &quot;de&quot;: &quot;Hundefutter&quot;,
    *    &quot;en&quot;: &quot;dog food&quot;
    *  }
    *  </code></pre>
    */
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    /**
    *  <p>A localized string is a JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values the corresponding strings used for that language.</p>
    *  <pre><code class="language-json">{
    *    &quot;de&quot;: &quot;Hundefutter&quot;,
    *    &quot;en&quot;: &quot;dog food&quot;
    *  }
    *  </code></pre>
    */
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    /**
    *  <p>The master Product variant.
    *  Required if the <code>variants</code> array contains a Product Variant.</p>
    */
    @Valid
    @JsonProperty("masterVariant")
    public ProductVariantDraftImport getMasterVariant();

    /**
    *  <p>An array of related Product Variants.</p>
    */
    @Valid
    @JsonProperty("variants")
    public List<ProductVariantDraftImport> getVariants();

    /**
    *  <p>The Reference to the <a href="/../api/projects/taxCategories#taxcategory">TaxCategory</a> with which the ProductDraft is associated.
    *  If referenced TaxCategory does not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>unresolved</code> until the necessary TaxCategory is created.</p>
    */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryKeyReference getTaxCategory();

    /**
    *  <p>Search keywords are primarily used by the suggester but are also considered for the full-text search. SearchKeywords is a JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>. The value to a language tag key is an array of SearchKeyword for the specific language.</p>
    *  <pre><code class="language-json">{
    *    &quot;en&quot;: [
    *      { &quot;text&quot;: &quot;Multi tool&quot; },
    *      { &quot;text&quot;: &quot;Swiss Army Knife&quot;, &quot;suggestTokenizer&quot;: { &quot;type&quot;: &quot;whitespace&quot; } }
    *    ],
    *    &quot;de&quot;: [
    *      {
    *        &quot;text&quot;: &quot;Schweizer Messer&quot;,
    *        &quot;suggestTokenizer&quot;: {
    *          &quot;type&quot;: &quot;custom&quot;,
    *          &quot;inputs&quot;: [&quot;schweizer messer&quot;, &quot;offiziersmesser&quot;, &quot;sackmesser&quot;]
    *        }
    *      }
    *    ]
    *  }
    *  </code></pre>
    */
    @Valid
    @JsonProperty("searchKeywords")
    public SearchKeywords getSearchKeywords();

    /**
    *  <p>The Reference to the <a href="/../api/projects/states#state">State</a> with which the ProductDraft is associated.
    *  If referenced State does not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>unresolved</code> until the necessary State is created.</p>
    */
    @Valid
    @JsonProperty("state")
    public StateKeyReference getState();

    /**
    *  <p>If <code>publish</code> is set to either <code>true</code> or <code>false</code>, both staged and current projections are set to the same value provided by the import data.
    *  If <code>publish</code> is not set, the staged projection is set to the provided import data, but the current projection stays unchanged.
    *  However, if the import data contains no update, that is, if it matches the staged projection of the existing Product in the platform, the import induces no change in the existing Product whether <code>publish</code> is set or not.</p>
    */

    @JsonProperty("publish")
    public Boolean getPublish();

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
