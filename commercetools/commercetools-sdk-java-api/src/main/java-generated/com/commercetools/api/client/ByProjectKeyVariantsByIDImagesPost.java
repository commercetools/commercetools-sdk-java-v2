
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

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import tools.jackson.core.type.TypeReference;

/**
 *  <p>Uploads a JPEG, PNG, or a GIF image file to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a> identified by its ID. The maximum file size of the image is <strong>10MB</strong>.</p>
 *  <p>The response status code depends on the size of the original image. If the image is small, the API responds with <code>200 OK</code>, and if the image is larger, it responds with <code>202 Accepted</code>. The Variant returned with a <code>202 Accepted</code> status code contains a <code>warnings</code> field with an <a href="https://docs.commercetools.com/apis/ctp:api:type:ImageProcessingOngoingWarning" rel="nofollow">ImageProcessingOngoing</a> Warning.</p>
 *  <p>Produces the <span>VariantImageAdded</span> Message.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.variant.Variant>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .variants()
 *            .withId("{ID}")
 *            .images()
 *            .post(file)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyVariantsByIDImagesPost extends
        TypeBodyApiMethod<ByProjectKeyVariantsByIDImagesPost, com.commercetools.api.models.variant.Variant, java.io.File> {

    @Override
    public TypeReference<com.commercetools.api.models.variant.Variant> resultType() {
        return new TypeReference<com.commercetools.api.models.variant.Variant>() {
        };
    }

    private String projectKey;
    private String ID;

    private java.io.File file;

    public ByProjectKeyVariantsByIDImagesPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            java.io.File file) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.file = file;
    }

    public ByProjectKeyVariantsByIDImagesPost(ByProjectKeyVariantsByIDImagesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.file = t.file;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/variants/%s/images", encodePathParam(this.projectKey),
            encodePathParam(this.ID));
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
    public ApiHttpResponse<com.commercetools.api.models.variant.Variant> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.variant.Variant.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.variant.Variant>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.variant.Variant.class);
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
     * set filename with the specified value
     * @param filename value to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantsByIDImagesPost
     */
    public <TValue> ByProjectKeyVariantsByIDImagesPost withFilename(final TValue filename) {
        return copy().withQueryParam("filename", filename);
    }

    /**
     * add additional filename query parameter
     * @param filename value to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantsByIDImagesPost
     */
    public <TValue> ByProjectKeyVariantsByIDImagesPost addFilename(final TValue filename) {
        return copy().addQueryParam("filename", filename);
    }

    /**
     * set filename with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyVariantsByIDImagesPost
     */
    public ByProjectKeyVariantsByIDImagesPost withFilename(final Supplier<String> supplier) {
        return copy().withQueryParam("filename", supplier.get());
    }

    /**
     * add additional filename query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyVariantsByIDImagesPost
     */
    public ByProjectKeyVariantsByIDImagesPost addFilename(final Supplier<String> supplier) {
        return copy().addQueryParam("filename", supplier.get());
    }

    /**
     * set filename with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyVariantsByIDImagesPost
     */
    public ByProjectKeyVariantsByIDImagesPost withFilename(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("filename", op.apply(new StringBuilder()));
    }

    /**
     * add additional filename query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyVariantsByIDImagesPost
     */
    public ByProjectKeyVariantsByIDImagesPost addFilename(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("filename", op.apply(new StringBuilder()));
    }

    /**
     * set filename with the specified values
     * @param filename values to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantsByIDImagesPost
     */
    public <TValue> ByProjectKeyVariantsByIDImagesPost withFilename(final Collection<TValue> filename) {
        return copy().withoutQueryParam("filename")
                .addQueryParams(filename.stream()
                        .map(s -> new ParamEntry<>("filename", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional filename query parameters
     * @param filename values to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantsByIDImagesPost
     */
    public <TValue> ByProjectKeyVariantsByIDImagesPost addFilename(final Collection<TValue> filename) {
        return copy().addQueryParams(
            filename.stream().map(s -> new ParamEntry<>("filename", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set staged with the specified value
     * @param staged value to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantsByIDImagesPost
     */
    public <TValue> ByProjectKeyVariantsByIDImagesPost withStaged(final TValue staged) {
        return copy().withQueryParam("staged", staged);
    }

    /**
     * add additional staged query parameter
     * @param staged value to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantsByIDImagesPost
     */
    public <TValue> ByProjectKeyVariantsByIDImagesPost addStaged(final TValue staged) {
        return copy().addQueryParam("staged", staged);
    }

    /**
     * set staged with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyVariantsByIDImagesPost
     */
    public ByProjectKeyVariantsByIDImagesPost withStaged(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("staged", supplier.get());
    }

    /**
     * add additional staged query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyVariantsByIDImagesPost
     */
    public ByProjectKeyVariantsByIDImagesPost addStaged(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("staged", supplier.get());
    }

    /**
     * set staged with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyVariantsByIDImagesPost
     */
    public ByProjectKeyVariantsByIDImagesPost withStaged(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * add additional staged query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyVariantsByIDImagesPost
     */
    public ByProjectKeyVariantsByIDImagesPost addStaged(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * set staged with the specified values
     * @param staged values to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantsByIDImagesPost
     */
    public <TValue> ByProjectKeyVariantsByIDImagesPost withStaged(final Collection<TValue> staged) {
        return copy().withoutQueryParam("staged")
                .addQueryParams(
                    staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional staged query parameters
     * @param staged values to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantsByIDImagesPost
     */
    public <TValue> ByProjectKeyVariantsByIDImagesPost addStaged(final Collection<TValue> staged) {
        return copy().addQueryParams(
            staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    public java.io.File getBody() {
        return file;
    }

    public ByProjectKeyVariantsByIDImagesPost withBody(java.io.File file) {
        ByProjectKeyVariantsByIDImagesPost t = copy();
        t.file = file;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyVariantsByIDImagesPost that = (ByProjectKeyVariantsByIDImagesPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(file, that.file)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(file).toHashCode();
    }

    @Override
    protected ByProjectKeyVariantsByIDImagesPost copy() {
        return new ByProjectKeyVariantsByIDImagesPost(this);
    }
}
