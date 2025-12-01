
package com.commercetools.checkout.models.payment_integration;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SortingInfoBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SortingInfo sortingInfo = SortingInfo.builder()
 *             .priority(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SortingInfoBuilder implements Builder<SortingInfo> {

    private Integer priority;

    /**
     *  <p>Sorting priority of the Payment Integration.</p>
     * @param priority value to be set
     * @return Builder
     */

    public SortingInfoBuilder priority(final Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     *  <p>Sorting priority of the Payment Integration.</p>
     * @return priority
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * builds SortingInfo with checking for non-null required values
     * @return SortingInfo
     */
    public SortingInfo build() {
        Objects.requireNonNull(priority, SortingInfo.class + ": priority is missing");
        return new SortingInfoImpl(priority);
    }

    /**
     * builds SortingInfo without checking for non-null required values
     * @return SortingInfo
     */
    public SortingInfo buildUnchecked() {
        return new SortingInfoImpl(priority);
    }

    /**
     * factory method for an instance of SortingInfoBuilder
     * @return builder
     */
    public static SortingInfoBuilder of() {
        return new SortingInfoBuilder();
    }

    /**
     * create builder for SortingInfo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SortingInfoBuilder of(final SortingInfo template) {
        SortingInfoBuilder builder = new SortingInfoBuilder();
        builder.priority = template.getPriority();
        return builder;
    }

}
