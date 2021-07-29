
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectImpl implements Project {

    private Long version;

    private String key;

    private String name;

    private java.util.List<String> countries;

    private java.util.List<String> currencies;

    private java.util.List<String> languages;

    private java.time.ZonedDateTime createdAt;

    private String trialUntil;

    private com.commercetools.api.models.message.MessageConfiguration messages;

    private com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType;

    private com.commercetools.api.models.project.ExternalOAuth externalOAuth;

    private com.commercetools.api.models.project.CartsConfiguration carts;

    private com.commercetools.api.models.project.SearchIndexingConfiguration searchIndexing;

    private com.commercetools.api.models.project.ShoppingListsConfiguration shoppingLists;

    @JsonCreator
    ProjectImpl(@JsonProperty("version") final Long version, @JsonProperty("key") final String key,
            @JsonProperty("name") final String name, @JsonProperty("countries") final java.util.List<String> countries,
            @JsonProperty("currencies") final java.util.List<String> currencies,
            @JsonProperty("languages") final java.util.List<String> languages,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("trialUntil") final String trialUntil,
            @JsonProperty("messages") final com.commercetools.api.models.message.MessageConfiguration messages,
            @JsonProperty("shippingRateInputType") final com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType,
            @JsonProperty("externalOAuth") final com.commercetools.api.models.project.ExternalOAuth externalOAuth,
            @JsonProperty("carts") final com.commercetools.api.models.project.CartsConfiguration carts,
            @JsonProperty("searchIndexing") final com.commercetools.api.models.project.SearchIndexingConfiguration searchIndexing,
            @JsonProperty("shoppingLists") final com.commercetools.api.models.project.ShoppingListsConfiguration shoppingLists) {
        this.version = version;
        this.key = key;
        this.name = name;
        this.countries = countries;
        this.currencies = currencies;
        this.languages = languages;
        this.createdAt = createdAt;
        this.trialUntil = trialUntil;
        this.messages = messages;
        this.shippingRateInputType = shippingRateInputType;
        this.externalOAuth = externalOAuth;
        this.carts = carts;
        this.searchIndexing = searchIndexing;
        this.shoppingLists = shoppingLists;
    }

    public ProjectImpl() {
    }

    /**
    *  <p>The current version of the project.</p>
    */
    public Long getVersion() {
        return this.version;
    }

    /**
    *  <p>The unique key of the project.</p>
    */
    public String getKey() {
        return this.key;
    }

    /**
    *  <p>The name of the project.</p>
    */
    public String getName() {
        return this.name;
    }

    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    public java.util.List<String> getCountries() {
        return this.countries;
    }

    /**
    *  <p>A three-digit currency code as per <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
    */
    public java.util.List<String> getCurrencies() {
        return this.currencies;
    }

    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
    *  <p>The time is in the format Year-Month <code>YYYY-MM</code>.</p>
    */
    public String getTrialUntil() {
        return this.trialUntil;
    }

    public com.commercetools.api.models.message.MessageConfiguration getMessages() {
        return this.messages;
    }

    public com.commercetools.api.models.project.ShippingRateInputType getShippingRateInputType() {
        return this.shippingRateInputType;
    }

    public com.commercetools.api.models.project.ExternalOAuth getExternalOAuth() {
        return this.externalOAuth;
    }

    public com.commercetools.api.models.project.CartsConfiguration getCarts() {
        return this.carts;
    }

    public com.commercetools.api.models.project.SearchIndexingConfiguration getSearchIndexing() {
        return this.searchIndexing;
    }

    public com.commercetools.api.models.project.ShoppingListsConfiguration getShoppingLists() {
        return this.shoppingLists;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setCountries(final String... countries) {
        this.countries = new ArrayList<>(Arrays.asList(countries));
    }

    public void setCountries(final java.util.List<String> countries) {
        this.countries = countries;
    }

    public void setCurrencies(final String... currencies) {
        this.currencies = new ArrayList<>(Arrays.asList(currencies));
    }

    public void setCurrencies(final java.util.List<String> currencies) {
        this.currencies = currencies;
    }

    public void setLanguages(final String... languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
    }

    public void setLanguages(final java.util.List<String> languages) {
        this.languages = languages;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setTrialUntil(final String trialUntil) {
        this.trialUntil = trialUntil;
    }

    public void setMessages(final com.commercetools.api.models.message.MessageConfiguration messages) {
        this.messages = messages;
    }

    public void setShippingRateInputType(
            final com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType) {
        this.shippingRateInputType = shippingRateInputType;
    }

    public void setExternalOAuth(final com.commercetools.api.models.project.ExternalOAuth externalOAuth) {
        this.externalOAuth = externalOAuth;
    }

    public void setCarts(final com.commercetools.api.models.project.CartsConfiguration carts) {
        this.carts = carts;
    }

    public void setSearchIndexing(
            final com.commercetools.api.models.project.SearchIndexingConfiguration searchIndexing) {
        this.searchIndexing = searchIndexing;
    }

    public void setShoppingLists(final com.commercetools.api.models.project.ShoppingListsConfiguration shoppingLists) {
        this.shoppingLists = shoppingLists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectImpl that = (ProjectImpl) o;

        return new EqualsBuilder().append(version, that.version)
                .append(key, that.key)
                .append(name, that.name)
                .append(countries, that.countries)
                .append(currencies, that.currencies)
                .append(languages, that.languages)
                .append(createdAt, that.createdAt)
                .append(trialUntil, that.trialUntil)
                .append(messages, that.messages)
                .append(shippingRateInputType, that.shippingRateInputType)
                .append(externalOAuth, that.externalOAuth)
                .append(carts, that.carts)
                .append(searchIndexing, that.searchIndexing)
                .append(shoppingLists, that.shoppingLists)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version)
                .append(key)
                .append(name)
                .append(countries)
                .append(currencies)
                .append(languages)
                .append(createdAt)
                .append(trialUntil)
                .append(messages)
                .append(shippingRateInputType)
                .append(externalOAuth)
                .append(carts)
                .append(searchIndexing)
                .append(shoppingLists)
                .toHashCode();
    }

}
