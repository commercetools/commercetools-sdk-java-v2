
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
 *  <p>Returned when update actions could not be applied to the resource (for example, because a referenced resource does not exist). This would result in a 400 Bad Request response if the same update action was sent from a regular client.</p>
 *
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
@JsonDeserialize(as = ExtensionUpdateActionsFailedErrorImpl.class)
public interface ExtensionUpdateActionsFailedError extends ErrorObject {

    String EXTENSION_UPDATE_ACTIONS_FAILED = "ExtensionUpdateActionsFailed";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The extension returned update actions that could not be executed."</code></p>
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

    public void setMessage(final String message);

    public void setLocalizedMessage(final LocalizedString localizedMessage);

    public void setExtensionExtraInfo(final Object extensionExtraInfo);

    @JsonIgnore
    public void setExtensionErrors(final ExtensionError... extensionErrors);

    public void setExtensionErrors(final List<ExtensionError> extensionErrors);

    public static ExtensionUpdateActionsFailedError of() {
        return new ExtensionUpdateActionsFailedErrorImpl();
    }

    public static ExtensionUpdateActionsFailedError of(final ExtensionUpdateActionsFailedError template) {
        ExtensionUpdateActionsFailedErrorImpl instance = new ExtensionUpdateActionsFailedErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setLocalizedMessage(template.getLocalizedMessage());
        instance.setExtensionExtraInfo(template.getExtensionExtraInfo());
        instance.setExtensionErrors(template.getExtensionErrors());
        return instance;
    }

    public static ExtensionUpdateActionsFailedErrorBuilder builder() {
        return ExtensionUpdateActionsFailedErrorBuilder.of();
    }

    public static ExtensionUpdateActionsFailedErrorBuilder builder(final ExtensionUpdateActionsFailedError template) {
        return ExtensionUpdateActionsFailedErrorBuilder.of(template);
    }

    default <T> T withExtensionUpdateActionsFailedError(Function<ExtensionUpdateActionsFailedError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionUpdateActionsFailedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionUpdateActionsFailedError>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionUpdateActionsFailedError>";
            }
        };
    }
}
