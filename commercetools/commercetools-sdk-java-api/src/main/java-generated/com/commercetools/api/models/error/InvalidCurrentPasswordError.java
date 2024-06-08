
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
 *  <p>Returned when the current password of the Customer does not match.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Change Customer Password and Change Customer Password in a Store requests on Customers.</li>
 *   <li>Change Customer Password and Change Customer Password in a Store requests on My Customer Profile.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidCurrentPasswordError invalidCurrentPasswordError = InvalidCurrentPasswordError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidCurrentPasswordErrorImpl.class)
public interface InvalidCurrentPasswordError extends ErrorObject {

    /**
     * discriminator value for InvalidCurrentPasswordError
     */
    String INVALID_CURRENT_PASSWORD = "InvalidCurrentPassword";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The given current password does not match."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"The given current password does not match."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of InvalidCurrentPasswordError
     */
    public static InvalidCurrentPasswordError of() {
        return new InvalidCurrentPasswordErrorImpl();
    }

    /**
     * factory method to create a shallow copy InvalidCurrentPasswordError
     * @param template instance to be copied
     * @return copy instance
     */
    public static InvalidCurrentPasswordError of(final InvalidCurrentPasswordError template) {
        InvalidCurrentPasswordErrorImpl instance = new InvalidCurrentPasswordErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of InvalidCurrentPasswordError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InvalidCurrentPasswordError deepCopy(@Nullable final InvalidCurrentPasswordError template) {
        if (template == null) {
            return null;
        }
        InvalidCurrentPasswordErrorImpl instance = new InvalidCurrentPasswordErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for InvalidCurrentPasswordError
     * @return builder
     */
    public static InvalidCurrentPasswordErrorBuilder builder() {
        return InvalidCurrentPasswordErrorBuilder.of();
    }

    /**
     * create builder for InvalidCurrentPasswordError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidCurrentPasswordErrorBuilder builder(final InvalidCurrentPasswordError template) {
        return InvalidCurrentPasswordErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInvalidCurrentPasswordError(Function<InvalidCurrentPasswordError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InvalidCurrentPasswordError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidCurrentPasswordError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidCurrentPasswordError>";
            }
        };
    }
}
