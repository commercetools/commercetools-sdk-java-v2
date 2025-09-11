
package com.commercetools.checkout.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyTransactionsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyTransactionsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyTransactionsPost post(
            com.commercetools.checkout.models.transaction.TransactionDraft transactionDraft) {
        return new ByProjectKeyTransactionsPost(apiHttpClient, projectKey, transactionDraft);
    }

    public ByProjectKeyTransactionsPostString post(final String transactionDraft) {
        return new ByProjectKeyTransactionsPostString(apiHttpClient, projectKey, transactionDraft);
    }

    public ByProjectKeyTransactionsPost post(
            UnaryOperator<com.commercetools.checkout.models.transaction.TransactionDraftBuilder> op) {
        return post(op.apply(com.commercetools.checkout.models.transaction.TransactionDraftBuilder.of()).build());
    }

    public ByProjectKeyTransactionsByIdRequestBuilder withId(String id) {
        return new ByProjectKeyTransactionsByIdRequestBuilder(apiHttpClient, projectKey, id);
    }

    public ByProjectKeyTransactionsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyTransactionsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

}
