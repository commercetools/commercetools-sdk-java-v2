
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This is the generic error code for access denied. In case of a wrong scope, an <span>InvalidScopeError</span> will be returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AccessDeniedError accessDeniedError = AccessDeniedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("access_denied")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AccessDeniedErrorImpl.class)
public interface AccessDeniedError extends ErrorObject {

    /**
     * discriminator value for AccessDeniedError
     */
    String ACCESS_DENIED = "access_denied";

    /**
     * factory method
     * @return instance of AccessDeniedError
     */
    public static AccessDeniedError of() {
        return new AccessDeniedErrorImpl();
    }

    /**
     * factory method to create a shallow copy AccessDeniedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AccessDeniedError of(final AccessDeniedError template) {
        AccessDeniedErrorImpl instance = new AccessDeniedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public AccessDeniedError copyDeep();

    /**
     * factory method to create a deep copy of AccessDeniedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AccessDeniedError deepCopy(@Nullable final AccessDeniedError template) {
        if (template == null) {
            return null;
        }
        AccessDeniedErrorImpl instance = new AccessDeniedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for AccessDeniedError
     * @return builder
     */
    public static AccessDeniedErrorBuilder builder() {
        return AccessDeniedErrorBuilder.of();
    }

    /**
     * create builder for AccessDeniedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AccessDeniedErrorBuilder builder(final AccessDeniedError template) {
        return AccessDeniedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAccessDeniedError(Function<AccessDeniedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AccessDeniedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AccessDeniedError>() {
            @Override
            public String toString() {
                return "TypeReference<AccessDeniedError>";
            }
        };
    }
}
