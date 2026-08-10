
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
 *  <p>Returns a single <a href="https://docs.commercetools.com/apis/ctp:api:type:McpServerType" rel="nofollow">MCP Server type</a>. When <code>majorVersion</code> is omitted, the latest major version is returned.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.mcp_server.McpServerType>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .mcpServers()
 *            .types()
 *            .withMcpServerType("{mcpServerType}")
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMcpServersTypesByMcpServerTypeGet extends
        TypeApiMethod<ByProjectKeyMcpServersTypesByMcpServerTypeGet, com.commercetools.api.models.mcp_server.McpServerType>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyMcpServersTypesByMcpServerTypeGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyMcpServersTypesByMcpServerTypeGet> {

    @Override
    public TypeReference<com.commercetools.api.models.mcp_server.McpServerType> resultType() {
        return new TypeReference<com.commercetools.api.models.mcp_server.McpServerType>() {
        };
    }

    private String projectKey;
    private String mcpServerType;

    public ByProjectKeyMcpServersTypesByMcpServerTypeGet(final ApiHttpClient apiHttpClient, String projectKey,
            String mcpServerType) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.mcpServerType = mcpServerType;
    }

    public ByProjectKeyMcpServersTypesByMcpServerTypeGet(ByProjectKeyMcpServersTypesByMcpServerTypeGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.mcpServerType = t.mcpServerType;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/mcp-servers/types/%s", encodePathParam(this.projectKey),
            encodePathParam(this.mcpServerType));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.mcp_server.McpServerType> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.mcp_server.McpServerType.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.mcp_server.McpServerType>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.mcp_server.McpServerType.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getMcpServerType() {
        return this.mcpServerType;
    }

    public List<String> getMajorVersion() {
        return this.getQueryParam("majorVersion");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setMcpServerType(final String mcpServerType) {
        this.mcpServerType = mcpServerType;
    }

    /**
     * set majorVersion with the specified value
     * @param majorVersion value to be set
     * @param <TValue> value type
     * @return ByProjectKeyMcpServersTypesByMcpServerTypeGet
     */
    public <TValue> ByProjectKeyMcpServersTypesByMcpServerTypeGet withMajorVersion(final TValue majorVersion) {
        return copy().withQueryParam("majorVersion", majorVersion);
    }

    /**
     * add additional majorVersion query parameter
     * @param majorVersion value to be added
     * @param <TValue> value type
     * @return ByProjectKeyMcpServersTypesByMcpServerTypeGet
     */
    public <TValue> ByProjectKeyMcpServersTypesByMcpServerTypeGet addMajorVersion(final TValue majorVersion) {
        return copy().addQueryParam("majorVersion", majorVersion);
    }

    /**
     * set majorVersion with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyMcpServersTypesByMcpServerTypeGet
     */
    public ByProjectKeyMcpServersTypesByMcpServerTypeGet withMajorVersion(final Supplier<String> supplier) {
        return copy().withQueryParam("majorVersion", supplier.get());
    }

    /**
     * add additional majorVersion query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyMcpServersTypesByMcpServerTypeGet
     */
    public ByProjectKeyMcpServersTypesByMcpServerTypeGet addMajorVersion(final Supplier<String> supplier) {
        return copy().addQueryParam("majorVersion", supplier.get());
    }

    /**
     * set majorVersion with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyMcpServersTypesByMcpServerTypeGet
     */
    public ByProjectKeyMcpServersTypesByMcpServerTypeGet withMajorVersion(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("majorVersion", op.apply(new StringBuilder()));
    }

    /**
     * add additional majorVersion query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyMcpServersTypesByMcpServerTypeGet
     */
    public ByProjectKeyMcpServersTypesByMcpServerTypeGet addMajorVersion(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("majorVersion", op.apply(new StringBuilder()));
    }

    /**
     * set majorVersion with the specified values
     * @param majorVersion values to be set
     * @param <TValue> value type
     * @return ByProjectKeyMcpServersTypesByMcpServerTypeGet
     */
    public <TValue> ByProjectKeyMcpServersTypesByMcpServerTypeGet withMajorVersion(
            final Collection<TValue> majorVersion) {
        return copy().withoutQueryParam("majorVersion")
                .addQueryParams(majorVersion.stream()
                        .map(s -> new ParamEntry<>("majorVersion", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional majorVersion query parameters
     * @param majorVersion values to be added
     * @param <TValue> value type
     * @return ByProjectKeyMcpServersTypesByMcpServerTypeGet
     */
    public <TValue> ByProjectKeyMcpServersTypesByMcpServerTypeGet addMajorVersion(
            final Collection<TValue> majorVersion) {
        return copy().addQueryParams(majorVersion.stream()
                .map(s -> new ParamEntry<>("majorVersion", s.toString()))
                .collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMcpServersTypesByMcpServerTypeGet that = (ByProjectKeyMcpServersTypesByMcpServerTypeGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(mcpServerType, that.mcpServerType)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(mcpServerType).toHashCode();
    }

    @Override
    protected ByProjectKeyMcpServersTypesByMcpServerTypeGet copy() {
        return new ByProjectKeyMcpServersTypesByMcpServerTypeGet(this);
    }
}
