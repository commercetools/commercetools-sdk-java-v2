
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier;
import com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * CartDiscountDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountDraft cartDiscountDraft = CartDiscountDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .value(valueBuilder -> valueBuilder)
 *             .cartPredicate("{cartPredicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountDraftImpl.class)
public interface CartDiscountDraft extends com.commercetools.api.models.CustomizableDraft<CartDiscountDraft>,
        com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<CartDiscountDraft> {

    /**
     *  <p>Name of the CartDiscount.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>User-defined unique identifier for the CartDiscount.</p>
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
     *  <p>Effect of the CartDiscount on the <code>target</code>.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public CartDiscountValueDraft getValue();

    /**
     *  <p>Valid <span>Cart Predicate</span>.</p>
     * @return cartPredicate
     */
    @NotNull
    @JsonProperty("cartPredicate")
    public String getCartPredicate();

    /**
     *  <p>Segment of the Cart that will be discounted.</p>
     *  <p>Must not be set if the <code>value</code> is <code>giftLineItem</code>.</p>
     * @return target
     */
    @Valid
    @JsonProperty("target")
    public CartDiscountTarget getTarget();

    /**
     *  <p>Value between <code>0</code> and <code>1</code> that determines the order in which the CartDiscounts will be applied; a CartDiscount with a higher value will be prioritized.</p>
     *  <p>It must be unique among all CartDiscounts and DiscountGroups.</p>
     *  <p>If the CartDiscount is part of a DiscountGroup, it will use the sort order of the DiscountGroup.</p>
     * @return sortOrder
     */

    @JsonProperty("sortOrder")
    public String getSortOrder();

    /**
     *  <ul>
     *   <li>If defined, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If not defined, the Cart Discount applies on all Carts, irrespective of a Store.</li>
     *  </ul>
     *  <p>If the referenced Stores exceed the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxStoreReferencesReachedError" rel="nofollow">MaxStoreReferencesReached</a> error is returned.</p>
     *  <p>If the referenced Stores exceed the <span>limit</span> for Cart Discounts that do not require a Discount Code, a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCartDiscountsLimitReachedError" rel="nofollow">StoreCartDiscountsLimitReached</a> error is returned.</p>
     * @return stores
     */
    @Valid
    @JsonProperty("stores")
    public List<StoreResourceIdentifier> getStores();

    /**
     *  <p>Only active Discounts can be applied to the Cart. If the <span>limit</span> for active Cart Discounts is reached, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxCartDiscountsReachedError" rel="nofollow">MaxCartDiscountsReached</a> error is returned.</p>
     * @return isActive
     */

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
     *  <p>States whether the Discount can only be used in a connection with a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a>.</p>
     * @return requiresDiscountCode
     */

    @JsonProperty("requiresDiscountCode")
    public Boolean getRequiresDiscountCode();

    /**
     *  <p>Specifies whether the application of this discount causes the following discounts to be ignored.</p>
     * @return stackingMode
     */

    @JsonProperty("stackingMode")
    public StackingMode getStackingMode();

    /**
     *  <p>Custom Fields for the CartDiscount.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Reference to a DiscountGroup that the CartDiscount must belong to.</p>
     * @return discountGroup
     */
    @Valid
    @JsonProperty("discountGroup")
    public DiscountGroupResourceIdentifier getDiscountGroup();

    /**
     *  <p>Scope of the Cart Discount for Recurring Orders.</p>
     *  <p>If not set, the default is <a href="https://docs.commercetools.com/apis/ctp:api:type:NonRecurringOrdersOnlyDraft" rel="nofollow">NonRecurringOrdersOnlyDraft</a>.</p>
     * @return recurringOrderScope
     */
    @Valid
    @JsonProperty("recurringOrderScope")
    public RecurringOrderScopeDraft getRecurringOrderScope();

    /**
     *  <p>Name of the CartDiscount.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>User-defined unique identifier for the CartDiscount.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Description of the CartDiscount.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Effect of the CartDiscount on the <code>target</code>.</p>
     * @param value value to be set
     */

    public void setValue(final CartDiscountValueDraft value);

    /**
     *  <p>Valid <span>Cart Predicate</span>.</p>
     * @param cartPredicate value to be set
     */

    public void setCartPredicate(final String cartPredicate);

    /**
     *  <p>Segment of the Cart that will be discounted.</p>
     *  <p>Must not be set if the <code>value</code> is <code>giftLineItem</code>.</p>
     * @param target value to be set
     */

    public void setTarget(final CartDiscountTarget target);

    /**
     *  <p>Value between <code>0</code> and <code>1</code> that determines the order in which the CartDiscounts will be applied; a CartDiscount with a higher value will be prioritized.</p>
     *  <p>It must be unique among all CartDiscounts and DiscountGroups.</p>
     *  <p>If the CartDiscount is part of a DiscountGroup, it will use the sort order of the DiscountGroup.</p>
     * @param sortOrder value to be set
     */

    public void setSortOrder(final String sortOrder);

    /**
     *  <ul>
     *   <li>If defined, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If not defined, the Cart Discount applies on all Carts, irrespective of a Store.</li>
     *  </ul>
     *  <p>If the referenced Stores exceed the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxStoreReferencesReachedError" rel="nofollow">MaxStoreReferencesReached</a> error is returned.</p>
     *  <p>If the referenced Stores exceed the <span>limit</span> for Cart Discounts that do not require a Discount Code, a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCartDiscountsLimitReachedError" rel="nofollow">StoreCartDiscountsLimitReached</a> error is returned.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreResourceIdentifier... stores);

    /**
     *  <ul>
     *   <li>If defined, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If not defined, the Cart Discount applies on all Carts, irrespective of a Store.</li>
     *  </ul>
     *  <p>If the referenced Stores exceed the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxStoreReferencesReachedError" rel="nofollow">MaxStoreReferencesReached</a> error is returned.</p>
     *  <p>If the referenced Stores exceed the <span>limit</span> for Cart Discounts that do not require a Discount Code, a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCartDiscountsLimitReachedError" rel="nofollow">StoreCartDiscountsLimitReached</a> error is returned.</p>
     * @param stores values to be set
     */

    public void setStores(final List<StoreResourceIdentifier> stores);

    /**
     *  <p>Only active Discounts can be applied to the Cart. If the <span>limit</span> for active Cart Discounts is reached, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxCartDiscountsReachedError" rel="nofollow">MaxCartDiscountsReached</a> error is returned.</p>
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
     *  <p>States whether the Discount can only be used in a connection with a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a>.</p>
     * @param requiresDiscountCode value to be set
     */

    public void setRequiresDiscountCode(final Boolean requiresDiscountCode);

    /**
     *  <p>Specifies whether the application of this discount causes the following discounts to be ignored.</p>
     * @param stackingMode value to be set
     */

    public void setStackingMode(final StackingMode stackingMode);

    /**
     *  <p>Custom Fields for the CartDiscount.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     *  <p>Reference to a DiscountGroup that the CartDiscount must belong to.</p>
     * @param discountGroup value to be set
     */

    public void setDiscountGroup(final DiscountGroupResourceIdentifier discountGroup);

    /**
     *  <p>Scope of the Cart Discount for Recurring Orders.</p>
     *  <p>If not set, the default is <a href="https://docs.commercetools.com/apis/ctp:api:type:NonRecurringOrdersOnlyDraft" rel="nofollow">NonRecurringOrdersOnlyDraft</a>.</p>
     * @param recurringOrderScope value to be set
     */

    public void setRecurringOrderScope(final RecurringOrderScopeDraft recurringOrderScope);

    /**
     * factory method
     * @return instance of CartDiscountDraft
     */
    public static CartDiscountDraft of() {
        return new CartDiscountDraftImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountDraft of(final CartDiscountDraft template) {
        CartDiscountDraftImpl instance = new CartDiscountDraftImpl();
        instance.setName(template.getName());
        instance.setKey(template.getKey());
        instance.setDescription(template.getDescription());
        instance.setValue(template.getValue());
        instance.setCartPredicate(template.getCartPredicate());
        instance.setTarget(template.getTarget());
        instance.setSortOrder(template.getSortOrder());
        instance.setStores(template.getStores());
        instance.setIsActive(template.getIsActive());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setRequiresDiscountCode(template.getRequiresDiscountCode());
        instance.setStackingMode(template.getStackingMode());
        instance.setCustom(template.getCustom());
        instance.setDiscountGroup(template.getDiscountGroup());
        instance.setRecurringOrderScope(template.getRecurringOrderScope());
        return instance;
    }

    public CartDiscountDraft copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountDraft deepCopy(@Nullable final CartDiscountDraft template) {
        if (template == null) {
            return null;
        }
        CartDiscountDraftImpl instance = new CartDiscountDraftImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setKey(template.getKey());
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setValue(
            com.commercetools.api.models.cart_discount.CartDiscountValueDraft.deepCopy(template.getValue()));
        instance.setCartPredicate(template.getCartPredicate());
        instance.setTarget(
            com.commercetools.api.models.cart_discount.CartDiscountTarget.deepCopy(template.getTarget()));
        instance.setSortOrder(template.getSortOrder());
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreResourceIdentifier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setIsActive(template.getIsActive());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setRequiresDiscountCode(template.getRequiresDiscountCode());
        instance.setStackingMode(template.getStackingMode());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        instance.setDiscountGroup(com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier
                .deepCopy(template.getDiscountGroup()));
        instance.setRecurringOrderScope(com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft
                .deepCopy(template.getRecurringOrderScope()));
        return instance;
    }

    /**
     * builder factory method for CartDiscountDraft
     * @return builder
     */
    public static CartDiscountDraftBuilder builder() {
        return CartDiscountDraftBuilder.of();
    }

    /**
     * create builder for CartDiscountDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountDraftBuilder builder(final CartDiscountDraft template) {
        return CartDiscountDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountDraft(Function<CartDiscountDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountDraft>";
            }
        };
    }
}
