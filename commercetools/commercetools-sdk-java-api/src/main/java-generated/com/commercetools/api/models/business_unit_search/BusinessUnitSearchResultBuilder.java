
package com.commercetools.api.models.business_unit_search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitSearchResultBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSearchResult businessUnitSearchResult = BusinessUnitSearchResult.builder()
 *             .id("{id}")
 *             .relevance(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSearchResultBuilder implements Builder<BusinessUnitSearchResult> {

    private String id;

    private Double relevance;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> matching the search query.</p>
     * @param id value to be set
     * @return Builder
     */

    public BusinessUnitSearchResultBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>How closely this customer matches the search query.</p>
     * @param relevance value to be set
     * @return Builder
     */

    public BusinessUnitSearchResultBuilder relevance(final Double relevance) {
        this.relevance = relevance;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> matching the search query.</p>
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
     * builds BusinessUnitSearchResult with checking for non-null required values
     * @return BusinessUnitSearchResult
     */
    public BusinessUnitSearchResult build() {
        Objects.requireNonNull(id, BusinessUnitSearchResult.class + ": id is missing");
        Objects.requireNonNull(relevance, BusinessUnitSearchResult.class + ": relevance is missing");
        return new BusinessUnitSearchResultImpl(id, relevance);
    }

    /**
     * builds BusinessUnitSearchResult without checking for non-null required values
     * @return BusinessUnitSearchResult
     */
    public BusinessUnitSearchResult buildUnchecked() {
        return new BusinessUnitSearchResultImpl(id, relevance);
    }

    /**
     * factory method for an instance of BusinessUnitSearchResultBuilder
     * @return builder
     */
    public static BusinessUnitSearchResultBuilder of() {
        return new BusinessUnitSearchResultBuilder();
    }

    /**
     * create builder for BusinessUnitSearchResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSearchResultBuilder of(final BusinessUnitSearchResult template) {
        BusinessUnitSearchResultBuilder builder = new BusinessUnitSearchResultBuilder();
        builder.id = template.getId();
        builder.relevance = template.getRelevance();
        return builder;
    }

}
