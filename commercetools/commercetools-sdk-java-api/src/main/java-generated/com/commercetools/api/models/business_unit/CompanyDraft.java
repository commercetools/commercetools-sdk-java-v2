
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Draft type to represent the top level of a business. Contains the fields and values of the generic [BusinessUnitDraft](ctp:api:type:BusinessUnitDraft] that are used specifically for creating a Company.</p>
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
public interface CompanyDraft extends BusinessUnitDraft {

    String COMPANY = "Company";

    public static CompanyDraft of() {
        return new CompanyDraftImpl();
    }

    public static CompanyDraft of(final CompanyDraft template) {
        CompanyDraftImpl instance = new CompanyDraftImpl();
        instance.setKey(template.getKey());
        instance.setStatus(template.getStatus());
        instance.setStores(template.getStores());
        instance.setStoreMode(template.getStoreMode());
        instance.setName(template.getName());
        instance.setContactEmail(template.getContactEmail());
        instance.setAssociates(template.getAssociates());
        instance.setAddresses(template.getAddresses());
        instance.setShippingAddresses(template.getShippingAddresses());
        instance.setDefaultShippingAddress(template.getDefaultShippingAddress());
        instance.setBillingAddresses(template.getBillingAddresses());
        instance.setDefaultBillingAddress(template.getDefaultBillingAddress());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static CompanyDraftBuilder builder() {
        return CompanyDraftBuilder.of();
    }

    public static CompanyDraftBuilder builder(final CompanyDraft template) {
        return CompanyDraftBuilder.of(template);
    }

    default <T> T withCompanyDraft(Function<CompanyDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CompanyDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CompanyDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CompanyDraft>";
            }
        };
    }
}
