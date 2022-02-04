
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomerGroupsPost extends
        BodyApiMethod<ByProjectKeyCustomerGroupsPost, com.commercetools.api.models.customer_group.CustomerGroup, com.commercetools.api.models.customer_group.CustomerGroupDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomerGroupsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyCustomerGroupsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomerGroupsPost> {

    private String projectKey;

    private com.commercetools.api.models.customer_group.CustomerGroupDraft customerGroupDraft;

    public ByProjectKeyCustomerGroupsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.customer_group.CustomerGroupDraft customerGroupDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerGroupDraft = customerGroupDraft;
    }

    public ByProjectKeyCustomerGroupsPost(ByProjectKeyCustomerGroupsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerGroupDraft = t.customerGroupDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customer-groups", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(customerGroupDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer_group.CustomerGroup> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.customer_group.CustomerGroup.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer_group.CustomerGroup>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.customer_group.CustomerGroup.class);
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
     * set expand with the specificied value
     */
    public ByProjectKeyCustomerGroupsPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCustomerGroupsPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyCustomerGroupsPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyCustomerGroupsPost addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.customer_group.CustomerGroupDraft getBody() {
        return customerGroupDraft;
    }

    public ByProjectKeyCustomerGroupsPost withBody(
            com.commercetools.api.models.customer_group.CustomerGroupDraft customerGroupDraft) {
        ByProjectKeyCustomerGroupsPost t = copy();
        t.customerGroupDraft = customerGroupDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCustomerGroupsPost that = (ByProjectKeyCustomerGroupsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(customerGroupDraft, that.customerGroupDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(customerGroupDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyCustomerGroupsPost copy() {
        return new ByProjectKeyCustomerGroupsPost(this);
    }
}
