
package com.commercetools.api.models.discount_code;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCode discountCode = DiscountCode.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .code("{code}")
 *             .plusCartDiscounts(cartDiscountsBuilder -> cartDiscountsBuilder)
 *             .isActive(true)
 *             .plusReferences(referencesBuilder -> referencesBuilder)
 *             .plusGroups(groupsBuilder -> groupsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeBuilder implements Builder<DiscountCode> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private String code;

    private java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> cartDiscounts;

    @Nullable
    private String cartPredicate;

    private Boolean isActive;

    private java.util.List<com.commercetools.api.models.common.Reference> references;

    @Nullable
    private Long maxApplications;

    @Nullable
    private Long maxApplicationsPerCustomer;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    private java.util.List<String> groups;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    @Nullable
    private Long applicationVersion;

    /**
     *  <p>Unique identifier of the DiscountCode.</p>
     * @param id value to be set
     * @return Builder
     */

    public DiscountCodeBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the DiscountCode.</p>
     * @param version value to be set
     * @return Builder
     */

    public DiscountCodeBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the DiscountCode was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public DiscountCodeBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the DiscountCode was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public DiscountCodeBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public DiscountCodeBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public DiscountCodeBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public DiscountCodeBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public DiscountCodeBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Name of the DiscountCode.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public DiscountCodeBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the DiscountCode.</p>
     * @param name value to be set
     * @return Builder
     */

    public DiscountCodeBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the DiscountCode.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public DiscountCodeBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the DiscountCode.</p>
     * @param description value to be set
     * @return Builder
     */

    public DiscountCodeBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the DiscountCode added to the Cart to apply the related CartDiscounts.</p>
     * @param code value to be set
     * @return Builder
     */

    public DiscountCodeBuilder code(final String code) {
        this.code = code;
        return this;
    }

    /**
     *  <p>Reference to CartDiscounts that can be applied to the Cart once the DiscountCode is applied.</p>
     * @param cartDiscounts value to be set
     * @return Builder
     */

    public DiscountCodeBuilder cartDiscounts(
            final com.commercetools.api.models.cart_discount.CartDiscountReference... cartDiscounts) {
        this.cartDiscounts = new ArrayList<>(Arrays.asList(cartDiscounts));
        return this;
    }

    /**
     *  <p>Reference to CartDiscounts that can be applied to the Cart once the DiscountCode is applied.</p>
     * @param cartDiscounts value to be set
     * @return Builder
     */

    public DiscountCodeBuilder cartDiscounts(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> cartDiscounts) {
        this.cartDiscounts = cartDiscounts;
        return this;
    }

    /**
     *  <p>Reference to CartDiscounts that can be applied to the Cart once the DiscountCode is applied.</p>
     * @param cartDiscounts value to be set
     * @return Builder
     */

    public DiscountCodeBuilder plusCartDiscounts(
            final com.commercetools.api.models.cart_discount.CartDiscountReference... cartDiscounts) {
        if (this.cartDiscounts == null) {
            this.cartDiscounts = new ArrayList<>();
        }
        this.cartDiscounts.addAll(Arrays.asList(cartDiscounts));
        return this;
    }

    /**
     *  <p>Reference to CartDiscounts that can be applied to the Cart once the DiscountCode is applied.</p>
     * @param builder function to build the cartDiscounts value
     * @return Builder
     */

    public DiscountCodeBuilder plusCartDiscounts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder, com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder> builder) {
        if (this.cartDiscounts == null) {
            this.cartDiscounts = new ArrayList<>();
        }
        this.cartDiscounts.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Reference to CartDiscounts that can be applied to the Cart once the DiscountCode is applied.</p>
     * @param builder function to build the cartDiscounts value
     * @return Builder
     */

    public DiscountCodeBuilder withCartDiscounts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder, com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder> builder) {
        this.cartDiscounts = new ArrayList<>();
        this.cartDiscounts.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>DiscountCode can only be applied to Carts that match this predicate.</p>
     * @param cartPredicate value to be set
     * @return Builder
     */

    public DiscountCodeBuilder cartPredicate(@Nullable final String cartPredicate) {
        this.cartPredicate = cartPredicate;
        return this;
    }

    /**
     *  <p>Indicates if the DiscountCode is active and can be applied to the Cart.</p>
     * @param isActive value to be set
     * @return Builder
     */

    public DiscountCodeBuilder isActive(final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     *  <p>Array generated from the Cart predicate. It contains the references of all the resources that are addressed in the predicate.</p>
     * @param references value to be set
     * @return Builder
     */

    public DiscountCodeBuilder references(final com.commercetools.api.models.common.Reference... references) {
        this.references = new ArrayList<>(Arrays.asList(references));
        return this;
    }

    /**
     *  <p>Array generated from the Cart predicate. It contains the references of all the resources that are addressed in the predicate.</p>
     * @param references value to be set
     * @return Builder
     */

    public DiscountCodeBuilder references(
            final java.util.List<com.commercetools.api.models.common.Reference> references) {
        this.references = references;
        return this;
    }

    /**
     *  <p>Array generated from the Cart predicate. It contains the references of all the resources that are addressed in the predicate.</p>
     * @param references value to be set
     * @return Builder
     */

    public DiscountCodeBuilder plusReferences(final com.commercetools.api.models.common.Reference... references) {
        if (this.references == null) {
            this.references = new ArrayList<>();
        }
        this.references.addAll(Arrays.asList(references));
        return this;
    }

    /**
     *  <p>Array generated from the Cart predicate. It contains the references of all the resources that are addressed in the predicate.</p>
     * @param builder function to build the references value
     * @return Builder
     */

    public DiscountCodeBuilder plusReferences(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        if (this.references == null) {
            this.references = new ArrayList<>();
        }
        this.references.add(builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Array generated from the Cart predicate. It contains the references of all the resources that are addressed in the predicate.</p>
     * @param builder function to build the references value
     * @return Builder
     */

    public DiscountCodeBuilder withReferences(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.references = new ArrayList<>();
        this.references.add(builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Number of times the DiscountCode can be applied. DiscountCode application is counted at the time of Order creation or edit. However, Order cancellation or deletion does not decrement the count.</p>
     * @param maxApplications value to be set
     * @return Builder
     */

    public DiscountCodeBuilder maxApplications(@Nullable final Long maxApplications) {
        this.maxApplications = maxApplications;
        return this;
    }

    /**
     *  <p>Number of times the DiscountCode can be applied per Customer (anonymous Carts are not supported). DiscountCode application is counted at the time of Order creation or edit. However, Order cancellation or deletion does not decrement the count.</p>
     * @param maxApplicationsPerCustomer value to be set
     * @return Builder
     */

    public DiscountCodeBuilder maxApplicationsPerCustomer(@Nullable final Long maxApplicationsPerCustomer) {
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
        return this;
    }

    /**
     *  <p>Custom Fields of the DiscountCode.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public DiscountCodeBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the DiscountCode.</p>
     * @param custom value to be set
     * @return Builder
     */

    public DiscountCodeBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Groups to which the DiscountCode belongs to.</p>
     * @param groups value to be set
     * @return Builder
     */

    public DiscountCodeBuilder groups(final String... groups) {
        this.groups = new ArrayList<>(Arrays.asList(groups));
        return this;
    }

    /**
     *  <p>Groups to which the DiscountCode belongs to.</p>
     * @param groups value to be set
     * @return Builder
     */

    public DiscountCodeBuilder groups(final java.util.List<String> groups) {
        this.groups = groups;
        return this;
    }

    /**
     *  <p>Groups to which the DiscountCode belongs to.</p>
     * @param groups value to be set
     * @return Builder
     */

    public DiscountCodeBuilder plusGroups(final String... groups) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.addAll(Arrays.asList(groups));
        return this;
    }

    /**
     *  <p>Date and time (UTC) from which the DiscountCode is effective.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public DiscountCodeBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Date and time (UTC) until which the DiscountCode is effective.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public DiscountCodeBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Used and managed by the API and must not be used in customer logic. The value can change at any time due to internal and external factors.</p>
     * @param applicationVersion value to be set
     * @return Builder
     */

    public DiscountCodeBuilder applicationVersion(@Nullable final Long applicationVersion) {
        this.applicationVersion = applicationVersion;
        return this;
    }

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

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
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

    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> getCartDiscounts() {
        return this.cartDiscounts;
    }

    @Nullable
    public String getCartPredicate() {
        return this.cartPredicate;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public java.util.List<com.commercetools.api.models.common.Reference> getReferences() {
        return this.references;
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
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

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

    @Nullable
    public Long getApplicationVersion() {
        return this.applicationVersion;
    }

    /**
     * builds DiscountCode with checking for non-null required values
     * @return DiscountCode
     */
    public DiscountCode build() {
        Objects.requireNonNull(id, DiscountCode.class + ": id is missing");
        Objects.requireNonNull(version, DiscountCode.class + ": version is missing");
        Objects.requireNonNull(createdAt, DiscountCode.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, DiscountCode.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(code, DiscountCode.class + ": code is missing");
        Objects.requireNonNull(cartDiscounts, DiscountCode.class + ": cartDiscounts is missing");
        Objects.requireNonNull(isActive, DiscountCode.class + ": isActive is missing");
        Objects.requireNonNull(references, DiscountCode.class + ": references is missing");
        Objects.requireNonNull(groups, DiscountCode.class + ": groups is missing");
        return new DiscountCodeImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name,
            description, code, cartDiscounts, cartPredicate, isActive, references, maxApplications,
            maxApplicationsPerCustomer, custom, groups, validFrom, validUntil, applicationVersion);
    }

    /**
     * builds DiscountCode without checking for non-null required values
     * @return DiscountCode
     */
    public DiscountCode buildUnchecked() {
        return new DiscountCodeImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name,
            description, code, cartDiscounts, cartPredicate, isActive, references, maxApplications,
            maxApplicationsPerCustomer, custom, groups, validFrom, validUntil, applicationVersion);
    }

    public static DiscountCodeBuilder of() {
        return new DiscountCodeBuilder();
    }

    public static DiscountCodeBuilder of(final DiscountCode template) {
        DiscountCodeBuilder builder = new DiscountCodeBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.code = template.getCode();
        builder.cartDiscounts = template.getCartDiscounts();
        builder.cartPredicate = template.getCartPredicate();
        builder.isActive = template.getIsActive();
        builder.references = template.getReferences();
        builder.maxApplications = template.getMaxApplications();
        builder.maxApplicationsPerCustomer = template.getMaxApplicationsPerCustomer();
        builder.custom = template.getCustom();
        builder.groups = template.getGroups();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.applicationVersion = template.getApplicationVersion();
        return builder;
    }

}
