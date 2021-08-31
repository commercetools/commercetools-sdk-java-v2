
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomersByIDDelete
        extends ApiMethod<ByProjectKeyCustomersByIDDelete, com.commercetools.api.models.customer.Customer>
        implements com.commercetools.api.client.DataerasureTrait<ByProjectKeyCustomersByIDDelete>,
        com.commercetools.api.client.VersionedTrait<ByProjectKeyCustomersByIDDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyCustomersByIDDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomersByIDDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomersByIDDelete>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyCustomersByIDDelete> {

    private String projectKey;
    private String ID;

    public ByProjectKeyCustomersByIDDelete(final ApiHttpClient apiHttpClient, String projectKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyCustomersByIDDelete(ByProjectKeyCustomersByIDDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customers/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.Customer> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.customer.Customer.class), request,
            timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.customer.Customer.class);
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

    /**
     * set dataErasure with the specificied value
     */
    public ByProjectKeyCustomersByIDDelete withDataErasure(final boolean dataErasure) {
        return copy().withQueryParam("dataErasure", dataErasure);
    }

    /**
     * add additional dataErasure query parameter
     */
    public ByProjectKeyCustomersByIDDelete addDataErasure(final boolean dataErasure) {
        return copy().addQueryParam("dataErasure", dataErasure);
    }

    /**
     * set version with the specificied value
     */
    public ByProjectKeyCustomersByIDDelete withVersion(final long version) {
        return copy().withQueryParam("version", version);
    }

    /**
     * add additional version query parameter
     */
    public ByProjectKeyCustomersByIDDelete addVersion(final long version) {
        return copy().addQueryParam("version", version);
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyCustomersByIDDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCustomersByIDDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyCustomersByIDDelete copy() {
        return new ByProjectKeyCustomersByIDDelete(this);
    }
}
