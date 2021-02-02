
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
*  <p>Update ProductDiscount by key</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductDiscountsKeyByKeyPost extends
        ApiMethod<ByProjectKeyProductDiscountsKeyByKeyPost, com.commercetools.api.models.product_discount.ProductDiscount>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyProductDiscountsKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductDiscountsKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductDiscountsKeyByKeyPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyProductDiscountsKeyByKeyPost> {

    private String projectKey;
    private String key;

    private com.commercetools.api.models.product_discount.ProductDiscountUpdate productDiscountUpdate;

    public ByProjectKeyProductDiscountsKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.product_discount.ProductDiscountUpdate productDiscountUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.productDiscountUpdate = productDiscountUpdate;
    }

    public ByProjectKeyProductDiscountsKeyByKeyPost(ByProjectKeyProductDiscountsKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.productDiscountUpdate = t.productDiscountUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-discounts/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(productDiscountUpdate);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product_discount.ProductDiscount> executeBlocking(
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_discount.ProductDiscount>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.product_discount.ProductDiscount.class);
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

    public ByProjectKeyProductDiscountsKeyByKeyPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyProductDiscountsKeyByKeyPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyProductDiscountsKeyByKeyPost copy() {
        return new ByProjectKeyProductDiscountsKeyByKeyPost(this);
    }
}
