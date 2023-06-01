package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.utils.Utils;

import java.io.InputStream;
import java.io.IOException;

import java.net.URI;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;
import io.vrap.rmf.base.client.utils.Generated;

import javax.annotation.Nullable;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

/**
 *  <p>Creates a request for creating new Standalone Prices or updating existing ones.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importrequests.ImportResponse>> result = apiRoot
 *            .withProjectKeyValue("{projectKey}")
 *            .standalonePrices()
 *            .importContainers()
 *            .withImportContainerKeyValue("{importContainerKey}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyStandalonePricesImportContainersByImportContainerKeyPostString extends StringBodyApiMethod<ByProjectKeyStandalonePricesImportContainersByImportContainerKeyPostString, com.commercetools.importapi.models.importrequests.ImportResponse> implements com.commercetools.importapi.client.Secured_by_manage_standalone_pricesTrait<ByProjectKeyStandalonePricesImportContainersByImportContainerKeyPostString> {

    
    private String projectKey;
    private String importContainerKey;
    
    private String standalonePriceImportRequest;

    public ByProjectKeyStandalonePricesImportContainersByImportContainerKeyPostString(final ApiHttpClient apiHttpClient, String projectKey, String importContainerKey, String standalonePriceImportRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
        this.standalonePriceImportRequest = standalonePriceImportRequest;
    }

    public ByProjectKeyStandalonePricesImportContainersByImportContainerKeyPostString(ByProjectKeyStandalonePricesImportContainersByImportContainerKeyPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importContainerKey = t.importContainerKey;
        this.standalonePriceImportRequest = t.standalonePriceImportRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/standalone-prices/import-containers/%s", this.projectKey, this.importContainerKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), standalonePriceImportRequest.getBytes(StandardCharsets.UTF_8));
    
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importrequests.ImportResponse> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.importapi.models.importrequests.ImportResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importrequests.ImportResponse>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.importapi.models.importrequests.ImportResponse.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getImportContainerKey() {return this.importContainerKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setImportContainerKey(final String importContainerKey) { this.importContainerKey = importContainerKey; }


    
    public String getBody() {
        return standalonePriceImportRequest;
    }
    
    public ByProjectKeyStandalonePricesImportContainersByImportContainerKeyPostString withBody(String standalonePriceImportRequest) {
        ByProjectKeyStandalonePricesImportContainersByImportContainerKeyPostString t = copy();
        t.standalonePriceImportRequest = standalonePriceImportRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyStandalonePricesImportContainersByImportContainerKeyPostString that = (ByProjectKeyStandalonePricesImportContainersByImportContainerKeyPostString) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(importContainerKey, that.importContainerKey)
                .append(standalonePriceImportRequest, that.standalonePriceImportRequest)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(importContainerKey)
            .append(standalonePriceImportRequest)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyStandalonePricesImportContainersByImportContainerKeyPostString copy() {
        return new ByProjectKeyStandalonePricesImportContainersByImportContainerKeyPostString(this);
    }
}
