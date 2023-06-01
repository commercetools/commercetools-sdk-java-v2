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
 *  <p>Creates a new import container.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importcontainers.ImportContainer>> result = apiRoot
 *            .withProjectKeyValue("{projectKey}")
 *            .importContainers()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyImportContainersPostString extends StringBodyApiMethod<ByProjectKeyImportContainersPostString, com.commercetools.importapi.models.importcontainers.ImportContainer> implements com.commercetools.importapi.client.Secured_by_manage_import_containersTrait<ByProjectKeyImportContainersPostString> {

    
    private String projectKey;
    
    private String importContainerDraft;

    public ByProjectKeyImportContainersPostString(final ApiHttpClient apiHttpClient, String projectKey, String importContainerDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importContainerDraft = importContainerDraft;
    }

    public ByProjectKeyImportContainersPostString(ByProjectKeyImportContainersPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importContainerDraft = t.importContainerDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/import-containers", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), importContainerDraft.getBytes(StandardCharsets.UTF_8));
    
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importcontainers.ImportContainer> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.importapi.models.importcontainers.ImportContainer.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importcontainers.ImportContainer>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.importapi.models.importcontainers.ImportContainer.class);
    }

    public String getProjectKey() {return this.projectKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }


    
    public String getBody() {
        return importContainerDraft;
    }
    
    public ByProjectKeyImportContainersPostString withBody(String importContainerDraft) {
        ByProjectKeyImportContainersPostString t = copy();
        t.importContainerDraft = importContainerDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyImportContainersPostString that = (ByProjectKeyImportContainersPostString) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(importContainerDraft, that.importContainerDraft)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(importContainerDraft)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyImportContainersPostString copy() {
        return new ByProjectKeyImportContainersPostString(this);
    }
}
