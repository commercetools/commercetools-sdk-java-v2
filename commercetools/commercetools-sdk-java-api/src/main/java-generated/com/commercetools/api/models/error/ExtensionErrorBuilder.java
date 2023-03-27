
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionError extensionError = ExtensionError.builder()
 *             .code("{code}")
 *             .message("{message}")
 *             .extensionId("{extensionId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionErrorBuilder implements Builder<ExtensionError> {

    private String code;

    private String message;

    private String extensionId;

    @Nullable
    private String extensionKey;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error code caused by the Extension. For example, <code>InvalidField</code>.</p>
     * @param code value to be set
     * @return Builder
     */

    public ExtensionErrorBuilder code(final String code) {
        this.code = code;
        return this;
    }

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public ExtensionErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the Extension.</p>
     * @param extensionId value to be set
     * @return Builder
     */

    public ExtensionErrorBuilder extensionId(final String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     * @param extensionKey value to be set
     * @return Builder
     */

    public ExtensionErrorBuilder extensionKey(@Nullable final String extensionKey) {
        this.extensionKey = extensionKey;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public ExtensionErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ExtensionErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Error code caused by the Extension. For example, <code>InvalidField</code>.</p>
     * @return code
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Plain text description of the error.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Unique identifier of the Extension.</p>
     * @return extensionId
     */

    public String getExtensionId() {
        return this.extensionId;
    }

    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     * @return extensionKey
     */

    @Nullable
    public String getExtensionKey() {
        return this.extensionKey;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     * builds ExtensionError with checking for non-null required values
     * @return ExtensionError
     */
    public ExtensionError build() {
        Objects.requireNonNull(code, ExtensionError.class + ": code is missing");
        Objects.requireNonNull(message, ExtensionError.class + ": message is missing");
        Objects.requireNonNull(extensionId, ExtensionError.class + ": extensionId is missing");
        return new ExtensionErrorImpl(code, message, extensionId, extensionKey, values);
    }

    /**
     * builds ExtensionError without checking for non-null required values
     * @return ExtensionError
     */
    public ExtensionError buildUnchecked() {
        return new ExtensionErrorImpl(code, message, extensionId, extensionKey, values);
    }

    /**
     * factory method for an instance of ExtensionErrorBuilder
     * @return builder
     */
    public static ExtensionErrorBuilder of() {
        return new ExtensionErrorBuilder();
    }

    /**
     * create builder for ExtensionError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionErrorBuilder of(final ExtensionError template) {
        ExtensionErrorBuilder builder = new ExtensionErrorBuilder();
        builder.code = template.getCode();
        builder.message = template.getMessage();
        builder.extensionId = template.getExtensionId();
        builder.extensionKey = template.getExtensionKey();
        builder.values = template.values();
        return builder;
    }

}
