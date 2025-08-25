
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>This action generates a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitTypeSetMessage" rel="nofollow">BusinessUnitTypeSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetUnitTypeAction businessUnitSetUnitTypeAction = BusinessUnitSetUnitTypeAction.builder()
 *             .unitType(BusinessUnitType.COMPANY)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setUnitType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSetUnitTypeActionImpl.class)
public interface BusinessUnitSetUnitTypeAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitSetUnitTypeAction
     */
    String SET_UNIT_TYPE = "setUnitType";

    /**
     *  <p>New type of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     *  <p>If <code>unitType="Company"</code>, the Business Unit <code>storeMode</code>, <code>associateMode</code>, and <code>approvalRuleMode</code> field values must be <code>Explicit</code>.</p>
     * @return unitType
     */
    @NotNull
    @JsonProperty("unitType")
    public BusinessUnitType getUnitType();

    /**
     *  <p>New parent unit for the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>, if <code>unitType="Division"</code>.</p>
     * @return parentUnit
     */
    @Valid
    @JsonProperty("parentUnit")
    public BusinessUnitResourceIdentifier getParentUnit();

    /**
     *  <p>New type of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     *  <p>If <code>unitType="Company"</code>, the Business Unit <code>storeMode</code>, <code>associateMode</code>, and <code>approvalRuleMode</code> field values must be <code>Explicit</code>.</p>
     * @param unitType value to be set
     */

    public void setUnitType(final BusinessUnitType unitType);

    /**
     *  <p>New parent unit for the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>, if <code>unitType="Division"</code>.</p>
     * @param parentUnit value to be set
     */

    public void setParentUnit(final BusinessUnitResourceIdentifier parentUnit);

    /**
     * factory method
     * @return instance of BusinessUnitSetUnitTypeAction
     */
    public static BusinessUnitSetUnitTypeAction of() {
        return new BusinessUnitSetUnitTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitSetUnitTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitSetUnitTypeAction of(final BusinessUnitSetUnitTypeAction template) {
        BusinessUnitSetUnitTypeActionImpl instance = new BusinessUnitSetUnitTypeActionImpl();
        instance.setUnitType(template.getUnitType());
        instance.setParentUnit(template.getParentUnit());
        return instance;
    }

    public BusinessUnitSetUnitTypeAction copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitSetUnitTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitSetUnitTypeAction deepCopy(@Nullable final BusinessUnitSetUnitTypeAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitSetUnitTypeActionImpl instance = new BusinessUnitSetUnitTypeActionImpl();
        instance.setUnitType(template.getUnitType());
        instance.setParentUnit(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier
                .deepCopy(template.getParentUnit()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitSetUnitTypeAction
     * @return builder
     */
    public static BusinessUnitSetUnitTypeActionBuilder builder() {
        return BusinessUnitSetUnitTypeActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitSetUnitTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSetUnitTypeActionBuilder builder(final BusinessUnitSetUnitTypeAction template) {
        return BusinessUnitSetUnitTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitSetUnitTypeAction(Function<BusinessUnitSetUnitTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetUnitTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetUnitTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetUnitTypeAction>";
            }
        };
    }
}
