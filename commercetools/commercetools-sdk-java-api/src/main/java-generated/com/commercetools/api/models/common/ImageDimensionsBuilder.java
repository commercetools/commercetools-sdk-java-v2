
package com.commercetools.api.models.common;

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
 *             .w(0.3)
 *             .h(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImageDimensionsBuilder implements Builder<ImageDimensions> {

    private Integer w;

    private Integer h;

    /**
     *  <p>Width of the image.</p>
     */

    public ImageDimensionsBuilder w(final Integer w) {
        this.w = w;
        return this;
    }

    /**
     *  <p>Height of the image.</p>
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

    public ImageDimensions build() {
        Objects.requireNonNull(w, ImageDimensions.class + ": w is missing");
        Objects.requireNonNull(h, ImageDimensions.class + ": h is missing");
        return new ImageDimensionsImpl(w, h);
    }

    /**
     * builds ImageDimensions without checking for non null required values
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
