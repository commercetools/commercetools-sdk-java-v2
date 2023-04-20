
package com.commercetools.api.models.attribute_group;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupPagedQueryResponse attributeGroupPagedQueryResponse = AttributeGroupPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeGroupPagedQueryResponseBuilder implements Builder<AttributeGroupPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.attribute_group.AttributeGroup> results;

    /**
     *  <p>Number of results requested in the query request.</p>
     * @param limit value to be set
     * @return Builder
     */

    public AttributeGroupPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Offset supplied by the client or the server default. It is the number of elements skipped, not a page number.</p>
     * @param offset value to be set
     * @return Builder
     */

    public AttributeGroupPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public AttributeGroupPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public AttributeGroupPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>AttributeGroups matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public AttributeGroupPagedQueryResponseBuilder results(
            final com.commercetools.api.models.attribute_group.AttributeGroup... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>AttributeGroups matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public AttributeGroupPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.attribute_group.AttributeGroup> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>AttributeGroups matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public AttributeGroupPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.attribute_group.AttributeGroup... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>AttributeGroups matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public AttributeGroupPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.attribute_group.AttributeGroupBuilder, com.commercetools.api.models.attribute_group.AttributeGroupBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results
                .add(builder.apply(com.commercetools.api.models.attribute_group.AttributeGroupBuilder.of()).build());
        return this;
    }

    /**
     *  <p>AttributeGroups matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public AttributeGroupPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.attribute_group.AttributeGroupBuilder, com.commercetools.api.models.attribute_group.AttributeGroupBuilder> builder) {
        this.results = new ArrayList<>();
        this.results
                .add(builder.apply(com.commercetools.api.models.attribute_group.AttributeGroupBuilder.of()).build());
        return this;
    }

    /**
     *  <p>AttributeGroups matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public AttributeGroupPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.attribute_group.AttributeGroupBuilder, com.commercetools.api.models.attribute_group.AttributeGroup> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.attribute_group.AttributeGroupBuilder.of()));
    }

    /**
     *  <p>AttributeGroups matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public AttributeGroupPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.attribute_group.AttributeGroupBuilder, com.commercetools.api.models.attribute_group.AttributeGroup> builder) {
        return results(builder.apply(com.commercetools.api.models.attribute_group.AttributeGroupBuilder.of()));
    }

    /**
     *  <p>Number of results requested in the query request.</p>
     * @return limit
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     *  <p>Offset supplied by the client or the server default. It is the number of elements skipped, not a page number.</p>
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
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @return total
     */

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>AttributeGroups matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.attribute_group.AttributeGroup> getResults() {
        return this.results;
    }

    /**
     * builds AttributeGroupPagedQueryResponse with checking for non-null required values
     * @return AttributeGroupPagedQueryResponse
     */
    public AttributeGroupPagedQueryResponse build() {
        Objects.requireNonNull(limit, AttributeGroupPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, AttributeGroupPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, AttributeGroupPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, AttributeGroupPagedQueryResponse.class + ": results is missing");
        return new AttributeGroupPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds AttributeGroupPagedQueryResponse without checking for non-null required values
     * @return AttributeGroupPagedQueryResponse
     */
    public AttributeGroupPagedQueryResponse buildUnchecked() {
        return new AttributeGroupPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of AttributeGroupPagedQueryResponseBuilder
     * @return builder
     */
    public static AttributeGroupPagedQueryResponseBuilder of() {
        return new AttributeGroupPagedQueryResponseBuilder();
    }

    /**
     * create builder for AttributeGroupPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupPagedQueryResponseBuilder of(final AttributeGroupPagedQueryResponse template) {
        AttributeGroupPagedQueryResponseBuilder builder = new AttributeGroupPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
