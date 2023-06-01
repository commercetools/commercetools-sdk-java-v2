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
 *  <p>Creates a new import request for product variant patches</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importrequests.ImportResponse>> result = apiRoot
 *            .withProjectKeyValue("{projectKey}")
 *            .productVariantPatches()
 *            .importContainers()
 *            .withImportContainerKeyValue("{importContainerKey}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyPost extends BodyApiMethod<ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyPost, com.commercetools.importapi.models.importrequests.ImportResponse, com.commercetools.importapi.models.importrequests.ProductVariantPatchRequest> implements com.commercetools.importapi.client.Secured_by_manage_productsTrait<ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyPost> {

    
    private String projectKey;
    private String importContainerKey;
    
    private com.commercetools.importapi.models.importrequests.ProductVariantPatchRequest productVariantPatchRequest;

    public ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String importContainerKey, com.commercetools.importapi.models.importrequests.ProductVariantPatchRequest productVariantPatchRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
        this.productVariantPatchRequest = productVariantPatchRequest;
    }

    public ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyPost(ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importContainerKey = t.importContainerKey;
        this.productVariantPatchRequest = t.productVariantPatchRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/product-variant-patches/import-containers/%s", this.projectKey, this.importContainerKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), io.vrap.rmf.base.client.utils.json.JsonUtils.executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(productVariantPatchRequest)));
    
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


    
    public com.commercetools.importapi.models.importrequests.ProductVariantPatchRequest getBody() {
        return productVariantPatchRequest;
    }
    
    public ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyPost withBody(com.commercetools.importapi.models.importrequests.ProductVariantPatchRequest productVariantPatchRequest) {
        ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyPost t = copy();
        t.productVariantPatchRequest = productVariantPatchRequest;
        return t;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyPost that = (ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyPost) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(importContainerKey, that.importContainerKey)
                .append(productVariantPatchRequest, that.productVariantPatchRequest)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(importContainerKey)
            .append(productVariantPatchRequest)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyPost copy() {
        return new ByProjectKeyProductVariantPatchesImportContainersByImportContainerKeyPost(this);
    }
}
