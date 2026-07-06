
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
 *  <p>Returned when the Extension dependency chain exceeds 3 layers.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionChainTooDeepError extensionChainTooDeepError = ExtensionChainTooDeepError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ExtensionChainTooDeep")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionChainTooDeepErrorImpl.class)
public interface ExtensionChainTooDeepError extends ErrorObject {

    /**
     * discriminator value for ExtensionChainTooDeepError
     */
    String EXTENSION_CHAIN_TOO_DEEP = "ExtensionChainTooDeep";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The dependency chain depth 4 exceeds the maximum allowed depth of 3"</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"The dependency chain depth 4 exceeds the maximum allowed depth of 3"</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of ExtensionChainTooDeepError
     */
    public static ExtensionChainTooDeepError of() {
        return new ExtensionChainTooDeepErrorImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionChainTooDeepError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionChainTooDeepError of(final ExtensionChainTooDeepError template) {
        ExtensionChainTooDeepErrorImpl instance = new ExtensionChainTooDeepErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public ExtensionChainTooDeepError copyDeep();

    /**
     * factory method to create a deep copy of ExtensionChainTooDeepError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionChainTooDeepError deepCopy(@Nullable final ExtensionChainTooDeepError template) {
        if (template == null) {
            return null;
        }
        ExtensionChainTooDeepErrorImpl instance = new ExtensionChainTooDeepErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for ExtensionChainTooDeepError
     * @return builder
     */
    public static ExtensionChainTooDeepErrorBuilder builder() {
        return ExtensionChainTooDeepErrorBuilder.of();
    }

    /**
     * create builder for ExtensionChainTooDeepError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionChainTooDeepErrorBuilder builder(final ExtensionChainTooDeepError template) {
        return ExtensionChainTooDeepErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionChainTooDeepError(Function<ExtensionChainTooDeepError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ExtensionChainTooDeepError> typeReference() {
        return new tools.jackson.core.type.TypeReference<ExtensionChainTooDeepError>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionChainTooDeepError>";
            }
        };
    }
}
