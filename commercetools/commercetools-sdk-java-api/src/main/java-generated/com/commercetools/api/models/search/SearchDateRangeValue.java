
package com.commercetools.api.models.search;

import java.time.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchDateRangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchDateRangeValue searchDateRangeValue = SearchDateRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchDateRangeValueImpl.class)
public interface SearchDateRangeValue extends SearchQueryExpressionValue {

    /**
     *
     * @return gte
     */

    @JsonProperty("gte")
    public LocalDate getGte();

    /**
     *
     * @return gt
     */

    @JsonProperty("gt")
    public LocalDate getGt();

    /**
     *
     * @return lte
     */

    @JsonProperty("lte")
    public LocalDate getLte();

    /**
     *
     * @return lt
     */

    @JsonProperty("lt")
    public LocalDate getLt();

    /**
     * set gte
     * @param gte value to be set
     */

    public void setGte(final LocalDate gte);

    /**
     * set gt
     * @param gt value to be set
     */

    public void setGt(final LocalDate gt);

    /**
     * set lte
     * @param lte value to be set
     */

    public void setLte(final LocalDate lte);

    /**
     * set lt
     * @param lt value to be set
     */

    public void setLt(final LocalDate lt);

    /**
     * factory method
     * @return instance of SearchDateRangeValue
     */
    public static SearchDateRangeValue of() {
        return new SearchDateRangeValueImpl();
    }

    /**
     * factory method to create a shallow copy SearchDateRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchDateRangeValue of(final SearchDateRangeValue template) {
        SearchDateRangeValueImpl instance = new SearchDateRangeValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setFieldType(template.getFieldType());
        instance.setGte(template.getGte());
        instance.setGt(template.getGt());
        instance.setLte(template.getLte());
        instance.setLt(template.getLt());
        return instance;
    }

    public SearchDateRangeValue copyDeep();

    /**
     * factory method to create a deep copy of SearchDateRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchDateRangeValue deepCopy(@Nullable final SearchDateRangeValue template) {
        if (template == null) {
            return null;
        }
        SearchDateRangeValueImpl instance = new SearchDateRangeValueImpl();
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
     * builder factory method for SearchDateRangeValue
     * @return builder
     */
    public static SearchDateRangeValueBuilder builder() {
        return SearchDateRangeValueBuilder.of();
    }

    /**
     * create builder for SearchDateRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchDateRangeValueBuilder builder(final SearchDateRangeValue template) {
        return SearchDateRangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchDateRangeValue(Function<SearchDateRangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchDateRangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchDateRangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<SearchDateRangeValue>";
            }
        };
    }
}
