
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
 *             .sortOrder("{sortOrder}")
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
     *  <p>Effect of the CartDiscount. For a target, relative or absolute Discount values or a fixed item Price value can be specified. If no target is specified, a Gift Line Item can be added to the Cart.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public CartDiscountValueDraft getValue();

    /**
     *  <p>Valid Cart Predicate.</p>
     * @return cartPredicate
     */
    @NotNull
    @JsonProperty("cartPredicate")
    public String getCartPredicate();

    /**
     *  <p>Must not be set when the <code>value</code> has type <code>giftLineItem</code>, otherwise a CartDiscountTarget must be set.</p>
     * @return target
     */
    @Valid
    @JsonProperty("target")
    public CartDiscountTarget getTarget();

    /**
     *  <p>Value between <code>0</code> and <code>1</code>. A Discount with a higher sortOrder is prioritized. The sort order must be unambiguous among all CartDiscounts.</p>
     * @return sortOrder
     */
    @NotNull
    @JsonProperty("sortOrder")
    public String getSortOrder();

    /**
     *  <p>Only active Discounts can be applied to the Cart.</p>
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
     *  <p>States whether the Discount can only be used in a connection with a DiscountCode.</p>
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
     *  <p>Custom Fields of the CartDiscount.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

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
     *  <p>Effect of the CartDiscount. For a target, relative or absolute Discount values or a fixed item Price value can be specified. If no target is specified, a Gift Line Item can be added to the Cart.</p>
     * @param value value to be set
     */

    public void setValue(final CartDiscountValueDraft value);

    /**
     *  <p>Valid Cart Predicate.</p>
     * @param cartPredicate value to be set
     */

    public void setCartPredicate(final String cartPredicate);

    /**
     *  <p>Must not be set when the <code>value</code> has type <code>giftLineItem</code>, otherwise a CartDiscountTarget must be set.</p>
     * @param target value to be set
     */

    public void setTarget(final CartDiscountTarget target);

    /**
     *  <p>Value between <code>0</code> and <code>1</code>. A Discount with a higher sortOrder is prioritized. The sort order must be unambiguous among all CartDiscounts.</p>
     * @param sortOrder value to be set
     */

    public void setSortOrder(final String sortOrder);

    /**
     *  <p>Only active Discounts can be applied to the Cart.</p>
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
     *  <p>States whether the Discount can only be used in a connection with a DiscountCode.</p>
     * @param requiresDiscountCode value to be set
     */

    public void setRequiresDiscountCode(final Boolean requiresDiscountCode);

    /**
     *  <p>Specifies whether the application of this discount causes the following discounts to be ignored.</p>
     * @param stackingMode value to be set
     */

    public void setStackingMode(final StackingMode stackingMode);

    /**
     *  <p>Custom Fields of the CartDiscount.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

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
        instance.setIsActive(template.getIsActive());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setRequiresDiscountCode(template.getRequiresDiscountCode());
        instance.setStackingMode(template.getStackingMode());
        instance.setCustom(template.getCustom());
        return instance;
    }

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
        instance.setIsActive(template.getIsActive());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setRequiresDiscountCode(template.getRequiresDiscountCode());
        instance.setStackingMode(template.getStackingMode());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
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
