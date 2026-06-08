
package com.commercetools.checkout.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Creates a Transaction on Checkout. Specific Error Codes:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:InvalidInputError" rel="nofollow">InvalidInput</a></li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:ResourceNotFoundError" rel="nofollow">ResourceNotFound</a></li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:ConnectorFailedError" rel="nofollow">ConnectorFailed</a></li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentFailureError" rel="nofollow">PaymentFailure</a></li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:checkout:type:RequiredFieldError" rel="nofollow">RequiredField</a></li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.transaction.Transaction>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .transactions()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyTransactionsPostString extends
        StringBodyApiMethod<ByProjectKeyTransactionsPostString, com.commercetools.checkout.models.transaction.Transaction>
        implements
        com.commercetools.checkout.client.Secured_by_manage_transactionsTrait<ByProjectKeyTransactionsPostString> {

    @Override
    public TypeReference<com.commercetools.checkout.models.transaction.Transaction> resultType() {
        return new TypeReference<com.commercetools.checkout.models.transaction.Transaction>() {
        };
    }

    private String projectKey;

    private String transactionDraft;

    public ByProjectKeyTransactionsPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String transactionDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.transactionDraft = transactionDraft;
    }

    public ByProjectKeyTransactionsPostString(ByProjectKeyTransactionsPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.transactionDraft = t.transactionDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/transactions", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            transactionDraft.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.checkout.models.transaction.Transaction> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.checkout.models.transaction.Transaction.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.transaction.Transaction>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.checkout.models.transaction.Transaction.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public String getBody() {
        return transactionDraft;
    }

    public ByProjectKeyTransactionsPostString withBody(String transactionDraft) {
        ByProjectKeyTransactionsPostString t = copy();
        t.transactionDraft = transactionDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyTransactionsPostString that = (ByProjectKeyTransactionsPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(transactionDraft, that.transactionDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(transactionDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyTransactionsPostString copy() {
        return new ByProjectKeyTransactionsPostString(this);
    }
}
