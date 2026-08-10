
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import tools.jackson.core.type.TypeReference;

/**
 *  <p>Creates a new MCP Server for the Project.</p>
 *  <p>Specific Error Codes:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:DuplicateFieldError" rel="nofollow">DuplicateField</a></li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.mcp_server.McpServer>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .mcpServers()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMcpServersPostString
        extends StringBodyApiMethod<ByProjectKeyMcpServersPostString, com.commercetools.api.models.mcp_server.McpServer>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyMcpServersPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.mcp_server.McpServer> resultType() {
        return new TypeReference<com.commercetools.api.models.mcp_server.McpServer>() {
        };
    }

    private String projectKey;

    private String mcpServerDraft;

    public ByProjectKeyMcpServersPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String mcpServerDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.mcpServerDraft = mcpServerDraft;
    }

    public ByProjectKeyMcpServersPostString(ByProjectKeyMcpServersPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.mcpServerDraft = t.mcpServerDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/mcp-servers", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            mcpServerDraft.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.mcp_server.McpServer> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.mcp_server.McpServer.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.mcp_server.McpServer>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.mcp_server.McpServer.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public String getBody() {
        return mcpServerDraft;
    }

    public ByProjectKeyMcpServersPostString withBody(String mcpServerDraft) {
        ByProjectKeyMcpServersPostString t = copy();
        t.mcpServerDraft = mcpServerDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMcpServersPostString that = (ByProjectKeyMcpServersPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(mcpServerDraft, that.mcpServerDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(mcpServerDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyMcpServersPostString copy() {
        return new ByProjectKeyMcpServersPostString(this);
    }
}
