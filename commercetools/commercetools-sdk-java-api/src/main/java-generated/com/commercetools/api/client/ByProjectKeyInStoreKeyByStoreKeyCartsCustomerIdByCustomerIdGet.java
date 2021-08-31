
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
*  <p>Retrieves the active cart of the customer that has been modified most recently in a specific Store.
*  The {storeKey} path parameter maps to a Store's key.</p>
*  <p>If the cart exists in the commercetools project but does not have the store field, or the store field
*  references a different store, this method returns a ResourceNotFound error.</p>
*  <p>The cart may not contain up-to-date prices, discounts etc. If you want to ensure they're up-to-date,
*  send an Update request with the Recalculate update action instead.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet extends
        ApiMethod<ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet, com.commercetools.api.models.cart.Cart>
        implements
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet> {

    private String projectKey;
    private String storeKey;
    private String customerId;

    public ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey, String customerId) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.customerId = customerId;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet(
            ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.customerId = t.customerId;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/carts/customer-id=%s", this.projectKey,
            this.storeKey, this.customerId);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.cart.Cart> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.cart.Cart.class), request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.cart.Cart.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet(this);
    }
}
