
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyTaxCategoriesPost extends
        BodyApiMethod<ByProjectKeyTaxCategoriesPost, com.commercetools.api.models.tax_category.TaxCategory, com.commercetools.api.models.tax_category.TaxCategoryDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyTaxCategoriesPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyTaxCategoriesPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyTaxCategoriesPost> {

    private String projectKey;

    private com.commercetools.api.models.tax_category.TaxCategoryDraft taxCategoryDraft;

    public ByProjectKeyTaxCategoriesPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.tax_category.TaxCategoryDraft taxCategoryDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.taxCategoryDraft = taxCategoryDraft;
    }

    public ByProjectKeyTaxCategoriesPost(ByProjectKeyTaxCategoriesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.taxCategoryDraft = t.taxCategoryDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/tax-categories", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(taxCategoryDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.tax_category.TaxCategory> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.tax_category.TaxCategory.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.tax_category.TaxCategory>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.tax_category.TaxCategory.class);
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
     */
    public <TValue> ByProjectKeyTaxCategoriesPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyTaxCategoriesPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyTaxCategoriesPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyTaxCategoriesPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyTaxCategoriesPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyTaxCategoriesPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyTaxCategoriesPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyTaxCategoriesPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.tax_category.TaxCategoryDraft getBody() {
        return taxCategoryDraft;
    }

    public ByProjectKeyTaxCategoriesPost withBody(
            com.commercetools.api.models.tax_category.TaxCategoryDraft taxCategoryDraft) {
        ByProjectKeyTaxCategoriesPost t = copy();
        t.taxCategoryDraft = taxCategoryDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyTaxCategoriesPost that = (ByProjectKeyTaxCategoriesPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(taxCategoryDraft, that.taxCategoryDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(taxCategoryDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyTaxCategoriesPost copy() {
        return new ByProjectKeyTaxCategoriesPost(this);
    }
}
