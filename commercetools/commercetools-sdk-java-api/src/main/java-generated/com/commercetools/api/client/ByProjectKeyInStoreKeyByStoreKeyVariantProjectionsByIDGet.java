
package com.commercetools.api.client;

import java.net.URI;
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

import tools.jackson.core.type.TypeReference;

/**
 *  <p>Retrieves a Variant Projection by its ID in the specified <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
 *  <p>Only returns Variants belonging to Products distributed through the Store's configured channels.</p>
 *  <p>Required access scopes:</p>
 *  <ul>
 *   <li><p>To retrieve the current representation, the <code>view_published_products:{projectKey}</code> scope is required.</p></li>
 *   <li><p>To retrieve the staged representation, the API Client must have the <code>view_products:{projectKey}</code> scope.</p></li>
 *   <li><p>To access Variant Projections in the context of a Store, the <code>view_products:{projectKey}:{storeKey}</code> scope is required.</p></li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.variant.VariantProjection>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .variantProjections()
 *            .withId("{ID}")
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet extends
        TypeApiMethod<ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet, com.commercetools.api.models.variant.VariantProjection>
        implements
        com.commercetools.api.client.ProjectionselectingvariantTrait<ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet>,
        com.commercetools.api.client.PriceselectingTrait<ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet>,
        com.commercetools.api.client.LocaleprojectingTrait<ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet>,
        com.commercetools.api.client.AttributefilteringTrait<ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet> {

    @Override
    public TypeReference<com.commercetools.api.models.variant.VariantProjection> resultType() {
        return new TypeReference<com.commercetools.api.models.variant.VariantProjection>() {
        };
    }

    private String projectKey;
    private String storeKey;
    private String ID;

    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet(
            ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.ID = t.ID;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/variant-projections/%s",
            encodePathParam(this.projectKey), encodePathParam(this.storeKey), encodePathParam(this.ID));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.variant.VariantProjection> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.variant.VariantProjection.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.variant.VariantProjection>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.variant.VariantProjection.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public String getID() {
        return this.ID;
    }

    public List<String> getStaged() {
        return this.getQueryParam("staged");
    }

    public List<String> getPriceCurrency() {
        return this.getQueryParam("priceCurrency");
    }

    public List<String> getPriceCountry() {
        return this.getQueryParam("priceCountry");
    }

    public List<String> getPriceCustomerGroup() {
        return this.getQueryParam("priceCustomerGroup");
    }

    public List<String> getPriceCustomerGroupAssignments() {
        return this.getQueryParam("priceCustomerGroupAssignments");
    }

    public List<String> getPriceChannel() {
        return this.getQueryParam("priceChannel");
    }

    public List<String> getPriceRecurrencePolicy() {
        return this.getQueryParam("priceRecurrencePolicy");
    }

    public List<String> getLocaleProjection() {
        return this.getQueryParam("localeProjection");
    }

    public List<String> getFilterAttributes() {
        return this.getQueryParam("filter[attributes]");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set staged with the specified value
     * @param staged value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withStaged(final TValue staged) {
        return copy().withQueryParam("staged", staged);
    }

    /**
     * add additional staged query parameter
     * @param staged value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addStaged(final TValue staged) {
        return copy().addQueryParam("staged", staged);
    }

    /**
     * set staged with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withStaged(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("staged", supplier.get());
    }

    /**
     * add additional staged query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addStaged(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("staged", supplier.get());
    }

    /**
     * set staged with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withStaged(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * add additional staged query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addStaged(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * set staged with the specified values
     * @param staged values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withStaged(
            final Collection<TValue> staged) {
        return copy().withoutQueryParam("staged")
                .addQueryParams(
                    staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional staged query parameters
     * @param staged values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addStaged(
            final Collection<TValue> staged) {
        return copy().addQueryParams(
            staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set priceCurrency with the specified value
     * @param priceCurrency value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceCurrency(
            final TValue priceCurrency) {
        return copy().withQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * add additional priceCurrency query parameter
     * @param priceCurrency value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceCurrency(
            final TValue priceCurrency) {
        return copy().addQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * set priceCurrency with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceCurrency(
            final Supplier<String> supplier) {
        return copy().withQueryParam("priceCurrency", supplier.get());
    }

    /**
     * add additional priceCurrency query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceCurrency(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCurrency", supplier.get());
    }

    /**
     * set priceCurrency with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceCurrency(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCurrency query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceCurrency(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * set priceCurrency with the specified values
     * @param priceCurrency values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceCurrency(
            final Collection<TValue> priceCurrency) {
        return copy().withoutQueryParam("priceCurrency")
                .addQueryParams(priceCurrency.stream()
                        .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCurrency query parameters
     * @param priceCurrency values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceCurrency(
            final Collection<TValue> priceCurrency) {
        return copy().addQueryParams(priceCurrency.stream()
                .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCountry with the specified value
     * @param priceCountry value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceCountry(
            final TValue priceCountry) {
        return copy().withQueryParam("priceCountry", priceCountry);
    }

    /**
     * add additional priceCountry query parameter
     * @param priceCountry value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceCountry(
            final TValue priceCountry) {
        return copy().addQueryParam("priceCountry", priceCountry);
    }

    /**
     * set priceCountry with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceCountry(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCountry", supplier.get());
    }

    /**
     * add additional priceCountry query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceCountry(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCountry", supplier.get());
    }

    /**
     * set priceCountry with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceCountry(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCountry query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceCountry(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * set priceCountry with the specified values
     * @param priceCountry values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceCountry(
            final Collection<TValue> priceCountry) {
        return copy().withoutQueryParam("priceCountry")
                .addQueryParams(priceCountry.stream()
                        .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCountry query parameters
     * @param priceCountry values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceCountry(
            final Collection<TValue> priceCountry) {
        return copy().addQueryParams(priceCountry.stream()
                .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param priceCustomerGroup value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceCustomerGroup(
            final TValue priceCustomerGroup) {
        return copy().withQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param priceCustomerGroup value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceCustomerGroup(
            final TValue priceCustomerGroup) {
        return copy().addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceCustomerGroup(
            final Supplier<String> supplier) {
        return copy().withQueryParam("priceCustomerGroup", supplier.get());
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceCustomerGroup(
            final Supplier<String> supplier) {
        return copy().addQueryParam("priceCustomerGroup", supplier.get());
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceCustomerGroup(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceCustomerGroup(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * set priceCustomerGroup with the specified values
     * @param priceCustomerGroup values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceCustomerGroup(
            final Collection<TValue> priceCustomerGroup) {
        return copy().withoutQueryParam("priceCustomerGroup")
                .addQueryParams(priceCustomerGroup.stream()
                        .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCustomerGroup query parameters
     * @param priceCustomerGroup values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceCustomerGroup(
            final Collection<TValue> priceCustomerGroup) {
        return copy().addQueryParams(priceCustomerGroup.stream()
                .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCustomerGroupAssignments with the specified value
     * @param priceCustomerGroupAssignments value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceCustomerGroupAssignments(
            final TValue priceCustomerGroupAssignments) {
        return copy().withQueryParam("priceCustomerGroupAssignments", priceCustomerGroupAssignments);
    }

    /**
     * add additional priceCustomerGroupAssignments query parameter
     * @param priceCustomerGroupAssignments value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceCustomerGroupAssignments(
            final TValue priceCustomerGroupAssignments) {
        return copy().addQueryParam("priceCustomerGroupAssignments", priceCustomerGroupAssignments);
    }

    /**
     * set priceCustomerGroupAssignments with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceCustomerGroupAssignments(
            final Supplier<String> supplier) {
        return copy().withQueryParam("priceCustomerGroupAssignments", supplier.get());
    }

    /**
     * add additional priceCustomerGroupAssignments query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceCustomerGroupAssignments(
            final Supplier<String> supplier) {
        return copy().addQueryParam("priceCustomerGroupAssignments", supplier.get());
    }

    /**
     * set priceCustomerGroupAssignments with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceCustomerGroupAssignments(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCustomerGroupAssignments", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCustomerGroupAssignments query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceCustomerGroupAssignments(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCustomerGroupAssignments", op.apply(new StringBuilder()));
    }

    /**
     * set priceCustomerGroupAssignments with the specified values
     * @param priceCustomerGroupAssignments values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceCustomerGroupAssignments(
            final Collection<TValue> priceCustomerGroupAssignments) {
        return copy().withoutQueryParam("priceCustomerGroupAssignments")
                .addQueryParams(priceCustomerGroupAssignments.stream()
                        .map(s -> new ParamEntry<>("priceCustomerGroupAssignments", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCustomerGroupAssignments query parameters
     * @param priceCustomerGroupAssignments values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceCustomerGroupAssignments(
            final Collection<TValue> priceCustomerGroupAssignments) {
        return copy().addQueryParams(priceCustomerGroupAssignments.stream()
                .map(s -> new ParamEntry<>("priceCustomerGroupAssignments", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceChannel with the specified value
     * @param priceChannel value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceChannel(
            final TValue priceChannel) {
        return copy().withQueryParam("priceChannel", priceChannel);
    }

    /**
     * add additional priceChannel query parameter
     * @param priceChannel value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceChannel(
            final TValue priceChannel) {
        return copy().addQueryParam("priceChannel", priceChannel);
    }

    /**
     * set priceChannel with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceChannel(final Supplier<String> supplier) {
        return copy().withQueryParam("priceChannel", supplier.get());
    }

    /**
     * add additional priceChannel query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceChannel(final Supplier<String> supplier) {
        return copy().addQueryParam("priceChannel", supplier.get());
    }

    /**
     * set priceChannel with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceChannel(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceChannel query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceChannel(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * set priceChannel with the specified values
     * @param priceChannel values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceChannel(
            final Collection<TValue> priceChannel) {
        return copy().withoutQueryParam("priceChannel")
                .addQueryParams(priceChannel.stream()
                        .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceChannel query parameters
     * @param priceChannel values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceChannel(
            final Collection<TValue> priceChannel) {
        return copy().addQueryParams(priceChannel.stream()
                .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceRecurrencePolicy with the specified value
     * @param priceRecurrencePolicy value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceRecurrencePolicy(
            final TValue priceRecurrencePolicy) {
        return copy().withQueryParam("priceRecurrencePolicy", priceRecurrencePolicy);
    }

    /**
     * add additional priceRecurrencePolicy query parameter
     * @param priceRecurrencePolicy value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceRecurrencePolicy(
            final TValue priceRecurrencePolicy) {
        return copy().addQueryParam("priceRecurrencePolicy", priceRecurrencePolicy);
    }

    /**
     * set priceRecurrencePolicy with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceRecurrencePolicy(
            final Supplier<String> supplier) {
        return copy().withQueryParam("priceRecurrencePolicy", supplier.get());
    }

    /**
     * add additional priceRecurrencePolicy query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceRecurrencePolicy(
            final Supplier<String> supplier) {
        return copy().addQueryParam("priceRecurrencePolicy", supplier.get());
    }

    /**
     * set priceRecurrencePolicy with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceRecurrencePolicy(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceRecurrencePolicy", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceRecurrencePolicy query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceRecurrencePolicy(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceRecurrencePolicy", op.apply(new StringBuilder()));
    }

    /**
     * set priceRecurrencePolicy with the specified values
     * @param priceRecurrencePolicy values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withPriceRecurrencePolicy(
            final Collection<TValue> priceRecurrencePolicy) {
        return copy().withoutQueryParam("priceRecurrencePolicy")
                .addQueryParams(priceRecurrencePolicy.stream()
                        .map(s -> new ParamEntry<>("priceRecurrencePolicy", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceRecurrencePolicy query parameters
     * @param priceRecurrencePolicy values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addPriceRecurrencePolicy(
            final Collection<TValue> priceRecurrencePolicy) {
        return copy().addQueryParams(priceRecurrencePolicy.stream()
                .map(s -> new ParamEntry<>("priceRecurrencePolicy", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set localeProjection with the specified value
     * @param localeProjection value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withLocaleProjection(
            final TValue localeProjection) {
        return copy().withQueryParam("localeProjection", localeProjection);
    }

    /**
     * add additional localeProjection query parameter
     * @param localeProjection value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addLocaleProjection(
            final TValue localeProjection) {
        return copy().addQueryParam("localeProjection", localeProjection);
    }

    /**
     * set localeProjection with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withLocaleProjection(
            final Supplier<String> supplier) {
        return copy().withQueryParam("localeProjection", supplier.get());
    }

    /**
     * add additional localeProjection query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addLocaleProjection(
            final Supplier<String> supplier) {
        return copy().addQueryParam("localeProjection", supplier.get());
    }

    /**
     * set localeProjection with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withLocaleProjection(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * add additional localeProjection query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addLocaleProjection(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * set localeProjection with the specified values
     * @param localeProjection values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withLocaleProjection(
            final Collection<TValue> localeProjection) {
        return copy().withoutQueryParam("localeProjection")
                .addQueryParams(localeProjection.stream()
                        .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional localeProjection query parameters
     * @param localeProjection values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addLocaleProjection(
            final Collection<TValue> localeProjection) {
        return copy().addQueryParams(localeProjection.stream()
                .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set filterAttributes with the specified value
     * @param filterAttributes value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withFilterAttributes(
            final TValue filterAttributes) {
        return copy().withQueryParam("filter[attributes]", filterAttributes);
    }

    /**
     * add additional filterAttributes query parameter
     * @param filterAttributes value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addFilterAttributes(
            final TValue filterAttributes) {
        return copy().addQueryParam("filter[attributes]", filterAttributes);
    }

    /**
     * set filterAttributes with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withFilterAttributes(
            final Supplier<String> supplier) {
        return copy().withQueryParam("filter[attributes]", supplier.get());
    }

    /**
     * add additional filterAttributes query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addFilterAttributes(
            final Supplier<String> supplier) {
        return copy().addQueryParam("filter[attributes]", supplier.get());
    }

    /**
     * set filterAttributes with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withFilterAttributes(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("filter[attributes]", op.apply(new StringBuilder()));
    }

    /**
     * add additional filterAttributes query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addFilterAttributes(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("filter[attributes]", op.apply(new StringBuilder()));
    }

    /**
     * set filterAttributes with the specified values
     * @param filterAttributes values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withFilterAttributes(
            final Collection<TValue> filterAttributes) {
        return copy().withoutQueryParam("filter[attributes]")
                .addQueryParams(filterAttributes.stream()
                        .map(s -> new ParamEntry<>("filter[attributes]", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional filterAttributes query parameters
     * @param filterAttributes values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addFilterAttributes(
            final Collection<TValue> filterAttributes) {
        return copy().addQueryParams(filterAttributes.stream()
                .map(s -> new ParamEntry<>("filter[attributes]", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet withExpand(
            final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet addExpand(
            final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet that = (ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(ID, that.ID)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(ID).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsByIDGet(this);
    }
}
