
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Business Unit type to represent the top level of a business. Contains specific fields and values that differentiate a Company from the generic BusinessUnit.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Company company = Company.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .key("{key}")
 *             .status(BusinessUnitStatus.ACTIVE)
 *             .storeMode(BusinessUnitStoreMode.EXPLICIT)
 *             .name("{name}")
 *             .plusAddresses(addressesBuilder -> addressesBuilder)
 *             .plusAssociates(associatesBuilder -> associatesBuilder)
 *             .topLevelUnit(topLevelUnitBuilder -> topLevelUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CompanyImpl.class)
public interface Company extends BusinessUnit {

    /**
     * discriminator value for Company
     */
    String COMPANY = "Company";

    /**
     *  <p>Is always <code>Explicit</code> since a Company does not have a parent Business Unit the Stores can be inherited from.</p>
     * @return storeMode
     */
    @NotNull
    @JsonProperty("storeMode")
    public BusinessUnitStoreMode getStoreMode();

    /**
     *  <p>Is always <code>Explicit</code> since a Company does not have a parent Business Unit the Stores can be inherited from.</p>
     * @param storeMode value to be set
     */

    public void setStoreMode(final BusinessUnitStoreMode storeMode);

    /**
     * factory method
     * @return instance of Company
     */
    public static Company of() {
        return new CompanyImpl();
    }

    /**
     * factory method to copy an instance of Company
     * @param template instance to be copied
     * @return copy instance
     */
    public static Company of(final Company template) {
        CompanyImpl instance = new CompanyImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setStatus(template.getStatus());
        instance.setStores(template.getStores());
        instance.setStoreMode(template.getStoreMode());
        instance.setName(template.getName());
        instance.setContactEmail(template.getContactEmail());
        instance.setCustom(template.getCustom());
        instance.setAddresses(template.getAddresses());
        instance.setShippingAddressIds(template.getShippingAddressIds());
        instance.setDefaultShippingAddressId(template.getDefaultShippingAddressId());
        instance.setBillingAddressIds(template.getBillingAddressIds());
        instance.setDefaultBillingAddressId(template.getDefaultBillingAddressId());
        instance.setAssociates(template.getAssociates());
        instance.setParentUnit(template.getParentUnit());
        instance.setTopLevelUnit(template.getTopLevelUnit());
        return instance;
    }

    /**
     * builder factory method for Company
     * @return builder
     */
    public static CompanyBuilder builder() {
        return CompanyBuilder.of();
    }

    /**
     * create builder for Company instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CompanyBuilder builder(final Company template) {
        return CompanyBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCompany(Function<Company, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Company> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Company>() {
            @Override
            public String toString() {
                return "TypeReference<Company>";
            }
        };
    }
}
