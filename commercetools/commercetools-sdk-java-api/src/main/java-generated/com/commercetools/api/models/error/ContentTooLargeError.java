
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
 *  <p>Returned when the request results in too much data being returned from the API. Adjust the request query to reduce the size of the data returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ContentTooLargeError contentTooLargeError = ContentTooLargeError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ContentTooLarge")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ContentTooLargeErrorImpl.class)
public interface ContentTooLargeError extends ErrorObject {

    /**
     * discriminator value for ContentTooLargeError
     */
    String CONTENT_TOO_LARGE = "ContentTooLarge";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Content too large."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Content too large."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of ContentTooLargeError
     */
    public static ContentTooLargeError of() {
        return new ContentTooLargeErrorImpl();
    }

    /**
     * factory method to create a shallow copy ContentTooLargeError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ContentTooLargeError of(final ContentTooLargeError template) {
        ContentTooLargeErrorImpl instance = new ContentTooLargeErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public ContentTooLargeError copyDeep();

    /**
     * factory method to create a deep copy of ContentTooLargeError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ContentTooLargeError deepCopy(@Nullable final ContentTooLargeError template) {
        if (template == null) {
            return null;
        }
        ContentTooLargeErrorImpl instance = new ContentTooLargeErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for ContentTooLargeError
     * @return builder
     */
    public static ContentTooLargeErrorBuilder builder() {
        return ContentTooLargeErrorBuilder.of();
    }

    /**
     * create builder for ContentTooLargeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ContentTooLargeErrorBuilder builder(final ContentTooLargeError template) {
        return ContentTooLargeErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withContentTooLargeError(Function<ContentTooLargeError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ContentTooLargeError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ContentTooLargeError>() {
            @Override
            public String toString() {
                return "TypeReference<ContentTooLargeError>";
            }
        };
    }
}
