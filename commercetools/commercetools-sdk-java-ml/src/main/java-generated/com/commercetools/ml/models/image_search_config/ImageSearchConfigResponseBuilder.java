
package com.commercetools.ml.models.image_search_config;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImageSearchConfigResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImageSearchConfigResponse imageSearchConfigResponse = ImageSearchConfigResponse.builder()
 *             .status(ImageSearchConfigStatus.ON)
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImageSearchConfigResponseBuilder implements Builder<ImageSearchConfigResponse> {

    private com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status;

    private java.time.ZonedDateTime lastModifiedAt;

    /**
     *  <p>The image search activation status.</p>
     * @param status value to be set
     * @return Builder
     */

    public ImageSearchConfigResponseBuilder status(
            final com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status) {
        this.status = status;
        return this;
    }

    /**
     *
     * @param lastModifiedAt value to be set
     * @return Builder
     */

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

    /**
     * builds ImageSearchConfigResponse with checking for non-null required values
     * @return ImageSearchConfigResponse
     */
    public ImageSearchConfigResponse build() {
        Objects.requireNonNull(status, ImageSearchConfigResponse.class + ": status is missing");
        Objects.requireNonNull(lastModifiedAt, ImageSearchConfigResponse.class + ": lastModifiedAt is missing");
        return new ImageSearchConfigResponseImpl(status, lastModifiedAt);
    }

    /**
     * builds ImageSearchConfigResponse without checking for non-null required values
     * @return ImageSearchConfigResponse
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
