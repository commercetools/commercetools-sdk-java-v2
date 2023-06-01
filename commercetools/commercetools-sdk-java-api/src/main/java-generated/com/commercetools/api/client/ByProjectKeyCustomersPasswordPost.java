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
 *  <p>Changing the password produces the CustomerPasswordUpdated Message with <code>reset=false</code>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .customers()
 *            .password()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyCustomersPasswordPost extends BodyApiMethod<ByProjectKeyCustomersPasswordPost, com.commercetools.api.models.customer.Customer, com.commercetools.api.models.customer.CustomerChangePassword> implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomersPasswordPost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.customer.CustomerChangePassword customerChangePassword;

    public ByProjectKeyCustomersPasswordPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.customer.CustomerChangePassword customerChangePassword) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerChangePassword = customerChangePassword;
    }

    public ByProjectKeyCustomersPasswordPost(ByProjectKeyCustomersPasswordPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerChangePassword = t.customerChangePassword;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/customers/password", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), io.vrap.rmf.base.client.utils.json.JsonUtils.executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(customerChangePassword)));
    
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


    
    public com.commercetools.api.models.customer.CustomerChangePassword getBody() {
        return customerChangePassword;
    }
    
    public ByProjectKeyCustomersPasswordPost withBody(com.commercetools.api.models.customer.CustomerChangePassword customerChangePassword) {
        ByProjectKeyCustomersPasswordPost t = copy();
        t.customerChangePassword = customerChangePassword;
        return t;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyCustomersPasswordPost that = (ByProjectKeyCustomersPasswordPost) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(customerChangePassword, that.customerChangePassword)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(customerChangePassword)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyCustomersPasswordPost copy() {
        return new ByProjectKeyCustomersPasswordPost(this);
    }
}
