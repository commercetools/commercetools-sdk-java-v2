
package com.commercetools.api.client;

import java.util.function.Function;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyBusinessUnitsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyBusinessUnitsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyBusinessUnitsGet get() {
        return new ByProjectKeyBusinessUnitsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyBusinessUnitsHead head() {
        return new ByProjectKeyBusinessUnitsHead(apiHttpClient, projectKey);
    }

    public ByProjectKeyBusinessUnitsPost post(
            com.commercetools.api.models.business_unit.BusinessUnitDraft businessUnitDraft) {
        return new ByProjectKeyBusinessUnitsPost(apiHttpClient, projectKey, businessUnitDraft);
    }

    public ByProjectKeyBusinessUnitsPostString post(final String businessUnitDraft) {
        return new ByProjectKeyBusinessUnitsPostString(apiHttpClient, projectKey, businessUnitDraft);
    }

    public ByProjectKeyBusinessUnitsPost post(
            Function<com.commercetools.api.models.business_unit.BusinessUnitDraftBuilder, Builder<? extends com.commercetools.api.models.business_unit.BusinessUnitDraft>> op) {
        return post(op.apply(com.commercetools.api.models.business_unit.BusinessUnitDraftBuilder.of()).build());
    }

    public ByProjectKeyBusinessUnitsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyBusinessUnitsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyBusinessUnitsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyBusinessUnitsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdRequestBuilder keyWithKeyValueAssociatesWithAssociateIdValue(
            String key, String associateId) {
        return new ByProjectKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdRequestBuilder(apiHttpClient, projectKey,
            key, associateId);
    }

    public ByProjectKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdRequestBuilder withBusinessUnitIdValueAssociatesWithAssociateIdValue(
            String businessUnitId, String associateId) {
        return new ByProjectKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdRequestBuilder(apiHttpClient,
            projectKey, businessUnitId, associateId);
    }

    public ByProjectKeyBusinessUnitsSearchRequestBuilder search() {
        return new ByProjectKeyBusinessUnitsSearchRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyBusinessUnitsSearchIndexingStatusRequestBuilder searchIndexingStatus() {
        return new ByProjectKeyBusinessUnitsSearchIndexingStatusRequestBuilder(apiHttpClient, projectKey);
    }

}
