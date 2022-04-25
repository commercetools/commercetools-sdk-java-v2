
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountDraftImpl.class)
public interface CartDiscountDraft extends com.commercetools.api.models.CustomizableDraft<CartDiscountDraft> {

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>User-specific unique identifier for a cart discount.
    *  Must be unique across a project.
    *  The field can be reset using the Set Key UpdateAction.</p>
    */

    @JsonProperty("key")
    public String getKey();

    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    @NotNull
    @Valid
    @JsonProperty("value")
    public CartDiscountValueDraft getValue();

    /**
    *  <p>A valid Cart predicate.</p>
    */
    @NotNull
    @JsonProperty("cartPredicate")
    public String getCartPredicate();

    /**
    *  <p>Must not be set when the <code>value</code> has type <code>giftLineItem</code>, otherwise a CartDiscountTarget must be set.</p>
    */
    @Valid
    @JsonProperty("target")
    public CartDiscountTarget getTarget();

    /**
    *  <p>The string must contain a number between 0 and 1.
    *  A discount with greater sort order is prioritized higher than a discount with lower sort order.
    *  The sort order must be unambiguous among all cart discounts.</p>
    */
    @NotNull
    @JsonProperty("sortOrder")
    public String getSortOrder();

    /**
    *  <p>Only active discount can be applied to the cart.
    *  Defaults to <code>true</code>.</p>
    */

    @JsonProperty("isActive")
    public Boolean getIsActive();

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
    *  <p>States whether the discount can only be used in a connection with a DiscountCode.
    *  Defaults to <code>false</code>.</p>
    */

    @JsonProperty("requiresDiscountCode")
    public Boolean getRequiresDiscountCode();

    /**
    *  <p>Specifies whether the application of this discount causes the following discounts to be ignored.
    *  Defaults to Stacking.</p>
    */

    @JsonProperty("stackingMode")
    public StackingMode getStackingMode();

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
