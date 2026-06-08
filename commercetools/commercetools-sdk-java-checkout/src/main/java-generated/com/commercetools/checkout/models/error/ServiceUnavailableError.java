
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
 *  <p>Returned when the service is unavailable, for example when the Notification Service is down.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ServiceUnavailableError serviceUnavailableError = ServiceUnavailableError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ServiceUnavailable")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ServiceUnavailableErrorImpl.class)
public interface ServiceUnavailableError extends ErrorObject {

    /**
     * discriminator value for ServiceUnavailableError
     */
    String SERVICE_UNAVAILABLE = "ServiceUnavailable";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Service is unavailable."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Service is unavailable."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of ServiceUnavailableError
     */
    public static ServiceUnavailableError of() {
        return new ServiceUnavailableErrorImpl();
    }

    /**
     * factory method to create a shallow copy ServiceUnavailableError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ServiceUnavailableError of(final ServiceUnavailableError template) {
        ServiceUnavailableErrorImpl instance = new ServiceUnavailableErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public ServiceUnavailableError copyDeep();

    /**
     * factory method to create a deep copy of ServiceUnavailableError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ServiceUnavailableError deepCopy(@Nullable final ServiceUnavailableError template) {
        if (template == null) {
            return null;
        }
        ServiceUnavailableErrorImpl instance = new ServiceUnavailableErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for ServiceUnavailableError
     * @return builder
     */
    public static ServiceUnavailableErrorBuilder builder() {
        return ServiceUnavailableErrorBuilder.of();
    }

    /**
     * create builder for ServiceUnavailableError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ServiceUnavailableErrorBuilder builder(final ServiceUnavailableError template) {
        return ServiceUnavailableErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withServiceUnavailableError(Function<ServiceUnavailableError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ServiceUnavailableError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ServiceUnavailableError>() {
            @Override
            public String toString() {
                return "TypeReference<ServiceUnavailableError>";
            }
        };
    }
}
