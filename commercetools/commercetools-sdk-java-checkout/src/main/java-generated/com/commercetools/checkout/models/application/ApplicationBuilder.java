
package com.commercetools.checkout.models.application;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApplicationBuilder
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
public class ApplicationBuilder implements Builder<Application> {

    private String id;

    private Integer version;

    private String key;

    @Nullable
    private com.commercetools.checkout.models.application.ApplicationStatus status;

    private String name;

    @Nullable
    private String description;

    @Nullable
    private com.commercetools.checkout.models.application.ApplicationLogo logo;

    private java.util.List<String> countries;

    private com.commercetools.checkout.models.application.AllowedOrigins allowedOrigins;

    private com.commercetools.checkout.models.application.ApplicationMode mode;

    private com.commercetools.checkout.models.application.PaymentsConfiguration paymentsConfiguration;

    @Nullable
    private java.util.List<com.commercetools.checkout.models.application.ApplicationAgreement> agreements;

    @Nullable
    private com.commercetools.checkout.models.application.DiscountsConfiguration discountsConfiguration;

    private java.time.ZonedDateTime createdAt;

    @Nullable
    private com.commercetools.checkout.models.payment_integration.CreatedBy createdBy;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.checkout.models.payment_integration.LastModifiedBy lastModifiedBy;

    /**
     *  <p>Unique identifier of the Application.</p>
     * @param id value to be set
     * @return Builder
     */

    public ApplicationBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Application.</p>
     * @param version value to be set
     * @return Builder
     */

