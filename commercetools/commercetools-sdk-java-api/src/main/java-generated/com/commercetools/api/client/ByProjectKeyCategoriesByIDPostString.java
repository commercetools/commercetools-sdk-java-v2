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
 *  <p>Either the scope <code>manage_products:{projectKey}</code> or <code>manage_categories:{projectKey}</code> is required.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.category.Category>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .categories()
 *            .withId("{ID}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyCategoriesByIDPostString extends StringBodyApiMethod<ByProjectKeyCategoriesByIDPostString, com.commercetools.api.models.category.Category> implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyCategoriesByIDPostString>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyCategoriesByIDPostString>, com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyCategoriesByIDPostString>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyCategoriesByIDPostString> {

    
    private String projectKey;
    private String ID;
    
    private String categoryUpdate;

    public ByProjectKeyCategoriesByIDPostString(final ApiHttpClient apiHttpClient, String projectKey, String ID, String categoryUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.categoryUpdate = categoryUpdate;
    }

    public ByProjectKeyCategoriesByIDPostString(ByProjectKeyCategoriesByIDPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.categoryUpdate = t.categoryUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/categories/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), categoryUpdate.getBytes(StandardCharsets.UTF_8));
    
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.category.Category> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.category.Category.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.category.Category>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.category.Category.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getID() {return this.ID;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setID(final String ID) { this.ID = ID; }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyCategoriesByIDPostString
     */
    public <TValue> ByProjectKeyCategoriesByIDPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }
    
    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyCategoriesByIDPostString
     */
    public <TValue> ByProjectKeyCategoriesByIDPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }
    
    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyCategoriesByIDPostString
     */
    public ByProjectKeyCategoriesByIDPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }
    
    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyCategoriesByIDPostString
     */
    public ByProjectKeyCategoriesByIDPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }
    
    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyCategoriesByIDPostString
     */
    public ByProjectKeyCategoriesByIDPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyCategoriesByIDPostString
     */
    public ByProjectKeyCategoriesByIDPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyCategoriesByIDPostString
     */
    public <TValue> ByProjectKeyCategoriesByIDPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand").addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyCategoriesByIDPostString
     */
    public <TValue> ByProjectKeyCategoriesByIDPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }

    
    public String getBody() {
        return categoryUpdate;
    }
    
    public ByProjectKeyCategoriesByIDPostString withBody(String categoryUpdate) {
        ByProjectKeyCategoriesByIDPostString t = copy();
        t.categoryUpdate = categoryUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyCategoriesByIDPostString that = (ByProjectKeyCategoriesByIDPostString) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(categoryUpdate, that.categoryUpdate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(ID)
            .append(categoryUpdate)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyCategoriesByIDPostString copy() {
        return new ByProjectKeyCategoriesByIDPostString(this);
    }
}
