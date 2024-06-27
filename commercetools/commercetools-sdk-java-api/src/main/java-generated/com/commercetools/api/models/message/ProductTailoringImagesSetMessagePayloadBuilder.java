
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringImagesSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringImagesSetMessagePayload productTailoringImagesSetMessagePayload = ProductTailoringImagesSetMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .variantId(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringImagesSetMessagePayloadBuilder
        implements Builder<ProductTailoringImagesSetMessagePayload> {

    private com.commercetools.api.models.store.StoreKeyReference store;

    @Nullable
    private String productKey;

    private com.commercetools.api.models.product.ProductReference product;

    private Long variantId;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Image> oldImages;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Image> images;

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param store value to be set
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder store(
            final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p><code>key</code> of the tailored Product.</p>
     * @param productKey value to be set
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder productKey(@Nullable final String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p><code>id</code> of the tailored Product Variant.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Images on the tailored Product Variant before the Set Images update action.</p>
     * @param oldImages value to be set
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder oldImages(
            @Nullable final com.commercetools.api.models.common.Image... oldImages) {
        this.oldImages = new ArrayList<>(Arrays.asList(oldImages));
        return this;
    }

    /**
     *  <p>Images on the tailored Product Variant before the Set Images update action.</p>
     * @param oldImages value to be set
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder oldImages(
            @Nullable final java.util.List<com.commercetools.api.models.common.Image> oldImages) {
        this.oldImages = oldImages;
        return this;
    }

    /**
     *  <p>Images on the tailored Product Variant before the Set Images update action.</p>
     * @param oldImages value to be set
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder plusOldImages(
            @Nullable final com.commercetools.api.models.common.Image... oldImages) {
        if (this.oldImages == null) {
            this.oldImages = new ArrayList<>();
        }
        this.oldImages.addAll(Arrays.asList(oldImages));
        return this;
    }

    /**
     *  <p>Images on the tailored Product Variant before the Set Images update action.</p>
     * @param builder function to build the oldImages value
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder plusOldImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        if (this.oldImages == null) {
            this.oldImages = new ArrayList<>();
        }
        this.oldImages.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images on the tailored Product Variant before the Set Images update action.</p>
     * @param builder function to build the oldImages value
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder withOldImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.oldImages = new ArrayList<>();
        this.oldImages.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images on the tailored Product Variant before the Set Images update action.</p>
     * @param builder function to build the oldImages value
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder addOldImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return plusOldImages(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Images on the tailored Product Variant before the Set Images update action.</p>
     * @param builder function to build the oldImages value
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder setOldImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return oldImages(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Images on the tailored Product Variant after the Set Images update action.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder images(
            @Nullable final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images on the tailored Product Variant after the Set Images update action.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder images(
            @Nullable final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>Images on the tailored Product Variant after the Set Images update action.</p>
     * @param images value to be set
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder plusImages(
            @Nullable final com.commercetools.api.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images on the tailored Product Variant after the Set Images update action.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder plusImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images on the tailored Product Variant after the Set Images update action.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder withImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images on the tailored Product Variant after the Set Images update action.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder addImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Images on the tailored Product Variant after the Set Images update action.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public ProductTailoringImagesSetMessagePayloadBuilder setImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @return store
     */

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p><code>key</code> of the tailored Product.</p>
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
     *  <p><code>id</code> of the tailored Product Variant.</p>
     * @return variantId
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Images on the tailored Product Variant before the Set Images update action.</p>
     * @return oldImages
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Image> getOldImages() {
        return this.oldImages;
    }

    /**
     *  <p>Images on the tailored Product Variant after the Set Images update action.</p>
     * @return images
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     * builds ProductTailoringImagesSetMessagePayload with checking for non-null required values
     * @return ProductTailoringImagesSetMessagePayload
     */
    public ProductTailoringImagesSetMessagePayload build() {
        Objects.requireNonNull(store, ProductTailoringImagesSetMessagePayload.class + ": store is missing");
        Objects.requireNonNull(product, ProductTailoringImagesSetMessagePayload.class + ": product is missing");
        Objects.requireNonNull(variantId, ProductTailoringImagesSetMessagePayload.class + ": variantId is missing");
        return new ProductTailoringImagesSetMessagePayloadImpl(store, productKey, product, variantId, oldImages,
            images);
    }

    /**
     * builds ProductTailoringImagesSetMessagePayload without checking for non-null required values
     * @return ProductTailoringImagesSetMessagePayload
     */
    public ProductTailoringImagesSetMessagePayload buildUnchecked() {
        return new ProductTailoringImagesSetMessagePayloadImpl(store, productKey, product, variantId, oldImages,
            images);
    }

    /**
     * factory method for an instance of ProductTailoringImagesSetMessagePayloadBuilder
     * @return builder
     */
    public static ProductTailoringImagesSetMessagePayloadBuilder of() {
        return new ProductTailoringImagesSetMessagePayloadBuilder();
    }

    /**
     * create builder for ProductTailoringImagesSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringImagesSetMessagePayloadBuilder of(
            final ProductTailoringImagesSetMessagePayload template) {
        ProductTailoringImagesSetMessagePayloadBuilder builder = new ProductTailoringImagesSetMessagePayloadBuilder();
        builder.store = template.getStore();
        builder.productKey = template.getProductKey();
        builder.product = template.getProduct();
        builder.variantId = template.getVariantId();
        builder.oldImages = template.getOldImages();
        builder.images = template.getImages();
        return builder;
    }

}
