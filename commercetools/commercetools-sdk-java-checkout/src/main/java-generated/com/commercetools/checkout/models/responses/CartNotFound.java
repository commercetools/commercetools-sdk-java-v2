
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
 *  <p>Generated when the <span>Cart</span> is not found. To start the checkout process, a valid Cart with at least one <span>Line Item</span> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartNotFound cartNotFound = CartNotFound.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("cart_not_found")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartNotFoundImpl.class)
public interface CartNotFound extends ResponseMessage {

    /**
     * discriminator value for CartNotFound
     */
    String CART_NOT_FOUND = "cart_not_found";

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
     *  <p>Cart for <code>{projectKey}</code> and session <code>{sessionId}</code> not found.</p>
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
     *  <p>Contains the <code>project</code> and <code>session</code> objects with the related <code>key</code> and <code>id</code> properties.</p>
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
     *  <p>Cart for <code>{projectKey}</code> and session <code>{sessionId}</code> not found.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>project</code> and <code>session</code> objects with the related <code>key</code> and <code>id</code> properties.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of CartNotFound
     */
    public static CartNotFound of() {
        return new CartNotFoundImpl();
    }

    /**
     * factory method to create a shallow copy CartNotFound
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartNotFound of(final CartNotFound template) {
        CartNotFoundImpl instance = new CartNotFoundImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public CartNotFound copyDeep();

    /**
     * factory method to create a deep copy of CartNotFound
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartNotFound deepCopy(@Nullable final CartNotFound template) {
        if (template == null) {
            return null;
        }
        CartNotFoundImpl instance = new CartNotFoundImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for CartNotFound
     * @return builder
     */
    public static CartNotFoundBuilder builder() {
        return CartNotFoundBuilder.of();
    }

    /**
     * create builder for CartNotFound instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartNotFoundBuilder builder(final CartNotFound template) {
        return CartNotFoundBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartNotFound(Function<CartNotFound, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartNotFound> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartNotFound>() {
            @Override
            public String toString() {
                return "TypeReference<CartNotFound>";
            }
        };
    }
}
