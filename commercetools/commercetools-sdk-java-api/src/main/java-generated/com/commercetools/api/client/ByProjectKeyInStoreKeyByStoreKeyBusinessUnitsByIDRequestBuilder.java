
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String ID;

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByIDRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByIDGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByIDGet(apiHttpClient, projectKey, storeKey, ID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByIDHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByIDHead(apiHttpClient, projectKey, storeKey, ID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByIDPost post(
            com.commercetools.api.models.business_unit.BusinessUnitUpdate businessUnitUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByIDPost(apiHttpClient, projectKey, storeKey, ID,
            businessUnitUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByIDPostString post(final String businessUnitUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByIDPostString(apiHttpClient, projectKey, storeKey, ID,
            businessUnitUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByIDPost post(
            UnaryOperator<com.commercetools.api.models.business_unit.BusinessUnitUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.business_unit.BusinessUnitUpdateBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByIDDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByIDDelete(apiHttpClient, projectKey, storeKey, ID);
    }

    public <TValue> ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
