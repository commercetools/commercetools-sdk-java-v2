
package com.commercetools.api.models.mcp_server;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerType mcpServerType = McpServerType.builder()
 *             .type("{type}")
 *             .majorVersion("{majorVersion}")
 *             .plusTools(toolsBuilder -> toolsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerTypeBuilder implements Builder<McpServerType> {

    private String type;

    private String majorVersion;

    private java.util.List<com.commercetools.api.models.mcp_server.McpServerTypeTool> tools;

    /**
     *  <p>Identifier of the MCP Server type, such as <code>CommerceMCP</code>.</p>
     * @param type value to be set
     * @return Builder
     */

    public McpServerTypeBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Major version of the MCP Server type, such as <code>v4</code>.</p>
     * @param majorVersion value to be set
     * @return Builder
     */

    public McpServerTypeBuilder majorVersion(final String majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }

    /**
     *  <p>Tools available for this MCP Server type and major version.</p>
     * @param tools value to be set
     * @return Builder
     */

    public McpServerTypeBuilder tools(final com.commercetools.api.models.mcp_server.McpServerTypeTool... tools) {
        this.tools = new ArrayList<>(Arrays.asList(tools));
        return this;
    }

    /**
     *  <p>Tools available for this MCP Server type and major version.</p>
     * @param tools value to be set
     * @return Builder
     */

    public McpServerTypeBuilder tools(
            final java.util.List<com.commercetools.api.models.mcp_server.McpServerTypeTool> tools) {
        this.tools = tools;
        return this;
    }

    /**
     *  <p>Tools available for this MCP Server type and major version.</p>
     * @param tools value to be set
     * @return Builder
     */

    public McpServerTypeBuilder plusTools(final com.commercetools.api.models.mcp_server.McpServerTypeTool... tools) {
        if (this.tools == null) {
            this.tools = new ArrayList<>();
        }
        this.tools.addAll(Arrays.asList(tools));
        return this;
    }

    /**
     *  <p>Tools available for this MCP Server type and major version.</p>
     * @param builder function to build the tools value
     * @return Builder
     */

    public McpServerTypeBuilder plusTools(
            Function<com.commercetools.api.models.mcp_server.McpServerTypeToolBuilder, com.commercetools.api.models.mcp_server.McpServerTypeToolBuilder> builder) {
        if (this.tools == null) {
            this.tools = new ArrayList<>();
        }
        this.tools.add(builder.apply(com.commercetools.api.models.mcp_server.McpServerTypeToolBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Tools available for this MCP Server type and major version.</p>
     * @param builder function to build the tools value
     * @return Builder
     */

    public McpServerTypeBuilder withTools(
            Function<com.commercetools.api.models.mcp_server.McpServerTypeToolBuilder, com.commercetools.api.models.mcp_server.McpServerTypeToolBuilder> builder) {
        this.tools = new ArrayList<>();
        this.tools.add(builder.apply(com.commercetools.api.models.mcp_server.McpServerTypeToolBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Tools available for this MCP Server type and major version.</p>
     * @param builder function to build the tools value
     * @return Builder
     */

    public McpServerTypeBuilder addTools(
            Function<com.commercetools.api.models.mcp_server.McpServerTypeToolBuilder, com.commercetools.api.models.mcp_server.McpServerTypeTool> builder) {
        return plusTools(builder.apply(com.commercetools.api.models.mcp_server.McpServerTypeToolBuilder.of()));
    }

    /**
     *  <p>Tools available for this MCP Server type and major version.</p>
     * @param builder function to build the tools value
     * @return Builder
     */

    public McpServerTypeBuilder setTools(
            Function<com.commercetools.api.models.mcp_server.McpServerTypeToolBuilder, com.commercetools.api.models.mcp_server.McpServerTypeTool> builder) {
        return tools(builder.apply(com.commercetools.api.models.mcp_server.McpServerTypeToolBuilder.of()));
    }

    /**
     *  <p>Identifier of the MCP Server type, such as <code>CommerceMCP</code>.</p>
     * @return type
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Major version of the MCP Server type, such as <code>v4</code>.</p>
     * @return majorVersion
     */

    public String getMajorVersion() {
        return this.majorVersion;
    }

    /**
     *  <p>Tools available for this MCP Server type and major version.</p>
     * @return tools
     */

    public java.util.List<com.commercetools.api.models.mcp_server.McpServerTypeTool> getTools() {
        return this.tools;
    }

    /**
     * builds McpServerType with checking for non-null required values
     * @return McpServerType
     */
    public McpServerType build() {
        Objects.requireNonNull(type, McpServerType.class + ": type is missing");
        Objects.requireNonNull(majorVersion, McpServerType.class + ": majorVersion is missing");
        Objects.requireNonNull(tools, McpServerType.class + ": tools is missing");
        return new McpServerTypeImpl(type, majorVersion, tools);
    }

    /**
     * builds McpServerType without checking for non-null required values
     * @return McpServerType
     */
    public McpServerType buildUnchecked() {
        return new McpServerTypeImpl(type, majorVersion, tools);
    }

    /**
     * factory method for an instance of McpServerTypeBuilder
     * @return builder
     */
    public static McpServerTypeBuilder of() {
        return new McpServerTypeBuilder();
    }

    /**
     * create builder for McpServerType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerTypeBuilder of(final McpServerType template) {
        McpServerTypeBuilder builder = new McpServerTypeBuilder();
        builder.type = template.getType();
        builder.majorVersion = template.getMajorVersion();
        builder.tools = template.getTools();
        return builder;
    }

}
