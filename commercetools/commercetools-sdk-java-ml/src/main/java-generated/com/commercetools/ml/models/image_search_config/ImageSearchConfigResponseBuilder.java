
package com.commercetools.ml.models.image_search_config;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImageSearchConfigResponseBuilder {

    private com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status;

    private java.time.ZonedDateTime lastModifiedAt;

    public ImageSearchConfigResponseBuilder status(
            final com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status) {
        this.status = status;
        return this;
    }

    public ImageSearchConfigResponseBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus getStatus() {
        return this.status;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public ImageSearchConfigResponse build() {
        return new ImageSearchConfigResponseImpl(status, lastModifiedAt);
    }

    public static ImageSearchConfigResponseBuilder of() {
        return new ImageSearchConfigResponseBuilder();
    }

    public static ImageSearchConfigResponseBuilder of(final ImageSearchConfigResponse template) {
        ImageSearchConfigResponseBuilder builder = new ImageSearchConfigResponseBuilder();
        builder.status = template.getStatus();
        builder.lastModifiedAt = template.getLastModifiedAt();
        return builder;
    }

}
