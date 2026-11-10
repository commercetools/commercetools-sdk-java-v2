
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMcpServersKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyMcpServersKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyMcpServersKeyByKeyGet get() {
        return new ByProjectKeyMcpServersKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyMcpServersKeyByKeyPost post(
            com.commercetools.api.models.mcp_server.McpServerUpdate mcpServerUpdate) {
        return new ByProjectKeyMcpServersKeyByKeyPost(apiHttpClient, projectKey, key, mcpServerUpdate);
    }

    public ByProjectKeyMcpServersKeyByKeyPostString post(final String mcpServerUpdate) {
        return new ByProjectKeyMcpServersKeyByKeyPostString(apiHttpClient, projectKey, key, mcpServerUpdate);
    }

    public ByProjectKeyMcpServersKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.mcp_server.McpServerUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.mcp_server.McpServerUpdateBuilder.of()).build());
    }

    public ByProjectKeyMcpServersKeyByKeyDelete delete() {
        return new ByProjectKeyMcpServersKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyMcpServersKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
