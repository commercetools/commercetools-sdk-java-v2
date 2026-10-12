
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RelativeAllocationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RelativeAllocation relativeAllocation = RelativeAllocation.builder()
 *             .percentage(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RelativeAllocationBuilder implements Builder<RelativeAllocation> {

    private Integer percentage;

    /**
     *  <p>Percentage of the Order total allocated to the Payment Method. For example, <code>100</code> allocates the entire Order total.</p>
     * @param percentage value to be set
     * @return Builder
     */

    public RelativeAllocationBuilder percentage(final Integer percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     *  <p>Percentage of the Order total allocated to the Payment Method. For example, <code>100</code> allocates the entire Order total.</p>
     * @return percentage
     */

    public Integer getPercentage() {
        return this.percentage;
    }

    /**
     * builds RelativeAllocation with checking for non-null required values
     * @return RelativeAllocation
     */
    public RelativeAllocation build() {
        Objects.requireNonNull(percentage, RelativeAllocation.class + ": percentage is missing");
        return new RelativeAllocationImpl(percentage);
    }

    /**
     * builds RelativeAllocation without checking for non-null required values
     * @return RelativeAllocation
     */
    public RelativeAllocation buildUnchecked() {
        return new RelativeAllocationImpl(percentage);
    }

    /**
     * factory method for an instance of RelativeAllocationBuilder
     * @return builder
     */
    public static RelativeAllocationBuilder of() {
        return new RelativeAllocationBuilder();
    }

    /**
     * create builder for RelativeAllocation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RelativeAllocationBuilder of(final RelativeAllocation template) {
        RelativeAllocationBuilder builder = new RelativeAllocationBuilder();
        builder.percentage = template.getPercentage();
        return builder;
    }

}
