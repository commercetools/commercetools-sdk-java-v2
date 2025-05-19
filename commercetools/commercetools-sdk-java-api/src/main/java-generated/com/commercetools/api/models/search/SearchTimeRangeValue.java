
package com.commercetools.api.models.search;

import java.time.*;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchTimeRangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchTimeRangeValue searchTimeRangeValue = SearchTimeRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchTimeRangeValueImpl.class)
public interface SearchTimeRangeValue extends SearchQueryExpressionValue {

    /**
     *
     * @return gte
     */

    @JsonProperty("gte")
    public LocalTime getGte();

    /**
     *
     * @return gt
     */

    @JsonProperty("gt")
    public LocalTime getGt();

    /**
     *
     * @return lte
     */

    @JsonProperty("lte")
    public LocalTime getLte();

    /**
     *
     * @return lt
     */

    @JsonProperty("lt")
    public LocalTime getLt();

    /**
     * set gte
     * @param gte value to be set
     */

    public void setGte(final LocalTime gte);

    /**
     * set gt
     * @param gt value to be set
     */

    public void setGt(final LocalTime gt);

    /**
     * set lte
     * @param lte value to be set
     */

    public void setLte(final LocalTime lte);

    /**
     * set lt
     * @param lt value to be set
     */

    public void setLt(final LocalTime lt);

    /**
     * factory method
     * @return instance of SearchTimeRangeValue
     */
    public static SearchTimeRangeValue of() {
        return new SearchTimeRangeValueImpl();
    }

    /**
     * factory method to create a shallow copy SearchTimeRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchTimeRangeValue of(final SearchTimeRangeValue template) {
        SearchTimeRangeValueImpl instance = new SearchTimeRangeValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setFieldType(template.getFieldType());
        instance.setGte(template.getGte());
        instance.setGt(template.getGt());
        instance.setLte(template.getLte());
        instance.setLt(template.getLt());
        return instance;
    }

    public SearchTimeRangeValue copyDeep();

    /**
     * factory method to create a deep copy of SearchTimeRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchTimeRangeValue deepCopy(@Nullable final SearchTimeRangeValue template) {
        if (template == null) {
            return null;
        }
        SearchTimeRangeValueImpl instance = new SearchTimeRangeValueImpl();
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
     * builder factory method for SearchTimeRangeValue
     * @return builder
     */
    public static SearchTimeRangeValueBuilder builder() {
        return SearchTimeRangeValueBuilder.of();
    }

    /**
     * create builder for SearchTimeRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchTimeRangeValueBuilder builder(final SearchTimeRangeValue template) {
        return SearchTimeRangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchTimeRangeValue(Function<SearchTimeRangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchTimeRangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchTimeRangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<SearchTimeRangeValue>";
            }
        };
    }
}
