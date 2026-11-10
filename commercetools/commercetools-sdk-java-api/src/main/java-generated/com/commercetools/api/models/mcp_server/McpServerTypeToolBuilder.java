
package com.commercetools.api.models.mcp_server;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerTypeToolBuilder
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
public class McpServerTypeToolBuilder implements Builder<McpServerTypeTool> {

    private String name;

    @Nullable
    private String description;

    @Nullable
    private String operationType;

    @Nullable
    private java.util.List<String> groups;

    /**
     *  <p>Identifier of the tool, such as <code>read_products</code> or <code>create_orders</code>. Matches a value of <a href="https://docs.commercetools.com/apis/ctp:api:type:McpServerTool" rel="nofollow">McpServerTool</a>.</p>
     * @param name value to be set
     * @return Builder
     */

    public McpServerTypeToolBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Human-readable description of what the tool does. Omitted when no description is available.</p>
     * @param description value to be set
     * @return Builder
     */

    public McpServerTypeToolBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Whether the tool reads (<code>read</code>) or modifies (<code>write</code>) data.</p>
     * @param operationType value to be set
     * @return Builder
     */

    public McpServerTypeToolBuilder operationType(@Nullable final String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     *  <p>Group identifiers the tool belongs to, such as <code>all</code> or <code>read_all</code>. Empty when the tool belongs to no group.</p>
     * @param groups value to be set
     * @return Builder
     */

    public McpServerTypeToolBuilder groups(@Nullable final String... groups) {
        this.groups = new ArrayList<>(Arrays.asList(groups));
        return this;
    }

    /**
     *  <p>Group identifiers the tool belongs to, such as <code>all</code> or <code>read_all</code>. Empty when the tool belongs to no group.</p>
     * @param groups value to be set
     * @return Builder
     */

    public McpServerTypeToolBuilder groups(@Nullable final java.util.List<String> groups) {
        this.groups = groups;
        return this;
    }

    /**
     *  <p>Group identifiers the tool belongs to, such as <code>all</code> or <code>read_all</code>. Empty when the tool belongs to no group.</p>
     * @param groups value to be set
     * @return Builder
     */

    public McpServerTypeToolBuilder plusGroups(@Nullable final String... groups) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.addAll(Arrays.asList(groups));
        return this;
    }

    /**
     *  <p>Identifier of the tool, such as <code>read_products</code> or <code>create_orders</code>. Matches a value of <a href="https://docs.commercetools.com/apis/ctp:api:type:McpServerTool" rel="nofollow">McpServerTool</a>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Human-readable description of what the tool does. Omitted when no description is available.</p>
     * @return description
     */

    @Nullable
    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>Whether the tool reads (<code>read</code>) or modifies (<code>write</code>) data.</p>
     * @return operationType
     */

    @Nullable
    public String getOperationType() {
        return this.operationType;
    }

    /**
     *  <p>Group identifiers the tool belongs to, such as <code>all</code> or <code>read_all</code>. Empty when the tool belongs to no group.</p>
     * @return groups
     */

    @Nullable
    public java.util.List<String> getGroups() {
        return this.groups;
    }

    /**
     * builds McpServerTypeTool with checking for non-null required values
     * @return McpServerTypeTool
     */
    public McpServerTypeTool build() {
        Objects.requireNonNull(name, McpServerTypeTool.class + ": name is missing");
        return new McpServerTypeToolImpl(name, description, operationType, groups);
    }

    /**
     * builds McpServerTypeTool without checking for non-null required values
     * @return McpServerTypeTool
     */
    public McpServerTypeTool buildUnchecked() {
        return new McpServerTypeToolImpl(name, description, operationType, groups);
    }

    /**
     * factory method for an instance of McpServerTypeToolBuilder
     * @return builder
     */
    public static McpServerTypeToolBuilder of() {
        return new McpServerTypeToolBuilder();
    }

    /**
     * create builder for McpServerTypeTool instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerTypeToolBuilder of(final McpServerTypeTool template) {
        McpServerTypeToolBuilder builder = new McpServerTypeToolBuilder();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.operationType = template.getOperationType();
        builder.groups = template.getGroups();
        return builder;
    }

}
