
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned when an Extension declares more than 5 direct dependencies.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionChainTooWideError extensionChainTooWideError = ExtensionChainTooWideError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ExtensionChainTooWide")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionChainTooWideErrorImpl.class)
public interface ExtensionChainTooWideError extends ErrorObject {

    /**
     * discriminator value for ExtensionChainTooWideError
     */
    String EXTENSION_CHAIN_TOO_WIDE = "ExtensionChainTooWide";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Extension chain breadth exceeds the maximum allowed breadth of 5"</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Extension chain breadth exceeds the maximum allowed breadth of 5"</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of ExtensionChainTooWideError
     */
    public static ExtensionChainTooWideError of() {
        return new ExtensionChainTooWideErrorImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionChainTooWideError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionChainTooWideError of(final ExtensionChainTooWideError template) {
        ExtensionChainTooWideErrorImpl instance = new ExtensionChainTooWideErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public ExtensionChainTooWideError copyDeep();

    /**
     * factory method to create a deep copy of ExtensionChainTooWideError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionChainTooWideError deepCopy(@Nullable final ExtensionChainTooWideError template) {
        if (template == null) {
            return null;
        }
        ExtensionChainTooWideErrorImpl instance = new ExtensionChainTooWideErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for ExtensionChainTooWideError
     * @return builder
     */
    public static ExtensionChainTooWideErrorBuilder builder() {
        return ExtensionChainTooWideErrorBuilder.of();
    }

    /**
     * create builder for ExtensionChainTooWideError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionChainTooWideErrorBuilder builder(final ExtensionChainTooWideError template) {
        return ExtensionChainTooWideErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionChainTooWideError(Function<ExtensionChainTooWideError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ExtensionChainTooWideError> typeReference() {
        return new tools.jackson.core.type.TypeReference<ExtensionChainTooWideError>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionChainTooWideError>";
            }
        };
    }
}
