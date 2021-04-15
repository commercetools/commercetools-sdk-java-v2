
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExtensionUpdateActionsFailedErrorBuilder {

    private String message;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString localizedMessage;

    @Nullable
    private java.lang.Object extensionExtraInfo;

    private com.commercetools.api.models.error.ErrorByExtension errorByExtension;

    public ExtensionUpdateActionsFailedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public ExtensionUpdateActionsFailedErrorBuilder localizedMessage(
            @Nullable final com.commercetools.api.models.common.LocalizedString localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }

    public ExtensionUpdateActionsFailedErrorBuilder extensionExtraInfo(
            @Nullable final java.lang.Object extensionExtraInfo) {
        this.extensionExtraInfo = extensionExtraInfo;
        return this;
    }

    public ExtensionUpdateActionsFailedErrorBuilder errorByExtension(
            final com.commercetools.api.models.error.ErrorByExtension errorByExtension) {
        this.errorByExtension = errorByExtension;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getLocalizedMessage() {
        return this.localizedMessage;
    }

    @Nullable
    public java.lang.Object getExtensionExtraInfo() {
        return this.extensionExtraInfo;
    }

    public com.commercetools.api.models.error.ErrorByExtension getErrorByExtension() {
        return this.errorByExtension;
    }

    public ExtensionUpdateActionsFailedError build() {
        return new ExtensionUpdateActionsFailedErrorImpl(message, localizedMessage, extensionExtraInfo,
            errorByExtension);
    }

    public static ExtensionUpdateActionsFailedErrorBuilder of() {
        return new ExtensionUpdateActionsFailedErrorBuilder();
    }

    public static ExtensionUpdateActionsFailedErrorBuilder of(final ExtensionUpdateActionsFailedError template) {
        ExtensionUpdateActionsFailedErrorBuilder builder = new ExtensionUpdateActionsFailedErrorBuilder();
        builder.message = template.getMessage();
        builder.localizedMessage = template.getLocalizedMessage();
        builder.extensionExtraInfo = template.getExtensionExtraInfo();
        builder.errorByExtension = template.getErrorByExtension();
        return builder;
    }

}
