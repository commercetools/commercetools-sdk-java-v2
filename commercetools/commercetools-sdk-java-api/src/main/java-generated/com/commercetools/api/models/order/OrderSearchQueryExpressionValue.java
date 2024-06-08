
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * OrderSearchQueryExpressionValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchQueryExpressionValue orderSearchQueryExpressionValue = OrderSearchQueryExpressionValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchQueryExpressionValueImpl.class)
public interface OrderSearchQueryExpressionValue {

    /**
     *
     * @return field
     */
    @NotNull
    @JsonProperty("field")
    public String getField();

    /**
     *
     * @return boost
     */

    @JsonProperty("boost")
    public Integer getBoost();

    /**
     *
     * @return customType
     */

    @JsonProperty("customType")
    public String getCustomType();

    /**
     * set field
     * @param field value to be set
     */

    public void setField(final String field);

    /**
     * set boost
     * @param boost value to be set
     */

    public void setBoost(final Integer boost);

    /**
     * set customType
     * @param customType value to be set
     */

    public void setCustomType(final String customType);

    /**
     * factory method
     * @return instance of OrderSearchQueryExpressionValue
     */
    public static OrderSearchQueryExpressionValue of() {
        return new OrderSearchQueryExpressionValueImpl();
    }

    /**
     * factory method to create a shallow copy OrderSearchQueryExpressionValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchQueryExpressionValue of(final OrderSearchQueryExpressionValue template) {
        OrderSearchQueryExpressionValueImpl instance = new OrderSearchQueryExpressionValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setCustomType(template.getCustomType());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSearchQueryExpressionValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchQueryExpressionValue deepCopy(@Nullable final OrderSearchQueryExpressionValue template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.order.OrderSearchAnyValue) {
            return com.commercetools.api.models.order.OrderSearchAnyValue
                    .deepCopy((com.commercetools.api.models.order.OrderSearchAnyValue) template);
        }
        if (template instanceof com.commercetools.api.models.order.OrderSearchDateRangeValue) {
            return com.commercetools.api.models.order.OrderSearchDateRangeValue
                    .deepCopy((com.commercetools.api.models.order.OrderSearchDateRangeValue) template);
        }
        if (template instanceof com.commercetools.api.models.order.OrderSearchFullTextValue) {
            return com.commercetools.api.models.order.OrderSearchFullTextValue
                    .deepCopy((com.commercetools.api.models.order.OrderSearchFullTextValue) template);
        }
        if (template instanceof com.commercetools.api.models.order.OrderSearchLongRangeValue) {
            return com.commercetools.api.models.order.OrderSearchLongRangeValue
                    .deepCopy((com.commercetools.api.models.order.OrderSearchLongRangeValue) template);
        }
        if (template instanceof com.commercetools.api.models.order.OrderSearchNumberRangeValue) {
            return com.commercetools.api.models.order.OrderSearchNumberRangeValue
                    .deepCopy((com.commercetools.api.models.order.OrderSearchNumberRangeValue) template);
        }
        if (template instanceof com.commercetools.api.models.order.OrderSearchStringValue) {
            return com.commercetools.api.models.order.OrderSearchStringValue
                    .deepCopy((com.commercetools.api.models.order.OrderSearchStringValue) template);
        }
        OrderSearchQueryExpressionValueImpl instance = new OrderSearchQueryExpressionValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setCustomType(template.getCustomType());
        return instance;
    }

    /**
     * builder factory method for OrderSearchQueryExpressionValue
     * @return builder
     */
    public static OrderSearchQueryExpressionValueBuilder builder() {
        return OrderSearchQueryExpressionValueBuilder.of();
    }

    /**
     * create builder for OrderSearchQueryExpressionValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchQueryExpressionValueBuilder builder(final OrderSearchQueryExpressionValue template) {
        return OrderSearchQueryExpressionValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchQueryExpressionValue(Function<OrderSearchQueryExpressionValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchQueryExpressionValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchQueryExpressionValue>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchQueryExpressionValue>";
            }
        };
    }
}
