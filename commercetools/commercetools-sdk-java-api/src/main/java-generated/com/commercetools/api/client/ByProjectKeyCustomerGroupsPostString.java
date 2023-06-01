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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer_group.CustomerGroup>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .customerGroups()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyCustomerGroupsPostString extends StringBodyApiMethod<ByProjectKeyCustomerGroupsPostString, com.commercetools.api.models.customer_group.CustomerGroup> implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomerGroupsPostString>, com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyCustomerGroupsPostString>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomerGroupsPostString> {

    
    private String projectKey;
    
    private String customerGroupDraft;

    public ByProjectKeyCustomerGroupsPostString(final ApiHttpClient apiHttpClient, String projectKey, String customerGroupDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerGroupDraft = customerGroupDraft;
    }

    public ByProjectKeyCustomerGroupsPostString(ByProjectKeyCustomerGroupsPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerGroupDraft = t.customerGroupDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/customer-groups", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), customerGroupDraft.getBytes(StandardCharsets.UTF_8));
    
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer_group.CustomerGroup> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.customer_group.CustomerGroup.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer_group.CustomerGroup>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.customer_group.CustomerGroup.class);
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
     * @return ByProjectKeyCustomerGroupsPostString
     */
    public <TValue> ByProjectKeyCustomerGroupsPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }
    
    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyCustomerGroupsPostString
     */
    public <TValue> ByProjectKeyCustomerGroupsPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }
    
    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyCustomerGroupsPostString
     */
    public ByProjectKeyCustomerGroupsPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }
    
    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyCustomerGroupsPostString
     */
    public ByProjectKeyCustomerGroupsPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }
    
    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyCustomerGroupsPostString
     */
    public ByProjectKeyCustomerGroupsPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyCustomerGroupsPostString
     */
    public ByProjectKeyCustomerGroupsPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyCustomerGroupsPostString
     */
    public <TValue> ByProjectKeyCustomerGroupsPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand").addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyCustomerGroupsPostString
     */
    public <TValue> ByProjectKeyCustomerGroupsPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }

    
    public String getBody() {
        return customerGroupDraft;
    }
    
    public ByProjectKeyCustomerGroupsPostString withBody(String customerGroupDraft) {
        ByProjectKeyCustomerGroupsPostString t = copy();
        t.customerGroupDraft = customerGroupDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyCustomerGroupsPostString that = (ByProjectKeyCustomerGroupsPostString) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(customerGroupDraft, that.customerGroupDraft)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(customerGroupDraft)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyCustomerGroupsPostString copy() {
        return new ByProjectKeyCustomerGroupsPostString(this);
    }
}
