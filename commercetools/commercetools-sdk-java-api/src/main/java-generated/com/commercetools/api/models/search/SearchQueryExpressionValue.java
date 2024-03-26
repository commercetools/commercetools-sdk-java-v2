
package com.commercetools.api.models.search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchQueryExpressionValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchQueryExpressionValue searchQueryExpressionValue = SearchQueryExpressionValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchQueryExpressionValueImpl.class)
public interface SearchQueryExpressionValue {

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
    public Double getBoost();

    /**
     *  <p>Possible values for the <code>fieldType</code> property on query expressions indicating the data type of the <code>field</code>.</p>
     * @return fieldType
     */

    @JsonProperty("fieldType")
    public SearchFieldType getFieldType();

    /**
     * set field
     * @param field value to be set
     */

    public void setField(final String field);

    /**
     * set boost
     * @param boost value to be set
     */

    public void setBoost(final Double boost);

    /**
     *  <p>Possible values for the <code>fieldType</code> property on query expressions indicating the data type of the <code>field</code>.</p>
     * @param fieldType value to be set
     */

    public void setFieldType(final SearchFieldType fieldType);

    /**
     * factory method
     * @return instance of SearchQueryExpressionValue
     */
    public static SearchQueryExpressionValue of() {
        return new SearchQueryExpressionValueImpl();
    }

    /**
     * factory method to create a shallow copy SearchQueryExpressionValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchQueryExpressionValue of(final SearchQueryExpressionValue template) {
        SearchQueryExpressionValueImpl instance = new SearchQueryExpressionValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setFieldType(template.getFieldType());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchQueryExpressionValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchQueryExpressionValue deepCopy(@Nullable final SearchQueryExpressionValue template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.search.SearchAnyValue) {
            return com.commercetools.api.models.search.SearchAnyValue
                    .deepCopy((com.commercetools.api.models.search.SearchAnyValue) template);
        }
        if (template instanceof com.commercetools.api.models.search.SearchDateRangeValue) {
            return com.commercetools.api.models.search.SearchDateRangeValue
                    .deepCopy((com.commercetools.api.models.search.SearchDateRangeValue) template);
        }
        if (template instanceof com.commercetools.api.models.search.SearchDateTimeRangeValue) {
            return com.commercetools.api.models.search.SearchDateTimeRangeValue
                    .deepCopy((com.commercetools.api.models.search.SearchDateTimeRangeValue) template);
        }
        if (template instanceof com.commercetools.api.models.search.SearchExistsValue) {
            return com.commercetools.api.models.search.SearchExistsValue
                    .deepCopy((com.commercetools.api.models.search.SearchExistsValue) template);
        }
        if (template instanceof com.commercetools.api.models.search.SearchFullTextPrefixValue) {
            return com.commercetools.api.models.search.SearchFullTextPrefixValue
                    .deepCopy((com.commercetools.api.models.search.SearchFullTextPrefixValue) template);
        }
        if (template instanceof com.commercetools.api.models.search.SearchFullTextValue) {
            return com.commercetools.api.models.search.SearchFullTextValue
                    .deepCopy((com.commercetools.api.models.search.SearchFullTextValue) template);
        }
        if (template instanceof com.commercetools.api.models.search.SearchLongRangeValue) {
            return com.commercetools.api.models.search.SearchLongRangeValue
                    .deepCopy((com.commercetools.api.models.search.SearchLongRangeValue) template);
        }
        if (template instanceof com.commercetools.api.models.search.SearchNumberRangeValue) {
            return com.commercetools.api.models.search.SearchNumberRangeValue
                    .deepCopy((com.commercetools.api.models.search.SearchNumberRangeValue) template);
        }
        if (template instanceof com.commercetools.api.models.search.SearchTimeRangeValue) {
            return com.commercetools.api.models.search.SearchTimeRangeValue
                    .deepCopy((com.commercetools.api.models.search.SearchTimeRangeValue) template);
        }
        SearchQueryExpressionValueImpl instance = new SearchQueryExpressionValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setFieldType(template.getFieldType());
        return instance;
    }

    /**
     * builder factory method for SearchQueryExpressionValue
     * @return builder
     */
    public static SearchQueryExpressionValueBuilder builder() {
        return SearchQueryExpressionValueBuilder.of();
    }

    /**
     * create builder for SearchQueryExpressionValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchQueryExpressionValueBuilder builder(final SearchQueryExpressionValue template) {
        return SearchQueryExpressionValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchQueryExpressionValue(Function<SearchQueryExpressionValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchQueryExpressionValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchQueryExpressionValue>() {
            @Override
            public String toString() {
                return "TypeReference<SearchQueryExpressionValue>";
            }
        };
    }
}
