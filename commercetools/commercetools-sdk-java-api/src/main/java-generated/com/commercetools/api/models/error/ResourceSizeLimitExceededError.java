
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when the resource exceeds the maximum allowed size of 16 MB.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceSizeLimitExceededError resourceSizeLimitExceededError = ResourceSizeLimitExceededError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ResourceSizeLimitExceededErrorImpl.class)
public interface ResourceSizeLimitExceededError extends ErrorObject {

    /**
     * discriminator value for ResourceSizeLimitExceededError
     */
    String RESOURCE_SIZE_LIMIT_EXCEEDED = "ResourceSizeLimitExceeded";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The resource size exceeds the maximal allowed size of 16 MB."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"The resource size exceeds the maximal allowed size of 16 MB."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of ResourceSizeLimitExceededError
     */
    public static ResourceSizeLimitExceededError of() {
        return new ResourceSizeLimitExceededErrorImpl();
    }

    /**
     * factory method to copy an instance of ResourceSizeLimitExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ResourceSizeLimitExceededError of(final ResourceSizeLimitExceededError template) {
        ResourceSizeLimitExceededErrorImpl instance = new ResourceSizeLimitExceededErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    /**
     * builder factory method for ResourceSizeLimitExceededError
     * @return builder
     */
    public static ResourceSizeLimitExceededErrorBuilder builder() {
        return ResourceSizeLimitExceededErrorBuilder.of();
    }

    /**
     * create builder for ResourceSizeLimitExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ResourceSizeLimitExceededErrorBuilder builder(final ResourceSizeLimitExceededError template) {
        return ResourceSizeLimitExceededErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withResourceSizeLimitExceededError(Function<ResourceSizeLimitExceededError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ResourceSizeLimitExceededError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ResourceSizeLimitExceededError>() {
            @Override
            public String toString() {
                return "TypeReference<ResourceSizeLimitExceededError>";
            }
        };
    }
}
