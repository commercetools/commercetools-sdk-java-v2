
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Updates a Business Unit for a given <code>id</code>. Returns a <code>200</code> status if the Business Unit exists and the Customer has access to it, or a ResourceNotFound error otherwise.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.business_unit.BusinessUnit>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .me()
 *            .businessUnits()
 *            .withId("{ID}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeBusinessUnitsByIDPostString extends
        StringBodyApiMethod<ByProjectKeyMeBusinessUnitsByIDPostString, com.commercetools.api.models.business_unit.BusinessUnit>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyMeBusinessUnitsByIDPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeBusinessUnitsByIDPostString>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyMeBusinessUnitsByIDPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeBusinessUnitsByIDPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.business_unit.BusinessUnit> resultType() {
        return new TypeReference<com.commercetools.api.models.business_unit.BusinessUnit>() {
        };
    }

    private String projectKey;
    private String ID;

    private String myBusinessUnitUpdate;

    public ByProjectKeyMeBusinessUnitsByIDPostString(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            String myBusinessUnitUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.myBusinessUnitUpdate = myBusinessUnitUpdate;
    }

    public ByProjectKeyMeBusinessUnitsByIDPostString(ByProjectKeyMeBusinessUnitsByIDPostString t) {
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
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            myBusinessUnitUpdate.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.business_unit.BusinessUnit> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.business_unit.BusinessUnit.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.business_unit.BusinessUnit>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.business_unit.BusinessUnit.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyMeBusinessUnitsByIDPostString
     */
    public <TValue> ByProjectKeyMeBusinessUnitsByIDPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyMeBusinessUnitsByIDPostString
     */
    public <TValue> ByProjectKeyMeBusinessUnitsByIDPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyMeBusinessUnitsByIDPostString
     */
    public ByProjectKeyMeBusinessUnitsByIDPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyMeBusinessUnitsByIDPostString
     */
    public ByProjectKeyMeBusinessUnitsByIDPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyMeBusinessUnitsByIDPostString
     */
    public ByProjectKeyMeBusinessUnitsByIDPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyMeBusinessUnitsByIDPostString
     */
    public ByProjectKeyMeBusinessUnitsByIDPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyMeBusinessUnitsByIDPostString
     */
    public <TValue> ByProjectKeyMeBusinessUnitsByIDPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyMeBusinessUnitsByIDPostString
     */
    public <TValue> ByProjectKeyMeBusinessUnitsByIDPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return myBusinessUnitUpdate;
    }

    public ByProjectKeyMeBusinessUnitsByIDPostString withBody(String myBusinessUnitUpdate) {
        ByProjectKeyMeBusinessUnitsByIDPostString t = copy();
        t.myBusinessUnitUpdate = myBusinessUnitUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMeBusinessUnitsByIDPostString that = (ByProjectKeyMeBusinessUnitsByIDPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(myBusinessUnitUpdate, that.myBusinessUnitUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(myBusinessUnitUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyMeBusinessUnitsByIDPostString copy() {
        return new ByProjectKeyMeBusinessUnitsByIDPostString(this);
    }
}
