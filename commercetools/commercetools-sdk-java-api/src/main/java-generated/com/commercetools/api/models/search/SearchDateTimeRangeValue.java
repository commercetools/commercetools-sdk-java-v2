
package com.commercetools.api.models.search;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchDateTimeRangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchDateTimeRangeValue searchDateTimeRangeValue = SearchDateTimeRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchDateTimeRangeValueImpl.class)
public interface SearchDateTimeRangeValue extends SearchQueryExpressionValue {

    /**
     *
     * @return gte
     */

    @JsonProperty("gte")
    public ZonedDateTime getGte();

    /**
     *
     * @return gt
     */

    @JsonProperty("gt")
    public ZonedDateTime getGt();

    /**
     *
     * @return lte
     */

    @JsonProperty("lte")
    public ZonedDateTime getLte();

    /**
     *
     * @return lt
     */

    @JsonProperty("lt")
    public ZonedDateTime getLt();

    /**
     * set gte
     * @param gte value to be set
     */

    public void setGte(final ZonedDateTime gte);

    /**
     * set gt
     * @param gt value to be set
     */

    public void setGt(final ZonedDateTime gt);

    /**
     * set lte
     * @param lte value to be set
     */

    public void setLte(final ZonedDateTime lte);

    /**
     * set lt
     * @param lt value to be set
     */

    public void setLt(final ZonedDateTime lt);

    /**
     * factory method
     * @return instance of SearchDateTimeRangeValue
     */
    public static SearchDateTimeRangeValue of() {
        return new SearchDateTimeRangeValueImpl();
    }

    /**
     * factory method to create a shallow copy SearchDateTimeRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchDateTimeRangeValue of(final SearchDateTimeRangeValue template) {
        SearchDateTimeRangeValueImpl instance = new SearchDateTimeRangeValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setFieldType(template.getFieldType());
        instance.setGte(template.getGte());
        instance.setGt(template.getGt());
        instance.setLte(template.getLte());
        instance.setLt(template.getLt());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchDateTimeRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchDateTimeRangeValue deepCopy(@Nullable final SearchDateTimeRangeValue template) {
        if (template == null) {
            return null;
        }
        SearchDateTimeRangeValueImpl instance = new SearchDateTimeRangeValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setFieldType(template.getFieldType());
        instance.setGte(template.getGte());
        instance.setGt(template.getGt());
        instance.setLte(template.getLte());
        instance.setLt(template.getLt());
        return instance;
    }

    /**
     * builder factory method for SearchDateTimeRangeValue
     * @return builder
     */
    public static SearchDateTimeRangeValueBuilder builder() {
        return SearchDateTimeRangeValueBuilder.of();
    }

    /**
     * create builder for SearchDateTimeRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchDateTimeRangeValueBuilder builder(final SearchDateTimeRangeValue template) {
        return SearchDateTimeRangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchDateTimeRangeValue(Function<SearchDateTimeRangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchDateTimeRangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchDateTimeRangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<SearchDateTimeRangeValue>";
            }
        };
    }
}
