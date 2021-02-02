
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
*  <p>Update CustomerGroup by ID</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomerGroupsByIDPost
        extends ApiMethod<ByProjectKeyCustomerGroupsByIDPost, com.commercetools.api.models.customer_group.CustomerGroup>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyCustomerGroupsByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomerGroupsByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomerGroupsByIDPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyCustomerGroupsByIDPost> {

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.customer_group.CustomerGroupUpdate customerGroupUpdate;

    public ByProjectKeyCustomerGroupsByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.customer_group.CustomerGroupUpdate customerGroupUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.customerGroupUpdate = customerGroupUpdate;
    }

    public ByProjectKeyCustomerGroupsByIDPost(ByProjectKeyCustomerGroupsByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.customerGroupUpdate = t.customerGroupUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customer-groups/%s", this.projectKey, this.ID);
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

    public String getID() {
        return this.ID;
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

    public ByProjectKeyCustomerGroupsByIDPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyCustomerGroupsByIDPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyCustomerGroupsByIDPost copy() {
        return new ByProjectKeyCustomerGroupsByIDPost(this);
    }
}
