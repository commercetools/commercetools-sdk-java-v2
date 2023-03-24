
package com.commercetools.api.models.zone;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZonePagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZonePagedQueryResponse zonePagedQueryResponse = ZonePagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ZonePagedQueryResponseBuilder implements Builder<ZonePagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.zone.Zone> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public ZonePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public ZonePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public ZonePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public ZonePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Zones matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ZonePagedQueryResponseBuilder results(final com.commercetools.api.models.zone.Zone... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Zones matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ZonePagedQueryResponseBuilder results(final java.util.List<com.commercetools.api.models.zone.Zone> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Zones matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ZonePagedQueryResponseBuilder plusResults(final com.commercetools.api.models.zone.Zone... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Zones matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ZonePagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.zone.ZoneBuilder, com.commercetools.api.models.zone.ZoneBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.zone.ZoneBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Zones matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ZonePagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.zone.ZoneBuilder, com.commercetools.api.models.zone.ZoneBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.zone.ZoneBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.zone.Zone> getResults() {
        return this.results;
    }

    /**
     * builds ZonePagedQueryResponse with checking for non-null required values
     * @return ZonePagedQueryResponse
     */
    public ZonePagedQueryResponse build() {
        Objects.requireNonNull(limit, ZonePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ZonePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ZonePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, ZonePagedQueryResponse.class + ": results is missing");
        return new ZonePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds ZonePagedQueryResponse without checking for non-null required values
     * @return ZonePagedQueryResponse
     */
    public ZonePagedQueryResponse buildUnchecked() {
        return new ZonePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static ZonePagedQueryResponseBuilder of() {
        return new ZonePagedQueryResponseBuilder();
    }

    public static ZonePagedQueryResponseBuilder of(final ZonePagedQueryResponse template) {
        ZonePagedQueryResponseBuilder builder = new ZonePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
