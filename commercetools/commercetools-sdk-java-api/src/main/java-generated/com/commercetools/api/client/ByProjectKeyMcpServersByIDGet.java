
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
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.mcp_server.McpServer>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .mcpServers()
 *            .withId("{ID}")
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMcpServersByIDGet
        extends TypeApiMethod<ByProjectKeyMcpServersByIDGet, com.commercetools.api.models.mcp_server.McpServer>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyMcpServersByIDGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyMcpServersByIDGet> {

    @Override
    public TypeReference<com.commercetools.api.models.mcp_server.McpServer> resultType() {
        return new TypeReference<com.commercetools.api.models.mcp_server.McpServer>() {
        };
    }

    private String projectKey;
    private String ID;

    public ByProjectKeyMcpServersByIDGet(final ApiHttpClient apiHttpClient, String projectKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyMcpServersByIDGet(ByProjectKeyMcpServersByIDGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/mcp-servers/%s", encodePathParam(this.projectKey),
            encodePathParam(this.ID));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMcpServersByIDGet that = (ByProjectKeyMcpServersByIDGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(ID, that.ID).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).toHashCode();
    }

    @Override
    protected ByProjectKeyMcpServersByIDGet copy() {
        return new ByProjectKeyMcpServersByIDGet(this);
    }
}
