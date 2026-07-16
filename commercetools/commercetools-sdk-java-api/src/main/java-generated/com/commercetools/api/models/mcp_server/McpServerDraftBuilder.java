
package com.commercetools.api.models.mcp_server;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerDraft mcpServerDraft = McpServerDraft.builder()
 *             .key("{key}")
 *             .mcpServer(mcpServerBuilder -> mcpServerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerDraftBuilder implements Builder<McpServerDraft> {

    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private com.commercetools.api.models.mcp_server.McpServerState state;

    private com.commercetools.api.models.mcp_server.McpServerConfigDraft mcpServer;

    /**
     *  <p>User-defined unique identifier for the MCP Server. Must be unique within the Project.</p>
     * @param key value to be set
     * @return Builder
     */

    public McpServerDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the MCP Server.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public McpServerDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the MCP Server.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public McpServerDraftBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the MCP Server.</p>
     * @param name value to be set
     * @return Builder
     */

    public McpServerDraftBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the MCP Server.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public McpServerDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the MCP Server.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public McpServerDraftBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the MCP Server.</p>
     * @param description value to be set
     * @return Builder
     */

    public McpServerDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>State of the MCP Server.</p>
     * @param state value to be set
     * @return Builder
     */

    public McpServerDraftBuilder state(@Nullable final com.commercetools.api.models.mcp_server.McpServerState state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Configuration of the MCP Server connection.</p>
     * @param mcpServer value to be set
     * @return Builder
     */

    public McpServerDraftBuilder mcpServer(
            final com.commercetools.api.models.mcp_server.McpServerConfigDraft mcpServer) {
        this.mcpServer = mcpServer;
        return this;
    }

    /**
     *  <p>Configuration of the MCP Server connection.</p>
     * @param builder function to build the mcpServer value
     * @return Builder
     */

    public McpServerDraftBuilder mcpServer(
            Function<com.commercetools.api.models.mcp_server.McpServerConfigDraftBuilder, Builder<? extends com.commercetools.api.models.mcp_server.McpServerConfigDraft>> builder) {
        this.mcpServer = builder.apply(com.commercetools.api.models.mcp_server.McpServerConfigDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the MCP Server. Must be unique within the Project.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the MCP Server.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Description of the MCP Server.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>State of the MCP Server.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.api.models.mcp_server.McpServerState getState() {
        return this.state;
    }

    /**
     *  <p>Configuration of the MCP Server connection.</p>
     * @return mcpServer
     */

    public com.commercetools.api.models.mcp_server.McpServerConfigDraft getMcpServer() {
        return this.mcpServer;
    }

    /**
     * builds McpServerDraft with checking for non-null required values
     * @return McpServerDraft
     */
    public McpServerDraft build() {
        Objects.requireNonNull(key, McpServerDraft.class + ": key is missing");
        Objects.requireNonNull(mcpServer, McpServerDraft.class + ": mcpServer is missing");
        return new McpServerDraftImpl(key, name, description, state, mcpServer);
    }

    /**
     * builds McpServerDraft without checking for non-null required values
     * @return McpServerDraft
     */
    public McpServerDraft buildUnchecked() {
        return new McpServerDraftImpl(key, name, description, state, mcpServer);
    }

    /**
     * factory method for an instance of McpServerDraftBuilder
     * @return builder
     */
    public static McpServerDraftBuilder of() {
        return new McpServerDraftBuilder();
    }

    /**
     * create builder for McpServerDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerDraftBuilder of(final McpServerDraft template) {
        McpServerDraftBuilder builder = new McpServerDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.state = template.getState();
        builder.mcpServer = template.getMcpServer();
        return builder;
    }

}
