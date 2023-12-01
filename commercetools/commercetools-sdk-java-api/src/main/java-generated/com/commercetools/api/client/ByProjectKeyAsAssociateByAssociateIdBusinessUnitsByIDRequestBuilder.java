
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String associateId;
    private final String ID;

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String associateId, final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.associateId = associateId;
        this.ID = ID;
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDGet get() {
        return new ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDGet(apiHttpClient, projectKey, associateId, ID);
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDHead head() {
        return new ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDHead(apiHttpClient, projectKey, associateId,
            ID);
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPost post(
            com.commercetools.api.models.business_unit.BusinessUnitUpdate businessUnitUpdate) {
        return new ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPost(apiHttpClient, projectKey, associateId, ID,
            businessUnitUpdate);
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString post(final String businessUnitUpdate) {
        return new ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString(apiHttpClient, projectKey,
            associateId, ID, businessUnitUpdate);
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPost post(
            UnaryOperator<com.commercetools.api.models.business_unit.BusinessUnitUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.business_unit.BusinessUnitUpdateBuilder.of()).build());
    }

}
