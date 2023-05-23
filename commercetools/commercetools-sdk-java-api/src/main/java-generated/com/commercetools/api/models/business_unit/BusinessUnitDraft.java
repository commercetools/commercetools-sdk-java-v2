
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generic draft type to model those fields all Business Units have in common. The additional fields required for creating a Company or Division are represented on CompanyDraft and DivisionDraft.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitDraft businessUnitDraft = BusinessUnitDraft.companyBuilder()
 *             key("{key}")
 *             name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.CompanyDraftImpl.class, name = CompanyDraft.COMPANY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.DivisionDraftImpl.class, name = DivisionDraft.DIVISION) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "unitType", defaultImpl = BusinessUnitDraftImpl.class, visible = true)
@JsonDeserialize(as = BusinessUnitDraftImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface BusinessUnitDraft extends com.commercetools.api.models.WithKey {

    /**
     *  <p>User-defined unique identifier for the Business Unit.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Indicates whether the Business Unit can be edited and used in Orders.</p>
     * @return status
     */

    @JsonProperty("status")
    public BusinessUnitStatus getStatus();

    /**
     *  <p>Sets the Stores the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for Companies and not set for Divisions.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     * @return stores
     */
    @Valid
    @JsonProperty("stores")
    public List<StoreResourceIdentifier> getStores();

    /**
     *  <p>Defines whether the Stores of the Business Unit are set directly on the Business Unit or are inherited from a parent. <code>storeMode</code> is always <code>Explicit</code> for Companies and defaults to <code>FromParent</code> for Divisions.</p>
     * @return storeMode
     */

    @JsonProperty("storeMode")
    public BusinessUnitStoreMode getStoreMode();

    /**
     *  <p>Type of the Business Unit indicating its position in a hierarchy.</p>
     * @return unitType
     */
    @NotNull
    @JsonProperty("unitType")
    public BusinessUnitType getUnitType();

    /**
     *  <p>Name of the Business Unit.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Email address of the Business Unit.</p>
     * @return contactEmail
     */

    @JsonProperty("contactEmail")
    public String getContactEmail();

    /**
     *  <p>Determines whether the Business Unit can inherit Associates from a parent. Always <code>Explicit</code> for Companies and defaults to <code>ExplicitAndFromParent</code> for Divisions.</p>
     * @return associateMode
     */

    @JsonProperty("associateMode")
    public BusinessUnitAssociateMode getAssociateMode();

    /**
     *  <p>List of members that are part of the Business Unit in specific roles.</p>
     * @return associates
     */
    @Valid
    @JsonProperty("associates")
    public List<AssociateDraft> getAssociates();

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @return addresses
     */
    @Valid
    @JsonProperty("addresses")
    public List<BaseAddress> getAddresses();

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @return shippingAddresses
     */

    @JsonProperty("shippingAddresses")
    public List<Integer> getShippingAddresses();

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default shipping address.</p>
     * @return defaultShippingAddress
     */

    @JsonProperty("defaultShippingAddress")
    public Integer getDefaultShippingAddress();

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @return billingAddresses
     */

    @JsonProperty("billingAddresses")
    public List<Integer> getBillingAddresses();

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default billing address.</p>
     * @return defaultBillingAddress
     */

    @JsonProperty("defaultBillingAddress")
    public Integer getDefaultBillingAddress();

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>User-defined unique identifier for the Business Unit.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Indicates whether the Business Unit can be edited and used in Orders.</p>
     * @param status value to be set
     */

    public void setStatus(final BusinessUnitStatus status);

    /**
     *  <p>Sets the Stores the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for Companies and not set for Divisions.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreResourceIdentifier... stores);

    /**
     *  <p>Sets the Stores the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for Companies and not set for Divisions.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     * @param stores values to be set
     */

    public void setStores(final List<StoreResourceIdentifier> stores);

    /**
     *  <p>Defines whether the Stores of the Business Unit are set directly on the Business Unit or are inherited from a parent. <code>storeMode</code> is always <code>Explicit</code> for Companies and defaults to <code>FromParent</code> for Divisions.</p>
     * @param storeMode value to be set
     */

    public void setStoreMode(final BusinessUnitStoreMode storeMode);

    /**
     *  <p>Name of the Business Unit.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Email address of the Business Unit.</p>
     * @param contactEmail value to be set
     */

    public void setContactEmail(final String contactEmail);

    /**
     *  <p>Determines whether the Business Unit can inherit Associates from a parent. Always <code>Explicit</code> for Companies and defaults to <code>ExplicitAndFromParent</code> for Divisions.</p>
     * @param associateMode value to be set
     */

    public void setAssociateMode(final BusinessUnitAssociateMode associateMode);

    /**
     *  <p>List of members that are part of the Business Unit in specific roles.</p>
     * @param associates values to be set
     */

    @JsonIgnore
    public void setAssociates(final AssociateDraft... associates);

    /**
     *  <p>List of members that are part of the Business Unit in specific roles.</p>
     * @param associates values to be set
     */

    public void setAssociates(final List<AssociateDraft> associates);

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param addresses values to be set
     */

    @JsonIgnore
    public void setAddresses(final BaseAddress... addresses);

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param addresses values to be set
     */

    public void setAddresses(final List<BaseAddress> addresses);

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @param shippingAddresses values to be set
     */

    @JsonIgnore
    public void setShippingAddresses(final Integer... shippingAddresses);

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @param shippingAddresses values to be set
     */

    public void setShippingAddresses(final List<Integer> shippingAddresses);

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default shipping address.</p>
     * @param defaultShippingAddress value to be set
     */

    public void setDefaultShippingAddress(final Integer defaultShippingAddress);

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @param billingAddresses values to be set
     */

    @JsonIgnore
    public void setBillingAddresses(final Integer... billingAddresses);

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @param billingAddresses values to be set
     */

    public void setBillingAddresses(final List<Integer> billingAddresses);

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default billing address.</p>
     * @param defaultBillingAddress value to be set
     */

    public void setDefaultBillingAddress(final Integer defaultBillingAddress);

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method to create a deep copy of BusinessUnitDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitDraft deepCopy(@Nullable final BusinessUnitDraft template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.business_unit.CompanyDraft) {
            return com.commercetools.api.models.business_unit.CompanyDraft
                    .deepCopy((com.commercetools.api.models.business_unit.CompanyDraft) template);
        }
        if (template instanceof com.commercetools.api.models.business_unit.DivisionDraft) {
            return com.commercetools.api.models.business_unit.DivisionDraft
                    .deepCopy((com.commercetools.api.models.business_unit.DivisionDraft) template);
        }
        BusinessUnitDraftImpl instance = new BusinessUnitDraftImpl();
        instance.setKey(template.getKey());
        instance.setStatus(template.getStatus());
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreResourceIdentifier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setStoreMode(template.getStoreMode());
        instance.setName(template.getName());
        instance.setContactEmail(template.getContactEmail());
        instance.setAssociateMode(template.getAssociateMode());
        instance.setAssociates(Optional.ofNullable(template.getAssociates())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.business_unit.AssociateDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAddresses(Optional.ofNullable(template.getAddresses())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.BaseAddress::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setShippingAddresses(
            Optional.ofNullable(template.getShippingAddresses()).map(ArrayList::new).orElse(null));
        instance.setDefaultShippingAddress(template.getDefaultShippingAddress());
        instance.setBillingAddresses(
            Optional.ofNullable(template.getBillingAddresses()).map(ArrayList::new).orElse(null));
        instance.setDefaultBillingAddress(template.getDefaultBillingAddress());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder for company subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.CompanyDraftBuilder companyBuilder() {
        return com.commercetools.api.models.business_unit.CompanyDraftBuilder.of();
    }

    /**
     * builder for division subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.DivisionDraftBuilder divisionBuilder() {
        return com.commercetools.api.models.business_unit.DivisionDraftBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitDraft(Function<BusinessUnitDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDraft>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitDraft>";
            }
        };
    }
}
