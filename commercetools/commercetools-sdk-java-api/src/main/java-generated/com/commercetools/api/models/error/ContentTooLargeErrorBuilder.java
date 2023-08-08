
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ContentTooLargeErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ContentTooLargeError contentTooLargeError = ContentTooLargeError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ContentTooLargeErrorBuilder implements Builder<ContentTooLargeError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"Content too large."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ContentTooLargeErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public ContentTooLargeErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ContentTooLargeErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"Content too large."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     * builds ContentTooLargeError with checking for non-null required values
     * @return ContentTooLargeError
     */
    public ContentTooLargeError build() {
        Objects.requireNonNull(message, ContentTooLargeError.class + ": message is missing");
        return new ContentTooLargeErrorImpl(message, values);
    }

    /**
     * builds ContentTooLargeError without checking for non-null required values
     * @return ContentTooLargeError
     */
    public ContentTooLargeError buildUnchecked() {
        return new ContentTooLargeErrorImpl(message, values);
    }

    /**
     * factory method for an instance of ContentTooLargeErrorBuilder
     * @return builder
     */
    public static ContentTooLargeErrorBuilder of() {
        return new ContentTooLargeErrorBuilder();
    }

    /**
     * create builder for ContentTooLargeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ContentTooLargeErrorBuilder of(final ContentTooLargeError template) {
        ContentTooLargeErrorBuilder builder = new ContentTooLargeErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
