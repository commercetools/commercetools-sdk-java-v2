
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DiscountCodeDraftImpl implements DiscountCodeDraft, ModelBase {

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString description;

    private String code;

    private java.util.List<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts;

    private String cartPredicate;

    private Boolean isActive;

    private Long maxApplications;

    private Long maxApplicationsPerCustomer;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private java.util.List<String> groups;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    @JsonCreator
    DiscountCodeDraftImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("code") final String code,
            @JsonProperty("cartDiscounts") final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts,
            @JsonProperty("cartPredicate") final String cartPredicate, @JsonProperty("isActive") final Boolean isActive,
            @JsonProperty("maxApplications") final Long maxApplications,
            @JsonProperty("maxApplicationsPerCustomer") final Long maxApplicationsPerCustomer,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("groups") final java.util.List<String> groups,
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil) {
        this.name = name;
        this.description = description;
        this.code = code;
        this.cartDiscounts = cartDiscounts;
        this.cartPredicate = cartPredicate;
        this.isActive = isActive;
        this.maxApplications = maxApplications;
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
        this.custom = custom;
        this.groups = groups;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
    }

    public DiscountCodeDraftImpl() {
    }

    /**
    *  <p>Name of the DiscountCode.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
    *  <p>Description of the DiscountCode.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
    *  <p>User-defined unique identifier for the DiscountCode that can be <a href="/../api/projects/carts#add-discountcode">added to the Cart</a> to apply the related <a href="ctp:api:type:CartDiscount">CartDiscounts</a>.
    *  It cannot be modified after the DiscountCode is created.</p>
    */
    public String getCode() {
        return this.code;
    }

    /**
    *  <p>Specify the CartDiscounts the Platform applies when you add the DiscountCode to the Cart.</p>
    */
    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> getCartDiscounts() {
        return this.cartDiscounts;
    }

    /**
    *  <p>DiscountCode can only be applied to Carts that match this predicate.</p>
    */
    public String getCartPredicate() {
        return this.cartPredicate;
    }

    /**
    *  <p>Only active DiscountCodes can be applied to the Cart.</p>
    */
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
    *  <p>Number of times the DiscountCode can be applied.</p>
    */
    public Long getMaxApplications() {
        return this.maxApplications;
    }

    /**
    *  <p>Number of times the DiscountCode can be applied per Customer.</p>
    */
    public Long getMaxApplicationsPerCustomer() {
        return this.maxApplicationsPerCustomer;
    }

    /**
    *  <p>Custom Fields for the DiscountCode.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
    *  <p>Groups to which the DiscountCode will belong to.</p>
    */
    public java.util.List<String> getGroups() {
        return this.groups;
    }

    /**
    *  <p>Date and time (UTC) from which the DiscountCode is effective. Must be earlier than <code>validUntil</code>.</p>
    */
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
    *  <p>Date and time (UTC) until which the DiscountCode is effective. Must be later than <code>validFrom</code>.</p>
    */
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
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
            final com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier... cartDiscounts) {
        this.cartDiscounts = new ArrayList<>(Arrays.asList(cartDiscounts));
    }

    public void setCartDiscounts(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts) {
        this.cartDiscounts = cartDiscounts;
    }

    public void setCartPredicate(final String cartPredicate) {
        this.cartPredicate = cartPredicate;
    }

    public void setIsActive(final Boolean isActive) {
        this.isActive = isActive;
    }

    public void setMaxApplications(final Long maxApplications) {
        this.maxApplications = maxApplications;
    }

    public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer) {
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
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

        DiscountCodeDraftImpl that = (DiscountCodeDraftImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(description, that.description)
                .append(code, that.code)
                .append(cartDiscounts, that.cartDiscounts)
                .append(cartPredicate, that.cartPredicate)
                .append(isActive, that.isActive)
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
        return new HashCodeBuilder(17, 37).append(name)
                .append(description)
                .append(code)
                .append(cartDiscounts)
                .append(cartPredicate)
                .append(isActive)
                .append(maxApplications)
                .append(maxApplicationsPerCustomer)
                .append(custom)
                .append(groups)
                .append(validFrom)
                .append(validUntil)
                .toHashCode();
    }

}
