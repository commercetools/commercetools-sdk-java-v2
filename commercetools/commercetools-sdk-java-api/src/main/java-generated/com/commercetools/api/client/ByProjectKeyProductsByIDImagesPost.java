
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.net.URLConnection;
import java.nio.file.Files;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Uploads a binary image file to a given product variant. The supported image formats are JPEG, PNG and GIF.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductsByIDImagesPost
        extends ApiMethod<ByProjectKeyProductsByIDImagesPost, com.commercetools.api.models.product.Product> {

    private String projectKey;
    private String ID;

    private java.io.File file;

    public ByProjectKeyProductsByIDImagesPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            java.io.File file) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.file = file;
    }

    public ByProjectKeyProductsByIDImagesPost(ByProjectKeyProductsByIDImagesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.file = t.file;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products/%s/images", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            ApiHttpHeaders headers = getHeaders();
            if (headers.getFirst(ApiHttpHeaders.CONTENT_TYPE) == null) {
                final String mimeType = Optional.ofNullable(URLConnection.guessContentTypeFromName(file.getName()))
                        .orElse("application/octet-stream");
                headers = headers.withHeader(ApiHttpHeaders.CONTENT_TYPE, mimeType);
            }
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), headers,
                Files.readAllBytes(file.toPath()));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product.Product> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.product.Product.class), request,
            timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.Product>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.product.Product.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
    }

    public List<String> getFilename() {
        return this.getQueryParam("filename");
    }

    public List<String> getVariant() {
        return this.getQueryParam("variant");
    }

    public List<String> getSku() {
        return this.getQueryParam("sku");
    }

    public List<String> getStaged() {
        return this.getQueryParam("staged");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set filename with the specificied value
     */
    public ByProjectKeyProductsByIDImagesPost withFilename(final String filename) {
        return copy().withQueryParam("filename", filename);
    }

    /**
     * add additional filename query parameter
     */
    public ByProjectKeyProductsByIDImagesPost addFilename(final String filename) {
        return copy().addQueryParam("filename", filename);
    }

    /**
     * set variant with the specificied value
     */
    public ByProjectKeyProductsByIDImagesPost withVariant(final long variant) {
        return copy().withQueryParam("variant", variant);
    }

    /**
     * add additional variant query parameter
     */
    public ByProjectKeyProductsByIDImagesPost addVariant(final long variant) {
        return copy().addQueryParam("variant", variant);
    }

    /**
     * set sku with the specificied value
     */
    public ByProjectKeyProductsByIDImagesPost withSku(final String sku) {
        return copy().withQueryParam("sku", sku);
    }

    /**
     * add additional sku query parameter
     */
    public ByProjectKeyProductsByIDImagesPost addSku(final String sku) {
        return copy().addQueryParam("sku", sku);
    }

    /**
     * set staged with the specificied value
     */
    public ByProjectKeyProductsByIDImagesPost withStaged(final boolean staged) {
        return copy().withQueryParam("staged", staged);
    }

    /**
     * add additional staged query parameter
     */
    public ByProjectKeyProductsByIDImagesPost addStaged(final boolean staged) {
        return copy().addQueryParam("staged", staged);
    }

    @Override
    protected ByProjectKeyProductsByIDImagesPost copy() {
        return new ByProjectKeyProductsByIDImagesPost(this);
    }
}
