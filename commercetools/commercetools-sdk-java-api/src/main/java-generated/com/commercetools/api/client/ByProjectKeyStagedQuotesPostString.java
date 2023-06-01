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
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.staged_quote.StagedQuote>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .stagedQuotes()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyStagedQuotesPostString extends StringBodyApiMethod<ByProjectKeyStagedQuotesPostString, com.commercetools.api.models.staged_quote.StagedQuote> implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyStagedQuotesPostString>, com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyStagedQuotesPostString>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyStagedQuotesPostString> {

    
    private String projectKey;
    
    private String stagedQuoteDraft;

    public ByProjectKeyStagedQuotesPostString(final ApiHttpClient apiHttpClient, String projectKey, String stagedQuoteDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.stagedQuoteDraft = stagedQuoteDraft;
    }

    public ByProjectKeyStagedQuotesPostString(ByProjectKeyStagedQuotesPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.stagedQuoteDraft = t.stagedQuoteDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/staged-quotes", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), stagedQuoteDraft.getBytes(StandardCharsets.UTF_8));
    
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.staged_quote.StagedQuote> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.staged_quote.StagedQuote.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.staged_quote.StagedQuote>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.staged_quote.StagedQuote.class);
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyStagedQuotesPostString
     */
    public <TValue> ByProjectKeyStagedQuotesPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }
    
    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyStagedQuotesPostString
     */
    public <TValue> ByProjectKeyStagedQuotesPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }
    
    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyStagedQuotesPostString
     */
    public ByProjectKeyStagedQuotesPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }
    
    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyStagedQuotesPostString
     */
    public ByProjectKeyStagedQuotesPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }
    
    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyStagedQuotesPostString
     */
    public ByProjectKeyStagedQuotesPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyStagedQuotesPostString
     */
    public ByProjectKeyStagedQuotesPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyStagedQuotesPostString
     */
    public <TValue> ByProjectKeyStagedQuotesPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand").addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyStagedQuotesPostString
     */
    public <TValue> ByProjectKeyStagedQuotesPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }

    
    public String getBody() {
        return stagedQuoteDraft;
    }
    
    public ByProjectKeyStagedQuotesPostString withBody(String stagedQuoteDraft) {
        ByProjectKeyStagedQuotesPostString t = copy();
        t.stagedQuoteDraft = stagedQuoteDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyStagedQuotesPostString that = (ByProjectKeyStagedQuotesPostString) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(stagedQuoteDraft, that.stagedQuoteDraft)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(stagedQuoteDraft)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyStagedQuotesPostString copy() {
        return new ByProjectKeyStagedQuotesPostString(this);
    }
}
