
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
*  <p>Delete DiscountCode by ID</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyDiscountCodesByIDDelete
        extends ApiMethod<ByProjectKeyDiscountCodesByIDDelete, com.commercetools.api.models.discount_code.DiscountCode>
        implements com.commercetools.api.client.DataerasureTrait<ByProjectKeyDiscountCodesByIDDelete>,
        com.commercetools.api.client.VersionedTrait<ByProjectKeyDiscountCodesByIDDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyDiscountCodesByIDDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyDiscountCodesByIDDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyDiscountCodesByIDDelete>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyDiscountCodesByIDDelete> {

    private String projectKey;
    private String ID;

    public ByProjectKeyDiscountCodesByIDDelete(final ApiHttpClient apiHttpClient, String projectKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyDiscountCodesByIDDelete(ByProjectKeyDiscountCodesByIDDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/discount-codes/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.discount_code.DiscountCode> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.discount_code.DiscountCode>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.discount_code.DiscountCode.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
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

    public void setID(final String ID) {
        this.ID = ID;
    }

    public ByProjectKeyDiscountCodesByIDDelete withDataErasure(final Boolean dataErasure) {
        return copy().withQueryParam("dataErasure", dataErasure);
    }

    public ByProjectKeyDiscountCodesByIDDelete addDataErasure(final Boolean dataErasure) {
        return copy().addQueryParam("dataErasure", dataErasure);
    }

    public ByProjectKeyDiscountCodesByIDDelete withVersion(final Long version) {
        return copy().withQueryParam("version", version);
    }

    public ByProjectKeyDiscountCodesByIDDelete addVersion(final Long version) {
        return copy().addQueryParam("version", version);
    }

    public ByProjectKeyDiscountCodesByIDDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyDiscountCodesByIDDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyDiscountCodesByIDDelete copy() {
        return new ByProjectKeyDiscountCodesByIDDelete(this);
    }
}
