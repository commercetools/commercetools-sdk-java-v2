
package com.commercetools.api.client;

import java.util.function.Function;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAsAssociateByAssociateIdBusinessUnitsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String associateId;

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String associateId) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.associateId = associateId;
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsGet get() {
        return new ByProjectKeyAsAssociateByAssociateIdBusinessUnitsGet(apiHttpClient, projectKey, associateId);
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsHead head() {
        return new ByProjectKeyAsAssociateByAssociateIdBusinessUnitsHead(apiHttpClient, projectKey, associateId);
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost post(
            com.commercetools.api.models.business_unit.BusinessUnitDraft businessUnitDraft) {
        return new ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost(apiHttpClient, projectKey, associateId,
            businessUnitDraft);
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPostString post(final String businessUnitDraft) {
        return new ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPostString(apiHttpClient, projectKey, associateId,
            businessUnitDraft);
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost post(
            Function<com.commercetools.api.models.business_unit.BusinessUnitDraftBuilder, Builder<? extends com.commercetools.api.models.business_unit.BusinessUnitDraft>> op) {
        return post(op.apply(com.commercetools.api.models.business_unit.BusinessUnitDraftBuilder.of()).build());
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyRequestBuilder(apiHttpClient, projectKey,
            associateId, key);
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDRequestBuilder(apiHttpClient, projectKey,
            associateId, ID);
    }

}
