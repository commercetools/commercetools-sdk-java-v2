
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
public class ByProjectKeyStandalonePricesByIDPost extends
        BodyApiMethod<ByProjectKeyStandalonePricesByIDPost, com.commercetools.api.models.standalone_price.StandalonePrice, com.commercetools.api.models.standalone_price.StandalonePriceUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyStandalonePricesByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyStandalonePricesByIDPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyStandalonePricesByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyStandalonePricesByIDPost> {

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.standalone_price.StandalonePriceUpdate standalonePriceUpdate;

    public ByProjectKeyStandalonePricesByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.standalone_price.StandalonePriceUpdate standalonePriceUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.standalonePriceUpdate = standalonePriceUpdate;
    }

    public ByProjectKeyStandalonePricesByIDPost(ByProjectKeyStandalonePricesByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.standalonePriceUpdate = t.standalonePriceUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/standalone-prices/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(standalonePriceUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.standalone_price.StandalonePrice> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.standalone_price.StandalonePrice.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.standalone_price.StandalonePrice>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.standalone_price.StandalonePrice.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
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
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyStandalonePricesByIDPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyStandalonePricesByIDPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyStandalonePricesByIDPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyStandalonePricesByIDPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyStandalonePricesByIDPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyStandalonePricesByIDPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyStandalonePricesByIDPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyStandalonePricesByIDPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.standalone_price.StandalonePriceUpdate getBody() {
        return standalonePriceUpdate;
    }

    public ByProjectKeyStandalonePricesByIDPost withBody(
            com.commercetools.api.models.standalone_price.StandalonePriceUpdate standalonePriceUpdate) {
        ByProjectKeyStandalonePricesByIDPost t = copy();
        t.standalonePriceUpdate = standalonePriceUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyStandalonePricesByIDPost that = (ByProjectKeyStandalonePricesByIDPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(standalonePriceUpdate, that.standalonePriceUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(standalonePriceUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyStandalonePricesByIDPost copy() {
        return new ByProjectKeyStandalonePricesByIDPost(this);
    }
}
