
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
public class ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenByPasswordTokenGet extends
        ApiMethod<ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenByPasswordTokenGet, com.commercetools.api.models.customer.Customer>
        implements
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenByPasswordTokenGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenByPasswordTokenGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenByPasswordTokenGet> {

    private String projectKey;
    private String storeKey;
    private String passwordToken;

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenByPasswordTokenGet(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey, String passwordToken) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.passwordToken = passwordToken;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenByPasswordTokenGet(
            ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenByPasswordTokenGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.passwordToken = t.passwordToken;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/customers/password-token=%s", this.projectKey,
            this.storeKey, this.passwordToken);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.Customer> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.customer.Customer.class), request,
            timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.customer.Customer.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public String getPasswordToken() {
        return this.passwordToken;
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

    public void setPasswordToken(final String passwordToken) {
        this.passwordToken = passwordToken;
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenByPasswordTokenGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenByPasswordTokenGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenByPasswordTokenGet withExpand(
            final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenByPasswordTokenGet addExpand(
            final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenByPasswordTokenGet that = (ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenByPasswordTokenGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(passwordToken, that.passwordToken)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(passwordToken).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenByPasswordTokenGet copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenByPasswordTokenGet(this);
    }
}
