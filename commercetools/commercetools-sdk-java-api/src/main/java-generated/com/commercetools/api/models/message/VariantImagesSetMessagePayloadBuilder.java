
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantImagesSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantImagesSetMessagePayload variantImagesSetMessagePayload = VariantImagesSetMessagePayload.builder()
 *             .plusImages(imagesBuilder -> imagesBuilder)
 *             .plusOldImages(oldImagesBuilder -> oldImagesBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantImagesSetMessagePayloadBuilder implements Builder<VariantImagesSetMessagePayload> {

    private java.util.List<com.commercetools.api.models.common.Image> images;

    private java.util.List<com.commercetools.api.models.common.Image> oldImages;

    private Boolean staged;

    /**
     *  <p>The images that were set on the Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantImagesSetMessagePayloadBuilder images(final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>The images that were set on the Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantImagesSetMessagePayloadBuilder images(
            final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>The images that were set on the Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantImagesSetMessagePayloadBuilder plusImages(final com.commercetools.api.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>The images that were set on the Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantImagesSetMessagePayloadBuilder plusImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The images that were set on the Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantImagesSetMessagePayloadBuilder withImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The images that were set on the Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantImagesSetMessagePayloadBuilder addImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>The images that were set on the Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantImagesSetMessagePayloadBuilder setImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>The previous images of the Variant.</p>
     * @param oldImages value to be set
     * @return Builder
     */

    public VariantImagesSetMessagePayloadBuilder oldImages(
            final com.commercetools.api.models.common.Image... oldImages) {
        this.oldImages = new ArrayList<>(Arrays.asList(oldImages));
        return this;
    }

    /**
     *  <p>The previous images of the Variant.</p>
     * @param oldImages value to be set
     * @return Builder
     */

    public VariantImagesSetMessagePayloadBuilder oldImages(
            final java.util.List<com.commercetools.api.models.common.Image> oldImages) {
        this.oldImages = oldImages;
        return this;
    }

    /**
     *  <p>The previous images of the Variant.</p>
     * @param oldImages value to be set
     * @return Builder
     */

    public VariantImagesSetMessagePayloadBuilder plusOldImages(
            final com.commercetools.api.models.common.Image... oldImages) {
        if (this.oldImages == null) {
            this.oldImages = new ArrayList<>();
        }
        this.oldImages.addAll(Arrays.asList(oldImages));
        return this;
    }

    /**
     *  <p>The previous images of the Variant.</p>
     * @param builder function to build the oldImages value
     * @return Builder
     */

    public VariantImagesSetMessagePayloadBuilder plusOldImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        if (this.oldImages == null) {
            this.oldImages = new ArrayList<>();
        }
        this.oldImages.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The previous images of the Variant.</p>
     * @param builder function to build the oldImages value
     * @return Builder
     */

    public VariantImagesSetMessagePayloadBuilder withOldImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.oldImages = new ArrayList<>();
        this.oldImages.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The previous images of the Variant.</p>
     * @param builder function to build the oldImages value
     * @return Builder
     */

    public VariantImagesSetMessagePayloadBuilder addOldImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return plusOldImages(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>The previous images of the Variant.</p>
     * @param builder function to build the oldImages value
     * @return Builder
     */

    public VariantImagesSetMessagePayloadBuilder setOldImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return oldImages(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Whether the update was only applied to the staged Variant.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantImagesSetMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The images that were set on the Variant.</p>
     * @return images
     */

    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>The previous images of the Variant.</p>
     * @return oldImages
     */

    public java.util.List<com.commercetools.api.models.common.Image> getOldImages() {
        return this.oldImages;
    }

    /**
     *  <p>Whether the update was only applied to the staged Variant.</p>
     * @return staged
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds VariantImagesSetMessagePayload with checking for non-null required values
     * @return VariantImagesSetMessagePayload
     */
    public VariantImagesSetMessagePayload build() {
        Objects.requireNonNull(images, VariantImagesSetMessagePayload.class + ": images is missing");
        Objects.requireNonNull(oldImages, VariantImagesSetMessagePayload.class + ": oldImages is missing");
        Objects.requireNonNull(staged, VariantImagesSetMessagePayload.class + ": staged is missing");
        return new VariantImagesSetMessagePayloadImpl(images, oldImages, staged);
    }

    /**
     * builds VariantImagesSetMessagePayload without checking for non-null required values
     * @return VariantImagesSetMessagePayload
     */
    public VariantImagesSetMessagePayload buildUnchecked() {
        return new VariantImagesSetMessagePayloadImpl(images, oldImages, staged);
    }

    /**
     * factory method for an instance of VariantImagesSetMessagePayloadBuilder
     * @return builder
     */
    public static VariantImagesSetMessagePayloadBuilder of() {
        return new VariantImagesSetMessagePayloadBuilder();
    }

    /**
     * create builder for VariantImagesSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantImagesSetMessagePayloadBuilder of(final VariantImagesSetMessagePayload template) {
        VariantImagesSetMessagePayloadBuilder builder = new VariantImagesSetMessagePayloadBuilder();
        builder.images = template.getImages();
        builder.oldImages = template.getOldImages();
        builder.staged = template.getStaged();
        return builder;
    }

}
