
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
 *  <p>Returned when the anonymous ID is being used by another resource.</p>
 *  <p>The client application should choose another anonymous ID or retrieve an automatically generated one.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AnonymousIdAlreadyInUseError anonymousIdAlreadyInUseError = AnonymousIdAlreadyInUseError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AnonymousIdAlreadyInUseErrorImpl.class)
public interface AnonymousIdAlreadyInUseError extends ErrorObject {

    /**
     * discriminator value for AnonymousIdAlreadyInUseError
     */
    String ANONYMOUS_ID_ALREADY_IN_USE = "AnonymousIdAlreadyInUse";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The given anonymous ID is already in use."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"The given anonymous ID is already in use."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of AnonymousIdAlreadyInUseError
     */
    public static AnonymousIdAlreadyInUseError of() {
        return new AnonymousIdAlreadyInUseErrorImpl();
    }

    /**
     * factory method to create a shallow copy AnonymousIdAlreadyInUseError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AnonymousIdAlreadyInUseError of(final AnonymousIdAlreadyInUseError template) {
        AnonymousIdAlreadyInUseErrorImpl instance = new AnonymousIdAlreadyInUseErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of AnonymousIdAlreadyInUseError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AnonymousIdAlreadyInUseError deepCopy(@Nullable final AnonymousIdAlreadyInUseError template) {
        if (template == null) {
            return null;
        }
        AnonymousIdAlreadyInUseErrorImpl instance = new AnonymousIdAlreadyInUseErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AnonymousIdAlreadyInUseError
     * @return builder
     */
    public static AnonymousIdAlreadyInUseErrorBuilder builder() {
        return AnonymousIdAlreadyInUseErrorBuilder.of();
    }

    /**
     * create builder for AnonymousIdAlreadyInUseError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AnonymousIdAlreadyInUseErrorBuilder builder(final AnonymousIdAlreadyInUseError template) {
        return AnonymousIdAlreadyInUseErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAnonymousIdAlreadyInUseError(Function<AnonymousIdAlreadyInUseError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AnonymousIdAlreadyInUseError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AnonymousIdAlreadyInUseError>() {
            @Override
            public String toString() {
                return "TypeReference<AnonymousIdAlreadyInUseError>";
            }
        };
    }
}
