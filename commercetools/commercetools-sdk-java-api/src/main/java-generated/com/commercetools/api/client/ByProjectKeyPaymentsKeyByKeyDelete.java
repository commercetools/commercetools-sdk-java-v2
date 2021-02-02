
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
*  <p>Delete Payment by key</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyPaymentsKeyByKeyDelete
        extends ApiMethod<ByProjectKeyPaymentsKeyByKeyDelete, com.commercetools.api.models.payment.Payment>
        implements com.commercetools.api.client.DataerasureTrait<ByProjectKeyPaymentsKeyByKeyDelete>,
        com.commercetools.api.client.VersionedTrait<ByProjectKeyPaymentsKeyByKeyDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyPaymentsKeyByKeyDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyPaymentsKeyByKeyDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyPaymentsKeyByKeyDelete>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyPaymentsKeyByKeyDelete> {

    private String projectKey;
    private String key;

    public ByProjectKeyPaymentsKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyPaymentsKeyByKeyDelete(ByProjectKeyPaymentsKeyByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/payments/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.payment.Payment> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.payment.Payment>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.payment.Payment.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getKey() {
        return this.key;
    }

    public List<String> getDataErasure() {
        return this.getQueryParam("dataErasure");
    }

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public ByProjectKeyPaymentsKeyByKeyDelete withDataErasure(final Boolean dataErasure) {
        return copy().withQueryParam("dataErasure", dataErasure);
    }

    public ByProjectKeyPaymentsKeyByKeyDelete addDataErasure(final Boolean dataErasure) {
        return copy().addQueryParam("dataErasure", dataErasure);
    }

    public ByProjectKeyPaymentsKeyByKeyDelete withVersion(final Long version) {
        return copy().withQueryParam("version", version);
    }

    public ByProjectKeyPaymentsKeyByKeyDelete addVersion(final Long version) {
        return copy().addQueryParam("version", version);
    }

    public ByProjectKeyPaymentsKeyByKeyDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyPaymentsKeyByKeyDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyPaymentsKeyByKeyDelete copy() {
        return new ByProjectKeyPaymentsKeyByKeyDelete(this);
    }
}
