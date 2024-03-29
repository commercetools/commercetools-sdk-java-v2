
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionNoResponseErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionNoResponseError extensionNoResponseError = ExtensionNoResponseError.builder()
 *             .message("{message}")
 *             .extensionId("{extensionId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionNoResponseErrorBuilder implements Builder<ExtensionNoResponseError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String extensionId;

    @Nullable
    private String extensionKey;

    /**
     *  <p><code>"Extension did not respond in time."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ExtensionNoResponseErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public ExtensionNoResponseErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ExtensionNoResponseErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Unique identifier of the API Extension.</p>
     * @param extensionId value to be set
     * @return Builder
     */

    public ExtensionNoResponseErrorBuilder extensionId(final String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the API Extension, if available.</p>
     * @param extensionKey value to be set
     * @return Builder
     */

    public ExtensionNoResponseErrorBuilder extensionKey(@Nullable final String extensionKey) {
        this.extensionKey = extensionKey;
        return this;
    }

    /**
     *  <p><code>"Extension did not respond in time."</code></p>
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
     *  <p>Unique identifier of the API Extension.</p>
     * @return extensionId
     */

    public String getExtensionId() {
        return this.extensionId;
    }

    /**
     *  <p>User-defined unique identifier of the API Extension, if available.</p>
     * @return extensionKey
     */

    @Nullable
    public String getExtensionKey() {
        return this.extensionKey;
    }

    /**
     * builds ExtensionNoResponseError with checking for non-null required values
     * @return ExtensionNoResponseError
     */
    public ExtensionNoResponseError build() {
        Objects.requireNonNull(message, ExtensionNoResponseError.class + ": message is missing");
        Objects.requireNonNull(extensionId, ExtensionNoResponseError.class + ": extensionId is missing");
        return new ExtensionNoResponseErrorImpl(message, values, extensionId, extensionKey);
    }

    /**
     * builds ExtensionNoResponseError without checking for non-null required values
     * @return ExtensionNoResponseError
     */
    public ExtensionNoResponseError buildUnchecked() {
        return new ExtensionNoResponseErrorImpl(message, values, extensionId, extensionKey);
    }

    /**
     * factory method for an instance of ExtensionNoResponseErrorBuilder
     * @return builder
     */
    public static ExtensionNoResponseErrorBuilder of() {
        return new ExtensionNoResponseErrorBuilder();
    }

    /**
     * create builder for ExtensionNoResponseError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionNoResponseErrorBuilder of(final ExtensionNoResponseError template) {
        ExtensionNoResponseErrorBuilder builder = new ExtensionNoResponseErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.extensionId = template.getExtensionId();
        builder.extensionKey = template.getExtensionKey();
        return builder;
    }

}
