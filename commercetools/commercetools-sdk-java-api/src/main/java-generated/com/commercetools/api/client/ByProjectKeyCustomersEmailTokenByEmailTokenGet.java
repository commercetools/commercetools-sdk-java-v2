
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
public class ByProjectKeyCustomersEmailTokenByEmailTokenGet extends
        ApiMethod<ByProjectKeyCustomersEmailTokenByEmailTokenGet, com.commercetools.api.models.customer.Customer>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomersEmailTokenByEmailTokenGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomersEmailTokenByEmailTokenGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyCustomersEmailTokenByEmailTokenGet> {

    private String projectKey;
    private String emailToken;

    public ByProjectKeyCustomersEmailTokenByEmailTokenGet(final ApiHttpClient apiHttpClient, String projectKey,
            String emailToken) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.emailToken = emailToken;
    }

    public ByProjectKeyCustomersEmailTokenByEmailTokenGet(ByProjectKeyCustomersEmailTokenByEmailTokenGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.emailToken = t.emailToken;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customers/email-token=%s", this.projectKey, this.emailToken);
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

    public String getEmailToken() {
        return this.emailToken;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setEmailToken(final String emailToken) {
        this.emailToken = emailToken;
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyCustomersEmailTokenByEmailTokenGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCustomersEmailTokenByEmailTokenGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyCustomersEmailTokenByEmailTokenGet copy() {
        return new ByProjectKeyCustomersEmailTokenByEmailTokenGet(this);
    }
}
