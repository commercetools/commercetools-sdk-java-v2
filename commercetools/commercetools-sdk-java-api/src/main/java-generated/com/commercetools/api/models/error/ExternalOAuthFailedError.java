
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when an external OAuth Introspection endpoint does not return a response within the time limit, or the response isn't compliant with RFC 7662 (for example, an HTTP status code like <code>500</code>).</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExternalOAuthFailedError externalOAuthFailedError = ExternalOAuthFailedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExternalOAuthFailedErrorImpl.class)
public interface ExternalOAuthFailedError extends ErrorObject {

    /**
     * discriminator value for ExternalOAuthFailedError
     */
    String EXTERNAL_O_AUTH_FAILED = "ExternalOAuthFailed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Plain text description detailing the external OAuth error. For example, <code>"External OAuth did not respond in time."</code>.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Plain text description detailing the external OAuth error. For example, <code>"External OAuth did not respond in time."</code>.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of ExternalOAuthFailedError
     */
    public static ExternalOAuthFailedError of() {
        return new ExternalOAuthFailedErrorImpl();
    }

    /**
     * factory method to copy an instance of ExternalOAuthFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExternalOAuthFailedError of(final ExternalOAuthFailedError template) {
        ExternalOAuthFailedErrorImpl instance = new ExternalOAuthFailedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template).ifPresent(t -> t.values().forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for ExternalOAuthFailedError
     * @return builder
     */
    public static ExternalOAuthFailedErrorBuilder builder() {
        return ExternalOAuthFailedErrorBuilder.of();
    }

    /**
     * create builder for ExternalOAuthFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExternalOAuthFailedErrorBuilder builder(final ExternalOAuthFailedError template) {
        return ExternalOAuthFailedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExternalOAuthFailedError(Function<ExternalOAuthFailedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExternalOAuthFailedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExternalOAuthFailedError>() {
            @Override
            public String toString() {
                return "TypeReference<ExternalOAuthFailedError>";
            }
        };
    }
}
