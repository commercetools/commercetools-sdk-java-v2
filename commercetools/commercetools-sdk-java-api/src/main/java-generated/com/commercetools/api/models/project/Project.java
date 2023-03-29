
package com.commercetools.api.models.project;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.message.MessagesConfiguration;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Project
 *
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
@JsonDeserialize(as = ProjectImpl.class)
public interface Project extends com.commercetools.api.models.WithKey {

    /**
     *  <p>Current version of the Project.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>User-defined unique identifier of the Project.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the Project.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Country code of the geographic location.</p>
     * @return countries
     */
    @NotNull
    @JsonProperty("countries")
    public List<String> getCountries();

    /**
     *  <p>Currency code of the country. A Project must have at least one currency.</p>
     * @return currencies
     */
    @NotNull
    @JsonProperty("currencies")
    public List<String> getCurrencies();

    /**
     *  <p>Language of the country. A Project must have at least one language.</p>
     * @return languages
     */
    @NotNull
    @JsonProperty("languages")
    public List<String> getLanguages();

    /**
     *  <p>Date and time (UTC) the Project was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date in YYYY-MM format specifying when the trial period for the Project ends. Only present on Projects in trial period.</p>
     * @return trialUntil
     */

    @JsonProperty("trialUntil")
    public String getTrialUntil();

    /**
     *  <p>Holds the configuration for the Messages Query feature.</p>
     * @return messages
     */
    @NotNull
    @Valid
    @JsonProperty("messages")
    public MessagesConfiguration getMessages();

    /**
     *  <p>Holds the configuration for the Carts feature.</p>
     * @return carts
     */
    @NotNull
    @Valid
    @JsonProperty("carts")
    public CartsConfiguration getCarts();

    /**
     *  <p>Holds the configuration for the Shopping Lists feature. This field may not be present on Projects created before January 2020.</p>
     * @return shoppingLists
     */
    @Valid
    @JsonProperty("shoppingLists")
    public ShoppingListsConfiguration getShoppingLists();

    /**
     *  <p>Holds the configuration for the tiered shipping rates feature.</p>
     * @return shippingRateInputType
     */
    @Valid
    @JsonProperty("shippingRateInputType")
    public ShippingRateInputType getShippingRateInputType();

    /**
     *  <p>Represents a RFC 7662 compliant OAuth 2.0 Token Introspection endpoint.</p>
     * @return externalOAuth
     */
    @Valid
    @JsonProperty("externalOAuth")
    public ExternalOAuth getExternalOAuth();

    /**
     *  <p>Controls indexing of resources to be provided on high performance read-only search endpoints.</p>
     * @return searchIndexing
     */
    @Valid
    @JsonProperty("searchIndexing")
    public SearchIndexingConfiguration getSearchIndexing();

    /**
     *  <p>Holds configuration specific to Business Units.</p>
     * @return businessUnits
     */
    @Valid
    @JsonProperty("businessUnits")
    public BusinessUnitConfiguration getBusinessUnits();

    /**
     *  <p>Current version of the Project.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>User-defined unique identifier of the Project.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the Project.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Country code of the geographic location.</p>
     * @param countries values to be set
     */

    @JsonIgnore
    public void setCountries(final String... countries);

    /**
     *  <p>Country code of the geographic location.</p>
     * @param countries values to be set
     */

    public void setCountries(final List<String> countries);

    /**
     *  <p>Currency code of the country. A Project must have at least one currency.</p>
     * @param currencies values to be set
     */

    @JsonIgnore
    public void setCurrencies(final String... currencies);

    /**
     *  <p>Currency code of the country. A Project must have at least one currency.</p>
     * @param currencies values to be set
     */

    public void setCurrencies(final List<String> currencies);

    /**
     *  <p>Language of the country. A Project must have at least one language.</p>
     * @param languages values to be set
     */

    @JsonIgnore
    public void setLanguages(final String... languages);

    /**
     *  <p>Language of the country. A Project must have at least one language.</p>
     * @param languages values to be set
     */

    public void setLanguages(final List<String> languages);

    /**
     *  <p>Date and time (UTC) the Project was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date in YYYY-MM format specifying when the trial period for the Project ends. Only present on Projects in trial period.</p>
     * @param trialUntil value to be set
     */

    public void setTrialUntil(final String trialUntil);

    /**
     *  <p>Holds the configuration for the Messages Query feature.</p>
     * @param messages value to be set
     */

