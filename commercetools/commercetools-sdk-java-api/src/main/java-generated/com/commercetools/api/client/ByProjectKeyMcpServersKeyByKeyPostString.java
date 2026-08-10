
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
 *  <p>Specific Error Codes:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a></li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.mcp_server.McpServer>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .mcpServers()
 *            .withKey("{key}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMcpServersKeyByKeyPostString extends
        StringBodyApiMethod<ByProjectKeyMcpServersKeyByKeyPostString, com.commercetools.api.models.mcp_server.McpServer>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyMcpServersKeyByKeyPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMcpServersKeyByKeyPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.mcp_server.McpServer> resultType() {
        return new TypeReference<com.commercetools.api.models.mcp_server.McpServer>() {
        };
    }

    private String projectKey;
    private String key;

    private String mcpServerUpdate;

    public ByProjectKeyMcpServersKeyByKeyPostString(final ApiHttpClient apiHttpClient, String projectKey, String key,
            String mcpServerUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.mcpServerUpdate = mcpServerUpdate;
    }

    public ByProjectKeyMcpServersKeyByKeyPostString(ByProjectKeyMcpServersKeyByKeyPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.mcpServerUpdate = t.mcpServerUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/mcp-servers/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            mcpServerUpdate.getBytes(StandardCharsets.UTF_8));

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

    public String getKey() {
        return this.key;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getBody() {
        return mcpServerUpdate;
    }

    public ByProjectKeyMcpServersKeyByKeyPostString withBody(String mcpServerUpdate) {
        ByProjectKeyMcpServersKeyByKeyPostString t = copy();
        t.mcpServerUpdate = mcpServerUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMcpServersKeyByKeyPostString that = (ByProjectKeyMcpServersKeyByKeyPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(mcpServerUpdate, that.mcpServerUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(mcpServerUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyMcpServersKeyByKeyPostString copy() {
        return new ByProjectKeyMcpServersKeyByKeyPostString(this);
    }
}
