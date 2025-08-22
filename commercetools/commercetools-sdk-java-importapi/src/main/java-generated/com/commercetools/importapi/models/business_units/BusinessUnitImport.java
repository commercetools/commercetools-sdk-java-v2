
package com.commercetools.importapi.models.business_units;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.Address;
import com.commercetools.importapi.models.common.StoreKeyReference;
import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents the data used to import a BusinessUnit. Can be of type Company or Division.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitImport businessUnitImport = BusinessUnitImport.companyBuilder()
 *             key("{key}")
 *             name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "unitType", defaultImpl = BusinessUnitImportImpl.class, visible = true)
@JsonDeserialize(as = BusinessUnitImportImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface BusinessUnitImport {

    /**
     *  <p>The type of Business Unit.</p>
     * @return unitType
     */
    @NotNull
    @JsonProperty("unitType")
    public BusinessUnitType getUnitType();

    /**
     *  <p>User-defined unique identifier. If a BusinessUnit with this <code>key</code> exists, it is updated with the imported data.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The name of the Business Unit.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>The status of the Business Unit.</p>
     * @return status
     */

    @JsonProperty("status")
    public BusinessUnitStatus getStatus();

    /**
     *  <p>The contact email address for the Business Unit.</p>
     * @return contactEmail
     */

    @JsonProperty("contactEmail")
    public String getContactEmail();

    /**
     *  <p>List of Associates to be assigned to the Business Unit.</p>
     * @return associates
     */
    @Valid
    @JsonProperty("associates")
    public List<AssociateDraft> getAssociates();

    /**
     *  <p>The addresses for the Business Unit.</p>
     * @return addresses
     */
    @Valid
    @JsonProperty("addresses")
    public List<Address> getAddresses();

    /**
     *  <p>The indices of the shipping addresses in the <code>addresses</code> array.</p>
     * @return shippingAddresses
     */

    @JsonProperty("shippingAddresses")
    public List<Integer> getShippingAddresses();

    /**
     *  <p>The index of the default shipping address in the <code>addresses</code> array.</p>
     * @return defaultShippingAddress
     */

    @JsonProperty("defaultShippingAddress")
    public Integer getDefaultShippingAddress();

    /**
     *  <p>The indices of the billing addresses in the <code>addresses</code> array.</p>
     * @return billingAddresses
     */

    @JsonProperty("billingAddresses")
    public List<Integer> getBillingAddresses();

    /**
     *  <p>The index of the default billing address in the <code>addresses</code> array.</p>
     * @return defaultBillingAddress
     */

    @JsonProperty("defaultBillingAddress")
    public Integer getDefaultBillingAddress();

    /**
     *  <p>The Stores of the Business Unit.</p>
     * @return stores
     */
    @Valid
    @JsonProperty("stores")
    public List<StoreKeyReference> getStores();

    /**
     *  <p>Custom fields for the Business Unit.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    /**
     *  <p>User-defined unique identifier. If a BusinessUnit with this <code>key</code> exists, it is updated with the imported data.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The name of the Business Unit.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>The status of the Business Unit.</p>
     * @param status value to be set
     */

    public void setStatus(final BusinessUnitStatus status);

    /**
     *  <p>The contact email address for the Business Unit.</p>
     * @param contactEmail value to be set
     */

    public void setContactEmail(final String contactEmail);

    /**
     *  <p>List of Associates to be assigned to the Business Unit.</p>
     * @param associates values to be set
     */

    @JsonIgnore
    public void setAssociates(final AssociateDraft... associates);

    /**
     *  <p>List of Associates to be assigned to the Business Unit.</p>
     * @param associates values to be set
     */

    public void setAssociates(final List<AssociateDraft> associates);

    /**
     *  <p>The addresses for the Business Unit.</p>
     * @param addresses values to be set
     */

    @JsonIgnore
    public void setAddresses(final Address... addresses);

    /**
     *  <p>The addresses for the Business Unit.</p>
     * @param addresses values to be set
     */

    public void setAddresses(final List<Address> addresses);

    /**
     *  <p>The indices of the shipping addresses in the <code>addresses</code> array.</p>
     * @param shippingAddresses values to be set
     */

    @JsonIgnore
    public void setShippingAddresses(final Integer... shippingAddresses);

    /**
     *  <p>The indices of the shipping addresses in the <code>addresses</code> array.</p>
     * @param shippingAddresses values to be set
     */

    public void setShippingAddresses(final List<Integer> shippingAddresses);

    /**
     *  <p>The index of the default shipping address in the <code>addresses</code> array.</p>
     * @param defaultShippingAddress value to be set
     */

    public void setDefaultShippingAddress(final Integer defaultShippingAddress);

    /**
     *  <p>The indices of the billing addresses in the <code>addresses</code> array.</p>
     * @param billingAddresses values to be set
     */

    @JsonIgnore
    public void setBillingAddresses(final Integer... billingAddresses);

    /**
     *  <p>The indices of the billing addresses in the <code>addresses</code> array.</p>
     * @param billingAddresses values to be set
     */

    public void setBillingAddresses(final List<Integer> billingAddresses);

    /**
     *  <p>The index of the default billing address in the <code>addresses</code> array.</p>
     * @param defaultBillingAddress value to be set
     */

    public void setDefaultBillingAddress(final Integer defaultBillingAddress);

    /**
     *  <p>The Stores of the Business Unit.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreKeyReference... stores);

    /**
     *  <p>The Stores of the Business Unit.</p>
     * @param stores values to be set
     */

    public void setStores(final List<StoreKeyReference> stores);

    /**
     *  <p>Custom fields for the Business Unit.</p>
     * @param custom value to be set
     */

    public void setCustom(final Custom custom);

    public BusinessUnitImport copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitImport deepCopy(@Nullable final BusinessUnitImport template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof BusinessUnitImportImpl)) {
            return template.copyDeep();
        }
        BusinessUnitImportImpl instance = new BusinessUnitImportImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setStatus(template.getStatus());
        instance.setContactEmail(template.getContactEmail());
        instance.setAssociates(Optional.ofNullable(template.getAssociates())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.business_units.AssociateDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAddresses(Optional.ofNullable(template.getAddresses())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.Address::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setShippingAddresses(
            Optional.ofNullable(template.getShippingAddresses()).map(ArrayList::new).orElse(null));
        instance.setDefaultShippingAddress(template.getDefaultShippingAddress());
        instance.setBillingAddresses(
            Optional.ofNullable(template.getBillingAddresses()).map(ArrayList::new).orElse(null));
        instance.setDefaultBillingAddress(template.getDefaultBillingAddress());
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.StoreKeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(com.commercetools.importapi.models.customfields.Custom.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder for company subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.business_units.CompanyBusinessUnitImportBuilder companyBuilder() {
        return com.commercetools.importapi.models.business_units.CompanyBusinessUnitImportBuilder.of();
    }

    /**
     * builder for division subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.business_units.DivisionBusinessUnitImportBuilder divisionBuilder() {
        return com.commercetools.importapi.models.business_units.DivisionBusinessUnitImportBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitImport(Function<BusinessUnitImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitImport>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitImport>";
            }
        };
    }
}
