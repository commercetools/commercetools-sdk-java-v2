
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Image image = Image.builder()
 *             .url("{url}")
 *             .dimensions(dimensionsBuilder -> dimensionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImageBuilder implements Builder<Image> {

    private String url;

    private com.commercetools.api.models.common.ImageDimensions dimensions;

    @Nullable
    private String label;

    /**
     *  <p>URL of the image in its original size that must be unique within a single ProductVariant. If the Project is hosted in the China (AWS, Ningxia) Region, verify that the URL is not blocked due to firewall restrictions.</p>
     * @param url value to be set
     * @return Builder
     */

    public ImageBuilder url(final String url) {
        this.url = url;
        return this;
    }

    /**
     *  <p>Dimensions of the original image.</p>
     * @param builder function to build the dimensions value
     * @return Builder
     */

    public ImageBuilder dimensions(
            Function<com.commercetools.api.models.common.ImageDimensionsBuilder, com.commercetools.api.models.common.ImageDimensionsBuilder> builder) {
        this.dimensions = builder.apply(com.commercetools.api.models.common.ImageDimensionsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Dimensions of the original image.</p>
     * @param builder function to build the dimensions value
     * @return Builder
     */

    public ImageBuilder withDimensions(
            Function<com.commercetools.api.models.common.ImageDimensionsBuilder, com.commercetools.api.models.common.ImageDimensions> builder) {
        this.dimensions = builder.apply(com.commercetools.api.models.common.ImageDimensionsBuilder.of());
        return this;
    }

    /**
     *  <p>Dimensions of the original image.</p>
     * @param dimensions value to be set
     * @return Builder
     */

    public ImageBuilder dimensions(final com.commercetools.api.models.common.ImageDimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     *  <p>Custom label for the image.</p>
     * @param label value to be set
     * @return Builder
     */

    public ImageBuilder label(@Nullable final String label) {
        this.label = label;
        return this;
    }

    /**
     *  <p>URL of the image in its original size that must be unique within a single ProductVariant. If the Project is hosted in the China (AWS, Ningxia) Region, verify that the URL is not blocked due to firewall restrictions.</p>
     * @return url
     */

    public String getUrl() {
        return this.url;
    }

    /**
     *  <p>Dimensions of the original image.</p>
     * @return dimensions
     */

    public com.commercetools.api.models.common.ImageDimensions getDimensions() {
        return this.dimensions;
    }

    /**
     *  <p>Custom label for the image.</p>
     * @return label
     */

    @Nullable
    public String getLabel() {
        return this.label;
    }

    /**
     * builds Image with checking for non-null required values
     * @return Image
     */
    public Image build() {
        Objects.requireNonNull(url, Image.class + ": url is missing");
        Objects.requireNonNull(dimensions, Image.class + ": dimensions is missing");
        return new ImageImpl(url, dimensions, label);
    }

    /**
     * builds Image without checking for non-null required values
     * @return Image
     */
    public Image buildUnchecked() {
        return new ImageImpl(url, dimensions, label);
    }

    /**
     * factory method for an instance of ImageBuilder
     * @return builder
     */
    public static ImageBuilder of() {
        return new ImageBuilder();
    }

    /**
     * create builder for Image instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImageBuilder of(final Image template) {
        ImageBuilder builder = new ImageBuilder();
        builder.url = template.getUrl();
        builder.dimensions = template.getDimensions();
        builder.label = template.getLabel();
        return builder;
    }

}
