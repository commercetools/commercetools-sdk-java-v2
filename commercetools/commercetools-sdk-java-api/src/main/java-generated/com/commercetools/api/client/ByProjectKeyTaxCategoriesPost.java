
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyTaxCategoriesPost
        extends ApiMethod<ByProjectKeyTaxCategoriesPost, com.commercetools.api.models.tax_category.TaxCategory>
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
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/tax-categories", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(taxCategoryDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.tax_category.TaxCategory> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.tax_category.TaxCategory.class),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.tax_category.TaxCategory>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.tax_category.TaxCategory.class);
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
    public ByProjectKeyTaxCategoriesPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyTaxCategoriesPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyTaxCategoriesPost copy() {
        return new ByProjectKeyTaxCategoriesPost(this);
    }
}
