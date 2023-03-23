
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>The My Business Unit endpoint does not support assigning existing Customers to a Business Unit. Use this endpoint to create a new Customer and associate it with the Business Unit. The user must have the <code>Admin</code> role within the Business Unit to perform this request. The new Customer is created with an empty set of roles.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inBusinessUnitKeyWithBusinessUnitKeyValue("{businessUnitKey}")
 *            .me()
 *            .customers()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPostString extends
        StringBodyApiMethod<ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPostString, com.commercetools.api.models.customer.CustomerSignInResult> {

    private String projectKey;
    private String businessUnitKey;

    private String myBusinessUnitAssociateDraft;

    public ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPostString(final ApiHttpClient apiHttpClient,
            String projectKey, String businessUnitKey, String myBusinessUnitAssociateDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.businessUnitKey = businessUnitKey;
        this.myBusinessUnitAssociateDraft = myBusinessUnitAssociateDraft;
    }

    public ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPostString(
            ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.businessUnitKey = t.businessUnitKey;
        this.myBusinessUnitAssociateDraft = t.myBusinessUnitAssociateDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-business-unit/key=%s/me/customers", this.projectKey,
            this.businessUnitKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            myBusinessUnitAssociateDraft.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.customer.CustomerSignInResult.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.customer.CustomerSignInResult.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getBusinessUnitKey() {
        return this.businessUnitKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setBusinessUnitKey(final String businessUnitKey) {
        this.businessUnitKey = businessUnitKey;
    }

    public String getBody() {
        return myBusinessUnitAssociateDraft;
    }

    public ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPostString withBody(
            String myBusinessUnitAssociateDraft) {
        ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPostString t = copy();
        t.myBusinessUnitAssociateDraft = myBusinessUnitAssociateDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPostString that = (ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(businessUnitKey, that.businessUnitKey)
                .append(myBusinessUnitAssociateDraft, that.myBusinessUnitAssociateDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(businessUnitKey)
                .append(myBusinessUnitAssociateDraft)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPostString copy() {
        return new ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPostString(this);
    }
}
