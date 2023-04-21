
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchAnyValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchAnyValue orderSearchAnyValue = OrderSearchAnyValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchAnyValueImpl.class)
public interface OrderSearchAnyValue extends OrderSearchQueryExpressionValue {

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *
     * @return language
     */

    @JsonProperty("language")
    public String getLanguage();

    /**
     *
     * @return caseInsensitive
     */

    @JsonProperty("caseInsensitive")
    public Boolean getCaseInsensitive();

    /**
     * set value
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * set language
     * @param language value to be set
     */

    public void setLanguage(final String language);

    /**
     * set caseInsensitive
     * @param caseInsensitive value to be set
     */

    public void setCaseInsensitive(final Boolean caseInsensitive);

    /**
     * factory method
     * @return instance of OrderSearchAnyValue
     */
    public static OrderSearchAnyValue of() {
        return new OrderSearchAnyValueImpl();
    }

    /**
     * factory method to create a shallow copy OrderSearchAnyValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchAnyValue of(final OrderSearchAnyValue template) {
        OrderSearchAnyValueImpl instance = new OrderSearchAnyValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setCustomType(template.getCustomType());
        instance.setValue(template.getValue());
        instance.setLanguage(template.getLanguage());
        instance.setCaseInsensitive(template.getCaseInsensitive());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSearchAnyValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchAnyValue deepCopy(@Nullable final OrderSearchAnyValue template) {
        if (template == null) {
            return null;
        }
        OrderSearchAnyValueImpl instance = new OrderSearchAnyValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setCustomType(template.getCustomType());
        instance.setValue(template.getValue());
        instance.setLanguage(template.getLanguage());
        instance.setCaseInsensitive(template.getCaseInsensitive());
        return instance;
    }

    /**
     * builder factory method for OrderSearchAnyValue
     * @return builder
     */
    public static OrderSearchAnyValueBuilder builder() {
        return OrderSearchAnyValueBuilder.of();
    }

    /**
     * create builder for OrderSearchAnyValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchAnyValueBuilder builder(final OrderSearchAnyValue template) {
        return OrderSearchAnyValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchAnyValue(Function<OrderSearchAnyValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchAnyValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchAnyValue>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchAnyValue>";
            }
        };
    }
}
