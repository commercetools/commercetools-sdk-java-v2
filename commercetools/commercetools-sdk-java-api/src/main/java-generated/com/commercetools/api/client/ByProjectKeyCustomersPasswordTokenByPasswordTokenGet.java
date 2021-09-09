
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
public class ByProjectKeyCustomersPasswordTokenByPasswordTokenGet extends
        ApiMethod<ByProjectKeyCustomersPasswordTokenByPasswordTokenGet, com.commercetools.api.models.customer.Customer>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomersPasswordTokenByPasswordTokenGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomersPasswordTokenByPasswordTokenGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyCustomersPasswordTokenByPasswordTokenGet> {

    private String projectKey;
    private String passwordToken;

    public ByProjectKeyCustomersPasswordTokenByPasswordTokenGet(final ApiHttpClient apiHttpClient, String projectKey,
            String passwordToken) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.passwordToken = passwordToken;
    }

    public ByProjectKeyCustomersPasswordTokenByPasswordTokenGet(
            ByProjectKeyCustomersPasswordTokenByPasswordTokenGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.passwordToken = t.passwordToken;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customers/password-token=%s", this.projectKey, this.passwordToken);
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

    public String getPasswordToken() {
        return this.passwordToken;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setPasswordToken(final String passwordToken) {
        this.passwordToken = passwordToken;
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyCustomersPasswordTokenByPasswordTokenGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCustomersPasswordTokenByPasswordTokenGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyCustomersPasswordTokenByPasswordTokenGet withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyCustomersPasswordTokenByPasswordTokenGet addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCustomersPasswordTokenByPasswordTokenGet that = (ByProjectKeyCustomersPasswordTokenByPasswordTokenGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(passwordToken, that.passwordToken)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(passwordToken).toHashCode();
    }

    @Override
    protected ByProjectKeyCustomersPasswordTokenByPasswordTokenGet copy() {
        return new ByProjectKeyCustomersPasswordTokenByPasswordTokenGet(this);
    }
}
