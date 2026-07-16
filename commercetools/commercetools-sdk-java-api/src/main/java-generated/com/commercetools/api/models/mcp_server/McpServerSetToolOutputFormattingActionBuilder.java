
package com.commercetools.api.models.mcp_server;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerSetToolOutputFormattingActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerSetToolOutputFormattingAction mcpServerSetToolOutputFormattingAction = McpServerSetToolOutputFormattingAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerSetToolOutputFormattingActionBuilder implements Builder<McpServerSetToolOutputFormattingAction> {

    @Nullable
    private com.commercetools.api.models.mcp_server.McpServerToolOutputFormatting toolOutputFormatting;

    /**
     *  <p>Value to set. If absent, the existing formatting is removed.</p>
     * @param toolOutputFormatting value to be set
     * @return Builder
     */

    public McpServerSetToolOutputFormattingActionBuilder toolOutputFormatting(
            @Nullable final com.commercetools.api.models.mcp_server.McpServerToolOutputFormatting toolOutputFormatting) {
        this.toolOutputFormatting = toolOutputFormatting;
        return this;
    }

    /**
     *  <p>Value to set. If absent, the existing formatting is removed.</p>
     * @return toolOutputFormatting
     */

    @Nullable
    public com.commercetools.api.models.mcp_server.McpServerToolOutputFormatting getToolOutputFormatting() {
        return this.toolOutputFormatting;
    }

    /**
     * builds McpServerSetToolOutputFormattingAction with checking for non-null required values
     * @return McpServerSetToolOutputFormattingAction
     */
    public McpServerSetToolOutputFormattingAction build() {
        return new McpServerSetToolOutputFormattingActionImpl(toolOutputFormatting);
    }

    /**
     * builds McpServerSetToolOutputFormattingAction without checking for non-null required values
     * @return McpServerSetToolOutputFormattingAction
     */
    public McpServerSetToolOutputFormattingAction buildUnchecked() {
        return new McpServerSetToolOutputFormattingActionImpl(toolOutputFormatting);
    }

    /**
     * factory method for an instance of McpServerSetToolOutputFormattingActionBuilder
     * @return builder
     */
    public static McpServerSetToolOutputFormattingActionBuilder of() {
        return new McpServerSetToolOutputFormattingActionBuilder();
    }

    /**
     * create builder for McpServerSetToolOutputFormattingAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerSetToolOutputFormattingActionBuilder of(
            final McpServerSetToolOutputFormattingAction template) {
        McpServerSetToolOutputFormattingActionBuilder builder = new McpServerSetToolOutputFormattingActionBuilder();
        builder.toolOutputFormatting = template.getToolOutputFormatting();
        return builder;
    }

}
