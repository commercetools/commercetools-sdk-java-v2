
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantSetImagesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetImagesAction variantSetImagesAction = VariantSetImagesAction.builder()
 *             .plusImages(imagesBuilder -> imagesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetImagesActionBuilder implements Builder<VariantSetImagesAction> {

    private java.util.List<com.commercetools.api.models.common.Image> images;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Images to set for the Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantSetImagesActionBuilder images(final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images to set for the Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantSetImagesActionBuilder images(
            final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>Images to set for the Variant.</p>
     * @param images value to be set
     * @return Builder
     */

    public VariantSetImagesActionBuilder plusImages(final com.commercetools.api.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images to set for the Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantSetImagesActionBuilder plusImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images to set for the Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantSetImagesActionBuilder withImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images to set for the Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantSetImagesActionBuilder addImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return plusImages(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Images to set for the Variant.</p>
     * @param builder function to build the images value
     * @return Builder
     */

    public VariantSetImagesActionBuilder setImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        return images(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Whether only the staged images are updated. If <code>false</code>, both the current and staged images are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantSetImagesActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Images to set for the Variant.</p>
     * @return images
     */

    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Whether only the staged images are updated. If <code>false</code>, both the current and staged images are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds VariantSetImagesAction with checking for non-null required values
     * @return VariantSetImagesAction
     */
    public VariantSetImagesAction build() {
        Objects.requireNonNull(images, VariantSetImagesAction.class + ": images is missing");
        return new VariantSetImagesActionImpl(images, staged);
    }

    /**
     * builds VariantSetImagesAction without checking for non-null required values
     * @return VariantSetImagesAction
     */
    public VariantSetImagesAction buildUnchecked() {
        return new VariantSetImagesActionImpl(images, staged);
    }

    /**
     * factory method for an instance of VariantSetImagesActionBuilder
     * @return builder
     */
    public static VariantSetImagesActionBuilder of() {
        return new VariantSetImagesActionBuilder();
    }

    /**
     * create builder for VariantSetImagesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetImagesActionBuilder of(final VariantSetImagesAction template) {
        VariantSetImagesActionBuilder builder = new VariantSetImagesActionBuilder();
        builder.images = template.getImages();
        builder.staged = template.getStaged();
        return builder;
    }

}
