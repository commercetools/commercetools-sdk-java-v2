
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMcpServersRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyMcpServersRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMcpServersGet get() {
        return new ByProjectKeyMcpServersGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyMcpServersPost post(com.commercetools.api.models.mcp_server.McpServerDraft mcpServerDraft) {
        return new ByProjectKeyMcpServersPost(apiHttpClient, projectKey, mcpServerDraft);
    }

    public ByProjectKeyMcpServersPostString post(final String mcpServerDraft) {
        return new ByProjectKeyMcpServersPostString(apiHttpClient, projectKey, mcpServerDraft);
    }

    public ByProjectKeyMcpServersPost post(
            UnaryOperator<com.commercetools.api.models.mcp_server.McpServerDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.mcp_server.McpServerDraftBuilder.of()).build());
    }

    public ByProjectKeyMcpServersTypesRequestBuilder types() {
        return new ByProjectKeyMcpServersTypesRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyMcpServersKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyMcpServersKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyMcpServersByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyMcpServersByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

}
