
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
*  <p>Update OrderEdit by key</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyOrdersEditsKeyByKeyPost
        extends ApiMethod<ByProjectKeyOrdersEditsKeyByKeyPost, com.commercetools.api.models.order_edit.OrderEdit>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyOrdersEditsKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyOrdersEditsKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyOrdersEditsKeyByKeyPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyOrdersEditsKeyByKeyPost> {

    private String projectKey;
    private String key;

    private com.commercetools.api.models.order_edit.OrderEditUpdate orderEditUpdate;

    public ByProjectKeyOrdersEditsKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.order_edit.OrderEditUpdate orderEditUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.orderEditUpdate = orderEditUpdate;
    }

    public ByProjectKeyOrdersEditsKeyByKeyPost(ByProjectKeyOrdersEditsKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.orderEditUpdate = t.orderEditUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/orders/edits/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(orderEditUpdate);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.order_edit.OrderEdit> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order_edit.OrderEdit>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.order_edit.OrderEdit.class);
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

    public ByProjectKeyOrdersEditsKeyByKeyPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyOrdersEditsKeyByKeyPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyOrdersEditsKeyByKeyPost copy() {
        return new ByProjectKeyOrdersEditsKeyByKeyPost(this);
    }
}
