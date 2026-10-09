
package com.commercetools.checkout.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurringPaymentJobsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyRecurringPaymentJobsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyRecurringPaymentJobsGet get() {
        return new ByProjectKeyRecurringPaymentJobsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyRecurringPaymentJobsPost post(
            com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobDraft recurringPaymentJobDraft) {
        return new ByProjectKeyRecurringPaymentJobsPost(apiHttpClient, projectKey, recurringPaymentJobDraft);
    }

    public ByProjectKeyRecurringPaymentJobsPostString post(final String recurringPaymentJobDraft) {
        return new ByProjectKeyRecurringPaymentJobsPostString(apiHttpClient, projectKey, recurringPaymentJobDraft);
    }

    public ByProjectKeyRecurringPaymentJobsPost post(
            UnaryOperator<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobDraftBuilder> op) {
        return post(
            op.apply(com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobDraftBuilder.of())
                    .build());
    }

    public ByProjectKeyRecurringPaymentJobsByIdRequestBuilder withId(String id) {
        return new ByProjectKeyRecurringPaymentJobsByIdRequestBuilder(apiHttpClient, projectKey, id);
    }

    public ByProjectKeyRecurringPaymentJobsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyRecurringPaymentJobsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

}
