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
 *  <p>The customer verifies the email using the token value. Verifying the email of the Customer produces the CustomerEmailVerified Message.</p>
 *  <p>If the Customer exists in the Project but the <code>stores</code> field references a different Store, this method returns a ResourceNotFound error.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .customers()
 *            .emailConfirm()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost extends BodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost, com.commercetools.api.models.customer.Customer, com.commercetools.api.models.customer.CustomerEmailVerify> implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost> {

    
    private String projectKey;
    private String storeKey;
    
    private com.commercetools.api.models.customer.CustomerEmailVerify customerEmailVerify;

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost(final ApiHttpClient apiHttpClient, String projectKey, String storeKey, com.commercetools.api.models.customer.CustomerEmailVerify customerEmailVerify) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.customerEmailVerify = customerEmailVerify;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost(ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.customerEmailVerify = t.customerEmailVerify;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/customers/email/confirm", this.projectKey, this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), io.vrap.rmf.base.client.utils.json.JsonUtils.executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(customerEmailVerify)));
    
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
    public String getStoreKey() {return this.storeKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setStoreKey(final String storeKey) { this.storeKey = storeKey; }


    
    public com.commercetools.api.models.customer.CustomerEmailVerify getBody() {
        return customerEmailVerify;
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost withBody(com.commercetools.api.models.customer.CustomerEmailVerify customerEmailVerify) {
        ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost t = copy();
        t.customerEmailVerify = customerEmailVerify;
        return t;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost that = (ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(customerEmailVerify, that.customerEmailVerify)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(storeKey)
            .append(customerEmailVerify)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost(this);
    }
}
