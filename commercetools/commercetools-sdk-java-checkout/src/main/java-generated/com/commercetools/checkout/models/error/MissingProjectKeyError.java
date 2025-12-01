
package com.commercetools.checkout.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the project key is missing from the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingProjectKeyError missingProjectKeyError = MissingProjectKeyError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("MissingProjectKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MissingProjectKeyErrorImpl.class)
public interface MissingProjectKeyError extends ErrorObject {

    /**
     * discriminator value for MissingProjectKeyError
     */
    String MISSING_PROJECT_KEY = "MissingProjectKey";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Missing project key in the request path."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Missing project key in the request path."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of MissingProjectKeyError
     */
    public static MissingProjectKeyError of() {
        return new MissingProjectKeyErrorImpl();
    }

    /**
     * factory method to create a shallow copy MissingProjectKeyError
     * @param template instance to be copied
     * @return copy instance
     */
    public static MissingProjectKeyError of(final MissingProjectKeyError template) {
        MissingProjectKeyErrorImpl instance = new MissingProjectKeyErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public MissingProjectKeyError copyDeep();

    /**
     * factory method to create a deep copy of MissingProjectKeyError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MissingProjectKeyError deepCopy(@Nullable final MissingProjectKeyError template) {
        if (template == null) {
            return null;
        }
        MissingProjectKeyErrorImpl instance = new MissingProjectKeyErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for MissingProjectKeyError
     * @return builder
     */
    public static MissingProjectKeyErrorBuilder builder() {
        return MissingProjectKeyErrorBuilder.of();
    }

    /**
     * create builder for MissingProjectKeyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MissingProjectKeyErrorBuilder builder(final MissingProjectKeyError template) {
        return MissingProjectKeyErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMissingProjectKeyError(Function<MissingProjectKeyError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MissingProjectKeyError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MissingProjectKeyError>() {
            @Override
            public String toString() {
                return "TypeReference<MissingProjectKeyError>";
            }
        };
    }
}
