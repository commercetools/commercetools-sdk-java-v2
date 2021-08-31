
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete extends
        ApiMethod<ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete, com.commercetools.api.models.order.Order>
        implements
        com.commercetools.api.client.DataerasureTrait<ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete>,
        com.commercetools.api.client.VersionedTrait<ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete> {

    private String projectKey;
    private String storeKey;
    private String orderNumber;

    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey, String orderNumber) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.orderNumber = orderNumber;
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete(
            ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.orderNumber = t.orderNumber;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/orders/order-number=%s", this.projectKey,
            this.storeKey, this.orderNumber);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.order.Order> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.order.Order.class), request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.order.Order.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public List<String> getDataErasure() {
        return this.getQueryParam("dataErasure");
    }

    public List<String> getVersion() {
        return this.getQueryParam("version");
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

    public void setOrderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * set dataErasure with the specificied value
     */
    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete withDataErasure(
            final boolean dataErasure) {
        return copy().withQueryParam("dataErasure", dataErasure);
    }

    /**
     * add additional dataErasure query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete addDataErasure(
            final boolean dataErasure) {
        return copy().addQueryParam("dataErasure", dataErasure);
    }

    /**
     * set version with the specificied value
     */
    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete withVersion(final long version) {
        return copy().withQueryParam("version", version);
    }

    /**
     * add additional version query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete addVersion(final long version) {
        return copy().addQueryParam("version", version);
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete(this);
    }
}
