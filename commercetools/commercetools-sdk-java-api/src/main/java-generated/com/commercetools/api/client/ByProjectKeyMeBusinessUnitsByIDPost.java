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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.business_unit.BusinessUnit>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .me()
 *            .businessUnits()
 *            .withId("{ID}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyMeBusinessUnitsByIDPost extends BodyApiMethod<ByProjectKeyMeBusinessUnitsByIDPost, com.commercetools.api.models.business_unit.BusinessUnit, com.commercetools.api.models.me.MyBusinessUnitUpdate> implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyMeBusinessUnitsByIDPost>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeBusinessUnitsByIDPost>, com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyMeBusinessUnitsByIDPost>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeBusinessUnitsByIDPost> {

    
    private String projectKey;
    private String ID;
    
    private com.commercetools.api.models.me.MyBusinessUnitUpdate myBusinessUnitUpdate;

    public ByProjectKeyMeBusinessUnitsByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID, com.commercetools.api.models.me.MyBusinessUnitUpdate myBusinessUnitUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.myBusinessUnitUpdate = myBusinessUnitUpdate;
    }

    public ByProjectKeyMeBusinessUnitsByIDPost(ByProjectKeyMeBusinessUnitsByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.myBusinessUnitUpdate = t.myBusinessUnitUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/me/business-units/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), io.vrap.rmf.base.client.utils.json.JsonUtils.executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(myBusinessUnitUpdate)));
    
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.business_unit.BusinessUnit> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.business_unit.BusinessUnit.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.business_unit.BusinessUnit>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.business_unit.BusinessUnit.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getID() {return this.ID;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setID(final String ID) { this.ID = ID; }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyMeBusinessUnitsByIDPost
     */
    public <TValue> ByProjectKeyMeBusinessUnitsByIDPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }
    
    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyMeBusinessUnitsByIDPost
     */
    public <TValue> ByProjectKeyMeBusinessUnitsByIDPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }
    
    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyMeBusinessUnitsByIDPost
     */
    public ByProjectKeyMeBusinessUnitsByIDPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }
    
    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyMeBusinessUnitsByIDPost
     */
    public ByProjectKeyMeBusinessUnitsByIDPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }
    
    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyMeBusinessUnitsByIDPost
     */
    public ByProjectKeyMeBusinessUnitsByIDPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyMeBusinessUnitsByIDPost
     */
    public ByProjectKeyMeBusinessUnitsByIDPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyMeBusinessUnitsByIDPost
     */
    public <TValue> ByProjectKeyMeBusinessUnitsByIDPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand").addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyMeBusinessUnitsByIDPost
     */
    public <TValue> ByProjectKeyMeBusinessUnitsByIDPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }

    
    public com.commercetools.api.models.me.MyBusinessUnitUpdate getBody() {
        return myBusinessUnitUpdate;
    }
    
    public ByProjectKeyMeBusinessUnitsByIDPost withBody(com.commercetools.api.models.me.MyBusinessUnitUpdate myBusinessUnitUpdate) {
        ByProjectKeyMeBusinessUnitsByIDPost t = copy();
        t.myBusinessUnitUpdate = myBusinessUnitUpdate;
        return t;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyMeBusinessUnitsByIDPost that = (ByProjectKeyMeBusinessUnitsByIDPost) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(myBusinessUnitUpdate, that.myBusinessUnitUpdate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(ID)
            .append(myBusinessUnitUpdate)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyMeBusinessUnitsByIDPost copy() {
        return new ByProjectKeyMeBusinessUnitsByIDPost(this);
    }
}
