
package com.commercetools.api.models.project;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

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

    public void setVersion(final Long version);

    public void setKey(final String key);

    public void setName(final String name);

    @JsonIgnore
    public void setCountries(final String... countries);

    public void setCountries(final List<String> countries);

    @JsonIgnore
    public void setCurrencies(final String... currencies);

    public void setCurrencies(final List<String> currencies);

    @JsonIgnore
    public void setLanguages(final String... languages);

    public void setLanguages(final List<String> languages);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setTrialUntil(final String trialUntil);

    public void setMessages(final MessagesConfiguration messages);

    public void setCarts(final CartsConfiguration carts);

    public void setShoppingLists(final ShoppingListsConfiguration shoppingLists);

    public void setShippingRateInputType(final ShippingRateInputType shippingRateInputType);

    public void setExternalOAuth(final ExternalOAuth externalOAuth);

    public void setSearchIndexing(final SearchIndexingConfiguration searchIndexing);

    public void setBusinessUnits(final BusinessUnitConfiguration businessUnits);

    public static Project of() {
        return new ProjectImpl();
    }

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

    public static ProjectBuilder builder() {
        return ProjectBuilder.of();
    }

    public static ProjectBuilder builder(final Project template) {
        return ProjectBuilder.of(template);
    }

    default <T> T withProject(Function<Project, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Project> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Project>() {
            @Override
            public String toString() {
                return "TypeReference<Project>";
            }
        };
    }
}
