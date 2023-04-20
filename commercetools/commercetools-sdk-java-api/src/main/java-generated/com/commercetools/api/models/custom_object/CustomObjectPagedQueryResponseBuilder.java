
package com.commercetools.api.models.custom_object;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomObjectPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomObjectPagedQueryResponse customObjectPagedQueryResponse = CustomObjectPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomObjectPagedQueryResponseBuilder implements Builder<CustomObjectPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.custom_object.CustomObject> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public CustomObjectPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public CustomObjectPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public CustomObjectPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>The total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public CustomObjectPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>CustomObjects matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public CustomObjectPagedQueryResponseBuilder results(
            final com.commercetools.api.models.custom_object.CustomObject... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>CustomObjects matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public CustomObjectPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.custom_object.CustomObject> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>CustomObjects matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public CustomObjectPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.custom_object.CustomObject... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>CustomObjects matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public CustomObjectPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.custom_object.CustomObjectBuilder, com.commercetools.api.models.custom_object.CustomObjectBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.custom_object.CustomObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>CustomObjects matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public CustomObjectPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.custom_object.CustomObjectBuilder, com.commercetools.api.models.custom_object.CustomObjectBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.custom_object.CustomObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>CustomObjects matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public CustomObjectPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.custom_object.CustomObjectBuilder, com.commercetools.api.models.custom_object.CustomObject> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.custom_object.CustomObjectBuilder.of()));
    }

    /**
     *  <p>CustomObjects matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public CustomObjectPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.custom_object.CustomObjectBuilder, com.commercetools.api.models.custom_object.CustomObject> builder) {
        return results(builder.apply(com.commercetools.api.models.custom_object.CustomObjectBuilder.of()));
    }

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of elements skipped.</p>
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
     *  <p>The total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @return total
     */

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>CustomObjects matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.custom_object.CustomObject> getResults() {
        return this.results;
    }

    /**
     * builds CustomObjectPagedQueryResponse with checking for non-null required values
     * @return CustomObjectPagedQueryResponse
     */
    public CustomObjectPagedQueryResponse build() {
        Objects.requireNonNull(limit, CustomObjectPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, CustomObjectPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, CustomObjectPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, CustomObjectPagedQueryResponse.class + ": results is missing");
        return new CustomObjectPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds CustomObjectPagedQueryResponse without checking for non-null required values
     * @return CustomObjectPagedQueryResponse
     */
    public CustomObjectPagedQueryResponse buildUnchecked() {
        return new CustomObjectPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of CustomObjectPagedQueryResponseBuilder
     * @return builder
     */
    public static CustomObjectPagedQueryResponseBuilder of() {
        return new CustomObjectPagedQueryResponseBuilder();
    }

    /**
     * create builder for CustomObjectPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomObjectPagedQueryResponseBuilder of(final CustomObjectPagedQueryResponse template) {
        CustomObjectPagedQueryResponseBuilder builder = new CustomObjectPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
