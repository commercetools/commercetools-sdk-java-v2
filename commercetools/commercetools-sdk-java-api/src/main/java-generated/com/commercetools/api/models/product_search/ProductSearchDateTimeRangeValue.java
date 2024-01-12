
package com.commercetools.api.models.product_search;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchDateTimeRangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchDateTimeRangeValue productSearchDateTimeRangeValue = ProductSearchDateTimeRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchDateTimeRangeValueImpl.class)
public interface ProductSearchDateTimeRangeValue extends ProductSearchQueryExpressionValue {

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
     * @return instance of ProductSearchDateTimeRangeValue
     */
    public static ProductSearchDateTimeRangeValue of() {
        return new ProductSearchDateTimeRangeValueImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchDateTimeRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchDateTimeRangeValue of(final ProductSearchDateTimeRangeValue template) {
        ProductSearchDateTimeRangeValueImpl instance = new ProductSearchDateTimeRangeValueImpl();
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
     * factory method to create a deep copy of ProductSearchDateTimeRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchDateTimeRangeValue deepCopy(@Nullable final ProductSearchDateTimeRangeValue template) {
        if (template == null) {
            return null;
        }
        ProductSearchDateTimeRangeValueImpl instance = new ProductSearchDateTimeRangeValueImpl();
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
     * builder factory method for ProductSearchDateTimeRangeValue
     * @return builder
     */
    public static ProductSearchDateTimeRangeValueBuilder builder() {
        return ProductSearchDateTimeRangeValueBuilder.of();
    }

    /**
     * create builder for ProductSearchDateTimeRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchDateTimeRangeValueBuilder builder(final ProductSearchDateTimeRangeValue template) {
        return ProductSearchDateTimeRangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchDateTimeRangeValue(Function<ProductSearchDateTimeRangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchDateTimeRangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchDateTimeRangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchDateTimeRangeValue>";
            }
        };
    }
}
