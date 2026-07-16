
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
 *  <p>Connection configuration for creating or updating an MCP Server. The <code>type</code> discriminator determines the concrete configuration shape and the set of tools available for this MCP Server. Only <a href="https://docs.commercetools.com/apis/ctp:api:type:CommerceMcpServerConfigDraft" rel="nofollow">CommerceMcpServerConfigDraft</a> is supported.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerConfigDraft mcpServerConfigDraft = McpServerConfigDraft.commerceMcpBuilder()
 *             majorVersion("{majorVersion}")
 *             plusTools(toolsBuilder -> toolsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = McpServerConfigDraftImpl.class, visible = true)
@JsonDeserialize(as = McpServerConfigDraftImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface McpServerConfigDraft {

    /**
     *  <p>MCP Server type. Determines the shape of the configuration and the set of tools available for this MCP Server.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public McpServerConfigDraft copyDeep();

    /**
     * factory method to create a deep copy of McpServerConfigDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerConfigDraft deepCopy(@Nullable final McpServerConfigDraft template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof McpServerConfigDraftImpl)) {
            return template.copyDeep();
        }
        McpServerConfigDraftImpl instance = new McpServerConfigDraftImpl();
        return instance;
    }

    /**
     * builder for commerceMcp subtype
     * @return builder
     */
    public static com.commercetools.api.models.mcp_server.CommerceMcpServerConfigDraftBuilder commerceMcpBuilder() {
        return com.commercetools.api.models.mcp_server.CommerceMcpServerConfigDraftBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerConfigDraft(Function<McpServerConfigDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerConfigDraft> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerConfigDraft>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerConfigDraft>";
            }
        };
    }
}
