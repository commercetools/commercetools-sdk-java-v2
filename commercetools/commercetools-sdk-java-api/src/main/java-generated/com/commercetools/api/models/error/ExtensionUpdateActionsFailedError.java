
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

    /**
     * discriminator value for ExtensionUpdateActionsFailedError
     */
    String EXTENSION_UPDATE_ACTIONS_FAILED = "ExtensionUpdateActionsFailed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The extension returned update actions that could not be executed."</code></p>
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
     *  <p><code>"The extension returned update actions that could not be executed."</code></p>
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
     * factory method
     * @return instance of ExtensionUpdateActionsFailedError
     */
    public static ExtensionUpdateActionsFailedError of() {
        return new ExtensionUpdateActionsFailedErrorImpl();
    }

    /**
     * factory method to copy an instance of ExtensionUpdateActionsFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionUpdateActionsFailedError of(final ExtensionUpdateActionsFailedError template) {
        ExtensionUpdateActionsFailedErrorImpl instance = new ExtensionUpdateActionsFailedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template).ifPresent(t -> t.values().forEach(instance::setValue));
        instance.setLocalizedMessage(template.getLocalizedMessage());
        instance.setExtensionExtraInfo(template.getExtensionExtraInfo());
        instance.setExtensionErrors(template.getExtensionErrors());
        return instance;
    }

    /**
     * builder factory method for ExtensionUpdateActionsFailedError
     * @return builder
     */
    public static ExtensionUpdateActionsFailedErrorBuilder builder() {
        return ExtensionUpdateActionsFailedErrorBuilder.of();
    }

    /**
     * create builder for ExtensionUpdateActionsFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionUpdateActionsFailedErrorBuilder builder(final ExtensionUpdateActionsFailedError template) {
        return ExtensionUpdateActionsFailedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionUpdateActionsFailedError(Function<ExtensionUpdateActionsFailedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionUpdateActionsFailedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionUpdateActionsFailedError>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionUpdateActionsFailedError>";
            }
        };
    }
}
