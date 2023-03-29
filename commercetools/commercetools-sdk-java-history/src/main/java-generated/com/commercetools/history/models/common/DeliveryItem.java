
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryItem
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryItem deliveryItem = DeliveryItem.builder()
 *             .id("{id}")
 *             .quantity(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryItemImpl.class)
public interface DeliveryItem {

    /**
     *
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Integer getQuantity();

    /**
     * set id
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * set quantity
     * @param quantity value to be set
     */

    public void setQuantity(final Integer quantity);

    /**
     * factory method
     * @return instance of DeliveryItem
     */
    public static DeliveryItem of() {
        return new DeliveryItemImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryItem
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryItem of(final DeliveryItem template) {
        DeliveryItemImpl instance = new DeliveryItemImpl();
        instance.setId(template.getId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * factory method to create a deep copy of DeliveryItem
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryItem deepCopy(@Nullable final DeliveryItem template) {
        if (template == null) {
            return null;
        }
        DeliveryItemImpl instance = new DeliveryItemImpl();
        instance.setId(template.getId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for DeliveryItem
     * @return builder
     */
    public static DeliveryItemBuilder builder() {
        return DeliveryItemBuilder.of();
    }

    /**
     * create builder for DeliveryItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryItemBuilder builder(final DeliveryItem template) {
        return DeliveryItemBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryItem(Function<DeliveryItem, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryItem>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryItem>";
            }
        };
    }
}
