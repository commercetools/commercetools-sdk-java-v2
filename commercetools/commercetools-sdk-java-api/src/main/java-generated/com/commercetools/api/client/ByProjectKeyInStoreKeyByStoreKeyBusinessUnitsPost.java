
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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.business_unit.BusinessUnit>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .businessUnits()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost extends
        TypeBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost, com.commercetools.api.models.business_unit.BusinessUnit, com.commercetools.api.models.business_unit.BusinessUnitDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost> {

    @Override
    public TypeReference<com.commercetools.api.models.business_unit.BusinessUnit> resultType() {
        return new TypeReference<com.commercetools.api.models.business_unit.BusinessUnit>() {
        };
    }

    private String projectKey;
    private String storeKey;

    private com.commercetools.api.models.business_unit.BusinessUnitDraft businessUnitDraft;

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, com.commercetools.api.models.business_unit.BusinessUnitDraft businessUnitDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.businessUnitDraft = businessUnitDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost(ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.businessUnitDraft = t.businessUnitDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/business-units", encodePathParam(this.projectKey),
            encodePathParam(this.storeKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(businessUnitDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.business_unit.BusinessUnit> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.business_unit.BusinessUnit.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.business_unit.BusinessUnit>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.business_unit.BusinessUnit.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.business_unit.BusinessUnitDraft getBody() {
        return businessUnitDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost withBody(
            com.commercetools.api.models.business_unit.BusinessUnitDraft businessUnitDraft) {
        ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost t = copy();
        t.businessUnitDraft = businessUnitDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost that = (ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(businessUnitDraft, that.businessUnitDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(businessUnitDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsPost(this);
    }
}
