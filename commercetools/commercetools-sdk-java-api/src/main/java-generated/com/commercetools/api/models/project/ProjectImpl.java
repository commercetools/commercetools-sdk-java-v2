
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProjectImpl implements Project, ModelBase {

    private Long version;

    private String key;

    private String name;

    private java.util.List<String> countries;

    private java.util.List<String> currencies;

    private java.util.List<String> languages;

    private java.time.ZonedDateTime createdAt;

    private String trialUntil;

    private com.commercetools.api.models.message.MessagesConfiguration messages;

    private com.commercetools.api.models.project.CartsConfiguration carts;

    private com.commercetools.api.models.project.ShoppingListsConfiguration shoppingLists;

    private com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType;

    private com.commercetools.api.models.project.ExternalOAuth externalOAuth;

    private com.commercetools.api.models.project.SearchIndexingConfiguration searchIndexing;

    @JsonCreator
    ProjectImpl(@JsonProperty("version") final Long version, @JsonProperty("key") final String key,
            @JsonProperty("name") final String name, @JsonProperty("countries") final java.util.List<String> countries,
            @JsonProperty("currencies") final java.util.List<String> currencies,
            @JsonProperty("languages") final java.util.List<String> languages,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("trialUntil") final String trialUntil,
            @JsonProperty("messages") final com.commercetools.api.models.message.MessagesConfiguration messages,
            @JsonProperty("carts") final com.commercetools.api.models.project.CartsConfiguration carts,
            @JsonProperty("shoppingLists") final com.commercetools.api.models.project.ShoppingListsConfiguration shoppingLists,
            @JsonProperty("shippingRateInputType") final com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType,
            @JsonProperty("externalOAuth") final com.commercetools.api.models.project.ExternalOAuth externalOAuth,
            @JsonProperty("searchIndexing") final com.commercetools.api.models.project.SearchIndexingConfiguration searchIndexing) {
        this.version = version;
        this.key = key;
        this.name = name;
        this.countries = countries;
        this.currencies = currencies;
        this.languages = languages;
        this.createdAt = createdAt;
        this.trialUntil = trialUntil;
        this.messages = messages;
        this.carts = carts;
        this.shoppingLists = shoppingLists;
        this.shippingRateInputType = shippingRateInputType;
        this.externalOAuth = externalOAuth;
        this.searchIndexing = searchIndexing;
    }

    public ProjectImpl() {
    }

    /**
    *  <p>Current version of the Project.</p>
    */
    public Long getVersion() {
        return this.version;
    }

    /**
    *  <p>User-defined unique identifier of the Project.</p>
    */
    public String getKey() {
        return this.key;
    }

    /**
    *  <p>Name of the Project.</p>
    */
    public String getName() {
        return this.name;
    }

    /**
    *  <p>Country code of the geographic location.</p>
    */
    public java.util.List<String> getCountries() {
        return this.countries;
    }

    /**
    *  <p>Currency code of the country. A Project must have at least one currency.</p>
    */
    public java.util.List<String> getCurrencies() {
        return this.currencies;
    }

    /**
    *  <p>Language of the country. A Project must have at least one language.</p>
    */
    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    /**
    *  <p>Date and time (UTC) the Project was initially created.</p>
    */
    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
    *  <p>Date in YYYY-MM format specifying when the trial period for the Project ends. Only present on Projects in trial period.</p>
    */
    public String getTrialUntil() {
        return this.trialUntil;
    }

    /**
    *  <p>Holds the configuration for the <a href="/../api/projects/messages">Messages Query</a> feature.</p>
    */
    public com.commercetools.api.models.message.MessagesConfiguration getMessages() {
        return this.messages;
    }

    /**
    *  <p>Holds the configuration for the <a href="/../api/projects/carts">Carts</a> feature.</p>
    */
    public com.commercetools.api.models.project.CartsConfiguration getCarts() {
        return this.carts;
    }

    /**
    *  <p>Holds the configuration for the <a href="/../api/projects/shoppingLists">Shopping Lists</a> feature. This field may not be present on Projects created before January 2020.</p>
    */
    public com.commercetools.api.models.project.ShoppingListsConfiguration getShoppingLists() {
        return this.shoppingLists;
    }

    /**
    *  <p>Holds the configuration for the <a href="ctp:api:type:ShippingRatePriceTier">tiered shipping rates</a> feature.</p>
    */
    public com.commercetools.api.models.project.ShippingRateInputType getShippingRateInputType() {
        return this.shippingRateInputType;
    }

    /**
    *  <p>Represents a RFC 7662 compliant <a href="https://datatracker.ietf.org/doc/html/rfc7662">OAuth 2.0 Token Introspection</a> endpoint.</p>
    */
    public com.commercetools.api.models.project.ExternalOAuth getExternalOAuth() {
        return this.externalOAuth;
    }

    /**
    *  <p>Controls indexing of resources to be provided on high performance read-only search endpoints.</p>
    */
    public com.commercetools.api.models.project.SearchIndexingConfiguration getSearchIndexing() {
        return this.searchIndexing;
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

    public void setMessages(final com.commercetools.api.models.message.MessagesConfiguration messages) {
        this.messages = messages;
    }

    public void setCarts(final com.commercetools.api.models.project.CartsConfiguration carts) {
        this.carts = carts;
    }

    public void setShoppingLists(final com.commercetools.api.models.project.ShoppingListsConfiguration shoppingLists) {
        this.shoppingLists = shoppingLists;
    }

    public void setShippingRateInputType(
            final com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType) {
        this.shippingRateInputType = shippingRateInputType;
    }

    public void setExternalOAuth(final com.commercetools.api.models.project.ExternalOAuth externalOAuth) {
        this.externalOAuth = externalOAuth;
    }

    public void setSearchIndexing(
            final com.commercetools.api.models.project.SearchIndexingConfiguration searchIndexing) {
        this.searchIndexing = searchIndexing;
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
                .append(carts, that.carts)
                .append(shoppingLists, that.shoppingLists)
                .append(shippingRateInputType, that.shippingRateInputType)
                .append(externalOAuth, that.externalOAuth)
                .append(searchIndexing, that.searchIndexing)
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
                .append(carts)
                .append(shoppingLists)
                .append(shippingRateInputType)
                .append(externalOAuth)
                .append(searchIndexing)
                .toHashCode();
    }

}
