
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String associateId;
    private final String key;

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String associateId, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.associateId = associateId;
        this.key = key;
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyGet get() {
        return new ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyGet(apiHttpClient, projectKey, associateId,
            key);
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyHead head() {
        return new ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyHead(apiHttpClient, projectKey, associateId,
            key);
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyPost post(
            com.commercetools.api.models.business_unit.BusinessUnitUpdate businessUnitUpdate) {
        return new ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyPost(apiHttpClient, projectKey, associateId,
            key, businessUnitUpdate);
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyPostString post(final String businessUnitUpdate) {
        return new ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyPostString(apiHttpClient, projectKey,
            associateId, key, businessUnitUpdate);
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.business_unit.BusinessUnitUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.business_unit.BusinessUnitUpdateBuilder.of()).build());
    }

}
