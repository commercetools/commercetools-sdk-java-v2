
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

import com.fasterxml.jackson.core.type.TypeReference;

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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.channel.Channel>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .channels()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyChannelsPost extends
        BodyApiMethod<ByProjectKeyChannelsPost, com.commercetools.api.models.channel.Channel, com.commercetools.api.models.channel.ChannelDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyChannelsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyChannelsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyChannelsPost> {

    public TypeReference<com.commercetools.api.models.channel.Channel> resultType() {
        return new TypeReference<com.commercetools.api.models.channel.Channel>() {
        };
    }

    private String projectKey;

    private com.commercetools.api.models.channel.ChannelDraft channelDraft;

    public ByProjectKeyChannelsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.channel.ChannelDraft channelDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.channelDraft = channelDraft;
    }

    public ByProjectKeyChannelsPost(ByProjectKeyChannelsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.channelDraft = t.channelDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/channels", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(channelDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.channel.Channel> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.channel.Channel.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.channel.Channel>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.channel.Channel.class);
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
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyChannelsPost
     */
    public <TValue> ByProjectKeyChannelsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyChannelsPost
     */
    public <TValue> ByProjectKeyChannelsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyChannelsPost
     */
    public ByProjectKeyChannelsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyChannelsPost
     */
    public ByProjectKeyChannelsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyChannelsPost
     */
    public ByProjectKeyChannelsPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyChannelsPost
     */
    public ByProjectKeyChannelsPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyChannelsPost
     */
    public <TValue> ByProjectKeyChannelsPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyChannelsPost
     */
    public <TValue> ByProjectKeyChannelsPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.channel.ChannelDraft getBody() {
        return channelDraft;
    }

    public ByProjectKeyChannelsPost withBody(com.commercetools.api.models.channel.ChannelDraft channelDraft) {
        ByProjectKeyChannelsPost t = copy();
        t.channelDraft = channelDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyChannelsPost that = (ByProjectKeyChannelsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(channelDraft, that.channelDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(channelDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyChannelsPost copy() {
        return new ByProjectKeyChannelsPost(this);
    }
}
