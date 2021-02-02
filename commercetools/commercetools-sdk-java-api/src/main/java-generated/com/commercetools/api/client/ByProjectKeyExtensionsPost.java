
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Currently, a maximum of 25 extensions can be created per project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyExtensionsPost
        extends ApiMethod<ByProjectKeyExtensionsPost, com.commercetools.api.models.extension.Extension>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyExtensionsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyExtensionsPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyExtensionsPost> {

    private String projectKey;

    private com.commercetools.api.models.extension.ExtensionDraft extensionDraft;

    public ByProjectKeyExtensionsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.extension.ExtensionDraft extensionDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.extensionDraft = extensionDraft;
    }

    public ByProjectKeyExtensionsPost(ByProjectKeyExtensionsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.extensionDraft = t.extensionDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/extensions", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(extensionDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.extension.Extension> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.extension.Extension>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.extension.Extension.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public ByProjectKeyExtensionsPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyExtensionsPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyExtensionsPost copy() {
        return new ByProjectKeyExtensionsPost(this);
    }
}
