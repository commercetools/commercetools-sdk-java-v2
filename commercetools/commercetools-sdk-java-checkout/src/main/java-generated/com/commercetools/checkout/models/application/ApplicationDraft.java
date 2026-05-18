
package com.commercetools.checkout.models.application;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ApplicationDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApplicationDraft applicationDraft = ApplicationDraft.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .plusCountries(countriesBuilder -> countriesBuilder)
 *             .allowedOrigins(allowedOriginsBuilder -> allowedOriginsBuilder)
 *             .mode(ApplicationMode.COMPLETE_FLOW)
 *             .paymentsConfiguration(paymentsConfigurationBuilder -> paymentsConfigurationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApplicationDraftImpl.class)
public interface ApplicationDraft extends io.vrap.rmf.base.client.Draft<ApplicationDraft> {

    /**
     *  <p>User-defined unique identifier of the Application. <code>MinLength: 2 ​MaxLength: 256 ​Pattern: ^[A-Za-z0-9_-]+$</code></p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Indicates whether the Application is active or not.</p>
     * @return status
     */

    @JsonProperty("status")
    public ApplicationStatus getStatus();

    /**
     *  <p>Name of the Application.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Description of the Application.</p>
     * @return description
     */

    @JsonProperty("description")
    public String getDescription();

    /**
     *  <p>Details of the Application logo. It is required if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @return logo
     */
    @Valid
    @JsonProperty("logo")
    public ApplicationLogo getLogo();

    /**
     *  <p>List of countries that the Application supports. Each country is represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @return countries
     */
    @NotNull
    @JsonProperty("countries")
    public List<String> getCountries();

    /**
     *  <p>Allowed origin URLs for the Application.</p>
     * @return allowedOrigins
     */
    @NotNull
    @Valid
    @JsonProperty("allowedOrigins")
    public AllowedOrigins getAllowedOrigins();

    /**
     *  <p>Checkout mode to use for the Application.</p>
     * @return mode
     */
    @NotNull
    @JsonProperty("mode")
    public ApplicationMode getMode();

    /**
     *  <p>Sets the payment configuration options of the Application.</p>
     * @return paymentsConfiguration
     */
    @NotNull
    @Valid
    @JsonProperty("paymentsConfiguration")
    public PaymentsConfiguration getPaymentsConfiguration();

    /**
     *  <p>User agreements to display. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @return agreements
     */
    @Valid
    @JsonProperty("agreements")
    public List<ApplicationAgreement> getAgreements();

    /**
     *  <p>Sets the discounts configuration options of the Application. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @return discountsConfiguration
     */
    @Valid
    @JsonProperty("discountsConfiguration")
    public DiscountsConfiguration getDiscountsConfiguration();

    /**
     *  <p>User-defined unique identifier of the Application. <code>MinLength: 2 ​MaxLength: 256 ​Pattern: ^[A-Za-z0-9_-]+$</code></p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Indicates whether the Application is active or not.</p>
     * @param status value to be set
     */

    public void setStatus(final ApplicationStatus status);

    /**
     *  <p>Name of the Application.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Description of the Application.</p>
     * @param description value to be set
     */

    public void setDescription(final String description);

    /**
     *  <p>Details of the Application logo. It is required if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param logo value to be set
     */

    public void setLogo(final ApplicationLogo logo);

    /**
     *  <p>List of countries that the Application supports. Each country is represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param countries values to be set
     */

    @JsonIgnore
    public void setCountries(final String... countries);

    /**
     *  <p>List of countries that the Application supports. Each country is represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param countries values to be set
     */

    public void setCountries(final List<String> countries);

    /**
     *  <p>Allowed origin URLs for the Application.</p>
     * @param allowedOrigins value to be set
     */

    public void setAllowedOrigins(final AllowedOrigins allowedOrigins);

    /**
     *  <p>Checkout mode to use for the Application.</p>
     * @param mode value to be set
     */

    public void setMode(final ApplicationMode mode);

    /**
     *  <p>Sets the payment configuration options of the Application.</p>
     * @param paymentsConfiguration value to be set
     */

    public void setPaymentsConfiguration(final PaymentsConfiguration paymentsConfiguration);

    /**
     *  <p>User agreements to display. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param agreements values to be set
     */

    @JsonIgnore
    public void setAgreements(final ApplicationAgreement... agreements);

    /**
     *  <p>User agreements to display. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param agreements values to be set
     */

    public void setAgreements(final List<ApplicationAgreement> agreements);

    /**
     *  <p>Sets the discounts configuration options of the Application. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param discountsConfiguration value to be set
     */

    public void setDiscountsConfiguration(final DiscountsConfiguration discountsConfiguration);

    /**
     * factory method
     * @return instance of ApplicationDraft
     */
    public static ApplicationDraft of() {
        return new ApplicationDraftImpl();
    }

    /**
     * factory method to create a shallow copy ApplicationDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApplicationDraft of(final ApplicationDraft template) {
        ApplicationDraftImpl instance = new ApplicationDraftImpl();
        instance.setKey(template.getKey());
        instance.setStatus(template.getStatus());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setLogo(template.getLogo());
        instance.setCountries(template.getCountries());
        instance.setAllowedOrigins(template.getAllowedOrigins());
        instance.setMode(template.getMode());
        instance.setPaymentsConfiguration(template.getPaymentsConfiguration());
        instance.setAgreements(template.getAgreements());
        instance.setDiscountsConfiguration(template.getDiscountsConfiguration());
        return instance;
    }

    public ApplicationDraft copyDeep();

    /**
     * factory method to create a deep copy of ApplicationDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApplicationDraft deepCopy(@Nullable final ApplicationDraft template) {
        if (template == null) {
            return null;
        }
        ApplicationDraftImpl instance = new ApplicationDraftImpl();
        instance.setKey(template.getKey());
        instance.setStatus(template.getStatus());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setLogo(com.commercetools.checkout.models.application.ApplicationLogo.deepCopy(template.getLogo()));
        instance.setCountries(Optional.ofNullable(template.getCountries()).map(ArrayList::new).orElse(null));
        instance.setAllowedOrigins(
            com.commercetools.checkout.models.application.AllowedOrigins.deepCopy(template.getAllowedOrigins()));
        instance.setMode(template.getMode());
        instance.setPaymentsConfiguration(com.commercetools.checkout.models.application.PaymentsConfiguration
                .deepCopy(template.getPaymentsConfiguration()));
        instance.setAgreements(Optional.ofNullable(template.getAgreements())
                .map(t -> t.stream()
                        .map(com.commercetools.checkout.models.application.ApplicationAgreement::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setDiscountsConfiguration(com.commercetools.checkout.models.application.DiscountsConfiguration
                .deepCopy(template.getDiscountsConfiguration()));
        return instance;
    }

    /**
     * builder factory method for ApplicationDraft
     * @return builder
     */
    public static ApplicationDraftBuilder builder() {
        return ApplicationDraftBuilder.of();
    }

    /**
     * create builder for ApplicationDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicationDraftBuilder builder(final ApplicationDraft template) {
        return ApplicationDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApplicationDraft(Function<ApplicationDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApplicationDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApplicationDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ApplicationDraft>";
            }
        };
    }
}
