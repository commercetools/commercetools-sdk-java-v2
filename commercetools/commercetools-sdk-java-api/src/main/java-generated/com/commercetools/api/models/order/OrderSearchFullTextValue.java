
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
 * OrderSearchFullTextValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchFullTextValue orderSearchFullTextValue = OrderSearchFullTextValue.builder()
 *             .field("{field}")
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchFullTextValueImpl.class)
public interface OrderSearchFullTextValue extends OrderSearchQueryExpressionValue {

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
     * @return mustMatch
     */

    @JsonProperty("mustMatch")
    public OrderSearchMatchType getMustMatch();

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
     * set mustMatch
     * @param mustMatch value to be set
     */

    public void setMustMatch(final OrderSearchMatchType mustMatch);

    /**
     * factory method
     * @return instance of OrderSearchFullTextValue
     */
    public static OrderSearchFullTextValue of() {
        return new OrderSearchFullTextValueImpl();
    }

    /**
     * factory method to create a shallow copy OrderSearchFullTextValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchFullTextValue of(final OrderSearchFullTextValue template) {
        OrderSearchFullTextValueImpl instance = new OrderSearchFullTextValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setCustomType(template.getCustomType());
        instance.setValue(template.getValue());
        instance.setLanguage(template.getLanguage());
        instance.setMustMatch(template.getMustMatch());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSearchFullTextValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchFullTextValue deepCopy(@Nullable final OrderSearchFullTextValue template) {
        if (template == null) {
            return null;
        }
        OrderSearchFullTextValueImpl instance = new OrderSearchFullTextValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setCustomType(template.getCustomType());
        instance.setValue(template.getValue());
        instance.setLanguage(template.getLanguage());
        instance.setMustMatch(template.getMustMatch());
        return instance;
    }

    /**
     * builder factory method for OrderSearchFullTextValue
     * @return builder
     */
    public static OrderSearchFullTextValueBuilder builder() {
        return OrderSearchFullTextValueBuilder.of();
    }

    /**
     * create builder for OrderSearchFullTextValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchFullTextValueBuilder builder(final OrderSearchFullTextValue template) {
        return OrderSearchFullTextValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchFullTextValue(Function<OrderSearchFullTextValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchFullTextValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchFullTextValue>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchFullTextValue>";
            }
        };
    }
}
