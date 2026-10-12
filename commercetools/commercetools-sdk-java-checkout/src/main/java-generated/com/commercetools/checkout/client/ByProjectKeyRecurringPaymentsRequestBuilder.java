
package com.commercetools.checkout.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurringPaymentsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyRecurringPaymentsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyRecurringPaymentsGet get() {
        return new ByProjectKeyRecurringPaymentsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyRecurringPaymentsPost post(
            com.commercetools.checkout.models.recurring_payment.RecurringPaymentDraft recurringPaymentDraft) {
        return new ByProjectKeyRecurringPaymentsPost(apiHttpClient, projectKey, recurringPaymentDraft);
    }

    public ByProjectKeyRecurringPaymentsPostString post(final String recurringPaymentDraft) {
        return new ByProjectKeyRecurringPaymentsPostString(apiHttpClient, projectKey, recurringPaymentDraft);
    }

    public ByProjectKeyRecurringPaymentsPost post(
            UnaryOperator<com.commercetools.checkout.models.recurring_payment.RecurringPaymentDraftBuilder> op) {
        return post(
            op.apply(com.commercetools.checkout.models.recurring_payment.RecurringPaymentDraftBuilder.of()).build());
    }

    public ByProjectKeyRecurringPaymentsByIdRequestBuilder withId(String id) {
        return new ByProjectKeyRecurringPaymentsByIdRequestBuilder(apiHttpClient, projectKey, id);
    }

    public ByProjectKeyRecurringPaymentsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyRecurringPaymentsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

}
