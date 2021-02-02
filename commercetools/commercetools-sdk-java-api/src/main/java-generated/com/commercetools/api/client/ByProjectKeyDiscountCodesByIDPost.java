
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
*  <p>Update DiscountCode by ID</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyDiscountCodesByIDPost
        extends ApiMethod<ByProjectKeyDiscountCodesByIDPost, com.commercetools.api.models.discount_code.DiscountCode>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyDiscountCodesByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyDiscountCodesByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyDiscountCodesByIDPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyDiscountCodesByIDPost> {

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.discount_code.DiscountCodeUpdate discountCodeUpdate;

    public ByProjectKeyDiscountCodesByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.discount_code.DiscountCodeUpdate discountCodeUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.discountCodeUpdate = discountCodeUpdate;
    }

    public ByProjectKeyDiscountCodesByIDPost(ByProjectKeyDiscountCodesByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.discountCodeUpdate = t.discountCodeUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/discount-codes/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(discountCodeUpdate);
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

    public ByProjectKeyDiscountCodesByIDPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyDiscountCodesByIDPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyDiscountCodesByIDPost copy() {
        return new ByProjectKeyDiscountCodesByIDPost(this);
    }
}
