
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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.approval_flow.ApprovalFlow>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .asAssociate()
 *            .withAssociateIdValue("{associateId}")
 *            .inBusinessUnitKeyWithBusinessUnitKeyValue("{businessUnitKey}")
 *            .approvalFlows()
 *            .withId("{ID}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost extends
        TypeBodyApiMethod<ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost, com.commercetools.api.models.approval_flow.ApprovalFlow, com.commercetools.api.models.approval_flow.ApprovalFlowUpdate>
        implements
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost> {

    @Override
    public TypeReference<com.commercetools.api.models.approval_flow.ApprovalFlow> resultType() {
        return new TypeReference<com.commercetools.api.models.approval_flow.ApprovalFlow>() {
        };
    }

    private String projectKey;
    private String associateId;
    private String businessUnitKey;
    private String ID;

    private com.commercetools.api.models.approval_flow.ApprovalFlowUpdate approvalFlowUpdate;

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost(
            final ApiHttpClient apiHttpClient, String projectKey, String associateId, String businessUnitKey, String ID,
            com.commercetools.api.models.approval_flow.ApprovalFlowUpdate approvalFlowUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.associateId = associateId;
        this.businessUnitKey = businessUnitKey;
        this.ID = ID;
        this.approvalFlowUpdate = approvalFlowUpdate;
    }

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost(
            ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.associateId = t.associateId;
        this.businessUnitKey = t.businessUnitKey;
        this.ID = t.ID;
        this.approvalFlowUpdate = t.approvalFlowUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/as-associate/%s/in-business-unit/key=%s/approval-flows/%s",
            encodePathParam(this.projectKey), encodePathParam(this.associateId), encodePathParam(this.businessUnitKey),
            encodePathParam(this.ID));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(approvalFlowUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.approval_flow.ApprovalFlow> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.approval_flow.ApprovalFlow.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.approval_flow.ApprovalFlow>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.approval_flow.ApprovalFlow.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getAssociateId() {
        return this.associateId;
    }

    public String getBusinessUnitKey() {
        return this.businessUnitKey;
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

    public void setAssociateId(final String associateId) {
        this.associateId = associateId;
    }

    public void setBusinessUnitKey(final String businessUnitKey) {
        this.businessUnitKey = businessUnitKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost withExpand(
            final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost addExpand(
            final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost
     */
    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost withExpand(
            final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost
     */
    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost addExpand(
            final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost
     */
    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost
     */
    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost withExpand(
            final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost addExpand(
            final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.approval_flow.ApprovalFlowUpdate getBody() {
        return approvalFlowUpdate;
    }

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost withBody(
            com.commercetools.api.models.approval_flow.ApprovalFlowUpdate approvalFlowUpdate) {
        ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost t = copy();
        t.approvalFlowUpdate = approvalFlowUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost that = (ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(associateId, that.associateId)
                .append(businessUnitKey, that.businessUnitKey)
                .append(ID, that.ID)
                .append(approvalFlowUpdate, that.approvalFlowUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(associateId)
                .append(businessUnitKey)
                .append(ID)
                .append(approvalFlowUpdate)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost copy() {
        return new ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalFlowsByIDPost(this);
    }
}
