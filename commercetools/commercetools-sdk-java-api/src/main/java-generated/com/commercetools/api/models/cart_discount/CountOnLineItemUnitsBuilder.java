
package com.commercetools.api.models.cart_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CountOnLineItemUnitsBuilder
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
public class CountOnLineItemUnitsBuilder implements Builder<CountOnLineItemUnits> {

    private String predicate;

    @Nullable
    private Integer minCount;

    @Nullable
    private Integer maxCount;

    @Deprecated
    @Nullable
    private Integer excludeCount;

    /**
     *  <p>Valid LineItem predicate that determines the units participating in the Discount.</p>
     * @param predicate value to be set
     * @return Builder
     */

    public CountOnLineItemUnitsBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>Minimum number of units of a Line Item that match the predicate.</p>
     * @param minCount value to be set
     * @return Builder
     */

    public CountOnLineItemUnitsBuilder minCount(@Nullable final Integer minCount) {
        this.minCount = minCount;
        return this;
    }

    /**
     *  <p>Maximum number of units of a Line Item that match the predicate. There might be more units matching the predicate, but they will not be participating to the resulting set.</p>
     *  <p>The value must be greater than or equal to <code>minCount</code>. If not provided, the component will match all units that satisfy the predicate.</p>
     * @param maxCount value to be set
     * @return Builder
     */

    public CountOnLineItemUnitsBuilder maxCount(@Nullable final Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     *  <p>Number of units of a Line Item to exclude on every application of the Discount.</p>
     *  <p>Set only when configuring the <code>targetPattern</code>.</p>
     *  <p>The units matched first (satisfying the pattern component) will be excluded from the resulting set. The <code>minCount</code>and <code>maxCount</code> are considered only after the exclusion. Pattern components are matched only if any further units satisfying the pattern component exist. For example, if 5 jeans are required but only 3 should be discounted, the <code>excludeCount</code> value must be 2.</p>
     * @param excludeCount value to be set
     * @return Builder
     */
    @Deprecated
    public CountOnLineItemUnitsBuilder excludeCount(@Nullable final Integer excludeCount) {
        this.excludeCount = excludeCount;
        return this;
    }

    /**
     *  <p>Valid LineItem predicate that determines the units participating in the Discount.</p>
     * @return predicate
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     *  <p>Minimum number of units of a Line Item that match the predicate.</p>
     * @return minCount
     */

    @Nullable
    public Integer getMinCount() {
        return this.minCount;
    }

    /**
     *  <p>Maximum number of units of a Line Item that match the predicate. There might be more units matching the predicate, but they will not be participating to the resulting set.</p>
     *  <p>The value must be greater than or equal to <code>minCount</code>. If not provided, the component will match all units that satisfy the predicate.</p>
     * @return maxCount
     */

    @Nullable
    public Integer getMaxCount() {
        return this.maxCount;
    }

    /**
     *  <p>Number of units of a Line Item to exclude on every application of the Discount.</p>
     *  <p>Set only when configuring the <code>targetPattern</code>.</p>
     *  <p>The units matched first (satisfying the pattern component) will be excluded from the resulting set. The <code>minCount</code>and <code>maxCount</code> are considered only after the exclusion. Pattern components are matched only if any further units satisfying the pattern component exist. For example, if 5 jeans are required but only 3 should be discounted, the <code>excludeCount</code> value must be 2.</p>
     * @return excludeCount
     */
    @Deprecated
    @Nullable
    public Integer getExcludeCount() {
        return this.excludeCount;
    }

    /**
     * builds CountOnLineItemUnits with checking for non-null required values
     * @return CountOnLineItemUnits
     */
    public CountOnLineItemUnits build() {
        Objects.requireNonNull(predicate, CountOnLineItemUnits.class + ": predicate is missing");
        return new CountOnLineItemUnitsImpl(predicate, minCount, maxCount, excludeCount);
    }

    /**
     * builds CountOnLineItemUnits without checking for non-null required values
     * @return CountOnLineItemUnits
     */
    public CountOnLineItemUnits buildUnchecked() {
        return new CountOnLineItemUnitsImpl(predicate, minCount, maxCount, excludeCount);
    }

    /**
     * factory method for an instance of CountOnLineItemUnitsBuilder
     * @return builder
     */
    public static CountOnLineItemUnitsBuilder of() {
        return new CountOnLineItemUnitsBuilder();
    }

    /**
     * create builder for CountOnLineItemUnits instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CountOnLineItemUnitsBuilder of(final CountOnLineItemUnits template) {
        CountOnLineItemUnitsBuilder builder = new CountOnLineItemUnitsBuilder();
        builder.predicate = template.getPredicate();
        builder.minCount = template.getMinCount();
        builder.maxCount = template.getMaxCount();
        builder.excludeCount = template.getExcludeCount();
        return builder;
    }

}
