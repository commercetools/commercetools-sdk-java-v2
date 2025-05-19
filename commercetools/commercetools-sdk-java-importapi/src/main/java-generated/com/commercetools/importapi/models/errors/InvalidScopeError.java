
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The requested scope is invalid, unknown, malformed, or exceeds the scope granted by the resource owner.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidScopeError invalidScopeError = InvalidScopeError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("invalid_scope")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidScopeErrorImpl.class)
public interface InvalidScopeError extends ErrorObject {

    /**
     * discriminator value for InvalidScopeError
     */
    String INVALID_SCOPE = "invalid_scope";

    /**
     * factory method
     * @return instance of InvalidScopeError
     */
    public static InvalidScopeError of() {
        return new InvalidScopeErrorImpl();
    }

    /**
     * factory method to create a shallow copy InvalidScopeError
     * @param template instance to be copied
     * @return copy instance
     */
    public static InvalidScopeError of(final InvalidScopeError template) {
        InvalidScopeErrorImpl instance = new InvalidScopeErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public InvalidScopeError copyDeep();

    /**
     * factory method to create a deep copy of InvalidScopeError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InvalidScopeError deepCopy(@Nullable final InvalidScopeError template) {
        if (template == null) {
            return null;
        }
        InvalidScopeErrorImpl instance = new InvalidScopeErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for InvalidScopeError
     * @return builder
     */
    public static InvalidScopeErrorBuilder builder() {
        return InvalidScopeErrorBuilder.of();
    }

    /**
     * create builder for InvalidScopeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidScopeErrorBuilder builder(final InvalidScopeError template) {
        return InvalidScopeErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInvalidScopeError(Function<InvalidScopeError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InvalidScopeError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidScopeError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidScopeError>";
            }
        };
    }
}
