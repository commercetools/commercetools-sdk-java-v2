
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeImpl implements DiscountCode {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString description;

    private String code;

    private java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> cartDiscounts;

    private String cartPredicate;

    private Boolean isActive;

    private java.util.List<com.commercetools.api.models.common.Reference> references;

    private Long maxApplications;

    private Long maxApplicationsPerCustomer;

    private com.commercetools.api.models.type.CustomFields custom;

    private java.util.List<String> groups;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    @JsonCreator
    DiscountCodeImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("code") final String code,
            @JsonProperty("cartDiscounts") final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> cartDiscounts,
            @JsonProperty("cartPredicate") final String cartPredicate, @JsonProperty("isActive") final Boolean isActive,
            @JsonProperty("references") final java.util.List<com.commercetools.api.models.common.Reference> references,
            @JsonProperty("maxApplications") final Long maxApplications,
            @JsonProperty("maxApplicationsPerCustomer") final Long maxApplicationsPerCustomer,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("groups") final java.util.List<String> groups,
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.name = name;
        this.description = description;
        this.code = code;
        this.cartDiscounts = cartDiscounts;
        this.cartPredicate = cartPredicate;
        this.isActive = isActive;
        this.references = references;
        this.maxApplications = maxApplications;
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
        this.custom = custom;
        this.groups = groups;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
    }

    public DiscountCodeImpl() {
    }

    /**
    *  <p>The unique ID of the discount code.</p>
    */
    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
    *  <p>Present on resources created after 2019-02-01 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
    *  <p>Present on resources created after 2019-02-01 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
    *  <p>Unique identifier of this discount code.
    *  This value is added to the cart
    *  to enable the related cart discounts in the cart.</p>
    */
    public String getCode() {
        return this.code;
    }

    /**
    *  <p>The referenced matching cart discounts can be applied to the cart once the DiscountCode is added.</p>
    */
    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> getCartDiscounts() {
        return this.cartDiscounts;
    }

    /**
    *  <p>The discount code can only be applied to carts that match this predicate.</p>
    */
    public String getCartPredicate() {
        return this.cartPredicate;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
    *  <p>The platform will generate this array from the cart predicate.
    *  It contains the references of all the resources that are addressed in the predicate.</p>
    */
    public java.util.List<com.commercetools.api.models.common.Reference> getReferences() {
        return this.references;
    }

    /**
    *  <p>The discount code can only be applied <code>maxApplications</code> times.</p>
    */
    public Long getMaxApplications() {
        return this.maxApplications;
    }

    /**
    *  <p>The discount code can only be applied <code>maxApplicationsPerCustomer</code> times per customer.</p>
    */
    public Long getMaxApplicationsPerCustomer() {
        return this.maxApplicationsPerCustomer;
    }

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
    *  <p>The groups to which this discount code belong.</p>
    */
    public java.util.List<String> getGroups() {
        return this.groups;
    }

    /**
    *  <p>The time from which the discount can be applied on a cart.
    *  Before that time the code is invalid.</p>
    */
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
    *  <p>The time until the discount can be applied on a cart.
    *  After that time the code is invalid.</p>
    */
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public void setCartDiscounts(
            final com.commercetools.api.models.cart_discount.CartDiscountReference... cartDiscounts) {
        this.cartDiscounts = new ArrayList<>(Arrays.asList(cartDiscounts));
    }

    public void setCartDiscounts(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> cartDiscounts) {
        this.cartDiscounts = cartDiscounts;
    }

    public void setCartPredicate(final String cartPredicate) {
        this.cartPredicate = cartPredicate;
    }

    public void setIsActive(final Boolean isActive) {
        this.isActive = isActive;
    }

    public void setReferences(final com.commercetools.api.models.common.Reference... references) {
        this.references = new ArrayList<>(Arrays.asList(references));
    }

    public void setReferences(final java.util.List<com.commercetools.api.models.common.Reference> references) {
        this.references = references;
    }

    public void setMaxApplications(final Long maxApplications) {
        this.maxApplications = maxApplications;
    }

    public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer) {
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setGroups(final String... groups) {
        this.groups = new ArrayList<>(Arrays.asList(groups));
    }

    public void setGroups(final java.util.List<String> groups) {
        this.groups = groups;
    }

    public void setValidFrom(final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public void setValidUntil(final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountCodeImpl that = (DiscountCodeImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(name, that.name)
                .append(description, that.description)
                .append(code, that.code)
                .append(cartDiscounts, that.cartDiscounts)
                .append(cartPredicate, that.cartPredicate)
                .append(isActive, that.isActive)
                .append(references, that.references)
                .append(maxApplications, that.maxApplications)
                .append(maxApplicationsPerCustomer, that.maxApplicationsPerCustomer)
                .append(custom, that.custom)
                .append(groups, that.groups)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(lastModifiedBy)
                .append(createdBy)
                .append(name)
                .append(description)
                .append(code)
                .append(cartDiscounts)
                .append(cartPredicate)
                .append(isActive)
                .append(references)
                .append(maxApplications)
                .append(maxApplicationsPerCustomer)
                .append(custom)
                .append(groups)
                .append(validFrom)
                .append(validUntil)
                .toHashCode();
    }

}
