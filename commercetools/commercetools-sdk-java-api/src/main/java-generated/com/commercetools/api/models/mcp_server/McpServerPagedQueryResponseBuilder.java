
package com.commercetools.api.models.mcp_server;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerPagedQueryResponse mcpServerPagedQueryResponse = McpServerPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerPagedQueryResponseBuilder implements Builder<McpServerPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.mcp_server.McpServer> results;

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @param limit value to be set
     * @return Builder
     */

    public McpServerPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @param offset value to be set
     * @return Builder
     */

    public McpServerPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public McpServerPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>.</p>
     * @param total value to be set
     * @return Builder
     */

    public McpServerPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>MCP Servers matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public McpServerPagedQueryResponseBuilder results(
            final com.commercetools.api.models.mcp_server.McpServer... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>MCP Servers matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public McpServerPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.mcp_server.McpServer> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>MCP Servers matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public McpServerPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.mcp_server.McpServer... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>MCP Servers matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public McpServerPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.mcp_server.McpServerBuilder, com.commercetools.api.models.mcp_server.McpServerBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.mcp_server.McpServerBuilder.of()).build());
        return this;
    }

    /**
     *  <p>MCP Servers matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public McpServerPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.mcp_server.McpServerBuilder, com.commercetools.api.models.mcp_server.McpServerBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.mcp_server.McpServerBuilder.of()).build());
        return this;
    }

    /**
     *  <p>MCP Servers matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public McpServerPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.mcp_server.McpServerBuilder, com.commercetools.api.models.mcp_server.McpServer> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.mcp_server.McpServerBuilder.of()));
    }

    /**
     *  <p>MCP Servers matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public McpServerPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.mcp_server.McpServerBuilder, com.commercetools.api.models.mcp_server.McpServer> builder) {
        return results(builder.apply(com.commercetools.api.models.mcp_server.McpServerBuilder.of()));
    }

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @return limit
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
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
     *  <p>Total number of results matching the query. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>.</p>
     * @return total
     */

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>MCP Servers matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.mcp_server.McpServer> getResults() {
        return this.results;
    }

    /**
     * builds McpServerPagedQueryResponse with checking for non-null required values
     * @return McpServerPagedQueryResponse
     */
    public McpServerPagedQueryResponse build() {
        Objects.requireNonNull(limit, McpServerPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, McpServerPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, McpServerPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, McpServerPagedQueryResponse.class + ": results is missing");
        return new McpServerPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds McpServerPagedQueryResponse without checking for non-null required values
     * @return McpServerPagedQueryResponse
     */
    public McpServerPagedQueryResponse buildUnchecked() {
        return new McpServerPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of McpServerPagedQueryResponseBuilder
     * @return builder
     */
    public static McpServerPagedQueryResponseBuilder of() {
        return new McpServerPagedQueryResponseBuilder();
    }

    /**
     * create builder for McpServerPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerPagedQueryResponseBuilder of(final McpServerPagedQueryResponse template) {
        McpServerPagedQueryResponseBuilder builder = new McpServerPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
