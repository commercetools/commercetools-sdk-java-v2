
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionUpdateActionsFailedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionUpdateActionsFailedError extensionUpdateActionsFailedError = ExtensionUpdateActionsFailedError.builder()
 *             .message("{message}")
 *             .errorByExtension(errorByExtensionBuilder -> errorByExtensionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionUpdateActionsFailedErrorBuilder implements Builder<ExtensionUpdateActionsFailedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    @Nullable
    private com.commercetools.api.models.common.LocalizedString localizedMessage;

    @Nullable
    private java.lang.Object extensionExtraInfo;

    private com.commercetools.api.models.error.ErrorByExtension errorByExtension;

    /**
     *
     */

    public ExtensionUpdateActionsFailedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *
     */

    public ExtensionUpdateActionsFailedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *
     */

    public ExtensionUpdateActionsFailedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ExtensionUpdateActionsFailedErrorBuilder localizedMessage(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.localizedMessage = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ExtensionUpdateActionsFailedErrorBuilder localizedMessage(
            @Nullable final com.commercetools.api.models.common.LocalizedString localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }

    /**
     *
     */

    public ExtensionUpdateActionsFailedErrorBuilder extensionExtraInfo(
            @Nullable final java.lang.Object extensionExtraInfo) {
        this.extensionExtraInfo = extensionExtraInfo;
        return this;
    }

    /**
     *
     */

    public ExtensionUpdateActionsFailedErrorBuilder errorByExtension(
            Function<com.commercetools.api.models.error.ErrorByExtensionBuilder, com.commercetools.api.models.error.ErrorByExtensionBuilder> builder) {
        this.errorByExtension = builder.apply(com.commercetools.api.models.error.ErrorByExtensionBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ExtensionUpdateActionsFailedErrorBuilder errorByExtension(
            final com.commercetools.api.models.error.ErrorByExtension errorByExtension) {
        this.errorByExtension = errorByExtension;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
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
        Objects.requireNonNull(message, ExtensionUpdateActionsFailedError.class + ": message is missing");
        Objects.requireNonNull(values, ExtensionUpdateActionsFailedError.class + ": values are missing");
        Objects.requireNonNull(errorByExtension,
            ExtensionUpdateActionsFailedError.class + ": errorByExtension is missing");
        return new ExtensionUpdateActionsFailedErrorImpl(message, values, localizedMessage, extensionExtraInfo,
            errorByExtension);
    }

    /**
     * builds ExtensionUpdateActionsFailedError without checking for non null required values
     */
    public ExtensionUpdateActionsFailedError buildUnchecked() {
        return new ExtensionUpdateActionsFailedErrorImpl(message, values, localizedMessage, extensionExtraInfo,
            errorByExtension);
    }

    public static ExtensionUpdateActionsFailedErrorBuilder of() {
        return new ExtensionUpdateActionsFailedErrorBuilder();
    }

    public static ExtensionUpdateActionsFailedErrorBuilder of(final ExtensionUpdateActionsFailedError template) {
        ExtensionUpdateActionsFailedErrorBuilder builder = new ExtensionUpdateActionsFailedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.localizedMessage = template.getLocalizedMessage();
        builder.extensionExtraInfo = template.getExtensionExtraInfo();
        builder.errorByExtension = template.getErrorByExtension();
        return builder;
    }

}
