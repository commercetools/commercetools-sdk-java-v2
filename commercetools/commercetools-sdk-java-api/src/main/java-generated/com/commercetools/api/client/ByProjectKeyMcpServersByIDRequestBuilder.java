
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMcpServersByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyMcpServersByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyMcpServersByIDGet get() {
        return new ByProjectKeyMcpServersByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyMcpServersByIDPost post(
            com.commercetools.api.models.mcp_server.McpServerUpdate mcpServerUpdate) {
        return new ByProjectKeyMcpServersByIDPost(apiHttpClient, projectKey, ID, mcpServerUpdate);
    }

    public ByProjectKeyMcpServersByIDPostString post(final String mcpServerUpdate) {
        return new ByProjectKeyMcpServersByIDPostString(apiHttpClient, projectKey, ID, mcpServerUpdate);
    }

    public ByProjectKeyMcpServersByIDPost post(
            UnaryOperator<com.commercetools.api.models.mcp_server.McpServerUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.mcp_server.McpServerUpdateBuilder.of()).build());
    }

    public ByProjectKeyMcpServersByIDDelete delete() {
        return new ByProjectKeyMcpServersByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyMcpServersByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
