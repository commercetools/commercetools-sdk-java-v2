
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyBusinessUnitsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyBusinessUnitsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyBusinessUnitsByIDGet get() {
        return new ByProjectKeyBusinessUnitsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyBusinessUnitsByIDHead head() {
        return new ByProjectKeyBusinessUnitsByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyBusinessUnitsByIDPost post(
            com.commercetools.api.models.business_unit.BusinessUnitUpdate businessUnitUpdate) {
        return new ByProjectKeyBusinessUnitsByIDPost(apiHttpClient, projectKey, ID, businessUnitUpdate);
    }

    public ByProjectKeyBusinessUnitsByIDPostString post(final String businessUnitUpdate) {
        return new ByProjectKeyBusinessUnitsByIDPostString(apiHttpClient, projectKey, ID, businessUnitUpdate);
    }

    public ByProjectKeyBusinessUnitsByIDPost post(
            UnaryOperator<com.commercetools.api.models.business_unit.BusinessUnitUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.business_unit.BusinessUnitUpdateBuilder.of()).build());
    }

    public ByProjectKeyBusinessUnitsByIDDelete delete() {
        return new ByProjectKeyBusinessUnitsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyBusinessUnitsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
