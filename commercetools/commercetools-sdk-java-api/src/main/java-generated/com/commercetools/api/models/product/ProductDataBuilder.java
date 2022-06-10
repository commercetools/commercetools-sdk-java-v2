
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDataBuilder
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
public class ProductDataBuilder implements Builder<ProductData> {

    private com.commercetools.api.models.common.LocalizedString name;

    private java.util.List<com.commercetools.api.models.category.CategoryReference> categories;

    @Nullable
    private com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaTitle;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaDescription;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    private com.commercetools.api.models.product.ProductVariant masterVariant;

    private java.util.List<com.commercetools.api.models.product.ProductVariant> variants;

    private com.commercetools.api.models.product.SearchKeywords searchKeywords;

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ProductDataBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ProductDataBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *
     */

    public ProductDataBuilder categories(final com.commercetools.api.models.category.CategoryReference... categories) {
        this.categories = new ArrayList<>(Arrays.asList(categories));
        return this;
    }

    /**
     *
     */

    public ProductDataBuilder categories(
            final java.util.List<com.commercetools.api.models.category.CategoryReference> categories) {
        this.categories = categories;
        return this;
    }

    /**
     *
     */

    public ProductDataBuilder plusCategories(
            final com.commercetools.api.models.category.CategoryReference... categories) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.addAll(Arrays.asList(categories));
        return this;
    }

    /**
     *
     */

    public ProductDataBuilder plusCategories(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReferenceBuilder> builder) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public ProductDataBuilder withCategories(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReferenceBuilder> builder) {
        this.categories = new ArrayList<>();
        this.categories.add(builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public ProductDataBuilder categoryOrderHints(
            Function<com.commercetools.api.models.product.CategoryOrderHintsBuilder, com.commercetools.api.models.product.CategoryOrderHintsBuilder> builder) {
        this.categoryOrderHints = builder.apply(com.commercetools.api.models.product.CategoryOrderHintsBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public ProductDataBuilder categoryOrderHints(
            @Nullable final com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints) {
        this.categoryOrderHints = categoryOrderHints;
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ProductDataBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ProductDataBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ProductDataBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ProductDataBuilder slug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ProductDataBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ProductDataBuilder metaTitle(@Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ProductDataBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ProductDataBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ProductDataBuilder metaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ProductDataBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    /**
     *
     */

    public ProductDataBuilder masterVariant(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        this.masterVariant = builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ProductDataBuilder masterVariant(final com.commercetools.api.models.product.ProductVariant masterVariant) {
        this.masterVariant = masterVariant;
        return this;
    }

    /**
     *
     */

    public ProductDataBuilder variants(final com.commercetools.api.models.product.ProductVariant... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
        return this;
    }

    /**
     *
     */

    public ProductDataBuilder variants(
            final java.util.List<com.commercetools.api.models.product.ProductVariant> variants) {
        this.variants = variants;
        return this;
    }

    /**
     *
     */

    public ProductDataBuilder plusVariants(final com.commercetools.api.models.product.ProductVariant... variants) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.addAll(Arrays.asList(variants));
        return this;
    }

    /**
     *
     */

    public ProductDataBuilder plusVariants(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.add(builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public ProductDataBuilder withVariants(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        this.variants = new ArrayList<>();
        this.variants.add(builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public ProductDataBuilder searchKeywords(
            Function<com.commercetools.api.models.product.SearchKeywordsBuilder, com.commercetools.api.models.product.SearchKeywordsBuilder> builder) {
        this.searchKeywords = builder.apply(com.commercetools.api.models.product.SearchKeywordsBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ProductDataBuilder searchKeywords(final com.commercetools.api.models.product.SearchKeywords searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public java.util.List<com.commercetools.api.models.category.CategoryReference> getCategories() {
        return this.categories;
    }

    @Nullable
    public com.commercetools.api.models.product.CategoryOrderHints getCategoryOrderHints() {
        return this.categoryOrderHints;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    public com.commercetools.api.models.product.ProductVariant getMasterVariant() {
        return this.masterVariant;
    }

    public java.util.List<com.commercetools.api.models.product.ProductVariant> getVariants() {
        return this.variants;
    }

    public com.commercetools.api.models.product.SearchKeywords getSearchKeywords() {
        return this.searchKeywords;
    }

    public ProductData build() {
        Objects.requireNonNull(name, ProductData.class + ": name is missing");
        Objects.requireNonNull(categories, ProductData.class + ": categories is missing");
        Objects.requireNonNull(slug, ProductData.class + ": slug is missing");
        Objects.requireNonNull(masterVariant, ProductData.class + ": masterVariant is missing");
        Objects.requireNonNull(variants, ProductData.class + ": variants is missing");
        Objects.requireNonNull(searchKeywords, ProductData.class + ": searchKeywords is missing");
        return new ProductDataImpl(name, categories, categoryOrderHints, description, slug, metaTitle, metaDescription,
            metaKeywords, masterVariant, variants, searchKeywords);
    }

    /**
     * builds ProductData without checking for non null required values
     */
    public ProductData buildUnchecked() {
        return new ProductDataImpl(name, categories, categoryOrderHints, description, slug, metaTitle, metaDescription,
            metaKeywords, masterVariant, variants, searchKeywords);
    }

    public static ProductDataBuilder of() {
        return new ProductDataBuilder();
    }

    public static ProductDataBuilder of(final ProductData template) {
        ProductDataBuilder builder = new ProductDataBuilder();
        builder.name = template.getName();
        builder.categories = template.getCategories();
        builder.categoryOrderHints = template.getCategoryOrderHints();
        builder.description = template.getDescription();
        builder.slug = template.getSlug();
        builder.metaTitle = template.getMetaTitle();
        builder.metaDescription = template.getMetaDescription();
        builder.metaKeywords = template.getMetaKeywords();
        builder.masterVariant = template.getMasterVariant();
        builder.variants = template.getVariants();
        builder.searchKeywords = template.getSearchKeywords();
        return builder;
    }

}
