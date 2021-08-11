
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImageDimensionsBuilder implements Builder<ImageDimensions> {

    private Integer w;

    private Integer h;

    public ImageDimensionsBuilder w(final Integer w) {
        this.w = w;
        return this;
    }

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
