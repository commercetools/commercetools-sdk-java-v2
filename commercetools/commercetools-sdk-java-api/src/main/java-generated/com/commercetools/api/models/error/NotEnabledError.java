
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when the Project-specific category recommendations feature is not enabled for the Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NotEnabledError notEnabledError = NotEnabledError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = NotEnabledErrorImpl.class)
public interface NotEnabledError extends ErrorObject {

    /**
     * discriminator value for NotEnabledError
     */
    String NOT_ENABLED = "NotEnabled";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The category recommendations API is not yet enabled for your project."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"The category recommendations API is not yet enabled for your project."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of NotEnabledError
     */
    public static NotEnabledError of() {
        return new NotEnabledErrorImpl();
    }

    /**
     * factory method to copy an instance of NotEnabledError
     * @param template instance to be copied
     * @return copy instance
     */
    public static NotEnabledError of(final NotEnabledError template) {
        NotEnabledErrorImpl instance = new NotEnabledErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template).ifPresent(t -> t.values().forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for NotEnabledError
     * @return builder
     */
    public static NotEnabledErrorBuilder builder() {
        return NotEnabledErrorBuilder.of();
    }

    /**
     * create builder for NotEnabledError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NotEnabledErrorBuilder builder(final NotEnabledError template) {
        return NotEnabledErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withNotEnabledError(Function<NotEnabledError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<NotEnabledError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<NotEnabledError>() {
            @Override
            public String toString() {
                return "TypeReference<NotEnabledError>";
            }
        };
    }
}
