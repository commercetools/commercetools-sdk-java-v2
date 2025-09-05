
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
 *  <p>Generated when the Order could not be created due to inconsistencies in the <span>Cart</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NonOrderableCartError nonOrderableCartError = NonOrderableCartError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("non_orderable_cart_error")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = NonOrderableCartErrorImpl.class)
public interface NonOrderableCartError extends ResponseMessage {

    /**
     * discriminator value for NonOrderableCartError
     */
    String NON_ORDERABLE_CART_ERROR = "non_orderable_cart_error";

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
     *  <p>This cart is not orderable.</p>
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
     *  <p>Contains the <code>cart</code> object with the <code>id</code> and <code>errors</code> properties.</p>
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
     *  <p>This cart is not orderable.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>cart</code> object with the <code>id</code> and <code>errors</code> properties.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of NonOrderableCartError
     */
    public static NonOrderableCartError of() {
        return new NonOrderableCartErrorImpl();
    }

    /**
     * factory method to create a shallow copy NonOrderableCartError
     * @param template instance to be copied
     * @return copy instance
     */
    public static NonOrderableCartError of(final NonOrderableCartError template) {
        NonOrderableCartErrorImpl instance = new NonOrderableCartErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public NonOrderableCartError copyDeep();

    /**
     * factory method to create a deep copy of NonOrderableCartError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static NonOrderableCartError deepCopy(@Nullable final NonOrderableCartError template) {
        if (template == null) {
            return null;
        }
        NonOrderableCartErrorImpl instance = new NonOrderableCartErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for NonOrderableCartError
     * @return builder
     */
    public static NonOrderableCartErrorBuilder builder() {
        return NonOrderableCartErrorBuilder.of();
    }

    /**
     * create builder for NonOrderableCartError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NonOrderableCartErrorBuilder builder(final NonOrderableCartError template) {
        return NonOrderableCartErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withNonOrderableCartError(Function<NonOrderableCartError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<NonOrderableCartError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<NonOrderableCartError>() {
            @Override
            public String toString() {
                return "TypeReference<NonOrderableCartError>";
            }
        };
    }
}
