package com.commercetools.api.models.me;

import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.commercetools.api.models.business_unit.BusinessUnitType;
import com.commercetools.api.models.me.MyBusinessUnitDraft;
import com.commercetools.api.models.me.MyDivisionDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Draft type to model divisions that are part of the Company or a higher-order Division. Contains the fields and values of the generic MyBusinessUnitDraft that are used specifically for creating a Division.</p>
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = MyDivisionDraftImpl.class)
public interface MyDivisionDraft extends MyBusinessUnitDraft, io.vrap.rmf.base.client.Draft<MyDivisionDraft> {

    /**
     * discriminator value for MyDivisionDraft
     */
    String DIVISION = "Division";

    /**
     *  <p>The parent unit of this Division. Can be a Company or a Division.</p>
     * @return parentUnit
     */
    @NotNull
    @Valid
    @JsonProperty("parentUnit")
    public BusinessUnitResourceIdentifier getParentUnit();

    /**
     *  <p>The parent unit of this Division. Can be a Company or a Division.</p>
     * @param parentUnit value to be set
     */
    
    public void setParentUnit(final BusinessUnitResourceIdentifier parentUnit);
    

    /**
     * factory method
     * @return instance of MyDivisionDraft
     */
    public static MyDivisionDraft of(){
        return new MyDivisionDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy MyDivisionDraft
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of MyDivisionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyDivisionDraft deepCopy(@Nullable final MyDivisionDraft template) {
        if (template == null) {
            return null;
        }
        MyDivisionDraftImpl instance = new MyDivisionDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setContactEmail(template.getContactEmail());
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setAddresses(Optional.ofNullable(template.getAddresses())
                .map(t -> t.stream().map(com.commercetools.api.models.common.BaseAddress::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setShippingAddresses(Optional.ofNullable(template.getShippingAddresses())
                .map(ArrayList::new)
                .orElse(null));
        instance.setDefaultShippingAddress(template.getDefaultShippingAddress());
        instance.setBillingAddresses(Optional.ofNullable(template.getBillingAddresses())
                .map(ArrayList::new)
                .orElse(null));
        instance.setDefaultBillingAddress(template.getDefaultBillingAddress());
        instance.setParentUnit(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier.deepCopy(template.getParentUnit()));
        return instance;
    }

    /**
     * builder factory method for MyDivisionDraft
     * @return builder
     */
    public static MyDivisionDraftBuilder builder() {
        return MyDivisionDraftBuilder.of();
    }
    
    /**
     * create builder for MyDivisionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyDivisionDraftBuilder builder(final MyDivisionDraft template) {
        return MyDivisionDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyDivisionDraft(Function<MyDivisionDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyDivisionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyDivisionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyDivisionDraft>";
            }
        };
    }
}
