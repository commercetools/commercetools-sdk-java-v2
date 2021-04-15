
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDataImpl.class)
public interface ProductData {

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    @NotNull
    @Valid
    @JsonProperty("categories")
    public List<CategoryReference> getCategories();

    @Valid
    @JsonProperty("categoryOrderHints")
    public CategoryOrderHints getCategoryOrderHints();

    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    @NotNull
    @Valid
    @JsonProperty("masterVariant")
    public ProductVariant getMasterVariant();

    @NotNull
    @Valid
    @JsonProperty("variants")
    public List<ProductVariant> getVariants();

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
}
