
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
*  <p>Authenticate Customer (Sign In). Retrieves the authenticated
*  customer (a customer that matches the given email/password pair).
*  If used with an access token for Anonymous Sessions,
*  all orders and carts belonging to the anonymousId will be assigned to the newly created customer.
*  If a cart is is returned as part of the CustomerSignInResult,
*  it has been recalculated (It will have up-to-date prices, taxes and discounts,
*  and invalid line items have been removed.).</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyLoginPost
        extends ApiMethod<ByProjectKeyLoginPost, com.commercetools.api.models.customer.CustomerSignInResult>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyLoginPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyLoginPost> {

    private String projectKey;

    private com.commercetools.api.models.customer.CustomerSignin customerSignin;

    public ByProjectKeyLoginPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.customer.CustomerSignin customerSignin) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerSignin = customerSignin;
    }

    public ByProjectKeyLoginPost(ByProjectKeyLoginPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerSignin = t.customerSignin;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/login", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(customerSignin);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult> executeBlocking(
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.customer.CustomerSignInResult.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    @Override
    protected ByProjectKeyLoginPost copy() {
        return new ByProjectKeyLoginPost(this);
    }
}
