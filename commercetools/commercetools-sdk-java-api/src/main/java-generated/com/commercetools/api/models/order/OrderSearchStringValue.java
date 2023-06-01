package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchQueryExpressionValue;
import com.commercetools.api.models.order.OrderSearchStringValueImpl;

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
 * OrderSearchStringValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchStringValue orderSearchStringValue = OrderSearchStringValue.builder()
 *             .field("{field}")
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderSearchStringValueImpl.class)
public interface OrderSearchStringValue extends OrderSearchQueryExpressionValue {


    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public String getValue();
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
    
    public void setValue(final String value);
    
    
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
     * @return instance of OrderSearchStringValue
     */
    public static OrderSearchStringValue of(){
        return new OrderSearchStringValueImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderSearchStringValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchStringValue of(final OrderSearchStringValue template) {
        OrderSearchStringValueImpl instance = new OrderSearchStringValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setCustomType(template.getCustomType());
        instance.setValue(template.getValue());
        instance.setLanguage(template.getLanguage());
        instance.setCaseInsensitive(template.getCaseInsensitive());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSearchStringValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchStringValue deepCopy(@Nullable final OrderSearchStringValue template) {
        if (template == null) {
            return null;
        }
        OrderSearchStringValueImpl instance = new OrderSearchStringValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setCustomType(template.getCustomType());
        instance.setValue(template.getValue());
        instance.setLanguage(template.getLanguage());
        instance.setCaseInsensitive(template.getCaseInsensitive());
        return instance;
    }

    /**
     * builder factory method for OrderSearchStringValue
     * @return builder
     */
    public static OrderSearchStringValueBuilder builder() {
        return OrderSearchStringValueBuilder.of();
    }
    
    /**
     * create builder for OrderSearchStringValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchStringValueBuilder builder(final OrderSearchStringValue template) {
        return OrderSearchStringValueBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchStringValue(Function<OrderSearchStringValue, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchStringValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchStringValue>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchStringValue>";
            }
        };
    }
}
