
package com.commercetools.api.models.product_search;

import java.time.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchDateRangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchDateRangeValue productSearchDateRangeValue = ProductSearchDateRangeValue.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchDateRangeValueImpl.class)
public interface ProductSearchDateRangeValue extends ProductSearchQueryExpressionValue {

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
     * @return instance of ProductSearchDateRangeValue
     */
    public static ProductSearchDateRangeValue of() {
        return new ProductSearchDateRangeValueImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchDateRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchDateRangeValue of(final ProductSearchDateRangeValue template) {
        ProductSearchDateRangeValueImpl instance = new ProductSearchDateRangeValueImpl();
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
     * factory method to create a deep copy of ProductSearchDateRangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchDateRangeValue deepCopy(@Nullable final ProductSearchDateRangeValue template) {
        if (template == null) {
            return null;
        }
        ProductSearchDateRangeValueImpl instance = new ProductSearchDateRangeValueImpl();
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
     * builder factory method for ProductSearchDateRangeValue
     * @return builder
     */
    public static ProductSearchDateRangeValueBuilder builder() {
        return ProductSearchDateRangeValueBuilder.of();
    }

    /**
     * create builder for ProductSearchDateRangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchDateRangeValueBuilder builder(final ProductSearchDateRangeValue template) {
        return ProductSearchDateRangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchDateRangeValue(Function<ProductSearchDateRangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchDateRangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchDateRangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchDateRangeValue>";
            }
        };
    }
}
