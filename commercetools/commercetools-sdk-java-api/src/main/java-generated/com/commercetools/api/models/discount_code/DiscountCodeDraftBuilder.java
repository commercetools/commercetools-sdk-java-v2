
package com.commercetools.api.models.discount_code;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeDraftBuilder {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private String code;

    private java.util.List<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts;

    @Nullable
    private String cartPredicate;

    @Nullable
    private Boolean isActive;

    @Nullable
    private Long maxApplications;

    @Nullable
    private Long maxApplicationsPerCustomer;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private java.util.List<String> groups;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    public DiscountCodeDraftBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public DiscountCodeDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public DiscountCodeDraftBuilder code(final String code) {
        this.code = code;
        return this;
    }

    public DiscountCodeDraftBuilder cartDiscounts(
            final com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier... cartDiscounts) {
        this.cartDiscounts = new ArrayList<>(Arrays.asList(cartDiscounts));
        return this;
    }

    public DiscountCodeDraftBuilder cartDiscounts(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts) {
        this.cartDiscounts = cartDiscounts;
        return this;
    }

    public DiscountCodeDraftBuilder cartPredicate(@Nullable final String cartPredicate) {
        this.cartPredicate = cartPredicate;
        return this;
    }

    public DiscountCodeDraftBuilder isActive(@Nullable final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public DiscountCodeDraftBuilder maxApplications(@Nullable final Long maxApplications) {
        this.maxApplications = maxApplications;
        return this;
    }

    public DiscountCodeDraftBuilder maxApplicationsPerCustomer(@Nullable final Long maxApplicationsPerCustomer) {
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
        return this;
    }

    public DiscountCodeDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public DiscountCodeDraftBuilder groups(@Nullable final String... groups) {
        this.groups = new ArrayList<>(Arrays.asList(groups));
        return this;
    }

    public DiscountCodeDraftBuilder groups(@Nullable final java.util.List<String> groups) {
        this.groups = groups;
        return this;
    }

    public DiscountCodeDraftBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public DiscountCodeDraftBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public String getCode() {
        return this.code;
    }

    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> getCartDiscounts() {
        return this.cartDiscounts;
    }

    @Nullable
    public String getCartPredicate() {
        return this.cartPredicate;
    }

    @Nullable
    public Boolean getIsActive() {
        return this.isActive;
    }

    @Nullable
    public Long getMaxApplications() {
        return this.maxApplications;
    }

    @Nullable
    public Long getMaxApplicationsPerCustomer() {
        return this.maxApplicationsPerCustomer;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public java.util.List<String> getGroups() {
        return this.groups;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    public DiscountCodeDraft build() {
        return new DiscountCodeDraftImpl(name, description, code, cartDiscounts, cartPredicate, isActive,
            maxApplications, maxApplicationsPerCustomer, custom, groups, validFrom, validUntil);
    }

    public static DiscountCodeDraftBuilder of() {
        return new DiscountCodeDraftBuilder();
    }

    public static DiscountCodeDraftBuilder of(final DiscountCodeDraft template) {
        DiscountCodeDraftBuilder builder = new DiscountCodeDraftBuilder();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.code = template.getCode();
        builder.cartDiscounts = template.getCartDiscounts();
        builder.cartPredicate = template.getCartPredicate();
        builder.isActive = template.getIsActive();
        builder.maxApplications = template.getMaxApplications();
        builder.maxApplicationsPerCustomer = template.getMaxApplicationsPerCustomer();
        builder.custom = template.getCustom();
        builder.groups = template.getGroups();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
