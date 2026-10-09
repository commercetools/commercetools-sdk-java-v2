
package com.commercetools.checkout.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurringPaymentsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyRecurringPaymentsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyRecurringPaymentsKeyByKeyGet get() {
        return new ByProjectKeyRecurringPaymentsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyRecurringPaymentsKeyByKeyPost post(
            com.commercetools.checkout.models.recurring_payment.RecurringPaymentUpdateActions recurringPaymentUpdateActions) {
        return new ByProjectKeyRecurringPaymentsKeyByKeyPost(apiHttpClient, projectKey, key,
            recurringPaymentUpdateActions);
    }

    public ByProjectKeyRecurringPaymentsKeyByKeyPostString post(final String recurringPaymentUpdateActions) {
        return new ByProjectKeyRecurringPaymentsKeyByKeyPostString(apiHttpClient, projectKey, key,
            recurringPaymentUpdateActions);
    }

    public ByProjectKeyRecurringPaymentsKeyByKeyPost post(
            UnaryOperator<com.commercetools.checkout.models.recurring_payment.RecurringPaymentUpdateActionsBuilder> op) {
        return post(
            op.apply(com.commercetools.checkout.models.recurring_payment.RecurringPaymentUpdateActionsBuilder.of())
                    .build());
    }

    public ByProjectKeyRecurringPaymentsKeyByKeyDelete delete() {
        return new ByProjectKeyRecurringPaymentsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyRecurringPaymentsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
