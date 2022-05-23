
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.Order;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderDeletedMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderDeletedMessagePayload orderDeletedMessagePayload = OrderDeletedMessagePayload.builder()
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderDeletedMessagePayloadImpl.class)
public interface OrderDeletedMessagePayload extends OrderMessagePayload {

    String ORDER_DELETED = "OrderDeleted";

    /**
     <>
     */
    @NotNull
    @Valid
    @JsonProperty("order")
    public Order getOrder();

    public void setOrder(final Order order);

    public static OrderDeletedMessagePayload of() {
        return new OrderDeletedMessagePayloadImpl();
    }

    public static OrderDeletedMessagePayload of(final OrderDeletedMessagePayload template) {
        OrderDeletedMessagePayloadImpl instance = new OrderDeletedMessagePayloadImpl();
        instance.setOrder(template.getOrder());
        return instance;
    }

    public static OrderDeletedMessagePayloadBuilder builder() {
        return OrderDeletedMessagePayloadBuilder.of();
    }

    public static OrderDeletedMessagePayloadBuilder builder(final OrderDeletedMessagePayload template) {
        return OrderDeletedMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderDeletedMessagePayload(Function<OrderDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderDeletedMessagePayload>";
            }
        };
    }
}
