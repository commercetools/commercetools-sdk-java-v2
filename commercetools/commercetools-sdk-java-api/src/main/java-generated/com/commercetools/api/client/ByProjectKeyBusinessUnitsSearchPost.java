
package com.commercetools.api.client;

import java.net.URI;
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
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyBusinessUnitsSearchPost extends
        TypeBodyApiMethod<ByProjectKeyBusinessUnitsSearchPost, com.commercetools.api.models.business_unit_search.BusinessUnitPagedSearchResponse, com.commercetools.api.models.business_unit_search.BusinessUnitSearchRequest>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyBusinessUnitsSearchPost> {

    @Override
    public TypeReference<com.commercetools.api.models.business_unit_search.BusinessUnitPagedSearchResponse> resultType() {
        return new TypeReference<com.commercetools.api.models.business_unit_search.BusinessUnitPagedSearchResponse>() {
        };
    }

    private String projectKey;

    private com.commercetools.api.models.business_unit_search.BusinessUnitSearchRequest businessUnitSearchRequest;

    public ByProjectKeyBusinessUnitsSearchPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.business_unit_search.BusinessUnitSearchRequest businessUnitSearchRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.businessUnitSearchRequest = businessUnitSearchRequest;
    }

    public ByProjectKeyBusinessUnitsSearchPost(ByProjectKeyBusinessUnitsSearchPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.businessUnitSearchRequest = t.businessUnitSearchRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/business-units/search", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils.executing(
                () -> apiHttpClient().getSerializerService().toJsonByteArray(businessUnitSearchRequest)));

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

    public com.commercetools.api.models.business_unit_search.BusinessUnitSearchRequest getBody() {
        return businessUnitSearchRequest;
    }

    public ByProjectKeyBusinessUnitsSearchPost withBody(
            com.commercetools.api.models.business_unit_search.BusinessUnitSearchRequest businessUnitSearchRequest) {
        ByProjectKeyBusinessUnitsSearchPost t = copy();
        t.businessUnitSearchRequest = businessUnitSearchRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyBusinessUnitsSearchPost that = (ByProjectKeyBusinessUnitsSearchPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(businessUnitSearchRequest, that.businessUnitSearchRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(businessUnitSearchRequest).toHashCode();
    }

    @Override
    protected ByProjectKeyBusinessUnitsSearchPost copy() {
        return new ByProjectKeyBusinessUnitsSearchPost(this);
    }
}
