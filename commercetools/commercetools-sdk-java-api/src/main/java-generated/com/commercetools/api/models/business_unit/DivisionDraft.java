package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.business_unit.BusinessUnitAssociateMode;
import com.commercetools.api.models.business_unit.BusinessUnitDraft;
import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.commercetools.api.models.business_unit.BusinessUnitStoreMode;
import com.commercetools.api.models.business_unit.BusinessUnitType;
import com.commercetools.api.models.business_unit.DivisionDraftImpl;

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
 *  <p>Draft type to model divisions that are part of a Company or a higher-order Division. Contains the fields and values of the generic BusinessUnitDraft that are used specifically for creating a Division.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DivisionDraft divisionDraft = DivisionDraft.builder()
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
@JsonDeserialize(as = DivisionDraftImpl.class)
public interface DivisionDraft extends BusinessUnitDraft, io.vrap.rmf.base.client.Draft<DivisionDraft> {

    /**
     * discriminator value for DivisionDraft
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
     *  <p>If not set, the Division inherits the Stores from a parent unit. Set this to <code>Explicit</code> if you want to set the Stores explicitly in the <code>stores</code> field instead.</p>
     * @return storeMode
     */
    
    @JsonProperty("storeMode")
    public BusinessUnitStoreMode getStoreMode();
    /**
     *  <p>Determines whether the Division can inherit Associates from a parent.</p>
     * @return associateMode
     */
    
    @JsonProperty("associateMode")
    public BusinessUnitAssociateMode getAssociateMode();

    /**
     *  <p>The parent unit of this Division. Can be a Company or a Division.</p>
     * @param parentUnit value to be set
     */
    
    public void setParentUnit(final BusinessUnitResourceIdentifier parentUnit);
    
    
    /**
     *  <p>If not set, the Division inherits the Stores from a parent unit. Set this to <code>Explicit</code> if you want to set the Stores explicitly in the <code>stores</code> field instead.</p>
     * @param storeMode value to be set
     */
    
    public void setStoreMode(final BusinessUnitStoreMode storeMode);
    
    
    /**
     *  <p>Determines whether the Division can inherit Associates from a parent.</p>
     * @param associateMode value to be set
     */
    
    public void setAssociateMode(final BusinessUnitAssociateMode associateMode);
    

    /**
     * factory method
     * @return instance of DivisionDraft
     */
    public static DivisionDraft of(){
        return new DivisionDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy DivisionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static DivisionDraft of(final DivisionDraft template) {
        DivisionDraftImpl instance = new DivisionDraftImpl();
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
        instance.setParentUnit(template.getParentUnit());
        return instance;
    }

    /**
     * factory method to create a deep copy of DivisionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DivisionDraft deepCopy(@Nullable final DivisionDraft template) {
        if (template == null) {
            return null;
        }
        DivisionDraftImpl instance = new DivisionDraftImpl();
        instance.setKey(template.getKey());
        instance.setStatus(template.getStatus());
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream().map(com.commercetools.api.models.store.StoreResourceIdentifier::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setStoreMode(template.getStoreMode());
        instance.setName(template.getName());
        instance.setContactEmail(template.getContactEmail());
        instance.setAssociateMode(template.getAssociateMode());
        instance.setAssociates(Optional.ofNullable(template.getAssociates())
                .map(t -> t.stream().map(com.commercetools.api.models.business_unit.AssociateDraft::deepCopy).collect(Collectors.toList()))
                .orElse(null));
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
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        instance.setParentUnit(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier.deepCopy(template.getParentUnit()));
        return instance;
    }

    /**
     * builder factory method for DivisionDraft
     * @return builder
     */
    public static DivisionDraftBuilder builder() {
        return DivisionDraftBuilder.of();
    }
    
    /**
     * create builder for DivisionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DivisionDraftBuilder builder(final DivisionDraft template) {
        return DivisionDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDivisionDraft(Function<DivisionDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DivisionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DivisionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DivisionDraft>";
            }
        };
    }
}
