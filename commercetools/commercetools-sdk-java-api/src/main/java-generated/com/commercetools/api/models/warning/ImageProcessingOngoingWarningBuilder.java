
package com.commercetools.api.models.warning;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImageProcessingOngoingWarningBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImageProcessingOngoingWarning imageProcessingOngoingWarning = ImageProcessingOngoingWarning.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImageProcessingOngoingWarningBuilder implements Builder<ImageProcessingOngoingWarning> {

    private String message;

    /**
     *  <p><code>"The image processing is still ongoing."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ImageProcessingOngoingWarningBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p><code>"The image processing is still ongoing."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds ImageProcessingOngoingWarning with checking for non-null required values
     * @return ImageProcessingOngoingWarning
     */
    public ImageProcessingOngoingWarning build() {
        Objects.requireNonNull(message, ImageProcessingOngoingWarning.class + ": message is missing");
        return new ImageProcessingOngoingWarningImpl(message);
    }

    /**
     * builds ImageProcessingOngoingWarning without checking for non-null required values
     * @return ImageProcessingOngoingWarning
     */
    public ImageProcessingOngoingWarning buildUnchecked() {
        return new ImageProcessingOngoingWarningImpl(message);
    }

    /**
     * factory method for an instance of ImageProcessingOngoingWarningBuilder
     * @return builder
     */
    public static ImageProcessingOngoingWarningBuilder of() {
        return new ImageProcessingOngoingWarningBuilder();
    }

    /**
     * create builder for ImageProcessingOngoingWarning instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImageProcessingOngoingWarningBuilder of(final ImageProcessingOngoingWarning template) {
        ImageProcessingOngoingWarningBuilder builder = new ImageProcessingOngoingWarningBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
