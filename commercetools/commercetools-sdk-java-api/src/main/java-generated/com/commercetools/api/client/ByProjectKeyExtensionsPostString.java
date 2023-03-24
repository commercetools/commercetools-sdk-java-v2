
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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.extension.Extension>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .extensions()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyExtensionsPostString
        extends StringBodyApiMethod<ByProjectKeyExtensionsPostString, com.commercetools.api.models.extension.Extension>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyExtensionsPostString>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyExtensionsPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyExtensionsPostString> {

    private String projectKey;

    private String extensionDraft;

    public ByProjectKeyExtensionsPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String extensionDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.extensionDraft = extensionDraft;
    }

    public ByProjectKeyExtensionsPostString(ByProjectKeyExtensionsPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.extensionDraft = t.extensionDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/extensions", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            extensionDraft.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.extension.Extension> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.extension.Extension.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.extension.Extension>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.extension.Extension.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyExtensionsPostString
     */
    public <TValue> ByProjectKeyExtensionsPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyExtensionsPostString
     */
    public <TValue> ByProjectKeyExtensionsPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyExtensionsPostString
     */
    public ByProjectKeyExtensionsPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyExtensionsPostString
     */
    public ByProjectKeyExtensionsPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyExtensionsPostString
     */
    public ByProjectKeyExtensionsPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyExtensionsPostString
     */
    public ByProjectKeyExtensionsPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyExtensionsPostString
     */
    public <TValue> ByProjectKeyExtensionsPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyExtensionsPostString
     */
    public <TValue> ByProjectKeyExtensionsPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return extensionDraft;
    }

    public ByProjectKeyExtensionsPostString withBody(String extensionDraft) {
        ByProjectKeyExtensionsPostString t = copy();
        t.extensionDraft = extensionDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyExtensionsPostString that = (ByProjectKeyExtensionsPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(extensionDraft, that.extensionDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(extensionDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyExtensionsPostString copy() {
        return new ByProjectKeyExtensionsPostString(this);
    }
}
