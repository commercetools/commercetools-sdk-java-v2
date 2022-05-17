
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountCodeDraftImpl.class)
public interface DiscountCodeDraft extends com.commercetools.api.models.CustomizableDraft<DiscountCodeDraft> {

    /**
    *  <p>Name of the DiscountCode.</p>
    */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>Description of the DiscountCode.</p>
    */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
    *  <p>User-defined unique identifier for the DiscountCode that can be <a href="/../api/projects/carts#add-discountcode">added to the Cart</a> to apply the related <a href="ctp:api:type:CartDiscount">CartDiscounts</a>.
    *  It cannot be modified after the DiscountCode is created.</p>
    */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
    *  <p>Specify the CartDiscounts the Platform applies when you add the DiscountCode to the Cart.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("cartDiscounts")
    public List<CartDiscountResourceIdentifier> getCartDiscounts();

    /**
    *  <p>DiscountCode can only be applied to Carts that match this predicate.</p>
    */

    @JsonProperty("cartPredicate")
    public String getCartPredicate();

    /**
    *  <p>Only active DiscountCodes can be applied to the Cart.</p>
    */

    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
    *  <p>Number of times the DiscountCode can be applied.</p>
    */

    @JsonProperty("maxApplications")
    public Long getMaxApplications();

    /**
    *  <p>Number of times the DiscountCode can be applied per Customer.</p>
    */

    @JsonProperty("maxApplicationsPerCustomer")
    public Long getMaxApplicationsPerCustomer();

    /**
    *  <p>Custom Fields for the DiscountCode.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
    *  <p>Groups to which the DiscountCode will belong to.</p>
    */

    @JsonProperty("groups")
    public List<String> getGroups();

    /**
    *  <p>Date and time (UTC) from which the DiscountCode is effective. Must be earlier than <code>validUntil</code>.</p>
    */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
    *  <p>Date and time (UTC) until which the DiscountCode is effective. Must be later than <code>validFrom</code>.</p>
    */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    public void setCode(final String code);

    @JsonIgnore
    public void setCartDiscounts(final CartDiscountResourceIdentifier... cartDiscounts);

    public void setCartDiscounts(final List<CartDiscountResourceIdentifier> cartDiscounts);

    public void setCartPredicate(final String cartPredicate);

    public void setIsActive(final Boolean isActive);

    public void setMaxApplications(final Long maxApplications);

    public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer);

    public void setCustom(final CustomFieldsDraft custom);

    @JsonIgnore
    public void setGroups(final String... groups);

    public void setGroups(final List<String> groups);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public static DiscountCodeDraft of() {
        return new DiscountCodeDraftImpl();
    }

    public static DiscountCodeDraft of(final DiscountCodeDraft template) {
        DiscountCodeDraftImpl instance = new DiscountCodeDraftImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setCode(template.getCode());
        instance.setCartDiscounts(template.getCartDiscounts());
        instance.setCartPredicate(template.getCartPredicate());
        instance.setIsActive(template.getIsActive());
        instance.setMaxApplications(template.getMaxApplications());
        instance.setMaxApplicationsPerCustomer(template.getMaxApplicationsPerCustomer());
        instance.setCustom(template.getCustom());
        instance.setGroups(template.getGroups());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    public static DiscountCodeDraftBuilder builder() {
        return DiscountCodeDraftBuilder.of();
    }

    public static DiscountCodeDraftBuilder builder(final DiscountCodeDraft template) {
        return DiscountCodeDraftBuilder.of(template);
    }

    default <T> T withDiscountCodeDraft(Function<DiscountCodeDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeDraft>";
            }
        };
    }
}
