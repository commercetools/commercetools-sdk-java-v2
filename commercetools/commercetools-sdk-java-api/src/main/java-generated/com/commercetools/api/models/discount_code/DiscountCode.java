
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
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

/**
 * DiscountCode
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCode discountCode = DiscountCode.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .code("{code}")
 *             .plusCartDiscounts(cartDiscountsBuilder -> cartDiscountsBuilder)
 *             .isActive(true)
 *             .plusReferences(referencesBuilder -> referencesBuilder)
 *             .plusGroups(groupsBuilder -> groupsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeImpl.class)
public interface DiscountCode
        extends BaseResource, DiscountCodeMixin, com.commercetools.api.models.DomainResource<DiscountCode>,
        com.commercetools.api.models.Referencable<DiscountCode>,
        com.commercetools.api.models.ResourceIdentifiable<DiscountCode>,
        com.commercetools.api.models.Customizable<DiscountCode> {

    /**
     *  <p>Unique identifier of the DiscountCode.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the DiscountCode.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the DiscountCode was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the DiscountCode was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
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
     *  <p>User-defined unique identifier of the DiscountCode added to the Cart to apply the related CartDiscounts.</p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Reference to CartDiscounts that can be applied to the Cart once the DiscountCode is applied.</p>
     * @return cartDiscounts
     */
    @NotNull
    @Valid
    @JsonProperty("cartDiscounts")
    public List<CartDiscountReference> getCartDiscounts();

    /**
     *  <p>DiscountCode can only be applied to Carts that match this predicate.</p>
     * @return cartPredicate
     */

    @JsonProperty("cartPredicate")
    public String getCartPredicate();

    /**
     *  <p>Indicates if the DiscountCode is active and can be applied to the Cart.</p>
     * @return isActive
     */
    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
     *  <p>Array generated from the Cart predicate. It contains the references of all the resources that are addressed in the predicate.</p>
     * @return references
     */
    @NotNull
    @Valid
    @JsonProperty("references")
    public List<Reference> getReferences();

    /**
     *  <p>Number of times the DiscountCode can be applied. DiscountCode application is counted at the time of Order creation or edit. However, Order cancellation or deletion does not decrement the count.</p>
     * @return maxApplications
     */

    @JsonProperty("maxApplications")
    public Long getMaxApplications();

    /**
     *  <p>Number of times the DiscountCode can be applied per Customer (anonymous Carts are not supported). DiscountCode application is counted at the time of Order creation or edit. However, Order cancellation or deletion does not decrement the count.</p>
     * @return maxApplicationsPerCustomer
     */

    @JsonProperty("maxApplicationsPerCustomer")
    public Long getMaxApplicationsPerCustomer();

    /**
     *  <p>Custom Fields of the DiscountCode.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Groups to which the DiscountCode belongs to.</p>
     * @return groups
     */
    @NotNull
    @JsonProperty("groups")
    public List<String> getGroups();

    /**
     *  <p>Date and time (UTC) from which the DiscountCode is effective.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Date and time (UTC) until which the DiscountCode is effective.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Used and managed by the API and must not be used in customer logic. The value can change at any time due to internal and external factors.</p>
     * @return applicationVersion
     */

    @JsonProperty("applicationVersion")
    public Long getApplicationVersion();

    /**
     *  <p>Unique identifier of the DiscountCode.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the DiscountCode.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the DiscountCode was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the DiscountCode was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

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
     *  <p>User-defined unique identifier of the DiscountCode added to the Cart to apply the related CartDiscounts.</p>
     * @param code value to be set
     */

    public void setCode(final String code);

    /**
     *  <p>Reference to CartDiscounts that can be applied to the Cart once the DiscountCode is applied.</p>
     * @param cartDiscounts values to be set
     */

    @JsonIgnore
    public void setCartDiscounts(final CartDiscountReference... cartDiscounts);

    /**
     *  <p>Reference to CartDiscounts that can be applied to the Cart once the DiscountCode is applied.</p>
     * @param cartDiscounts values to be set
     */

    public void setCartDiscounts(final List<CartDiscountReference> cartDiscounts);

    /**
     *  <p>DiscountCode can only be applied to Carts that match this predicate.</p>
     * @param cartPredicate value to be set
     */

    public void setCartPredicate(final String cartPredicate);

    /**
     *  <p>Indicates if the DiscountCode is active and can be applied to the Cart.</p>
     * @param isActive value to be set
     */

    public void setIsActive(final Boolean isActive);

    /**
     *  <p>Array generated from the Cart predicate. It contains the references of all the resources that are addressed in the predicate.</p>
     * @param references values to be set
     */

    @JsonIgnore
    public void setReferences(final Reference... references);

    /**
     *  <p>Array generated from the Cart predicate. It contains the references of all the resources that are addressed in the predicate.</p>
     * @param references values to be set
     */

    public void setReferences(final List<Reference> references);

    /**
     *  <p>Number of times the DiscountCode can be applied. DiscountCode application is counted at the time of Order creation or edit. However, Order cancellation or deletion does not decrement the count.</p>
     * @param maxApplications value to be set
     */

    public void setMaxApplications(final Long maxApplications);

    /**
     *  <p>Number of times the DiscountCode can be applied per Customer (anonymous Carts are not supported). DiscountCode application is counted at the time of Order creation or edit. However, Order cancellation or deletion does not decrement the count.</p>
     * @param maxApplicationsPerCustomer value to be set
     */

    public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer);

    /**
     *  <p>Custom Fields of the DiscountCode.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>Groups to which the DiscountCode belongs to.</p>
     * @param groups values to be set
     */

    @JsonIgnore
    public void setGroups(final String... groups);

    /**
     *  <p>Groups to which the DiscountCode belongs to.</p>
     * @param groups values to be set
     */

    public void setGroups(final List<String> groups);

    /**
     *  <p>Date and time (UTC) from which the DiscountCode is effective.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Date and time (UTC) until which the DiscountCode is effective.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     *  <p>Used and managed by the API and must not be used in customer logic. The value can change at any time due to internal and external factors.</p>
     * @param applicationVersion value to be set
     */

    public void setApplicationVersion(final Long applicationVersion);

    /**
     * factory method
     * @return instance of DiscountCode
     */
    public static DiscountCode of() {
        return new DiscountCodeImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCode
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of DiscountCode
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCode deepCopy(@Nullable final DiscountCode template) {
        if (template == null) {
            return null;
        }
        DiscountCodeImpl instance = new DiscountCodeImpl();
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
        instance.setDescription(Optional.ofNullable(template.getDescription())
                .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setCode(template.getCode());
        instance.setCartDiscounts(Optional.ofNullable(template.getCartDiscounts())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart_discount.CartDiscountReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCartPredicate(template.getCartPredicate());
        instance.setIsActive(template.getIsActive());
        instance.setReferences(Optional.ofNullable(template.getReferences())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Reference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setMaxApplications(template.getMaxApplications());
        instance.setMaxApplicationsPerCustomer(template.getMaxApplicationsPerCustomer());
        instance.setCustom(Optional.ofNullable(template.getCustom())
                .map(com.commercetools.api.models.type.CustomFields::deepCopy)
                .orElse(null));
        instance.setGroups(Optional.ofNullable(template.getGroups()).map(ArrayList::new).orElse(null));
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setApplicationVersion(template.getApplicationVersion());
        return instance;
    }

    /**
     * builder factory method for DiscountCode
     * @return builder
     */
    public static DiscountCodeBuilder builder() {
        return DiscountCodeBuilder.of();
    }

    /**
     * create builder for DiscountCode instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeBuilder builder(final DiscountCode template) {
        return DiscountCodeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCode(Function<DiscountCode, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.DISCOUNT_CODE;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCode> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCode>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCode>";
            }
        };
    }
}
