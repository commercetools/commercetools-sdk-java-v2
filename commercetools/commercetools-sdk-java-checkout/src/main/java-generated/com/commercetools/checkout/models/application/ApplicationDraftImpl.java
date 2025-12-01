
package com.commercetools.checkout.models.application;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ApplicationDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApplicationDraftImpl implements ApplicationDraft, ModelBase {

    private String key;

    private com.commercetools.checkout.models.application.ApplicationStatus status;

    private String name;

    private String description;

    private com.commercetools.checkout.models.application.ApplicationLogo logo;

    private java.util.List<String> countries;

    private com.commercetools.checkout.models.application.AllowedOrigins allowedOrigins;

    private com.commercetools.checkout.models.application.ApplicationMode mode;

    private com.commercetools.checkout.models.application.PaymentsConfiguration paymentsConfiguration;

    private java.util.List<com.commercetools.checkout.models.application.ApplicationAgreement> agreements;

    private com.commercetools.checkout.models.application.DiscountsConfiguration discountsConfiguration;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApplicationDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("status") final com.commercetools.checkout.models.application.ApplicationStatus status,
            @JsonProperty("name") final String name, @JsonProperty("description") final String description,
            @JsonProperty("logo") final com.commercetools.checkout.models.application.ApplicationLogo logo,
            @JsonProperty("countries") final java.util.List<String> countries,
            @JsonProperty("allowedOrigins") final com.commercetools.checkout.models.application.AllowedOrigins allowedOrigins,
            @JsonProperty("mode") final com.commercetools.checkout.models.application.ApplicationMode mode,
            @JsonProperty("paymentsConfiguration") final com.commercetools.checkout.models.application.PaymentsConfiguration paymentsConfiguration,
            @JsonProperty("agreements") final java.util.List<com.commercetools.checkout.models.application.ApplicationAgreement> agreements,
            @JsonProperty("discountsConfiguration") final com.commercetools.checkout.models.application.DiscountsConfiguration discountsConfiguration) {
        this.key = key;
        this.status = status;
        this.name = name;
        this.description = description;
        this.logo = logo;
        this.countries = countries;
        this.allowedOrigins = allowedOrigins;
        this.mode = mode;
        this.paymentsConfiguration = paymentsConfiguration;
        this.agreements = agreements;
        this.discountsConfiguration = discountsConfiguration;
    }

    /**
     * create empty instance
     */
    public ApplicationDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier of the Application. <code>MinLength: 2 ​MaxLength: 256 ​Pattern: ^[A-Za-z0-9_-]+$</code></p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Indicates whether the Application is active or not.</p>
     */

    public com.commercetools.checkout.models.application.ApplicationStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Name of the Application.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Description of the Application.</p>
     */

    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>Details of the Application logo. It is required if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     */

    public com.commercetools.checkout.models.application.ApplicationLogo getLogo() {
        return this.logo;
    }

    /**
     *  <p>List of countries that the Application supports. Each country is represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     */

    public java.util.List<String> getCountries() {
        return this.countries;
    }

    /**
     *  <p>Allowed origin URLs for the Application.</p>
     */

    public com.commercetools.checkout.models.application.AllowedOrigins getAllowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     *  <p>Checkout mode to use for the Application.</p>
     */

    public com.commercetools.checkout.models.application.ApplicationMode getMode() {
        return this.mode;
    }

    /**
     *  <p>Sets the payment configuration options of the Application.</p>
     */

    public com.commercetools.checkout.models.application.PaymentsConfiguration getPaymentsConfiguration() {
        return this.paymentsConfiguration;
    }

    /**
     *  <p>User agreements to display. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     */

    public java.util.List<com.commercetools.checkout.models.application.ApplicationAgreement> getAgreements() {
        return this.agreements;
    }

    /**
     *  <p>Sets the discounts configuration options of the Application. It is only applicable if the <code>mode</code> is <code>CompleteFlow</code>.</p>
     */

    public com.commercetools.checkout.models.application.DiscountsConfiguration getDiscountsConfiguration() {
        return this.discountsConfiguration;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setStatus(final com.commercetools.checkout.models.application.ApplicationStatus status) {
        this.status = status;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setLogo(final com.commercetools.checkout.models.application.ApplicationLogo logo) {
        this.logo = logo;
    }

    public void setCountries(final String... countries) {
        this.countries = new ArrayList<>(Arrays.asList(countries));
    }

    public void setCountries(final java.util.List<String> countries) {
        this.countries = countries;
    }

    public void setAllowedOrigins(final com.commercetools.checkout.models.application.AllowedOrigins allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
    }

    public void setMode(final com.commercetools.checkout.models.application.ApplicationMode mode) {
        this.mode = mode;
    }

    public void setPaymentsConfiguration(
            final com.commercetools.checkout.models.application.PaymentsConfiguration paymentsConfiguration) {
        this.paymentsConfiguration = paymentsConfiguration;
    }

    public void setAgreements(final com.commercetools.checkout.models.application.ApplicationAgreement... agreements) {
        this.agreements = new ArrayList<>(Arrays.asList(agreements));
    }

    public void setAgreements(
            final java.util.List<com.commercetools.checkout.models.application.ApplicationAgreement> agreements) {
        this.agreements = agreements;
    }

    public void setDiscountsConfiguration(
            final com.commercetools.checkout.models.application.DiscountsConfiguration discountsConfiguration) {
        this.discountsConfiguration = discountsConfiguration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApplicationDraftImpl that = (ApplicationDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(status, that.status)
                .append(name, that.name)
                .append(description, that.description)
                .append(logo, that.logo)
                .append(countries, that.countries)
                .append(allowedOrigins, that.allowedOrigins)
                .append(mode, that.mode)
                .append(paymentsConfiguration, that.paymentsConfiguration)
                .append(agreements, that.agreements)
                .append(discountsConfiguration, that.discountsConfiguration)
                .append(key, that.key)
                .append(status, that.status)
                .append(name, that.name)
                .append(description, that.description)
                .append(logo, that.logo)
                .append(countries, that.countries)
                .append(allowedOrigins, that.allowedOrigins)
                .append(mode, that.mode)
                .append(paymentsConfiguration, that.paymentsConfiguration)
                .append(agreements, that.agreements)
                .append(discountsConfiguration, that.discountsConfiguration)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(status)
                .append(name)
                .append(description)
                .append(logo)
                .append(countries)
                .append(allowedOrigins)
                .append(mode)
                .append(paymentsConfiguration)
                .append(agreements)
                .append(discountsConfiguration)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("status", status)
                .append("name", name)
                .append("description", description)
                .append("logo", logo)
                .append("countries", countries)
                .append("allowedOrigins", allowedOrigins)
                .append("mode", mode)
                .append("paymentsConfiguration", paymentsConfiguration)
                .append("agreements", agreements)
                .append("discountsConfiguration", discountsConfiguration)
                .build();
    }

    @Override
    public ApplicationDraft copyDeep() {
        return ApplicationDraft.deepCopy(this);
    }
}
