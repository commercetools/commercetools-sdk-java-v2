
package com.commercetools.api.models.mcp_server;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerSetStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerSetStateAction mcpServerSetStateAction = McpServerSetStateAction.builder()
 *             .state(McpServerState.ENABLED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerSetStateActionBuilder implements Builder<McpServerSetStateAction> {

    private com.commercetools.api.models.mcp_server.McpServerState state;

    /**
     *  <p>New state to set.</p>
     * @param state value to be set
     * @return Builder
     */

    public McpServerSetStateActionBuilder state(final com.commercetools.api.models.mcp_server.McpServerState state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>New state to set.</p>
     * @return state
     */

    public com.commercetools.api.models.mcp_server.McpServerState getState() {
        return this.state;
    }

    /**
     * builds McpServerSetStateAction with checking for non-null required values
     * @return McpServerSetStateAction
     */
    public McpServerSetStateAction build() {
        Objects.requireNonNull(state, McpServerSetStateAction.class + ": state is missing");
        return new McpServerSetStateActionImpl(state);
    }

    /**
     * builds McpServerSetStateAction without checking for non-null required values
     * @return McpServerSetStateAction
     */
    public McpServerSetStateAction buildUnchecked() {
        return new McpServerSetStateActionImpl(state);
    }

    /**
     * factory method for an instance of McpServerSetStateActionBuilder
     * @return builder
     */
    public static McpServerSetStateActionBuilder of() {
        return new McpServerSetStateActionBuilder();
    }

    /**
     * create builder for McpServerSetStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerSetStateActionBuilder of(final McpServerSetStateAction template) {
        McpServerSetStateActionBuilder builder = new McpServerSetStateActionBuilder();
        builder.state = template.getState();
        return builder;
    }

}
