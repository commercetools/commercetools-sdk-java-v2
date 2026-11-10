
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
 *  <p>Update payload for an MCP Server. Specifies the expected version and the update actions to apply.</p>
 *
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
@JsonDeserialize(as = McpServerUpdateImpl.class)
public interface McpServerUpdate {

    /**
     *  <p>Expected version of the MCP Server on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error is returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the MCP Server.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<McpServerUpdateAction> getActions();

    /**
     *  <p>Expected version of the MCP Server on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error is returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the MCP Server.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final McpServerUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the MCP Server.</p>
     * @param actions values to be set
     */

    public void setActions(final List<McpServerUpdateAction> actions);

    /**
     * factory method
     * @return instance of McpServerUpdate
     */
    public static McpServerUpdate of() {
        return new McpServerUpdateImpl();
    }

    /**
     * factory method to create a shallow copy McpServerUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static McpServerUpdate of(final McpServerUpdate template) {
        McpServerUpdateImpl instance = new McpServerUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public McpServerUpdate copyDeep();

    /**
     * factory method to create a deep copy of McpServerUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerUpdate deepCopy(@Nullable final McpServerUpdate template) {
        if (template == null) {
            return null;
        }
        McpServerUpdateImpl instance = new McpServerUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.mcp_server.McpServerUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for McpServerUpdate
     * @return builder
     */
    public static McpServerUpdateBuilder builder() {
        return McpServerUpdateBuilder.of();
    }

    /**
     * create builder for McpServerUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerUpdateBuilder builder(final McpServerUpdate template) {
        return McpServerUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerUpdate(Function<McpServerUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerUpdate> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerUpdate>";
            }
        };
    }
}
