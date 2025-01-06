
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>If the initial indexing is in progress or the feature is inactive, A SearchNotReady error is returned. If inactive, you can reactivate it.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.business_unit_search.BusinessUnitPagedSearchResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .businessUnits()
 *            .search()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyBusinessUnitsSearchPostString extends
        StringBodyApiMethod<ByProjectKeyBusinessUnitsSearchPostString, com.commercetools.api.models.business_unit_search.BusinessUnitPagedSearchResponse>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyBusinessUnitsSearchPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.business_unit_search.BusinessUnitPagedSearchResponse> resultType() {
        return new TypeReference<com.commercetools.api.models.business_unit_search.BusinessUnitPagedSearchResponse>() {
        };
    }

    private String projectKey;

    private String businessUnitSearchRequest;

    public ByProjectKeyBusinessUnitsSearchPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String businessUnitSearchRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.businessUnitSearchRequest = businessUnitSearchRequest;
    }

    public ByProjectKeyBusinessUnitsSearchPostString(ByProjectKeyBusinessUnitsSearchPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.businessUnitSearchRequest = t.businessUnitSearchRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/business-units/search", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            businessUnitSearchRequest.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.business_unit_search.BusinessUnitPagedSearchResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.api.models.business_unit_search.BusinessUnitPagedSearchResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.business_unit_search.BusinessUnitPagedSearchResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.business_unit_search.BusinessUnitPagedSearchResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public String getBody() {
        return businessUnitSearchRequest;
    }

    public ByProjectKeyBusinessUnitsSearchPostString withBody(String businessUnitSearchRequest) {
        ByProjectKeyBusinessUnitsSearchPostString t = copy();
        t.businessUnitSearchRequest = businessUnitSearchRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyBusinessUnitsSearchPostString that = (ByProjectKeyBusinessUnitsSearchPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(businessUnitSearchRequest, that.businessUnitSearchRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(businessUnitSearchRequest).toHashCode();
    }

    @Override
    protected ByProjectKeyBusinessUnitsSearchPostString copy() {
        return new ByProjectKeyBusinessUnitsSearchPostString(this);
    }
}
