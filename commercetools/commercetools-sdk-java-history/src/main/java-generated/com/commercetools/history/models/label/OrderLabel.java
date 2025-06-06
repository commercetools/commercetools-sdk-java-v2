
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * OrderLabel
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderLabel orderLabel = OrderLabel.builder()
 *             .customerEmail("{customerEmail}")
 *             .orderNumber("{orderNumber}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderLabel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderLabelImpl.class)
public interface OrderLabel extends Label {

    /**
     * discriminator value for OrderLabel
     */
    String ORDER_LABEL = "OrderLabel";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Email address of the Customer that the Order belongs to.</p>
     * @return customerEmail
     */
    @NotNull
    @JsonProperty("customerEmail")
    public String getCustomerEmail();

    /**
     *  <p>User-defined unique identifier of the Order that is unique across a Project.</p>
     * @return orderNumber
     */
    @NotNull
    @JsonProperty("orderNumber")
    public String getOrderNumber();

    /**
     *  <p>Email address of the Customer that the Order belongs to.</p>
     * @param customerEmail value to be set
     */

    public void setCustomerEmail(final String customerEmail);

    /**
     *  <p>User-defined unique identifier of the Order that is unique across a Project.</p>
     * @param orderNumber value to be set
     */

    public void setOrderNumber(final String orderNumber);

    /**
     * factory method
     * @return instance of OrderLabel
     */
    public static OrderLabel of() {
        return new OrderLabelImpl();
    }

    /**
     * factory method to create a shallow copy OrderLabel
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderLabel of(final OrderLabel template) {
        OrderLabelImpl instance = new OrderLabelImpl();
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setOrderNumber(template.getOrderNumber());
        return instance;
    }

    public OrderLabel copyDeep();

    /**
     * factory method to create a deep copy of OrderLabel
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderLabel deepCopy(@Nullable final OrderLabel template) {
        if (template == null) {
            return null;
        }
        OrderLabelImpl instance = new OrderLabelImpl();
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setOrderNumber(template.getOrderNumber());
        return instance;
    }

    /**
     * builder factory method for OrderLabel
     * @return builder
     */
    public static OrderLabelBuilder builder() {
        return OrderLabelBuilder.of();
    }

    /**
     * create builder for OrderLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderLabelBuilder builder(final OrderLabel template) {
        return OrderLabelBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderLabel(Function<OrderLabel, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderLabel>() {
            @Override
            public String toString() {
                return "TypeReference<OrderLabel>";
            }
        };
    }
}
