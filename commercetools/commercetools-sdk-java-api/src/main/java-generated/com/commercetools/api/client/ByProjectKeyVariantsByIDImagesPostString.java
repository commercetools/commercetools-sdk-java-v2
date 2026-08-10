
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
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyVariantsByIDImagesPostString extends
        StringBodyApiMethod<ByProjectKeyVariantsByIDImagesPostString, com.commercetools.api.models.variant.Variant> {

    @Override
    public TypeReference<com.commercetools.api.models.variant.Variant> resultType() {
        return new TypeReference<com.commercetools.api.models.variant.Variant>() {
        };
    }

    private String projectKey;
    private String ID;

    private String file;

    public ByProjectKeyVariantsByIDImagesPostString(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            String file) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.file = file;
    }

    public ByProjectKeyVariantsByIDImagesPostString(ByProjectKeyVariantsByIDImagesPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.file = t.file;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/variants/%s/images", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            file.getBytes(StandardCharsets.UTF_8));

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
     * @param <TValue> value type
     * @param filename value to be set
     * @return ByProjectKeyVariantsByIDImagesPostString
     */
    public <TValue> ByProjectKeyVariantsByIDImagesPostString withFilename(final TValue filename) {
        return copy().withQueryParam("filename", filename);
    }

    /**
     * add additional filename query parameter
     * @param <TValue> value type
     * @param filename value to be added
     * @return ByProjectKeyVariantsByIDImagesPostString
     */
    public <TValue> ByProjectKeyVariantsByIDImagesPostString addFilename(final TValue filename) {
        return copy().addQueryParam("filename", filename);
    }

    /**
     * set filename with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyVariantsByIDImagesPostString
     */
    public ByProjectKeyVariantsByIDImagesPostString withFilename(final Supplier<String> supplier) {
        return copy().withQueryParam("filename", supplier.get());
    }

    /**
     * add additional filename query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyVariantsByIDImagesPostString
     */
    public ByProjectKeyVariantsByIDImagesPostString addFilename(final Supplier<String> supplier) {
        return copy().addQueryParam("filename", supplier.get());
    }

    /**
     * set filename with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyVariantsByIDImagesPostString
     */
    public ByProjectKeyVariantsByIDImagesPostString withFilename(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("filename", op.apply(new StringBuilder()));
    }

    /**
     * add additional filename query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyVariantsByIDImagesPostString
     */
    public ByProjectKeyVariantsByIDImagesPostString addFilename(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("filename", op.apply(new StringBuilder()));
    }

    /**
     * set filename with the specified values
     * @param <TValue> value type
     * @param filename values to be set
     * @return ByProjectKeyVariantsByIDImagesPostString
     */
    public <TValue> ByProjectKeyVariantsByIDImagesPostString withFilename(final Collection<TValue> filename) {
        return copy().withoutQueryParam("filename")
                .addQueryParams(filename.stream()
                        .map(s -> new ParamEntry<>("filename", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional filename query parameters
     * @param <TValue> value type
     * @param filename values to be added
     * @return ByProjectKeyVariantsByIDImagesPostString
     */
    public <TValue> ByProjectKeyVariantsByIDImagesPostString addFilename(final Collection<TValue> filename) {
        return copy().addQueryParams(
            filename.stream().map(s -> new ParamEntry<>("filename", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set staged with the specified value
     * @param <TValue> value type
     * @param staged value to be set
     * @return ByProjectKeyVariantsByIDImagesPostString
     */
    public <TValue> ByProjectKeyVariantsByIDImagesPostString withStaged(final TValue staged) {
        return copy().withQueryParam("staged", staged);
    }

    /**
     * add additional staged query parameter
     * @param <TValue> value type
     * @param staged value to be added
     * @return ByProjectKeyVariantsByIDImagesPostString
     */
    public <TValue> ByProjectKeyVariantsByIDImagesPostString addStaged(final TValue staged) {
        return copy().addQueryParam("staged", staged);
    }

    /**
     * set staged with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyVariantsByIDImagesPostString
     */
    public ByProjectKeyVariantsByIDImagesPostString withStaged(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("staged", supplier.get());
    }

    /**
     * add additional staged query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyVariantsByIDImagesPostString
     */
    public ByProjectKeyVariantsByIDImagesPostString addStaged(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("staged", supplier.get());
    }

    /**
     * set staged with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyVariantsByIDImagesPostString
     */
    public ByProjectKeyVariantsByIDImagesPostString withStaged(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * add additional staged query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyVariantsByIDImagesPostString
     */
    public ByProjectKeyVariantsByIDImagesPostString addStaged(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * set staged with the specified values
     * @param <TValue> value type
     * @param staged values to be set
     * @return ByProjectKeyVariantsByIDImagesPostString
     */
    public <TValue> ByProjectKeyVariantsByIDImagesPostString withStaged(final Collection<TValue> staged) {
        return copy().withoutQueryParam("staged")
                .addQueryParams(
                    staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional staged query parameters
     * @param <TValue> value type
     * @param staged values to be added
     * @return ByProjectKeyVariantsByIDImagesPostString
     */
    public <TValue> ByProjectKeyVariantsByIDImagesPostString addStaged(final Collection<TValue> staged) {
        return copy().addQueryParams(
            staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return file;
    }

    public ByProjectKeyVariantsByIDImagesPostString withBody(String file) {
        ByProjectKeyVariantsByIDImagesPostString t = copy();
        t.file = file;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyVariantsByIDImagesPostString that = (ByProjectKeyVariantsByIDImagesPostString) o;

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
    protected ByProjectKeyVariantsByIDImagesPostString copy() {
        return new ByProjectKeyVariantsByIDImagesPostString(this);
    }
}
