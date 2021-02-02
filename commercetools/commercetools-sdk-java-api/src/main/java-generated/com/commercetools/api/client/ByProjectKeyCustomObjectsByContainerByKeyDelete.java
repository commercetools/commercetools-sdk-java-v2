
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
*  <p>Delete CustomObject by container and key</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomObjectsByContainerByKeyDelete extends
        ApiMethod<ByProjectKeyCustomObjectsByContainerByKeyDelete, com.commercetools.api.models.custom_object.CustomObject>
        implements com.commercetools.api.client.DataerasureTrait<ByProjectKeyCustomObjectsByContainerByKeyDelete>,
        com.commercetools.api.client.VersionedTrait<ByProjectKeyCustomObjectsByContainerByKeyDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyCustomObjectsByContainerByKeyDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomObjectsByContainerByKeyDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomObjectsByContainerByKeyDelete>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyCustomObjectsByContainerByKeyDelete> {

    private String projectKey;
    private String container;
    private String key;

    public ByProjectKeyCustomObjectsByContainerByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey,
            String container, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.container = container;
        this.key = key;
    }

    public ByProjectKeyCustomObjectsByContainerByKeyDelete(ByProjectKeyCustomObjectsByContainerByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.container = t.container;
        this.key = t.key;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/custom-objects/%s/%s", this.projectKey, this.container, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObject> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObject>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.custom_object.CustomObject.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getContainer() {
        return this.container;
    }

    public String getKey() {
        return this.key;
    }

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }

    public List<String> getDataErasure() {
        return this.getQueryParam("dataErasure");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setContainer(final String container) {
        this.container = container;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public ByProjectKeyCustomObjectsByContainerByKeyDelete withVersion(final Long version) {
        return copy().withQueryParam("version", version);
    }

    public ByProjectKeyCustomObjectsByContainerByKeyDelete addVersion(final Long version) {
        return copy().addQueryParam("version", version);
    }

    public ByProjectKeyCustomObjectsByContainerByKeyDelete withDataErasure(final Boolean dataErasure) {
        return copy().withQueryParam("dataErasure", dataErasure);
    }

    public ByProjectKeyCustomObjectsByContainerByKeyDelete addDataErasure(final Boolean dataErasure) {
        return copy().addQueryParam("dataErasure", dataErasure);
    }

    public ByProjectKeyCustomObjectsByContainerByKeyDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyCustomObjectsByContainerByKeyDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyCustomObjectsByContainerByKeyDelete copy() {
        return new ByProjectKeyCustomObjectsByContainerByKeyDelete(this);
    }
}
