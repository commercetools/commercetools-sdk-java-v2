
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
*  <p>Set a new password using a token.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomersPasswordResetPost
        extends ApiMethod<ByProjectKeyCustomersPasswordResetPost, com.commercetools.api.models.customer.Customer>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomersPasswordResetPost> {

    private String projectKey;

    private com.commercetools.api.models.customer.CustomerResetPassword customerResetPassword;

    public ByProjectKeyCustomersPasswordResetPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.customer.CustomerResetPassword customerResetPassword) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerResetPassword = customerResetPassword;
    }

    public ByProjectKeyCustomersPasswordResetPost(ByProjectKeyCustomersPasswordResetPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerResetPassword = t.customerResetPassword;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customers/password/reset", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(customerResetPassword);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    @Override
    protected ByProjectKeyCustomersPasswordResetPost copy() {
        return new ByProjectKeyCustomersPasswordResetPost(this);
    }
}
