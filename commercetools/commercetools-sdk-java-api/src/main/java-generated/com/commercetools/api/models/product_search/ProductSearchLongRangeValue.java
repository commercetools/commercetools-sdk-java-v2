
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchLongRangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchLongRangeValue productSearchLongRangeValue = ProductSearchLongRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchLongRangeValueImpl.class)
public interface ProductSearchLongRangeValue extends ProductSearchQueryExpressionValue {

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
     * @return instance of ProductSearchLongRangeValue
     */
    public static ProductSearchLongRangeValue of() {
        return new ProductSearchLongRangeValueImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchLongRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchLongRangeValue of(final ProductSearchLongRangeValue template) {
        ProductSearchLongRangeValueImpl instance = new ProductSearchLongRangeValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setAttributeType(template.getAttributeType());
        instance.setGte(template.getGte());
        instance.setGt(template.getGt());
        instance.setLte(template.getLte());
        instance.setLt(template.getLt());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchLongRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchLongRangeValue deepCopy(@Nullable final ProductSearchLongRangeValue template) {
        if (template == null) {
            return null;
        }
        ProductSearchLongRangeValueImpl instance = new ProductSearchLongRangeValueImpl();
        instance.setField(template.getField());
        instance.setBoost(template.getBoost());
        instance.setAttributeType(template.getAttributeType());
        instance.setGte(template.getGte());
        instance.setGt(template.getGt());
        instance.setLte(template.getLte());
        instance.setLt(template.getLt());
        return instance;
    }

    /**
     * builder factory method for ProductSearchLongRangeValue
     * @return builder
     */
    public static ProductSearchLongRangeValueBuilder builder() {
        return ProductSearchLongRangeValueBuilder.of();
    }

    /**
     * create builder for ProductSearchLongRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchLongRangeValueBuilder builder(final ProductSearchLongRangeValue template) {
        return ProductSearchLongRangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchLongRangeValue(Function<ProductSearchLongRangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchLongRangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchLongRangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchLongRangeValue>";
            }
        };
    }
}
