
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
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_tailoring.ProductTailoring>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .productTailoring()
 *            .withId("{ID}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductTailoringByIDPostString extends
        StringBodyApiMethod<ByProjectKeyProductTailoringByIDPostString, com.commercetools.api.models.product_tailoring.ProductTailoring>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyProductTailoringByIDPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductTailoringByIDPostString>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductTailoringByIDPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductTailoringByIDPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.product_tailoring.ProductTailoring> resultType() {
        return new TypeReference<com.commercetools.api.models.product_tailoring.ProductTailoring>() {
        };
    }

    private String projectKey;
    private String ID;

    private String productTailoringUpdate;

    public ByProjectKeyProductTailoringByIDPostString(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            String productTailoringUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.productTailoringUpdate = productTailoringUpdate;
    }

    public ByProjectKeyProductTailoringByIDPostString(ByProjectKeyProductTailoringByIDPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.productTailoringUpdate = t.productTailoringUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/product-tailoring/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            productTailoringUpdate.getBytes(StandardCharsets.UTF_8));

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
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyProductTailoringByIDPostString
     */
    public <TValue> ByProjectKeyProductTailoringByIDPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyProductTailoringByIDPostString
     */
    public <TValue> ByProjectKeyProductTailoringByIDPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductTailoringByIDPostString
     */
    public ByProjectKeyProductTailoringByIDPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductTailoringByIDPostString
     */
    public ByProjectKeyProductTailoringByIDPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductTailoringByIDPostString
     */
    public ByProjectKeyProductTailoringByIDPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductTailoringByIDPostString
     */
    public ByProjectKeyProductTailoringByIDPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyProductTailoringByIDPostString
     */
    public <TValue> ByProjectKeyProductTailoringByIDPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyProductTailoringByIDPostString
     */
    public <TValue> ByProjectKeyProductTailoringByIDPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return productTailoringUpdate;
    }

    public ByProjectKeyProductTailoringByIDPostString withBody(String productTailoringUpdate) {
        ByProjectKeyProductTailoringByIDPostString t = copy();
        t.productTailoringUpdate = productTailoringUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductTailoringByIDPostString that = (ByProjectKeyProductTailoringByIDPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(productTailoringUpdate, that.productTailoringUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(productTailoringUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyProductTailoringByIDPostString copy() {
        return new ByProjectKeyProductTailoringByIDPostString(this);
    }
}
