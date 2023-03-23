
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when a previous conflicting operation is still pending and needs to finish before the request can succeed.</p>
 *  <p>The client application should retry the request with exponential backoff up to a point where further delay is unacceptable. If the error persists, report it using the Support Portal.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PendingOperationErrorImpl.class)
public interface PendingOperationError extends ErrorObject {

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

    public void setMessage(final String message);

    public static PendingOperationError of() {
        return new PendingOperationErrorImpl();
    }

    public static PendingOperationError of(final PendingOperationError template) {
        PendingOperationErrorImpl instance = new PendingOperationErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static PendingOperationErrorBuilder builder() {
        return PendingOperationErrorBuilder.of();
    }

    public static PendingOperationErrorBuilder builder(final PendingOperationError template) {
        return PendingOperationErrorBuilder.of(template);
    }

    default <T> T withPendingOperationError(Function<PendingOperationError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PendingOperationError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PendingOperationError>() {
            @Override
            public String toString() {
                return "TypeReference<PendingOperationError>";
            }
        };
    }
}
