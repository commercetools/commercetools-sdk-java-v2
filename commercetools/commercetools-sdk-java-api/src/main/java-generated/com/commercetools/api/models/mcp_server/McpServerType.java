
package com.commercetools.api.models.mcp_server;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Describes an MCP Server type and one of its major versions, including the catalog of tools available for it. Use this catalog to discover which tools you can enable on a <a href="https://docs.commercetools.com/apis/ctp:api:type:McpServer" rel="nofollow">McpServer</a> of this type.</p>
 *
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
@JsonDeserialize(as = McpServerTypeImpl.class)
public interface McpServerType {

    /**
     *  <p>Identifier of the MCP Server type, such as <code>CommerceMCP</code>.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Major version of the MCP Server type, such as <code>v4</code>.</p>
     * @return majorVersion
     */
    @NotNull
    @JsonProperty("majorVersion")
    public String getMajorVersion();

    /**
     *  <p>Tools available for this MCP Server type and major version.</p>
     * @return tools
     */
    @NotNull
    @Valid
    @JsonProperty("tools")
    public List<McpServerTypeTool> getTools();

    /**
     *  <p>Identifier of the MCP Server type, such as <code>CommerceMCP</code>.</p>
     * @param type value to be set
     */

    public void setType(final String type);

    /**
     *  <p>Major version of the MCP Server type, such as <code>v4</code>.</p>
     * @param majorVersion value to be set
     */

    public void setMajorVersion(final String majorVersion);

    /**
     *  <p>Tools available for this MCP Server type and major version.</p>
     * @param tools values to be set
     */

    @JsonIgnore
    public void setTools(final McpServerTypeTool... tools);

    /**
     *  <p>Tools available for this MCP Server type and major version.</p>
     * @param tools values to be set
     */

    public void setTools(final List<McpServerTypeTool> tools);

    /**
     * factory method
     * @return instance of McpServerType
     */
    public static McpServerType of() {
        return new McpServerTypeImpl();
    }

    /**
     * factory method to create a shallow copy McpServerType
     * @param template instance to be copied
     * @return copy instance
     */
    public static McpServerType of(final McpServerType template) {
        McpServerTypeImpl instance = new McpServerTypeImpl();
        instance.setType(template.getType());
        instance.setMajorVersion(template.getMajorVersion());
        instance.setTools(template.getTools());
        return instance;
    }

    public McpServerType copyDeep();

    /**
     * factory method to create a deep copy of McpServerType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerType deepCopy(@Nullable final McpServerType template) {
        if (template == null) {
            return null;
        }
        McpServerTypeImpl instance = new McpServerTypeImpl();
        instance.setType(template.getType());
        instance.setMajorVersion(template.getMajorVersion());
        instance.setTools(Optional.ofNullable(template.getTools())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.mcp_server.McpServerTypeTool::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for McpServerType
     * @return builder
     */
    public static McpServerTypeBuilder builder() {
        return McpServerTypeBuilder.of();
    }

    /**
     * create builder for McpServerType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerTypeBuilder builder(final McpServerType template) {
        return McpServerTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerType(Function<McpServerType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerType> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerType>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerType>";
            }
        };
    }
}
