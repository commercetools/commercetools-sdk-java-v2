
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyImportOperationsByIdRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String id;

    public ByProjectKeyImportOperationsByIdRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String id) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.id = id;
    }

    public ByProjectKeyImportOperationsByIdGet get() {
        return new ByProjectKeyImportOperationsByIdGet(apiHttpClient, projectKey, id);
    }

}
