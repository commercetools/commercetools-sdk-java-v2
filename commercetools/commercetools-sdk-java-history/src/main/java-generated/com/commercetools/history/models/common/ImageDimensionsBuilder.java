
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImageDimensionsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImageDimensions imageDimensions = ImageDimensions.builder()
 *             .w(1)
 *             .h(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImageDimensionsBuilder implements Builder<ImageDimensions> {

    private Integer w;

    private Integer h;

    /**
     *
     * @param w value to be set
     * @return Builder
     */

    public ImageDimensionsBuilder w(final Integer w) {
        this.w = w;
        return this;
    }

    /**
     *
     * @param h value to be set
     * @return Builder
     */

    public ImageDimensionsBuilder h(final Integer h) {
        this.h = h;
        return this;
    }

    public Integer getW() {
        return this.w;
    }

    public Integer getH() {
        return this.h;
    }

    /**
     * builds ImageDimensions with checking for non-null required values
     * @return ImageDimensions
     */
    public ImageDimensions build() {
        Objects.requireNonNull(w, ImageDimensions.class + ": w is missing");
        Objects.requireNonNull(h, ImageDimensions.class + ": h is missing");
        return new ImageDimensionsImpl(w, h);
    }

    /**
     * builds ImageDimensions without checking for non-null required values
     * @return ImageDimensions
     */
    public ImageDimensions buildUnchecked() {
        return new ImageDimensionsImpl(w, h);
    }

    public static ImageDimensionsBuilder of() {
        return new ImageDimensionsBuilder();
    }

    public static ImageDimensionsBuilder of(final ImageDimensions template) {
        ImageDimensionsBuilder builder = new ImageDimensionsBuilder();
        builder.w = template.getW();
        builder.h = template.getH();
        return builder;
    }

}
