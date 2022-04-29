
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountImpl.class)
public interface CartDiscount extends BaseResource, com.commercetools.api.models.DomainResource<CartDiscount>,
        com.commercetools.api.models.Referencable<CartDiscount>,
        com.commercetools.api.models.ResourceIdentifiable<CartDiscount>,
        com.commercetools.api.models.Customizable<CartDiscount> {

    /**
    *  <p>The unique ID of the cart discount.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>The current version of the cart discount.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
    *  <p>Present on resources updated after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>User-specific unique identifier for a cart discount.
    *  Must be unique across a project.</p>
    */

    @JsonProperty("key")
    public String getKey();

    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    @NotNull
    @Valid
    @JsonProperty("value")
    public CartDiscountValue getValue();

    /**
    *  <p>A valid Cart predicate.</p>
    */
    @NotNull
    @JsonProperty("cartPredicate")
    public String getCartPredicate();

    /**
    *  <p>Empty when the <code>value</code> has type <code>giftLineItem</code>, otherwise a CartDiscountTarget is set.</p>
    */
    @Valid
    @JsonProperty("target")
    public CartDiscountTarget getTarget();

    /**
    *  <p>The string must contain a number between 0 and 1.
    *  All matching cart discounts are applied to a cart in the order defined by this field.
    *  A discount with greater sort order is prioritized higher than a discount with lower sort order.
    *  The sort order is unambiguous among all cart discounts.</p>
    */
    @NotNull
    @JsonProperty("sortOrder")
    public String getSortOrder();

    /**
    *  <p>Only active discount can be applied to the cart.</p>
    */
    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
    *  <p>States whether the discount can only be used in a connection with a DiscountCode.</p>
    */
    @NotNull
    @JsonProperty("requiresDiscountCode")
    public Boolean getRequiresDiscountCode();

    /**
    *  <p>The platform will generate this array from the predicate.
    *  It contains the references of all the resources that are addressed in the predicate.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("references")
    public List<Reference> getReferences();

    /**
    *  <p>Specifies whether the application of this discount causes the following discounts to be ignored.
    *  Defaults to Stacking.</p>
    */
    @NotNull
    @JsonProperty("stackingMode")
    public StackingMode getStackingMode();

    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setName(final LocalizedString name);

    public void setKey(final String key);

    public void setDescription(final LocalizedString description);

    public void setValue(final CartDiscountValue value);

    public void setCartPredicate(final String cartPredicate);

    public void setTarget(final CartDiscountTarget target);

    public void setSortOrder(final String sortOrder);

    public void setIsActive(final Boolean isActive);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public void setRequiresDiscountCode(final Boolean requiresDiscountCode);

    @JsonIgnore
    public void setReferences(final Reference... references);

    public void setReferences(final List<Reference> references);

    public void setStackingMode(final StackingMode stackingMode);

    public void setCustom(final CustomFields custom);

    public static CartDiscount of() {
        return new CartDiscountImpl();
    }

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

    public static CartDiscountBuilder builder() {
        return CartDiscountBuilder.of();
    }

    public static CartDiscountBuilder builder(final CartDiscount template) {
        return CartDiscountBuilder.of(template);
    }

    default <T> T withCartDiscount(Function<CartDiscount, T> helper) {
        return helper.apply(this);
    }

    @Override
    public default com.commercetools.api.models.common.ResourceIdentifier toResourceIdentifier() {
        return com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default com.commercetools.api.models.common.Reference toReference() {
        return com.commercetools.api.models.cart_discount.CartDiscountReference.builder().id(getId()).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscount> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscount>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscount>";
            }
        };
    }
}
