
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Project project = Project.builder()
 *             .version(0.3)
 *             .key("{key}")
 *             .name("{name}")
 *             .plusCountries(countriesBuilder -> countriesBuilder)
 *             .plusCurrencies(currenciesBuilder -> currenciesBuilder)
 *             .plusLanguages(languagesBuilder -> languagesBuilder)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .messages(messagesBuilder -> messagesBuilder)
 *             .carts(cartsBuilder -> cartsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectBuilder implements Builder<Project> {

    private Long version;

    private String key;

    private String name;

    private java.util.List<String> countries;

    private java.util.List<String> currencies;

    private java.util.List<String> languages;

    private java.time.ZonedDateTime createdAt;

    @Nullable
    private String trialUntil;

    private com.commercetools.api.models.message.MessagesConfiguration messages;

    private com.commercetools.api.models.project.CartsConfiguration carts;

    @Nullable
    private com.commercetools.api.models.project.ShoppingListsConfiguration shoppingLists;

    @Nullable
    private com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType;

    @Nullable
    private com.commercetools.api.models.project.ExternalOAuth externalOAuth;

    @Nullable
    private com.commercetools.api.models.project.SearchIndexingConfiguration searchIndexing;

    @Nullable
    private com.commercetools.api.models.project.BusinessUnitConfiguration businessUnits;

    /**
     *  <p>Current version of the Project.</p>
     * @param version
     * @return Builder
     */

    public ProjectBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Project.</p>
     * @param key
     * @return Builder
     */

    public ProjectBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the Project.</p>
     * @param name
     * @return Builder
     */

    public ProjectBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Country code of the geographic location.</p>
     * @param countries
     * @return Builder
     */

    public ProjectBuilder countries(final String... countries) {
        this.countries = new ArrayList<>(Arrays.asList(countries));
        return this;
    }

    /**
     *  <p>Country code of the geographic location.</p>
     * @param countries
     * @return Builder
     */

    public ProjectBuilder countries(final java.util.List<String> countries) {
        this.countries = countries;
        return this;
    }

    /**
     *  <p>Country code of the geographic location.</p>
     * @param countries
     * @return Builder
     */

    public ProjectBuilder plusCountries(final String... countries) {
        if (this.countries == null) {
            this.countries = new ArrayList<>();
        }
        this.countries.addAll(Arrays.asList(countries));
        return this;
    }

    /**
     *  <p>Currency code of the country. A Project must have at least one currency.</p>
     * @param currencies
     * @return Builder
     */

    public ProjectBuilder currencies(final String... currencies) {
        this.currencies = new ArrayList<>(Arrays.asList(currencies));
        return this;
    }

    /**
     *  <p>Currency code of the country. A Project must have at least one currency.</p>
     * @param currencies
     * @return Builder
     */

    public ProjectBuilder currencies(final java.util.List<String> currencies) {
        this.currencies = currencies;
        return this;
    }

    /**
     *  <p>Currency code of the country. A Project must have at least one currency.</p>
     * @param currencies
     * @return Builder
     */

    public ProjectBuilder plusCurrencies(final String... currencies) {
        if (this.currencies == null) {
            this.currencies = new ArrayList<>();
        }
        this.currencies.addAll(Arrays.asList(currencies));
        return this;
    }

    /**
     *  <p>Language of the country. A Project must have at least one language.</p>
     * @param languages
     * @return Builder
     */

    public ProjectBuilder languages(final String... languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
        return this;
    }

    /**
     *  <p>Language of the country. A Project must have at least one language.</p>
     * @param languages
     * @return Builder
     */

    public ProjectBuilder languages(final java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }

    /**
     *  <p>Language of the country. A Project must have at least one language.</p>
     * @param languages
     * @return Builder
     */

    public ProjectBuilder plusLanguages(final String... languages) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.addAll(Arrays.asList(languages));
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Project was initially created.</p>
     * @param createdAt
     * @return Builder
     */

    public ProjectBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date in YYYY-MM format specifying when the trial period for the Project ends. Only present on Projects in trial period.</p>
     * @param trialUntil
     * @return Builder
     */

    public ProjectBuilder trialUntil(@Nullable final String trialUntil) {
        this.trialUntil = trialUntil;
        return this;
    }

    /**
     *  <p>Holds the configuration for the Messages Query feature.</p>
     * @return Builder
     */

    public ProjectBuilder messages(
            Function<com.commercetools.api.models.message.MessagesConfigurationBuilder, com.commercetools.api.models.message.MessagesConfigurationBuilder> builder) {
        this.messages = builder.apply(com.commercetools.api.models.message.MessagesConfigurationBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Holds the configuration for the Messages Query feature.</p>
     * @param messages
     * @return Builder
     */

    public ProjectBuilder messages(final com.commercetools.api.models.message.MessagesConfiguration messages) {
        this.messages = messages;
        return this;
    }

    /**
     *  <p>Holds the configuration for the Carts feature.</p>
     * @return Builder
     */

    public ProjectBuilder carts(
            Function<com.commercetools.api.models.project.CartsConfigurationBuilder, com.commercetools.api.models.project.CartsConfigurationBuilder> builder) {
        this.carts = builder.apply(com.commercetools.api.models.project.CartsConfigurationBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Holds the configuration for the Carts feature.</p>
     * @param carts
     * @return Builder
     */

    public ProjectBuilder carts(final com.commercetools.api.models.project.CartsConfiguration carts) {
        this.carts = carts;
        return this;
    }

    /**
     *  <p>Holds the configuration for the Shopping Lists feature. This field may not be present on Projects created before January 2020.</p>
     * @return Builder
     */

    public ProjectBuilder shoppingLists(
            Function<com.commercetools.api.models.project.ShoppingListsConfigurationBuilder, com.commercetools.api.models.project.ShoppingListsConfigurationBuilder> builder) {
        this.shoppingLists = builder.apply(com.commercetools.api.models.project.ShoppingListsConfigurationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Holds the configuration for the Shopping Lists feature. This field may not be present on Projects created before January 2020.</p>
     * @param shoppingLists
     * @return Builder
     */

    public ProjectBuilder shoppingLists(
            @Nullable final com.commercetools.api.models.project.ShoppingListsConfiguration shoppingLists) {
        this.shoppingLists = shoppingLists;
        return this;
    }

    /**
     *  <p>Holds the configuration for the tiered shipping rates feature.</p>
     * @param shippingRateInputType
     * @return Builder
     */

    public ProjectBuilder shippingRateInputType(
            @Nullable final com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType) {
        this.shippingRateInputType = shippingRateInputType;
        return this;
    }

    /**
     *  <p>Holds the configuration for the tiered shipping rates feature.</p>
     * @return Builder
     */

    public ProjectBuilder shippingRateInputType(
            Function<com.commercetools.api.models.project.ShippingRateInputTypeBuilder, Builder<? extends com.commercetools.api.models.project.ShippingRateInputType>> builder) {
        this.shippingRateInputType = builder
                .apply(com.commercetools.api.models.project.ShippingRateInputTypeBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Represents a RFC 7662 compliant OAuth 2.0 Token Introspection endpoint.</p>
     * @return Builder
     */

    public ProjectBuilder externalOAuth(
            Function<com.commercetools.api.models.project.ExternalOAuthBuilder, com.commercetools.api.models.project.ExternalOAuthBuilder> builder) {
        this.externalOAuth = builder.apply(com.commercetools.api.models.project.ExternalOAuthBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Represents a RFC 7662 compliant OAuth 2.0 Token Introspection endpoint.</p>
     * @param externalOAuth
     * @return Builder
     */

    public ProjectBuilder externalOAuth(
            @Nullable final com.commercetools.api.models.project.ExternalOAuth externalOAuth) {
        this.externalOAuth = externalOAuth;
        return this;
    }

    /**
     *  <p>Controls indexing of resources to be provided on high performance read-only search endpoints.</p>
     * @return Builder
     */

    public ProjectBuilder searchIndexing(
            Function<com.commercetools.api.models.project.SearchIndexingConfigurationBuilder, com.commercetools.api.models.project.SearchIndexingConfigurationBuilder> builder) {
        this.searchIndexing = builder
                .apply(com.commercetools.api.models.project.SearchIndexingConfigurationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Controls indexing of resources to be provided on high performance read-only search endpoints.</p>
     * @param searchIndexing
     * @return Builder
     */

    public ProjectBuilder searchIndexing(
            @Nullable final com.commercetools.api.models.project.SearchIndexingConfiguration searchIndexing) {
        this.searchIndexing = searchIndexing;
        return this;
    }

    /**
     *  <p>Holds configuration specific to Business Units.</p>
     * @return Builder
     */

    public ProjectBuilder businessUnits(
            Function<com.commercetools.api.models.project.BusinessUnitConfigurationBuilder, com.commercetools.api.models.project.BusinessUnitConfigurationBuilder> builder) {
        this.businessUnits = builder.apply(com.commercetools.api.models.project.BusinessUnitConfigurationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Holds configuration specific to Business Units.</p>
     * @param businessUnits
     * @return Builder
     */

    public ProjectBuilder businessUnits(
            @Nullable final com.commercetools.api.models.project.BusinessUnitConfiguration businessUnits) {
        this.businessUnits = businessUnits;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public java.util.List<String> getCountries() {
        return this.countries;
    }

    public java.util.List<String> getCurrencies() {
        return this.currencies;
    }

    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public String getTrialUntil() {
        return this.trialUntil;
    }

    public com.commercetools.api.models.message.MessagesConfiguration getMessages() {
        return this.messages;
    }

    public com.commercetools.api.models.project.CartsConfiguration getCarts() {
        return this.carts;
    }

    @Nullable
    public com.commercetools.api.models.project.ShoppingListsConfiguration getShoppingLists() {
        return this.shoppingLists;
    }

    @Nullable
    public com.commercetools.api.models.project.ShippingRateInputType getShippingRateInputType() {
        return this.shippingRateInputType;
    }

    @Nullable
    public com.commercetools.api.models.project.ExternalOAuth getExternalOAuth() {
        return this.externalOAuth;
    }

    @Nullable
    public com.commercetools.api.models.project.SearchIndexingConfiguration getSearchIndexing() {
        return this.searchIndexing;
    }

    @Nullable
    public com.commercetools.api.models.project.BusinessUnitConfiguration getBusinessUnits() {
        return this.businessUnits;
    }

    public Project build() {
        Objects.requireNonNull(version, Project.class + ": version is missing");
        Objects.requireNonNull(key, Project.class + ": key is missing");
        Objects.requireNonNull(name, Project.class + ": name is missing");
        Objects.requireNonNull(countries, Project.class + ": countries is missing");
        Objects.requireNonNull(currencies, Project.class + ": currencies is missing");
        Objects.requireNonNull(languages, Project.class + ": languages is missing");
        Objects.requireNonNull(createdAt, Project.class + ": createdAt is missing");
        Objects.requireNonNull(messages, Project.class + ": messages is missing");
        Objects.requireNonNull(carts, Project.class + ": carts is missing");
        return new ProjectImpl(version, key, name, countries, currencies, languages, createdAt, trialUntil, messages,
            carts, shoppingLists, shippingRateInputType, externalOAuth, searchIndexing, businessUnits);
    }

    /**
     * builds Project without checking for non null required values
     */
    public Project buildUnchecked() {
        return new ProjectImpl(version, key, name, countries, currencies, languages, createdAt, trialUntil, messages,
            carts, shoppingLists, shippingRateInputType, externalOAuth, searchIndexing, businessUnits);
    }

    public static ProjectBuilder of() {
        return new ProjectBuilder();
    }

    public static ProjectBuilder of(final Project template) {
        ProjectBuilder builder = new ProjectBuilder();
        builder.version = template.getVersion();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.countries = template.getCountries();
        builder.currencies = template.getCurrencies();
        builder.languages = template.getLanguages();
        builder.createdAt = template.getCreatedAt();
        builder.trialUntil = template.getTrialUntil();
        builder.messages = template.getMessages();
        builder.carts = template.getCarts();
        builder.shoppingLists = template.getShoppingLists();
        builder.shippingRateInputType = template.getShippingRateInputType();
        builder.externalOAuth = template.getExternalOAuth();
        builder.searchIndexing = template.getSearchIndexing();
        builder.businessUnits = template.getBusinessUnits();
        return builder;
    }

}
