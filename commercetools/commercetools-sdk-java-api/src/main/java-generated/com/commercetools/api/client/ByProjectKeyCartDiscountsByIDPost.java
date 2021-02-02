
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
*  <p>Update CartDiscount by ID</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCartDiscountsByIDPost
        extends ApiMethod<ByProjectKeyCartDiscountsByIDPost, com.commercetools.api.models.cart_discount.CartDiscount>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyCartDiscountsByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyCartDiscountsByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCartDiscountsByIDPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyCartDiscountsByIDPost> {

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.cart_discount.CartDiscountUpdate cartDiscountUpdate;

    public ByProjectKeyCartDiscountsByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.cart_discount.CartDiscountUpdate cartDiscountUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.cartDiscountUpdate = cartDiscountUpdate;
    }

    public ByProjectKeyCartDiscountsByIDPost(ByProjectKeyCartDiscountsByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.cartDiscountUpdate = t.cartDiscountUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/cart-discounts/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(cartDiscountUpdate);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.cart_discount.CartDiscount> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart_discount.CartDiscount>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.cart_discount.CartDiscount.class);
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

    public ByProjectKeyCartDiscountsByIDPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyCartDiscountsByIDPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyCartDiscountsByIDPost copy() {
        return new ByProjectKeyCartDiscountsByIDPost(this);
    }
}
