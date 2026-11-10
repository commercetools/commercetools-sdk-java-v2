
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMcpServersTypesByMcpServerTypeRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String mcpServerType;

    public ByProjectKeyMcpServersTypesByMcpServerTypeRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String mcpServerType) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.mcpServerType = mcpServerType;
    }

    public ByProjectKeyMcpServersTypesByMcpServerTypeGet get() {
        return new ByProjectKeyMcpServersTypesByMcpServerTypeGet(apiHttpClient, projectKey, mcpServerType);
    }

}
