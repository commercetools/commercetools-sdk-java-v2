
package com.commercetools.api.client;

import java.net.URI;
import java.net.URLConnection;
import java.nio.file.Files;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Upload a JPEG, PNG and GIF file to a ProductTailoringVariant. The maximum file size of the image is 10MB. <code>variant</code> or <code>sku</code> is required to update a specific ProductVariant. Produces the ProductTailoringImageAdded Message when the <code>Small</code> version of the image has been uploaded to the CDN.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_tailoring.ProductTailoring>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .products()
 *            .withProductKey("{productKey}")
 *            .productTailoring()
 *            .images()
 *            .post(file)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost extends
        TypeBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost, com.commercetools.api.models.product_tailoring.ProductTailoring, java.io.File> {

    @Override
    public TypeReference<com.commercetools.api.models.product_tailoring.ProductTailoring> resultType() {
        return new TypeReference<com.commercetools.api.models.product_tailoring.ProductTailoring>() {
        };
    }

    private String projectKey;
    private String storeKey;
    private String productKey;

    private java.io.File file;

    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost(
            final ApiHttpClient apiHttpClient, String projectKey, String storeKey, String productKey,
            java.io.File file) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.productKey = productKey;
        this.file = file;
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost(
            ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.productKey = t.productKey;
        this.file = t.file;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/products/key=%s/product-tailoring/images",
            this.projectKey, this.storeKey, this.productKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        ApiHttpHeaders headers = getHeaders();
        if (headers.getFirst(ApiHttpHeaders.CONTENT_TYPE) == null) {
            final String mimeType = Optional.ofNullable(URLConnection.guessContentTypeFromName(file.getName()))
                    .orElse("application/octet-stream");
            headers = headers.withHeader(ApiHttpHeaders.CONTENT_TYPE, mimeType);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), headers,
            io.vrap.rmf.base.client.utils.FileUtils.executing(() -> Files.readAllBytes(file.toPath())));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product_tailoring.ProductTailoring> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.product_tailoring.ProductTailoring.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_tailoring.ProductTailoring>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.product_tailoring.ProductTailoring.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public String getProductKey() {
        return this.productKey;
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

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    public void setProductKey(final String productKey) {
        this.productKey = productKey;
    }

    /**
     * set filename with the specified value
     * @param filename value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost withFilename(
            final TValue filename) {
        return copy().withQueryParam("filename", filename);
    }

    /**
     * add additional filename query parameter
     * @param filename value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost addFilename(
            final TValue filename) {
        return copy().addQueryParam("filename", filename);
    }

    /**
     * set filename with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost withFilename(
            final Supplier<String> supplier) {
        return copy().withQueryParam("filename", supplier.get());
    }

    /**
     * add additional filename query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost addFilename(
            final Supplier<String> supplier) {
        return copy().addQueryParam("filename", supplier.get());
    }

    /**
     * set filename with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost withFilename(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("filename", op.apply(new StringBuilder()));
    }

    /**
     * add additional filename query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost addFilename(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("filename", op.apply(new StringBuilder()));
    }

    /**
     * set filename with the specified values
     * @param filename values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost withFilename(
            final Collection<TValue> filename) {
        return copy().withoutQueryParam("filename")
                .addQueryParams(filename.stream()
                        .map(s -> new ParamEntry<>("filename", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional filename query parameters
     * @param filename values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost addFilename(
            final Collection<TValue> filename) {
        return copy().addQueryParams(
            filename.stream().map(s -> new ParamEntry<>("filename", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set variant with the specified value
     * @param variant value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost withVariant(
            final TValue variant) {
        return copy().withQueryParam("variant", variant);
    }

    /**
     * add additional variant query parameter
     * @param variant value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost addVariant(
            final TValue variant) {
        return copy().addQueryParam("variant", variant);
    }

    /**
     * set variant with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost withVariant(
            final Supplier<Long> supplier) {
        return copy().withQueryParam("variant", supplier.get());
    }

    /**
     * add additional variant query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost addVariant(
            final Supplier<Long> supplier) {
        return copy().addQueryParam("variant", supplier.get());
    }

    /**
     * set variant with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost withVariant(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("variant", op.apply(new StringBuilder()));
    }

    /**
     * add additional variant query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost addVariant(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("variant", op.apply(new StringBuilder()));
    }

    /**
     * set variant with the specified values
     * @param variant values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost withVariant(
            final Collection<TValue> variant) {
        return copy().withoutQueryParam("variant")
                .addQueryParams(
                    variant.stream().map(s -> new ParamEntry<>("variant", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional variant query parameters
     * @param variant values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost addVariant(
            final Collection<TValue> variant) {
        return copy().addQueryParams(
            variant.stream().map(s -> new ParamEntry<>("variant", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sku with the specified value
     * @param sku value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost withSku(
            final TValue sku) {
        return copy().withQueryParam("sku", sku);
    }

    /**
     * add additional sku query parameter
     * @param sku value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost addSku(
            final TValue sku) {
        return copy().addQueryParam("sku", sku);
    }

    /**
     * set sku with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost withSku(
            final Supplier<String> supplier) {
        return copy().withQueryParam("sku", supplier.get());
    }

    /**
     * add additional sku query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost addSku(
            final Supplier<String> supplier) {
        return copy().addQueryParam("sku", supplier.get());
    }

    /**
     * set sku with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost withSku(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("sku", op.apply(new StringBuilder()));
    }

    /**
     * add additional sku query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost addSku(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("sku", op.apply(new StringBuilder()));
    }

    /**
     * set sku with the specified values
     * @param sku values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost withSku(
            final Collection<TValue> sku) {
        return copy().withoutQueryParam("sku")
                .addQueryParams(
                    sku.stream().map(s -> new ParamEntry<>("sku", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sku query parameters
     * @param sku values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost addSku(
            final Collection<TValue> sku) {
        return copy().addQueryParams(
            sku.stream().map(s -> new ParamEntry<>("sku", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set staged with the specified value
     * @param staged value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost withStaged(
            final TValue staged) {
        return copy().withQueryParam("staged", staged);
    }

    /**
     * add additional staged query parameter
     * @param staged value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost addStaged(
            final TValue staged) {
        return copy().addQueryParam("staged", staged);
    }

    /**
     * set staged with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost withStaged(
            final Supplier<Boolean> supplier) {
        return copy().withQueryParam("staged", supplier.get());
    }

    /**
     * add additional staged query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost addStaged(
            final Supplier<Boolean> supplier) {
        return copy().addQueryParam("staged", supplier.get());
    }

    /**
     * set staged with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost withStaged(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * add additional staged query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost addStaged(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * set staged with the specified values
     * @param staged values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost withStaged(
            final Collection<TValue> staged) {
        return copy().withoutQueryParam("staged")
                .addQueryParams(
                    staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional staged query parameters
     * @param staged values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost addStaged(
            final Collection<TValue> staged) {
        return copy().addQueryParams(
            staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    public java.io.File getBody() {
        return file;
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost withBody(
            java.io.File file) {
        ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost t = copy();
        t.file = file;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost that = (ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(productKey, that.productKey)
                .append(file, that.file)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(storeKey)
                .append(productKey)
                .append(file)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost(this);
    }
}
