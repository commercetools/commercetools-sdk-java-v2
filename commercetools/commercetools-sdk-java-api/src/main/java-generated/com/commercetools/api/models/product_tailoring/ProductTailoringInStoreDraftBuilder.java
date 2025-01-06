
package com.commercetools.api.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringInStoreDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringInStoreDraft productTailoringInStoreDraft = ProductTailoringInStoreDraft.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringInStoreDraftBuilder implements Builder<ProductTailoringInStoreDraft> {

    @Nullable
    private String key;

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaTitle;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaDescription;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private Boolean publish;

    @Nullable
    private java.util.List<com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraft> variants;

    /**
     *  <p>User-defined unique identifier of the ProductTailoring.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Product the ProductTailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder product(
            Function<com.commercetools.api.models.product.ProductResourceIdentifierBuilder, com.commercetools.api.models.product.ProductResourceIdentifierBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Product the ProductTailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductResourceIdentifierBuilder, com.commercetools.api.models.product.ProductResourceIdentifier> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Product the ProductTailoring belongs to.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder product(
            final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Tailored name of the Product.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Tailored name of the Product.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Tailored name of the Product.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Tailored description of the Product.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Tailored description of the Product.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Tailored description of the Product.</p>
     * @param description value to be set
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Tailored title of the Product that is used by search engines.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Tailored title of the Product that is used by search engines.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder withMetaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Tailored title of the Product that is used by search engines.</p>
     * @param metaTitle value to be set
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder metaTitle(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     *  <p>Tailored description of the Product that is used in search engine.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Tailored description of the Product that is used in search engine.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder withMetaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Tailored description of the Product that is used in search engine.</p>
     * @param metaDescription value to be set
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     *  <p>Tailored keywords related to the Product that are used by search engines.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder metaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Tailored keywords related to the Product that are used by search engines.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder withMetaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Tailored keywords related to the Product that are used by search engines.</p>
     * @param metaKeywords value to be set
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the ProductTailoring. Matches the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the ProductTailoring. Matches the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder withSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the ProductTailoring. Matches the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @param slug value to be set
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder slug(
            @Nullable final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>If <code>true</code>, the ProductTailoring is published immediately.</p>
     * @param publish value to be set
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder publish(@Nullable final Boolean publish) {
        this.publish = publish;
        return this;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder variants(
            @Nullable final com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraft... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
        return this;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder variants(
            @Nullable final java.util.List<com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraft> variants) {
        this.variants = variants;
        return this;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder plusVariants(
            @Nullable final com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraft... variants) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.addAll(Arrays.asList(variants));
        return this;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder plusVariants(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraftBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraftBuilder> builder) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.add(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraftBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder withVariants(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraftBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraftBuilder> builder) {
        this.variants = new ArrayList<>();
        this.variants.add(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraftBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder addVariants(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraftBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraft> builder) {
        return plusVariants(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraftBuilder.of()));
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductTailoringInStoreDraftBuilder setVariants(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraftBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraft> builder) {
        return variants(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraftBuilder.of()));
    }

    /**
     *  <p>User-defined unique identifier of the ProductTailoring.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>ResourceIdentifier of the Product the ProductTailoring belongs to.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductResourceIdentifier getProduct() {
        return this.product;
    }

    /**
     *  <p>Tailored name of the Product.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Tailored description of the Product.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Tailored title of the Product that is used by search engines.</p>
     * @return metaTitle
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>Tailored description of the Product that is used in search engine.</p>
     * @return metaDescription
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>Tailored keywords related to the Product that are used by search engines.</p>
     * @return metaKeywords
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the ProductTailoring. Matches the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @return slug
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>If <code>true</code>, the ProductTailoring is published immediately.</p>
     * @return publish
     */

    @Nullable
    public Boolean getPublish() {
        return this.publish;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @return variants
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraft> getVariants() {
        return this.variants;
    }

    /**
     * builds ProductTailoringInStoreDraft with checking for non-null required values
     * @return ProductTailoringInStoreDraft
     */
    public ProductTailoringInStoreDraft build() {
        Objects.requireNonNull(product, ProductTailoringInStoreDraft.class + ": product is missing");
        return new ProductTailoringInStoreDraftImpl(key, product, name, description, metaTitle, metaDescription,
            metaKeywords, slug, publish, variants);
    }

    /**
     * builds ProductTailoringInStoreDraft without checking for non-null required values
     * @return ProductTailoringInStoreDraft
     */
    public ProductTailoringInStoreDraft buildUnchecked() {
        return new ProductTailoringInStoreDraftImpl(key, product, name, description, metaTitle, metaDescription,
            metaKeywords, slug, publish, variants);
    }

    /**
     * factory method for an instance of ProductTailoringInStoreDraftBuilder
     * @return builder
     */
    public static ProductTailoringInStoreDraftBuilder of() {
        return new ProductTailoringInStoreDraftBuilder();
    }

    /**
     * create builder for ProductTailoringInStoreDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringInStoreDraftBuilder of(final ProductTailoringInStoreDraft template) {
        ProductTailoringInStoreDraftBuilder builder = new ProductTailoringInStoreDraftBuilder();
        builder.key = template.getKey();
        builder.product = template.getProduct();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.metaTitle = template.getMetaTitle();
        builder.metaDescription = template.getMetaDescription();
        builder.metaKeywords = template.getMetaKeywords();
        builder.slug = template.getSlug();
        builder.publish = template.getPublish();
        builder.variants = template.getVariants();
        return builder;
    }

}
