
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

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
 *             .label("{label}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImageBuilder implements Builder<Image> {

    private String url;

    private com.commercetools.history.models.common.ImageDimensions dimensions;

    private String label;

    /**
     * set the value to the url
     * @param url value to be set
     * @return Builder
     */

    public ImageBuilder url(final String url) {
        this.url = url;
        return this;
    }

    /**
     * set the value to the dimensions using the builder function
     * @param builder function to build the dimensions value
     * @return Builder
     */

    public ImageBuilder dimensions(
            Function<com.commercetools.history.models.common.ImageDimensionsBuilder, com.commercetools.history.models.common.ImageDimensionsBuilder> builder) {
        this.dimensions = builder.apply(com.commercetools.history.models.common.ImageDimensionsBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the dimensions
     * @param dimensions value to be set
     * @return Builder
     */

    public ImageBuilder dimensions(final com.commercetools.history.models.common.ImageDimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * set the value to the label
     * @param label value to be set
     * @return Builder
     */

    public ImageBuilder label(final String label) {
        this.label = label;
        return this;
    }

    /**
     * value of url}
     * @return url
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * value of dimensions}
     * @return dimensions
     */

    public com.commercetools.history.models.common.ImageDimensions getDimensions() {
        return this.dimensions;
    }

    /**
     * value of label}
     * @return label
     */

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
        Objects.requireNonNull(label, Image.class + ": label is missing");
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
