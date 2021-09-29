
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeCartsPost
        extends ApiMethod<ByProjectKeyInStoreKeyByStoreKeyMeCartsPost, com.commercetools.api.models.cart.Cart>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyMeCartsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyInStoreKeyByStoreKeyMeCartsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyMeCartsPost> {

    private String projectKey;
    private String storeKey;

    private com.commercetools.api.models.me.MyCartDraft myCartDraft;

    public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, com.commercetools.api.models.me.MyCartDraft myCartDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.myCartDraft = myCartDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost(ByProjectKeyInStoreKeyByStoreKeyMeCartsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.myCartDraft = t.myCartDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/me/carts", this.projectKey, this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(myCartDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.cart.Cart> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.cart.Cart.class).toCompletableFuture(),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.cart.Cart.class)
                .toCompletableFuture();
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
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

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyMeCartsPost that = (ByProjectKeyInStoreKeyByStoreKeyMeCartsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(myCartDraft, that.myCartDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(myCartDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyMeCartsPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeCartsPost(this);
    }
}
