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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerToken>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .customers()
 *            .emailToken()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyCustomersEmailTokenPost extends BodyApiMethod<ByProjectKeyCustomersEmailTokenPost, com.commercetools.api.models.customer.CustomerToken, com.commercetools.api.models.customer.CustomerCreateEmailToken> implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomersEmailTokenPost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.customer.CustomerCreateEmailToken customerCreateEmailToken;

    public ByProjectKeyCustomersEmailTokenPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.customer.CustomerCreateEmailToken customerCreateEmailToken) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerCreateEmailToken = customerCreateEmailToken;
    }

    public ByProjectKeyCustomersEmailTokenPost(ByProjectKeyCustomersEmailTokenPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerCreateEmailToken = t.customerCreateEmailToken;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/customers/email-token", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), io.vrap.rmf.base.client.utils.json.JsonUtils.executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(customerCreateEmailToken)));
    
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.CustomerToken> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.customer.CustomerToken.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerToken>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.customer.CustomerToken.class);
    }

    public String getProjectKey() {return this.projectKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }


    
    public com.commercetools.api.models.customer.CustomerCreateEmailToken getBody() {
        return customerCreateEmailToken;
    }
    
    public ByProjectKeyCustomersEmailTokenPost withBody(com.commercetools.api.models.customer.CustomerCreateEmailToken customerCreateEmailToken) {
        ByProjectKeyCustomersEmailTokenPost t = copy();
        t.customerCreateEmailToken = customerCreateEmailToken;
        return t;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyCustomersEmailTokenPost that = (ByProjectKeyCustomersEmailTokenPost) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(customerCreateEmailToken, that.customerCreateEmailToken)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(customerCreateEmailToken)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyCustomersEmailTokenPost copy() {
        return new ByProjectKeyCustomersEmailTokenPost(this);
    }
}
