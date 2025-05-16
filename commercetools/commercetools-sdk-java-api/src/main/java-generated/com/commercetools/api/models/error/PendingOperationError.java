
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
 *  <p>Returned when a previous conflicting operation is still pending and needs to finish before the request can succeed.</p>
 *  <p>The client application should retry the request with exponential backoff up to a point where further delay is unacceptable. If the error persists, report it to the Composable Commerce support team.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PendingOperationError pendingOperationError = PendingOperationError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PendingOperation")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PendingOperationErrorImpl.class)
public interface PendingOperationError extends ErrorObject {

    /**
     * discriminator value for PendingOperationError
     */
    String PENDING_OPERATION = "PendingOperation";

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
     * @return instance of PendingOperationError
     */
    public static PendingOperationError of() {
        return new PendingOperationErrorImpl();
    }

    /**
     * factory method to create a shallow copy PendingOperationError
     * @param template instance to be copied
     * @return copy instance
     */
    public static PendingOperationError of(final PendingOperationError template) {
        PendingOperationErrorImpl instance = new PendingOperationErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public PendingOperationError copyDeep();

    /**
     * factory method to create a deep copy of PendingOperationError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PendingOperationError deepCopy(@Nullable final PendingOperationError template) {
        if (template == null) {
            return null;
        }
        PendingOperationErrorImpl instance = new PendingOperationErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for PendingOperationError
     * @return builder
     */
    public static PendingOperationErrorBuilder builder() {
        return PendingOperationErrorBuilder.of();
    }

    /**
     * create builder for PendingOperationError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PendingOperationErrorBuilder builder(final PendingOperationError template) {
        return PendingOperationErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPendingOperationError(Function<PendingOperationError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PendingOperationError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PendingOperationError>() {
            @Override
            public String toString() {
                return "TypeReference<PendingOperationError>";
            }
        };
    }
}
