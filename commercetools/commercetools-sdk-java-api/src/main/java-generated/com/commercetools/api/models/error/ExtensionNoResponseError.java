
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when the API Extension does not respond within the time limit, or could not be reached.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionNoResponseError extensionNoResponseError = ExtensionNoResponseError.builder()
 *             .message("{message}")
 *             .extensionId("{extensionId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionNoResponseErrorImpl.class)
public interface ExtensionNoResponseError extends ErrorObject {

    /**
     * discriminator value for ExtensionNoResponseError
     */
    String EXTENSION_NO_RESPONSE = "ExtensionNoResponse";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Extension did not respond in time."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifier of the API Extension.</p>
     * @return extensionId
     */
    @NotNull
    @JsonProperty("extensionId")
    public String getExtensionId();

    /**
     *  <p>User-defined unique identifier of the API Extension, if available.</p>
     * @return extensionKey
     */

    @JsonProperty("extensionKey")
    public String getExtensionKey();

    /**
     *  <p><code>"Extension did not respond in time."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the API Extension.</p>
     * @param extensionId value to be set
     */

    public void setExtensionId(final String extensionId);

    /**
     *  <p>User-defined unique identifier of the API Extension, if available.</p>
     * @param extensionKey value to be set
     */

    public void setExtensionKey(final String extensionKey);

    /**
     * factory method
     * @return instance of ExtensionNoResponseError
     */
    public static ExtensionNoResponseError of() {
        return new ExtensionNoResponseErrorImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionNoResponseError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionNoResponseError of(final ExtensionNoResponseError template) {
        ExtensionNoResponseErrorImpl instance = new ExtensionNoResponseErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setExtensionId(template.getExtensionId());
        instance.setExtensionKey(template.getExtensionKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ExtensionNoResponseError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionNoResponseError deepCopy(@Nullable final ExtensionNoResponseError template) {
        if (template == null) {
            return null;
        }
        ExtensionNoResponseErrorImpl instance = new ExtensionNoResponseErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setExtensionId(template.getExtensionId());
        instance.setExtensionKey(template.getExtensionKey());
        return instance;
    }

    /**
     * builder factory method for ExtensionNoResponseError
     * @return builder
     */
    public static ExtensionNoResponseErrorBuilder builder() {
        return ExtensionNoResponseErrorBuilder.of();
    }

    /**
     * create builder for ExtensionNoResponseError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionNoResponseErrorBuilder builder(final ExtensionNoResponseError template) {
        return ExtensionNoResponseErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionNoResponseError(Function<ExtensionNoResponseError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionNoResponseError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionNoResponseError>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionNoResponseError>";
            }
        };
    }
}
