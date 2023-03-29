
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscount
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscount cartDiscount = CartDiscount.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name(nameBuilder -> nameBuilder)
 *             .value(valueBuilder -> valueBuilder)
 *             .cartPredicate("{cartPredicate}")
 *             .sortOrder("{sortOrder}")
 *             .isActive(true)
 *             .requiresDiscountCode(true)
 *             .plusReferences(referencesBuilder -> referencesBuilder)
 *             .stackingMode(StackingMode.STACKING)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountImpl.class)
public interface CartDiscount
        extends BaseResource, CartDiscountMixin, com.commercetools.api.models.DomainResource<CartDiscount>,
        com.commercetools.api.models.Referencable<CartDiscount>,
        com.commercetools.api.models.ResourceIdentifiable<CartDiscount>,
        com.commercetools.api.models.Customizable<CartDiscount>, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the CartDiscount.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the CartDiscount.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) for the CartDiscount was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) for the CartDiscount was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Name of the CartDiscount.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>User-defined unique identifier of the CartDiscount.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Description of the CartDiscount.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Effect of the CartDiscount.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public CartDiscountValue getValue();

    /**
     *  <p>Valid Cart Predicate.</p>
     * @return cartPredicate
     */
    @NotNull
    @JsonProperty("cartPredicate")
    public String getCartPredicate();

    /**
     *  <p>Sets a CartDiscountTarget. Empty if <code>value</code> has type <code>giftLineItem</code>.</p>
     * @return target
     */
    @Valid
    @JsonProperty("target")
    public CartDiscountTarget getTarget();

    /**
     *  <p>Value between <code>0</code> and <code>1</code>. All matching CartDiscounts are applied to a Cart in the order defined by this field. A Discount with a higher sortOrder is prioritized. The sort order is unambiguous among all CartDiscounts.</p>
     * @return sortOrder
     */
    @NotNull
    @JsonProperty("sortOrder")
    public String getSortOrder();

    /**
     *  <p>Indicates if the CartDiscount is active and can be applied to the Cart.</p>
     * @return isActive
     */
    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
     *  <p>Date and time (UTC) from which the Discount is effective.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Date and time (UTC) until which the Discount is effective.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Indicates if the Discount can be used in connection with a DiscountCode.</p>
     * @return requiresDiscountCode
     */
    @NotNull
    @JsonProperty("requiresDiscountCode")
    public Boolean getRequiresDiscountCode();

    /**
     *  <p>References of all resources that are addressed in the predicate. The API generates this array from the predicate.</p>
     * @return references
     */
    @NotNull
    @Valid
    @JsonProperty("references")
    public List<Reference> getReferences();

    /**
     *  <p>Indicates whether the application of the CartDiscount causes other discounts to be ignored.</p>
     * @return stackingMode
     */
    @NotNull
    @JsonProperty("stackingMode")
    public StackingMode getStackingMode();

    /**
     *  <p>Custom Fields of the CartDiscount.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Unique identifier of the CartDiscount.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the CartDiscount.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) for the CartDiscount was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) for the CartDiscount was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>Name of the CartDiscount.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>User-defined unique identifier of the CartDiscount.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Description of the CartDiscount.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Effect of the CartDiscount.</p>
     * @param value value to be set
     */

    public void setValue(final CartDiscountValue value);

    /**
     *  <p>Valid Cart Predicate.</p>
     * @param cartPredicate value to be set
     */

    public void setCartPredicate(final String cartPredicate);

    /**
     *  <p>Sets a CartDiscountTarget. Empty if <code>value</code> has type <code>giftLineItem</code>.</p>
     * @param target value to be set
     */

    public void setTarget(final CartDiscountTarget target);

    /**
     *  <p>Value between <code>0</code> and <code>1</code>. All matching CartDiscounts are applied to a Cart in the order defined by this field. A Discount with a higher sortOrder is prioritized. The sort order is unambiguous among all CartDiscounts.</p>
     * @param sortOrder value to be set
     */

    public void setSortOrder(final String sortOrder);

    /**
     *  <p>Indicates if the CartDiscount is active and can be applied to the Cart.</p>
     * @param isActive value to be set
     */

    public void setIsActive(final Boolean isActive);

    /**
     *  <p>Date and time (UTC) from which the Discount is effective.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Date and time (UTC) until which the Discount is effective.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     *  <p>Indicates if the Discount can be used in connection with a DiscountCode.</p>
     * @param requiresDiscountCode value to be set
     */

    public void setRequiresDiscountCode(final Boolean requiresDiscountCode);

    /**
     *  <p>References of all resources that are addressed in the predicate. The API generates this array from the predicate.</p>
     * @param references values to be set
     */

    @JsonIgnore
    public void setReferences(final Reference... references);

    /**
     *  <p>References of all resources that are addressed in the predicate. The API generates this array from the predicate.</p>
     * @param references values to be set
     */

    public void setReferences(final List<Reference> references);

    /**
     *  <p>Indicates whether the application of the CartDiscount causes other discounts to be ignored.</p>
     * @param stackingMode value to be set
     */

    public void setStackingMode(final StackingMode stackingMode);

    /**
     *  <p>Custom Fields of the CartDiscount.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * factory method
     * @return instance of CartDiscount
     */
    public static CartDiscount of() {
        return new CartDiscountImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscount
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscount of(final CartDiscount template) {
        CartDiscountImpl instance = new CartDiscountImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setName(template.getName());
        instance.setKey(template.getKey());
        instance.setDescription(template.getDescription());
        instance.setValue(template.getValue());
        instance.setCartPredicate(template.getCartPredicate());
        instance.setTarget(template.getTarget());
        instance.setSortOrder(template.getSortOrder());
        instance.setIsActive(template.getIsActive());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setRequiresDiscountCode(template.getRequiresDiscountCode());
        instance.setReferences(template.getReferences());
        instance.setStackingMode(template.getStackingMode());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscount
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscount deepCopy(@Nullable final CartDiscount template) {
        if (template == null) {
            return null;
        }
        CartDiscountImpl instance = new CartDiscountImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
        instance.setName(Optional.ofNullable(template.getName())
                .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setKey(template.getKey());
        instance.setDescription(Optional.ofNullable(template.getDescription())
                .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setValue(Optional.ofNullable(template.getValue())
                .map(com.commercetools.api.models.cart_discount.CartDiscountValue::deepCopy)
                .orElse(null));
        instance.setCartPredicate(template.getCartPredicate());
        instance.setTarget(Optional.ofNullable(template.getTarget())
                .map(com.commercetools.api.models.cart_discount.CartDiscountTarget::deepCopy)
                .orElse(null));
        instance.setSortOrder(template.getSortOrder());
        instance.setIsActive(template.getIsActive());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setRequiresDiscountCode(template.getRequiresDiscountCode());
        instance.setReferences(Optional.ofNullable(template.getReferences())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Reference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setStackingMode(template.getStackingMode());
        instance.setCustom(Optional.ofNullable(template.getCustom())
                .map(com.commercetools.api.models.type.CustomFields::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartDiscount
     * @return builder
     */
    public static CartDiscountBuilder builder() {
        return CartDiscountBuilder.of();
    }

    /**
     * create builder for CartDiscount instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountBuilder builder(final CartDiscount template) {
        return CartDiscountBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscount(Function<CartDiscount, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.CART_DISCOUNT;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscount> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscount>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscount>";
            }
        };
    }
}
