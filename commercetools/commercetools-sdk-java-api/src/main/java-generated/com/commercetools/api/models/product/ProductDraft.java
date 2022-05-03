
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDraftImpl.class)
public interface ProductDraft {

    /**
    *  <p>A predefined product type assigned to the product.
    *  All products must have a product type.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("productType")
    public ProductTypeResourceIdentifier getProductType();

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>Human-readable identifiers usually used as deep-link URLs for the product.
    *  A slug must be unique across a project, but a product can have the same slug for different languages.
    *  Slugs have a maximum size of 256.
    *  Valid characters are: alphabetic characters (<code>A-Z, a-z</code>), numeric characters (<code>0-9</code>), underscores (<code>_</code>) and hyphens (<code>-</code>).</p>
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

    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
    *  <p>Categories assigned to the product.</p>
    */
    @Valid
    @JsonProperty("categories")
    public List<CategoryResourceIdentifier> getCategories();

    @Valid
    @JsonProperty("categoryOrderHints")
    public CategoryOrderHints getCategoryOrderHints();

    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    /**
    *  <p>The master product variant.
    *  Required if the <code>variants</code> array has product variants.</p>
    */
    @Valid
    @JsonProperty("masterVariant")
    public ProductVariantDraft getMasterVariant();

    /**
    *  <p>An array of related product variants.</p>
    */
    @Valid
    @JsonProperty("variants")
    public List<ProductVariantDraft> getVariants();

    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    @Valid
    @JsonProperty("searchKeywords")
    public SearchKeywords getSearchKeywords();

    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
    *  <p>If <code>true</code>, the product is published immediately.</p>
    */

    @JsonProperty("publish")
    public Boolean getPublish();

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
