
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Draft type to represent the top level of a business. Contains the fields and values of the generic MyBusinessUnitDraft that are used specifically for creating a Company.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCompanyDraft myCompanyDraft = MyCompanyDraft.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCompanyDraftImpl.class)
public interface MyCompanyDraft extends MyBusinessUnitDraft, io.vrap.rmf.base.client.Draft<MyCompanyDraft> {

    /**
     * discriminator value for MyCompanyDraft
     */
    String COMPANY = "Company";

    /**
     * factory method
     * @return instance of MyCompanyDraft
     */
    public static MyCompanyDraft of() {
        return new MyCompanyDraftImpl();
    }

    /**
     * factory method to copy an instance of MyCompanyDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCompanyDraft of(final MyCompanyDraft template) {
        MyCompanyDraftImpl instance = new MyCompanyDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setContactEmail(template.getContactEmail());
        instance.setCustom(template.getCustom());
        instance.setAddresses(template.getAddresses());
        instance.setShippingAddresses(template.getShippingAddresses());
        instance.setDefaultShippingAddress(template.getDefaultShippingAddress());
        instance.setBillingAddresses(template.getBillingAddresses());
        instance.setDefaultBillingAddress(template.getDefaultBillingAddress());
        return instance;
    }

    /**
     * builder factory method for MyCompanyDraft
     * @return builder
     */
    public static MyCompanyDraftBuilder builder() {
        return MyCompanyDraftBuilder.of();
    }

    /**
     * create builder for MyCompanyDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCompanyDraftBuilder builder(final MyCompanyDraft template) {
        return MyCompanyDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCompanyDraft(Function<MyCompanyDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCompanyDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCompanyDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyCompanyDraft>";
            }
        };
    }
}
