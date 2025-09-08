
package com.commercetools.importapi.models.business_units;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.BusinessUnitKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents a <a href="https://docs.commercetools.com/apis/ctp:api:type:Division" rel="nofollow">Division</a>, a sub-unit of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Company" rel="nofollow">Company</a> or another Division.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DivisionBusinessUnitImport divisionBusinessUnitImport = DivisionBusinessUnitImport.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .parentUnit(parentUnitBuilder -> parentUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Division")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DivisionBusinessUnitImportImpl.class)
public interface DivisionBusinessUnitImport extends BusinessUnitImport {

    /**
     * discriminator value for DivisionBusinessUnitImport
     */
    String DIVISION = "Division";

    /**
     *  <p>If <code>Explicit</code>, the <code>stores</code> field cannot be empty and the Business Unit is explicitly associated with the given Stores. If <code>FromParent</code>, the Business Unit inherits the Stores from its parent.</p>
     * @return storeMode
     */

    @JsonProperty("storeMode")
    public BusinessUnitStoreMode getStoreMode();

    /**
     *  <p>The parent Business Unit of this Division.</p>
     * @return parentUnit
     */
    @NotNull
    @Valid
    @JsonProperty("parentUnit")
    public BusinessUnitKeyReference getParentUnit();

    /**
     *  <p>If <code>Explicit</code>, Associates are not inherited from the parent. If <code>ExplicitAndFromParent</code>, Associates are inherited from the parent.</p>
     * @return associateMode
     */

    @JsonProperty("associateMode")
    public BusinessUnitAssociateMode getAssociateMode();

    /**
     *  <p>If <code>Explicit</code>, approval rules are not inherited from the parent. If <code>ExplicitAndFromParent</code>, approval rules are inherited from the parent.</p>
     * @return approvalRuleMode
     */

    @JsonProperty("approvalRuleMode")
    public BusinessUnitApprovalRuleMode getApprovalRuleMode();

    /**
     *  <p>If <code>Explicit</code>, the <code>stores</code> field cannot be empty and the Business Unit is explicitly associated with the given Stores. If <code>FromParent</code>, the Business Unit inherits the Stores from its parent.</p>
     * @param storeMode value to be set
     */

    public void setStoreMode(final BusinessUnitStoreMode storeMode);

    /**
     *  <p>The parent Business Unit of this Division.</p>
     * @param parentUnit value to be set
     */

    public void setParentUnit(final BusinessUnitKeyReference parentUnit);

    /**
     *  <p>If <code>Explicit</code>, Associates are not inherited from the parent. If <code>ExplicitAndFromParent</code>, Associates are inherited from the parent.</p>
     * @param associateMode value to be set
     */

    public void setAssociateMode(final BusinessUnitAssociateMode associateMode);

    /**
     *  <p>If <code>Explicit</code>, approval rules are not inherited from the parent. If <code>ExplicitAndFromParent</code>, approval rules are inherited from the parent.</p>
     * @param approvalRuleMode value to be set
     */

    public void setApprovalRuleMode(final BusinessUnitApprovalRuleMode approvalRuleMode);

    /**
     * factory method
     * @return instance of DivisionBusinessUnitImport
     */
    public static DivisionBusinessUnitImport of() {
        return new DivisionBusinessUnitImportImpl();
    }

    /**
     * factory method to create a shallow copy DivisionBusinessUnitImport
     * @param template instance to be copied
     * @return copy instance
     */
    public static DivisionBusinessUnitImport of(final DivisionBusinessUnitImport template) {
        DivisionBusinessUnitImportImpl instance = new DivisionBusinessUnitImportImpl();
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
        instance.setParentUnit(template.getParentUnit());
        instance.setAssociateMode(template.getAssociateMode());
        instance.setApprovalRuleMode(template.getApprovalRuleMode());
        return instance;
    }

    public DivisionBusinessUnitImport copyDeep();

    /**
     * factory method to create a deep copy of DivisionBusinessUnitImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DivisionBusinessUnitImport deepCopy(@Nullable final DivisionBusinessUnitImport template) {
        if (template == null) {
            return null;
        }
        DivisionBusinessUnitImportImpl instance = new DivisionBusinessUnitImportImpl();
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
        instance.setParentUnit(
            com.commercetools.importapi.models.common.BusinessUnitKeyReference.deepCopy(template.getParentUnit()));
        instance.setAssociateMode(template.getAssociateMode());
        instance.setApprovalRuleMode(template.getApprovalRuleMode());
        return instance;
    }

    /**
     * builder factory method for DivisionBusinessUnitImport
     * @return builder
     */
    public static DivisionBusinessUnitImportBuilder builder() {
        return DivisionBusinessUnitImportBuilder.of();
    }

    /**
     * create builder for DivisionBusinessUnitImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DivisionBusinessUnitImportBuilder builder(final DivisionBusinessUnitImport template) {
        return DivisionBusinessUnitImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDivisionBusinessUnitImport(Function<DivisionBusinessUnitImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DivisionBusinessUnitImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DivisionBusinessUnitImport>() {
            @Override
            public String toString() {
                return "TypeReference<DivisionBusinessUnitImport>";
            }
        };
    }
}
