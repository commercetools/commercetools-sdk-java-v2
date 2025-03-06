
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
 * CountOnLineItemUnits
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CountOnLineItemUnits countOnLineItemUnits = CountOnLineItemUnits.builder()
 *             .predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CountOnLineItemUnitsImpl.class)
public interface CountOnLineItemUnits extends PatternComponent {

    /**
     * discriminator value for CountOnLineItemUnits
     */
    String COUNT_ON_LINE_ITEM_UNITS = "CountOnLineItemUnits";

    /**
     *  <p>Valid LineItem predicate that determines the units participating in the Discount.</p>
     * @return predicate
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Minimum number of units of a Line Item that match the predicate.</p>
     * @return minCount
     */

    @JsonProperty("minCount")
    public Integer getMinCount();

    /**
     *  <p>Maximum number of units of a Line Item that match the predicate. There might be more units matching the predicate, but they will not be participating to the resulting set.</p>
     *  <p>The value must be greater than or equal to <code>minCount</code>. If not provided, the component will match all units that satisfy the predicate.</p>
     * @return maxCount
     */

    @JsonProperty("maxCount")
    public Integer getMaxCount();

    /**
     *  <p>Number of units of a Line Item to exclude on every application of the Discount.</p>
     *  <p>Set only when configuring the <code>targetPattern</code>.</p>
     *  <p>The units matched first (satisfying the pattern component) will be excluded from the resulting set. The <code>minCount</code>and <code>maxCount</code> are considered only after the exclusion. Pattern components are matched only if any further units satisfying the pattern component exist. For example, if 5 jeans are required but only 3 should be discounted, the <code>excludeCount</code> value must be 2.</p>
     * @return excludeCount
     */
    @Deprecated
    @JsonProperty("excludeCount")
    public Integer getExcludeCount();

    /**
     *  <p>Valid LineItem predicate that determines the units participating in the Discount.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     *  <p>Minimum number of units of a Line Item that match the predicate.</p>
     * @param minCount value to be set
     */

    public void setMinCount(final Integer minCount);

    /**
     *  <p>Maximum number of units of a Line Item that match the predicate. There might be more units matching the predicate, but they will not be participating to the resulting set.</p>
     *  <p>The value must be greater than or equal to <code>minCount</code>. If not provided, the component will match all units that satisfy the predicate.</p>
     * @param maxCount value to be set
     */

    public void setMaxCount(final Integer maxCount);

    /**
     *  <p>Number of units of a Line Item to exclude on every application of the Discount.</p>
     *  <p>Set only when configuring the <code>targetPattern</code>.</p>
     *  <p>The units matched first (satisfying the pattern component) will be excluded from the resulting set. The <code>minCount</code>and <code>maxCount</code> are considered only after the exclusion. Pattern components are matched only if any further units satisfying the pattern component exist. For example, if 5 jeans are required but only 3 should be discounted, the <code>excludeCount</code> value must be 2.</p>
     * @param excludeCount value to be set
     */
    @Deprecated
    public void setExcludeCount(final Integer excludeCount);

    /**
     * factory method
     * @return instance of CountOnLineItemUnits
     */
    public static CountOnLineItemUnits of() {
        return new CountOnLineItemUnitsImpl();
    }

    /**
     * factory method to create a shallow copy CountOnLineItemUnits
     * @param template instance to be copied
     * @return copy instance
     */
    public static CountOnLineItemUnits of(final CountOnLineItemUnits template) {
        CountOnLineItemUnitsImpl instance = new CountOnLineItemUnitsImpl();
        instance.setPredicate(template.getPredicate());
        instance.setMinCount(template.getMinCount());
        instance.setMaxCount(template.getMaxCount());
        instance.setExcludeCount(template.getExcludeCount());
        return instance;
    }

    /**
     * factory method to create a deep copy of CountOnLineItemUnits
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CountOnLineItemUnits deepCopy(@Nullable final CountOnLineItemUnits template) {
        if (template == null) {
            return null;
        }
        CountOnLineItemUnitsImpl instance = new CountOnLineItemUnitsImpl();
        instance.setPredicate(template.getPredicate());
        instance.setMinCount(template.getMinCount());
        instance.setMaxCount(template.getMaxCount());
        instance.setExcludeCount(template.getExcludeCount());
        return instance;
    }

    /**
     * builder factory method for CountOnLineItemUnits
     * @return builder
     */
    public static CountOnLineItemUnitsBuilder builder() {
        return CountOnLineItemUnitsBuilder.of();
    }

    /**
     * create builder for CountOnLineItemUnits instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CountOnLineItemUnitsBuilder builder(final CountOnLineItemUnits template) {
        return CountOnLineItemUnitsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCountOnLineItemUnits(Function<CountOnLineItemUnits, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CountOnLineItemUnits> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CountOnLineItemUnits>() {
            @Override
            public String toString() {
                return "TypeReference<CountOnLineItemUnits>";
            }
        };
    }
}
