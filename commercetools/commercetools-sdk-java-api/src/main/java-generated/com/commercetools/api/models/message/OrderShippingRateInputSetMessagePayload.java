
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.cart.ShippingRateInput;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set ShippingRateInput update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderShippingRateInputSetMessagePayload orderShippingRateInputSetMessagePayload = OrderShippingRateInputSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderShippingRateInputSetMessagePayloadImpl.class)
public interface OrderShippingRateInputSetMessagePayload extends OrderMessagePayload {

    String ORDER_SHIPPING_RATE_INPUT_SET = "OrderShippingRateInputSet";

    /**
     *  <p>ShippingRateInput after the Set ShippingRateInput update action.</p>
     * @return shippingRateInput
     */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInput getShippingRateInput();

    /**
     *  <p>ShippingRateInput before the Set ShippingRateInput update action.</p>
     * @return oldShippingRateInput
     */
    @Valid
    @JsonProperty("oldShippingRateInput")
    public ShippingRateInput getOldShippingRateInput();

    public void setShippingRateInput(final ShippingRateInput shippingRateInput);

    public void setOldShippingRateInput(final ShippingRateInput oldShippingRateInput);

    public static OrderShippingRateInputSetMessagePayload of() {
        return new OrderShippingRateInputSetMessagePayloadImpl();
    }

    public static OrderShippingRateInputSetMessagePayload of(final OrderShippingRateInputSetMessagePayload template) {
        OrderShippingRateInputSetMessagePayloadImpl instance = new OrderShippingRateInputSetMessagePayloadImpl();
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setOldShippingRateInput(template.getOldShippingRateInput());
        return instance;
    }

    public static OrderShippingRateInputSetMessagePayloadBuilder builder() {
        return OrderShippingRateInputSetMessagePayloadBuilder.of();
    }

    public static OrderShippingRateInputSetMessagePayloadBuilder builder(
            final OrderShippingRateInputSetMessagePayload template) {
        return OrderShippingRateInputSetMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderShippingRateInputSetMessagePayload(
            Function<OrderShippingRateInputSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderShippingRateInputSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderShippingRateInputSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderShippingRateInputSetMessagePayload>";
            }
        };
    }
}
