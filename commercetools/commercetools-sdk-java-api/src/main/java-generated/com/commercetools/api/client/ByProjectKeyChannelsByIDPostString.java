
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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.channel.Channel>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .channels()
 *            .withId("{ID}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyChannelsByIDPostString
        extends StringBodyApiMethod<ByProjectKeyChannelsByIDPostString, com.commercetools.api.models.channel.Channel>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyChannelsByIDPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyChannelsByIDPostString>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyChannelsByIDPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyChannelsByIDPostString> {

    private String projectKey;
    private String ID;

    private String channelUpdate;

    public ByProjectKeyChannelsByIDPostString(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            String channelUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.channelUpdate = channelUpdate;
    }

    public ByProjectKeyChannelsByIDPostString(ByProjectKeyChannelsByIDPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.channelUpdate = t.channelUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/channels/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            channelUpdate.getBytes(StandardCharsets.UTF_8));

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

    public String getID() {
        return this.ID;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyChannelsByIDPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyChannelsByIDPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyChannelsByIDPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyChannelsByIDPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyChannelsByIDPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyChannelsByIDPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyChannelsByIDPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyChannelsByIDPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return channelUpdate;
    }

    public ByProjectKeyChannelsByIDPostString withBody(String channelUpdate) {
        ByProjectKeyChannelsByIDPostString t = copy();
        t.channelUpdate = channelUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyChannelsByIDPostString that = (ByProjectKeyChannelsByIDPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(channelUpdate, that.channelUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(channelUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyChannelsByIDPostString copy() {
        return new ByProjectKeyChannelsByIDPostString(this);
    }
}
