
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Indicates that the edit has not been applied or processed in any way.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditNotProcessed orderEditNotProcessed = OrderEditNotProcessed.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("NotProcessed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditNotProcessedImpl.class)
public interface OrderEditNotProcessed extends OrderEditResult {

    /**
     * discriminator value for OrderEditNotProcessed
     */
    String NOT_PROCESSED = "NotProcessed";

    /**
     *  <p>This field is queryable.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     * factory method
     * @return instance of OrderEditNotProcessed
     */
    public static OrderEditNotProcessed of() {
        return new OrderEditNotProcessedImpl();
    }

    /**
     * factory method to create a shallow copy OrderEditNotProcessed
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEditNotProcessed of(final OrderEditNotProcessed template) {
        OrderEditNotProcessedImpl instance = new OrderEditNotProcessedImpl();
        return instance;
    }

    public OrderEditNotProcessed copyDeep();

    /**
     * factory method to create a deep copy of OrderEditNotProcessed
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderEditNotProcessed deepCopy(@Nullable final OrderEditNotProcessed template) {
        if (template == null) {
            return null;
        }
        OrderEditNotProcessedImpl instance = new OrderEditNotProcessedImpl();
        return instance;
    }

    /**
     * builder factory method for OrderEditNotProcessed
     * @return builder
     */
    public static OrderEditNotProcessedBuilder builder() {
        return OrderEditNotProcessedBuilder.of();
    }

    /**
     * create builder for OrderEditNotProcessed instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditNotProcessedBuilder builder(final OrderEditNotProcessed template) {
        return OrderEditNotProcessedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditNotProcessed(Function<OrderEditNotProcessed, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditNotProcessed> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditNotProcessed>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditNotProcessed>";
            }
        };
    }
}
