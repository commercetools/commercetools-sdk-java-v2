
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Business Unit type to model divisions that are part of the Company or a higher order Division. Contains specific fields and values that differentiate a Division from the generic BusinessUnit.</p>
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
 *             .plusAssociates(associatesBuilder -> associatesBuilder)
 *             .parentUnit(parentUnitBuilder -> parentUnitBuilder)
 *             .topLevelUnit(topLevelUnitBuilder -> topLevelUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DivisionImpl.class)
public interface Division extends BusinessUnit {

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

    public void setParentUnit(final BusinessUnitKeyReference parentUnit);

    public void setStoreMode(final BusinessUnitStoreMode storeMode);

    public static Division of() {
        return new DivisionImpl();
    }

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
        instance.setAssociates(template.getAssociates());
        instance.setParentUnit(template.getParentUnit());
        instance.setTopLevelUnit(template.getTopLevelUnit());
        return instance;
    }

    public static DivisionBuilder builder() {
        return DivisionBuilder.of();
    }

    public static DivisionBuilder builder(final Division template) {
        return DivisionBuilder.of(template);
    }

    default <T> T withDivision(Function<Division, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Division> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Division>() {
            @Override
            public String toString() {
                return "TypeReference<Division>";
            }
        };
    }
}
