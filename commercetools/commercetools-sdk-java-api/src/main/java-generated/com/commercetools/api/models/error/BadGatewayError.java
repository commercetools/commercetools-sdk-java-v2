
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
 *  <p>Returned when a server-side problem is caused by scaling infrastructure resources.</p>
 *  <p>The client application should retry the request with exponential backoff up to a point where further delay is unacceptable.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BadGatewayError badGatewayError = BadGatewayError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BadGatewayErrorImpl.class)
public interface BadGatewayError extends ErrorObject {

    /**
     * discriminator value for BadGatewayError
     */
    String BAD_GATEWAY = "BadGateway";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Plain text description of the error.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of BadGatewayError
     */
    public static BadGatewayError of() {
        return new BadGatewayErrorImpl();
    }

    /**
     * factory method to create a shallow copy BadGatewayError
     * @param template instance to be copied
     * @return copy instance
     */
    public static BadGatewayError of(final BadGatewayError template) {
        BadGatewayErrorImpl instance = new BadGatewayErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of BadGatewayError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BadGatewayError deepCopy(@Nullable final BadGatewayError template) {
        if (template == null) {
            return null;
        }
        BadGatewayErrorImpl instance = new BadGatewayErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for BadGatewayError
     * @return builder
     */
    public static BadGatewayErrorBuilder builder() {
        return BadGatewayErrorBuilder.of();
    }

    /**
     * create builder for BadGatewayError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BadGatewayErrorBuilder builder(final BadGatewayError template) {
        return BadGatewayErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBadGatewayError(Function<BadGatewayError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BadGatewayError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BadGatewayError>() {
            @Override
            public String toString() {
                return "TypeReference<BadGatewayError>";
            }
        };
    }
}
