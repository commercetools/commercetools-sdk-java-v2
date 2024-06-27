
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringCreatedMessagePayload productTailoringCreatedMessagePayload = ProductTailoringCreatedMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .published(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringCreatedMessagePayloadBuilder implements Builder<ProductTailoringCreatedMessagePayload> {

    @Nullable
    private String key;

    private com.commercetools.api.models.store.StoreKeyReference store;

    @Nullable
    private String productKey;

    private com.commercetools.api.models.product.ProductReference product;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaTitle;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaDescription;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    @Nullable
    private java.util.List<com.commercetools.api.models.product_tailoring.ProductVariantTailoring> variants;

    private Boolean published;

    /**
     *  <p>User-defined unique identifier of the Product Tailoring.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param store value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder store(
            final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Product this Product Tailoring belongs to.</p>
     * @param productKey value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder productKey(@Nullable final String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>The description of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The description of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>The description of the Product Tailoring at the time of creation.</p>
     * @param description value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>The name of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The name of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>The name of the Product Tailoring at the time of creation.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The slug of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The slug of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder withSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>The slug of the Product Tailoring at the time of creation.</p>
     * @param slug value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder slug(
            @Nullable final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>The metaTitle of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The metaTitle of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder withMetaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>The metaTitle of the Product Tailoring at the time of creation.</p>
     * @param metaTitle value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder metaTitle(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     *  <p>The metaDescription of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The metaDescription of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder withMetaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>The metaDescription of the Product Tailoring at the time of creation.</p>
     * @param metaDescription value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     *  <p>The metaKeywords of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder metaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The metaKeywords of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder withMetaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>The metaKeywords of the Product Tailoring at the time of creation.</p>
     * @param metaKeywords value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    /**
     *  <p>The variants of the Product Tailoring at the time of creation.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder variants(
            @Nullable final com.commercetools.api.models.product_tailoring.ProductVariantTailoring... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
        return this;
    }

    /**
     *  <p>The variants of the Product Tailoring at the time of creation.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder variants(
            @Nullable final java.util.List<com.commercetools.api.models.product_tailoring.ProductVariantTailoring> variants) {
        this.variants = variants;
        return this;
    }

    /**
     *  <p>The variants of the Product Tailoring at the time of creation.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder plusVariants(
            @Nullable final com.commercetools.api.models.product_tailoring.ProductVariantTailoring... variants) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.addAll(Arrays.asList(variants));
        return this;
    }

    /**
     *  <p>The variants of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder plusVariants(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder> builder) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.add(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The variants of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder withVariants(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder> builder) {
        this.variants = new ArrayList<>();
        this.variants.add(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The variants of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder addVariants(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoring> builder) {
        return plusVariants(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder.of()));
    }

    /**
     *  <p>The variants of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder setVariants(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoring> builder) {
        return variants(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder.of()));
    }

    /**
     *  <p><code>true</code> if the ProductTailoring is published.</p>
     * @param published value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessagePayloadBuilder published(final Boolean published) {
        this.published = published;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Product Tailoring.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @return store
     */

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p>User-defined unique identifier of the Product this Product Tailoring belongs to.</p>
     * @return productKey
     */

    @Nullable
    public String getProductKey() {
        return this.productKey;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p>The description of the Product Tailoring at the time of creation.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>The name of the Product Tailoring at the time of creation.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>The slug of the Product Tailoring at the time of creation.</p>
     * @return slug
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>The metaTitle of the Product Tailoring at the time of creation.</p>
     * @return metaTitle
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>The metaDescription of the Product Tailoring at the time of creation.</p>
     * @return metaDescription
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>The metaKeywords of the Product Tailoring at the time of creation.</p>
     * @return metaKeywords
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>The variants of the Product Tailoring at the time of creation.</p>
     * @return variants
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.product_tailoring.ProductVariantTailoring> getVariants() {
        return this.variants;
    }

    /**
     *  <p><code>true</code> if the ProductTailoring is published.</p>
     * @return published
     */

    public Boolean getPublished() {
        return this.published;
    }

    /**
     * builds ProductTailoringCreatedMessagePayload with checking for non-null required values
     * @return ProductTailoringCreatedMessagePayload
     */
    public ProductTailoringCreatedMessagePayload build() {
        Objects.requireNonNull(store, ProductTailoringCreatedMessagePayload.class + ": store is missing");
        Objects.requireNonNull(product, ProductTailoringCreatedMessagePayload.class + ": product is missing");
        Objects.requireNonNull(published, ProductTailoringCreatedMessagePayload.class + ": published is missing");
        return new ProductTailoringCreatedMessagePayloadImpl(key, store, productKey, product, description, name, slug,
            metaTitle, metaDescription, metaKeywords, variants, published);
    }

    /**
     * builds ProductTailoringCreatedMessagePayload without checking for non-null required values
     * @return ProductTailoringCreatedMessagePayload
     */
    public ProductTailoringCreatedMessagePayload buildUnchecked() {
        return new ProductTailoringCreatedMessagePayloadImpl(key, store, productKey, product, description, name, slug,
            metaTitle, metaDescription, metaKeywords, variants, published);
    }

    /**
     * factory method for an instance of ProductTailoringCreatedMessagePayloadBuilder
     * @return builder
     */
    public static ProductTailoringCreatedMessagePayloadBuilder of() {
        return new ProductTailoringCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductTailoringCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringCreatedMessagePayloadBuilder of(
            final ProductTailoringCreatedMessagePayload template) {
        ProductTailoringCreatedMessagePayloadBuilder builder = new ProductTailoringCreatedMessagePayloadBuilder();
        builder.key = template.getKey();
        builder.store = template.getStore();
        builder.productKey = template.getProductKey();
        builder.product = template.getProduct();
        builder.description = template.getDescription();
        builder.name = template.getName();
        builder.slug = template.getSlug();
        builder.metaTitle = template.getMetaTitle();
        builder.metaDescription = template.getMetaDescription();
        builder.metaKeywords = template.getMetaKeywords();
        builder.variants = template.getVariants();
        builder.published = template.getPublished();
        return builder;
    }

}
