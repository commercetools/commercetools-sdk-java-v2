
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * CountOnCustomLineItemUnits
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CountOnCustomLineItemUnits countOnCustomLineItemUnits = CountOnCustomLineItemUnits.builder()
 *             .predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CountOnCustomLineItemUnits")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CountOnCustomLineItemUnitsImpl.class)
public interface CountOnCustomLineItemUnits extends PatternComponent {

    /**
     * discriminator value for CountOnCustomLineItemUnits
     */
    String COUNT_ON_CUSTOM_LINE_ITEM_UNITS = "CountOnCustomLineItemUnits";

    /**
     *  <p>Valid CustomLineItem predicate that determines the units participating in the Discount.</p>
     * @return predicate
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Minimum number of units of a Custom Line Item that match the predicate.</p>
     * @return minCount
     */

    @JsonProperty("minCount")
    public Integer getMinCount();

    /**
     *  <p>Maximum number of units of a Custom Line Item that match the predicate. There might be more units matching the predicate, but they will not be participating to the resulting set.</p>
     *  <p>The value must be greater than or equal to <code>minCount</code>. If not provided, the component will match all units that satisfy the predicate.</p>
     * @return maxCount
     */

    @JsonProperty("maxCount")
    public Integer getMaxCount();

    /**
     *  <p>Number of units of a Custom Line Item to exclude on every application of the Discount.</p>
     *  <p>Set only when configuring the <code>targetPattern</code>.</p>
     *  <p>The units matched first (satisfying the pattern component) will be excluded from the resulting set. The <code>minCount</code>and <code>maxCount</code> are considered only after the exclusion. Pattern components are matched only if any further units satisfying the pattern component exist. For example, if 5 jeans are required but only 3 should be discounted, the <code>excludeCount</code> value must be 2.</p>
     * @return excludeCount
     */
    @Deprecated
    @JsonProperty("excludeCount")
    public Integer getExcludeCount();

    /**
     *  <p>Valid CustomLineItem predicate that determines the units participating in the Discount.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     *  <p>Minimum number of units of a Custom Line Item that match the predicate.</p>
     * @param minCount value to be set
     */

    public void setMinCount(final Integer minCount);

    /**
     *  <p>Maximum number of units of a Custom Line Item that match the predicate. There might be more units matching the predicate, but they will not be participating to the resulting set.</p>
     *  <p>The value must be greater than or equal to <code>minCount</code>. If not provided, the component will match all units that satisfy the predicate.</p>
     * @param maxCount value to be set
     */

    public void setMaxCount(final Integer maxCount);

    /**
     *  <p>Number of units of a Custom Line Item to exclude on every application of the Discount.</p>
     *  <p>Set only when configuring the <code>targetPattern</code>.</p>
     *  <p>The units matched first (satisfying the pattern component) will be excluded from the resulting set. The <code>minCount</code>and <code>maxCount</code> are considered only after the exclusion. Pattern components are matched only if any further units satisfying the pattern component exist. For example, if 5 jeans are required but only 3 should be discounted, the <code>excludeCount</code> value must be 2.</p>
     * @param excludeCount value to be set
     */
    @Deprecated
    public void setExcludeCount(final Integer excludeCount);

    /**
     * factory method
     * @return instance of CountOnCustomLineItemUnits
     */
    public static CountOnCustomLineItemUnits of() {
        return new CountOnCustomLineItemUnitsImpl();
    }

    /**
     * factory method to create a shallow copy CountOnCustomLineItemUnits
     * @param template instance to be copied
     * @return copy instance
     */
    public static CountOnCustomLineItemUnits of(final CountOnCustomLineItemUnits template) {
        CountOnCustomLineItemUnitsImpl instance = new CountOnCustomLineItemUnitsImpl();
        instance.setPredicate(template.getPredicate());
        instance.setMinCount(template.getMinCount());
        instance.setMaxCount(template.getMaxCount());
        instance.setExcludeCount(template.getExcludeCount());
        return instance;
    }

    public CountOnCustomLineItemUnits copyDeep();

    /**
     * factory method to create a deep copy of CountOnCustomLineItemUnits
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CountOnCustomLineItemUnits deepCopy(@Nullable final CountOnCustomLineItemUnits template) {
        if (template == null) {
            return null;
        }
        CountOnCustomLineItemUnitsImpl instance = new CountOnCustomLineItemUnitsImpl();
        instance.setPredicate(template.getPredicate());
        instance.setMinCount(template.getMinCount());
        instance.setMaxCount(template.getMaxCount());
        instance.setExcludeCount(template.getExcludeCount());
        return instance;
    }

    /**
     * builder factory method for CountOnCustomLineItemUnits
     * @return builder
     */
    public static CountOnCustomLineItemUnitsBuilder builder() {
        return CountOnCustomLineItemUnitsBuilder.of();
    }

    /**
     * create builder for CountOnCustomLineItemUnits instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CountOnCustomLineItemUnitsBuilder builder(final CountOnCustomLineItemUnits template) {
        return CountOnCustomLineItemUnitsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCountOnCustomLineItemUnits(Function<CountOnCustomLineItemUnits, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CountOnCustomLineItemUnits> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CountOnCustomLineItemUnits>() {
            @Override
            public String toString() {
                return "TypeReference<CountOnCustomLineItemUnits>";
            }
        };
    }
}
