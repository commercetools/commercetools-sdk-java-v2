
package com.commercetools.checkout.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Resource identifier to an <span>Order</span>. Either <code>id</code> or <code>key</code> is required. If both are set, an <span>InvalidJsonInput</span> error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderResourceIdentifier orderResourceIdentifier = OrderResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("order")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderResourceIdentifierImpl.class)
public interface OrderResourceIdentifier extends ResourceIdentifier {

    /**
     * discriminator value for OrderResourceIdentifier
     */
    String ORDER = "order";

    /**
     *  <p>Unique identifier of the referenced <span>Order</span>. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced <span>Order</span>. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced <span>Order</span>. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced <span>Order</span>. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of OrderResourceIdentifier
     */
    public static OrderResourceIdentifier of() {
        return new OrderResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy OrderResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderResourceIdentifier of(final OrderResourceIdentifier template) {
        OrderResourceIdentifierImpl instance = new OrderResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public OrderResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of OrderResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderResourceIdentifier deepCopy(@Nullable final OrderResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        OrderResourceIdentifierImpl instance = new OrderResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for OrderResourceIdentifier
     * @return builder
     */
    public static OrderResourceIdentifierBuilder builder() {
        return OrderResourceIdentifierBuilder.of();
    }

    /**
     * create builder for OrderResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderResourceIdentifierBuilder builder(final OrderResourceIdentifier template) {
        return OrderResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderResourceIdentifier(Function<OrderResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<OrderResourceIdentifier>";
            }
        };
    }
}
