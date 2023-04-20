
package com.commercetools.api.models.discount_code;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeDraft discountCodeDraft = DiscountCodeDraft.builder()
 *             .code("{code}")
 *             .plusCartDiscounts(cartDiscountsBuilder -> cartDiscountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeDraftBuilder implements Builder<DiscountCodeDraft> {

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

    /**
     *  <p>Name of the DiscountCode.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public DiscountCodeDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the DiscountCode.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public DiscountCodeDraftBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the DiscountCode.</p>
     * @param name value to be set
     * @return Builder
     */

    public DiscountCodeDraftBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the DiscountCode.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public DiscountCodeDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the DiscountCode.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public DiscountCodeDraftBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the DiscountCode.</p>
     * @param description value to be set
     * @return Builder
     */

    public DiscountCodeDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the DiscountCode that can be added to the Cart to apply the related CartDiscounts. It cannot be modified after the DiscountCode is created.</p>
     * @param code value to be set
     * @return Builder
     */

    public DiscountCodeDraftBuilder code(final String code) {
        this.code = code;
        return this;
    }

    /**
     *  <p>Specify what CartDiscounts the API applies when you add the DiscountCode to the Cart.</p>
     * @param cartDiscounts value to be set
     * @return Builder
     */

    public DiscountCodeDraftBuilder cartDiscounts(
            final com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier... cartDiscounts) {
        this.cartDiscounts = new ArrayList<>(Arrays.asList(cartDiscounts));
        return this;
    }

    /**
     *  <p>Specify what CartDiscounts the API applies when you add the DiscountCode to the Cart.</p>
     * @param cartDiscounts value to be set
     * @return Builder
     */

    public DiscountCodeDraftBuilder cartDiscounts(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts) {
        this.cartDiscounts = cartDiscounts;
        return this;
    }

    /**
     *  <p>Specify what CartDiscounts the API applies when you add the DiscountCode to the Cart.</p>
     * @param cartDiscounts value to be set
     * @return Builder
     */

    public DiscountCodeDraftBuilder plusCartDiscounts(
            final com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier... cartDiscounts) {
        if (this.cartDiscounts == null) {
            this.cartDiscounts = new ArrayList<>();
        }
        this.cartDiscounts.addAll(Arrays.asList(cartDiscounts));
        return this;
    }

    /**
     *  <p>Specify what CartDiscounts the API applies when you add the DiscountCode to the Cart.</p>
     * @param builder function to build the cartDiscounts value
     * @return Builder
     */

    public DiscountCodeDraftBuilder plusCartDiscounts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder, com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder> builder) {
        if (this.cartDiscounts == null) {
            this.cartDiscounts = new ArrayList<>();
        }
        this.cartDiscounts.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Specify what CartDiscounts the API applies when you add the DiscountCode to the Cart.</p>
     * @param builder function to build the cartDiscounts value
     * @return Builder
     */

    public DiscountCodeDraftBuilder withCartDiscounts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder, com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder> builder) {
        this.cartDiscounts = new ArrayList<>();
        this.cartDiscounts.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Specify what CartDiscounts the API applies when you add the DiscountCode to the Cart.</p>
     * @param builder function to build the cartDiscounts value
     * @return Builder
     */

    public DiscountCodeDraftBuilder addCartDiscounts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder, com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> builder) {
        return plusCartDiscounts(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Specify what CartDiscounts the API applies when you add the DiscountCode to the Cart.</p>
     * @param builder function to build the cartDiscounts value
     * @return Builder
     */

    public DiscountCodeDraftBuilder setCartDiscounts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder, com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> builder) {
        return cartDiscounts(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>DiscountCode can only be applied to Carts that match this predicate.</p>
     * @param cartPredicate value to be set
     * @return Builder
     */

    public DiscountCodeDraftBuilder cartPredicate(@Nullable final String cartPredicate) {
        this.cartPredicate = cartPredicate;
        return this;
    }

    /**
     *  <p>Only active DiscountCodes can be applied to the Cart.</p>
     * @param isActive value to be set
     * @return Builder
     */

    public DiscountCodeDraftBuilder isActive(@Nullable final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     *  <p>Number of times the DiscountCode can be applied.</p>
     * @param maxApplications value to be set
     * @return Builder
     */

    public DiscountCodeDraftBuilder maxApplications(@Nullable final Long maxApplications) {
        this.maxApplications = maxApplications;
        return this;
    }

    /**
     *  <p>Number of times the DiscountCode can be applied per Customer.</p>
     * @param maxApplicationsPerCustomer value to be set
     * @return Builder
     */

    public DiscountCodeDraftBuilder maxApplicationsPerCustomer(@Nullable final Long maxApplicationsPerCustomer) {
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
        return this;
    }

    /**
     *  <p>Custom Fields for the DiscountCode.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public DiscountCodeDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the DiscountCode.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public DiscountCodeDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the DiscountCode.</p>
     * @param custom value to be set
     * @return Builder
     */

    public DiscountCodeDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Groups to which the DiscountCode will belong to.</p>
     * @param groups value to be set
     * @return Builder
     */

    public DiscountCodeDraftBuilder groups(@Nullable final String... groups) {
        this.groups = new ArrayList<>(Arrays.asList(groups));
        return this;
    }

    /**
     *  <p>Groups to which the DiscountCode will belong to.</p>
     * @param groups value to be set
     * @return Builder
     */

    public DiscountCodeDraftBuilder groups(@Nullable final java.util.List<String> groups) {
        this.groups = groups;
        return this;
    }

    /**
     *  <p>Groups to which the DiscountCode will belong to.</p>
     * @param groups value to be set
     * @return Builder
     */

    public DiscountCodeDraftBuilder plusGroups(@Nullable final String... groups) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.addAll(Arrays.asList(groups));
        return this;
    }

    /**
     *  <p>Date and time (UTC) from which the DiscountCode is effective. Must be earlier than <code>validUntil</code>.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public DiscountCodeDraftBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Date and time (UTC) until which the DiscountCode is effective. Must be later than <code>validFrom</code>.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public DiscountCodeDraftBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Name of the DiscountCode.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Description of the DiscountCode.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>User-defined unique identifier for the DiscountCode that can be added to the Cart to apply the related CartDiscounts. It cannot be modified after the DiscountCode is created.</p>
     * @return code
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Specify what CartDiscounts the API applies when you add the DiscountCode to the Cart.</p>
     * @return cartDiscounts
     */

    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> getCartDiscounts() {
        return this.cartDiscounts;
    }

    /**
     *  <p>DiscountCode can only be applied to Carts that match this predicate.</p>
     * @return cartPredicate
     */

    @Nullable
    public String getCartPredicate() {
        return this.cartPredicate;
    }

    /**
     *  <p>Only active DiscountCodes can be applied to the Cart.</p>
     * @return isActive
     */

    @Nullable
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     *  <p>Number of times the DiscountCode can be applied.</p>
     * @return maxApplications
     */

    @Nullable
    public Long getMaxApplications() {
        return this.maxApplications;
    }

    /**
     *  <p>Number of times the DiscountCode can be applied per Customer.</p>
     * @return maxApplicationsPerCustomer
     */

    @Nullable
    public Long getMaxApplicationsPerCustomer() {
        return this.maxApplicationsPerCustomer;
    }

    /**
     *  <p>Custom Fields for the DiscountCode.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Groups to which the DiscountCode will belong to.</p>
     * @return groups
     */

    @Nullable
    public java.util.List<String> getGroups() {
        return this.groups;
    }

    /**
     *  <p>Date and time (UTC) from which the DiscountCode is effective. Must be earlier than <code>validUntil</code>.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Date and time (UTC) until which the DiscountCode is effective. Must be later than <code>validFrom</code>.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     * builds DiscountCodeDraft with checking for non-null required values
     * @return DiscountCodeDraft
     */
    public DiscountCodeDraft build() {
        Objects.requireNonNull(code, DiscountCodeDraft.class + ": code is missing");
        Objects.requireNonNull(cartDiscounts, DiscountCodeDraft.class + ": cartDiscounts is missing");
        return new DiscountCodeDraftImpl(name, description, code, cartDiscounts, cartPredicate, isActive,
            maxApplications, maxApplicationsPerCustomer, custom, groups, validFrom, validUntil);
    }

    /**
     * builds DiscountCodeDraft without checking for non-null required values
     * @return DiscountCodeDraft
     */
    public DiscountCodeDraft buildUnchecked() {
        return new DiscountCodeDraftImpl(name, description, code, cartDiscounts, cartPredicate, isActive,
            maxApplications, maxApplicationsPerCustomer, custom, groups, validFrom, validUntil);
    }

    /**
     * factory method for an instance of DiscountCodeDraftBuilder
     * @return builder
     */
    public static DiscountCodeDraftBuilder of() {
        return new DiscountCodeDraftBuilder();
    }

    /**
     * create builder for DiscountCodeDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
