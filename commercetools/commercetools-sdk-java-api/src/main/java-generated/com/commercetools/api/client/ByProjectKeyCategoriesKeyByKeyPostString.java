
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
 *  <p>Either the scope <code>manage_products:{projectKey}</code> or <code>manage_categories:{projectKey}</code> is required.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.category.Category>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .categories()
 *            .withKey("{key}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCategoriesKeyByKeyPostString extends
        StringBodyApiMethod<ByProjectKeyCategoriesKeyByKeyPostString, com.commercetools.api.models.category.Category>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyCategoriesKeyByKeyPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyCategoriesKeyByKeyPostString>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyCategoriesKeyByKeyPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCategoriesKeyByKeyPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.category.Category> resultType() {
        return new TypeReference<com.commercetools.api.models.category.Category>() {
        };
    }

    private String projectKey;
    private String key;

    private String categoryUpdate;

    public ByProjectKeyCategoriesKeyByKeyPostString(final ApiHttpClient apiHttpClient, String projectKey, String key,
            String categoryUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.categoryUpdate = categoryUpdate;
    }

    public ByProjectKeyCategoriesKeyByKeyPostString(ByProjectKeyCategoriesKeyByKeyPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.categoryUpdate = t.categoryUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/categories/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            categoryUpdate.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.category.Category> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.category.Category.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.category.Category>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.category.Category.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getKey() {
        return this.key;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyCategoriesKeyByKeyPostString
     */
    public <TValue> ByProjectKeyCategoriesKeyByKeyPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyCategoriesKeyByKeyPostString
     */
    public <TValue> ByProjectKeyCategoriesKeyByKeyPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyCategoriesKeyByKeyPostString
     */
    public ByProjectKeyCategoriesKeyByKeyPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyCategoriesKeyByKeyPostString
     */
    public ByProjectKeyCategoriesKeyByKeyPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyCategoriesKeyByKeyPostString
     */
    public ByProjectKeyCategoriesKeyByKeyPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyCategoriesKeyByKeyPostString
     */
    public ByProjectKeyCategoriesKeyByKeyPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyCategoriesKeyByKeyPostString
     */
    public <TValue> ByProjectKeyCategoriesKeyByKeyPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyCategoriesKeyByKeyPostString
     */
    public <TValue> ByProjectKeyCategoriesKeyByKeyPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return categoryUpdate;
    }

    public ByProjectKeyCategoriesKeyByKeyPostString withBody(String categoryUpdate) {
        ByProjectKeyCategoriesKeyByKeyPostString t = copy();
        t.categoryUpdate = categoryUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCategoriesKeyByKeyPostString that = (ByProjectKeyCategoriesKeyByKeyPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(categoryUpdate, that.categoryUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(categoryUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyCategoriesKeyByKeyPostString copy() {
        return new ByProjectKeyCategoriesKeyByKeyPostString(this);
    }
}
