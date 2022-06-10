
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
 * ExtensionBadResponseError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionBadResponseError extensionBadResponseError = ExtensionBadResponseError.builder()
 *             .message("{message}")
 *             .errorByExtension(errorByExtensionBuilder -> errorByExtensionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionBadResponseErrorImpl.class)
public interface ExtensionBadResponseError extends ErrorObject {

    String EXTENSION_BAD_RESPONSE = "ExtensionBadResponse";

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */
    @Valid
    @JsonProperty("localizedMessage")
    public LocalizedString getLocalizedMessage();

    /**
     *
     */
    @Valid
    @JsonProperty("extensionExtraInfo")
    public Object getExtensionExtraInfo();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("errorByExtension")
    public ErrorByExtension getErrorByExtension();

    public void setLocalizedMessage(final LocalizedString localizedMessage);

    public void setExtensionExtraInfo(final Object extensionExtraInfo);

    public void setErrorByExtension(final ErrorByExtension errorByExtension);

    public static ExtensionBadResponseError of() {
        return new ExtensionBadResponseErrorImpl();
    }

    public static ExtensionBadResponseError of(final ExtensionBadResponseError template) {
        ExtensionBadResponseErrorImpl instance = new ExtensionBadResponseErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setLocalizedMessage(template.getLocalizedMessage());
        instance.setExtensionExtraInfo(template.getExtensionExtraInfo());
        instance.setErrorByExtension(template.getErrorByExtension());
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
