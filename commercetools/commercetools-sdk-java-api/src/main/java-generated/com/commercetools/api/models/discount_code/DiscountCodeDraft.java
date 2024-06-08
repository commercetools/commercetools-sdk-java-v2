
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * DiscountCodeDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeDraft discountCodeDraft = DiscountCodeDraft.builder()
 *             .code("{code}")
 *             .plusCartDiscounts(cartDiscountsBuilder -> cartDiscountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeDraftImpl.class)
public interface DiscountCodeDraft extends com.commercetools.api.models.CustomizableDraft<DiscountCodeDraft>,
        io.vrap.rmf.base.client.Draft<DiscountCodeDraft> {

    /**
     *  <p>User-defined unique identifier for the DiscountCode.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the DiscountCode.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Description of the DiscountCode.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>User-defined unique identifier for the DiscountCode that can be added to the Cart to apply the related CartDiscounts. It cannot be modified after the DiscountCode is created.</p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Specify what CartDiscounts the API applies when you add the DiscountCode to the Cart.</p>
     * @return cartDiscounts
     */
    @NotNull
    @Valid
    @JsonProperty("cartDiscounts")
    public List<CartDiscountResourceIdentifier> getCartDiscounts();

    /**
     *  <p>DiscountCode can only be applied to Carts that match this predicate.</p>
     * @return cartPredicate
     */

    @JsonProperty("cartPredicate")
    public String getCartPredicate();

    /**
     *  <p>Only active DiscountCodes can be applied to the Cart.</p>
     * @return isActive
     */

    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
     *  <p>Number of times the DiscountCode can be applied.</p>
     * @return maxApplications
     */

    @JsonProperty("maxApplications")
    public Long getMaxApplications();

    /**
     *  <p>Number of times the DiscountCode can be applied per Customer.</p>
     * @return maxApplicationsPerCustomer
     */

    @JsonProperty("maxApplicationsPerCustomer")
    public Long getMaxApplicationsPerCustomer();

    /**
     *  <p>Custom Fields for the DiscountCode.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Groups to which the DiscountCode will belong to.</p>
     * @return groups
     */

    @JsonProperty("groups")
    public List<String> getGroups();

    /**
     *  <p>Date and time (UTC) from which the DiscountCode is effective. Must be earlier than <code>validUntil</code>.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Date and time (UTC) until which the DiscountCode is effective. Must be later than <code>validFrom</code>.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>User-defined unique identifier for the DiscountCode.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the DiscountCode.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Description of the DiscountCode.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>User-defined unique identifier for the DiscountCode that can be added to the Cart to apply the related CartDiscounts. It cannot be modified after the DiscountCode is created.</p>
     * @param code value to be set
     */

    public void setCode(final String code);

    /**
     *  <p>Specify what CartDiscounts the API applies when you add the DiscountCode to the Cart.</p>
     * @param cartDiscounts values to be set
     */

    @JsonIgnore
    public void setCartDiscounts(final CartDiscountResourceIdentifier... cartDiscounts);

    /**
     *  <p>Specify what CartDiscounts the API applies when you add the DiscountCode to the Cart.</p>
     * @param cartDiscounts values to be set
     */

    public void setCartDiscounts(final List<CartDiscountResourceIdentifier> cartDiscounts);

    /**
     *  <p>DiscountCode can only be applied to Carts that match this predicate.</p>
     * @param cartPredicate value to be set
     */

    public void setCartPredicate(final String cartPredicate);

    /**
     *  <p>Only active DiscountCodes can be applied to the Cart.</p>
     * @param isActive value to be set
     */

    public void setIsActive(final Boolean isActive);

    /**
     *  <p>Number of times the DiscountCode can be applied.</p>
     * @param maxApplications value to be set
     */

    public void setMaxApplications(final Long maxApplications);

    /**
     *  <p>Number of times the DiscountCode can be applied per Customer.</p>
     * @param maxApplicationsPerCustomer value to be set
     */

    public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer);

    /**
     *  <p>Custom Fields for the DiscountCode.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     *  <p>Groups to which the DiscountCode will belong to.</p>
     * @param groups values to be set
     */

    @JsonIgnore
    public void setGroups(final String... groups);

    /**
     *  <p>Groups to which the DiscountCode will belong to.</p>
     * @param groups values to be set
     */

    public void setGroups(final List<String> groups);

    /**
     *  <p>Date and time (UTC) from which the DiscountCode is effective. Must be earlier than <code>validUntil</code>.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Date and time (UTC) until which the DiscountCode is effective. Must be later than <code>validFrom</code>.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     * factory method
     * @return instance of DiscountCodeDraft
     */
    public static DiscountCodeDraft of() {
        return new DiscountCodeDraftImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeDraft of(final DiscountCodeDraft template) {
        DiscountCodeDraftImpl instance = new DiscountCodeDraftImpl();
        instance.setKey(template.getKey());
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

    /**
     * factory method to create a deep copy of DiscountCodeDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeDraft deepCopy(@Nullable final DiscountCodeDraft template) {
        if (template == null) {
            return null;
        }
        DiscountCodeDraftImpl instance = new DiscountCodeDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setCode(template.getCode());
        instance.setCartDiscounts(Optional.ofNullable(template.getCartDiscounts())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCartPredicate(template.getCartPredicate());
        instance.setIsActive(template.getIsActive());
        instance.setMaxApplications(template.getMaxApplications());
        instance.setMaxApplicationsPerCustomer(template.getMaxApplicationsPerCustomer());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        instance.setGroups(Optional.ofNullable(template.getGroups()).map(ArrayList::new).orElse(null));
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    /**
     * builder factory method for DiscountCodeDraft
     * @return builder
     */
    public static DiscountCodeDraftBuilder builder() {
        return DiscountCodeDraftBuilder.of();
    }

    /**
     * create builder for DiscountCodeDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeDraftBuilder builder(final DiscountCodeDraft template) {
        return DiscountCodeDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeDraft(Function<DiscountCodeDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeDraft>";
            }
        };
    }
}
