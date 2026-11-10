
package com.commercetools.api.models.mcp_server;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Describes a single tool available for an MCP Server type and major version.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerTypeTool mcpServerTypeTool = McpServerTypeTool.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = McpServerTypeToolImpl.class)
public interface McpServerTypeTool {

    /**
     *  <p>Identifier of the tool, such as <code>read_products</code> or <code>create_orders</code>. Matches a value of <a href="https://docs.commercetools.com/apis/ctp:api:type:McpServerTool" rel="nofollow">McpServerTool</a>.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Human-readable description of what the tool does. Omitted when no description is available.</p>
     * @return description
     */

    @JsonProperty("description")
    public String getDescription();

    /**
     *  <p>Whether the tool reads (<code>read</code>) or modifies (<code>write</code>) data.</p>
     * @return operationType
     */

    @JsonProperty("operationType")
    public String getOperationType();

    /**
     *  <p>Group identifiers the tool belongs to, such as <code>all</code> or <code>read_all</code>. Empty when the tool belongs to no group.</p>
     * @return groups
     */

    @JsonProperty("groups")
    public List<String> getGroups();

    /**
     *  <p>Identifier of the tool, such as <code>read_products</code> or <code>create_orders</code>. Matches a value of <a href="https://docs.commercetools.com/apis/ctp:api:type:McpServerTool" rel="nofollow">McpServerTool</a>.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Human-readable description of what the tool does. Omitted when no description is available.</p>
     * @param description value to be set
     */

    public void setDescription(final String description);

    /**
     *  <p>Whether the tool reads (<code>read</code>) or modifies (<code>write</code>) data.</p>
     * @param operationType value to be set
     */

    public void setOperationType(final String operationType);

    /**
     *  <p>Group identifiers the tool belongs to, such as <code>all</code> or <code>read_all</code>. Empty when the tool belongs to no group.</p>
     * @param groups values to be set
     */

    @JsonIgnore
    public void setGroups(final String... groups);

    /**
     *  <p>Group identifiers the tool belongs to, such as <code>all</code> or <code>read_all</code>. Empty when the tool belongs to no group.</p>
     * @param groups values to be set
     */

    public void setGroups(final List<String> groups);

    /**
     * factory method
     * @return instance of McpServerTypeTool
     */
    public static McpServerTypeTool of() {
        return new McpServerTypeToolImpl();
    }

    /**
     * factory method to create a shallow copy McpServerTypeTool
     * @param template instance to be copied
     * @return copy instance
     */
    public static McpServerTypeTool of(final McpServerTypeTool template) {
        McpServerTypeToolImpl instance = new McpServerTypeToolImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setOperationType(template.getOperationType());
        instance.setGroups(template.getGroups());
        return instance;
    }

    public McpServerTypeTool copyDeep();

    /**
     * factory method to create a deep copy of McpServerTypeTool
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerTypeTool deepCopy(@Nullable final McpServerTypeTool template) {
        if (template == null) {
            return null;
        }
        McpServerTypeToolImpl instance = new McpServerTypeToolImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setOperationType(template.getOperationType());
        instance.setGroups(Optional.ofNullable(template.getGroups()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for McpServerTypeTool
     * @return builder
     */
    public static McpServerTypeToolBuilder builder() {
        return McpServerTypeToolBuilder.of();
    }

    /**
     * create builder for McpServerTypeTool instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerTypeToolBuilder builder(final McpServerTypeTool template) {
        return McpServerTypeToolBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerTypeTool(Function<McpServerTypeTool, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerTypeTool> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerTypeTool>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerTypeTool>";
            }
        };
    }
}