    public ApplicationBuilder version(final Integer version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Application. <code>MinLength: 2 ​MaxLength: 256 ​Pattern: ^[A-Za-z0-9_-]+$</code></p>
     * @param key value to be set
     * @return Builder
     */

    public ApplicationBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Indicates whether the Application is active or not.</p>
     * @param status value to be set
     * @return Builder
     */

    public ApplicationBuilder status(
            @Nullable final com.commercetools.checkout.models.application.ApplicationStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Name of the Application.</p>
     * @param name value to be set
     * @return Builder
     */

    public ApplicationBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the Application.</p>
     * @param description value to be set
     * @return Builder
     */

    public ApplicationBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Details of the application logo. It is required if the <code>mode = CompleteFlow</code>.</p>
     * @param builder function to build the logo value
     * @return Builder
     */

    public ApplicationBuilder logo(
            Function<com.commercetools.checkout.models.application.ApplicationLogoBuilder, com.commercetools.checkout.models.application.ApplicationLogoBuilder> builder) {
        this.logo = builder.apply(com.commercetools.checkout.models.application.ApplicationLogoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Details of the application logo. It is required if the <code>mode = CompleteFlow</code>.</p>
     * @param builder function to build the logo value
     * @return Builder
     */

    public ApplicationBuilder withLogo(
            Function<com.commercetools.checkout.models.application.ApplicationLogoBuilder, com.commercetools.checkout.models.application.ApplicationLogo> builder) {
        this.logo = builder.apply(com.commercetools.checkout.models.application.ApplicationLogoBuilder.of());
        return this;
    }

    /**
     *  <p>Details of the application logo. It is required if the <code>mode = CompleteFlow</code>.</p>
     * @param logo value to be set
     * @return Builder
     */

    public ApplicationBuilder logo(@Nullable final com.commercetools.checkout.models.application.ApplicationLogo logo) {
        this.logo = logo;
        return this;
    }

    /**
     *  <p>List of countries that the Application supports. Each country is represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param countries value to be set
     * @return Builder
     */

    public ApplicationBuilder countries(final String... countries) {
        this.countries = new ArrayList<>(Arrays.asList(countries));
        return this;
    }

    /**
     *  <p>List of countries that the Application supports. Each country is represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param countries value to be set
     * @return Builder
     */

    public ApplicationBuilder countries(final java.util.List<String> countries) {
        this.countries = countries;
        return this;
    }

    /**
     *  <p>List of countries that the Application supports. Each country is represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param countries value to be set
     * @return Builder
     */

    public ApplicationBuilder plusCountries(final String... countries) {
        if (this.countries == null) {
            this.countries = new ArrayList<>();
        }
        this.countries.addAll(Arrays.asList(countries));
        return this;
    }

    /**
     *  <p>Allowed origin URLs for the Application.</p>
     * @param builder function to build the allowedOrigins value
     * @return Builder
     */

    public ApplicationBuilder allowedOrigins(
            Function<com.commercetools.checkout.models.application.AllowedOriginsBuilder, com.commercetools.checkout.models.application.AllowedOriginsBuilder> builder) {
        this.allowedOrigins = builder.apply(com.commercetools.checkout.models.application.AllowedOriginsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Allowed origin URLs for the Application.</p>
     * @param builder function to build the allowedOrigins value
     * @return Builder
     */

    public ApplicationBuilder withAllowedOrigins(
            Function<com.commercetools.checkout.models.application.AllowedOriginsBuilder, com.commercetools.checkout.models.application.AllowedOrigins> builder) {
        this.allowedOrigins = builder.apply(com.commercetools.checkout.models.application.AllowedOriginsBuilder.of());
        return this;
    }

    /**
     *  <p>Allowed origin URLs for the Application.</p>
     * @param allowedOrigins value to be set
     * @return Builder
     */

    public ApplicationBuilder allowedOrigins(
            final com.commercetools.checkout.models.application.AllowedOrigins allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    /**
     *  <p>Checkout mode to use for the Application.</p>
     * @param mode value to be set
     * @return Builder
     */

    public ApplicationBuilder mode(final com.commercetools.checkout.models.application.ApplicationMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     *  <p>Sets the payment configuration options of the Application.</p>
     * @param builder function to build the paymentsConfiguration value
     * @return Builder
     */

    public ApplicationBuilder paymentsConfiguration(
            Function<com.commercetools.checkout.models.application.PaymentsConfigurationBuilder, com.commercetools.checkout.models.application.PaymentsConfigurationBuilder> builder) {
        this.paymentsConfiguration = builder
                .apply(com.commercetools.checkout.models.application.PaymentsConfigurationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Sets the payment configuration options of the Application.</p>
     * @param builder function to build the paymentsConfiguration value
     * @return Builder
     */

    public ApplicationBuilder withPaymentsConfiguration(
            Function<com.commercetools.checkout.models.application.PaymentsConfigurationBuilder, com.commercetools.checkout.models.application.PaymentsConfiguration> builder) {
        this.paymentsConfiguration = builder
                .apply(com.commercetools.checkout.models.application.PaymentsConfigurationBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the payment configuration options of the Application.</p>
     * @param paymentsConfiguration value to be set
     * @return Builder
     */

    public ApplicationBuilder paymentsConfiguration(
            final com.commercetools.checkout.models.application.PaymentsConfiguration paymentsConfiguration) {
        this.paymentsConfiguration = paymentsConfiguration;
        return this;
    }

    /**
     *  <p>User agreements to display. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param agreements value to be set
     * @return Builder
     */

    public ApplicationBuilder agreements(
            @Nullable final com.commercetools.checkout.models.application.ApplicationAgreement... agreements) {
        this.agreements = new ArrayList<>(Arrays.asList(agreements));
        return this;
    }

    /**
     *  <p>User agreements to display. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param agreements value to be set
     * @return Builder
     */

    public ApplicationBuilder agreements(
            @Nullable final java.util.List<com.commercetools.checkout.models.application.ApplicationAgreement> agreements) {
        this.agreements = agreements;
        return this;
    }

    /**
     *  <p>User agreements to display. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param agreements value to be set
     * @return Builder
     */

    public ApplicationBuilder plusAgreements(
            @Nullable final com.commercetools.checkout.models.application.ApplicationAgreement... agreements) {
        if (this.agreements == null) {
            this.agreements = new ArrayList<>();
        }
        this.agreements.addAll(Arrays.asList(agreements));
        return this;
    }

    /**
     *  <p>User agreements to display. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param builder function to build the agreements value
     * @return Builder
     */

    public ApplicationBuilder plusAgreements(
            Function<com.commercetools.checkout.models.application.ApplicationAgreementBuilder, com.commercetools.checkout.models.application.ApplicationAgreementBuilder> builder) {
        if (this.agreements == null) {
            this.agreements = new ArrayList<>();
        }
        this.agreements.add(
            builder.apply(com.commercetools.checkout.models.application.ApplicationAgreementBuilder.of()).build());
        return this;
    }

    /**
     *  <p>User agreements to display. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param builder function to build the agreements value
     * @return Builder
     */

    public ApplicationBuilder withAgreements(
            Function<com.commercetools.checkout.models.application.ApplicationAgreementBuilder, com.commercetools.checkout.models.application.ApplicationAgreementBuilder> builder) {
        this.agreements = new ArrayList<>();
        this.agreements.add(
            builder.apply(com.commercetools.checkout.models.application.ApplicationAgreementBuilder.of()).build());
        return this;
    }

    /**
     *  <p>User agreements to display. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param builder function to build the agreements value
     * @return Builder
     */

    public ApplicationBuilder addAgreements(
            Function<com.commercetools.checkout.models.application.ApplicationAgreementBuilder, com.commercetools.checkout.models.application.ApplicationAgreement> builder) {
        return plusAgreements(
            builder.apply(com.commercetools.checkout.models.application.ApplicationAgreementBuilder.of()));
    }

    /**
     *  <p>User agreements to display. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param builder function to build the agreements value
     * @return Builder
     */

    public ApplicationBuilder setAgreements(
            Function<com.commercetools.checkout.models.application.ApplicationAgreementBuilder, com.commercetools.checkout.models.application.ApplicationAgreement> builder) {
        return agreements(
            builder.apply(com.commercetools.checkout.models.application.ApplicationAgreementBuilder.of()));
    }

    /**
     *  <p>Sets the discounts configuration options of the Application. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param builder function to build the discountsConfiguration value
     * @return Builder
     */

    public ApplicationBuilder discountsConfiguration(
            Function<com.commercetools.checkout.models.application.DiscountsConfigurationBuilder, com.commercetools.checkout.models.application.DiscountsConfigurationBuilder> builder) {
        this.discountsConfiguration = builder
                .apply(com.commercetools.checkout.models.application.DiscountsConfigurationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Sets the discounts configuration options of the Application. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param builder function to build the discountsConfiguration value
     * @return Builder
     */

    public ApplicationBuilder withDiscountsConfiguration(
            Function<com.commercetools.checkout.models.application.DiscountsConfigurationBuilder, com.commercetools.checkout.models.application.DiscountsConfiguration> builder) {
        this.discountsConfiguration = builder
                .apply(com.commercetools.checkout.models.application.DiscountsConfigurationBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the discounts configuration options of the Application. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param discountsConfiguration value to be set
     * @return Builder
     */

    public ApplicationBuilder discountsConfiguration(
            @Nullable final com.commercetools.checkout.models.application.DiscountsConfiguration discountsConfiguration) {
        this.discountsConfiguration = discountsConfiguration;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Application was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ApplicationBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>IDs and references that created the Application.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ApplicationBuilder createdBy(
            Function<com.commercetools.checkout.models.payment_integration.CreatedByBuilder, com.commercetools.checkout.models.payment_integration.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.checkout.models.payment_integration.CreatedByBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Application.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ApplicationBuilder withCreatedBy(
            Function<com.commercetools.checkout.models.payment_integration.CreatedByBuilder, com.commercetools.checkout.models.payment_integration.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.checkout.models.payment_integration.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Application.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public ApplicationBuilder createdBy(
            @Nullable final com.commercetools.checkout.models.payment_integration.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Application was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public ApplicationBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Application.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ApplicationBuilder lastModifiedBy(
            Function<com.commercetools.checkout.models.payment_integration.LastModifiedByBuilder, com.commercetools.checkout.models.payment_integration.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder
                .apply(com.commercetools.checkout.models.payment_integration.LastModifiedByBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Application.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ApplicationBuilder withLastModifiedBy(
            Function<com.commercetools.checkout.models.payment_integration.LastModifiedByBuilder, com.commercetools.checkout.models.payment_integration.LastModifiedBy> builder) {
        this.lastModifiedBy = builder
                .apply(com.commercetools.checkout.models.payment_integration.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Application.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public ApplicationBuilder lastModifiedBy(
            @Nullable final com.commercetools.checkout.models.payment_integration.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Unique identifier of the Application.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Application.</p>
     * @return version
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     *  <p>User-defined unique identifier of the Application. <code>MinLength: 2 ​MaxLength: 256 ​Pattern: ^[A-Za-z0-9_-]+$</code></p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Indicates whether the Application is active or not.</p>
     * @return status
     */

    @Nullable
    public com.commercetools.checkout.models.application.ApplicationStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Name of the Application.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Description of the Application.</p>
     * @return description
     */

    @Nullable
    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>Details of the application logo. It is required if the <code>mode = CompleteFlow</code>.</p>
     * @return logo
     */

    @Nullable
    public com.commercetools.checkout.models.application.ApplicationLogo getLogo() {
        return this.logo;
    }

    /**
     *  <p>List of countries that the Application supports. Each country is represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @return countries
     */

    public java.util.List<String> getCountries() {
        return this.countries;
    }

    /**
     *  <p>Allowed origin URLs for the Application.</p>
     * @return allowedOrigins
     */

    public com.commercetools.checkout.models.application.AllowedOrigins getAllowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     *  <p>Checkout mode to use for the Application.</p>
     * @return mode
     */

    public com.commercetools.checkout.models.application.ApplicationMode getMode() {
        return this.mode;
    }

    /**
     *  <p>Sets the payment configuration options of the Application.</p>
     * @return paymentsConfiguration
     */

    public com.commercetools.checkout.models.application.PaymentsConfiguration getPaymentsConfiguration() {
        return this.paymentsConfiguration;
    }

    /**
     *  <p>User agreements to display. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @return agreements
     */

    @Nullable
    public java.util.List<com.commercetools.checkout.models.application.ApplicationAgreement> getAgreements() {
        return this.agreements;
    }

    /**
     *  <p>Sets the discounts configuration options of the Application. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @return discountsConfiguration
     */

    @Nullable
    public com.commercetools.checkout.models.application.DiscountsConfiguration getDiscountsConfiguration() {
        return this.discountsConfiguration;
    }

    /**
     *  <p>Date and time (UTC) the Application was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>IDs and references that created the Application.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.checkout.models.payment_integration.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Date and time (UTC) the Application was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the Application.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.checkout.models.payment_integration.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * builds Application with checking for non-null required values
     * @return Application
     */
    public Application build() {
        Objects.requireNonNull(id, Application.class + ": id is missing");
        Objects.requireNonNull(version, Application.class + ": version is missing");
        Objects.requireNonNull(key, Application.class + ": key is missing");
        Objects.requireNonNull(name, Application.class + ": name is missing");
        Objects.requireNonNull(countries, Application.class + ": countries is missing");
        Objects.requireNonNull(allowedOrigins, Application.class + ": allowedOrigins is missing");
        Objects.requireNonNull(mode, Application.class + ": mode is missing");
        Objects.requireNonNull(paymentsConfiguration, Application.class + ": paymentsConfiguration is missing");
        Objects.requireNonNull(createdAt, Application.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Application.class + ": lastModifiedAt is missing");
        return new ApplicationImpl(id, version, key, status, name, description, logo, countries, allowedOrigins, mode,
            paymentsConfiguration, agreements, discountsConfiguration, createdAt, createdBy, lastModifiedAt,
            lastModifiedBy);
    }

    /**
     * builds Application without checking for non-null required values
     * @return Application
     */
    public Application buildUnchecked() {
        return new ApplicationImpl(id, version, key, status, name, description, logo, countries, allowedOrigins, mode,
            paymentsConfiguration, agreements, discountsConfiguration, createdAt, createdBy, lastModifiedAt,
            lastModifiedBy);
    }

    /**
     * factory method for an instance of ApplicationBuilder
     * @return builder
     */
    public static ApplicationBuilder of() {
        return new ApplicationBuilder();
    }

    /**
     * create builder for Application instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicationBuilder of(final Application template) {
        ApplicationBuilder builder = new ApplicationBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.key = template.getKey();
        builder.status = template.getStatus();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.logo = template.getLogo();
        builder.countries = template.getCountries();
        builder.allowedOrigins = template.getAllowedOrigins();
        builder.mode = template.getMode();
        builder.paymentsConfiguration = template.getPaymentsConfiguration();
        builder.agreements = template.getAgreements();
        builder.discountsConfiguration = template.getDiscountsConfiguration();
        builder.createdAt = template.getCreatedAt();
        builder.createdBy = template.getCreatedBy();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        return builder;
    }

}
