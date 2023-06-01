package com.commercetools.api.client;

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
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.project.Project>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyGet extends ApiMethod<ByProjectKeyGet, com.commercetools.api.models.project.Project> implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyGet>, com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyGet> {

    
    private String projectKey;
    

    public ByProjectKeyGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyGet(ByProjectKeyGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.project.Project> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.project.Project.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.project.Project>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.project.Project.class);
    }

    public String getProjectKey() {return this.projectKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }


    

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyGet that = (ByProjectKeyGet) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyGet copy() {
        return new ByProjectKeyGet(this);
    }
}
