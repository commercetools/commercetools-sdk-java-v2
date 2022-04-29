
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart_discount.CartDiscountReference;
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
@JsonDeserialize(as = DiscountCodeImpl.class)
public interface DiscountCode extends BaseResource, com.commercetools.api.models.DomainResource<DiscountCode>,
        com.commercetools.api.models.Referencable<DiscountCode>,
        com.commercetools.api.models.ResourceIdentifiable<DiscountCode>,
        com.commercetools.api.models.Customizable<DiscountCode> {

    /**
    *  <p>The unique ID of the discount code.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

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
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
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

    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
    *  <p>Unique identifier of this discount code.
    *  This value is added to the cart
    *  to enable the related cart discounts in the cart.</p>
    */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
    *  <p>The referenced matching cart discounts can be applied to the cart once the DiscountCode is added.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("cartDiscounts")
    public List<CartDiscountReference> getCartDiscounts();

    /**
    *  <p>The discount code can only be applied to carts that match this predicate.</p>
    */

    @JsonProperty("cartPredicate")
    public String getCartPredicate();

    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
    *  <p>The platform will generate this array from the cart predicate.
    *  It contains the references of all the resources that are addressed in the predicate.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("references")
    public List<Reference> getReferences();

    /**
    *  <p>The discount code can only be applied <code>maxApplications</code> times.</p>
    */

    @JsonProperty("maxApplications")
    public Long getMaxApplications();

    /**
    *  <p>The discount code can only be applied <code>maxApplicationsPerCustomer</code> times per customer.</p>
    */

    @JsonProperty("maxApplicationsPerCustomer")
    public Long getMaxApplicationsPerCustomer();

    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
    *  <p>The groups to which this discount code belong.</p>
    */
    @NotNull
    @JsonProperty("groups")
    public List<String> getGroups();

    /**
    *  <p>The time from which the discount can be applied on a cart.
    *  Before that time the code is invalid.</p>
    */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
    *  <p>The time until the discount can be applied on a cart.
    *  After that time the code is invalid.</p>
    */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
    *  <p>Used for the internal platform only and registers the reservation of use of a discount code.
    *  Its value is managed by the platform.
    *  It can change at any time due to internal and external factors.
    *  It should not be used in customer logic.</p>
    */

    @JsonProperty("applicationVersion")
    public Long getApplicationVersion();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    public void setCode(final String code);

    @JsonIgnore
    public void setCartDiscounts(final CartDiscountReference... cartDiscounts);

    public void setCartDiscounts(final List<CartDiscountReference> cartDiscounts);

    public void setCartPredicate(final String cartPredicate);

    public void setIsActive(final Boolean isActive);

    @JsonIgnore
    public void setReferences(final Reference... references);

    public void setReferences(final List<Reference> references);

    public void setMaxApplications(final Long maxApplications);

    public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer);

    public void setCustom(final CustomFields custom);

    @JsonIgnore
    public void setGroups(final String... groups);

    public void setGroups(final List<String> groups);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public void setApplicationVersion(final Long applicationVersion);

    public static DiscountCode of() {
        return new DiscountCodeImpl();
    }

    public static DiscountCode of(final DiscountCode template) {
        DiscountCodeImpl instance = new DiscountCodeImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setCode(template.getCode());
        instance.setCartDiscounts(template.getCartDiscounts());
        instance.setCartPredicate(template.getCartPredicate());
        instance.setIsActive(template.getIsActive());
        instance.setReferences(template.getReferences());
        instance.setMaxApplications(template.getMaxApplications());
        instance.setMaxApplicationsPerCustomer(template.getMaxApplicationsPerCustomer());
        instance.setCustom(template.getCustom());
        instance.setGroups(template.getGroups());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setApplicationVersion(template.getApplicationVersion());
        return instance;
    }

    public static DiscountCodeBuilder builder() {
        return DiscountCodeBuilder.of();
    }

    public static DiscountCodeBuilder builder(final DiscountCode template) {
        return DiscountCodeBuilder.of(template);
    }

    default <T> T withDiscountCode(Function<DiscountCode, T> helper) {
        return helper.apply(this);
    }

    @Override
    public default com.commercetools.api.models.common.ResourceIdentifier toResourceIdentifier() {
        return com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default com.commercetools.api.models.common.Reference toReference() {
        return com.commercetools.api.models.discount_code.DiscountCodeReference.builder().id(getId()).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCode> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCode>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCode>";
            }
        };
    }
}
