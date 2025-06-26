
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
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
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

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    /**
     *  <p>Name of the Product.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductDataBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Product.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductDataBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Product.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductDataBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Categories assigned to the Product.</p>
     * @param categories value to be set
     * @return Builder
     */

    public ProductDataBuilder categories(final com.commercetools.api.models.category.CategoryReference... categories) {
        this.categories = new ArrayList<>(Arrays.asList(categories));
        return this;
    }

    /**
     *  <p>Categories assigned to the Product.</p>
     * @param categories value to be set
     * @return Builder
     */

    public ProductDataBuilder categories(
            final java.util.List<com.commercetools.api.models.category.CategoryReference> categories) {
        this.categories = categories;
        return this;
    }

    /**
     *  <p>Categories assigned to the Product.</p>
     * @param categories value to be set
     * @return Builder
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
     *  <p>Categories assigned to the Product.</p>
     * @param builder function to build the categories value
     * @return Builder
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
     *  <p>Categories assigned to the Product.</p>
     * @param builder function to build the categories value
     * @return Builder
     */

    public ProductDataBuilder withCategories(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReferenceBuilder> builder) {
        this.categories = new ArrayList<>();
        this.categories.add(builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Categories assigned to the Product.</p>
     * @param builder function to build the categories value
     * @return Builder
     */

    public ProductDataBuilder addCategories(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReference> builder) {
        return plusCategories(builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()));
    }

    /**
     *  <p>Categories assigned to the Product.</p>
     * @param builder function to build the categories value
     * @return Builder
     */

    public ProductDataBuilder setCategories(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReference> builder) {
        return categories(builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()));
    }

    /**
     *  <p>Numerical values to allow ordering of Products within a specified Category.</p>
     * @param builder function to build the categoryOrderHints value
     * @return Builder
     */

    public ProductDataBuilder categoryOrderHints(
            Function<com.commercetools.api.models.product.CategoryOrderHintsBuilder, com.commercetools.api.models.product.CategoryOrderHintsBuilder> builder) {
        this.categoryOrderHints = builder.apply(com.commercetools.api.models.product.CategoryOrderHintsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Numerical values to allow ordering of Products within a specified Category.</p>
     * @param builder function to build the categoryOrderHints value
     * @return Builder
     */

    public ProductDataBuilder withCategoryOrderHints(
            Function<com.commercetools.api.models.product.CategoryOrderHintsBuilder, com.commercetools.api.models.product.CategoryOrderHints> builder) {
        this.categoryOrderHints = builder.apply(com.commercetools.api.models.product.CategoryOrderHintsBuilder.of());
        return this;
    }

    /**
     *  <p>Numerical values to allow ordering of Products within a specified Category.</p>
     * @param categoryOrderHints value to be set
     * @return Builder
     */

    public ProductDataBuilder categoryOrderHints(
            @Nullable final com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints) {
        this.categoryOrderHints = categoryOrderHints;
        return this;
    }

    /**
     *  <p>Description of the Product.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductDataBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the Product.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductDataBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the Product.</p>
     * @param description value to be set
     * @return Builder
     */

    public ProductDataBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product. Must be unique across a Project, but can be the same for Products in different Locales. Matches the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductDataBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product. Must be unique across a Project, but can be the same for Products in different Locales. Matches the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductDataBuilder withSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product. Must be unique across a Project, but can be the same for Products in different Locales. Matches the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @param slug value to be set
     * @return Builder
     */

    public ProductDataBuilder slug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>Title of the Product as used by search engines.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductDataBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Title of the Product as used by search engines.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductDataBuilder withMetaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Title of the Product as used by search engines.</p>
     * @param metaTitle value to be set
     * @return Builder
     */

    public ProductDataBuilder metaTitle(@Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     *  <p>Description of the Product as used by search engines.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductDataBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the Product as used by search engines.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductDataBuilder withMetaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the Product as used by search engines.</p>
     * @param metaDescription value to be set
     * @return Builder
     */

    public ProductDataBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     *  <p>Keywords that give additional information about the Product to search engines.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductDataBuilder metaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Keywords that give additional information about the Product to search engines.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductDataBuilder withMetaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Keywords that give additional information about the Product to search engines.</p>
     * @param metaKeywords value to be set
     * @return Builder
     */

    public ProductDataBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    /**
     *  <p>The Master Variant of the Product.</p>
     * @param builder function to build the masterVariant value
     * @return Builder
     */

    public ProductDataBuilder masterVariant(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        this.masterVariant = builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Master Variant of the Product.</p>
     * @param builder function to build the masterVariant value
     * @return Builder
     */

    public ProductDataBuilder withMasterVariant(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariant> builder) {
        this.masterVariant = builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of());
        return this;
    }

    /**
     *  <p>The Master Variant of the Product.</p>
     * @param masterVariant value to be set
     * @return Builder
     */

    public ProductDataBuilder masterVariant(final com.commercetools.api.models.product.ProductVariant masterVariant) {
        this.masterVariant = masterVariant;
        return this;
    }

    /**
     *  <p>Additional Product Variants.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductDataBuilder variants(final com.commercetools.api.models.product.ProductVariant... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
        return this;
    }

    /**
     *  <p>Additional Product Variants.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductDataBuilder variants(
            final java.util.List<com.commercetools.api.models.product.ProductVariant> variants) {
        this.variants = variants;
        return this;
    }

    /**
     *  <p>Additional Product Variants.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductDataBuilder plusVariants(final com.commercetools.api.models.product.ProductVariant... variants) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.addAll(Arrays.asList(variants));
        return this;
    }

    /**
     *  <p>Additional Product Variants.</p>
     * @param builder function to build the variants value
     * @return Builder
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
     *  <p>Additional Product Variants.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductDataBuilder withVariants(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        this.variants = new ArrayList<>();
        this.variants.add(builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Additional Product Variants.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductDataBuilder addVariants(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariant> builder) {
        return plusVariants(builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()));
    }

    /**
     *  <p>Additional Product Variants.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductDataBuilder setVariants(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariant> builder) {
        return variants(builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()));
    }

    /**
     *  <p>Used by Search Term Suggestions, but is also considered for a full text search in the Product Projection Search API.</p>
     * @param builder function to build the searchKeywords value
     * @return Builder
     */

    public ProductDataBuilder searchKeywords(
            Function<com.commercetools.api.models.product.SearchKeywordsBuilder, com.commercetools.api.models.product.SearchKeywordsBuilder> builder) {
        this.searchKeywords = builder.apply(com.commercetools.api.models.product.SearchKeywordsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Used by Search Term Suggestions, but is also considered for a full text search in the Product Projection Search API.</p>
     * @param builder function to build the searchKeywords value
     * @return Builder
     */

    public ProductDataBuilder withSearchKeywords(
            Function<com.commercetools.api.models.product.SearchKeywordsBuilder, com.commercetools.api.models.product.SearchKeywords> builder) {
        this.searchKeywords = builder.apply(com.commercetools.api.models.product.SearchKeywordsBuilder.of());
        return this;
    }

    /**
     *  <p>Used by Search Term Suggestions, but is also considered for a full text search in the Product Projection Search API.</p>
     * @param searchKeywords value to be set
     * @return Builder
     */

    public ProductDataBuilder searchKeywords(final com.commercetools.api.models.product.SearchKeywords searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductDataBuilder attributes(final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductDataBuilder attributes(
            final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductDataBuilder plusAttributes(final com.commercetools.api.models.product.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductDataBuilder plusAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductDataBuilder withAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductDataBuilder addAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return plusAttributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductDataBuilder setAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return attributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>Name of the Product.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Categories assigned to the Product.</p>
     * @return categories
     */

    public java.util.List<com.commercetools.api.models.category.CategoryReference> getCategories() {
        return this.categories;
    }

    /**
     *  <p>Numerical values to allow ordering of Products within a specified Category.</p>
     * @return categoryOrderHints
     */

    @Nullable
    public com.commercetools.api.models.product.CategoryOrderHints getCategoryOrderHints() {
        return this.categoryOrderHints;
    }

    /**
     *  <p>Description of the Product.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product. Must be unique across a Project, but can be the same for Products in different Locales. Matches the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @return slug
     */

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>Title of the Product as used by search engines.</p>
     * @return metaTitle
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>Description of the Product as used by search engines.</p>
     * @return metaDescription
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>Keywords that give additional information about the Product to search engines.</p>
     * @return metaKeywords
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>The Master Variant of the Product.</p>
     * @return masterVariant
     */

    public com.commercetools.api.models.product.ProductVariant getMasterVariant() {
        return this.masterVariant;
    }

    /**
     *  <p>Additional Product Variants.</p>
     * @return variants
     */

    public java.util.List<com.commercetools.api.models.product.ProductVariant> getVariants() {
        return this.variants;
    }

    /**
     *  <p>Used by Search Term Suggestions, but is also considered for a full text search in the Product Projection Search API.</p>
     * @return searchKeywords
     */

    public com.commercetools.api.models.product.SearchKeywords getSearchKeywords() {
        return this.searchKeywords;
    }

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @return attributes
     */

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     * builds ProductData with checking for non-null required values
     * @return ProductData
     */
    public ProductData build() {
        Objects.requireNonNull(name, ProductData.class + ": name is missing");
        Objects.requireNonNull(categories, ProductData.class + ": categories is missing");
        Objects.requireNonNull(slug, ProductData.class + ": slug is missing");
        Objects.requireNonNull(masterVariant, ProductData.class + ": masterVariant is missing");
        Objects.requireNonNull(variants, ProductData.class + ": variants is missing");
        Objects.requireNonNull(searchKeywords, ProductData.class + ": searchKeywords is missing");
        Objects.requireNonNull(attributes, ProductData.class + ": attributes is missing");
        return new ProductDataImpl(name, categories, categoryOrderHints, description, slug, metaTitle, metaDescription,
            metaKeywords, masterVariant, variants, searchKeywords, attributes);
    }

    /**
     * builds ProductData without checking for non-null required values
     * @return ProductData
     */
    public ProductData buildUnchecked() {
        return new ProductDataImpl(name, categories, categoryOrderHints, description, slug, metaTitle, metaDescription,
            metaKeywords, masterVariant, variants, searchKeywords, attributes);
    }

    /**
     * factory method for an instance of ProductDataBuilder
     * @return builder
     */
    public static ProductDataBuilder of() {
        return new ProductDataBuilder();
    }

    /**
     * create builder for ProductData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
        builder.attributes = template.getAttributes();
        return builder;
    }

}
