
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>This error occurs when your <span>API Client</span> does not have the <span>OAuth scope</span> required for the endpoint. Use an API Client with the required permissions for this endpoint instead.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InsufficientScopeError insufficientScopeError = InsufficientScopeError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("insufficient_scope")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InsufficientScopeErrorImpl.class)
public interface InsufficientScopeError extends ErrorObject {

    /**
     * discriminator value for InsufficientScopeError
     */
    String INSUFFICIENT_SCOPE = "insufficient_scope";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Insufficient scope. One of the following scopes is missing:"</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Insufficient scope. One of the following scopes is missing:"</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of InsufficientScopeError
     */
    public static InsufficientScopeError of() {
        return new InsufficientScopeErrorImpl();
    }

    /**
     * factory method to create a shallow copy InsufficientScopeError
     * @param template instance to be copied
     * @return copy instance
     */
    public static InsufficientScopeError of(final InsufficientScopeError template) {
        InsufficientScopeErrorImpl instance = new InsufficientScopeErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public InsufficientScopeError copyDeep();

    /**
     * factory method to create a deep copy of InsufficientScopeError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InsufficientScopeError deepCopy(@Nullable final InsufficientScopeError template) {
        if (template == null) {
            return null;
        }
        InsufficientScopeErrorImpl instance = new InsufficientScopeErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for InsufficientScopeError
     * @return builder
     */
    public static InsufficientScopeErrorBuilder builder() {
        return InsufficientScopeErrorBuilder.of();
    }

    /**
     * create builder for InsufficientScopeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InsufficientScopeErrorBuilder builder(final InsufficientScopeError template) {
        return InsufficientScopeErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInsufficientScopeError(Function<InsufficientScopeError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InsufficientScopeError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InsufficientScopeError>() {
            @Override
            public String toString() {
                return "TypeReference<InsufficientScopeError>";
            }
        };
    }
}
