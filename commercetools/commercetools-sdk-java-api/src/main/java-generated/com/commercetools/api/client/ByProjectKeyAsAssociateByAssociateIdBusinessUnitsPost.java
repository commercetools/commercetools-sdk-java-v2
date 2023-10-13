
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
 *            .asAssociate()
 *            .withAssociateIdValue("{associateId}")
 *            .businessUnits()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost extends
        TypeBodyApiMethod<ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost, com.commercetools.api.models.business_unit.BusinessUnit, com.commercetools.api.models.business_unit.BusinessUnitDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost> {

    @Override
    public TypeReference<com.commercetools.api.models.business_unit.BusinessUnit> resultType() {
        return new TypeReference<com.commercetools.api.models.business_unit.BusinessUnit>() {
        };
    }

    private String projectKey;
    private String associateId;

    private com.commercetools.api.models.business_unit.BusinessUnitDraft businessUnitDraft;

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost(final ApiHttpClient apiHttpClient, String projectKey,
            String associateId, com.commercetools.api.models.business_unit.BusinessUnitDraft businessUnitDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.associateId = associateId;
        this.businessUnitDraft = businessUnitDraft;
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost(
            ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.associateId = t.associateId;
        this.businessUnitDraft = t.businessUnitDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/as-associate/%s/business-units", this.projectKey, this.associateId);
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

    public String getAssociateId() {
        return this.associateId;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setAssociateId(final String associateId) {
        this.associateId = associateId;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost
     */
    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost
     */
    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost
     */
    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost
     */
    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.business_unit.BusinessUnitDraft getBody() {
        return businessUnitDraft;
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost withBody(
            com.commercetools.api.models.business_unit.BusinessUnitDraft businessUnitDraft) {
        ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost t = copy();
        t.businessUnitDraft = businessUnitDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost that = (ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(associateId, that.associateId)
                .append(businessUnitDraft, that.businessUnitDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(associateId)
                .append(businessUnitDraft)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost copy() {
        return new ByProjectKeyAsAssociateByAssociateIdBusinessUnitsPost(this);
    }
}
