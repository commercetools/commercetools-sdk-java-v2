
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
*  <p>Create DiscountCode</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyDiscountCodesPost
        extends ApiMethod<ByProjectKeyDiscountCodesPost, com.commercetools.api.models.discount_code.DiscountCode>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyDiscountCodesPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyDiscountCodesPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyDiscountCodesPost> {

    private String projectKey;

    private com.commercetools.api.models.discount_code.DiscountCodeDraft discountCodeDraft;

    public ByProjectKeyDiscountCodesPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.discount_code.DiscountCodeDraft discountCodeDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.discountCodeDraft = discountCodeDraft;
    }

    public ByProjectKeyDiscountCodesPost(ByProjectKeyDiscountCodesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.discountCodeDraft = t.discountCodeDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/discount-codes", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(discountCodeDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
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

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public ByProjectKeyDiscountCodesPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyDiscountCodesPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyDiscountCodesPost copy() {
        return new ByProjectKeyDiscountCodesPost(this);
    }
}
