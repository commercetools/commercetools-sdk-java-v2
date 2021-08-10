
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImageBuilder implements Builder<Image> {

    private String url;

    private com.commercetools.history.models.common.ImageDimensions dimensions;

    private String label;

    public ImageBuilder url(final String url) {
        this.url = url;
        return this;
    }

    public ImageBuilder dimensions(final com.commercetools.history.models.common.ImageDimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public ImageBuilder label(final String label) {
        this.label = label;
        return this;
    }

    public String getUrl() {
        return this.url;
    }

    public com.commercetools.history.models.common.ImageDimensions getDimensions() {
        return this.dimensions;
    }

    public String getLabel() {
        return this.label;
    }

    public Image build() {
        Objects.requireNonNull(url);
        Objects.requireNonNull(dimensions);
        Objects.requireNonNull(label);
        return new ImageImpl(url, dimensions, label);
    }

    /**
     * builds Image without checking for non null required values
     */
    public Image buildUnchecked() {
        return new ImageImpl(url, dimensions, label);
    }

    public static ImageBuilder of() {
        return new ImageBuilder();
    }

    public static ImageBuilder of(final Image template) {
        ImageBuilder builder = new ImageBuilder();
        builder.url = template.getUrl();
        builder.dimensions = template.getDimensions();
        builder.label = template.getLabel();
        return builder;
    }

}
