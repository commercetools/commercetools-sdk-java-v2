
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomObjectsByContainerByKeyDelete extends
        ApiMethod<ByProjectKeyCustomObjectsByContainerByKeyDelete, com.commercetools.api.models.custom_object.CustomObject>
        implements com.commercetools.api.client.DataerasureTrait<ByProjectKeyCustomObjectsByContainerByKeyDelete>,
        com.commercetools.api.client.VersionedTrait<ByProjectKeyCustomObjectsByContainerByKeyDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyCustomObjectsByContainerByKeyDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomObjectsByContainerByKeyDelete>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyCustomObjectsByContainerByKeyDelete> {

    private String projectKey;
    private String container;
    private String key;

    public ByProjectKeyCustomObjectsByContainerByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey,
            String container, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.container = container;
        this.key = key;
    }

    public ByProjectKeyCustomObjectsByContainerByKeyDelete(ByProjectKeyCustomObjectsByContainerByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.container = t.container;
        this.key = t.key;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/custom-objects/%s/%s", this.projectKey, this.container, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObject> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.custom_object.CustomObject.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObject>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.custom_object.CustomObject.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getContainer() {
        return this.container;
    }

    public String getKey() {
        return this.key;
    }

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public List<String> getDataErasure() {
        return this.getQueryParam("dataErasure");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setContainer(final String container) {
        this.container = container;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set version with the specified value
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerByKeyDelete withVersion(final TValue version) {
        return copy().withQueryParam("version", version);
    }

    /**
     * add additional version query parameter
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerByKeyDelete addVersion(final TValue version) {
        return copy().addQueryParam("version", version);
    }

    /**
     * set version with the specified value
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete withVersion(final Supplier<Long> supplier) {
        return copy().withQueryParam("version", supplier.get());
    }

    /**
     * add additional version query parameter
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete addVersion(final Supplier<Long> supplier) {
        return copy().addQueryParam("version", supplier.get());
    }

    /**
     * set version with the specified value
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete withVersion(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("version", op.apply(new StringBuilder()));
    }

    /**
     * add additional version query parameter
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete addVersion(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("version", op.apply(new StringBuilder()));
    }

    /**
     * set version with the specified values
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerByKeyDelete withVersion(final List<TValue> version) {
        return copy().withoutQueryParam("version")
                .addQueryParams(
                    version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional version query parameters
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerByKeyDelete addVersion(final List<TValue> version) {
        return copy().addQueryParams(
            version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerByKeyDelete withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerByKeyDelete addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerByKeyDelete withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerByKeyDelete addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set dataErasure with the specified value
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerByKeyDelete withDataErasure(final TValue dataErasure) {
        return copy().withQueryParam("dataErasure", dataErasure);
    }

    /**
     * add additional dataErasure query parameter
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerByKeyDelete addDataErasure(final TValue dataErasure) {
        return copy().addQueryParam("dataErasure", dataErasure);
    }

    /**
     * set dataErasure with the specified value
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete withDataErasure(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("dataErasure", supplier.get());
    }

    /**
     * add additional dataErasure query parameter
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete addDataErasure(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("dataErasure", supplier.get());
    }

    /**
     * set dataErasure with the specified value
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete withDataErasure(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("dataErasure", op.apply(new StringBuilder()));
    }

    /**
     * add additional dataErasure query parameter
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete addDataErasure(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("dataErasure", op.apply(new StringBuilder()));
    }

    /**
     * set dataErasure with the specified values
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerByKeyDelete withDataErasure(final List<TValue> dataErasure) {
        return copy().withoutQueryParam("dataErasure")
                .addQueryParams(dataErasure.stream()
                        .map(s -> new ParamEntry<>("dataErasure", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional dataErasure query parameters
     */
    public <TValue> ByProjectKeyCustomObjectsByContainerByKeyDelete addDataErasure(final List<TValue> dataErasure) {
        return copy().addQueryParams(
            dataErasure.stream().map(s -> new ParamEntry<>("dataErasure", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCustomObjectsByContainerByKeyDelete that = (ByProjectKeyCustomObjectsByContainerByKeyDelete) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(container, that.container)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(container).append(key).toHashCode();
    }

    @Override
    protected ByProjectKeyCustomObjectsByContainerByKeyDelete copy() {
        return new ByProjectKeyCustomObjectsByContainerByKeyDelete(this);
    }
}
