
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
 *             .plusExtensionErrors(extensionErrorsBuilder -> extensionErrorsBuilder)
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

    private java.util.List<com.commercetools.api.models.error.ExtensionError> extensionErrors;

    /**
     *  <p><code>"The extension returned update actions that could not be executed."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ExtensionUpdateActionsFailedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public ExtensionUpdateActionsFailedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ExtensionUpdateActionsFailedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>User-defined localized description of the error.</p>
     * @param builder function to build the localizedMessage value
     * @return Builder
     */

    public ExtensionUpdateActionsFailedErrorBuilder localizedMessage(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.localizedMessage = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined localized description of the error.</p>
     * @param builder function to build the localizedMessage value
     * @return Builder
     */

    public ExtensionUpdateActionsFailedErrorBuilder withLocalizedMessage(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.localizedMessage = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>User-defined localized description of the error.</p>
     * @param localizedMessage value to be set
     * @return Builder
     */

    public ExtensionUpdateActionsFailedErrorBuilder localizedMessage(
            @Nullable final com.commercetools.api.models.common.LocalizedString localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }

    /**
     *  <p>Any information that should be returned to the API caller.</p>
     * @param extensionExtraInfo value to be set
     * @return Builder
     */

    public ExtensionUpdateActionsFailedErrorBuilder extensionExtraInfo(
            @Nullable final java.lang.Object extensionExtraInfo) {
        this.extensionExtraInfo = extensionExtraInfo;
        return this;
    }

    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param extensionErrors value to be set
     * @return Builder
     */

    public ExtensionUpdateActionsFailedErrorBuilder extensionErrors(
            final com.commercetools.api.models.error.ExtensionError... extensionErrors) {
        this.extensionErrors = new ArrayList<>(Arrays.asList(extensionErrors));
        return this;
    }

    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param extensionErrors value to be set
     * @return Builder
     */

    public ExtensionUpdateActionsFailedErrorBuilder extensionErrors(
            final java.util.List<com.commercetools.api.models.error.ExtensionError> extensionErrors) {
        this.extensionErrors = extensionErrors;
        return this;
    }

    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param extensionErrors value to be set
     * @return Builder
     */

    public ExtensionUpdateActionsFailedErrorBuilder plusExtensionErrors(
            final com.commercetools.api.models.error.ExtensionError... extensionErrors) {
        if (this.extensionErrors == null) {
            this.extensionErrors = new ArrayList<>();
        }
        this.extensionErrors.addAll(Arrays.asList(extensionErrors));
        return this;
    }

    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param builder function to build the extensionErrors value
     * @return Builder
     */

    public ExtensionUpdateActionsFailedErrorBuilder plusExtensionErrors(
            Function<com.commercetools.api.models.error.ExtensionErrorBuilder, com.commercetools.api.models.error.ExtensionErrorBuilder> builder) {
        if (this.extensionErrors == null) {
            this.extensionErrors = new ArrayList<>();
        }
        this.extensionErrors.add(builder.apply(com.commercetools.api.models.error.ExtensionErrorBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param builder function to build the extensionErrors value
     * @return Builder
     */

    public ExtensionUpdateActionsFailedErrorBuilder withExtensionErrors(
            Function<com.commercetools.api.models.error.ExtensionErrorBuilder, com.commercetools.api.models.error.ExtensionErrorBuilder> builder) {
        this.extensionErrors = new ArrayList<>();
        this.extensionErrors.add(builder.apply(com.commercetools.api.models.error.ExtensionErrorBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param builder function to build the extensionErrors value
     * @return Builder
     */

    public ExtensionUpdateActionsFailedErrorBuilder addExtensionErrors(
            Function<com.commercetools.api.models.error.ExtensionErrorBuilder, com.commercetools.api.models.error.ExtensionError> builder) {
        return plusExtensionErrors(builder.apply(com.commercetools.api.models.error.ExtensionErrorBuilder.of()));
    }

    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param builder function to build the extensionErrors value
     * @return Builder
     */

    public ExtensionUpdateActionsFailedErrorBuilder setExtensionErrors(
            Function<com.commercetools.api.models.error.ExtensionErrorBuilder, com.commercetools.api.models.error.ExtensionError> builder) {
        return extensionErrors(builder.apply(com.commercetools.api.models.error.ExtensionErrorBuilder.of()));
    }

    /**
     *  <p><code>"The extension returned update actions that could not be executed."</code></p>
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
     *  <p>User-defined localized description of the error.</p>
     * @return localizedMessage
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getLocalizedMessage() {
        return this.localizedMessage;
    }

    /**
     *  <p>Any information that should be returned to the API caller.</p>
     * @return extensionExtraInfo
     */

    @Nullable
    public java.lang.Object getExtensionExtraInfo() {
        return this.extensionExtraInfo;
    }

    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @return extensionErrors
     */

    public java.util.List<com.commercetools.api.models.error.ExtensionError> getExtensionErrors() {
        return this.extensionErrors;
    }

    /**
     * builds ExtensionUpdateActionsFailedError with checking for non-null required values
     * @return ExtensionUpdateActionsFailedError
     */
    public ExtensionUpdateActionsFailedError build() {
        Objects.requireNonNull(message, ExtensionUpdateActionsFailedError.class + ": message is missing");
        Objects.requireNonNull(extensionErrors,
            ExtensionUpdateActionsFailedError.class + ": extensionErrors is missing");
        return new ExtensionUpdateActionsFailedErrorImpl(message, values, localizedMessage, extensionExtraInfo,
            extensionErrors);
    }

    /**
     * builds ExtensionUpdateActionsFailedError without checking for non-null required values
     * @return ExtensionUpdateActionsFailedError
     */
    public ExtensionUpdateActionsFailedError buildUnchecked() {
        return new ExtensionUpdateActionsFailedErrorImpl(message, values, localizedMessage, extensionExtraInfo,
            extensionErrors);
    }

    /**
     * factory method for an instance of ExtensionUpdateActionsFailedErrorBuilder
     * @return builder
     */
    public static ExtensionUpdateActionsFailedErrorBuilder of() {
        return new ExtensionUpdateActionsFailedErrorBuilder();
    }

    /**
     * create builder for ExtensionUpdateActionsFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionUpdateActionsFailedErrorBuilder of(final ExtensionUpdateActionsFailedError template) {
        ExtensionUpdateActionsFailedErrorBuilder builder = new ExtensionUpdateActionsFailedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.localizedMessage = template.getLocalizedMessage();
        builder.extensionExtraInfo = template.getExtensionExtraInfo();
        builder.extensionErrors = template.getExtensionErrors();
        return builder;
    }

}
