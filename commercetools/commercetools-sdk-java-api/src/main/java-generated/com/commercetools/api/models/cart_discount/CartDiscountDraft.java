
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

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
public interface CartDiscountDraft extends com.commercetools.api.models.CustomizableDraft<CartDiscountDraft> {

    /**
     <*  <p>Name of the CartDiscount.</p>>
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     <*  <p>User-defined unique identifier for the CartDiscount.</p>>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     <*  <p>Description of the CartDiscount.</p>>
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     <*  <p>Effect of the CartDiscount. For a target, relative or absolute discount values, or a fixed item price value can be specified. If no target is specified, a gift line item can be added to the cart.</p>>
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public CartDiscountValueDraft getValue();

    /**
     <*  <p>Valid Cart Predicate.</p>>
     */
    @NotNull
    @JsonProperty("cartPredicate")
    public String getCartPredicate();

    /**
     <*  <p>Must not be set when the <code>value</code> has type <code>giftLineItem</code>, otherwise a CartDiscountTarget must be set.</p>>
     */
    @Valid
    @JsonProperty("target")
    public CartDiscountTarget getTarget();

    /**
     <*  <p>Value between <code>0</code> and <code>1</code>. A Discount with a higher sortOrder is prioritized. The sort order must be unambiguous among all CartDiscounts.</p>>
     */
    @NotNull
    @JsonProperty("sortOrder")
    public String getSortOrder();

    /**
     <*  <p>Only active Discounts can be applied to the Cart.</p>>
     */

    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
     <*  <p>Date and time (UTC) from which the Discount is effective.</p>>
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     <*  <p>Date and time (UTC) until which the Discount is effective.</p>>
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     <*  <p>States whether the Discount can only be used in a connection with a DiscountCode.</p>>
     */

    @JsonProperty("requiresDiscountCode")
    public Boolean getRequiresDiscountCode();

    /**
     <*  <p>Specifies whether the application of this discount causes the following discounts to be ignored.</p>>
     */

    @JsonProperty("stackingMode")
    public StackingMode getStackingMode();

    /**
     <*  <p>Custom Fields of the CartDiscount.</p>>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setName(final LocalizedString name);

    public void setKey(final String key);

    public void setDescription(final LocalizedString description);

    public void setValue(final CartDiscountValueDraft value);

    public void setCartPredicate(final String cartPredicate);

    public void setTarget(final CartDiscountTarget target);

    public void setSortOrder(final String sortOrder);

    public void setIsActive(final Boolean isActive);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public void setRequiresDiscountCode(final Boolean requiresDiscountCode);

    public void setStackingMode(final StackingMode stackingMode);

    public void setCustom(final CustomFieldsDraft custom);

    public static CartDiscountDraft of() {
        return new CartDiscountDraftImpl();
    }

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

    public static CartDiscountDraftBuilder builder() {
        return CartDiscountDraftBuilder.of();
    }

    public static CartDiscountDraftBuilder builder(final CartDiscountDraft template) {
        return CartDiscountDraftBuilder.of(template);
    }

    default <T> T withCartDiscountDraft(Function<CartDiscountDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountDraft>";
            }
        };
    }
}
