
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

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Automatically assigns the Associate to the Business Unit in the default Associate Role defined in BusinessUnitConfiguration. If there is no default Associate Role configured, this request fails with an InvalidOperation error. When creating a Division, the Associate must have the <code>AddChildUnits</code> Permission in the parent unit. If the required Permission is missing, an AssociateMissingPermission error is returned.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.business_unit.BusinessUnit>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .me()
 *            .businessUnits()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeBusinessUnitsPostString extends
        StringBodyApiMethod<ByProjectKeyMeBusinessUnitsPostString, com.commercetools.api.models.business_unit.BusinessUnit>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeBusinessUnitsPostString>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyMeBusinessUnitsPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeBusinessUnitsPostString> {

    private String projectKey;

    private String myBusinessUnitDraft;

    public ByProjectKeyMeBusinessUnitsPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String myBusinessUnitDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myBusinessUnitDraft = myBusinessUnitDraft;
    }

    public ByProjectKeyMeBusinessUnitsPostString(ByProjectKeyMeBusinessUnitsPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.myBusinessUnitDraft = t.myBusinessUnitDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/me/business-units", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            myBusinessUnitDraft.getBytes(StandardCharsets.UTF_8));

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

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyMeBusinessUnitsPostString
     */
    public <TValue> ByProjectKeyMeBusinessUnitsPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyMeBusinessUnitsPostString
     */
    public <TValue> ByProjectKeyMeBusinessUnitsPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyMeBusinessUnitsPostString
     */
    public ByProjectKeyMeBusinessUnitsPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyMeBusinessUnitsPostString
     */
    public ByProjectKeyMeBusinessUnitsPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyMeBusinessUnitsPostString
     */
    public ByProjectKeyMeBusinessUnitsPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyMeBusinessUnitsPostString
     */
    public ByProjectKeyMeBusinessUnitsPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyMeBusinessUnitsPostString
     */
    public <TValue> ByProjectKeyMeBusinessUnitsPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyMeBusinessUnitsPostString
     */
    public <TValue> ByProjectKeyMeBusinessUnitsPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return myBusinessUnitDraft;
    }

    public ByProjectKeyMeBusinessUnitsPostString withBody(String myBusinessUnitDraft) {
        ByProjectKeyMeBusinessUnitsPostString t = copy();
        t.myBusinessUnitDraft = myBusinessUnitDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMeBusinessUnitsPostString that = (ByProjectKeyMeBusinessUnitsPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(myBusinessUnitDraft, that.myBusinessUnitDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(myBusinessUnitDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyMeBusinessUnitsPostString copy() {
        return new ByProjectKeyMeBusinessUnitsPostString(this);
    }
}
