
package com.commercetools.api.models.associate_role;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRolePagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRolePagedQueryResponse associateRolePagedQueryResponse = AssociateRolePagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRolePagedQueryResponseBuilder implements Builder<AssociateRolePagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.associate_role.AssociateRole> results;

    /**
     *  <p>Number of requested <span>results</span>.</p>
     * @param limit value to be set
     * @return Builder
     */

    public AssociateRolePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements <span>skipped</span>.</p>
     * @param offset value to be set
     * @return Builder
     */

    public AssociateRolePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public AssociateRolePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @param total value to be set
     * @return Builder
     */

    public AssociateRolePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRoles</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public AssociateRolePagedQueryResponseBuilder results(
            final com.commercetools.api.models.associate_role.AssociateRole... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRoles</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public AssociateRolePagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.associate_role.AssociateRole> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRoles</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public AssociateRolePagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.associate_role.AssociateRole... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRoles</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public AssociateRolePagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.associate_role.AssociateRoleBuilder, com.commercetools.api.models.associate_role.AssociateRoleBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.associate_role.AssociateRoleBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRoles</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public AssociateRolePagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.associate_role.AssociateRoleBuilder, com.commercetools.api.models.associate_role.AssociateRoleBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.associate_role.AssociateRoleBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRoles</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public AssociateRolePagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.associate_role.AssociateRoleBuilder, com.commercetools.api.models.associate_role.AssociateRole> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.associate_role.AssociateRoleBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRoles</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public AssociateRolePagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.associate_role.AssociateRoleBuilder, com.commercetools.api.models.associate_role.AssociateRole> builder) {
        return results(builder.apply(com.commercetools.api.models.associate_role.AssociateRoleBuilder.of()));
    }

    /**
     *  <p>Number of requested <span>results</span>.</p>
     * @return limit
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of elements <span>skipped</span>.</p>
     * @return offset
     */

    public Long getOffset() {
        return this.offset;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */

    public Long getCount() {
        return this.count;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @return total
     */

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRoles</a> matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.associate_role.AssociateRole> getResults() {
        return this.results;
    }

    /**
     * builds AssociateRolePagedQueryResponse with checking for non-null required values
     * @return AssociateRolePagedQueryResponse
     */
    public AssociateRolePagedQueryResponse build() {
        Objects.requireNonNull(limit, AssociateRolePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, AssociateRolePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, AssociateRolePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, AssociateRolePagedQueryResponse.class + ": results is missing");
        return new AssociateRolePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds AssociateRolePagedQueryResponse without checking for non-null required values
     * @return AssociateRolePagedQueryResponse
     */
    public AssociateRolePagedQueryResponse buildUnchecked() {
        return new AssociateRolePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of AssociateRolePagedQueryResponseBuilder
     * @return builder
     */
    public static AssociateRolePagedQueryResponseBuilder of() {
        return new AssociateRolePagedQueryResponseBuilder();
    }

    /**
     * create builder for AssociateRolePagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRolePagedQueryResponseBuilder of(final AssociateRolePagedQueryResponse template) {
        AssociateRolePagedQueryResponseBuilder builder = new AssociateRolePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
