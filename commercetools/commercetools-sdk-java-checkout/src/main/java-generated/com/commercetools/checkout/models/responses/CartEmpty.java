
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
 *  <p>Generated when the <span>Cart</span> for the current checkout is empty. The Cart must contain at least one <span>Line Item</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartEmpty cartEmpty = CartEmpty.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("cart_empty")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartEmptyImpl.class)
public interface CartEmpty extends ResponseMessage {

    /**
     * discriminator value for CartEmpty
     */
    String CART_EMPTY = "cart_empty";

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
     *  <p>Cart <code>{cartId}</code> is empty.</p>
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
     *  <p>Contains the <code>cart</code> object with the <code>id</code> property.</p>
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
     *  <p>Cart <code>{cartId}</code> is empty.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>cart</code> object with the <code>id</code> property.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of CartEmpty
     */
    public static CartEmpty of() {
        return new CartEmptyImpl();
    }

    /**
     * factory method to create a shallow copy CartEmpty
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartEmpty of(final CartEmpty template) {
        CartEmptyImpl instance = new CartEmptyImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public CartEmpty copyDeep();

    /**
     * factory method to create a deep copy of CartEmpty
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartEmpty deepCopy(@Nullable final CartEmpty template) {
        if (template == null) {
            return null;
        }
        CartEmptyImpl instance = new CartEmptyImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for CartEmpty
     * @return builder
     */
    public static CartEmptyBuilder builder() {
        return CartEmptyBuilder.of();
    }

    /**
     * create builder for CartEmpty instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartEmptyBuilder builder(final CartEmpty template) {
        return CartEmptyBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartEmpty(Function<CartEmpty, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartEmpty> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartEmpty>() {
            @Override
            public String toString() {
                return "TypeReference<CartEmpty>";
            }
        };
    }
}
