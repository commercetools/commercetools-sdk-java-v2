
package com.commercetools.history.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_history.ErrorObject;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the <span>Query Records</span> request exceeds the rate limit.</p>
 *  <p>Reduce the date range and resource types in your query to minimize the token usage, or retry the request after some time (indicated in the <code>Retry-After</code> header).</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TooManyRequestsError tooManyRequestsError = TooManyRequestsError.builder()
 *             .code("{code}")
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("TooManyRequests")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TooManyRequestsErrorImpl.class)
public interface TooManyRequestsError extends ErrorObject {

    /**
     * discriminator value for TooManyRequestsError
     */
    String TOO_MANY_REQUESTS = "TooManyRequests";

    /**
     *  <p><code>"TooManyRequests"</code></p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"You have made too many requests. Please try again later."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"TooManyRequests"</code></p>
     * @param code value to be set
     */

    public void setCode(final String code);

    /**
     *  <p><code>"You have made too many requests. Please try again later."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of TooManyRequestsError
     */
    public static TooManyRequestsError of() {
        return new TooManyRequestsErrorImpl();
    }

    /**
     * factory method to create a shallow copy TooManyRequestsError
     * @param template instance to be copied
     * @return copy instance
     */
    public static TooManyRequestsError of(final TooManyRequestsError template) {
        TooManyRequestsErrorImpl instance = new TooManyRequestsErrorImpl();
        instance.setCode(template.getCode());
        instance.setMessage(template.getMessage());
        return instance;
    }

    public TooManyRequestsError copyDeep();

    /**
     * factory method to create a deep copy of TooManyRequestsError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TooManyRequestsError deepCopy(@Nullable final TooManyRequestsError template) {
        if (template == null) {
            return null;
        }
        TooManyRequestsErrorImpl instance = new TooManyRequestsErrorImpl();
        instance.setCode(template.getCode());
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for TooManyRequestsError
     * @return builder
     */
    public static TooManyRequestsErrorBuilder builder() {
        return TooManyRequestsErrorBuilder.of();
    }

    /**
     * create builder for TooManyRequestsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TooManyRequestsErrorBuilder builder(final TooManyRequestsError template) {
        return TooManyRequestsErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTooManyRequestsError(Function<TooManyRequestsError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TooManyRequestsError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TooManyRequestsError>() {
            @Override
            public String toString() {
                return "TypeReference<TooManyRequestsError>";
            }
        };
    }
}
