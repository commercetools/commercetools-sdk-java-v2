package com.commercetools.ml.client;

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
 *  <p>Get the current image search config.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .imageSearch()
 *            .config()
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyImageSearchConfigGet extends ApiMethod<ByProjectKeyImageSearchConfigGet, com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse> {

    
    private String projectKey;
    

    public ByProjectKeyImageSearchConfigGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyImageSearchConfigGet(ByProjectKeyImageSearchConfigGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/image-search/config", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse.class);
    }

    public String getProjectKey() {return this.projectKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }


    

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyImageSearchConfigGet that = (ByProjectKeyImageSearchConfigGet) o;
    
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
    protected ByProjectKeyImageSearchConfigGet copy() {
        return new ByProjectKeyImageSearchConfigGet(this);
    }
}
