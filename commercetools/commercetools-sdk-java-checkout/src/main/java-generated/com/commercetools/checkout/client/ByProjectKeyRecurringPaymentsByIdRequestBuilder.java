
package com.commercetools.checkout.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurringPaymentsByIdRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String id;

    public ByProjectKeyRecurringPaymentsByIdRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String id) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.id = id;
    }

    public ByProjectKeyRecurringPaymentsByIdGet get() {
        return new ByProjectKeyRecurringPaymentsByIdGet(apiHttpClient, projectKey, id);
    }

    public ByProjectKeyRecurringPaymentsByIdPost post(
            com.commercetools.checkout.models.recurring_payment.RecurringPaymentUpdateActions recurringPaymentUpdateActions) {
        return new ByProjectKeyRecurringPaymentsByIdPost(apiHttpClient, projectKey, id, recurringPaymentUpdateActions);
    }

    public ByProjectKeyRecurringPaymentsByIdPostString post(final String recurringPaymentUpdateActions) {
        return new ByProjectKeyRecurringPaymentsByIdPostString(apiHttpClient, projectKey, id,
            recurringPaymentUpdateActions);
    }

    public ByProjectKeyRecurringPaymentsByIdPost post(
            UnaryOperator<com.commercetools.checkout.models.recurring_payment.RecurringPaymentUpdateActionsBuilder> op) {
        return post(
            op.apply(com.commercetools.checkout.models.recurring_payment.RecurringPaymentUpdateActionsBuilder.of())
                    .build());
    }

    public ByProjectKeyRecurringPaymentsByIdDelete delete() {
        return new ByProjectKeyRecurringPaymentsByIdDelete(apiHttpClient, projectKey, id);
    }

    public <TValue> ByProjectKeyRecurringPaymentsByIdDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
