
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
 * Application
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApplicationImpl implements Application, ModelBase {

    private String id;

    private Integer version;

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

    private java.time.ZonedDateTime createdAt;

    private com.commercetools.checkout.models.payment_integration.CreatedBy createdBy;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.checkout.models.payment_integration.LastModifiedBy lastModifiedBy;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApplicationImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Integer version,
            @JsonProperty("key") final String key,
            @JsonProperty("status") final com.commercetools.checkout.models.application.ApplicationStatus status,
            @JsonProperty("name") final String name, @JsonProperty("description") final String description,
            @JsonProperty("logo") final com.commercetools.checkout.models.application.ApplicationLogo logo,
            @JsonProperty("countries") final java.util.List<String> countries,
            @JsonProperty("allowedOrigins") final com.commercetools.checkout.models.application.AllowedOrigins allowedOrigins,
            @JsonProperty("mode") final com.commercetools.checkout.models.application.ApplicationMode mode,
            @JsonProperty("paymentsConfiguration") final com.commercetools.checkout.models.application.PaymentsConfiguration paymentsConfiguration,
            @JsonProperty("agreements") final java.util.List<com.commercetools.checkout.models.application.ApplicationAgreement> agreements,
            @JsonProperty("discountsConfiguration") final com.commercetools.checkout.models.application.DiscountsConfiguration discountsConfiguration,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("createdBy") final com.commercetools.checkout.models.payment_integration.CreatedBy createdBy,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.checkout.models.payment_integration.LastModifiedBy lastModifiedBy) {
        this.id = id;
        this.version = version;
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
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * create empty instance
     */
    public ApplicationImpl() {
    }

    /**
     *  <p>Unique identifier of the Application.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Application.</p>
     */

    public Integer getVersion() {
        return this.version;
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
     *  <p>Details of the application logo. It is required if the <code>mode = CompleteFlow</code>.</p>
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

    /**
     *  <p>Date and time (UTC) the Application was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>IDs and references that created the Application.</p>
     */

    public com.commercetools.checkout.models.payment_integration.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Date and time (UTC) the Application was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the Application.</p>
     */

    public com.commercetools.checkout.models.payment_integration.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Integer version) {
        this.version = version;
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

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setCreatedBy(final com.commercetools.checkout.models.payment_integration.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setLastModifiedBy(
            final com.commercetools.checkout.models.payment_integration.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApplicationImpl that = (ApplicationImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
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
                .append(createdAt, that.createdAt)
                .append(createdBy, that.createdBy)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(id, that.id)
                .append(version, that.version)
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
                .append(createdAt, that.createdAt)
                .append(createdBy, that.createdBy)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(key)
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
                .append(createdAt)
                .append(createdBy)
                .append(lastModifiedAt)
                .append(lastModifiedBy)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .append("key", key)
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
                .append("createdAt", createdAt)
                .append("createdBy", createdBy)
                .append("lastModifiedAt", lastModifiedAt)
                .append("lastModifiedBy", lastModifiedBy)
                .build();
    }

    @Override
    public Application copyDeep() {
        return Application.deepCopy(this);
    }
}
