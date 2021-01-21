
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.utils.Utils;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMePasswordPost
        extends ApiMethod<ByProjectKeyMePasswordPost, com.commercetools.api.models.me.MyCustomer>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyMePasswordPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMePasswordPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyMePasswordPost> {

    private String projectKey;

    private com.fasterxml.jackson.databind.JsonNode jsonNode;

    public ByProjectKeyMePasswordPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.fasterxml.jackson.databind.JsonNode jsonNode) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.jsonNode = jsonNode;
    }

    public ByProjectKeyMePasswordPost(ByProjectKeyMePasswordPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.jsonNode = t.jsonNode;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/password", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(jsonNode);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.me.MyCustomer> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.me.MyCustomer>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.me.MyCustomer.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    @Override
    protected ByProjectKeyMePasswordPost copy() {
        return new ByProjectKeyMePasswordPost(this);
    }
}
