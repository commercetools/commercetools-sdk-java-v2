
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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

    String EXTENSION_BAD_RESPONSE = "ExtensionBadResponse";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Description of the invalid Extension response. For example, <code>"The extension did not return the expected JSON."</code>.</p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>User-defined localized description of the error.</p>
     */
    @Valid
    @JsonProperty("localizedMessage")
    public LocalizedString getLocalizedMessage();

    /**
     *  <p>Any information that should be returned to the API caller.</p>
     */
    @Valid
    @JsonProperty("extensionExtraInfo")
    public Object getExtensionExtraInfo();

    /**
     *  <p>Additional errors related to the API Extension.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("extensionErrors")
    public List<ExtensionError> getExtensionErrors();

    /**
     *  <p>The response body returned by the Extension.</p>
     */

    @JsonProperty("extensionBody")
    public String getExtensionBody();

    /**
     *  <p>Http status code returned by the Extension.</p>
     */

    @JsonProperty("extensionStatusCode")
    public Integer getExtensionStatusCode();

    /**
     *  <p>Unique identifier of the Extension.</p>
     */
    @NotNull
    @JsonProperty("extensionId")
    public String getExtensionId();

    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     */

    @JsonProperty("extensionKey")
    public String getExtensionKey();

    public void setMessage(final String message);

    public void setLocalizedMessage(final LocalizedString localizedMessage);

    public void setExtensionExtraInfo(final Object extensionExtraInfo);

    @JsonIgnore
    public void setExtensionErrors(final ExtensionError... extensionErrors);

    public void setExtensionErrors(final List<ExtensionError> extensionErrors);

    public void setExtensionBody(final String extensionBody);

    public void setExtensionStatusCode(final Integer extensionStatusCode);

    public void setExtensionId(final String extensionId);

    public void setExtensionKey(final String extensionKey);

    public static ExtensionBadResponseError of() {
        return new ExtensionBadResponseErrorImpl();
    }

    public static ExtensionBadResponseError of(final ExtensionBadResponseError template) {
        ExtensionBadResponseErrorImpl instance = new ExtensionBadResponseErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setLocalizedMessage(template.getLocalizedMessage());
        instance.setExtensionExtraInfo(template.getExtensionExtraInfo());
        instance.setExtensionErrors(template.getExtensionErrors());
        instance.setExtensionBody(template.getExtensionBody());
        instance.setExtensionStatusCode(template.getExtensionStatusCode());
        instance.setExtensionId(template.getExtensionId());
        instance.setExtensionKey(template.getExtensionKey());
        return instance;
    }

    public static ExtensionBadResponseErrorBuilder builder() {
        return ExtensionBadResponseErrorBuilder.of();
    }

    public static ExtensionBadResponseErrorBuilder builder(final ExtensionBadResponseError template) {
        return ExtensionBadResponseErrorBuilder.of(template);
    }

    default <T> T withExtensionBadResponseError(Function<ExtensionBadResponseError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionBadResponseError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionBadResponseError>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionBadResponseError>";
            }
        };
    }
}
