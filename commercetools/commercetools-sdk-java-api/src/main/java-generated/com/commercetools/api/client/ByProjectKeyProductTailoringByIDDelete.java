
package com.commercetools.api.client;

import java.net.URI;
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
 *  <p>Generates the ProductTailoringDeleted Message.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_tailoring.ProductTailoring>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .productTailoring()
 *            .withId("{ID}")
 *            .delete()
 *            .withVersion(version)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductTailoringByIDDelete extends
        TypeApiMethod<ByProjectKeyProductTailoringByIDDelete, com.commercetools.api.models.product_tailoring.ProductTailoring>
        implements com.commercetools.api.client.VersionedTrait<ByProjectKeyProductTailoringByIDDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyProductTailoringByIDDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductTailoringByIDDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductTailoringByIDDelete>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductTailoringByIDDelete> {

    @Override
    public TypeReference<com.commercetools.api.models.product_tailoring.ProductTailoring> resultType() {
        return new TypeReference<com.commercetools.api.models.product_tailoring.ProductTailoring>() {
        };
    }

    private String projectKey;
    private String ID;

    public ByProjectKeyProductTailoringByIDDelete(final ApiHttpClient apiHttpClient, String projectKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyProductTailoringByIDDelete(ByProjectKeyProductTailoringByIDDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/product-tailoring/%s", encodePathParam(this.projectKey),
            encodePathParam(this.ID));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
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

    public String getID() {
        return this.ID;
    }

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set version with the specified value
     * @param version value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductTailoringByIDDelete
     */
    public <TValue> ByProjectKeyProductTailoringByIDDelete withVersion(final TValue version) {
        return copy().withQueryParam("version", version);
    }

    /**
     * add additional version query parameter
     * @param version value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductTailoringByIDDelete
     */
    public <TValue> ByProjectKeyProductTailoringByIDDelete addVersion(final TValue version) {
        return copy().addQueryParam("version", version);
    }

    /**
     * set version with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductTailoringByIDDelete
     */
    public ByProjectKeyProductTailoringByIDDelete withVersion(final Supplier<Long> supplier) {
        return copy().withQueryParam("version", supplier.get());
    }

    /**
     * add additional version query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductTailoringByIDDelete
     */
    public ByProjectKeyProductTailoringByIDDelete addVersion(final Supplier<Long> supplier) {
        return copy().addQueryParam("version", supplier.get());
    }

    /**
     * set version with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductTailoringByIDDelete
     */
    public ByProjectKeyProductTailoringByIDDelete withVersion(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("version", op.apply(new StringBuilder()));
    }

    /**
     * add additional version query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductTailoringByIDDelete
     */
    public ByProjectKeyProductTailoringByIDDelete addVersion(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("version", op.apply(new StringBuilder()));
    }

    /**
     * set version with the specified values
     * @param version values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductTailoringByIDDelete
     */
    public <TValue> ByProjectKeyProductTailoringByIDDelete withVersion(final Collection<TValue> version) {
        return copy().withoutQueryParam("version")
                .addQueryParams(
                    version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional version query parameters
     * @param version values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductTailoringByIDDelete
     */
    public <TValue> ByProjectKeyProductTailoringByIDDelete addVersion(final Collection<TValue> version) {
        return copy().addQueryParams(
            version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductTailoringByIDDelete
     */
    public <TValue> ByProjectKeyProductTailoringByIDDelete withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductTailoringByIDDelete
     */
    public <TValue> ByProjectKeyProductTailoringByIDDelete addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductTailoringByIDDelete
     */
    public ByProjectKeyProductTailoringByIDDelete withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductTailoringByIDDelete
     */
    public ByProjectKeyProductTailoringByIDDelete addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductTailoringByIDDelete
     */
    public ByProjectKeyProductTailoringByIDDelete withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductTailoringByIDDelete
     */
    public ByProjectKeyProductTailoringByIDDelete addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductTailoringByIDDelete
     */
    public <TValue> ByProjectKeyProductTailoringByIDDelete withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductTailoringByIDDelete
     */
    public <TValue> ByProjectKeyProductTailoringByIDDelete addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductTailoringByIDDelete that = (ByProjectKeyProductTailoringByIDDelete) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(ID, that.ID).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).toHashCode();
    }

    @Override
    protected ByProjectKeyProductTailoringByIDDelete copy() {
        return new ByProjectKeyProductTailoringByIDDelete(this);
    }
}
