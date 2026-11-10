
package com.commercetools.api.models.mcp_server;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerSetJsonOutputFilteringActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerSetJsonOutputFilteringAction mcpServerSetJsonOutputFilteringAction = McpServerSetJsonOutputFilteringAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerSetJsonOutputFilteringActionBuilder implements Builder<McpServerSetJsonOutputFilteringAction> {

    @Nullable
    private com.commercetools.api.models.mcp_server.McpServerJsonOutputFiltering jsonOutputFiltering;

    /**
     *  <p>Value to set. The existing configuration is entirely replaced with this value. If absent, the existing filtering configuration is removed.</p>
     * @param builder function to build the jsonOutputFiltering value
     * @return Builder
     */

    public McpServerSetJsonOutputFilteringActionBuilder jsonOutputFiltering(
            Function<com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringBuilder, com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringBuilder> builder) {
        this.jsonOutputFiltering = builder
                .apply(com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. The existing configuration is entirely replaced with this value. If absent, the existing filtering configuration is removed.</p>
     * @param builder function to build the jsonOutputFiltering value
     * @return Builder
     */

    public McpServerSetJsonOutputFilteringActionBuilder withJsonOutputFiltering(
            Function<com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringBuilder, com.commercetools.api.models.mcp_server.McpServerJsonOutputFiltering> builder) {
        this.jsonOutputFiltering = builder
                .apply(com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. The existing configuration is entirely replaced with this value. If absent, the existing filtering configuration is removed.</p>
     * @param jsonOutputFiltering value to be set
     * @return Builder
     */

    public McpServerSetJsonOutputFilteringActionBuilder jsonOutputFiltering(
            @Nullable final com.commercetools.api.models.mcp_server.McpServerJsonOutputFiltering jsonOutputFiltering) {
        this.jsonOutputFiltering = jsonOutputFiltering;
        return this;
    }

    /**
     *  <p>Value to set. The existing configuration is entirely replaced with this value. If absent, the existing filtering configuration is removed.</p>
     * @return jsonOutputFiltering
     */

    @Nullable
    public com.commercetools.api.models.mcp_server.McpServerJsonOutputFiltering getJsonOutputFiltering() {
        return this.jsonOutputFiltering;
    }

    /**
     * builds McpServerSetJsonOutputFilteringAction with checking for non-null required values
     * @return McpServerSetJsonOutputFilteringAction
     */
    public McpServerSetJsonOutputFilteringAction build() {
        return new McpServerSetJsonOutputFilteringActionImpl(jsonOutputFiltering);
    }

    /**
     * builds McpServerSetJsonOutputFilteringAction without checking for non-null required values
     * @return McpServerSetJsonOutputFilteringAction
     */
    public McpServerSetJsonOutputFilteringAction buildUnchecked() {
        return new McpServerSetJsonOutputFilteringActionImpl(jsonOutputFiltering);
    }

    /**
     * factory method for an instance of McpServerSetJsonOutputFilteringActionBuilder
     * @return builder
     */
    public static McpServerSetJsonOutputFilteringActionBuilder of() {
        return new McpServerSetJsonOutputFilteringActionBuilder();
    }

    /**
     * create builder for McpServerSetJsonOutputFilteringAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerSetJsonOutputFilteringActionBuilder of(
            final McpServerSetJsonOutputFilteringAction template) {
        McpServerSetJsonOutputFilteringActionBuilder builder = new McpServerSetJsonOutputFilteringActionBuilder();
        builder.jsonOutputFiltering = template.getJsonOutputFiltering();
        return builder;
    }

}
