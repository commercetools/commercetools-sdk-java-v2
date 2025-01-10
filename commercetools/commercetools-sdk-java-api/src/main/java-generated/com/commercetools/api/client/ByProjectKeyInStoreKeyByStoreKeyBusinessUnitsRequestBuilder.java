
package com.commercetools.api.client;

import java.util.function.Function;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsGet(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsHead(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost post(
            com.commercetools.api.models.business_unit.BusinessUnitDraft businessUnitDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost(apiHttpClient, projectKey, storeKey,
            businessUnitDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPostString post(final String businessUnitDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPostString(apiHttpClient, projectKey, storeKey,
            businessUnitDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost post(
            Function<com.commercetools.api.models.business_unit.BusinessUnitDraftBuilder, Builder<? extends com.commercetools.api.models.business_unit.BusinessUnitDraft>> op) {
        return post(op.apply(com.commercetools.api.models.business_unit.BusinessUnitDraftBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyRequestBuilder(apiHttpClient, projectKey,
            storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByIDRequestBuilder(apiHttpClient, projectKey, storeKey,
            ID);
    }

}
