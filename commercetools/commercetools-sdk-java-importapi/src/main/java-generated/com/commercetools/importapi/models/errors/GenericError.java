
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * GenericError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GenericError genericError = GenericError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GenericErrorImpl.class)
public interface GenericError extends ErrorObject {

    /**
     * discriminator value for GenericError
     */
    String GENERIC = "Generic";

    /**
     * factory method
     * @return instance of GenericError
     */
    public static GenericError of() {
        return new GenericErrorImpl();
    }

    /**
     * factory method to create a shallow copy GenericError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GenericError of(final GenericError template) {
        GenericErrorImpl instance = new GenericErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * factory method to create a deep copy of GenericError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GenericError deepCopy(@Nullable final GenericError template) {
        if (template == null) {
            return null;
        }
        GenericErrorImpl instance = new GenericErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for GenericError
     * @return builder
     */
    public static GenericErrorBuilder builder() {
        return GenericErrorBuilder.of();
    }

    /**
     * create builder for GenericError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GenericErrorBuilder builder(final GenericError template) {
        return GenericErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGenericError(Function<GenericError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GenericError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GenericError>() {
            @Override
            public String toString() {
                return "TypeReference<GenericError>";
            }
        };
    }
}
