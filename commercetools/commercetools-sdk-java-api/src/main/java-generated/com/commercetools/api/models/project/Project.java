
package com.commercetools.api.models.project;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.message.MessageConfiguration;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProjectImpl.class)
public interface Project {

    /**
    *  <p>The current version of the project.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>The unique key of the project.</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>The name of the project.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    @NotNull
    @JsonProperty("countries")
    public List<String> getCountries();

    /**
    *  <p>A three-digit currency code as per <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
    */
    @NotNull
    @JsonProperty("currencies")
    public List<String> getCurrencies();

    @NotNull
    @JsonProperty("languages")
    public List<String> getLanguages();

    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
    *  <p>The time is in the format Year-Month <code>YYYY-MM</code>.</p>
    */

    @JsonProperty("trialUntil")
    public String getTrialUntil();

    @NotNull
    @Valid
    @JsonProperty("messages")
    public MessageConfiguration getMessages();

    @Valid
    @JsonProperty("shippingRateInputType")
    public ShippingRateInputType getShippingRateInputType();

    @Valid
    @JsonProperty("externalOAuth")
    public ExternalOAuth getExternalOAuth();

    @NotNull
    @Valid
    @JsonProperty("carts")
    public CartsConfiguration getCarts();

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

    public void setMessages(final MessageConfiguration messages);

    public void setShippingRateInputType(final ShippingRateInputType shippingRateInputType);

    public void setExternalOAuth(final ExternalOAuth externalOAuth);

    public void setCarts(final CartsConfiguration carts);

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
        instance.setShippingRateInputType(template.getShippingRateInputType());
        instance.setExternalOAuth(template.getExternalOAuth());
        instance.setCarts(template.getCarts());
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
}
