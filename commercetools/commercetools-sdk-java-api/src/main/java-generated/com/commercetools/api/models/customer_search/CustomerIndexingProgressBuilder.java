
package com.commercetools.api.models.customer_search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerIndexingProgressBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerIndexingProgress customerIndexingProgress = CustomerIndexingProgress.builder()
 *             .indexed(0.3)
 *             .failed(0.3)
 *             .estimatedTotal(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerIndexingProgressBuilder implements Builder<CustomerIndexingProgress> {

    private Integer indexed;

    private Integer failed;

    private Integer estimatedTotal;

    /**
     *  <p>The number of Customers successfully indexed.</p>
     * @param indexed value to be set
     * @return Builder
     */

    public CustomerIndexingProgressBuilder indexed(final Integer indexed) {
        this.indexed = indexed;
        return this;
    }

    /**
     *  <p>The number of Customers that failed to be indexed.</p>
     * @param failed value to be set
     * @return Builder
     */

    public CustomerIndexingProgressBuilder failed(final Integer failed) {
        this.failed = failed;
        return this;
    }

    /**
     *  <p>The estimated total number of Customers to be indexed.</p>
     * @param estimatedTotal value to be set
     * @return Builder
     */

    public CustomerIndexingProgressBuilder estimatedTotal(final Integer estimatedTotal) {
        this.estimatedTotal = estimatedTotal;
        return this;
    }

    /**
     *  <p>The number of Customers successfully indexed.</p>
     * @return indexed
     */

    public Integer getIndexed() {
        return this.indexed;
    }

    /**
     *  <p>The number of Customers that failed to be indexed.</p>
     * @return failed
     */

    public Integer getFailed() {
        return this.failed;
    }

    /**
     *  <p>The estimated total number of Customers to be indexed.</p>
     * @return estimatedTotal
     */

    public Integer getEstimatedTotal() {
        return this.estimatedTotal;
    }

    /**
     * builds CustomerIndexingProgress with checking for non-null required values
     * @return CustomerIndexingProgress
     */
    public CustomerIndexingProgress build() {
        Objects.requireNonNull(indexed, CustomerIndexingProgress.class + ": indexed is missing");
        Objects.requireNonNull(failed, CustomerIndexingProgress.class + ": failed is missing");
        Objects.requireNonNull(estimatedTotal, CustomerIndexingProgress.class + ": estimatedTotal is missing");
        return new CustomerIndexingProgressImpl(indexed, failed, estimatedTotal);
    }

    /**
     * builds CustomerIndexingProgress without checking for non-null required values
     * @return CustomerIndexingProgress
     */
    public CustomerIndexingProgress buildUnchecked() {
        return new CustomerIndexingProgressImpl(indexed, failed, estimatedTotal);
    }

    /**
     * factory method for an instance of CustomerIndexingProgressBuilder
     * @return builder
     */
    public static CustomerIndexingProgressBuilder of() {
        return new CustomerIndexingProgressBuilder();
    }

    /**
     * create builder for CustomerIndexingProgress instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerIndexingProgressBuilder of(final CustomerIndexingProgress template) {
        CustomerIndexingProgressBuilder builder = new CustomerIndexingProgressBuilder();
        builder.indexed = template.getIndexed();
        builder.failed = template.getFailed();
        builder.estimatedTotal = template.getEstimatedTotal();
        return builder;
    }

}
