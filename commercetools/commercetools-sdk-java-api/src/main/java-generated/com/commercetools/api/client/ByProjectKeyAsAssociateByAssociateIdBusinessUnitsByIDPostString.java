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
 *            .asAssociate()
 *            .withAssociateIdValue("{associateId}")
 *            .businessUnits()
 *            .withId("{ID}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString extends StringBodyApiMethod<ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString, com.commercetools.api.models.business_unit.BusinessUnit> implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString>, com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString> {

    
    private String projectKey;
    private String associateId;
    private String ID;
    
    private String businessUnitUpdate;

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString(final ApiHttpClient apiHttpClient, String projectKey, String associateId, String ID, String businessUnitUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.associateId = associateId;
        this.ID = ID;
        this.businessUnitUpdate = businessUnitUpdate;
    }

    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString(ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.associateId = t.associateId;
        this.ID = t.ID;
        this.businessUnitUpdate = t.businessUnitUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/as-associate/%s/business-units/%s", this.projectKey, this.associateId, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), businessUnitUpdate.getBytes(StandardCharsets.UTF_8));
    
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
    public String getAssociateId() {return this.associateId;}
    public String getID() {return this.ID;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setAssociateId(final String associateId) { this.associateId = associateId; }
    
    public void setID(final String ID) { this.ID = ID; }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }
    
    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }
    
    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString
     */
    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }
    
    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString
     */
    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }
    
    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString
     */
    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString
     */
    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand").addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }

    
    public String getBody() {
        return businessUnitUpdate;
    }
    
    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString withBody(String businessUnitUpdate) {
        ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString t = copy();
        t.businessUnitUpdate = businessUnitUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString that = (ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(associateId, that.associateId)
                .append(ID, that.ID)
                .append(businessUnitUpdate, that.businessUnitUpdate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(associateId)
            .append(ID)
            .append(businessUnitUpdate)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString copy() {
        return new ByProjectKeyAsAssociateByAssociateIdBusinessUnitsByIDPostString(this);
    }
}
