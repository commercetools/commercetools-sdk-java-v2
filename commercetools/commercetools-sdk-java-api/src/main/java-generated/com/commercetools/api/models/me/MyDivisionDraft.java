
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Draft type to model divisions that are part of the Company or a higher order Division. Contains the fields and values of the generic MyBusinessUnitDraft that are used specifically for creating a Division.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyDivisionDraft myDivisionDraft = MyDivisionDraft.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .parentUnit(parentUnitBuilder -> parentUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyDivisionDraftImpl.class)
public interface MyDivisionDraft extends MyBusinessUnitDraft {

    String DIVISION = "Division";

    /**
     *  <p>The parent unit of this Division. Can be a Company or a Division.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("parentUnit")
    public BusinessUnitResourceIdentifier getParentUnit();

    public void setParentUnit(final BusinessUnitResourceIdentifier parentUnit);

    public static MyDivisionDraft of() {
        return new MyDivisionDraftImpl();
    }

    public static MyDivisionDraft of(final MyDivisionDraft template) {
        MyDivisionDraftImpl instance = new MyDivisionDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setContactEmail(template.getContactEmail());
        instance.setCustom(template.getCustom());
        instance.setAddresses(template.getAddresses());
        instance.setShippingAddresses(template.getShippingAddresses());
        instance.setDefaultShippingAddress(template.getDefaultShippingAddress());
        instance.setBillingAddresses(template.getBillingAddresses());
        instance.setDefaultBillingAddress(template.getDefaultBillingAddress());
        instance.setParentUnit(template.getParentUnit());
        return instance;
    }

    public static MyDivisionDraftBuilder builder() {
        return MyDivisionDraftBuilder.of();
    }

    public static MyDivisionDraftBuilder builder(final MyDivisionDraft template) {
        return MyDivisionDraftBuilder.of(template);
    }

    default <T> T withMyDivisionDraft(Function<MyDivisionDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyDivisionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyDivisionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyDivisionDraft>";
            }
        };
    }
}
