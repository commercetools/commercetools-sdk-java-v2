
package com.commercetools.api.client;

import java.net.URI;
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
 *            .withId("{ID}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMcpServersByIDPost extends
        TypeBodyApiMethod<ByProjectKeyMcpServersByIDPost, com.commercetools.api.models.mcp_server.McpServer, com.commercetools.api.models.mcp_server.McpServerUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyMcpServersByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMcpServersByIDPost> {

    @Override
    public TypeReference<com.commercetools.api.models.mcp_server.McpServer> resultType() {
        return new TypeReference<com.commercetools.api.models.mcp_server.McpServer>() {
        };
    }

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.mcp_server.McpServerUpdate mcpServerUpdate;

    public ByProjectKeyMcpServersByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.mcp_server.McpServerUpdate mcpServerUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.mcpServerUpdate = mcpServerUpdate;
    }

    public ByProjectKeyMcpServersByIDPost(ByProjectKeyMcpServersByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.mcpServerUpdate = t.mcpServerUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/mcp-servers/%s", encodePathParam(this.projectKey),
            encodePathParam(this.ID));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(mcpServerUpdate)));

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

    public String getID() {
        return this.ID;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    public com.commercetools.api.models.mcp_server.McpServerUpdate getBody() {
        return mcpServerUpdate;
    }

    public ByProjectKeyMcpServersByIDPost withBody(
            com.commercetools.api.models.mcp_server.McpServerUpdate mcpServerUpdate) {
        ByProjectKeyMcpServersByIDPost t = copy();
        t.mcpServerUpdate = mcpServerUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMcpServersByIDPost that = (ByProjectKeyMcpServersByIDPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(mcpServerUpdate, that.mcpServerUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(mcpServerUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyMcpServersByIDPost copy() {
        return new ByProjectKeyMcpServersByIDPost(this);
    }
}
