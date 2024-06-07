
package com.commercetools.importapi.models.discount_codes;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.CartDiscountKeyReference;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The data representation for a Discount Code to be imported that is persisted as a Discount Code in the Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeImport discountCodeImport = DiscountCodeImport.builder()
 *             .key("{key}")
 *             .code("{code}")
 *             .plusCartDiscounts(cartDiscountsBuilder -> cartDiscountsBuilder)
 *             .isActive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeImportImpl.class)
public interface DiscountCodeImport extends ImportResource {

    /**
     *  <p>User-defined unique identifier. If a Discount Code with this <code>key</code> exists, it will be updated with the imported data.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Maps to <code>DiscountCode.name</code>.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Maps to <code>DiscountCode.description</code>.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>User-defined unique identifier of the DiscountCode that is used by the customer to apply the discount.</p>
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
    public List<CartDiscountKeyReference> getCartDiscounts();

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
     *  <p>Number of times the DiscountCode can be applied. DiscountCode application is counted at the time of Order creation or update. However, Order cancellation or deletion does not decrement the count.</p>
     * @return maxApplications
     */

    @JsonProperty("maxApplications")
    public Long getMaxApplications();

    /**
     *  <p>Number of times the DiscountCode can be applied per Customer (anonymous Carts are not supported). DiscountCode application is counted at the time of Order creation or update. However, Order cancellation or deletion does not decrement the count.</p>
     * @return maxApplicationsPerCustomer
     */

    @JsonProperty("maxApplicationsPerCustomer")
    public Long getMaxApplicationsPerCustomer();

    /**
     *  <p>Groups to which the DiscountCode belongs.</p>
     * @return groups
     */

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
     *  <p>Custom Fields of the DiscountCode.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    /**
     *  <p>User-defined unique identifier. If a Discount Code with this <code>key</code> exists, it will be updated with the imported data.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Maps to <code>DiscountCode.name</code>.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Maps to <code>DiscountCode.description</code>.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>User-defined unique identifier of the DiscountCode that is used by the customer to apply the discount.</p>
     * @param code value to be set
     */

    public void setCode(final String code);

    /**
     *  <p>Reference to CartDiscounts that can be applied to the Cart once the DiscountCode is applied.</p>
     * @param cartDiscounts values to be set
     */

    @JsonIgnore
    public void setCartDiscounts(final CartDiscountKeyReference... cartDiscounts);

    /**
     *  <p>Reference to CartDiscounts that can be applied to the Cart once the DiscountCode is applied.</p>
     * @param cartDiscounts values to be set
     */

    public void setCartDiscounts(final List<CartDiscountKeyReference> cartDiscounts);

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
     *  <p>Number of times the DiscountCode can be applied. DiscountCode application is counted at the time of Order creation or update. However, Order cancellation or deletion does not decrement the count.</p>
     * @param maxApplications value to be set
     */

    public void setMaxApplications(final Long maxApplications);

    /**
     *  <p>Number of times the DiscountCode can be applied per Customer (anonymous Carts are not supported). DiscountCode application is counted at the time of Order creation or update. However, Order cancellation or deletion does not decrement the count.</p>
     * @param maxApplicationsPerCustomer value to be set
     */

    public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer);

    /**
     *  <p>Groups to which the DiscountCode belongs.</p>
     * @param groups values to be set
     */

    @JsonIgnore
    public void setGroups(final String... groups);

    /**
     *  <p>Groups to which the DiscountCode belongs.</p>
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
     *  <p>Custom Fields of the DiscountCode.</p>
     * @param custom value to be set
     */

    public void setCustom(final Custom custom);

    /**
     * factory method
     * @return instance of DiscountCodeImport
     */
    public static DiscountCodeImport of() {
        return new DiscountCodeImportImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeImport
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeImport of(final DiscountCodeImport template) {
        DiscountCodeImportImpl instance = new DiscountCodeImportImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setCode(template.getCode());
        instance.setCartDiscounts(template.getCartDiscounts());
        instance.setCartPredicate(template.getCartPredicate());
        instance.setIsActive(template.getIsActive());
        instance.setMaxApplications(template.getMaxApplications());
        instance.setMaxApplicationsPerCustomer(template.getMaxApplicationsPerCustomer());
        instance.setGroups(template.getGroups());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of DiscountCodeImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeImport deepCopy(@Nullable final DiscountCodeImport template) {
        if (template == null) {
            return null;
        }
        DiscountCodeImportImpl instance = new DiscountCodeImportImpl();
        instance.setKey(template.getKey());
        instance.setName(com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setDescription(
            com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setCode(template.getCode());
        instance.setCartDiscounts(Optional.ofNullable(template.getCartDiscounts())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.CartDiscountKeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCartPredicate(template.getCartPredicate());
        instance.setIsActive(template.getIsActive());
        instance.setMaxApplications(template.getMaxApplications());
        instance.setMaxApplicationsPerCustomer(template.getMaxApplicationsPerCustomer());
        instance.setGroups(Optional.ofNullable(template.getGroups()).map(ArrayList::new).orElse(null));
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setCustom(com.commercetools.importapi.models.customfields.Custom.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for DiscountCodeImport
     * @return builder
     */
    public static DiscountCodeImportBuilder builder() {
        return DiscountCodeImportBuilder.of();
    }

    /**
     * create builder for DiscountCodeImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeImportBuilder builder(final DiscountCodeImport template) {
        return DiscountCodeImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeImport(Function<DiscountCodeImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeImport>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeImport>";
            }
        };
    }
}
