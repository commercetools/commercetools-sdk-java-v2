
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
     */

    public ExtensionErrorBuilder code(final String code) {
        this.code = code;
        return this;
    }

    /**
     *  <p>Plain text description of the error.</p>
     */

    public ExtensionErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the Extension.</p>
     */

    public ExtensionErrorBuilder extensionId(final String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     */

    public ExtensionErrorBuilder extensionKey(@Nullable final String extensionKey) {
        this.extensionKey = extensionKey;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public ExtensionErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public ExtensionErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getExtensionId() {
        return this.extensionId;
    }

    @Nullable
    public String getExtensionKey() {
        return this.extensionKey;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public ExtensionError build() {
        Objects.requireNonNull(code, ExtensionError.class + ": code is missing");
        Objects.requireNonNull(message, ExtensionError.class + ": message is missing");
        Objects.requireNonNull(extensionId, ExtensionError.class + ": extensionId is missing");
        Objects.requireNonNull(values, ExtensionError.class + ": values are missing");
        return new ExtensionErrorImpl(code, message, extensionId, extensionKey, values);
    }

    /**
     * builds ExtensionError without checking for non null required values
     */
    public ExtensionError buildUnchecked() {
        return new ExtensionErrorImpl(code, message, extensionId, extensionKey, values);
    }

    public static ExtensionErrorBuilder of() {
        return new ExtensionErrorBuilder();
    }

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
