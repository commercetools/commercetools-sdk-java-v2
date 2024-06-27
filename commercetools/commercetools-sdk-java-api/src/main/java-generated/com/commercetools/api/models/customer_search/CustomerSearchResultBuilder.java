
package com.commercetools.api.models.customer_search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSearchResultBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSearchResult customerSearchResult = CustomerSearchResult.builder()
 *             .id("{id}")
 *             .relevance(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSearchResultBuilder implements Builder<CustomerSearchResult> {

    private String id;

    private Double relevance;

    /**
     *  <p><code>id</code> of the Customer matching the search query.</p>
     * @param id value to be set
     * @return Builder
     */

    public CustomerSearchResultBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>How closely this customer matches the search query.</p>
     * @param relevance value to be set
     * @return Builder
     */

    public CustomerSearchResultBuilder relevance(final Double relevance) {
        this.relevance = relevance;
        return this;
    }

    /**
     *  <p><code>id</code> of the Customer matching the search query.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>How closely this customer matches the search query.</p>
     * @return relevance
     */

    public Double getRelevance() {
        return this.relevance;
    }

    /**
     * builds CustomerSearchResult with checking for non-null required values
     * @return CustomerSearchResult
     */
    public CustomerSearchResult build() {
        Objects.requireNonNull(id, CustomerSearchResult.class + ": id is missing");
        Objects.requireNonNull(relevance, CustomerSearchResult.class + ": relevance is missing");
        return new CustomerSearchResultImpl(id, relevance);
    }

    /**
     * builds CustomerSearchResult without checking for non-null required values
     * @return CustomerSearchResult
     */
    public CustomerSearchResult buildUnchecked() {
        return new CustomerSearchResultImpl(id, relevance);
    }

    /**
     * factory method for an instance of CustomerSearchResultBuilder
     * @return builder
     */
    public static CustomerSearchResultBuilder of() {
        return new CustomerSearchResultBuilder();
    }

    /**
     * create builder for CustomerSearchResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSearchResultBuilder of(final CustomerSearchResult template) {
        CustomerSearchResultBuilder builder = new CustomerSearchResultBuilder();
        builder.id = template.getId();
        builder.relevance = template.getRelevance();
        return builder;
    }

}
