
package com.commercetools.checkout.client;

import java.net.URI;
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
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyTransactionsPost extends
        TypeBodyApiMethod<ByProjectKeyTransactionsPost, com.commercetools.checkout.models.transaction.Transaction, com.commercetools.checkout.models.transaction.TransactionDraft>
        implements com.commercetools.checkout.client.Secured_by_manage_transactionsTrait<ByProjectKeyTransactionsPost> {

    @Override
    public TypeReference<com.commercetools.checkout.models.transaction.Transaction> resultType() {
        return new TypeReference<com.commercetools.checkout.models.transaction.Transaction>() {
        };
    }

    private String projectKey;

    private com.commercetools.checkout.models.transaction.TransactionDraft transactionDraft;

    public ByProjectKeyTransactionsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.checkout.models.transaction.TransactionDraft transactionDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.transactionDraft = transactionDraft;
    }

    public ByProjectKeyTransactionsPost(ByProjectKeyTransactionsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.transactionDraft = t.transactionDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/transactions", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(transactionDraft)));

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

    public com.commercetools.checkout.models.transaction.TransactionDraft getBody() {
        return transactionDraft;
    }

    public ByProjectKeyTransactionsPost withBody(
            com.commercetools.checkout.models.transaction.TransactionDraft transactionDraft) {
        ByProjectKeyTransactionsPost t = copy();
        t.transactionDraft = transactionDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyTransactionsPost that = (ByProjectKeyTransactionsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(transactionDraft, that.transactionDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(transactionDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyTransactionsPost copy() {
        return new ByProjectKeyTransactionsPost(this);
    }
}
