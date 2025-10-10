
package com.commercetools.checkout.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyApplicationsByIdRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String id;

    public ByProjectKeyApplicationsByIdRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String id) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.id = id;
    }

    public ByProjectKeyApplicationsByIdGet get() {
        return new ByProjectKeyApplicationsByIdGet(apiHttpClient, projectKey, id);
    }

    public ByProjectKeyApplicationsByIdHead head() {
        return new ByProjectKeyApplicationsByIdHead(apiHttpClient, projectKey, id);
    }

    public ByProjectKeyApplicationsByIdPost post(
            com.commercetools.checkout.models.application.ApplicationUpdateActions applicationUpdateActions) {
        return new ByProjectKeyApplicationsByIdPost(apiHttpClient, projectKey, id, applicationUpdateActions);
    }

    public ByProjectKeyApplicationsByIdPostString post(final String applicationUpdateActions) {
        return new ByProjectKeyApplicationsByIdPostString(apiHttpClient, projectKey, id, applicationUpdateActions);
    }

    public ByProjectKeyApplicationsByIdPost post(
            UnaryOperator<com.commercetools.checkout.models.application.ApplicationUpdateActionsBuilder> op) {
        return post(
            op.apply(com.commercetools.checkout.models.application.ApplicationUpdateActionsBuilder.of()).build());
    }

    public ByProjectKeyApplicationsByIdDelete delete(
            com.commercetools.checkout.models.application.Application application) {
        return new ByProjectKeyApplicationsByIdDelete(apiHttpClient, projectKey, id, application);
    }

    public ByProjectKeyApplicationsByIdDeleteString delete(final String application) {
        return new ByProjectKeyApplicationsByIdDeleteString(apiHttpClient, projectKey, id, application);
    }

    public ByProjectKeyApplicationsByIdDelete delete(
            UnaryOperator<com.commercetools.checkout.models.application.ApplicationBuilder> op) {
        return delete(op.apply(com.commercetools.checkout.models.application.ApplicationBuilder.of()).build());
    }

}
