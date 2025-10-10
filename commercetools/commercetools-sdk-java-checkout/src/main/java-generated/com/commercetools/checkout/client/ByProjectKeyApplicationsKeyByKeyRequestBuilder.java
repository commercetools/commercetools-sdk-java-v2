
package com.commercetools.checkout.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyApplicationsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyApplicationsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyApplicationsKeyByKeyGet get() {
        return new ByProjectKeyApplicationsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyApplicationsKeyByKeyPost post(
            com.commercetools.checkout.models.application.ApplicationUpdateActions applicationUpdateActions) {
        return new ByProjectKeyApplicationsKeyByKeyPost(apiHttpClient, projectKey, key, applicationUpdateActions);
    }

    public ByProjectKeyApplicationsKeyByKeyPostString post(final String applicationUpdateActions) {
        return new ByProjectKeyApplicationsKeyByKeyPostString(apiHttpClient, projectKey, key, applicationUpdateActions);
    }

    public ByProjectKeyApplicationsKeyByKeyPost post(
            UnaryOperator<com.commercetools.checkout.models.application.ApplicationUpdateActionsBuilder> op) {
        return post(
            op.apply(com.commercetools.checkout.models.application.ApplicationUpdateActionsBuilder.of()).build());
    }

    public ByProjectKeyApplicationsKeyByKeyHead head() {
        return new ByProjectKeyApplicationsKeyByKeyHead(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyApplicationsKeyByKeyDelete delete(
            com.commercetools.checkout.models.application.Application application) {
        return new ByProjectKeyApplicationsKeyByKeyDelete(apiHttpClient, projectKey, key, application);
    }

    public ByProjectKeyApplicationsKeyByKeyDeleteString delete(final String application) {
        return new ByProjectKeyApplicationsKeyByKeyDeleteString(apiHttpClient, projectKey, key, application);
    }

    public ByProjectKeyApplicationsKeyByKeyDelete delete(
            UnaryOperator<com.commercetools.checkout.models.application.ApplicationBuilder> op) {
        return delete(op.apply(com.commercetools.checkout.models.application.ApplicationBuilder.of()).build());
    }

}
