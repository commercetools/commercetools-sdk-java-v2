
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ErrorByExtension
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ErrorByExtension errorByExtension = ErrorByExtension.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ErrorByExtensionImpl.class)
public interface ErrorByExtension {

    /**
     *  <p>Unique identifier of the Extension.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the Extension.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ErrorByExtension
     */
    public static ErrorByExtension of() {
        return new ErrorByExtensionImpl();
    }

    /**
     * factory method to copy an instance of ErrorByExtension
     * @param template instance to be copied
     * @return copy instance
     */
    public static ErrorByExtension of(final ErrorByExtension template) {
        ErrorByExtensionImpl instance = new ErrorByExtensionImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ErrorByExtension
     * @return builder
     */
    public static ErrorByExtensionBuilder builder() {
        return ErrorByExtensionBuilder.of();
    }

    /**
     * create builder for ErrorByExtension instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ErrorByExtensionBuilder builder(final ErrorByExtension template) {
        return ErrorByExtensionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withErrorByExtension(Function<ErrorByExtension, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ErrorByExtension> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ErrorByExtension>() {
            @Override
            public String toString() {
                return "TypeReference<ErrorByExtension>";
            }
        };
    }
}
