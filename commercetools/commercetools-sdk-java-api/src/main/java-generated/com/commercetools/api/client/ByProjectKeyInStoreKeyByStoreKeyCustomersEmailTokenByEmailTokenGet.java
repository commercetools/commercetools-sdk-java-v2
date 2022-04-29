
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet extends
        ApiMethod<ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet, com.commercetools.api.models.customer.Customer>
        implements
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet> {

    private String projectKey;
    private String storeKey;
    private String emailToken;

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey, String emailToken) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.emailToken = emailToken;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet(
            ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.emailToken = t.emailToken;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/customers/email-token=%s", this.projectKey,
            this.storeKey, this.emailToken);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.Customer> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.customer.Customer.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.customer.Customer.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public String getEmailToken() {
        return this.emailToken;
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

    public void setEmailToken(final String emailToken) {
        this.emailToken = emailToken;
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet withExpand(
            final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet addExpand(
            final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet withExpand(
            final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet addExpand(
            final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet that = (ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(emailToken, that.emailToken)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(emailToken).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenGet(this);
    }
}
