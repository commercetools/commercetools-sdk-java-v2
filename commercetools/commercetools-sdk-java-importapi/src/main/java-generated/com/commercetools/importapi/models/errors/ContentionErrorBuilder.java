
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ContentionErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ContentionError contentionError = ContentionError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ContentionErrorBuilder implements Builder<ContentionError> {

    private String message;

    /**
     *  <p>A plain language description of the cause of an error.</p>
     * @param message value to be set
     * @return Builder
     */

    public ContentionErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>A plain language description of the cause of an error.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds ContentionError with checking for non-null required values
     * @return ContentionError
     */
    public ContentionError build() {
        Objects.requireNonNull(message, ContentionError.class + ": message is missing");
        return new ContentionErrorImpl(message);
    }

    /**
     * builds ContentionError without checking for non-null required values
     * @return ContentionError
     */
    public ContentionError buildUnchecked() {
        return new ContentionErrorImpl(message);
    }

    /**
     * factory method for an instance of ContentionErrorBuilder
     * @return builder
     */
    public static ContentionErrorBuilder of() {
        return new ContentionErrorBuilder();
    }

    /**
     * create builder for ContentionError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ContentionErrorBuilder of(final ContentionError template) {
        ContentionErrorBuilder builder = new ContentionErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
