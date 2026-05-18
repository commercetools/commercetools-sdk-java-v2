
package com.commercetools.checkout.models.application;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.payment_integration.CreatedBy;
import com.commercetools.checkout.models.payment_integration.LastModifiedBy;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Application
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Application application = Application.builder()
 *             .id("{id}")
 *             .version(1)
 *             .key("{key}")
 *             .name("{name}")
 *             .plusCountries(countriesBuilder -> countriesBuilder)
 *             .allowedOrigins(allowedOriginsBuilder -> allowedOriginsBuilder)
 *             .mode(ApplicationMode.COMPLETE_FLOW)
 *             .paymentsConfiguration(paymentsConfigurationBuilder -> paymentsConfigurationBuilder)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApplicationImpl.class)
public interface Application {

    /**
     *  <p>Unique identifier of the Application.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Application.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Integer getVersion();

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
     *  <p>Details of the application logo. It is required if the <code>mode = CompleteFlow</code>.</p>
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
     *  <p>Date and time (UTC) the Application was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>IDs and references that created the Application.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Date and time (UTC) the Application was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the Application.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Unique identifier of the Application.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Application.</p>
     * @param version value to be set
     */

    public void setVersion(final Integer version);

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
     *  <p>Details of the application logo. It is required if the <code>mode = CompleteFlow</code>.</p>
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
     *  <p>Date and time (UTC) the Application was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>IDs and references that created the Application.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>Date and time (UTC) the Application was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the Application.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     * factory method
     * @return instance of Application
     */
    public static Application of() {
        return new ApplicationImpl();
    }

    /**
     * factory method to create a shallow copy Application
     * @param template instance to be copied
     * @return copy instance
     */
    public static Application of(final Application template) {
        ApplicationImpl instance = new ApplicationImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
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
        instance.setCreatedAt(template.getCreatedAt());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        return instance;
    }

    public Application copyDeep();

    /**
     * factory method to create a deep copy of Application
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Application deepCopy(@Nullable final Application template) {
        if (template == null) {
            return null;
        }
        ApplicationImpl instance = new ApplicationImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
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
        instance.setCreatedAt(template.getCreatedAt());
        instance.setCreatedBy(
            com.commercetools.checkout.models.payment_integration.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(com.commercetools.checkout.models.payment_integration.LastModifiedBy
                .deepCopy(template.getLastModifiedBy()));
        return instance;
    }

    /**
     * builder factory method for Application
     * @return builder
     */
    public static ApplicationBuilder builder() {
        return ApplicationBuilder.of();
    }

    /**
     * create builder for Application instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicationBuilder builder(final Application template) {
        return ApplicationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApplication(Function<Application, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Application> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Application>() {
            @Override
            public String toString() {
                return "TypeReference<Application>";
            }
        };
    }
}
