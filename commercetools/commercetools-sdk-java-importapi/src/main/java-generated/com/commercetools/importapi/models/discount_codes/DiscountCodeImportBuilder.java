
package com.commercetools.importapi.models.discount_codes;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeImport discountCodeImport = DiscountCodeImport.builder()
 *             .key("{key}")
 *             .code("{code}")
 *             .plusCartDiscounts(cartDiscountsBuilder -> cartDiscountsBuilder)
 *             .isActive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeImportBuilder implements Builder<DiscountCodeImport> {

    private String key;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString description;

    private String code;

    private java.util.List<com.commercetools.importapi.models.common.CartDiscountKeyReference> cartDiscounts;

    @Nullable
    private String cartPredicate;

    private Boolean isActive;

    @Nullable
    private Long maxApplications;

    @Nullable
    private Long maxApplicationsPerCustomer;

    @Nullable
    private java.util.List<String> groups;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    @Nullable
    private com.commercetools.importapi.models.customfields.Custom custom;

    /**
     *  <p>User-defined unique identifier. If a DiscountCode with this <code>key</code> exists, it is updated with the imported data.</p>
     * @param key value to be set
     * @return Builder
     */

    public DiscountCodeImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.name</code>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public DiscountCodeImportBuilder name(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.name</code>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public DiscountCodeImportBuilder withName(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.name</code>.</p>
     * @param name value to be set
     * @return Builder
     */

    public DiscountCodeImportBuilder name(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.description</code>.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public DiscountCodeImportBuilder description(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.description</code>.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public DiscountCodeImportBuilder withDescription(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.description</code>.</p>
     * @param description value to be set
     * @return Builder
     */

    public DiscountCodeImportBuilder description(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.code</code>. This value cannot be updated. Attempting to update this value will result in an InvalidFieldsUpdate error.</p>
     * @param code value to be set
     * @return Builder
     */

    public DiscountCodeImportBuilder code(final String code) {
        this.code = code;
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.cartDiscounts</code>. If the referenced CartDiscounts do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CartDiscounts are created.</p>
     * @param cartDiscounts value to be set
     * @return Builder
     */

    public DiscountCodeImportBuilder cartDiscounts(
            final com.commercetools.importapi.models.common.CartDiscountKeyReference... cartDiscounts) {
        this.cartDiscounts = new ArrayList<>(Arrays.asList(cartDiscounts));
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.cartDiscounts</code>. If the referenced CartDiscounts do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CartDiscounts are created.</p>
     * @param cartDiscounts value to be set
     * @return Builder
     */

    public DiscountCodeImportBuilder cartDiscounts(
            final java.util.List<com.commercetools.importapi.models.common.CartDiscountKeyReference> cartDiscounts) {
        this.cartDiscounts = cartDiscounts;
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.cartDiscounts</code>. If the referenced CartDiscounts do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CartDiscounts are created.</p>
     * @param cartDiscounts value to be set
     * @return Builder
     */

    public DiscountCodeImportBuilder plusCartDiscounts(
            final com.commercetools.importapi.models.common.CartDiscountKeyReference... cartDiscounts) {
        if (this.cartDiscounts == null) {
            this.cartDiscounts = new ArrayList<>();
        }
        this.cartDiscounts.addAll(Arrays.asList(cartDiscounts));
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.cartDiscounts</code>. If the referenced CartDiscounts do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CartDiscounts are created.</p>
     * @param builder function to build the cartDiscounts value
     * @return Builder
     */

    public DiscountCodeImportBuilder plusCartDiscounts(
            Function<com.commercetools.importapi.models.common.CartDiscountKeyReferenceBuilder, com.commercetools.importapi.models.common.CartDiscountKeyReferenceBuilder> builder) {
        if (this.cartDiscounts == null) {
            this.cartDiscounts = new ArrayList<>();
        }
        this.cartDiscounts.add(
            builder.apply(com.commercetools.importapi.models.common.CartDiscountKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.cartDiscounts</code>. If the referenced CartDiscounts do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CartDiscounts are created.</p>
     * @param builder function to build the cartDiscounts value
     * @return Builder
     */

    public DiscountCodeImportBuilder withCartDiscounts(
            Function<com.commercetools.importapi.models.common.CartDiscountKeyReferenceBuilder, com.commercetools.importapi.models.common.CartDiscountKeyReferenceBuilder> builder) {
        this.cartDiscounts = new ArrayList<>();
        this.cartDiscounts.add(
            builder.apply(com.commercetools.importapi.models.common.CartDiscountKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.cartDiscounts</code>. If the referenced CartDiscounts do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CartDiscounts are created.</p>
     * @param builder function to build the cartDiscounts value
     * @return Builder
     */

    public DiscountCodeImportBuilder addCartDiscounts(
            Function<com.commercetools.importapi.models.common.CartDiscountKeyReferenceBuilder, com.commercetools.importapi.models.common.CartDiscountKeyReference> builder) {
        return plusCartDiscounts(
            builder.apply(com.commercetools.importapi.models.common.CartDiscountKeyReferenceBuilder.of()));
    }

    /**
     *  <p>Maps to <code>DiscountCode.cartDiscounts</code>. If the referenced CartDiscounts do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CartDiscounts are created.</p>
     * @param builder function to build the cartDiscounts value
     * @return Builder
     */

    public DiscountCodeImportBuilder setCartDiscounts(
            Function<com.commercetools.importapi.models.common.CartDiscountKeyReferenceBuilder, com.commercetools.importapi.models.common.CartDiscountKeyReference> builder) {
        return cartDiscounts(
            builder.apply(com.commercetools.importapi.models.common.CartDiscountKeyReferenceBuilder.of()));
    }

    /**
     *  <p>Maps to <code>DiscountCode.cartPredicate</code>.</p>
     * @param cartPredicate value to be set
     * @return Builder
     */

    public DiscountCodeImportBuilder cartPredicate(@Nullable final String cartPredicate) {
        this.cartPredicate = cartPredicate;
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.isActive</code>.</p>
     * @param isActive value to be set
     * @return Builder
     */

    public DiscountCodeImportBuilder isActive(final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.maxApplications</code>.</p>
     * @param maxApplications value to be set
     * @return Builder
     */

    public DiscountCodeImportBuilder maxApplications(@Nullable final Long maxApplications) {
        this.maxApplications = maxApplications;
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.maxApplicationsPerCustomer</code>.</p>
     * @param maxApplicationsPerCustomer value to be set
     * @return Builder
     */

    public DiscountCodeImportBuilder maxApplicationsPerCustomer(@Nullable final Long maxApplicationsPerCustomer) {
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.groups</code>.</p>
     * @param groups value to be set
     * @return Builder
     */

    public DiscountCodeImportBuilder groups(@Nullable final String... groups) {
        this.groups = new ArrayList<>(Arrays.asList(groups));
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.groups</code>.</p>
     * @param groups value to be set
     * @return Builder
     */

    public DiscountCodeImportBuilder groups(@Nullable final java.util.List<String> groups) {
        this.groups = groups;
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.groups</code>.</p>
     * @param groups value to be set
     * @return Builder
     */

    public DiscountCodeImportBuilder plusGroups(@Nullable final String... groups) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.addAll(Arrays.asList(groups));
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.validFrom</code>.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public DiscountCodeImportBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.validUntil</code>.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public DiscountCodeImportBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.custom</code>.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public DiscountCodeImportBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.custom</code>.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public DiscountCodeImportBuilder withCustom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.Custom> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCode.custom</code>.</p>
     * @param custom value to be set
     * @return Builder
     */

    public DiscountCodeImportBuilder custom(
            @Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined unique identifier. If a DiscountCode with this <code>key</code> exists, it is updated with the imported data.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Maps to <code>DiscountCode.name</code>.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Maps to <code>DiscountCode.description</code>.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Maps to <code>DiscountCode.code</code>. This value cannot be updated. Attempting to update this value will result in an InvalidFieldsUpdate error.</p>
     * @return code
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Maps to <code>DiscountCode.cartDiscounts</code>. If the referenced CartDiscounts do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CartDiscounts are created.</p>
     * @return cartDiscounts
     */

    public java.util.List<com.commercetools.importapi.models.common.CartDiscountKeyReference> getCartDiscounts() {
        return this.cartDiscounts;
    }

    /**
     *  <p>Maps to <code>DiscountCode.cartPredicate</code>.</p>
     * @return cartPredicate
     */

    @Nullable
    public String getCartPredicate() {
        return this.cartPredicate;
    }

    /**
     *  <p>Maps to <code>DiscountCode.isActive</code>.</p>
     * @return isActive
     */

    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     *  <p>Maps to <code>DiscountCode.maxApplications</code>.</p>
     * @return maxApplications
     */

    @Nullable
    public Long getMaxApplications() {
        return this.maxApplications;
    }

    /**
     *  <p>Maps to <code>DiscountCode.maxApplicationsPerCustomer</code>.</p>
     * @return maxApplicationsPerCustomer
     */

    @Nullable
    public Long getMaxApplicationsPerCustomer() {
        return this.maxApplicationsPerCustomer;
    }

    /**
     *  <p>Maps to <code>DiscountCode.groups</code>.</p>
     * @return groups
     */

    @Nullable
    public java.util.List<String> getGroups() {
        return this.groups;
    }

    /**
     *  <p>Maps to <code>DiscountCode.validFrom</code>.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Maps to <code>DiscountCode.validUntil</code>.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Maps to <code>DiscountCode.custom</code>.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    /**
     * builds DiscountCodeImport with checking for non-null required values
     * @return DiscountCodeImport
     */
    public DiscountCodeImport build() {
        Objects.requireNonNull(key, DiscountCodeImport.class + ": key is missing");
        Objects.requireNonNull(code, DiscountCodeImport.class + ": code is missing");
        Objects.requireNonNull(cartDiscounts, DiscountCodeImport.class + ": cartDiscounts is missing");
        Objects.requireNonNull(isActive, DiscountCodeImport.class + ": isActive is missing");
        return new DiscountCodeImportImpl(key, name, description, code, cartDiscounts, cartPredicate, isActive,
            maxApplications, maxApplicationsPerCustomer, groups, validFrom, validUntil, custom);
    }

    /**
     * builds DiscountCodeImport without checking for non-null required values
     * @return DiscountCodeImport
     */
    public DiscountCodeImport buildUnchecked() {
        return new DiscountCodeImportImpl(key, name, description, code, cartDiscounts, cartPredicate, isActive,
            maxApplications, maxApplicationsPerCustomer, groups, validFrom, validUntil, custom);
    }

    /**
     * factory method for an instance of DiscountCodeImportBuilder
     * @return builder
     */
    public static DiscountCodeImportBuilder of() {
        return new DiscountCodeImportBuilder();
    }

    /**
     * create builder for DiscountCodeImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeImportBuilder of(final DiscountCodeImport template) {
        DiscountCodeImportBuilder builder = new DiscountCodeImportBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.code = template.getCode();
        builder.cartDiscounts = template.getCartDiscounts();
        builder.cartPredicate = template.getCartPredicate();
        builder.isActive = template.getIsActive();
        builder.maxApplications = template.getMaxApplications();
        builder.maxApplicationsPerCustomer = template.getMaxApplicationsPerCustomer();
        builder.groups = template.getGroups();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.custom = template.getCustom();
        return builder;
    }

}
