
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyBusinessUnitsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyBusinessUnitsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyBusinessUnitsKeyByKeyGet get() {
        return new ByProjectKeyBusinessUnitsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyBusinessUnitsKeyByKeyHead head() {
        return new ByProjectKeyBusinessUnitsKeyByKeyHead(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyBusinessUnitsKeyByKeyPost post(
            com.commercetools.api.models.business_unit.BusinessUnitUpdate businessUnitUpdate) {
        return new ByProjectKeyBusinessUnitsKeyByKeyPost(apiHttpClient, projectKey, key, businessUnitUpdate);
    }

    public ByProjectKeyBusinessUnitsKeyByKeyPostString post(final String businessUnitUpdate) {
        return new ByProjectKeyBusinessUnitsKeyByKeyPostString(apiHttpClient, projectKey, key, businessUnitUpdate);
    }

    public ByProjectKeyBusinessUnitsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.business_unit.BusinessUnitUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.business_unit.BusinessUnitUpdateBuilder.of()).build());
    }

    public ByProjectKeyBusinessUnitsKeyByKeyDelete delete() {
        return new ByProjectKeyBusinessUnitsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyBusinessUnitsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
