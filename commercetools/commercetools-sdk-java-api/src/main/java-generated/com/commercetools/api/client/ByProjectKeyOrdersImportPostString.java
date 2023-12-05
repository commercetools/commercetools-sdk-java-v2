
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Importing an Order produces the Order Imported Message.</p>
 *  <p>Specific Error Codes:</p>
 *  <ul>
 *   <li>OutOfStock</li>
 *   <li>CountryNotConfiguredInStore</li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .orders()
 *            .importOrder()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyOrdersImportPostString
        extends StringBodyApiMethod<ByProjectKeyOrdersImportPostString, com.commercetools.api.models.order.Order>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyOrdersImportPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.order.Order> resultType() {
        return new TypeReference<com.commercetools.api.models.order.Order>() {
        };
    }

    private String projectKey;

    private String orderImportDraft;

    public ByProjectKeyOrdersImportPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String orderImportDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.orderImportDraft = orderImportDraft;
    }

    public ByProjectKeyOrdersImportPostString(ByProjectKeyOrdersImportPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.orderImportDraft = t.orderImportDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/orders/import", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            orderImportDraft.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.order.Order> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.order.Order.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.order.Order.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public String getBody() {
        return orderImportDraft;
    }

    public ByProjectKeyOrdersImportPostString withBody(String orderImportDraft) {
        ByProjectKeyOrdersImportPostString t = copy();
        t.orderImportDraft = orderImportDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyOrdersImportPostString that = (ByProjectKeyOrdersImportPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(orderImportDraft, that.orderImportDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(orderImportDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyOrdersImportPostString copy() {
        return new ByProjectKeyOrdersImportPostString(this);
    }
}
