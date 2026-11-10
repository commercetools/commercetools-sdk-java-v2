
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
 *  <p>Base type for MCP Server update actions. The <code>action</code> discriminator identifies the concrete update action to perform.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerUpdateAction mcpServerUpdateAction = McpServerUpdateAction.addToolBuilder()
 *             tool(McpServerTool.ALL)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = McpServerUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = McpServerUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface McpServerUpdateAction {

    /**
     *  <p>Identifies the update action to perform, such as <code>addTool</code>, <code>removeTool</code>, or <code>setTools</code>.</p>
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public McpServerUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of McpServerUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerUpdateAction deepCopy(@Nullable final McpServerUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof McpServerUpdateActionImpl)) {
            return template.copyDeep();
        }
        McpServerUpdateActionImpl instance = new McpServerUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addTool subtype
     * @return builder
     */
    public static com.commercetools.api.models.mcp_server.McpServerAddToolActionBuilder addToolBuilder() {
        return com.commercetools.api.models.mcp_server.McpServerAddToolActionBuilder.of();
    }

    /**
     * builder for addToolCustomization subtype
     * @return builder
     */
    public static com.commercetools.api.models.mcp_server.McpServerAddToolCustomizationActionBuilder addToolCustomizationBuilder() {
        return com.commercetools.api.models.mcp_server.McpServerAddToolCustomizationActionBuilder.of();
    }

    /**
     * builder for removeTool subtype
     * @return builder
     */
    public static com.commercetools.api.models.mcp_server.McpServerRemoveToolActionBuilder removeToolBuilder() {
        return com.commercetools.api.models.mcp_server.McpServerRemoveToolActionBuilder.of();
    }

    /**
     * builder for removeToolCustomization subtype
     * @return builder
     */
    public static com.commercetools.api.models.mcp_server.McpServerRemoveToolCustomizationActionBuilder removeToolCustomizationBuilder() {
        return com.commercetools.api.models.mcp_server.McpServerRemoveToolCustomizationActionBuilder.of();
    }

    /**
     * builder for setAuthenticationMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.mcp_server.McpServerSetAuthenticationModeActionBuilder setAuthenticationModeBuilder() {
        return com.commercetools.api.models.mcp_server.McpServerSetAuthenticationModeActionBuilder.of();
    }

    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.mcp_server.McpServerSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.mcp_server.McpServerSetDescriptionActionBuilder.of();
    }

    /**
     * builder for setJsonOutputFiltering subtype
     * @return builder
     */
    public static com.commercetools.api.models.mcp_server.McpServerSetJsonOutputFilteringActionBuilder setJsonOutputFilteringBuilder() {
        return com.commercetools.api.models.mcp_server.McpServerSetJsonOutputFilteringActionBuilder.of();
    }

    /**
     * builder for setName subtype
     * @return builder
     */
    public static com.commercetools.api.models.mcp_server.McpServerSetNameActionBuilder setNameBuilder() {
        return com.commercetools.api.models.mcp_server.McpServerSetNameActionBuilder.of();
    }

    /**
     * builder for setState subtype
     * @return builder
     */
    public static com.commercetools.api.models.mcp_server.McpServerSetStateActionBuilder setStateBuilder() {
        return com.commercetools.api.models.mcp_server.McpServerSetStateActionBuilder.of();
    }

    /**
     * builder for setToolCustomizations subtype
     * @return builder
     */
    public static com.commercetools.api.models.mcp_server.McpServerSetToolCustomizationsActionBuilder setToolCustomizationsBuilder() {
        return com.commercetools.api.models.mcp_server.McpServerSetToolCustomizationsActionBuilder.of();
    }

    /**
     * builder for setToolOutputFormatting subtype
     * @return builder
     */
    public static com.commercetools.api.models.mcp_server.McpServerSetToolOutputFormattingActionBuilder setToolOutputFormattingBuilder() {
        return com.commercetools.api.models.mcp_server.McpServerSetToolOutputFormattingActionBuilder.of();
    }

    /**
     * builder for setTools subtype
     * @return builder
     */
    public static com.commercetools.api.models.mcp_server.McpServerSetToolsActionBuilder setToolsBuilder() {
        return com.commercetools.api.models.mcp_server.McpServerSetToolsActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerUpdateAction(Function<McpServerUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerUpdateAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerUpdateAction>";
            }
        };
    }
}
