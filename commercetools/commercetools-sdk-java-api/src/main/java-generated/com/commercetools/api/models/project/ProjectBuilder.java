
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectBuilder implements Builder<Project> {

    private Long version;

    private String key;

    private String name;

    private java.util.List<String> countries;

    private java.util.List<String> currencies;

    private java.util.List<String> languages;

    private java.time.ZonedDateTime createdAt;

    @Nullable
    private String trialUntil;

    private com.commercetools.api.models.message.MessageConfiguration messages;

    @Nullable
    private com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType;

    @Nullable
    private com.commercetools.api.models.project.ExternalOAuth externalOAuth;

    private com.commercetools.api.models.project.CartsConfiguration carts;

    @Nullable
    private com.commercetools.api.models.project.SearchIndexingConfiguration searchIndexing;

    @Nullable
    private com.commercetools.api.models.project.ShoppingListsConfiguration shoppingLists;

    public ProjectBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ProjectBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public ProjectBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ProjectBuilder countries(final String... countries) {
        this.countries = new ArrayList<>(Arrays.asList(countries));
        return this;
    }

    public ProjectBuilder countries(final java.util.List<String> countries) {
        this.countries = countries;
        return this;
    }

    public ProjectBuilder currencies(final String... currencies) {
        this.currencies = new ArrayList<>(Arrays.asList(currencies));
        return this;
    }

    public ProjectBuilder currencies(final java.util.List<String> currencies) {
        this.currencies = currencies;
        return this;
    }

    public ProjectBuilder languages(final String... languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
        return this;
    }

    public ProjectBuilder languages(final java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }

    public ProjectBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ProjectBuilder trialUntil(@Nullable final String trialUntil) {
        this.trialUntil = trialUntil;
        return this;
    }

    public ProjectBuilder messages(
            Function<com.commercetools.api.models.message.MessageConfigurationBuilder, com.commercetools.api.models.message.MessageConfigurationBuilder> builder) {
        this.messages = builder.apply(com.commercetools.api.models.message.MessageConfigurationBuilder.of()).build();
        return this;
    }

    public ProjectBuilder messages(final com.commercetools.api.models.message.MessageConfiguration messages) {
        this.messages = messages;
        return this;
    }

    public ProjectBuilder shippingRateInputType(
            @Nullable final com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType) {
        this.shippingRateInputType = shippingRateInputType;
        return this;
    }

    public ProjectBuilder externalOAuth(
            Function<com.commercetools.api.models.project.ExternalOAuthBuilder, com.commercetools.api.models.project.ExternalOAuthBuilder> builder) {
        this.externalOAuth = builder.apply(com.commercetools.api.models.project.ExternalOAuthBuilder.of()).build();
        return this;
    }

    public ProjectBuilder externalOAuth(
            @Nullable final com.commercetools.api.models.project.ExternalOAuth externalOAuth) {
        this.externalOAuth = externalOAuth;
        return this;
    }

    public ProjectBuilder carts(
            Function<com.commercetools.api.models.project.CartsConfigurationBuilder, com.commercetools.api.models.project.CartsConfigurationBuilder> builder) {
        this.carts = builder.apply(com.commercetools.api.models.project.CartsConfigurationBuilder.of()).build();
        return this;
    }

    public ProjectBuilder carts(final com.commercetools.api.models.project.CartsConfiguration carts) {
        this.carts = carts;
        return this;
    }

    public ProjectBuilder searchIndexing(
            Function<com.commercetools.api.models.project.SearchIndexingConfigurationBuilder, com.commercetools.api.models.project.SearchIndexingConfigurationBuilder> builder) {
        this.searchIndexing = builder
                .apply(com.commercetools.api.models.project.SearchIndexingConfigurationBuilder.of())
                .build();
        return this;
    }

    public ProjectBuilder searchIndexing(
            @Nullable final com.commercetools.api.models.project.SearchIndexingConfiguration searchIndexing) {
        this.searchIndexing = searchIndexing;
        return this;
    }

    public ProjectBuilder shoppingLists(
            Function<com.commercetools.api.models.project.ShoppingListsConfigurationBuilder, com.commercetools.api.models.project.ShoppingListsConfigurationBuilder> builder) {
        this.shoppingLists = builder.apply(com.commercetools.api.models.project.ShoppingListsConfigurationBuilder.of())
                .build();
        return this;
    }

    public ProjectBuilder shoppingLists(
            @Nullable final com.commercetools.api.models.project.ShoppingListsConfiguration shoppingLists) {
        this.shoppingLists = shoppingLists;
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

    public com.commercetools.api.models.message.MessageConfiguration getMessages() {
        return this.messages;
    }

    @Nullable
    public com.commercetools.api.models.project.ShippingRateInputType getShippingRateInputType() {
        return this.shippingRateInputType;
    }

    @Nullable
    public com.commercetools.api.models.project.ExternalOAuth getExternalOAuth() {
        return this.externalOAuth;
    }

    public com.commercetools.api.models.project.CartsConfiguration getCarts() {
        return this.carts;
    }

    @Nullable
    public com.commercetools.api.models.project.SearchIndexingConfiguration getSearchIndexing() {
        return this.searchIndexing;
    }

    @Nullable
    public com.commercetools.api.models.project.ShoppingListsConfiguration getShoppingLists() {
        return this.shoppingLists;
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
            shippingRateInputType, externalOAuth, carts, searchIndexing, shoppingLists);
    }

    /**
     * builds Project without checking for non null required values
     */
    public Project buildUnchecked() {
        return new ProjectImpl(version, key, name, countries, currencies, languages, createdAt, trialUntil, messages,
            shippingRateInputType, externalOAuth, carts, searchIndexing, shoppingLists);
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
        builder.shippingRateInputType = template.getShippingRateInputType();
        builder.externalOAuth = template.getExternalOAuth();
        builder.carts = template.getCarts();
        builder.searchIndexing = template.getSearchIndexing();
        builder.shoppingLists = template.getShoppingLists();
        return builder;
    }

}
