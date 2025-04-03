
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
 *  <p>Checks if a BusinessUnit exists with the provided <code>id</code>. Returns a <code>200 OK</code> status if the BusinessUnit exists or a <code>404 Not Found</code> otherwise.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .asAssociate()
 *            .withAssociateIdValue("{associateId}")
 *            .businessUnits()
 *            .withId("{ID}")
 *            .head()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDHead extends
        TypeApiMethod<ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDHead, com.fasterxml.jackson.databind.JsonNode>
        implements
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDHead>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDHead> {

    @Override
    public TypeReference<com.fasterxml.jackson.databind.JsonNode> resultType() {
        return new TypeReference<com.fasterxml.jackson.databind.JsonNode>() {
        };
    }

    private String projectKey;
    private String associateId;
    private String ID;

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDHead(final ApiHttpClient apiHttpClient,
            String projectKey, String associateId, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.associateId = associateId;
        this.ID = ID;
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDHead(
            ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDHead t) {
        super(t);
        this.projectKey = t.projectKey;
        this.associateId = t.associateId;
        this.ID = t.ID;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/as-associate/%s/business-units/%s", encodePathParam(this.projectKey),
            encodePathParam(this.associateId), encodePathParam(this.ID));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.HEAD, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.fasterxml.jackson.databind.JsonNode.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode>> execute(
            final ApiHttpClient client) {
        return execute(client, com.fasterxml.jackson.databind.JsonNode.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getAssociateId() {
        return this.associateId;
    }

    public String getID() {
        return this.ID;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setAssociateId(final String associateId) {
        this.associateId = associateId;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDHead that = (ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDHead) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(associateId, that.associateId)
                .append(ID, that.ID)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(associateId).append(ID).toHashCode();
    }

    @Override
    protected ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDHead copy() {
        return new ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDHead(this);
    }
}
