
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
 *  <p>Updates a DiscountGroup in the Project using one or more <span>update actions</span>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.discount_group.DiscountGroup>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .discountGroups()
 *            .withId("{ID}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyDiscountGroupsByIDPost extends
        TypeBodyApiMethod<ByProjectKeyDiscountGroupsByIDPost, com.commercetools.api.models.discount_group.DiscountGroup, com.commercetools.api.models.discount_group.DiscountGroupUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyDiscountGroupsByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyDiscountGroupsByIDPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyDiscountGroupsByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyDiscountGroupsByIDPost> {

    @Override
    public TypeReference<com.commercetools.api.models.discount_group.DiscountGroup> resultType() {
        return new TypeReference<com.commercetools.api.models.discount_group.DiscountGroup>() {
        };
    }

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.discount_group.DiscountGroupUpdate discountGroupUpdate;

    public ByProjectKeyDiscountGroupsByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.discount_group.DiscountGroupUpdate discountGroupUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.discountGroupUpdate = discountGroupUpdate;
    }

    public ByProjectKeyDiscountGroupsByIDPost(ByProjectKeyDiscountGroupsByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.discountGroupUpdate = t.discountGroupUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/discount-groups/%s", encodePathParam(this.projectKey),
            encodePathParam(this.ID));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(discountGroupUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.discount_group.DiscountGroup> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.discount_group.DiscountGroup.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.discount_group.DiscountGroup>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.discount_group.DiscountGroup.class);
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
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyDiscountGroupsByIDPost
     */
    public <TValue> ByProjectKeyDiscountGroupsByIDPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyDiscountGroupsByIDPost
     */
    public <TValue> ByProjectKeyDiscountGroupsByIDPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyDiscountGroupsByIDPost
     */
    public ByProjectKeyDiscountGroupsByIDPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyDiscountGroupsByIDPost
     */
    public ByProjectKeyDiscountGroupsByIDPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyDiscountGroupsByIDPost
     */
    public ByProjectKeyDiscountGroupsByIDPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyDiscountGroupsByIDPost
     */
    public ByProjectKeyDiscountGroupsByIDPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyDiscountGroupsByIDPost
     */
    public <TValue> ByProjectKeyDiscountGroupsByIDPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyDiscountGroupsByIDPost
     */
    public <TValue> ByProjectKeyDiscountGroupsByIDPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.discount_group.DiscountGroupUpdate getBody() {
        return discountGroupUpdate;
    }

    public ByProjectKeyDiscountGroupsByIDPost withBody(
            com.commercetools.api.models.discount_group.DiscountGroupUpdate discountGroupUpdate) {
        ByProjectKeyDiscountGroupsByIDPost t = copy();
        t.discountGroupUpdate = discountGroupUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyDiscountGroupsByIDPost that = (ByProjectKeyDiscountGroupsByIDPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(discountGroupUpdate, that.discountGroupUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(discountGroupUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyDiscountGroupsByIDPost copy() {
        return new ByProjectKeyDiscountGroupsByIDPost(this);
    }
}
