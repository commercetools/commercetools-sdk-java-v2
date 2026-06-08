
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
 *  <p>Retrieves roles and permissions of an Associate in a Business Unit.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.business_unit.BusinessUnitAssociateResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .businessUnits()
 *            .keyWithKeyValueAssociatesWithAssociateIdValue("{key}", "{associateId}")
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdGet extends
        TypeApiMethod<ByProjectKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdGet, com.commercetools.api.models.business_unit.BusinessUnitAssociateResponse>
        implements
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdGet> {

    @Override
    public TypeReference<com.commercetools.api.models.business_unit.BusinessUnitAssociateResponse> resultType() {
        return new TypeReference<com.commercetools.api.models.business_unit.BusinessUnitAssociateResponse>() {
        };
    }

    private String projectKey;
    private String key;
    private String associateId;

    public ByProjectKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdGet(final ApiHttpClient apiHttpClient,
            String projectKey, String key, String associateId) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.associateId = associateId;
    }

    public ByProjectKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdGet(
            ByProjectKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.associateId = t.associateId;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/business-units/key=%s/associates/%s",
            encodePathParam(this.projectKey), encodePathParam(this.key), encodePathParam(this.associateId));
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

    public String getKey() {
        return this.key;
    }

    public String getAssociateId() {
        return this.associateId;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
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

        ByProjectKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdGet that = (ByProjectKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(associateId, that.associateId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(associateId).toHashCode();
    }

    @Override
    protected ByProjectKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdGet copy() {
        return new ByProjectKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdGet(this);
    }
}
