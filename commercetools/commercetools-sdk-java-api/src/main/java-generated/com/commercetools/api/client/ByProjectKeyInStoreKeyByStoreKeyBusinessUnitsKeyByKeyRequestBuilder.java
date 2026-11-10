
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String key;

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyGet(apiHttpClient, projectKey, storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyHead(apiHttpClient, projectKey, storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyPost post(
            com.commercetools.api.models.business_unit.BusinessUnitUpdate businessUnitUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyPost(apiHttpClient, projectKey, storeKey, key,
            businessUnitUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyPostString post(final String businessUnitUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyPostString(apiHttpClient, projectKey, storeKey,
            key, businessUnitUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.business_unit.BusinessUnitUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.business_unit.BusinessUnitUpdateBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyDelete(apiHttpClient, projectKey, storeKey,
            key);
    }

    public <TValue> ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
