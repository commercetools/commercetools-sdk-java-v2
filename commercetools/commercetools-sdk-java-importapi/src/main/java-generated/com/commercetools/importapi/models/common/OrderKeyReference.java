
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>References an order by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderKeyReference orderKeyReference = OrderKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("order")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderKeyReferenceImpl.class)
public interface OrderKeyReference extends KeyReference {

    /**
     * discriminator value for OrderKeyReference
     */
    String ORDER = "order";

    /**
     * factory method
     * @return instance of OrderKeyReference
     */
    public static OrderKeyReference of() {
        return new OrderKeyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy OrderKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderKeyReference of(final OrderKeyReference template) {
        OrderKeyReferenceImpl instance = new OrderKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public OrderKeyReference copyDeep();

    /**
     * factory method to create a deep copy of OrderKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderKeyReference deepCopy(@Nullable final OrderKeyReference template) {
        if (template == null) {
            return null;
        }
        OrderKeyReferenceImpl instance = new OrderKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for OrderKeyReference
     * @return builder
     */
    public static OrderKeyReferenceBuilder builder() {
        return OrderKeyReferenceBuilder.of();
    }

    /**
     * create builder for OrderKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderKeyReferenceBuilder builder(final OrderKeyReference template) {
        return OrderKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderKeyReference(Function<OrderKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<OrderKeyReference>";
            }
        };
    }
}
