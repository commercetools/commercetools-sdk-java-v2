
package com.commercetools.api.models.search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchLongRangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchLongRangeValue searchLongRangeValue = SearchLongRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchLongRangeValueImpl.class)
public interface SearchLongRangeValue extends SearchQueryExpressionValue {

    /**
     *
     * @return gte
     */

    @JsonProperty("gte")
    public Long getGte();

    /**
     *
     * @return gt
     */

    @JsonProperty("gt")
    public Long getGt();

    /**
     *
     * @return lte
     */

    @JsonProperty("lte")
    public Long getLte();

    /**
     *
     * @return lt
     */

    @JsonProperty("lt")
    public Long getLt();

    /**
     * set gte
     * @param gte value to be set
     */

    public void setGte(final Long gte);

    /**
     * set gt
     * @param gt value to be set
     */

    public void setGt(final Long gt);

    /**
     * set lte
     * @param lte value to be set
     */

    public void setLte(final Long lte);

    /**
     * set lt
     * @param lt value to be set
     */

    public void setLt(final Long lt);

    /**
     * factory method
     * @return instance of SearchLongRangeValue
     */
    public static SearchLongRangeValue of() {
        return new SearchLongRangeValueImpl();
    }

    /**
     * factory method to create a shallow copy SearchLongRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchLongRangeValue of(final SearchLongRangeValue template) {
        SearchLongRangeValueImpl instance = new SearchLongRangeValueImpl();
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
     * factory method to create a deep copy of SearchLongRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchLongRangeValue deepCopy(@Nullable final SearchLongRangeValue template) {
        if (template == null) {
            return null;
        }
        SearchLongRangeValueImpl instance = new SearchLongRangeValueImpl();
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
     * builder factory method for SearchLongRangeValue
     * @return builder
     */
    public static SearchLongRangeValueBuilder builder() {
        return SearchLongRangeValueBuilder.of();
    }

    /**
     * create builder for SearchLongRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchLongRangeValueBuilder builder(final SearchLongRangeValue template) {
        return SearchLongRangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchLongRangeValue(Function<SearchLongRangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchLongRangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchLongRangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<SearchLongRangeValue>";
            }
        };
    }
}
