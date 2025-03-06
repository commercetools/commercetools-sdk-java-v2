
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
 *  <p>Retrieves all roles and permissions of an Associate in a Business Unit.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.business_unit.BusinessUnitAssociateResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .businessUnits()
 *            .withBusinessUnitIdValueAssociatesWithAssociateIdValue("{businessUnitId}", "{associateId}")
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdGet extends
        TypeApiMethod<ByProjectKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdGet, com.commercetools.api.models.business_unit.BusinessUnitAssociateResponse>
        implements
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdGet> {

    @Override
    public TypeReference<com.commercetools.api.models.business_unit.BusinessUnitAssociateResponse> resultType() {
        return new TypeReference<com.commercetools.api.models.business_unit.BusinessUnitAssociateResponse>() {
        };
    }

    private String projectKey;
    private String businessUnitId;
    private String associateId;

    public ByProjectKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdGet(final ApiHttpClient apiHttpClient,
            String projectKey, String businessUnitId, String associateId) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.businessUnitId = businessUnitId;
        this.associateId = associateId;
    }

    public ByProjectKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdGet(
            ByProjectKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.businessUnitId = t.businessUnitId;
        this.associateId = t.associateId;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/business-units/%s/associates/%s", encodePathParam(this.projectKey),
            encodePathParam(this.businessUnitId), encodePathParam(this.associateId));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.business_unit.BusinessUnitAssociateResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.api.models.business_unit.BusinessUnitAssociateResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.business_unit.BusinessUnitAssociateResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.business_unit.BusinessUnitAssociateResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public String getAssociateId() {
        return this.associateId;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setBusinessUnitId(final String businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    public void setAssociateId(final String associateId) {
        this.associateId = associateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdGet that = (ByProjectKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(businessUnitId, that.businessUnitId)
                .append(associateId, that.associateId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(businessUnitId).append(associateId).toHashCode();
    }

    @Override
    protected ByProjectKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdGet copy() {
        return new ByProjectKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdGet(this);
    }
}
