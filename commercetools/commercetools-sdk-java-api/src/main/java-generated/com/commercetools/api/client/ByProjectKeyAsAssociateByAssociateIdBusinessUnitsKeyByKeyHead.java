
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
 *  <p>Checks if a BusinessUnit exists for a given <code>key</code>. Returns a <code>200 OK</code> status if the BusinessUnit exists or a <code>404 Not Found</code> otherwise.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .asAssociate()
 *            .withAssociateIdValue("{associateId}")
 *            .businessUnits()
 *            .withKey("{key}")
 *            .head()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyHead extends
        TypeApiMethod<ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyHead, com.fasterxml.jackson.databind.JsonNode>
        implements
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyHead>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyHead> {

    @Override
    public TypeReference<com.fasterxml.jackson.databind.JsonNode> resultType() {
        return new TypeReference<com.fasterxml.jackson.databind.JsonNode>() {
        };
    }

    private String projectKey;
    private String associateId;
    private String key;

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyHead(final ApiHttpClient apiHttpClient,
            String projectKey, String associateId, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.associateId = associateId;
        this.key = key;
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyHead(
            ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyHead t) {
        super(t);
        this.projectKey = t.projectKey;
        this.associateId = t.associateId;
        this.key = t.key;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/as-associate/%s/business-units/key=%s", this.projectKey,
            this.associateId, this.key);
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

    public String getKey() {
        return this.key;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setAssociateId(final String associateId) {
        this.associateId = associateId;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyHead that = (ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyHead) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(associateId, that.associateId)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(associateId).append(key).toHashCode();
    }

    @Override
    protected ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyHead copy() {
        return new ByProjectKeyAsAssociateByAssociateIdBusinessUnitsKeyByKeyHead(this);
    }
}
