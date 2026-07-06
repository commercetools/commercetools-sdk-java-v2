
package com.commercetools.importapi.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringImport productTailoringImport = ProductTailoringImport.builder()
 *             .key("{key}")
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringImportBuilder implements Builder<ProductTailoringImport> {

    private String key;

    private com.commercetools.importapi.models.common.StoreKeyReference store;

    private com.commercetools.importapi.models.common.ProductKeyReference product;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString description;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString metaTitle;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString metaDescription;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString metaKeywords;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString slug;

    @Nullable
    private Boolean publish;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImport> variants;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    /**
     *  <p>User-defined unique identifier. If a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> with this <code>key</code> exists, it is updated with the imported data.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductTailoringImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The Store to which the ProductTailoring belongs. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Store is created.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductTailoringImportBuilder store(
            Function<com.commercetools.importapi.models.common.StoreKeyReferenceBuilder, com.commercetools.importapi.models.common.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.importapi.models.common.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Store to which the ProductTailoring belongs. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Store is created.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductTailoringImportBuilder withStore(
            Function<com.commercetools.importapi.models.common.StoreKeyReferenceBuilder, com.commercetools.importapi.models.common.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.importapi.models.common.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Store to which the ProductTailoring belongs. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Store is created.</p>
     * @param store value to be set
     * @return Builder
     */

    public ProductTailoringImportBuilder store(
            final com.commercetools.importapi.models.common.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>The Product to which the ProductTailoring belongs. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringImportBuilder product(
            Function<com.commercetools.importapi.models.common.ProductKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductKeyReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.importapi.models.common.ProductKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Product to which the ProductTailoring belongs. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringImportBuilder withProduct(
            Function<com.commercetools.importapi.models.common.ProductKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductKeyReference> builder) {
        this.product = builder.apply(com.commercetools.importapi.models.common.ProductKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Product to which the ProductTailoring belongs. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductTailoringImportBuilder product(
            final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.name</code>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductTailoringImportBuilder name(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.name</code>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductTailoringImportBuilder withName(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.name</code>.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductTailoringImportBuilder name(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.description</code>.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductTailoringImportBuilder description(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.description</code>.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductTailoringImportBuilder withDescription(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.description</code>.</p>
     * @param description value to be set
     * @return Builder
     */

    public ProductTailoringImportBuilder description(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.metaTitle</code>.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductTailoringImportBuilder metaTitle(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.metaTitle</code>.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductTailoringImportBuilder withMetaTitle(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.metaTitle = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.metaTitle</code>.</p>
     * @param metaTitle value to be set
     * @return Builder
     */

    public ProductTailoringImportBuilder metaTitle(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.metaDescription</code>.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductTailoringImportBuilder metaDescription(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.metaDescription</code>.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductTailoringImportBuilder withMetaDescription(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.metaDescription = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.metaDescription</code>.</p>
     * @param metaDescription value to be set
     * @return Builder
     */

    public ProductTailoringImportBuilder metaDescription(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.metaKeywords</code>.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductTailoringImportBuilder metaKeywords(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.metaKeywords</code>.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductTailoringImportBuilder withMetaKeywords(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.metaKeywords = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.metaKeywords</code>.</p>
     * @param metaKeywords value to be set
     * @return Builder
     */

    public ProductTailoringImportBuilder metaKeywords(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.slug</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductTailoringImportBuilder slug(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.slug</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductTailoringImportBuilder withSlug(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.slug = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.slug</code>.</p>
     * @param slug value to be set
     * @return Builder
     */

    public ProductTailoringImportBuilder slug(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>Set to <code>true</code> to publish the ProductTailoring immediately. Otherwise, the tailored product information is just staged.</p>
     * @param publish value to be set
     * @return Builder
     */

    public ProductTailoringImportBuilder publish(@Nullable final Boolean publish) {
        this.publish = publish;
        return this;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductTailoringImportBuilder variants(
            @Nullable final com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImport... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
        return this;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductTailoringImportBuilder variants(
            @Nullable final java.util.List<com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImport> variants) {
        this.variants = variants;
        return this;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductTailoringImportBuilder plusVariants(
            @Nullable final com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImport... variants) {
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

    public ProductTailoringImportBuilder plusVariants(
            Function<com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImportBuilder, com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImportBuilder> builder) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.add(builder
                .apply(com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImportBuilder.of())
                .build());
        return this;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductTailoringImportBuilder withVariants(
            Function<com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImportBuilder, com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImportBuilder> builder) {
        this.variants = new ArrayList<>();
        this.variants.add(builder
                .apply(com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImportBuilder.of())
                .build());
        return this;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductTailoringImportBuilder addVariants(
            Function<com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImportBuilder, com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImport> builder) {
        return plusVariants(builder
                .apply(com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImportBuilder.of()));
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductTailoringImportBuilder setVariants(
            Function<com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImportBuilder, com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImport> builder) {
        return variants(builder
                .apply(com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImportBuilder.of()));
    }

    /**
     *  <p>Attributes of the tailored Product.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductTailoringImportBuilder attributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductTailoringImportBuilder attributes(
            @Nullable final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductTailoringImportBuilder plusAttributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductTailoringImportBuilder plusAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductTailoringImportBuilder withAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        this.attributes = new ArrayList<>();
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>User-defined unique identifier. If a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> with this <code>key</code> exists, it is updated with the imported data.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The Store to which the ProductTailoring belongs. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Store is created.</p>
     * @return store
     */

    public com.commercetools.importapi.models.common.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p>The Product to which the ProductTailoring belongs. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @return product
     */

    public com.commercetools.importapi.models.common.ProductKeyReference getProduct() {
        return this.product;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.name</code>.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.description</code>.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.metaTitle</code>.</p>
     * @return metaTitle
     */

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.metaDescription</code>.</p>
     * @return metaDescription
     */

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.metaKeywords</code>.</p>
     * @return metaKeywords
     */

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.slug</code>.</p>
     * @return slug
     */

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>Set to <code>true</code> to publish the ProductTailoring immediately. Otherwise, the tailored product information is just staged.</p>
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
    public java.util.List<com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImport> getVariants() {
        return this.variants;
    }

    /**
     *  <p>Attributes of the tailored Product.</p>
     * @return attributes
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     * builds ProductTailoringImport with checking for non-null required values
     * @return ProductTailoringImport
     */
    public ProductTailoringImport build() {
        Objects.requireNonNull(key, ProductTailoringImport.class + ": key is missing");
        Objects.requireNonNull(store, ProductTailoringImport.class + ": store is missing");
        Objects.requireNonNull(product, ProductTailoringImport.class + ": product is missing");
        return new ProductTailoringImportImpl(key, store, product, name, description, metaTitle, metaDescription,
            metaKeywords, slug, publish, variants, attributes);
    }

    /**
     * builds ProductTailoringImport without checking for non-null required values
     * @return ProductTailoringImport
     */
    public ProductTailoringImport buildUnchecked() {
        return new ProductTailoringImportImpl(key, store, product, name, description, metaTitle, metaDescription,
            metaKeywords, slug, publish, variants, attributes);
    }

    /**
     * factory method for an instance of ProductTailoringImportBuilder
     * @return builder
     */
    public static ProductTailoringImportBuilder of() {
        return new ProductTailoringImportBuilder();
    }

    /**
     * create builder for ProductTailoringImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringImportBuilder of(final ProductTailoringImport template) {
        ProductTailoringImportBuilder builder = new ProductTailoringImportBuilder();
        builder.key = template.getKey();
        builder.store = template.getStore();
        builder.product = template.getProduct();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.metaTitle = template.getMetaTitle();
        builder.metaDescription = template.getMetaDescription();
        builder.metaKeywords = template.getMetaKeywords();
        builder.slug = template.getSlug();
        builder.publish = template.getPublish();
        builder.variants = template.getVariants();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
