
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
 *  <p>Uploads a JPEG, PNG and GIF file to a ProductVariantTailoring. The maximum file size of the image is <strong>10MB</strong>. Either <code>variant</code> or <code>sku</code> is required to update a specific ProductVariant. If neither is provided, the image is uploaded to the Master Variant of the Product.</p>
 *  <p>The response status code depends on the size of the original image. If the image is small, the API responds with <code>200 OK</code>, and if the image is larger, it responds with <code>202 Accepted</code>. The Product returned with a <code>202 Accepted</code> status code contains a <code>warnings</code> field with an ImageProcessingOngoing Warning.</p>
 *  <p>Produces the ProductTailoringImageAdded Message.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_tailoring.ProductTailoring>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .products()
 *            .withProductId("{productID}")
 *            .productTailoring()
 *            .images()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString extends
        StringBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString, com.commercetools.api.models.product_tailoring.ProductTailoring> {

    @Override
    public TypeReference<com.commercetools.api.models.product_tailoring.ProductTailoring> resultType() {
        return new TypeReference<com.commercetools.api.models.product_tailoring.ProductTailoring>() {
        };
    }

    private String projectKey;
    private String storeKey;
    private String productID;

    private String file;

    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString(
            final ApiHttpClient apiHttpClient, String projectKey, String storeKey, String productID, String file) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.productID = productID;
        this.file = file;
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString(
            ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.productID = t.productID;
        this.file = t.file;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/products/%s/product-tailoring/images",
            this.projectKey, this.storeKey, this.productID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            file.getBytes(StandardCharsets.UTF_8));

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

    public String getProductID() {
        return this.productID;
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

    public void setProductID(final String productID) {
        this.productID = productID;
    }

    /**
     * set filename with the specified value
     * @param <TValue> value type
     * @param filename value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString withFilename(
            final TValue filename) {
        return copy().withQueryParam("filename", filename);
    }

    /**
     * add additional filename query parameter
     * @param <TValue> value type
     * @param filename value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString addFilename(
            final TValue filename) {
        return copy().addQueryParam("filename", filename);
    }

    /**
     * set filename with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString withFilename(
            final Supplier<String> supplier) {
        return copy().withQueryParam("filename", supplier.get());
    }

    /**
     * add additional filename query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString addFilename(
            final Supplier<String> supplier) {
        return copy().addQueryParam("filename", supplier.get());
    }

    /**
     * set filename with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString withFilename(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("filename", op.apply(new StringBuilder()));
    }

    /**
     * add additional filename query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString addFilename(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("filename", op.apply(new StringBuilder()));
    }

    /**
     * set filename with the specified values
     * @param <TValue> value type
     * @param filename values to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString withFilename(
            final Collection<TValue> filename) {
        return copy().withoutQueryParam("filename")
                .addQueryParams(filename.stream()
                        .map(s -> new ParamEntry<>("filename", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional filename query parameters
     * @param <TValue> value type
     * @param filename values to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString addFilename(
            final Collection<TValue> filename) {
        return copy().addQueryParams(
            filename.stream().map(s -> new ParamEntry<>("filename", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set variant with the specified value
     * @param <TValue> value type
     * @param variant value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString withVariant(
            final TValue variant) {
        return copy().withQueryParam("variant", variant);
    }

    /**
     * add additional variant query parameter
     * @param <TValue> value type
     * @param variant value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString addVariant(
            final TValue variant) {
        return copy().addQueryParam("variant", variant);
    }

    /**
     * set variant with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString withVariant(
            final Supplier<Long> supplier) {
        return copy().withQueryParam("variant", supplier.get());
    }

    /**
     * add additional variant query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString addVariant(
            final Supplier<Long> supplier) {
        return copy().addQueryParam("variant", supplier.get());
    }

    /**
     * set variant with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString withVariant(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("variant", op.apply(new StringBuilder()));
    }

    /**
     * add additional variant query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString addVariant(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("variant", op.apply(new StringBuilder()));
    }

    /**
     * set variant with the specified values
     * @param <TValue> value type
     * @param variant values to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString withVariant(
            final Collection<TValue> variant) {
        return copy().withoutQueryParam("variant")
                .addQueryParams(
                    variant.stream().map(s -> new ParamEntry<>("variant", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional variant query parameters
     * @param <TValue> value type
     * @param variant values to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString addVariant(
            final Collection<TValue> variant) {
        return copy().addQueryParams(
            variant.stream().map(s -> new ParamEntry<>("variant", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sku with the specified value
     * @param <TValue> value type
     * @param sku value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString withSku(
            final TValue sku) {
        return copy().withQueryParam("sku", sku);
    }

    /**
     * add additional sku query parameter
     * @param <TValue> value type
     * @param sku value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString addSku(
            final TValue sku) {
        return copy().addQueryParam("sku", sku);
    }

    /**
     * set sku with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString withSku(
            final Supplier<String> supplier) {
        return copy().withQueryParam("sku", supplier.get());
    }

    /**
     * add additional sku query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString addSku(
            final Supplier<String> supplier) {
        return copy().addQueryParam("sku", supplier.get());
    }

    /**
     * set sku with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString withSku(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("sku", op.apply(new StringBuilder()));
    }

    /**
     * add additional sku query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString addSku(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("sku", op.apply(new StringBuilder()));
    }

    /**
     * set sku with the specified values
     * @param <TValue> value type
     * @param sku values to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString withSku(
            final Collection<TValue> sku) {
        return copy().withoutQueryParam("sku")
                .addQueryParams(
                    sku.stream().map(s -> new ParamEntry<>("sku", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sku query parameters
     * @param <TValue> value type
     * @param sku values to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString addSku(
            final Collection<TValue> sku) {
        return copy().addQueryParams(
            sku.stream().map(s -> new ParamEntry<>("sku", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set staged with the specified value
     * @param <TValue> value type
     * @param staged value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString withStaged(
            final TValue staged) {
        return copy().withQueryParam("staged", staged);
    }

    /**
     * add additional staged query parameter
     * @param <TValue> value type
     * @param staged value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString addStaged(
            final TValue staged) {
        return copy().addQueryParam("staged", staged);
    }

    /**
     * set staged with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString withStaged(
            final Supplier<Boolean> supplier) {
        return copy().withQueryParam("staged", supplier.get());
    }

    /**
     * add additional staged query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString addStaged(
            final Supplier<Boolean> supplier) {
        return copy().addQueryParam("staged", supplier.get());
    }

    /**
     * set staged with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString withStaged(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * add additional staged query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString addStaged(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * set staged with the specified values
     * @param <TValue> value type
     * @param staged values to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString withStaged(
            final Collection<TValue> staged) {
        return copy().withoutQueryParam("staged")
                .addQueryParams(
                    staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional staged query parameters
     * @param <TValue> value type
     * @param staged values to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString addStaged(
            final Collection<TValue> staged) {
        return copy().addQueryParams(
            staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return file;
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString withBody(String file) {
        ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString t = copy();
        t.file = file;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString that = (ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(productID, that.productID)
                .append(file, that.file)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(storeKey)
                .append(productID)
                .append(file)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPostString(this);
    }
}
