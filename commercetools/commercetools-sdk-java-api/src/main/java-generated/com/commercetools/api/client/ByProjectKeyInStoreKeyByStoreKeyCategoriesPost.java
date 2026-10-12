
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

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import tools.jackson.core.type.TypeReference;

/**
 *  <p>Creates a <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> in the specified <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
 *  <p>For global Categories, use the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/categories:POST" rel="nofollow">Create Category</a> endpoint.</p>
 *  <p>Creating a Category with a <code>parent</code> locks that parent Category. For details, see <span>Category tree locking</span>.</p>
 *  <p>Creating a Category produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:CategoryCreatedMessage" rel="nofollow">CategoryCreated</a> Message.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.category.Category>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .categories()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCategoriesPost extends
        TypeBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyCategoriesPost, com.commercetools.api.models.category.Category, com.commercetools.api.models.category.CategoryDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyCategoriesPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyInStoreKeyByStoreKeyCategoriesPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyCategoriesPost> {

    @Override
    public TypeReference<com.commercetools.api.models.category.Category> resultType() {
        return new TypeReference<com.commercetools.api.models.category.Category>() {
        };
    }

    private String projectKey;
    private String storeKey;

    private com.commercetools.api.models.category.CategoryDraft categoryDraft;

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesPost(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, com.commercetools.api.models.category.CategoryDraft categoryDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.categoryDraft = categoryDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesPost(ByProjectKeyInStoreKeyByStoreKeyCategoriesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.categoryDraft = t.categoryDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/categories", encodePathParam(this.projectKey),
            encodePathParam(this.storeKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(categoryDraft)));

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

    public String getStoreKey() {
        return this.storeKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCategoriesPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCategoriesPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyCategoriesPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyCategoriesPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyCategoriesPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyCategoriesPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCategoriesPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCategoriesPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.category.CategoryDraft getBody() {
        return categoryDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesPost withBody(
            com.commercetools.api.models.category.CategoryDraft categoryDraft) {
        ByProjectKeyInStoreKeyByStoreKeyCategoriesPost t = copy();
        t.categoryDraft = categoryDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyCategoriesPost that = (ByProjectKeyInStoreKeyByStoreKeyCategoriesPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(categoryDraft, that.categoryDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(categoryDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyCategoriesPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyCategoriesPost(this);
    }
}
