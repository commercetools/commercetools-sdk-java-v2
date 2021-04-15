
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExtensionNoResponseErrorBuilder {

    private String message;

    private String extensionId;

    @Nullable
    private String extensionKey;

    public ExtensionNoResponseErrorBuilder message(final String message) {
        this.message = message;
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

    public String getExtensionId() {
        return this.extensionId;
    }

    @Nullable
    public String getExtensionKey() {
        return this.extensionKey;
    }

    public ExtensionNoResponseError build() {
        return new ExtensionNoResponseErrorImpl(message, extensionId, extensionKey);
    }

    public static ExtensionNoResponseErrorBuilder of() {
        return new ExtensionNoResponseErrorBuilder();
    }

    public static ExtensionNoResponseErrorBuilder of(final ExtensionNoResponseError template) {
        ExtensionNoResponseErrorBuilder builder = new ExtensionNoResponseErrorBuilder();
        builder.message = template.getMessage();
        builder.extensionId = template.getExtensionId();
        builder.extensionKey = template.getExtensionKey();
        return builder;
    }

}
