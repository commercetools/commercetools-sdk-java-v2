
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
*  <p>Get Customer by passwordToken</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomersPasswordTokenByPasswordTokenGet extends
        ApiMethod<ByProjectKeyCustomersPasswordTokenByPasswordTokenGet, com.commercetools.api.models.customer.Customer>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomersPasswordTokenByPasswordTokenGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomersPasswordTokenByPasswordTokenGet>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyCustomersPasswordTokenByPasswordTokenGet> {

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
    public ApiHttpResponse<com.commercetools.api.models.customer.Customer> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.customer.Customer.class);
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

    public ByProjectKeyCustomersPasswordTokenByPasswordTokenGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyCustomersPasswordTokenByPasswordTokenGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyCustomersPasswordTokenByPasswordTokenGet copy() {
        return new ByProjectKeyCustomersPasswordTokenByPasswordTokenGet(this);
    }
}
