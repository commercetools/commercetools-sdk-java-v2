
package com.commercetools.importapi.models.business_units;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Represents a <a href="https://docs.commercetools.com/apis/ctp:api:type:Company" rel="nofollow">Company</a>, the top-level of a business.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CompanyBusinessUnitImport companyBusinessUnitImport = CompanyBusinessUnitImport.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Company")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CompanyBusinessUnitImportImpl.class)
public interface CompanyBusinessUnitImport extends BusinessUnitImport {

    /**
     * discriminator value for CompanyBusinessUnitImport
     */
    String COMPANY = "Company";

    /**
     *
     * @return storeMode
     */

    @JsonProperty("storeMode")
    public BusinessUnitStoreMode getStoreMode();

    /**
     * set storeMode
     * @param storeMode value to be set
     */

    public void setStoreMode(final BusinessUnitStoreMode storeMode);

    /**
     * factory method
     * @return instance of CompanyBusinessUnitImport
     */
    public static CompanyBusinessUnitImport of() {
        return new CompanyBusinessUnitImportImpl();
    }

    /**
     * factory method to create a shallow copy CompanyBusinessUnitImport
     * @param template instance to be copied
     * @return copy instance
     */
    public static CompanyBusinessUnitImport of(final CompanyBusinessUnitImport template) {
        CompanyBusinessUnitImportImpl instance = new CompanyBusinessUnitImportImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setStatus(template.getStatus());
        instance.setContactEmail(template.getContactEmail());
        instance.setAssociates(template.getAssociates());
        instance.setAddresses(template.getAddresses());
        instance.setShippingAddresses(template.getShippingAddresses());
        instance.setDefaultShippingAddress(template.getDefaultShippingAddress());
        instance.setBillingAddresses(template.getBillingAddresses());
        instance.setDefaultBillingAddress(template.getDefaultBillingAddress());
        instance.setStores(template.getStores());
        instance.setCustom(template.getCustom());
        instance.setStoreMode(template.getStoreMode());
        return instance;
    }

    public CompanyBusinessUnitImport copyDeep();

    /**
     * factory method to create a deep copy of CompanyBusinessUnitImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CompanyBusinessUnitImport deepCopy(@Nullable final CompanyBusinessUnitImport template) {
        if (template == null) {
            return null;
        }
        CompanyBusinessUnitImportImpl instance = new CompanyBusinessUnitImportImpl();
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
        instance.setStoreMode(template.getStoreMode());
        return instance;
    }

    /**
     * builder factory method for CompanyBusinessUnitImport
     * @return builder
     */
    public static CompanyBusinessUnitImportBuilder builder() {
        return CompanyBusinessUnitImportBuilder.of();
    }

    /**
     * create builder for CompanyBusinessUnitImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CompanyBusinessUnitImportBuilder builder(final CompanyBusinessUnitImport template) {
        return CompanyBusinessUnitImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCompanyBusinessUnitImport(Function<CompanyBusinessUnitImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CompanyBusinessUnitImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CompanyBusinessUnitImport>() {
            @Override
            public String toString() {
                return "TypeReference<CompanyBusinessUnitImport>";
            }
        };
    }
}
