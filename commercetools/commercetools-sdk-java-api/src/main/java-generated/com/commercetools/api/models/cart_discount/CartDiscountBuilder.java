
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CartDiscount cartDiscount = CartDiscount.builder()
           .id("{id}")
           .version(0.3)
           .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .name(nameBuilder -> nameBuilder)
           .value(valueBuilder -> valueBuilder)
           .cartPredicate("{cartPredicate}")
           .sortOrder("{sortOrder}")
           .isActive(true)
           .requiresDiscountCode(true)
           .plusReferences(referencesBuilder -> referencesBuilder)
           .stackingMode(StackingMode.STACKING)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountBuilder implements Builder<CartDiscount> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.cart_discount.CartDiscountValue value;

    private String cartPredicate;

    @Nullable
    private com.commercetools.api.models.cart_discount.CartDiscountTarget target;

    private String sortOrder;

    private Boolean isActive;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    private Boolean requiresDiscountCode;

    private java.util.List<com.commercetools.api.models.common.Reference> references;

    private com.commercetools.api.models.cart_discount.StackingMode stackingMode;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    /**
     *  <p>Platform-generated unique identifier of the CartDiscount.</p>
     */

    public CartDiscountBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>The current version of the cart discount.</p>
     */

    public CartDiscountBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public CartDiscountBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public CartDiscountBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     */

    public CartDiscountBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     */

    public CartDiscountBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public CartDiscountBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public CartDiscountBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public CartDiscountBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public CartDiscountBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the CartDiscount.</p>
     */

    public CartDiscountBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public CartDiscountBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public CartDiscountBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public CartDiscountBuilder value(final com.commercetools.api.models.cart_discount.CartDiscountValue value) {
        this.value = value;
        return this;
    }

    public CartDiscountBuilder value(
            Function<com.commercetools.api.models.cart_discount.CartDiscountValueBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountValue>> builder) {
        this.value = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountValueBuilder.of()).build();
        return this;
    }

    /**
     *  <p>A valid Cart predicate.</p>
     */

    public CartDiscountBuilder cartPredicate(final String cartPredicate) {
        this.cartPredicate = cartPredicate;
        return this;
    }

    /**
     *  <p>Empty when the <code>value</code> has type <code>giftLineItem</code>, otherwise a CartDiscountTarget is set.</p>
     */

    public CartDiscountBuilder target(
            @Nullable final com.commercetools.api.models.cart_discount.CartDiscountTarget target) {
        this.target = target;
        return this;
    }

    /**
     *  <p>Empty when the <code>value</code> has type <code>giftLineItem</code>, otherwise a CartDiscountTarget is set.</p>
     */

    public CartDiscountBuilder target(
            Function<com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountTarget>> builder) {
        this.target = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The string must contain a number between 0 and 1. All matching cart discounts are applied to a cart in the order defined by this field. A discount with greater sort order is prioritized higher than a discount with lower sort order. The sort order is unambiguous among all cart discounts.</p>
     */

    public CartDiscountBuilder sortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     *  <p>Only active discount can be applied to the cart.</p>
     */

    public CartDiscountBuilder isActive(final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public CartDiscountBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public CartDiscountBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>States whether the discount can only be used in a connection with a DiscountCode.</p>
     */

    public CartDiscountBuilder requiresDiscountCode(final Boolean requiresDiscountCode) {
        this.requiresDiscountCode = requiresDiscountCode;
        return this;
    }

    /**
     *  <p>The platform will generate this array from the predicate. It contains the references of all the resources that are addressed in the predicate.</p>
     */

    public CartDiscountBuilder references(final com.commercetools.api.models.common.Reference... references) {
        this.references = new ArrayList<>(Arrays.asList(references));
        return this;
    }

    /**
     *  <p>The platform will generate this array from the predicate. It contains the references of all the resources that are addressed in the predicate.</p>
     */

    public CartDiscountBuilder references(
            final java.util.List<com.commercetools.api.models.common.Reference> references) {
        this.references = references;
        return this;
    }

    /**
     *  <p>The platform will generate this array from the predicate. It contains the references of all the resources that are addressed in the predicate.</p>
     */

    public CartDiscountBuilder plusReferences(final com.commercetools.api.models.common.Reference... references) {
        if (this.references == null) {
            this.references = new ArrayList<>();
        }
        this.references.addAll(Arrays.asList(references));
        return this;
    }

    /**
     *  <p>The platform will generate this array from the predicate. It contains the references of all the resources that are addressed in the predicate.</p>
     */

    public CartDiscountBuilder plusReferences(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        if (this.references == null) {
            this.references = new ArrayList<>();
        }
        this.references.add(builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The platform will generate this array from the predicate. It contains the references of all the resources that are addressed in the predicate.</p>
     */

    public CartDiscountBuilder withReferences(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.references = new ArrayList<>();
        this.references.add(builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Specifies whether the application of this discount causes the following discounts to be ignored. Defaults to Stacking.</p>
     */

    public CartDiscountBuilder stackingMode(
            final com.commercetools.api.models.cart_discount.StackingMode stackingMode) {
        this.stackingMode = stackingMode;
        return this;
    }

    public CartDiscountBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    public CartDiscountBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
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

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public com.commercetools.api.models.cart_discount.CartDiscountValue getValue() {
        return this.value;
    }

    public String getCartPredicate() {
        return this.cartPredicate;
    }

    @Nullable
    public com.commercetools.api.models.cart_discount.CartDiscountTarget getTarget() {
        return this.target;
    }

    public String getSortOrder() {
        return this.sortOrder;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    public Boolean getRequiresDiscountCode() {
        return this.requiresDiscountCode;
    }

    public java.util.List<com.commercetools.api.models.common.Reference> getReferences() {
        return this.references;
    }

    public com.commercetools.api.models.cart_discount.StackingMode getStackingMode() {
        return this.stackingMode;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public CartDiscount build() {
        Objects.requireNonNull(id, CartDiscount.class + ": id is missing");
        Objects.requireNonNull(version, CartDiscount.class + ": version is missing");
        Objects.requireNonNull(createdAt, CartDiscount.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, CartDiscount.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(name, CartDiscount.class + ": name is missing");
        Objects.requireNonNull(value, CartDiscount.class + ": value is missing");
        Objects.requireNonNull(cartPredicate, CartDiscount.class + ": cartPredicate is missing");
        Objects.requireNonNull(sortOrder, CartDiscount.class + ": sortOrder is missing");
        Objects.requireNonNull(isActive, CartDiscount.class + ": isActive is missing");
        Objects.requireNonNull(requiresDiscountCode, CartDiscount.class + ": requiresDiscountCode is missing");
        Objects.requireNonNull(references, CartDiscount.class + ": references is missing");
        Objects.requireNonNull(stackingMode, CartDiscount.class + ": stackingMode is missing");
        return new CartDiscountImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name, key,
            description, value, cartPredicate, target, sortOrder, isActive, validFrom, validUntil, requiresDiscountCode,
            references, stackingMode, custom);
    }

    /**
     * builds CartDiscount without checking for non null required values
     */
    public CartDiscount buildUnchecked() {
        return new CartDiscountImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name, key,
            description, value, cartPredicate, target, sortOrder, isActive, validFrom, validUntil, requiresDiscountCode,
            references, stackingMode, custom);
    }

    public static CartDiscountBuilder of() {
        return new CartDiscountBuilder();
    }

    public static CartDiscountBuilder of(final CartDiscount template) {
        CartDiscountBuilder builder = new CartDiscountBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.name = template.getName();
        builder.key = template.getKey();
        builder.description = template.getDescription();
        builder.value = template.getValue();
        builder.cartPredicate = template.getCartPredicate();
        builder.target = template.getTarget();
        builder.sortOrder = template.getSortOrder();
        builder.isActive = template.getIsActive();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.requiresDiscountCode = template.getRequiresDiscountCode();
        builder.references = template.getReferences();
        builder.stackingMode = template.getStackingMode();
        builder.custom = template.getCustom();
        return builder;
    }

}
