
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Draft type to represent the top level of a business. Contains the fields and values of the generic BusinessUnitDraft that are used specifically for creating a Company.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CompanyDraft companyDraft = CompanyDraft.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CompanyDraftImpl.class)
public interface CompanyDraft extends BusinessUnitDraft, io.vrap.rmf.base.client.Draft<CompanyDraft> {

    /**
     * discriminator value for CompanyDraft
     */
    String COMPANY = "Company";

    /**
     * factory method
     * @return instance of CompanyDraft
     */
    public static CompanyDraft of() {
        return new CompanyDraftImpl();
    }

    /**
     * factory method to create a shallow copy CompanyDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CompanyDraft of(final CompanyDraft template) {
        CompanyDraftImpl instance = new CompanyDraftImpl();
        instance.setKey(template.getKey());
        instance.setStatus(template.getStatus());
        instance.setStores(template.getStores());
        instance.setStoreMode(template.getStoreMode());
        instance.setName(template.getName());
        instance.setContactEmail(template.getContactEmail());
        instance.setAssociateMode(template.getAssociateMode());
        instance.setAssociates(template.getAssociates());
        instance.setAddresses(template.getAddresses());
        instance.setShippingAddresses(template.getShippingAddresses());
        instance.setDefaultShippingAddress(template.getDefaultShippingAddress());
        instance.setBillingAddresses(template.getBillingAddresses());
        instance.setDefaultBillingAddress(template.getDefaultBillingAddress());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of CompanyDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CompanyDraft deepCopy(@Nullable final CompanyDraft template) {
        if (template == null) {
            return null;
        }
        CompanyDraftImpl instance = new CompanyDraftImpl();
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
     * builder factory method for CompanyDraft
     * @return builder
     */
    public static CompanyDraftBuilder builder() {
        return CompanyDraftBuilder.of();
    }

    /**
     * create builder for CompanyDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CompanyDraftBuilder builder(final CompanyDraft template) {
        return CompanyDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCompanyDraft(Function<CompanyDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CompanyDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CompanyDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CompanyDraft>";
            }
        };
    }
}
