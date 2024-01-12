
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchNumberRangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchNumberRangeValue productSearchNumberRangeValue = ProductSearchNumberRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchNumberRangeValueImpl.class)
public interface ProductSearchNumberRangeValue extends ProductSearchQueryExpressionValue {

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
     * @return instance of ProductSearchNumberRangeValue
     */
    public static ProductSearchNumberRangeValue of() {
        return new ProductSearchNumberRangeValueImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchNumberRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchNumberRangeValue of(final ProductSearchNumberRangeValue template) {
        ProductSearchNumberRangeValueImpl instance = new ProductSearchNumberRangeValueImpl();
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
     * factory method to create a deep copy of ProductSearchNumberRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchNumberRangeValue deepCopy(@Nullable final ProductSearchNumberRangeValue template) {
        if (template == null) {
            return null;
        }
        ProductSearchNumberRangeValueImpl instance = new ProductSearchNumberRangeValueImpl();
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
     * builder factory method for ProductSearchNumberRangeValue
     * @return builder
     */
    public static ProductSearchNumberRangeValueBuilder builder() {
        return ProductSearchNumberRangeValueBuilder.of();
    }

    /**
     * create builder for ProductSearchNumberRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchNumberRangeValueBuilder builder(final ProductSearchNumberRangeValue template) {
        return ProductSearchNumberRangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchNumberRangeValue(Function<ProductSearchNumberRangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchNumberRangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchNumberRangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchNumberRangeValue>";
            }
        };
    }
}
