
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Update TaxCategory by key</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyTaxCategoriesKeyByKeyPost
        extends ApiMethod<ByProjectKeyTaxCategoriesKeyByKeyPost, com.commercetools.api.models.tax_category.TaxCategory>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyTaxCategoriesKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyTaxCategoriesKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyTaxCategoriesKeyByKeyPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyTaxCategoriesKeyByKeyPost> {

    private String projectKey;
    private String key;

    private com.commercetools.api.models.tax_category.TaxCategoryUpdate taxCategoryUpdate;

    public ByProjectKeyTaxCategoriesKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.tax_category.TaxCategoryUpdate taxCategoryUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.taxCategoryUpdate = taxCategoryUpdate;
    }

    public ByProjectKeyTaxCategoriesKeyByKeyPost(ByProjectKeyTaxCategoriesKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.taxCategoryUpdate = t.taxCategoryUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/tax-categories/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(taxCategoryUpdate);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.tax_category.TaxCategory> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.tax_category.TaxCategory>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.tax_category.TaxCategory.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getKey() {
        return this.key;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public ByProjectKeyTaxCategoriesKeyByKeyPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyTaxCategoriesKeyByKeyPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyTaxCategoriesKeyByKeyPost copy() {
        return new ByProjectKeyTaxCategoriesKeyByKeyPost(this);
    }
}
