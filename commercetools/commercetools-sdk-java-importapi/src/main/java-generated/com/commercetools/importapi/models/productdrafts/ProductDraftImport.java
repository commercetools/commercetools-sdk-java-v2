
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDraftImportImpl.class)
public interface ProductDraftImport extends ImportResource {

    /**
    *  <p>The product's product type. Maps to <code>Product.productType</code>.</p>
    *  <p>The product type referenced
    *  must already exist in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
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
    *  <p>An array of references to categories by their keys. Maps to <code>Product.categories</code>.</p>
    *  <p>The categories referenced
    *  must already exist in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    @Valid
    @JsonProperty("categories")
    public List<CategoryKeyReference> getCategories();

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
    public ProductVariantDraftImport getMasterVariant();

    /**
    *  <p>An array of related product variants.</p>
    */
    @Valid
    @JsonProperty("variants")
    public List<ProductVariantDraftImport> getVariants();

    /**
    *  <p>References a tax category by its key.</p>
    *  <p>The tax category referenced must already exist
    *  in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryKeyReference getTaxCategory();

    @Valid
    @JsonProperty("searchKeywords")
    public SearchKeywords getSearchKeywords();

    /**
    *  <p>References a state by its key.</p>
    *  <p>The tax category referenced must already exist
    *  in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    @Valid
    @JsonProperty("state")
    public StateKeyReference getState();

    /**
    *  <p>If there were updates, only the updates will be published to <code>staged</code> and <code>current</code> projection.</p>
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
}
