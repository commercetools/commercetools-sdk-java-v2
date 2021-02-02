
package com.commercetools.api.models.project;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectBuilder {

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
            @Nullable final com.commercetools.api.models.project.ExternalOAuth externalOAuth) {
        this.externalOAuth = externalOAuth;
        return this;
    }

    public ProjectBuilder carts(final com.commercetools.api.models.project.CartsConfiguration carts) {
        this.carts = carts;
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

    public Project build() {
        return new ProjectImpl(version, key, name, countries, currencies, languages, createdAt, trialUntil, messages,
            shippingRateInputType, externalOAuth, carts);
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
        return builder;
    }

}
