
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
*  <p>Creating a category produces the CategoryCreated message.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCategoriesPost
        extends ApiMethod<ByProjectKeyCategoriesPost, com.commercetools.api.models.category.Category>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyCategoriesPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCategoriesPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyCategoriesPost> {

    private String projectKey;

    private com.commercetools.api.models.category.CategoryDraft categoryDraft;

    public ByProjectKeyCategoriesPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.category.CategoryDraft categoryDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.categoryDraft = categoryDraft;
    }

    public ByProjectKeyCategoriesPost(ByProjectKeyCategoriesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.categoryDraft = t.categoryDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/categories", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(categoryDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.category.Category> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.category.Category>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.category.Category.class);
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

    public ByProjectKeyCategoriesPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyCategoriesPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyCategoriesPost copy() {
        return new ByProjectKeyCategoriesPost(this);
    }
}
