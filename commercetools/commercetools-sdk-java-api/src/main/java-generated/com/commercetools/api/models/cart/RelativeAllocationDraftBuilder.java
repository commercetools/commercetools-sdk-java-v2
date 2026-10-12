
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RelativeAllocationDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RelativeAllocationDraft relativeAllocationDraft = RelativeAllocationDraft.builder()
 *             .percentage(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RelativeAllocationDraftBuilder implements Builder<RelativeAllocationDraft> {

    private Integer percentage;

    /**
     *  <p>Percentage of the Order total allocated to the Payment Method. For example, <code>100</code> allocates the entire Order total.</p>
     * @param percentage value to be set
     * @return Builder
     */

    public RelativeAllocationDraftBuilder percentage(final Integer percentage) {
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
     * builds RelativeAllocationDraft with checking for non-null required values
     * @return RelativeAllocationDraft
     */
    public RelativeAllocationDraft build() {
        Objects.requireNonNull(percentage, RelativeAllocationDraft.class + ": percentage is missing");
        return new RelativeAllocationDraftImpl(percentage);
    }

    /**
     * builds RelativeAllocationDraft without checking for non-null required values
     * @return RelativeAllocationDraft
     */
    public RelativeAllocationDraft buildUnchecked() {
        return new RelativeAllocationDraftImpl(percentage);
    }

    /**
     * factory method for an instance of RelativeAllocationDraftBuilder
     * @return builder
     */
    public static RelativeAllocationDraftBuilder of() {
        return new RelativeAllocationDraftBuilder();
    }

    /**
     * create builder for RelativeAllocationDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RelativeAllocationDraftBuilder of(final RelativeAllocationDraft template) {
        RelativeAllocationDraftBuilder builder = new RelativeAllocationDraftBuilder();
        builder.percentage = template.getPercentage();
        return builder;
    }

}
