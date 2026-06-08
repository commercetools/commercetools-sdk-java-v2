
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Cart Discounts are applied to recurring and non-recurring Orders.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AnyOrder anyOrder = AnyOrder.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AnyOrder")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AnyOrderImpl.class)
public interface AnyOrder extends RecurringOrderScope {

    /**
     * discriminator value for AnyOrder
     */
    String ANY_ORDER = "AnyOrder";

    /**
     * factory method
     * @return instance of AnyOrder
     */
    public static AnyOrder of() {
        return new AnyOrderImpl();
    }

    /**
     * factory method to create a shallow copy AnyOrder
     * @param template instance to be copied
     * @return copy instance
     */
    public static AnyOrder of(final AnyOrder template) {
        AnyOrderImpl instance = new AnyOrderImpl();
        return instance;
    }

    public AnyOrder copyDeep();

    /**
     * factory method to create a deep copy of AnyOrder
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AnyOrder deepCopy(@Nullable final AnyOrder template) {
        if (template == null) {
            return null;
        }
        AnyOrderImpl instance = new AnyOrderImpl();
        return instance;
    }

    /**
     * builder factory method for AnyOrder
     * @return builder
     */
    public static AnyOrderBuilder builder() {
        return AnyOrderBuilder.of();
    }

    /**
     * create builder for AnyOrder instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AnyOrderBuilder builder(final AnyOrder template) {
        return AnyOrderBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAnyOrder(Function<AnyOrder, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AnyOrder> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AnyOrder>() {
            @Override
            public String toString() {
                return "TypeReference<AnyOrder>";
            }
        };
    }
}
