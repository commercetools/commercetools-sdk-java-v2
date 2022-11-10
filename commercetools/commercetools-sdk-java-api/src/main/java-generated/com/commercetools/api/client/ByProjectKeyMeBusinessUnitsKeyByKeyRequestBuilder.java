
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeBusinessUnitsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyMeBusinessUnitsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyMeBusinessUnitsKeyByKeyGet get() {
        return new ByProjectKeyMeBusinessUnitsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyMeBusinessUnitsKeyByKeyPost post(
            com.commercetools.api.models.me.MyBusinessUnitUpdate myBusinessUnitUpdate) {
        return new ByProjectKeyMeBusinessUnitsKeyByKeyPost(apiHttpClient, projectKey, key, myBusinessUnitUpdate);
    }

    public ByProjectKeyMeBusinessUnitsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.me.MyBusinessUnitUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyBusinessUnitUpdateBuilder.of()).build());
    }

    public ByProjectKeyMeBusinessUnitsKeyByKeyDelete delete() {
        return new ByProjectKeyMeBusinessUnitsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyMeBusinessUnitsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
