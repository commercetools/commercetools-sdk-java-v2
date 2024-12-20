
package com.commercetools.api.models.business_unit_search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitIndexingProgressBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitIndexingProgress businessUnitIndexingProgress = BusinessUnitIndexingProgress.builder()
 *             .indexed(0.3)
 *             .failed(0.3)
 *             .estimatedTotal(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitIndexingProgressBuilder implements Builder<BusinessUnitIndexingProgress> {

    private Integer indexed;

    private Integer failed;

    private Integer estimatedTotal;

    /**
     *  <p>The number of Business Units successfully indexed.</p>
     * @param indexed value to be set
     * @return Builder
     */

    public BusinessUnitIndexingProgressBuilder indexed(final Integer indexed) {
        this.indexed = indexed;
        return this;
    }

    /**
     *  <p>The number of Business Units that failed to be indexed.</p>
     * @param failed value to be set
     * @return Builder
     */

    public BusinessUnitIndexingProgressBuilder failed(final Integer failed) {
        this.failed = failed;
        return this;
    }

    /**
     *  <p>The estimated total number of Business Units to be indexed.</p>
     * @param estimatedTotal value to be set
     * @return Builder
     */

    public BusinessUnitIndexingProgressBuilder estimatedTotal(final Integer estimatedTotal) {
        this.estimatedTotal = estimatedTotal;
        return this;
    }

    /**
     *  <p>The number of Business Units successfully indexed.</p>
     * @return indexed
     */

    public Integer getIndexed() {
        return this.indexed;
    }

    /**
     *  <p>The number of Business Units that failed to be indexed.</p>
     * @return failed
     */

    public Integer getFailed() {
        return this.failed;
    }

    /**
     *  <p>The estimated total number of Business Units to be indexed.</p>
     * @return estimatedTotal
     */

    public Integer getEstimatedTotal() {
        return this.estimatedTotal;
    }

    /**
     * builds BusinessUnitIndexingProgress with checking for non-null required values
     * @return BusinessUnitIndexingProgress
     */
    public BusinessUnitIndexingProgress build() {
        Objects.requireNonNull(indexed, BusinessUnitIndexingProgress.class + ": indexed is missing");
        Objects.requireNonNull(failed, BusinessUnitIndexingProgress.class + ": failed is missing");
        Objects.requireNonNull(estimatedTotal, BusinessUnitIndexingProgress.class + ": estimatedTotal is missing");
        return new BusinessUnitIndexingProgressImpl(indexed, failed, estimatedTotal);
    }

    /**
     * builds BusinessUnitIndexingProgress without checking for non-null required values
     * @return BusinessUnitIndexingProgress
     */
    public BusinessUnitIndexingProgress buildUnchecked() {
        return new BusinessUnitIndexingProgressImpl(indexed, failed, estimatedTotal);
    }

    /**
     * factory method for an instance of BusinessUnitIndexingProgressBuilder
     * @return builder
     */
    public static BusinessUnitIndexingProgressBuilder of() {
        return new BusinessUnitIndexingProgressBuilder();
    }

    /**
     * create builder for BusinessUnitIndexingProgress instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitIndexingProgressBuilder of(final BusinessUnitIndexingProgress template) {
        BusinessUnitIndexingProgressBuilder builder = new BusinessUnitIndexingProgressBuilder();
        builder.indexed = template.getIndexed();
        builder.failed = template.getFailed();
        builder.estimatedTotal = template.getEstimatedTotal();
        return builder;
    }

}
