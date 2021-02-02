
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
*  <p>Updates a customer group by Key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomerGroupsKeyByKeyPost extends
        ApiMethod<ByProjectKeyCustomerGroupsKeyByKeyPost, com.commercetools.api.models.customer_group.CustomerGroup>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyCustomerGroupsKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomerGroupsKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomerGroupsKeyByKeyPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyCustomerGroupsKeyByKeyPost> {

    private String projectKey;
    private String key;

    private com.commercetools.api.models.customer_group.CustomerGroupUpdate customerGroupUpdate;

    public ByProjectKeyCustomerGroupsKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.customer_group.CustomerGroupUpdate customerGroupUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.customerGroupUpdate = customerGroupUpdate;
    }

    public ByProjectKeyCustomerGroupsKeyByKeyPost(ByProjectKeyCustomerGroupsKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.customerGroupUpdate = t.customerGroupUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customer-groups/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(customerGroupUpdate);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer_group.CustomerGroup> executeBlocking(
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer_group.CustomerGroup>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.customer_group.CustomerGroup.class);
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

    public ByProjectKeyCustomerGroupsKeyByKeyPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyCustomerGroupsKeyByKeyPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyCustomerGroupsKeyByKeyPost copy() {
        return new ByProjectKeyCustomerGroupsKeyByKeyPost(this);
    }
}
