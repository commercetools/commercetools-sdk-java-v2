package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchQueryExpressionValue;
import java.time.ZonedDateTime;
import com.commercetools.api.models.order.OrderSearchDateRangeValueImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * OrderSearchDateRangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchDateRangeValue orderSearchDateRangeValue = OrderSearchDateRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderSearchDateRangeValueImpl.class)
public interface OrderSearchDateRangeValue extends OrderSearchQueryExpressionValue {


    /**
     *
     * @return gte
     */
    
    @JsonProperty("gte")
    public ZonedDateTime getGte();
    /**
     *
     * @return lte
     */
    
    @JsonProperty("lte")
    public ZonedDateTime getLte();

    /**
     * set gte
     * @param gte value to be set
     */
    
    public void setGte(final ZonedDateTime gte);
    
    
    /**
     * set lte
     * @param lte value to be set
     */
    
    public void setLte(final ZonedDateTime lte);
    

    /**
     * factory method
     * @return instance of OrderSearchDateRangeValue
     */
    public static OrderSearchDateRangeValue of(){
        return new OrderSearchDateRangeValueImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderSearchDateRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchDateRangeValue of(final OrderSearchDateRangeValue template) {
        OrderSearchDateRangeValueImpl instance = new OrderSearchDateRangeValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setCustomType(template.getCustomType());
        instance.setGte(template.getGte());
        instance.setLte(template.getLte());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSearchDateRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchDateRangeValue deepCopy(@Nullable final OrderSearchDateRangeValue template) {
        if (template == null) {
            return null;
        }
        OrderSearchDateRangeValueImpl instance = new OrderSearchDateRangeValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setCustomType(template.getCustomType());
        instance.setGte(template.getGte());
        instance.setLte(template.getLte());
        return instance;
    }

    /**
     * builder factory method for OrderSearchDateRangeValue
     * @return builder
     */
    public static OrderSearchDateRangeValueBuilder builder() {
        return OrderSearchDateRangeValueBuilder.of();
    }
    
    /**
     * create builder for OrderSearchDateRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchDateRangeValueBuilder builder(final OrderSearchDateRangeValue template) {
        return OrderSearchDateRangeValueBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchDateRangeValue(Function<OrderSearchDateRangeValue, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchDateRangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchDateRangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchDateRangeValue>";
            }
        };
    }
}
