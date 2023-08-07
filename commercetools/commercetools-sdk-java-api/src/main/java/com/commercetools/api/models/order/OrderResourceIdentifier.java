
package com.commercetools.api.models.order;

import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderResourceIdentifier
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@Deprecated
@JsonDeserialize(as = OrderResourceIdentifierImpl.class)
public interface OrderResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Order> {

    /**
     * discriminator value for OrderResourceIdentifier
     */
    String ORDER = "order";

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
