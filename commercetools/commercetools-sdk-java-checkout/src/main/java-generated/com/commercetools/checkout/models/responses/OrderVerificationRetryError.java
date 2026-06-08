
package com.commercetools.checkout.models.responses;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when retrying the verification of the <span>Order</span> results in an error.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderVerificationRetryError orderVerificationRetryError = OrderVerificationRetryError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("order_verification_retry_error")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderVerificationRetryErrorImpl.class)
public interface OrderVerificationRetryError extends ResponseMessage {

    /**
     * discriminator value for OrderVerificationRetryError
     */
    String ORDER_VERIFICATION_RETRY_ERROR = "order_verification_retry_error";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>`error`</p>
     * @return severity
     */
    @NotNull
    @JsonProperty("severity")
    public String getSeverity();

    /**
     *  <p>Order verification retry error.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifier of the event.</p>
     * @return correlationId
     */
    @NotNull
    @JsonProperty("correlationId")
    public String getCorrelationId();

    /**
     *  <p>Contains the <code>error</code> property that can be either <code>orderReferenceNotAvailable</code> or <code>orderVerificationOngoing</code>.</p>
     * @return payload
     */
    @NotNull
    @Valid
    @JsonProperty("payload")
    public Object getPayload();

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Order verification retry error.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>error</code> property that can be either <code>orderReferenceNotAvailable</code> or <code>orderVerificationOngoing</code>.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of OrderVerificationRetryError
     */
    public static OrderVerificationRetryError of() {
        return new OrderVerificationRetryErrorImpl();
    }

    /**
     * factory method to create a shallow copy OrderVerificationRetryError
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderVerificationRetryError of(final OrderVerificationRetryError template) {
        OrderVerificationRetryErrorImpl instance = new OrderVerificationRetryErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public OrderVerificationRetryError copyDeep();

    /**
     * factory method to create a deep copy of OrderVerificationRetryError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderVerificationRetryError deepCopy(@Nullable final OrderVerificationRetryError template) {
        if (template == null) {
            return null;
        }
        OrderVerificationRetryErrorImpl instance = new OrderVerificationRetryErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for OrderVerificationRetryError
     * @return builder
     */
    public static OrderVerificationRetryErrorBuilder builder() {
        return OrderVerificationRetryErrorBuilder.of();
    }

    /**
     * create builder for OrderVerificationRetryError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderVerificationRetryErrorBuilder builder(final OrderVerificationRetryError template) {
        return OrderVerificationRetryErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderVerificationRetryError(Function<OrderVerificationRetryError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderVerificationRetryError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderVerificationRetryError>() {
            @Override
            public String toString() {
                return "TypeReference<OrderVerificationRetryError>";
            }
        };
    }
}
