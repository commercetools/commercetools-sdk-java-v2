
package com.commercetools.importapi.client;

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
 *  <p>Creates an Import Request for Prices.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importrequests.ImportResponse>> result = apiRoot
 *            .withProjectKeyValue("{projectKey}")
 *            .prices()
 *            .importContainers()
 *            .withImportContainerKeyValue("{importContainerKey}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPricesImportContainersByImportContainerKeyPostString extends
        StringBodyApiMethod<ByProjectKeyPricesImportContainersByImportContainerKeyPostString, com.commercetools.importapi.models.importrequests.ImportResponse>
        implements
        com.commercetools.importapi.client.Secured_by_manage_productsTrait<ByProjectKeyPricesImportContainersByImportContainerKeyPostString> {

    @Override
    public TypeReference<com.commercetools.importapi.models.importrequests.ImportResponse> resultType() {
        return new TypeReference<com.commercetools.importapi.models.importrequests.ImportResponse>() {
        };
    }

    private String projectKey;
    private String importContainerKey;

    private String priceImportRequest;

    public ByProjectKeyPricesImportContainersByImportContainerKeyPostString(final ApiHttpClient apiHttpClient,
            String projectKey, String importContainerKey, String priceImportRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
        this.priceImportRequest = priceImportRequest;
    }

    public ByProjectKeyPricesImportContainersByImportContainerKeyPostString(
            ByProjectKeyPricesImportContainersByImportContainerKeyPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importContainerKey = t.importContainerKey;
        this.priceImportRequest = t.priceImportRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/prices/import-containers/%s", this.projectKey,
            this.importContainerKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            priceImportRequest.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importrequests.ImportResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.importapi.models.importrequests.ImportResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importrequests.ImportResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.importapi.models.importrequests.ImportResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getImportContainerKey() {
        return this.importContainerKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setImportContainerKey(final String importContainerKey) {
        this.importContainerKey = importContainerKey;
    }

    public String getBody() {
        return priceImportRequest;
    }

    public ByProjectKeyPricesImportContainersByImportContainerKeyPostString withBody(String priceImportRequest) {
        ByProjectKeyPricesImportContainersByImportContainerKeyPostString t = copy();
        t.priceImportRequest = priceImportRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyPricesImportContainersByImportContainerKeyPostString that = (ByProjectKeyPricesImportContainersByImportContainerKeyPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importContainerKey, that.importContainerKey)
                .append(priceImportRequest, that.priceImportRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(importContainerKey)
                .append(priceImportRequest)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyPricesImportContainersByImportContainerKeyPostString copy() {
        return new ByProjectKeyPricesImportContainersByImportContainerKeyPostString(this);
    }
}
