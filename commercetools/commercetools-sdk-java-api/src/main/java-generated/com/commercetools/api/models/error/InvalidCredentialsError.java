
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
 *  <p>Returned when a Customer with the given credentials (matching the given email/password pair) is not found and authentication fails.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Authenticate (sign in) Customer and Authenticate (sign in) Customer in Store requests on Customers.</li>
 *   <li>Authenticate (sign in) Customer and Authenticate (sign in) Customer in Store requests on My Customer Profile.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidCredentialsError invalidCredentialsError = InvalidCredentialsError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InvalidCredentials")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidCredentialsErrorImpl.class)
public interface InvalidCredentialsError extends ErrorObject {

    /**
     * discriminator value for InvalidCredentialsError
     */
    String INVALID_CREDENTIALS = "InvalidCredentials";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Account with the given credentials not found."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Account with the given credentials not found."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of InvalidCredentialsError
     */
    public static InvalidCredentialsError of() {
        return new InvalidCredentialsErrorImpl();
    }

    /**
     * factory method to create a shallow copy InvalidCredentialsError
     * @param template instance to be copied
     * @return copy instance
     */
    public static InvalidCredentialsError of(final InvalidCredentialsError template) {
        InvalidCredentialsErrorImpl instance = new InvalidCredentialsErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public InvalidCredentialsError copyDeep();

    /**
     * factory method to create a deep copy of InvalidCredentialsError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InvalidCredentialsError deepCopy(@Nullable final InvalidCredentialsError template) {
        if (template == null) {
            return null;
        }
        InvalidCredentialsErrorImpl instance = new InvalidCredentialsErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for InvalidCredentialsError
     * @return builder
     */
    public static InvalidCredentialsErrorBuilder builder() {
        return InvalidCredentialsErrorBuilder.of();
    }

    /**
     * create builder for InvalidCredentialsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidCredentialsErrorBuilder builder(final InvalidCredentialsError template) {
        return InvalidCredentialsErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInvalidCredentialsError(Function<InvalidCredentialsError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InvalidCredentialsError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidCredentialsError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidCredentialsError>";
            }
        };
    }
}
