
package com.commercetools.api.models.cart_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CountOnCustomLineItemUnitsBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CountOnCustomLineItemUnitsBuilder implements Builder<CountOnCustomLineItemUnits> {

    private String predicate;

    @Nullable
    private Integer minCount;

    @Nullable
    private Integer maxCount;

    @Nullable
    private Integer excludeCount;

    /**
     *  <p>Valid CustomLineItem predicate that determines the units participating in the Discount.</p>
     * @param predicate value to be set
     * @return Builder
     */

    public CountOnCustomLineItemUnitsBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>Minimum number of units of a Custom Line Item that match the predicate.</p>
     * @param minCount value to be set
     * @return Builder
     */

    public CountOnCustomLineItemUnitsBuilder minCount(@Nullable final Integer minCount) {
        this.minCount = minCount;
        return this;
    }

    /**
     *  <p>Maximum number of units of a Custom Line Item that match the predicate. There might be more units matching the predicate, but they will not be participating to the resulting set.</p>
     *  <p>The value must be greater than or equal to <code>minCount</code>. If not provided, the component will match all units that satisfy the predicate.</p>
     * @param maxCount value to be set
     * @return Builder
     */

    public CountOnCustomLineItemUnitsBuilder maxCount(@Nullable final Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     *  <p>Number of units of a Custom Line Item to exclude on every application of the Discount.</p>
     *  <p>Set only when configuring the <code>targetPattern</code>.</p>
     *  <p>The units matched first (satisfying the pattern component) will be excluded from the resulting set. The <code>minCount</code>and <code>maxCount</code> are considered only after the exclusion. Pattern components are matched only if any further units satisfying the pattern component exist. For example, if 5 jeans are required but only 3 should be discounted, the <code>excludeCount</code> value must be 2.</p>
     * @param excludeCount value to be set
     * @return Builder
     */

    public CountOnCustomLineItemUnitsBuilder excludeCount(@Nullable final Integer excludeCount) {
        this.excludeCount = excludeCount;
        return this;
    }

    /**
     *  <p>Valid CustomLineItem predicate that determines the units participating in the Discount.</p>
     * @return predicate
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     *  <p>Minimum number of units of a Custom Line Item that match the predicate.</p>
     * @return minCount
     */

    @Nullable
    public Integer getMinCount() {
        return this.minCount;
    }

    /**
     *  <p>Maximum number of units of a Custom Line Item that match the predicate. There might be more units matching the predicate, but they will not be participating to the resulting set.</p>
     *  <p>The value must be greater than or equal to <code>minCount</code>. If not provided, the component will match all units that satisfy the predicate.</p>
     * @return maxCount
     */

    @Nullable
    public Integer getMaxCount() {
        return this.maxCount;
    }

    /**
     *  <p>Number of units of a Custom Line Item to exclude on every application of the Discount.</p>
     *  <p>Set only when configuring the <code>targetPattern</code>.</p>
     *  <p>The units matched first (satisfying the pattern component) will be excluded from the resulting set. The <code>minCount</code>and <code>maxCount</code> are considered only after the exclusion. Pattern components are matched only if any further units satisfying the pattern component exist. For example, if 5 jeans are required but only 3 should be discounted, the <code>excludeCount</code> value must be 2.</p>
     * @return excludeCount
     */

    @Nullable
    public Integer getExcludeCount() {
        return this.excludeCount;
    }

    /**
     * builds CountOnCustomLineItemUnits with checking for non-null required values
     * @return CountOnCustomLineItemUnits
     */
    public CountOnCustomLineItemUnits build() {
        Objects.requireNonNull(predicate, CountOnCustomLineItemUnits.class + ": predicate is missing");
        return new CountOnCustomLineItemUnitsImpl(predicate, minCount, maxCount, excludeCount);
    }

    /**
     * builds CountOnCustomLineItemUnits without checking for non-null required values
     * @return CountOnCustomLineItemUnits
     */
    public CountOnCustomLineItemUnits buildUnchecked() {
        return new CountOnCustomLineItemUnitsImpl(predicate, minCount, maxCount, excludeCount);
    }

    /**
     * factory method for an instance of CountOnCustomLineItemUnitsBuilder
     * @return builder
     */
    public static CountOnCustomLineItemUnitsBuilder of() {
        return new CountOnCustomLineItemUnitsBuilder();
    }

    /**
     * create builder for CountOnCustomLineItemUnits instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CountOnCustomLineItemUnitsBuilder of(final CountOnCustomLineItemUnits template) {
        CountOnCustomLineItemUnitsBuilder builder = new CountOnCustomLineItemUnitsBuilder();
        builder.predicate = template.getPredicate();
        builder.minCount = template.getMinCount();
        builder.maxCount = template.getMaxCount();
        builder.excludeCount = template.getExcludeCount();
        return builder;
    }

}
