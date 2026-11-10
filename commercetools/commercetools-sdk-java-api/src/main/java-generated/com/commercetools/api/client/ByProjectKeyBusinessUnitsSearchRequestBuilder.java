
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyBusinessUnitsSearchRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyBusinessUnitsSearchRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyBusinessUnitsSearchPost post(
            com.commercetools.api.models.business_unit_search.BusinessUnitSearchRequest businessUnitSearchRequest) {
        return new ByProjectKeyBusinessUnitsSearchPost(apiHttpClient, projectKey, businessUnitSearchRequest);
    }

    public ByProjectKeyBusinessUnitsSearchPostString post(final String businessUnitSearchRequest) {
        return new ByProjectKeyBusinessUnitsSearchPostString(apiHttpClient, projectKey, businessUnitSearchRequest);
    }

    public ByProjectKeyBusinessUnitsSearchPost post(
            UnaryOperator<com.commercetools.api.models.business_unit_search.BusinessUnitSearchRequestBuilder> op) {
        return post(
            op.apply(com.commercetools.api.models.business_unit_search.BusinessUnitSearchRequestBuilder.of()).build());
    }

    public ByProjectKeyBusinessUnitsSearchHead head() {
        return new ByProjectKeyBusinessUnitsSearchHead(apiHttpClient, projectKey);
    }

}
