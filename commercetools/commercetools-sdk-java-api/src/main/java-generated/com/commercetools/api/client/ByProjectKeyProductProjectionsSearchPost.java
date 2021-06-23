
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Search Product Projection</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductProjectionsSearchPost
        extends ApiMethod<ByProjectKeyProductProjectionsSearchPost, com.fasterxml.jackson.databind.JsonNode>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductProjectionsSearchPost> {

    private String projectKey;

    private List<ParamEntry<String, String>> formParams;

    public ByProjectKeyProductProjectionsSearchPost(final ApiHttpClient apiHttpClient, String projectKey,
            List<ParamEntry<String, String>> formParams) {
        super(apiHttpClient,
            new ApiHttpHeaders(
                new ApiHttpHeaders.StringHeaderEntry(ApiHttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded")),
            new ArrayList<>());
        this.projectKey = projectKey;
        this.formParams = formParams;
    }

    public ByProjectKeyProductProjectionsSearchPost(ByProjectKeyProductProjectionsSearchPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.formParams = new ArrayList<>(t.formParams);
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-projections/search", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        try {
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
                getFormParamUriString().getBytes(StandardCharsets.UTF_8));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.fasterxml.jackson.databind.JsonNode.class), request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.fasterxml.jackson.databind.JsonNode.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * add an additional form parameter
     * @param key form parameter name
     * @param value form parameter value
     * @param <V> value type
     * @return T
     */
    public <V> ByProjectKeyProductProjectionsSearchPost addFormParam(final String key, final V value) {
        ByProjectKeyProductProjectionsSearchPost c = copy();
        c.formParams.add(new ParamEntry<>(key, value.toString()));
        return c;
    }

    /**
     * set the form parameter with the specified value
     * @param key form parameter name
     * @param value form parameter value
     * @param <V> value type
     * @return T
     */
    public <V> ByProjectKeyProductProjectionsSearchPost withFormParam(final String key, final V value) {
        return withoutFormParam(key).addFormParam(key, value);
    }

    /**
     * removes the specified form parameter
     * @param key form parameter name
     * @return T
     */
    public ByProjectKeyProductProjectionsSearchPost withoutFormParam(final String key) {
        ByProjectKeyProductProjectionsSearchPost c = copy();
        c.formParams = c.formParams.stream()
                .filter(e -> !e.getKey().equalsIgnoreCase(key))
                .collect(Collectors.toList());
        return c;
    }

    /**
     * set the form parameters
     * @param formParams list of form parameters
     * @return T
     */
    public ByProjectKeyProductProjectionsSearchPost withFormParams(final List<ParamEntry<String, String>> formParams) {
        ByProjectKeyProductProjectionsSearchPost c = copy();
        c.formParams = formParams;
        return c;
    }

    public List<ParamEntry<String, String>> getFormParams() {
        return new ArrayList<>(this.formParams);
    }

    public List<String> getFormParam(final String key) {
        return this.formParams.stream()
                .filter(e -> e.getKey().equals(key))
                .map(ParamEntry::getValue)
                .collect(Collectors.toList());
    }

    public List<String> getFormParamUriStrings() {
        return this.formParams.stream().map(ParamEntry::toUriString).collect(Collectors.toList());
    }

    public String getFormParamUriString() {
        return this.formParams.stream().map(ParamEntry::toUriString).collect(Collectors.joining("&"));
    }

    @Nullable
    public String getFirstFormParam(final String key) {
        return this.formParams.stream()
                .filter(e -> e.getKey().equals(key))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse(null);
    }

    @Override
    protected ByProjectKeyProductProjectionsSearchPost copy() {
        return new ByProjectKeyProductProjectionsSearchPost(this);
    }
}
