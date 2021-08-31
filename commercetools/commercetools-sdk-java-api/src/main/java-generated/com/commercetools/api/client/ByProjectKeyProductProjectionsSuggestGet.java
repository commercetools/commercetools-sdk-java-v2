
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductProjectionsSuggestGet
        extends ApiMethod<ByProjectKeyProductProjectionsSuggestGet, java.lang.Object>
        implements com.commercetools.api.client.SortableTrait<ByProjectKeyProductProjectionsSuggestGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyProductProjectionsSuggestGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductProjectionsSuggestGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductProjectionsSuggestGet> {

    private String projectKey;

    public ByProjectKeyProductProjectionsSuggestGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductProjectionsSuggestGet(ByProjectKeyProductProjectionsSuggestGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-projections/suggest", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<java.lang.Object> executeBlocking(final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, java.lang.Object.class), request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<java.lang.Object>> execute(final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), java.lang.Object.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getFuzzy() {
        return this.getQueryParam("fuzzy");
    }

    public List<String> getStaged() {
        return this.getQueryParam("staged");
    }

    public List<String> getSort() {
        return this.getQueryParam("sort");
    }

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }

    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }

    public List<String> getWithTotal() {
        return this.getQueryParam("withTotal");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set fuzzy with the specificied value
     */
    public ByProjectKeyProductProjectionsSuggestGet withFuzzy(final boolean fuzzy) {
        return copy().withQueryParam("fuzzy", fuzzy);
    }

    /**
     * add additional fuzzy query parameter
     */
    public ByProjectKeyProductProjectionsSuggestGet addFuzzy(final boolean fuzzy) {
        return copy().addQueryParam("fuzzy", fuzzy);
    }

    /**
     * set staged with the specificied value
     */
    public ByProjectKeyProductProjectionsSuggestGet withStaged(final boolean staged) {
        return copy().withQueryParam("staged", staged);
    }

    /**
     * add additional staged query parameter
     */
    public ByProjectKeyProductProjectionsSuggestGet addStaged(final boolean staged) {
        return copy().addQueryParam("staged", staged);
    }

    /**
     * set sort with the specificied value
     */
    public ByProjectKeyProductProjectionsSuggestGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyProductProjectionsSuggestGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set limit with the specificied value
     */
    public ByProjectKeyProductProjectionsSuggestGet withLimit(final int limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyProductProjectionsSuggestGet addLimit(final int limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set offset with the specificied value
     */
    public ByProjectKeyProductProjectionsSuggestGet withOffset(final int offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyProductProjectionsSuggestGet addOffset(final int offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set withTotal with the specificied value
     */
    public ByProjectKeyProductProjectionsSuggestGet withWithTotal(final boolean withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    /**
     * add additional withTotal query parameter
     */
    public ByProjectKeyProductProjectionsSuggestGet addWithTotal(final boolean withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    /**
     * set searchKeywords with the specificied value
     */
    public ByProjectKeyProductProjectionsSuggestGet withSearchKeywords(final String locale,
            final String searchKeywords) {
        return copy().withQueryParam(String.format("searchKeywords.%s", locale), searchKeywords);
    }

    /**
     * add additional searchKeywords query parameter
     */
    public ByProjectKeyProductProjectionsSuggestGet addSearchKeywords(final String locale,
            final String searchKeywords) {
        return copy().addQueryParam(String.format("searchKeywords.%s", locale), searchKeywords);
    }

    @Override
    protected ByProjectKeyProductProjectionsSuggestGet copy() {
        return new ByProjectKeyProductProjectionsSuggestGet(this);
    }
}
