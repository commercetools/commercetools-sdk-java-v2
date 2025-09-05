
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
 *  <p>Generated when no <span>Shipping Method</span> is available for the shipping address of the <span>Cart</span>. This may indicate an incomplete configuration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NoShippingMethods noShippingMethods = NoShippingMethods.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("no_shipping_methods")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = NoShippingMethodsImpl.class)
public interface NoShippingMethods extends ResponseMessage {

    /**
     * discriminator value for NoShippingMethods
     */
    String NO_SHIPPING_METHODS = "no_shipping_methods";

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
     *  <p>There are no shipping methods matching cart.</p>
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
     *  <p>There are no shipping methods matching cart.</p>
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
     * @return instance of NoShippingMethods
     */
    public static NoShippingMethods of() {
        return new NoShippingMethodsImpl();
    }

    /**
     * factory method to create a shallow copy NoShippingMethods
     * @param template instance to be copied
     * @return copy instance
     */
    public static NoShippingMethods of(final NoShippingMethods template) {
        NoShippingMethodsImpl instance = new NoShippingMethodsImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public NoShippingMethods copyDeep();

    /**
     * factory method to create a deep copy of NoShippingMethods
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static NoShippingMethods deepCopy(@Nullable final NoShippingMethods template) {
        if (template == null) {
            return null;
        }
        NoShippingMethodsImpl instance = new NoShippingMethodsImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for NoShippingMethods
     * @return builder
     */
    public static NoShippingMethodsBuilder builder() {
        return NoShippingMethodsBuilder.of();
    }

    /**
     * create builder for NoShippingMethods instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NoShippingMethodsBuilder builder(final NoShippingMethods template) {
        return NoShippingMethodsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withNoShippingMethods(Function<NoShippingMethods, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<NoShippingMethods> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<NoShippingMethods>() {
            @Override
            public String toString() {
                return "TypeReference<NoShippingMethods>";
            }
        };
    }
}
