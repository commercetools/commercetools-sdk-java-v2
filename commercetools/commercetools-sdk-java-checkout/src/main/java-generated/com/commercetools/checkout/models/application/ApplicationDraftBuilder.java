
package com.commercetools.checkout.models.application;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApplicationDraftBuilder
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
public class ApplicationDraftBuilder implements Builder<ApplicationDraft> {

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

    /**
     *  <p>User-defined unique identifier of the Application. <code>MinLength: 2 ​MaxLength: 256 ​Pattern: ^[A-Za-z0-9_-]+$</code></p>
     * @param key value to be set
     * @return Builder
     */

    public ApplicationDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Indicates whether the Application is active or not.</p>
     * @param status value to be set
     * @return Builder
     */

    public ApplicationDraftBuilder status(
            @Nullable final com.commercetools.checkout.models.application.ApplicationStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Name of the Application.</p>
     * @param name value to be set
     * @return Builder
     */

    public ApplicationDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the Application.</p>
     * @param description value to be set
     * @return Builder
     */

    public ApplicationDraftBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Details of the Application logo. It is required if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param builder function to build the logo value
     * @return Builder
     */

    public ApplicationDraftBuilder logo(
            Function<com.commercetools.checkout.models.application.ApplicationLogoBuilder, com.commercetools.checkout.models.application.ApplicationLogoBuilder> builder) {
        this.logo = builder.apply(com.commercetools.checkout.models.application.ApplicationLogoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Details of the Application logo. It is required if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param builder function to build the logo value
     * @return Builder
     */

    public ApplicationDraftBuilder withLogo(
            Function<com.commercetools.checkout.models.application.ApplicationLogoBuilder, com.commercetools.checkout.models.application.ApplicationLogo> builder) {
        this.logo = builder.apply(com.commercetools.checkout.models.application.ApplicationLogoBuilder.of());
        return this;
    }

    /**
     *  <p>Details of the Application logo. It is required if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param logo value to be set
     * @return Builder
     */

    public ApplicationDraftBuilder logo(
            @Nullable final com.commercetools.checkout.models.application.ApplicationLogo logo) {
        this.logo = logo;
        return this;
    }

    /**
     *  <p>List of countries that the Application supports. Each country is represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param countries value to be set
     * @return Builder
     */

    public ApplicationDraftBuilder countries(final String... countries) {
        this.countries = new ArrayList<>(Arrays.asList(countries));
        return this;
    }

    /**
     *  <p>List of countries that the Application supports. Each country is represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param countries value to be set
     * @return Builder
     */

    public ApplicationDraftBuilder countries(final java.util.List<String> countries) {
        this.countries = countries;
        return this;
    }

    /**
     *  <p>List of countries that the Application supports. Each country is represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param countries value to be set
     * @return Builder
     */

    public ApplicationDraftBuilder plusCountries(final String... countries) {
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

    public ApplicationDraftBuilder allowedOrigins(
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

    public ApplicationDraftBuilder withAllowedOrigins(
            Function<com.commercetools.checkout.models.application.AllowedOriginsBuilder, com.commercetools.checkout.models.application.AllowedOrigins> builder) {
        this.allowedOrigins = builder.apply(com.commercetools.checkout.models.application.AllowedOriginsBuilder.of());
        return this;
    }

    /**
     *  <p>Allowed origin URLs for the Application.</p>
     * @param allowedOrigins value to be set
     * @return Builder
     */

    public ApplicationDraftBuilder allowedOrigins(
            final com.commercetools.checkout.models.application.AllowedOrigins allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    /**
     *  <p>Checkout mode to use for the Application.</p>
     * @param mode value to be set
     * @return Builder
     */

    public ApplicationDraftBuilder mode(final com.commercetools.checkout.models.application.ApplicationMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     *  <p>Sets the payment configuration options of the Application.</p>
     * @param builder function to build the paymentsConfiguration value
     * @return Builder
     */

    public ApplicationDraftBuilder paymentsConfiguration(
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

    public ApplicationDraftBuilder withPaymentsConfiguration(
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

    public ApplicationDraftBuilder paymentsConfiguration(
            final com.commercetools.checkout.models.application.PaymentsConfiguration paymentsConfiguration) {
        this.paymentsConfiguration = paymentsConfiguration;
        return this;
    }

    /**
     *  <p>User agreements to display. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param agreements value to be set
     * @return Builder
     */

    public ApplicationDraftBuilder agreements(
            @Nullable final com.commercetools.checkout.models.application.ApplicationAgreement... agreements) {
        this.agreements = new ArrayList<>(Arrays.asList(agreements));
        return this;
    }

    /**
     *  <p>User agreements to display. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param agreements value to be set
     * @return Builder
     */

    public ApplicationDraftBuilder agreements(
            @Nullable final java.util.List<com.commercetools.checkout.models.application.ApplicationAgreement> agreements) {
        this.agreements = agreements;
        return this;
    }

    /**
     *  <p>User agreements to display. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param agreements value to be set
     * @return Builder
     */

    public ApplicationDraftBuilder plusAgreements(
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

    public ApplicationDraftBuilder plusAgreements(
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

    public ApplicationDraftBuilder withAgreements(
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

    public ApplicationDraftBuilder addAgreements(
            Function<com.commercetools.checkout.models.application.ApplicationAgreementBuilder, com.commercetools.checkout.models.application.ApplicationAgreement> builder) {
        return plusAgreements(
            builder.apply(com.commercetools.checkout.models.application.ApplicationAgreementBuilder.of()));
    }

    /**
     *  <p>User agreements to display. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param builder function to build the agreements value
     * @return Builder
     */

    public ApplicationDraftBuilder setAgreements(
            Function<com.commercetools.checkout.models.application.ApplicationAgreementBuilder, com.commercetools.checkout.models.application.ApplicationAgreement> builder) {
        return agreements(
            builder.apply(com.commercetools.checkout.models.application.ApplicationAgreementBuilder.of()));
    }

    /**
     *  <p>Sets the discounts configuration options of the Application. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     * @param builder function to build the discountsConfiguration value
     * @return Builder
     */

    public ApplicationDraftBuilder discountsConfiguration(
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

    public ApplicationDraftBuilder withDiscountsConfiguration(
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

    public ApplicationDraftBuilder discountsConfiguration(
            @Nullable final com.commercetools.checkout.models.application.DiscountsConfiguration discountsConfiguration) {
        this.discountsConfiguration = discountsConfiguration;
        return this;
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
     *  <p>Details of the Application logo. It is required if the <code>mode</code> is <code>CompleteFlow</code>.</p>
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
     * builds ApplicationDraft with checking for non-null required values
     * @return ApplicationDraft
     */
    public ApplicationDraft build() {
        Objects.requireNonNull(key, ApplicationDraft.class + ": key is missing");
        Objects.requireNonNull(name, ApplicationDraft.class + ": name is missing");
        Objects.requireNonNull(countries, ApplicationDraft.class + ": countries is missing");
        Objects.requireNonNull(allowedOrigins, ApplicationDraft.class + ": allowedOrigins is missing");
        Objects.requireNonNull(mode, ApplicationDraft.class + ": mode is missing");
        Objects.requireNonNull(paymentsConfiguration, ApplicationDraft.class + ": paymentsConfiguration is missing");
        return new ApplicationDraftImpl(key, status, name, description, logo, countries, allowedOrigins, mode,
            paymentsConfiguration, agreements, discountsConfiguration);
    }

    /**
     * builds ApplicationDraft without checking for non-null required values
     * @return ApplicationDraft
     */
    public ApplicationDraft buildUnchecked() {
        return new ApplicationDraftImpl(key, status, name, description, logo, countries, allowedOrigins, mode,
            paymentsConfiguration, agreements, discountsConfiguration);
    }

    /**
     * factory method for an instance of ApplicationDraftBuilder
     * @return builder
     */
    public static ApplicationDraftBuilder of() {
        return new ApplicationDraftBuilder();
    }

    /**
     * create builder for ApplicationDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicationDraftBuilder of(final ApplicationDraft template) {
        ApplicationDraftBuilder builder = new ApplicationDraftBuilder();
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
        return builder;
    }

}
