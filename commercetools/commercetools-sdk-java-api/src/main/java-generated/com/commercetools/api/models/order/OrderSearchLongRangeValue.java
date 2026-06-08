
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchLongRangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchLongRangeValue orderSearchLongRangeValue = OrderSearchLongRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchLongRangeValueImpl.class)
public interface OrderSearchLongRangeValue extends OrderSearchQueryExpressionValue {

    /**
     *
     * @return gte
     */

    @JsonProperty("gte")
    public Long getGte();

    /**
     *
     * @return lte
     */

    @JsonProperty("lte")
    public Long getLte();

    /**
     * set gte
     * @param gte value to be set
     */

    public void setGte(final Long gte);

    /**
     * set lte
     * @param lte value to be set
     */

    public void setLte(final Long lte);

    /**
     * factory method
     * @return instance of OrderSearchLongRangeValue
     */
    public static OrderSearchLongRangeValue of() {
        return new OrderSearchLongRangeValueImpl();
    }

    /**
     * factory method to create a shallow copy OrderSearchLongRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchLongRangeValue of(final OrderSearchLongRangeValue template) {
        OrderSearchLongRangeValueImpl instance = new OrderSearchLongRangeValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setCustomType(template.getCustomType());
        instance.setGte(template.getGte());
        instance.setLte(template.getLte());
        return instance;
    }

    public OrderSearchLongRangeValue copyDeep();

    /**
     * factory method to create a deep copy of OrderSearchLongRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchLongRangeValue deepCopy(@Nullable final OrderSearchLongRangeValue template) {
        if (template == null) {
            return null;
        }
        OrderSearchLongRangeValueImpl instance = new OrderSearchLongRangeValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setCustomType(template.getCustomType());
        instance.setGte(template.getGte());
        instance.setLte(template.getLte());
        return instance;
    }

    /**
     * builder factory method for OrderSearchLongRangeValue
     * @return builder
     */
    public static OrderSearchLongRangeValueBuilder builder() {
        return OrderSearchLongRangeValueBuilder.of();
    }

    /**
     * create builder for OrderSearchLongRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchLongRangeValueBuilder builder(final OrderSearchLongRangeValue template) {
        return OrderSearchLongRangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchLongRangeValue(Function<OrderSearchLongRangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchLongRangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchLongRangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchLongRangeValue>";
            }
        };
    }
}
