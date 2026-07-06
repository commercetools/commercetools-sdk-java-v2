
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantAddExternalImageActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantAddExternalImageAction variantAddExternalImageAction = VariantAddExternalImageAction.builder()
 *             .image(imageBuilder -> imageBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantAddExternalImageActionBuilder implements Builder<VariantAddExternalImageAction> {

    private com.commercetools.api.models.common.Image image;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Value to add to <code>images</code>.</p>
     * @param builder function to build the image value
     * @return Builder
     */

    public VariantAddExternalImageActionBuilder image(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.image = builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to add to <code>images</code>.</p>
     * @param builder function to build the image value
     * @return Builder
     */

    public VariantAddExternalImageActionBuilder withImage(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.Image> builder) {
        this.image = builder.apply(com.commercetools.api.models.common.ImageBuilder.of());
        return this;
    }

    /**
     *  <p>Value to add to <code>images</code>.</p>
     * @param image value to be set
     * @return Builder
     */

    public VariantAddExternalImageActionBuilder image(final com.commercetools.api.models.common.Image image) {
        this.image = image;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantAddExternalImageActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Value to add to <code>images</code>.</p>
     * @return image
     */

    public com.commercetools.api.models.common.Image getImage() {
        return this.image;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds VariantAddExternalImageAction with checking for non-null required values
     * @return VariantAddExternalImageAction
     */
    public VariantAddExternalImageAction build() {
        Objects.requireNonNull(image, VariantAddExternalImageAction.class + ": image is missing");
        return new VariantAddExternalImageActionImpl(image, staged);
    }

    /**
     * builds VariantAddExternalImageAction without checking for non-null required values
     * @return VariantAddExternalImageAction
     */
    public VariantAddExternalImageAction buildUnchecked() {
        return new VariantAddExternalImageActionImpl(image, staged);
    }

    /**
     * factory method for an instance of VariantAddExternalImageActionBuilder
     * @return builder
     */
    public static VariantAddExternalImageActionBuilder of() {
        return new VariantAddExternalImageActionBuilder();
    }

    /**
     * create builder for VariantAddExternalImageAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantAddExternalImageActionBuilder of(final VariantAddExternalImageAction template) {
        VariantAddExternalImageActionBuilder builder = new VariantAddExternalImageActionBuilder();
        builder.image = template.getImage();
        builder.staged = template.getStaged();
        return builder;
    }

}
