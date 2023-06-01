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
 *  <p>If a ShoppingList exists in a Project but does <em>not</em> have the <code>store</code> field, or the <code>store</code> field references a different Store, the ResourceNotFound error is returned.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .me()
 *            .shoppingLists()
 *            .withId("{ID}")
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet extends ApiMethod<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet, com.commercetools.api.models.shopping_list.ShoppingList> implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet>, com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet> {

    
    private String projectKey;
    private String storeKey;
    private String ID;
    

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet(final ApiHttpClient apiHttpClient, String projectKey, String storeKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet(ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.ID = t.ID;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/me/shopping-lists/%s", this.projectKey, this.storeKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.shopping_list.ShoppingList.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.shopping_list.ShoppingList.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getStoreKey() {return this.storeKey;}
    public String getID() {return this.ID;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setStoreKey(final String storeKey) { this.storeKey = storeKey; }
    
    public void setID(final String ID) { this.ID = ID; }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }
    
    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }
    
    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }
    
    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }
    
    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand").addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }

    

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet that = (ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(ID, that.ID)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(storeKey)
            .append(ID)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet(this);
    }
}
