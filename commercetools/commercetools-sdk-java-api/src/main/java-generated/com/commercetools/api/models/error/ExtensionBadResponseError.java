
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the response from the API Extension could not be parsed successfully (such as a <code>500</code> HTTP status code, or an invalid JSON response).</p>
 *
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
@JsonDeserialize(as = ExtensionBadResponseErrorImpl.class)
public interface ExtensionBadResponseError extends ErrorObject {

    /**
     * discriminator value for ExtensionBadResponseError
     */
    String EXTENSION_BAD_RESPONSE = "ExtensionBadResponse";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Description of the invalid Extension response. For example, <code>"The extension did not return the expected JSON."</code>.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>User-defined localized description of the error.</p>
     * @return localizedMessage
     */
    @Valid
    @JsonProperty("localizedMessage")
    public LocalizedString getLocalizedMessage();

    /**
     *  <p>Any information that should be returned to the API caller.</p>
     * @return extensionExtraInfo
     */
    @Valid
    @JsonProperty("extensionExtraInfo")
    public Object getExtensionExtraInfo();

    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @return extensionErrors
     */
    @NotNull
    @Valid
    @JsonProperty("extensionErrors")
    public List<ExtensionError> getExtensionErrors();

    /**
     *  <p>The response body returned by the Extension.</p>
     * @return extensionBody
     */

    @JsonProperty("extensionBody")
    public String getExtensionBody();

    /**
     *  <p>Http status code returned by the Extension.</p>
     * @return extensionStatusCode
     */

    @JsonProperty("extensionStatusCode")
    public Integer getExtensionStatusCode();

    /**
     *  <p>Unique identifier of the Extension.</p>
     * @return extensionId
     */
    @NotNull
    @JsonProperty("extensionId")
    public String getExtensionId();

    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     * @return extensionKey
     */

    @JsonProperty("extensionKey")
    public String getExtensionKey();

    /**
     *  <p>Description of the invalid Extension response. For example, <code>"The extension did not return the expected JSON."</code>.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>User-defined localized description of the error.</p>
     * @param localizedMessage value to be set
     */

    public void setLocalizedMessage(final LocalizedString localizedMessage);

    /**
     *  <p>Any information that should be returned to the API caller.</p>
     * @param extensionExtraInfo value to be set
     */

    public void setExtensionExtraInfo(final Object extensionExtraInfo);

    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param extensionErrors values to be set
     */

    @JsonIgnore
    public void setExtensionErrors(final ExtensionError... extensionErrors);

    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param extensionErrors values to be set
     */

    public void setExtensionErrors(final List<ExtensionError> extensionErrors);

    /**
     *  <p>The response body returned by the Extension.</p>
     * @param extensionBody value to be set
     */

    public void setExtensionBody(final String extensionBody);

    /**
     *  <p>Http status code returned by the Extension.</p>
     * @param extensionStatusCode value to be set
     */

    public void setExtensionStatusCode(final Integer extensionStatusCode);

    /**
     *  <p>Unique identifier of the Extension.</p>
     * @param extensionId value to be set
     */

    public void setExtensionId(final String extensionId);

    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     * @param extensionKey value to be set
     */

    public void setExtensionKey(final String extensionKey);

    /**
     * factory method
     * @return instance of ExtensionBadResponseError
     */
    public static ExtensionBadResponseError of() {
        return new ExtensionBadResponseErrorImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionBadResponseError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionBadResponseError of(final ExtensionBadResponseError template) {
        ExtensionBadResponseErrorImpl instance = new ExtensionBadResponseErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setLocalizedMessage(template.getLocalizedMessage());
        instance.setExtensionExtraInfo(template.getExtensionExtraInfo());
        instance.setExtensionErrors(template.getExtensionErrors());
        instance.setExtensionBody(template.getExtensionBody());
        instance.setExtensionStatusCode(template.getExtensionStatusCode());
        instance.setExtensionId(template.getExtensionId());
        instance.setExtensionKey(template.getExtensionKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ExtensionBadResponseError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionBadResponseError deepCopy(@Nullable final ExtensionBadResponseError template) {
        if (template == null) {
            return null;
        }
        ExtensionBadResponseErrorImpl instance = new ExtensionBadResponseErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setLocalizedMessage(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getLocalizedMessage()));
        instance.setExtensionExtraInfo(template.getExtensionExtraInfo());
        instance.setExtensionErrors(Optional.ofNullable(template.getExtensionErrors())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.error.ExtensionError::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setExtensionBody(template.getExtensionBody());
        instance.setExtensionStatusCode(template.getExtensionStatusCode());
        instance.setExtensionId(template.getExtensionId());
        instance.setExtensionKey(template.getExtensionKey());
        return instance;
    }

    /**
     * builder factory method for ExtensionBadResponseError
     * @return builder
     */
    public static ExtensionBadResponseErrorBuilder builder() {
        return ExtensionBadResponseErrorBuilder.of();
    }

    /**
     * create builder for ExtensionBadResponseError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionBadResponseErrorBuilder builder(final ExtensionBadResponseError template) {
        return ExtensionBadResponseErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionBadResponseError(Function<ExtensionBadResponseError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionBadResponseError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionBadResponseError>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionBadResponseError>";
            }
        };
    }
}
