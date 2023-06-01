package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;

import java.io.InputStream;
import java.io.IOException;

import java.net.URI;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;
import io.vrap.rmf.base.client.utils.Generated;

import javax.annotation.Nullable;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

/**
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .me()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyMePostString extends StringBodyApiMethod<ByProjectKeyMePostString, com.commercetools.api.models.customer.Customer> implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyMePostString> {

    
    private String projectKey;
    
    private String myCustomerUpdate;

    public ByProjectKeyMePostString(final ApiHttpClient apiHttpClient, String projectKey, String myCustomerUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myCustomerUpdate = myCustomerUpdate;
    }

    public ByProjectKeyMePostString(ByProjectKeyMePostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.myCustomerUpdate = t.myCustomerUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/me", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), myCustomerUpdate.getBytes(StandardCharsets.UTF_8));
    
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.Customer> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.customer.Customer.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.customer.Customer.class);
    }

    public String getProjectKey() {return this.projectKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }


    
    public String getBody() {
        return myCustomerUpdate;
    }
    
    public ByProjectKeyMePostString withBody(String myCustomerUpdate) {
        ByProjectKeyMePostString t = copy();
        t.myCustomerUpdate = myCustomerUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyMePostString that = (ByProjectKeyMePostString) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(myCustomerUpdate, that.myCustomerUpdate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(myCustomerUpdate)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyMePostString copy() {
        return new ByProjectKeyMePostString(this);
    }
}
