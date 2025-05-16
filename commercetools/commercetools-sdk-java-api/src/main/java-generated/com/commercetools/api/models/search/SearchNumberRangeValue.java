
package com.commercetools.api.models.search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchNumberRangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchNumberRangeValue searchNumberRangeValue = SearchNumberRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchNumberRangeValueImpl.class)
public interface SearchNumberRangeValue extends SearchQueryExpressionValue {

    /**
     *
     * @return gte
     */

    @JsonProperty("gte")
    public Double getGte();

    /**
     *
     * @return gt
     */

    @JsonProperty("gt")
    public Double getGt();

    /**
     *
     * @return lte
     */

    @JsonProperty("lte")
    public Double getLte();

    /**
     *
     * @return lt
     */

    @JsonProperty("lt")
    public Double getLt();

    /**
     * set gte
     * @param gte value to be set
     */

    public void setGte(final Double gte);

    /**
     * set gt
     * @param gt value to be set
     */

    public void setGt(final Double gt);

    /**
     * set lte
     * @param lte value to be set
     */

    public void setLte(final Double lte);

    /**
     * set lt
     * @param lt value to be set
     */

    public void setLt(final Double lt);

    /**
     * factory method
     * @return instance of SearchNumberRangeValue
     */
    public static SearchNumberRangeValue of() {
        return new SearchNumberRangeValueImpl();
    }

    /**
     * factory method to create a shallow copy SearchNumberRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchNumberRangeValue of(final SearchNumberRangeValue template) {
        SearchNumberRangeValueImpl instance = new SearchNumberRangeValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setFieldType(template.getFieldType());
        instance.setGte(template.getGte());
        instance.setGt(template.getGt());
        instance.setLte(template.getLte());
        instance.setLt(template.getLt());
        return instance;
    }

    public SearchNumberRangeValue copyDeep();

    /**
     * factory method to create a deep copy of SearchNumberRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchNumberRangeValue deepCopy(@Nullable final SearchNumberRangeValue template) {
        if (template == null) {
            return null;
        }
        SearchNumberRangeValueImpl instance = new SearchNumberRangeValueImpl();
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
     * builder factory method for SearchNumberRangeValue
     * @return builder
     */
    public static SearchNumberRangeValueBuilder builder() {
        return SearchNumberRangeValueBuilder.of();
    }

    /**
     * create builder for SearchNumberRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchNumberRangeValueBuilder builder(final SearchNumberRangeValue template) {
        return SearchNumberRangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchNumberRangeValue(Function<SearchNumberRangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchNumberRangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchNumberRangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<SearchNumberRangeValue>";
            }
        };
    }
}
