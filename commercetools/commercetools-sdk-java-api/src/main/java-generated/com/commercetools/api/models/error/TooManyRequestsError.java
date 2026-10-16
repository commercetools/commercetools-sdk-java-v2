
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned when a request to a non-production Project exceeds a rate limit.</p>
 *  <p>The response includes the following headers:</p>
 *  <ul>
 *   <li><code>RateLimit-Limit</code> is the number of requests allowed in the current window.</li>
 *   <li><code>RateLimit-Remaining</code> is the number of requests left in the current window.</li>
 *   <li><code>RateLimit-Reset</code> is the number of seconds until the window resets.</li>
 *  </ul>
 *  <p>The rate limit can vary by service and change over time, so don't rely on a fixed number. Since the response has no <code>Retry-After</code> header, wait for the number of seconds in <code>RateLimit-Reset</code> before you retry the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TooManyRequestsError tooManyRequestsError = TooManyRequestsError.builder()
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
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Too many requests. Please try again later."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Too many requests. Please try again later."</code></p>
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
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
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
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
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
    public static tools.jackson.core.type.TypeReference<TooManyRequestsError> typeReference() {
        return new tools.jackson.core.type.TypeReference<TooManyRequestsError>() {
            @Override
            public String toString() {
                return "TypeReference<TooManyRequestsError>";
            }
        };
    }
}
