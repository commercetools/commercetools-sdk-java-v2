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
 *            .withKey("{key}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyMeBusinessUnitsKeyByKeyPostString extends StringBodyApiMethod<ByProjectKeyMeBusinessUnitsKeyByKeyPostString, com.commercetools.api.models.business_unit.BusinessUnit> implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyMeBusinessUnitsKeyByKeyPostString>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeBusinessUnitsKeyByKeyPostString>, com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyMeBusinessUnitsKeyByKeyPostString>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeBusinessUnitsKeyByKeyPostString> {

    
    private String projectKey;
    private String key;
    
    private String myBusinessUnitUpdate;

    public ByProjectKeyMeBusinessUnitsKeyByKeyPostString(final ApiHttpClient apiHttpClient, String projectKey, String key, String myBusinessUnitUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.myBusinessUnitUpdate = myBusinessUnitUpdate;
    }

    public ByProjectKeyMeBusinessUnitsKeyByKeyPostString(ByProjectKeyMeBusinessUnitsKeyByKeyPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.myBusinessUnitUpdate = t.myBusinessUnitUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/me/business-units/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), myBusinessUnitUpdate.getBytes(StandardCharsets.UTF_8));
    
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
    public String getKey() {return this.key;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setKey(final String key) { this.key = key; }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyMeBusinessUnitsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyMeBusinessUnitsKeyByKeyPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }
    
    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyMeBusinessUnitsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyMeBusinessUnitsKeyByKeyPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }
    
    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyMeBusinessUnitsKeyByKeyPostString
     */
    public ByProjectKeyMeBusinessUnitsKeyByKeyPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }
    
    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyMeBusinessUnitsKeyByKeyPostString
     */
    public ByProjectKeyMeBusinessUnitsKeyByKeyPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }
    
    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyMeBusinessUnitsKeyByKeyPostString
     */
    public ByProjectKeyMeBusinessUnitsKeyByKeyPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyMeBusinessUnitsKeyByKeyPostString
     */
    public ByProjectKeyMeBusinessUnitsKeyByKeyPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyMeBusinessUnitsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyMeBusinessUnitsKeyByKeyPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand").addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyMeBusinessUnitsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyMeBusinessUnitsKeyByKeyPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }

    
    public String getBody() {
        return myBusinessUnitUpdate;
    }
    
    public ByProjectKeyMeBusinessUnitsKeyByKeyPostString withBody(String myBusinessUnitUpdate) {
        ByProjectKeyMeBusinessUnitsKeyByKeyPostString t = copy();
        t.myBusinessUnitUpdate = myBusinessUnitUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyMeBusinessUnitsKeyByKeyPostString that = (ByProjectKeyMeBusinessUnitsKeyByKeyPostString) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(myBusinessUnitUpdate, that.myBusinessUnitUpdate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(key)
            .append(myBusinessUnitUpdate)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyMeBusinessUnitsKeyByKeyPostString copy() {
        return new ByProjectKeyMeBusinessUnitsKeyByKeyPostString(this);
    }
}
