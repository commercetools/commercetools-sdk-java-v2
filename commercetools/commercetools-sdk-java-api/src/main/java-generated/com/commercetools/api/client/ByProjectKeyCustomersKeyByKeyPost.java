
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
*  <p>Update Customer by key</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomersKeyByKeyPost
        extends ApiMethod<ByProjectKeyCustomersKeyByKeyPost, com.commercetools.api.models.customer.Customer>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyCustomersKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomersKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomersKeyByKeyPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyCustomersKeyByKeyPost> {

    private String projectKey;
    private String key;

    private com.commercetools.api.models.customer.CustomerUpdate customerUpdate;

    public ByProjectKeyCustomersKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.customer.CustomerUpdate customerUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.customerUpdate = customerUpdate;
    }

    public ByProjectKeyCustomersKeyByKeyPost(ByProjectKeyCustomersKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.customerUpdate = t.customerUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customers/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(customerUpdate);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.Customer> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.customer.Customer.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getKey() {
        return this.key;
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

    public ByProjectKeyCustomersKeyByKeyPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyCustomersKeyByKeyPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyCustomersKeyByKeyPost copy() {
        return new ByProjectKeyCustomersKeyByKeyPost(this);
    }
}
