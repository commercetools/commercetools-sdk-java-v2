
package com.commercetools.api.models.mcp_server;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:McpServerToolOutputFormatting" rel="nofollow">output formatting</a> applied to tool responses.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerSetToolOutputFormattingActionImpl implements McpServerSetToolOutputFormattingAction, ModelBase {

    private String action;

    private com.commercetools.api.models.mcp_server.McpServerToolOutputFormatting toolOutputFormatting;

    /**
     * create instance with all properties
     */
    @JsonCreator
    McpServerSetToolOutputFormattingActionImpl(
            @JsonProperty("toolOutputFormatting") final com.commercetools.api.models.mcp_server.McpServerToolOutputFormatting toolOutputFormatting) {
        this.toolOutputFormatting = toolOutputFormatting;
        this.action = SET_TOOL_OUTPUT_FORMATTING;
    }

    /**
     * create empty instance
     */
    public McpServerSetToolOutputFormattingActionImpl() {
        this.action = SET_TOOL_OUTPUT_FORMATTING;
    }

    /**
     *  <p>Identifies the update action to perform, such as <code>addTool</code>, <code>removeTool</code>, or <code>setTools</code>.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If absent, the existing formatting is removed.</p>
     */

    public com.commercetools.api.models.mcp_server.McpServerToolOutputFormatting getToolOutputFormatting() {
        return this.toolOutputFormatting;
    }

    public void setToolOutputFormatting(
            final com.commercetools.api.models.mcp_server.McpServerToolOutputFormatting toolOutputFormatting) {
        this.toolOutputFormatting = toolOutputFormatting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        McpServerSetToolOutputFormattingActionImpl that = (McpServerSetToolOutputFormattingActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(toolOutputFormatting, that.toolOutputFormatting)
                .append(action, that.action)
                .append(toolOutputFormatting, that.toolOutputFormatting)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(toolOutputFormatting).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("toolOutputFormatting", toolOutputFormatting)
                .build();
    }

    @Override
    public McpServerSetToolOutputFormattingAction copyDeep() {
        return McpServerSetToolOutputFormattingAction.deepCopy(this);
    }
}
