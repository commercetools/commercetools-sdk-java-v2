
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ExtensionNoResponseErrorBuilder implements Builder<ExtensionNoResponseError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String extensionId;

    @Nullable
    private String extensionKey;

    public ExtensionNoResponseErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public ExtensionNoResponseErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public ExtensionNoResponseErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public ExtensionNoResponseErrorBuilder extensionId(final String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public ExtensionNoResponseErrorBuilder extensionKey(@Nullable final String extensionKey) {
        this.extensionKey = extensionKey;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public String getExtensionId() {
        return this.extensionId;
    }

    @Nullable
    public String getExtensionKey() {
        return this.extensionKey;
    }

    public ExtensionNoResponseError build() {
        Objects.requireNonNull(message, ExtensionNoResponseError.class + ": message is missing");
        Objects.requireNonNull(values, ExtensionNoResponseError.class + ": values are missing");
        Objects.requireNonNull(extensionId, ExtensionNoResponseError.class + ": extensionId is missing");
        return new ExtensionNoResponseErrorImpl(message, values, extensionId, extensionKey);
    }

    /**
     * builds ExtensionNoResponseError without checking for non null required values
     */
    public ExtensionNoResponseError buildUnchecked() {
        return new ExtensionNoResponseErrorImpl(message, values, extensionId, extensionKey);
    }

    public static ExtensionNoResponseErrorBuilder of() {
        return new ExtensionNoResponseErrorBuilder();
    }

    public static ExtensionNoResponseErrorBuilder of(final ExtensionNoResponseError template) {
        ExtensionNoResponseErrorBuilder builder = new ExtensionNoResponseErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.extensionId = template.getExtensionId();
        builder.extensionKey = template.getExtensionKey();
        return builder;
    }

}
