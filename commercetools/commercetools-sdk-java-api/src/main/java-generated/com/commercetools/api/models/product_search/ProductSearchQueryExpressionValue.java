
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchQueryExpressionValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchQueryExpressionValue productSearchQueryExpressionValue = ProductSearchQueryExpressionValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchQueryExpressionValueImpl.class)
public interface ProductSearchQueryExpressionValue {

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
     *
     * @return attributeType
     */

    @JsonProperty("attributeType")
    public ProductSearchAttributeType getAttributeType();

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
     * set attributeType
     * @param attributeType value to be set
     */

    public void setAttributeType(final ProductSearchAttributeType attributeType);

    /**
     * factory method
     * @return instance of ProductSearchQueryExpressionValue
     */
    public static ProductSearchQueryExpressionValue of() {
        return new ProductSearchQueryExpressionValueImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchQueryExpressionValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchQueryExpressionValue of(final ProductSearchQueryExpressionValue template) {
        ProductSearchQueryExpressionValueImpl instance = new ProductSearchQueryExpressionValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setAttributeType(template.getAttributeType());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchQueryExpressionValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchQueryExpressionValue deepCopy(
            @Nullable final ProductSearchQueryExpressionValue template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchAnyValue) {
            return com.commercetools.api.models.product_search.ProductSearchAnyValue
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchAnyValue) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchDateRangeValue) {
            return com.commercetools.api.models.product_search.ProductSearchDateRangeValue
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchDateRangeValue) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchDateTimeRangeValue) {
            return com.commercetools.api.models.product_search.ProductSearchDateTimeRangeValue
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchDateTimeRangeValue) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchExistsValue) {
            return com.commercetools.api.models.product_search.ProductSearchExistsValue
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchExistsValue) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchFullTextValue) {
            return com.commercetools.api.models.product_search.ProductSearchFullTextValue
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchFullTextValue) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchLongRangeValue) {
            return com.commercetools.api.models.product_search.ProductSearchLongRangeValue
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchLongRangeValue) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchNumberRangeValue) {
            return com.commercetools.api.models.product_search.ProductSearchNumberRangeValue
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchNumberRangeValue) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchTimeRangeValue) {
            return com.commercetools.api.models.product_search.ProductSearchTimeRangeValue
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchTimeRangeValue) template);
        }
        ProductSearchQueryExpressionValueImpl instance = new ProductSearchQueryExpressionValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setAttributeType(template.getAttributeType());
        return instance;
    }

    /**
     * builder factory method for ProductSearchQueryExpressionValue
     * @return builder
     */
    public static ProductSearchQueryExpressionValueBuilder builder() {
        return ProductSearchQueryExpressionValueBuilder.of();
    }

    /**
     * create builder for ProductSearchQueryExpressionValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchQueryExpressionValueBuilder builder(final ProductSearchQueryExpressionValue template) {
        return ProductSearchQueryExpressionValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchQueryExpressionValue(Function<ProductSearchQueryExpressionValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchQueryExpressionValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchQueryExpressionValue>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchQueryExpressionValue>";
            }
        };
    }
}
