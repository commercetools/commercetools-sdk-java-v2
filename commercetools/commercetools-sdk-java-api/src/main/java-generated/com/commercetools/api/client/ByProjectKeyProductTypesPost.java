
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
*  <p>Create ProductType</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductTypesPost
        extends ApiMethod<ByProjectKeyProductTypesPost, com.commercetools.api.models.product_type.ProductType>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductTypesPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductTypesPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyProductTypesPost> {

    private String projectKey;

    private com.commercetools.api.models.product_type.ProductTypeDraft productTypeDraft;

    public ByProjectKeyProductTypesPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.product_type.ProductTypeDraft productTypeDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.productTypeDraft = productTypeDraft;
    }

    public ByProjectKeyProductTypesPost(ByProjectKeyProductTypesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.productTypeDraft = t.productTypeDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-types", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(productTypeDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product_type.ProductType> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_type.ProductType>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.product_type.ProductType.class);
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

    public ByProjectKeyProductTypesPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyProductTypesPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyProductTypesPost copy() {
        return new ByProjectKeyProductTypesPost(this);
    }
}
