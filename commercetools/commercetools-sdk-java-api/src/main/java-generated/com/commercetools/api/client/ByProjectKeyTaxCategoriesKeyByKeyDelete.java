
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
*  <p>Delete TaxCategory by key</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyTaxCategoriesKeyByKeyDelete extends
        ApiMethod<ByProjectKeyTaxCategoriesKeyByKeyDelete, com.commercetools.api.models.tax_category.TaxCategory>
        implements com.commercetools.api.client.VersionedTrait<ByProjectKeyTaxCategoriesKeyByKeyDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyTaxCategoriesKeyByKeyDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyTaxCategoriesKeyByKeyDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyTaxCategoriesKeyByKeyDelete>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyTaxCategoriesKeyByKeyDelete> {

    private String projectKey;
    private String key;

    public ByProjectKeyTaxCategoriesKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyTaxCategoriesKeyByKeyDelete(ByProjectKeyTaxCategoriesKeyByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/tax-categories/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
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

    public List<String> getVersion() {
        return this.getQueryParam("version");
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

    public ByProjectKeyTaxCategoriesKeyByKeyDelete withVersion(final Long version) {
        return copy().withQueryParam("version", version);
    }

    public ByProjectKeyTaxCategoriesKeyByKeyDelete addVersion(final Long version) {
        return copy().addQueryParam("version", version);
    }

    public ByProjectKeyTaxCategoriesKeyByKeyDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyTaxCategoriesKeyByKeyDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyTaxCategoriesKeyByKeyDelete copy() {
        return new ByProjectKeyTaxCategoriesKeyByKeyDelete(this);
    }
}
