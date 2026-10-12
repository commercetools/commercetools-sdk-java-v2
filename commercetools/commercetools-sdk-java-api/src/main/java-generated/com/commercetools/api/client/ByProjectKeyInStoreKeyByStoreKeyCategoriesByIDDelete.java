
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
 *  <p>Deletes a <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> by its <code>id</code> in the specified <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
 *  <p>To delete a global Category, use the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/categories/{id}:DELETE" rel="nofollow">Delete Category by ID</a> endpoint.</p>
 *  <p>If you do not have permissions for a Store the Category is assigned to, an <a href="https://docs.commercetools.com/apis/ctp:api:type:UnauthorizedError" rel="nofollow">Unauthorized</a> error is returned.</p>
 *  <p>If the Category does not exist in the Store, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceNotFoundError" rel="nofollow">ResourceNotFound</a> error is returned.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.category.Category>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .categories()
 *            .withId("{ID}")
 *            .delete()
 *            .withVersion(version)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete extends
        TypeApiMethod<ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete, com.commercetools.api.models.category.Category>
        implements com.commercetools.api.client.VersionedTrait<ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete> {

    @Override
    public TypeReference<com.commercetools.api.models.category.Category> resultType() {
        return new TypeReference<com.commercetools.api.models.category.Category>() {
        };
    }

    private String projectKey;
    private String storeKey;
    private String ID;

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete(
            ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.ID = t.ID;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/categories/%s", encodePathParam(this.projectKey),
            encodePathParam(this.storeKey), encodePathParam(this.ID));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
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

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set version with the specified value
     * @param version value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete withVersion(final TValue version) {
        return copy().withQueryParam("version", version);
    }

    /**
     * add additional version query parameter
     * @param version value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete addVersion(final TValue version) {
        return copy().addQueryParam("version", version);
    }

    /**
     * set version with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete withVersion(final Supplier<Long> supplier) {
        return copy().withQueryParam("version", supplier.get());
    }

    /**
     * add additional version query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete addVersion(final Supplier<Long> supplier) {
        return copy().addQueryParam("version", supplier.get());
    }

    /**
     * set version with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete withVersion(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("version", op.apply(new StringBuilder()));
    }

    /**
     * add additional version query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete addVersion(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("version", op.apply(new StringBuilder()));
    }

    /**
     * set version with the specified values
     * @param version values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete withVersion(final Collection<TValue> version) {
        return copy().withoutQueryParam("version")
                .addQueryParams(
                    version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional version query parameters
     * @param version values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete addVersion(final Collection<TValue> version) {
        return copy().addQueryParams(
            version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete
     */
    public ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete that = (ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(ID, that.ID)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(ID).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete(this);
    }
}
