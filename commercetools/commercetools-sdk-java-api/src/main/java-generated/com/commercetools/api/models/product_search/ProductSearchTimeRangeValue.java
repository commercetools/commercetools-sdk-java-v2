
package com.commercetools.api.models.product_search;

import java.time.*;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchTimeRangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchTimeRangeValue productSearchTimeRangeValue = ProductSearchTimeRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchTimeRangeValueImpl.class)
public interface ProductSearchTimeRangeValue extends ProductSearchQueryExpressionValue {

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
     * @return instance of ProductSearchTimeRangeValue
     */
    public static ProductSearchTimeRangeValue of() {
        return new ProductSearchTimeRangeValueImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchTimeRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchTimeRangeValue of(final ProductSearchTimeRangeValue template) {
        ProductSearchTimeRangeValueImpl instance = new ProductSearchTimeRangeValueImpl();
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
     * factory method to create a deep copy of ProductSearchTimeRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchTimeRangeValue deepCopy(@Nullable final ProductSearchTimeRangeValue template) {
        if (template == null) {
            return null;
        }
        ProductSearchTimeRangeValueImpl instance = new ProductSearchTimeRangeValueImpl();
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
     * builder factory method for ProductSearchTimeRangeValue
     * @return builder
     */
    public static ProductSearchTimeRangeValueBuilder builder() {
        return ProductSearchTimeRangeValueBuilder.of();
    }

    /**
     * create builder for ProductSearchTimeRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchTimeRangeValueBuilder builder(final ProductSearchTimeRangeValue template) {
        return ProductSearchTimeRangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchTimeRangeValue(Function<ProductSearchTimeRangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchTimeRangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchTimeRangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchTimeRangeValue>";
            }
        };
    }
}
