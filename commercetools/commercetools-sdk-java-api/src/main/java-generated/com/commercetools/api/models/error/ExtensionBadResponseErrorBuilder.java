
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionBadResponseErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionBadResponseError extensionBadResponseError = ExtensionBadResponseError.builder()
 *             .message("{message}")
 *             .plusExtensionErrors(extensionErrorsBuilder -> extensionErrorsBuilder)
 *             .extensionId("{extensionId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionBadResponseErrorBuilder implements Builder<ExtensionBadResponseError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    @Nullable
    private com.commercetools.api.models.common.LocalizedString localizedMessage;

    @Nullable
    private java.lang.Object extensionExtraInfo;

    private java.util.List<com.commercetools.api.models.error.ExtensionError> extensionErrors;

    @Nullable
    private String extensionBody;

    @Nullable
    private Integer extensionStatusCode;

    private String extensionId;

    @Nullable
    private String extensionKey;

    /**
     *  <p>Description of the invalid Extension response. For example, <code>"The extension did not return the expected JSON."</code>.</p>
     * @param message value to be set
     * @return Builder
     */

    public ExtensionBadResponseErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public ExtensionBadResponseErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ExtensionBadResponseErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public ExtensionBadResponseErrorBuilder localizedMessage(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.localizedMessage = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined localized description of the error.</p>
     * @param localizedMessage value to be set
     * @return Builder
     */

    public ExtensionBadResponseErrorBuilder localizedMessage(
            @Nullable final com.commercetools.api.models.common.LocalizedString localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }

    /**
     *  <p>Any information that should be returned to the API caller.</p>
     * @param extensionExtraInfo value to be set
     * @return Builder
     */

    public ExtensionBadResponseErrorBuilder extensionExtraInfo(@Nullable final java.lang.Object extensionExtraInfo) {
        this.extensionExtraInfo = extensionExtraInfo;
        return this;
    }

    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param extensionErrors value to be set
     * @return Builder
     */

    public ExtensionBadResponseErrorBuilder extensionErrors(
            final com.commercetools.api.models.error.ExtensionError... extensionErrors) {
        this.extensionErrors = new ArrayList<>(Arrays.asList(extensionErrors));
        return this;
    }

    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param extensionErrors value to be set
     * @return Builder
     */

    public ExtensionBadResponseErrorBuilder extensionErrors(
            final java.util.List<com.commercetools.api.models.error.ExtensionError> extensionErrors) {
        this.extensionErrors = extensionErrors;
        return this;
    }

    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param extensionErrors value to be set
     * @return Builder
     */

    public ExtensionBadResponseErrorBuilder plusExtensionErrors(
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

    public ExtensionBadResponseErrorBuilder plusExtensionErrors(
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

    public ExtensionBadResponseErrorBuilder withExtensionErrors(
            Function<com.commercetools.api.models.error.ExtensionErrorBuilder, com.commercetools.api.models.error.ExtensionErrorBuilder> builder) {
        this.extensionErrors = new ArrayList<>();
        this.extensionErrors.add(builder.apply(com.commercetools.api.models.error.ExtensionErrorBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The response body returned by the Extension.</p>
     * @param extensionBody value to be set
     * @return Builder
     */

    public ExtensionBadResponseErrorBuilder extensionBody(@Nullable final String extensionBody) {
        this.extensionBody = extensionBody;
        return this;
    }

    /**
     *  <p>Http status code returned by the Extension.</p>
     * @param extensionStatusCode value to be set
     * @return Builder
     */

    public ExtensionBadResponseErrorBuilder extensionStatusCode(@Nullable final Integer extensionStatusCode) {
        this.extensionStatusCode = extensionStatusCode;
        return this;
    }

    /**
     *  <p>Unique identifier of the Extension.</p>
     * @param extensionId value to be set
     * @return Builder
     */

    public ExtensionBadResponseErrorBuilder extensionId(final String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     * @param extensionKey value to be set
     * @return Builder
     */

    public ExtensionBadResponseErrorBuilder extensionKey(@Nullable final String extensionKey) {
        this.extensionKey = extensionKey;
        return this;
    }

    /**
     *  <p>Description of the invalid Extension response. For example, <code>"The extension did not return the expected JSON."</code>.</p>
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
     *  <p>The response body returned by the Extension.</p>
     * @return extensionBody
     */

    @Nullable
    public String getExtensionBody() {
        return this.extensionBody;
    }

    /**
     *  <p>Http status code returned by the Extension.</p>
     * @return extensionStatusCode
     */

    @Nullable
    public Integer getExtensionStatusCode() {
        return this.extensionStatusCode;
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
     * builds ExtensionBadResponseError with checking for non-null required values
     * @return ExtensionBadResponseError
     */
    public ExtensionBadResponseError build() {
        Objects.requireNonNull(message, ExtensionBadResponseError.class + ": message is missing");
        Objects.requireNonNull(extensionErrors, ExtensionBadResponseError.class + ": extensionErrors is missing");
        Objects.requireNonNull(extensionId, ExtensionBadResponseError.class + ": extensionId is missing");
        return new ExtensionBadResponseErrorImpl(message, values, localizedMessage, extensionExtraInfo, extensionErrors,
            extensionBody, extensionStatusCode, extensionId, extensionKey);
    }

    /**
     * builds ExtensionBadResponseError without checking for non-null required values
     * @return ExtensionBadResponseError
     */
    public ExtensionBadResponseError buildUnchecked() {
        return new ExtensionBadResponseErrorImpl(message, values, localizedMessage, extensionExtraInfo, extensionErrors,
            extensionBody, extensionStatusCode, extensionId, extensionKey);
    }

    /**
     * factory method for an instance of ExtensionBadResponseErrorBuilder
     * @return builder
     */
    public static ExtensionBadResponseErrorBuilder of() {
        return new ExtensionBadResponseErrorBuilder();
    }

    /**
     * create builder for ExtensionBadResponseError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionBadResponseErrorBuilder of(final ExtensionBadResponseError template) {
        ExtensionBadResponseErrorBuilder builder = new ExtensionBadResponseErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.localizedMessage = template.getLocalizedMessage();
        builder.extensionExtraInfo = template.getExtensionExtraInfo();
        builder.extensionErrors = template.getExtensionErrors();
        builder.extensionBody = template.getExtensionBody();
        builder.extensionStatusCode = template.getExtensionStatusCode();
        builder.extensionId = template.getExtensionId();
        builder.extensionKey = template.getExtensionKey();
        return builder;
    }

}
