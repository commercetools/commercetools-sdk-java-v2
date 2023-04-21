
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchNumberRangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchNumberRangeValue orderSearchNumberRangeValue = OrderSearchNumberRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchNumberRangeValueImpl.class)
public interface OrderSearchNumberRangeValue extends OrderSearchQueryExpressionValue {

    /**
     *
     * @return gte
     */

    @JsonProperty("gte")
    public Double getGte();

    /**
     *
     * @return lte
     */

    @JsonProperty("lte")
    public Double getLte();

    /**
     * set gte
     * @param gte value to be set
     */

    public void setGte(final Double gte);

    /**
     * set lte
     * @param lte value to be set
     */

    public void setLte(final Double lte);

    /**
     * factory method
     * @return instance of OrderSearchNumberRangeValue
     */
    public static OrderSearchNumberRangeValue of() {
        return new OrderSearchNumberRangeValueImpl();
    }

    /**
     * factory method to create a shallow copy OrderSearchNumberRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchNumberRangeValue of(final OrderSearchNumberRangeValue template) {
        OrderSearchNumberRangeValueImpl instance = new OrderSearchNumberRangeValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setCustomType(template.getCustomType());
        instance.setGte(template.getGte());
        instance.setLte(template.getLte());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSearchNumberRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchNumberRangeValue deepCopy(@Nullable final OrderSearchNumberRangeValue template) {
        if (template == null) {
            return null;
        }
        OrderSearchNumberRangeValueImpl instance = new OrderSearchNumberRangeValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setCustomType(template.getCustomType());
        instance.setGte(template.getGte());
        instance.setLte(template.getLte());
        return instance;
    }

    /**
     * builder factory method for OrderSearchNumberRangeValue
     * @return builder
     */
    public static OrderSearchNumberRangeValueBuilder builder() {
        return OrderSearchNumberRangeValueBuilder.of();
    }

    /**
     * create builder for OrderSearchNumberRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchNumberRangeValueBuilder builder(final OrderSearchNumberRangeValue template) {
        return OrderSearchNumberRangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchNumberRangeValue(Function<OrderSearchNumberRangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchNumberRangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchNumberRangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchNumberRangeValue>";
            }
        };
    }
}
