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
 *  <p>Upload a JPEG, PNG and GIF file to a ProductVariant. The maximum file size of the image is 10MB. <code>variant</code> or <code>sku</code> is required to update a specific ProductVariant. The image is uploaded to the Master Variant if <code>variant</code> or <code>sku</code> are not included. Produces the ProductImageAdded Message when the <code>Small</code> version of the image has been uploaded to the CDN.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.Product>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .products()
 *            .withId("{ID}")
 *            .images()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyProductsByIDImagesPostString extends StringBodyApiMethod<ByProjectKeyProductsByIDImagesPostString, com.commercetools.api.models.product.Product> {

    
    private String projectKey;
    private String ID;
    
    private String file;

    public ByProjectKeyProductsByIDImagesPostString(final ApiHttpClient apiHttpClient, String projectKey, String ID, String file) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.file = file;
    }

    public ByProjectKeyProductsByIDImagesPostString(ByProjectKeyProductsByIDImagesPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.file = t.file;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/products/%s/images", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), file.getBytes(StandardCharsets.UTF_8));
    
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product.Product> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.product.Product.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.Product>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.product.Product.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getID() {return this.ID;}

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

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setID(final String ID) { this.ID = ID; }

    /**
     * set filename with the specified value
     * @param <TValue> value type
     * @param filename value to be set
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public <TValue> ByProjectKeyProductsByIDImagesPostString withFilename(final TValue filename) {
        return copy().withQueryParam("filename", filename);
    }
    
    /**
     * add additional filename query parameter
     * @param <TValue> value type
     * @param filename value to be added
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public <TValue> ByProjectKeyProductsByIDImagesPostString addFilename(final TValue filename) {
        return copy().addQueryParam("filename", filename);
    }
    
    /**
     * set filename with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public ByProjectKeyProductsByIDImagesPostString withFilename(final Supplier<String> supplier) {
        return copy().withQueryParam("filename", supplier.get());
    }
    
    /**
     * add additional filename query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public ByProjectKeyProductsByIDImagesPostString addFilename(final Supplier<String> supplier) {
        return copy().addQueryParam("filename", supplier.get());
    }
    
    /**
     * set filename with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public ByProjectKeyProductsByIDImagesPostString withFilename(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("filename", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional filename query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public ByProjectKeyProductsByIDImagesPostString addFilename(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("filename", op.apply(new StringBuilder()));
    }
    
    /**
     * set filename with the specified values
     * @param <TValue> value type
     * @param filename values to be set
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public <TValue> ByProjectKeyProductsByIDImagesPostString withFilename(final Collection<TValue> filename) {
        return copy().withoutQueryParam("filename").addQueryParams(filename.stream().map(s -> new ParamEntry<>("filename", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional filename query parameters
     * @param <TValue> value type
     * @param filename values to be added
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public <TValue> ByProjectKeyProductsByIDImagesPostString addFilename(final Collection<TValue> filename) {
        return copy().addQueryParams(filename.stream().map(s -> new ParamEntry<>("filename", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * set variant with the specified value
     * @param <TValue> value type
     * @param variant value to be set
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public <TValue> ByProjectKeyProductsByIDImagesPostString withVariant(final TValue variant) {
        return copy().withQueryParam("variant", variant);
    }
    
    /**
     * add additional variant query parameter
     * @param <TValue> value type
     * @param variant value to be added
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public <TValue> ByProjectKeyProductsByIDImagesPostString addVariant(final TValue variant) {
        return copy().addQueryParam("variant", variant);
    }
    
    /**
     * set variant with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public ByProjectKeyProductsByIDImagesPostString withVariant(final Supplier<Long> supplier) {
        return copy().withQueryParam("variant", supplier.get());
    }
    
    /**
     * add additional variant query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public ByProjectKeyProductsByIDImagesPostString addVariant(final Supplier<Long> supplier) {
        return copy().addQueryParam("variant", supplier.get());
    }
    
    /**
     * set variant with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public ByProjectKeyProductsByIDImagesPostString withVariant(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("variant", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional variant query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public ByProjectKeyProductsByIDImagesPostString addVariant(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("variant", op.apply(new StringBuilder()));
    }
    
    /**
     * set variant with the specified values
     * @param <TValue> value type
     * @param variant values to be set
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public <TValue> ByProjectKeyProductsByIDImagesPostString withVariant(final Collection<TValue> variant) {
        return copy().withoutQueryParam("variant").addQueryParams(variant.stream().map(s -> new ParamEntry<>("variant", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional variant query parameters
     * @param <TValue> value type
     * @param variant values to be added
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public <TValue> ByProjectKeyProductsByIDImagesPostString addVariant(final Collection<TValue> variant) {
        return copy().addQueryParams(variant.stream().map(s -> new ParamEntry<>("variant", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * set sku with the specified value
     * @param <TValue> value type
     * @param sku value to be set
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public <TValue> ByProjectKeyProductsByIDImagesPostString withSku(final TValue sku) {
        return copy().withQueryParam("sku", sku);
    }
    
    /**
     * add additional sku query parameter
     * @param <TValue> value type
     * @param sku value to be added
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public <TValue> ByProjectKeyProductsByIDImagesPostString addSku(final TValue sku) {
        return copy().addQueryParam("sku", sku);
    }
    
    /**
     * set sku with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public ByProjectKeyProductsByIDImagesPostString withSku(final Supplier<String> supplier) {
        return copy().withQueryParam("sku", supplier.get());
    }
    
    /**
     * add additional sku query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public ByProjectKeyProductsByIDImagesPostString addSku(final Supplier<String> supplier) {
        return copy().addQueryParam("sku", supplier.get());
    }
    
    /**
     * set sku with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public ByProjectKeyProductsByIDImagesPostString withSku(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("sku", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional sku query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public ByProjectKeyProductsByIDImagesPostString addSku(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("sku", op.apply(new StringBuilder()));
    }
    
    /**
     * set sku with the specified values
     * @param <TValue> value type
     * @param sku values to be set
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public <TValue> ByProjectKeyProductsByIDImagesPostString withSku(final Collection<TValue> sku) {
        return copy().withoutQueryParam("sku").addQueryParams(sku.stream().map(s -> new ParamEntry<>("sku", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional sku query parameters
     * @param <TValue> value type
     * @param sku values to be added
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public <TValue> ByProjectKeyProductsByIDImagesPostString addSku(final Collection<TValue> sku) {
        return copy().addQueryParams(sku.stream().map(s -> new ParamEntry<>("sku", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * set staged with the specified value
     * @param <TValue> value type
     * @param staged value to be set
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public <TValue> ByProjectKeyProductsByIDImagesPostString withStaged(final TValue staged) {
        return copy().withQueryParam("staged", staged);
    }
    
    /**
     * add additional staged query parameter
     * @param <TValue> value type
     * @param staged value to be added
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public <TValue> ByProjectKeyProductsByIDImagesPostString addStaged(final TValue staged) {
        return copy().addQueryParam("staged", staged);
    }
    
    /**
     * set staged with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public ByProjectKeyProductsByIDImagesPostString withStaged(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("staged", supplier.get());
    }
    
    /**
     * add additional staged query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public ByProjectKeyProductsByIDImagesPostString addStaged(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("staged", supplier.get());
    }
    
    /**
     * set staged with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public ByProjectKeyProductsByIDImagesPostString withStaged(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("staged", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional staged query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public ByProjectKeyProductsByIDImagesPostString addStaged(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("staged", op.apply(new StringBuilder()));
    }
    
    /**
     * set staged with the specified values
     * @param <TValue> value type
     * @param staged values to be set
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public <TValue> ByProjectKeyProductsByIDImagesPostString withStaged(final Collection<TValue> staged) {
        return copy().withoutQueryParam("staged").addQueryParams(staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional staged query parameters
     * @param <TValue> value type
     * @param staged values to be added
     * @return ByProjectKeyProductsByIDImagesPostString
     */
    public <TValue> ByProjectKeyProductsByIDImagesPostString addStaged(final Collection<TValue> staged) {
        return copy().addQueryParams(staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList())); 
    }

    
    public String getBody() {
        return file;
    }
    
    public ByProjectKeyProductsByIDImagesPostString withBody(String file) {
        ByProjectKeyProductsByIDImagesPostString t = copy();
        t.file = file;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyProductsByIDImagesPostString that = (ByProjectKeyProductsByIDImagesPostString) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(file, that.file)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(ID)
            .append(file)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyProductsByIDImagesPostString copy() {
        return new ByProjectKeyProductsByIDImagesPostString(this);
    }
}