    public void setMessages(final MessagesConfiguration messages);

    /**
     *  <p>Holds the configuration for the Carts feature.</p>
     * @param carts value to be set
     */

    public void setCarts(final CartsConfiguration carts);

    /**
     *  <p>Holds the configuration for the Shopping Lists feature. This field may not be present on Projects created before January 2020.</p>
     * @param shoppingLists value to be set
     */

    public void setShoppingLists(final ShoppingListsConfiguration shoppingLists);

    /**
     *  <p>Holds the configuration for the tiered shipping rates feature.</p>
     * @param shippingRateInputType value to be set
     */

    public void setShippingRateInputType(final ShippingRateInputType shippingRateInputType);

    /**
     *  <p>Represents a RFC 7662 compliant OAuth 2.0 Token Introspection endpoint.</p>
     * @param externalOAuth value to be set
     */

    public void setExternalOAuth(final ExternalOAuth externalOAuth);

    /**
     *  <p>Controls indexing of resources to be provided on high performance read-only search endpoints.</p>
     * @param searchIndexing value to be set
     */

    public void setSearchIndexing(final SearchIndexingConfiguration searchIndexing);

    /**
     *  <p>Holds configuration specific to Business Units.</p>
     * @param businessUnits value to be set
     */

    public void setBusinessUnits(final BusinessUnitConfiguration businessUnits);

    /**
     * factory method
     * @return instance of Project
     */
    public static Project of() {
        return new ProjectImpl();
    }

    /**
     * factory method to create a shallow copy Project
     * @param template instance to be copied
     * @return copy instance
     */
    public static Project of(final Project template) {
        ProjectImpl instance = new ProjectImpl();
        instance.setVersion(template.getVersion());
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setCountries(template.getCountries());
        instance.setCurrencies(template.getCurrencies());
        instance.setLanguages(template.getLanguages());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setTrialUntil(template.getTrialUntil());
        instance.setMessages(template.getMessages());
        instance.setCarts(template.getCarts());
        instance.setShoppingLists(template.getShoppingLists());
        instance.setShippingRateInputType(template.getShippingRateInputType());
        instance.setExternalOAuth(template.getExternalOAuth());
        instance.setSearchIndexing(template.getSearchIndexing());
        instance.setBusinessUnits(template.getBusinessUnits());
        return instance;
    }

    /**
     * factory method to create a deep copy of Project
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Project deepCopy(@Nullable final Project template) {
        if (template == null) {
            return null;
        }
        ProjectImpl instance = new ProjectImpl();
        instance.setVersion(template.getVersion());
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setCountries(Optional.ofNullable(template.getCountries()).map(ArrayList::new).orElse(null));
        instance.setCurrencies(Optional.ofNullable(template.getCurrencies()).map(ArrayList::new).orElse(null));
        instance.setLanguages(Optional.ofNullable(template.getLanguages()).map(ArrayList::new).orElse(null));
        instance.setCreatedAt(template.getCreatedAt());
        instance.setTrialUntil(template.getTrialUntil());
        instance.setMessages(
            com.commercetools.api.models.message.MessagesConfiguration.deepCopy(template.getMessages()));
        instance.setCarts(com.commercetools.api.models.project.CartsConfiguration.deepCopy(template.getCarts()));
        instance.setShoppingLists(
            com.commercetools.api.models.project.ShoppingListsConfiguration.deepCopy(template.getShoppingLists()));
        instance.setShippingRateInputType(
            com.commercetools.api.models.project.ShippingRateInputType.deepCopy(template.getShippingRateInputType()));
        instance.setExternalOAuth(
            com.commercetools.api.models.project.ExternalOAuth.deepCopy(template.getExternalOAuth()));
        instance.setSearchIndexing(
            com.commercetools.api.models.project.SearchIndexingConfiguration.deepCopy(template.getSearchIndexing()));
        instance.setBusinessUnits(
            com.commercetools.api.models.project.BusinessUnitConfiguration.deepCopy(template.getBusinessUnits()));
        return instance;
    }

    /**
     * builder factory method for Project
     * @return builder
     */
    public static ProjectBuilder builder() {
        return ProjectBuilder.of();
    }

    /**
     * create builder for Project instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectBuilder builder(final Project template) {
        return ProjectBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProject(Function<Project, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Project> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Project>() {
            @Override
            public String toString() {
                return "TypeReference<Project>";
            }
        };
    }
}
