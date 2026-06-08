
package com.commercetools.checkout.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Reference to an <span>Order</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderReference orderReference = OrderReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("order")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderReferenceImpl.class)
public interface OrderReference extends Reference {

    /**
     * discriminator value for OrderReference
     */
    String ORDER = "order";

    /**
     *  <p>Unique identifier of the referenced <span>Order</span>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique identifier of the referenced <span>Order</span>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of OrderReference
     */
    public static OrderReference of() {
        return new OrderReferenceImpl();
    }

    /**
     * factory method to create a shallow copy OrderReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderReference of(final OrderReference template) {
        OrderReferenceImpl instance = new OrderReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public OrderReference copyDeep();

    /**
     * factory method to create a deep copy of OrderReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderReference deepCopy(@Nullable final OrderReference template) {
        if (template == null) {
            return null;
        }
        OrderReferenceImpl instance = new OrderReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for OrderReference
     * @return builder
     */
    public static OrderReferenceBuilder builder() {
        return OrderReferenceBuilder.of();
    }

    /**
     * create builder for OrderReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderReferenceBuilder builder(final OrderReference template) {
        return OrderReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderReference(Function<OrderReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderReference>() {
            @Override
            public String toString() {
                return "TypeReference<OrderReference>";
            }
        };
    }
}
