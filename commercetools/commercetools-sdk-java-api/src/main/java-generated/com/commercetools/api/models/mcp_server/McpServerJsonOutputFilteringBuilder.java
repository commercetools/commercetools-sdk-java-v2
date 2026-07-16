
package com.commercetools.api.models.mcp_server;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerJsonOutputFilteringBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerJsonOutputFiltering mcpServerJsonOutputFiltering = McpServerJsonOutputFiltering.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerJsonOutputFilteringBuilder implements Builder<McpServerJsonOutputFiltering> {

    @Nullable
    private com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcher redact;

    @Nullable
    private com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcher drop;

    @Nullable
    private java.util.List<String> fieldPathsToKeep;

    @Nullable
    private String redactedWith;

    /**
     *  <p>Fields whose values are replaced with a placeholder. The field itself is kept.</p>
     * @param builder function to build the redact value
     * @return Builder
     */

    public McpServerJsonOutputFilteringBuilder redact(
            Function<com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcherBuilder, com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcherBuilder> builder) {
        this.redact = builder
                .apply(com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcherBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Fields whose values are replaced with a placeholder. The field itself is kept.</p>
     * @param builder function to build the redact value
     * @return Builder
     */

    public McpServerJsonOutputFilteringBuilder withRedact(
            Function<com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcherBuilder, com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcher> builder) {
        this.redact = builder
                .apply(com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcherBuilder.of());
        return this;
    }

    /**
     *  <p>Fields whose values are replaced with a placeholder. The field itself is kept.</p>
     * @param redact value to be set
     * @return Builder
     */

    public McpServerJsonOutputFilteringBuilder redact(
            @Nullable final com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcher redact) {
        this.redact = redact;
        return this;
    }

    /**
     *  <p>Fields that are removed entirely from the response.</p>
     * @param builder function to build the drop value
     * @return Builder
     */

    public McpServerJsonOutputFilteringBuilder drop(
            Function<com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcherBuilder, com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcherBuilder> builder) {
        this.drop = builder
                .apply(com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcherBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Fields that are removed entirely from the response.</p>
     * @param builder function to build the drop value
     * @return Builder
     */

    public McpServerJsonOutputFilteringBuilder withDrop(
            Function<com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcherBuilder, com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcher> builder) {
        this.drop = builder
                .apply(com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcherBuilder.of());
        return this;
    }

    /**
     *  <p>Fields that are removed entirely from the response.</p>
     * @param drop value to be set
     * @return Builder
     */

    public McpServerJsonOutputFilteringBuilder drop(
            @Nullable final com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcher drop) {
        this.drop = drop;
        return this;
    }

    /**
     *  <p>Exact dotted paths kept even when they would otherwise match <code>redact</code> or <code>drop</code>.</p>
     * @param fieldPathsToKeep value to be set
     * @return Builder
     */

    public McpServerJsonOutputFilteringBuilder fieldPathsToKeep(@Nullable final String... fieldPathsToKeep) {
        this.fieldPathsToKeep = new ArrayList<>(Arrays.asList(fieldPathsToKeep));
        return this;
    }

    /**
     *  <p>Exact dotted paths kept even when they would otherwise match <code>redact</code> or <code>drop</code>.</p>
     * @param fieldPathsToKeep value to be set
     * @return Builder
     */

    public McpServerJsonOutputFilteringBuilder fieldPathsToKeep(
            @Nullable final java.util.List<String> fieldPathsToKeep) {
        this.fieldPathsToKeep = fieldPathsToKeep;
        return this;
    }

    /**
     *  <p>Exact dotted paths kept even when they would otherwise match <code>redact</code> or <code>drop</code>.</p>
     * @param fieldPathsToKeep value to be set
     * @return Builder
     */

    public McpServerJsonOutputFilteringBuilder plusFieldPathsToKeep(@Nullable final String... fieldPathsToKeep) {
        if (this.fieldPathsToKeep == null) {
            this.fieldPathsToKeep = new ArrayList<>();
        }
        this.fieldPathsToKeep.addAll(Arrays.asList(fieldPathsToKeep));
        return this;
    }

    /**
     *  <p>Placeholder written in place of redacted values. When unset, the MCP Server applies its own default (<code>[REDACTED]</code>).</p>
     * @param redactedWith value to be set
     * @return Builder
     */

    public McpServerJsonOutputFilteringBuilder redactedWith(@Nullable final String redactedWith) {
        this.redactedWith = redactedWith;
        return this;
    }

    /**
     *  <p>Fields whose values are replaced with a placeholder. The field itself is kept.</p>
     * @return redact
     */

    @Nullable
    public com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcher getRedact() {
        return this.redact;
    }

    /**
     *  <p>Fields that are removed entirely from the response.</p>
     * @return drop
     */

    @Nullable
    public com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcher getDrop() {
        return this.drop;
    }

    /**
     *  <p>Exact dotted paths kept even when they would otherwise match <code>redact</code> or <code>drop</code>.</p>
     * @return fieldPathsToKeep
     */

    @Nullable
    public java.util.List<String> getFieldPathsToKeep() {
        return this.fieldPathsToKeep;
    }

    /**
     *  <p>Placeholder written in place of redacted values. When unset, the MCP Server applies its own default (<code>[REDACTED]</code>).</p>
     * @return redactedWith
     */

    @Nullable
    public String getRedactedWith() {
        return this.redactedWith;
    }

    /**
     * builds McpServerJsonOutputFiltering with checking for non-null required values
     * @return McpServerJsonOutputFiltering
     */
    public McpServerJsonOutputFiltering build() {
        return new McpServerJsonOutputFilteringImpl(redact, drop, fieldPathsToKeep, redactedWith);
    }

    /**
     * builds McpServerJsonOutputFiltering without checking for non-null required values
     * @return McpServerJsonOutputFiltering
     */
    public McpServerJsonOutputFiltering buildUnchecked() {
        return new McpServerJsonOutputFilteringImpl(redact, drop, fieldPathsToKeep, redactedWith);
    }

    /**
     * factory method for an instance of McpServerJsonOutputFilteringBuilder
     * @return builder
     */
    public static McpServerJsonOutputFilteringBuilder of() {
        return new McpServerJsonOutputFilteringBuilder();
    }

    /**
     * create builder for McpServerJsonOutputFiltering instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerJsonOutputFilteringBuilder of(final McpServerJsonOutputFiltering template) {
        McpServerJsonOutputFilteringBuilder builder = new McpServerJsonOutputFilteringBuilder();
        builder.redact = template.getRedact();
        builder.drop = template.getDrop();
        builder.fieldPathsToKeep = template.getFieldPathsToKeep();
        builder.redactedWith = template.getRedactedWith();
        return builder;
    }

}
