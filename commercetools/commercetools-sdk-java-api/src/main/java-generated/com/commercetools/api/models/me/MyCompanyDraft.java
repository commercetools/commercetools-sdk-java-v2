
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

    String COMPANY = "Company";

    public static MyCompanyDraft of() {
        return new MyCompanyDraftImpl();
    }

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

    public static MyCompanyDraftBuilder builder() {
        return MyCompanyDraftBuilder.of();
    }

    public static MyCompanyDraftBuilder builder(final MyCompanyDraft template) {
        return MyCompanyDraftBuilder.of(template);
    }

    default <T> T withMyCompanyDraft(Function<MyCompanyDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCompanyDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCompanyDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyCompanyDraft>";
            }
        };
    }
}
