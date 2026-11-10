
package com.commercetools.api.models.mcp_server;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerSetAuthenticationModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerSetAuthenticationModeAction mcpServerSetAuthenticationModeAction = McpServerSetAuthenticationModeAction.builder()
 *             .authenticationMode(McpServerAuthenticationMode.CLIENT_CREDENTIALS)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerSetAuthenticationModeActionBuilder implements Builder<McpServerSetAuthenticationModeAction> {

    private com.commercetools.api.models.mcp_server.McpServerAuthenticationMode authenticationMode;

    /**
     *  <p>New authentication mode to set.</p>
     * @param authenticationMode value to be set
     * @return Builder
     */

    public McpServerSetAuthenticationModeActionBuilder authenticationMode(
            final com.commercetools.api.models.mcp_server.McpServerAuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
        return this;
    }

    /**
     *  <p>New authentication mode to set.</p>
     * @return authenticationMode
     */

    public com.commercetools.api.models.mcp_server.McpServerAuthenticationMode getAuthenticationMode() {
        return this.authenticationMode;
    }

    /**
     * builds McpServerSetAuthenticationModeAction with checking for non-null required values
     * @return McpServerSetAuthenticationModeAction
     */
    public McpServerSetAuthenticationModeAction build() {
        Objects.requireNonNull(authenticationMode,
            McpServerSetAuthenticationModeAction.class + ": authenticationMode is missing");
        return new McpServerSetAuthenticationModeActionImpl(authenticationMode);
    }

    /**
     * builds McpServerSetAuthenticationModeAction without checking for non-null required values
     * @return McpServerSetAuthenticationModeAction
     */
    public McpServerSetAuthenticationModeAction buildUnchecked() {
        return new McpServerSetAuthenticationModeActionImpl(authenticationMode);
    }

    /**
     * factory method for an instance of McpServerSetAuthenticationModeActionBuilder
     * @return builder
     */
    public static McpServerSetAuthenticationModeActionBuilder of() {
        return new McpServerSetAuthenticationModeActionBuilder();
    }

    /**
     * create builder for McpServerSetAuthenticationModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerSetAuthenticationModeActionBuilder of(final McpServerSetAuthenticationModeAction template) {
        McpServerSetAuthenticationModeActionBuilder builder = new McpServerSetAuthenticationModeActionBuilder();
        builder.authenticationMode = template.getAuthenticationMode();
        return builder;
    }

}
