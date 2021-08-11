
package com.commercetools.ml.models.image_search_config;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImageSearchConfigResponseBuilder implements Builder<ImageSearchConfigResponse> {

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
        Objects.requireNonNull(status, ImageSearchConfigResponse.class + ": status is missing");
        Objects.requireNonNull(lastModifiedAt, ImageSearchConfigResponse.class + ": lastModifiedAt is missing");
        return new ImageSearchConfigResponseImpl(status, lastModifiedAt);
    }

    /**
     * builds ImageSearchConfigResponse without checking for non null required values
     */
    public ImageSearchConfigResponse buildUnchecked() {
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
