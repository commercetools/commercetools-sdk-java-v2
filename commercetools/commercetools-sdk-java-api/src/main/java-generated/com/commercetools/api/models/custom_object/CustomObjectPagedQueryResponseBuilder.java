
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
     <*  <p>Number of results requested.</p>>
     */

    public CustomObjectPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     <*  <p>Number of elements skipped.</p>>
     */

    public CustomObjectPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     <*  <p>Actual number of results returned.</p>>
     */

    public CustomObjectPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     <*  <p>The total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>>
     */

    public CustomObjectPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     <*  <p>CustomObjects matching the query.</p>>
     */

    public CustomObjectPagedQueryResponseBuilder results(
            final com.commercetools.api.models.custom_object.CustomObject... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     <*  <p>CustomObjects matching the query.</p>>
     */

    public CustomObjectPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.custom_object.CustomObject> results) {
        this.results = results;
        return this;
    }

    /**
     <*  <p>CustomObjects matching the query.</p>>
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
     <*  <p>CustomObjects matching the query.</p>>
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
     <*  <p>CustomObjects matching the query.</p>>
     */

    public CustomObjectPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.custom_object.CustomObjectBuilder, com.commercetools.api.models.custom_object.CustomObjectBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.custom_object.CustomObjectBuilder.of()).build());
        return this;
    }

    public Long getLimit() {
        return this.limit;
    }

    public Long getOffset() {
        return this.offset;
    }

    public Long getCount() {
        return this.count;
    }

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    public java.util.List<com.commercetools.api.models.custom_object.CustomObject> getResults() {
        return this.results;
    }

    public CustomObjectPagedQueryResponse build() {
        Objects.requireNonNull(limit, CustomObjectPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, CustomObjectPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, CustomObjectPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, CustomObjectPagedQueryResponse.class + ": results is missing");
        return new CustomObjectPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds CustomObjectPagedQueryResponse without checking for non null required values
     */
    public CustomObjectPagedQueryResponse buildUnchecked() {
        return new CustomObjectPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static CustomObjectPagedQueryResponseBuilder of() {
        return new CustomObjectPagedQueryResponseBuilder();
    }

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
