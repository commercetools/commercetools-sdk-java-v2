
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
 *  <p>A failed response can return a DuplicatePriceScope, DuplicateVariantValues, DuplicateAttributeValue, or DuplicateAttributeValues error.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.Product>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .products()
 *            .withKey("{key}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductsKeyByKeyPostString extends
        StringBodyApiMethod<ByProjectKeyProductsKeyByKeyPostString, com.commercetools.api.models.product.Product>
        implements com.commercetools.api.client.PriceselectingTrait<ByProjectKeyProductsKeyByKeyPostString>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyProductsKeyByKeyPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductsKeyByKeyPostString>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductsKeyByKeyPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductsKeyByKeyPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.product.Product> resultType() {
        return new TypeReference<com.commercetools.api.models.product.Product>() {
        };
    }

    private String projectKey;
    private String key;

    private String productUpdate;

    public ByProjectKeyProductsKeyByKeyPostString(final ApiHttpClient apiHttpClient, String projectKey, String key,
            String productUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.productUpdate = productUpdate;
    }

    public ByProjectKeyProductsKeyByKeyPostString(ByProjectKeyProductsKeyByKeyPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.productUpdate = t.productUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/products/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            productUpdate.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product.Product> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.product.Product.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.Product>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.product.Product.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getKey() {
        return this.key;
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

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set priceCurrency with the specified value
     * @param <TValue> value type
     * @param priceCurrency value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString withPriceCurrency(final TValue priceCurrency) {
        return copy().withQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * add additional priceCurrency query parameter
     * @param <TValue> value type
     * @param priceCurrency value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString addPriceCurrency(final TValue priceCurrency) {
        return copy().addQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * set priceCurrency with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString withPriceCurrency(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCurrency", supplier.get());
    }

    /**
     * add additional priceCurrency query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString addPriceCurrency(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCurrency", supplier.get());
    }

    /**
     * set priceCurrency with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString withPriceCurrency(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCurrency query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString addPriceCurrency(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * set priceCurrency with the specified values
     * @param <TValue> value type
     * @param priceCurrency values to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString withPriceCurrency(final Collection<TValue> priceCurrency) {
        return copy().withoutQueryParam("priceCurrency")
                .addQueryParams(priceCurrency.stream()
                        .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCurrency query parameters
     * @param <TValue> value type
     * @param priceCurrency values to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString addPriceCurrency(final Collection<TValue> priceCurrency) {
        return copy().addQueryParams(priceCurrency.stream()
                .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCountry with the specified value
     * @param <TValue> value type
     * @param priceCountry value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString withPriceCountry(final TValue priceCountry) {
        return copy().withQueryParam("priceCountry", priceCountry);
    }

    /**
     * add additional priceCountry query parameter
     * @param <TValue> value type
     * @param priceCountry value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString addPriceCountry(final TValue priceCountry) {
        return copy().addQueryParam("priceCountry", priceCountry);
    }

    /**
     * set priceCountry with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString withPriceCountry(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCountry", supplier.get());
    }

    /**
     * add additional priceCountry query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString addPriceCountry(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCountry", supplier.get());
    }

    /**
     * set priceCountry with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString withPriceCountry(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCountry query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString addPriceCountry(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * set priceCountry with the specified values
     * @param <TValue> value type
     * @param priceCountry values to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString withPriceCountry(final Collection<TValue> priceCountry) {
        return copy().withoutQueryParam("priceCountry")
                .addQueryParams(priceCountry.stream()
                        .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCountry query parameters
     * @param <TValue> value type
     * @param priceCountry values to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString addPriceCountry(final Collection<TValue> priceCountry) {
        return copy().addQueryParams(priceCountry.stream()
                .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param <TValue> value type
     * @param priceCustomerGroup value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString withPriceCustomerGroup(final TValue priceCustomerGroup) {
        return copy().withQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param <TValue> value type
     * @param priceCustomerGroup value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString addPriceCustomerGroup(final TValue priceCustomerGroup) {
        return copy().addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString withPriceCustomerGroup(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCustomerGroup", supplier.get());
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString addPriceCustomerGroup(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCustomerGroup", supplier.get());
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString withPriceCustomerGroup(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString addPriceCustomerGroup(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * set priceCustomerGroup with the specified values
     * @param <TValue> value type
     * @param priceCustomerGroup values to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString withPriceCustomerGroup(
            final Collection<TValue> priceCustomerGroup) {
        return copy().withoutQueryParam("priceCustomerGroup")
                .addQueryParams(priceCustomerGroup.stream()
                        .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCustomerGroup query parameters
     * @param <TValue> value type
     * @param priceCustomerGroup values to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString addPriceCustomerGroup(
            final Collection<TValue> priceCustomerGroup) {
        return copy().addQueryParams(priceCustomerGroup.stream()
                .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCustomerGroupAssignments with the specified value
     * @param <TValue> value type
     * @param priceCustomerGroupAssignments value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString withPriceCustomerGroupAssignments(
            final TValue priceCustomerGroupAssignments) {
        return copy().withQueryParam("priceCustomerGroupAssignments", priceCustomerGroupAssignments);
    }

    /**
     * add additional priceCustomerGroupAssignments query parameter
     * @param <TValue> value type
     * @param priceCustomerGroupAssignments value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString addPriceCustomerGroupAssignments(
            final TValue priceCustomerGroupAssignments) {
        return copy().addQueryParam("priceCustomerGroupAssignments", priceCustomerGroupAssignments);
    }

    /**
     * set priceCustomerGroupAssignments with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString withPriceCustomerGroupAssignments(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCustomerGroupAssignments", supplier.get());
    }

    /**
     * add additional priceCustomerGroupAssignments query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString addPriceCustomerGroupAssignments(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCustomerGroupAssignments", supplier.get());
    }

    /**
     * set priceCustomerGroupAssignments with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString withPriceCustomerGroupAssignments(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCustomerGroupAssignments", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCustomerGroupAssignments query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString addPriceCustomerGroupAssignments(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCustomerGroupAssignments", op.apply(new StringBuilder()));
    }

    /**
     * set priceCustomerGroupAssignments with the specified values
     * @param <TValue> value type
     * @param priceCustomerGroupAssignments values to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString withPriceCustomerGroupAssignments(
            final Collection<TValue> priceCustomerGroupAssignments) {
        return copy().withoutQueryParam("priceCustomerGroupAssignments")
                .addQueryParams(priceCustomerGroupAssignments.stream()
                        .map(s -> new ParamEntry<>("priceCustomerGroupAssignments", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCustomerGroupAssignments query parameters
     * @param <TValue> value type
     * @param priceCustomerGroupAssignments values to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString addPriceCustomerGroupAssignments(
            final Collection<TValue> priceCustomerGroupAssignments) {
        return copy().addQueryParams(priceCustomerGroupAssignments.stream()
                .map(s -> new ParamEntry<>("priceCustomerGroupAssignments", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceChannel with the specified value
     * @param <TValue> value type
     * @param priceChannel value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString withPriceChannel(final TValue priceChannel) {
        return copy().withQueryParam("priceChannel", priceChannel);
    }

    /**
     * add additional priceChannel query parameter
     * @param <TValue> value type
     * @param priceChannel value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString addPriceChannel(final TValue priceChannel) {
        return copy().addQueryParam("priceChannel", priceChannel);
    }

    /**
     * set priceChannel with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString withPriceChannel(final Supplier<String> supplier) {
        return copy().withQueryParam("priceChannel", supplier.get());
    }

    /**
     * add additional priceChannel query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString addPriceChannel(final Supplier<String> supplier) {
        return copy().addQueryParam("priceChannel", supplier.get());
    }

    /**
     * set priceChannel with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString withPriceChannel(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceChannel query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString addPriceChannel(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * set priceChannel with the specified values
     * @param <TValue> value type
     * @param priceChannel values to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString withPriceChannel(final Collection<TValue> priceChannel) {
        return copy().withoutQueryParam("priceChannel")
                .addQueryParams(priceChannel.stream()
                        .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceChannel query parameters
     * @param <TValue> value type
     * @param priceChannel values to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString addPriceChannel(final Collection<TValue> priceChannel) {
        return copy().addQueryParams(priceChannel.stream()
                .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceRecurrencePolicy with the specified value
     * @param <TValue> value type
     * @param priceRecurrencePolicy value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString withPriceRecurrencePolicy(
            final TValue priceRecurrencePolicy) {
        return copy().withQueryParam("priceRecurrencePolicy", priceRecurrencePolicy);
    }

    /**
     * add additional priceRecurrencePolicy query parameter
     * @param <TValue> value type
     * @param priceRecurrencePolicy value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString addPriceRecurrencePolicy(
            final TValue priceRecurrencePolicy) {
        return copy().addQueryParam("priceRecurrencePolicy", priceRecurrencePolicy);
    }

    /**
     * set priceRecurrencePolicy with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString withPriceRecurrencePolicy(final Supplier<String> supplier) {
        return copy().withQueryParam("priceRecurrencePolicy", supplier.get());
    }

    /**
     * add additional priceRecurrencePolicy query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString addPriceRecurrencePolicy(final Supplier<String> supplier) {
        return copy().addQueryParam("priceRecurrencePolicy", supplier.get());
    }

    /**
     * set priceRecurrencePolicy with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString withPriceRecurrencePolicy(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceRecurrencePolicy", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceRecurrencePolicy query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString addPriceRecurrencePolicy(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceRecurrencePolicy", op.apply(new StringBuilder()));
    }

    /**
     * set priceRecurrencePolicy with the specified values
     * @param <TValue> value type
     * @param priceRecurrencePolicy values to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString withPriceRecurrencePolicy(
            final Collection<TValue> priceRecurrencePolicy) {
        return copy().withoutQueryParam("priceRecurrencePolicy")
                .addQueryParams(priceRecurrencePolicy.stream()
                        .map(s -> new ParamEntry<>("priceRecurrencePolicy", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceRecurrencePolicy query parameters
     * @param <TValue> value type
     * @param priceRecurrencePolicy values to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString addPriceRecurrencePolicy(
            final Collection<TValue> priceRecurrencePolicy) {
        return copy().addQueryParams(priceRecurrencePolicy.stream()
                .map(s -> new ParamEntry<>("priceRecurrencePolicy", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public ByProjectKeyProductsKeyByKeyPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyProductsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyProductsKeyByKeyPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return productUpdate;
    }

    public ByProjectKeyProductsKeyByKeyPostString withBody(String productUpdate) {
        ByProjectKeyProductsKeyByKeyPostString t = copy();
        t.productUpdate = productUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductsKeyByKeyPostString that = (ByProjectKeyProductsKeyByKeyPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(productUpdate, that.productUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(productUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyProductsKeyByKeyPostString copy() {
        return new ByProjectKeyProductsKeyByKeyPostString(this);
    }
}
