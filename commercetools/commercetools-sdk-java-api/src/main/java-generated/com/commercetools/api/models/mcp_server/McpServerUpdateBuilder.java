
package com.commercetools.api.models.mcp_server;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerUpdate mcpServerUpdate = McpServerUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerUpdateBuilder implements Builder<McpServerUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.mcp_server.McpServerUpdateAction> actions;

    /**
     *  <p>Expected version of the MCP Server on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error is returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public McpServerUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the MCP Server.</p>
     * @param actions value to be set
     * @return Builder
     */

    public McpServerUpdateBuilder actions(
            final com.commercetools.api.models.mcp_server.McpServerUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the MCP Server.</p>
     * @param actions value to be set
     * @return Builder
     */

    public McpServerUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.mcp_server.McpServerUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the MCP Server.</p>
     * @param actions value to be set
     * @return Builder
     */

    public McpServerUpdateBuilder plusActions(
            final com.commercetools.api.models.mcp_server.McpServerUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the MCP Server.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public McpServerUpdateBuilder plusActions(
            Function<com.commercetools.api.models.mcp_server.McpServerUpdateActionBuilder, Builder<? extends com.commercetools.api.models.mcp_server.McpServerUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions
                .add(builder.apply(com.commercetools.api.models.mcp_server.McpServerUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the MCP Server.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public McpServerUpdateBuilder withActions(
            Function<com.commercetools.api.models.mcp_server.McpServerUpdateActionBuilder, Builder<? extends com.commercetools.api.models.mcp_server.McpServerUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions
                .add(builder.apply(com.commercetools.api.models.mcp_server.McpServerUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the MCP Server on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error is returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the MCP Server.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.mcp_server.McpServerUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds McpServerUpdate with checking for non-null required values
     * @return McpServerUpdate
     */
    public McpServerUpdate build() {
        Objects.requireNonNull(version, McpServerUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, McpServerUpdate.class + ": actions is missing");
        return new McpServerUpdateImpl(version, actions);
    }

    /**
     * builds McpServerUpdate without checking for non-null required values
     * @return McpServerUpdate
     */
    public McpServerUpdate buildUnchecked() {
        return new McpServerUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of McpServerUpdateBuilder
     * @return builder
     */
    public static McpServerUpdateBuilder of() {
        return new McpServerUpdateBuilder();
    }

    /**
     * create builder for McpServerUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerUpdateBuilder of(final McpServerUpdate template) {
        McpServerUpdateBuilder builder = new McpServerUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
