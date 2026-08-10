
package com.commercetools.api.models.mcp_server;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServer mcpServer = McpServer.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .key("{key}")
 *             .authenticationMode(McpServerAuthenticationMode.CLIENT_CREDENTIALS)
 *             .state(McpServerState.ENABLED)
 *             .mcpServer(mcpServerBuilder -> mcpServerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerBuilder implements Builder<McpServer> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.mcp_server.McpServerAuthenticationMode authenticationMode;

    private com.commercetools.api.models.mcp_server.McpServerState state;

    private com.commercetools.api.models.mcp_server.McpServerConfig mcpServer;

    /**
     *  <p>Unique identifier of the MCP Server.</p>
     * @param id value to be set
     * @return Builder
     */

    public McpServerBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the MCP Server.</p>
     * @param version value to be set
     * @return Builder
     */

    public McpServerBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the MCP Server was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public McpServerBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the MCP Server was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public McpServerBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the MCP Server.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public McpServerBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the MCP Server.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public McpServerBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the MCP Server.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public McpServerBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the MCP Server.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public McpServerBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the MCP Server.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public McpServerBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the MCP Server.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public McpServerBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the MCP Server within a Project.</p>
     * @param key value to be set
     * @return Builder
     */

    public McpServerBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the MCP Server.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public McpServerBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the MCP Server.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public McpServerBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the MCP Server.</p>
     * @param name value to be set
     * @return Builder
     */

    public McpServerBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the MCP Server.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public McpServerBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the MCP Server.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public McpServerBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the MCP Server.</p>
     * @param description value to be set
     * @return Builder
     */

    public McpServerBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Determines how AI agents authenticate when connecting to the MCP Server.</p>
     * @param authenticationMode value to be set
     * @return Builder
     */

    public McpServerBuilder authenticationMode(
            final com.commercetools.api.models.mcp_server.McpServerAuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
        return this;
    }

    /**
     *  <p>State of the MCP Server. A <code>Disabled</code> MCP Server rejects all AI agent tool requests.</p>
     * @param state value to be set
     * @return Builder
     */

    public McpServerBuilder state(final com.commercetools.api.models.mcp_server.McpServerState state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Configuration of the MCP Server connection.</p>
     * @param mcpServer value to be set
     * @return Builder
     */

    public McpServerBuilder mcpServer(final com.commercetools.api.models.mcp_server.McpServerConfig mcpServer) {
        this.mcpServer = mcpServer;
        return this;
    }

    /**
     *  <p>Configuration of the MCP Server connection.</p>
     * @param builder function to build the mcpServer value
     * @return Builder
     */

    public McpServerBuilder mcpServer(
            Function<com.commercetools.api.models.mcp_server.McpServerConfigBuilder, Builder<? extends com.commercetools.api.models.mcp_server.McpServerConfig>> builder) {
        this.mcpServer = builder.apply(com.commercetools.api.models.mcp_server.McpServerConfigBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Unique identifier of the MCP Server.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the MCP Server.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the MCP Server was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the MCP Server was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the MCP Server.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the MCP Server.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>User-defined unique identifier of the MCP Server within a Project.</p>
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
     *  <p>Determines how AI agents authenticate when connecting to the MCP Server.</p>
     * @return authenticationMode
     */

    public com.commercetools.api.models.mcp_server.McpServerAuthenticationMode getAuthenticationMode() {
        return this.authenticationMode;
    }

    /**
     *  <p>State of the MCP Server. A <code>Disabled</code> MCP Server rejects all AI agent tool requests.</p>
     * @return state
     */

    public com.commercetools.api.models.mcp_server.McpServerState getState() {
        return this.state;
    }

    /**
     *  <p>Configuration of the MCP Server connection.</p>
     * @return mcpServer
     */

    public com.commercetools.api.models.mcp_server.McpServerConfig getMcpServer() {
        return this.mcpServer;
    }

    /**
     * builds McpServer with checking for non-null required values
     * @return McpServer
     */
    public McpServer build() {
        Objects.requireNonNull(id, McpServer.class + ": id is missing");
        Objects.requireNonNull(version, McpServer.class + ": version is missing");
        Objects.requireNonNull(createdAt, McpServer.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, McpServer.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(key, McpServer.class + ": key is missing");
        Objects.requireNonNull(authenticationMode, McpServer.class + ": authenticationMode is missing");
        Objects.requireNonNull(state, McpServer.class + ": state is missing");
        Objects.requireNonNull(mcpServer, McpServer.class + ": mcpServer is missing");
        return new McpServerImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name,
            description, authenticationMode, state, mcpServer);
    }

    /**
     * builds McpServer without checking for non-null required values
     * @return McpServer
     */
    public McpServer buildUnchecked() {
        return new McpServerImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name,
            description, authenticationMode, state, mcpServer);
    }

    /**
     * factory method for an instance of McpServerBuilder
     * @return builder
     */
    public static McpServerBuilder of() {
        return new McpServerBuilder();
    }

    /**
     * create builder for McpServer instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerBuilder of(final McpServer template) {
        McpServerBuilder builder = new McpServerBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.authenticationMode = template.getAuthenticationMode();
        builder.state = template.getState();
        builder.mcpServer = template.getMcpServer();
        return builder;
    }

}
