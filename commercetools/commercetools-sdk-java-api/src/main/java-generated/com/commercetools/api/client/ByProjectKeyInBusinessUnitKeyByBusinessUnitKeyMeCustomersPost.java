
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>The My Business Unit endpoint does not support assigning existing Customers to a Business Unit. Associates with the <code>UpdateAssociates</code> Permission can use this endpoint to create a new Customer and associate it with the Business Unit. The new Associate is created with an empty set of roles.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inBusinessUnitKeyWithBusinessUnitKeyValue("{businessUnitKey}")
 *            .me()
 *            .customers()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPost extends
        BodyApiMethod<ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPost, com.commercetools.api.models.customer.CustomerSignInResult, com.commercetools.api.models.me.MyBusinessUnitAssociateDraft> {

    private String projectKey;
    private String businessUnitKey;

    private com.commercetools.api.models.me.MyBusinessUnitAssociateDraft myBusinessUnitAssociateDraft;

    public ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPost(final ApiHttpClient apiHttpClient,
            String projectKey, String businessUnitKey,
            com.commercetools.api.models.me.MyBusinessUnitAssociateDraft myBusinessUnitAssociateDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.businessUnitKey = businessUnitKey;
        this.myBusinessUnitAssociateDraft = myBusinessUnitAssociateDraft;
    }

    public ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPost(
            ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPost t) {
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
            io.vrap.rmf.base.client.utils.json.JsonUtils.executing(
                () -> apiHttpClient().getSerializerService().toJsonByteArray(myBusinessUnitAssociateDraft)));

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

    public com.commercetools.api.models.me.MyBusinessUnitAssociateDraft getBody() {
        return myBusinessUnitAssociateDraft;
    }

    public ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPost withBody(
            com.commercetools.api.models.me.MyBusinessUnitAssociateDraft myBusinessUnitAssociateDraft) {
        ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPost t = copy();
        t.myBusinessUnitAssociateDraft = myBusinessUnitAssociateDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPost that = (ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPost) o;

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
    protected ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPost copy() {
        return new ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPost(this);
    }
}
