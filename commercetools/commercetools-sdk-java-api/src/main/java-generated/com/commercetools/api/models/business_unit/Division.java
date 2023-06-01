package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.business_unit.BusinessUnit;
import com.commercetools.api.models.business_unit.BusinessUnitAssociateMode;
import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.commercetools.api.models.business_unit.BusinessUnitStoreMode;
import com.commercetools.api.models.business_unit.BusinessUnitType;
import com.commercetools.api.models.business_unit.DivisionImpl;

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
 *  <p>Business Unit type to model divisions that are part of the Company or a higher-order Division. Contains specific fields and values that differentiate a Division from the generic BusinessUnit.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Division division = Division.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .key("{key}")
 *             .status(BusinessUnitStatus.ACTIVE)
 *             .storeMode(BusinessUnitStoreMode.EXPLICIT)
 *             .name("{name}")
 *             .plusAddresses(addressesBuilder -> addressesBuilder)
 *             .associateMode(BusinessUnitAssociateMode.EXPLICIT)
 *             .plusAssociates(associatesBuilder -> associatesBuilder)
 *             .parentUnit(parentUnitBuilder -> parentUnitBuilder)
 *             .topLevelUnit(topLevelUnitBuilder -> topLevelUnitBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = DivisionImpl.class)
public interface Division extends BusinessUnit {

    /**
     * discriminator value for Division
     */
    String DIVISION = "Division";

    /**
     *  <p>Parent unit of the Division.</p>
     * @return parentUnit
     */
    @NotNull
    @Valid
    @JsonProperty("parentUnit")
    public BusinessUnitKeyReference getParentUnit();
    /**
     *  <p>Defines whether the Stores of the Division are set explicitly or inherited from a parent Business Unit.</p>
     * @return storeMode
     */
    @NotNull
    @JsonProperty("storeMode")
    public BusinessUnitStoreMode getStoreMode();
    /**
     *  <p>Determines whether the Division can inherit Associates from a parent.</p>
     * @return associateMode
     */
    @NotNull
    @JsonProperty("associateMode")
    public BusinessUnitAssociateMode getAssociateMode();

    /**
     *  <p>Parent unit of the Division.</p>
     * @param parentUnit value to be set
     */
    
    public void setParentUnit(final BusinessUnitKeyReference parentUnit);
    
    
    /**
     *  <p>Defines whether the Stores of the Division are set explicitly or inherited from a parent Business Unit.</p>
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
     * @return instance of Division
     */
    public static Division of(){
        return new DivisionImpl();
    }
    

    /**
     * factory method to create a shallow copy Division
     * @param template instance to be copied
     * @return copy instance
     */
    public static Division of(final Division template) {
        DivisionImpl instance = new DivisionImpl();
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
        instance.setAssociateMode(template.getAssociateMode());
        instance.setAssociates(template.getAssociates());
        instance.setInheritedAssociates(template.getInheritedAssociates());
        instance.setParentUnit(template.getParentUnit());
        instance.setTopLevelUnit(template.getTopLevelUnit());
        return instance;
    }

    /**
     * factory method to create a deep copy of Division
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Division deepCopy(@Nullable final Division template) {
        if (template == null) {
            return null;
        }
        DivisionImpl instance = new DivisionImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setKey(template.getKey());
        instance.setStatus(template.getStatus());
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream().map(com.commercetools.api.models.store.StoreKeyReference::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setStoreMode(template.getStoreMode());
        instance.setName(template.getName());
        instance.setContactEmail(template.getContactEmail());
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setAddresses(Optional.ofNullable(template.getAddresses())
                .map(t -> t.stream().map(com.commercetools.api.models.common.Address::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setShippingAddressIds(Optional.ofNullable(template.getShippingAddressIds())
                .map(ArrayList::new)
                .orElse(null));
        instance.setDefaultShippingAddressId(template.getDefaultShippingAddressId());
        instance.setBillingAddressIds(Optional.ofNullable(template.getBillingAddressIds())
                .map(ArrayList::new)
                .orElse(null));
        instance.setDefaultBillingAddressId(template.getDefaultBillingAddressId());
        instance.setAssociateMode(template.getAssociateMode());
        instance.setAssociates(Optional.ofNullable(template.getAssociates())
                .map(t -> t.stream().map(com.commercetools.api.models.business_unit.Associate::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setInheritedAssociates(Optional.ofNullable(template.getInheritedAssociates())
                .map(t -> t.stream().map(com.commercetools.api.models.business_unit.InheritedAssociate::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setParentUnit(com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getParentUnit()));
        instance.setTopLevelUnit(com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getTopLevelUnit()));
        return instance;
    }

    /**
     * builder factory method for Division
     * @return builder
     */
    public static DivisionBuilder builder() {
        return DivisionBuilder.of();
    }
    
    /**
     * create builder for Division instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DivisionBuilder builder(final Division template) {
        return DivisionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDivision(Function<Division, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Division> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Division>() {
            @Override
            public String toString() {
                return "TypeReference<Division>";
            }
        };
    }
}
