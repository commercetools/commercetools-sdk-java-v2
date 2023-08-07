
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changing the parent of a Business Unit generates a BusinessUnitParentChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitChangeParentUnitAction businessUnitChangeParentUnitAction = BusinessUnitChangeParentUnitAction.builder()
 *             .parentUnit(parentUnitBuilder -> parentUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitChangeParentUnitActionImpl.class)
public interface BusinessUnitChangeParentUnitAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitChangeParentUnitAction
     */
    String CHANGE_PARENT_UNIT = "changeParentUnit";

    /**
     *  <p>New parent unit of the Business Unit. The new parent unit must have the same top-level unit as the old parent unit.</p>
     * @return parentUnit
     */
    @NotNull
    @Valid
    @JsonProperty("parentUnit")
    public BusinessUnitResourceIdentifier getParentUnit();

    /**
     *  <p>New parent unit of the Business Unit. The new parent unit must have the same top-level unit as the old parent unit.</p>
     * @param parentUnit value to be set
     */

    public void setParentUnit(final BusinessUnitResourceIdentifier parentUnit);

    /**
     * factory method
     * @return instance of BusinessUnitChangeParentUnitAction
     */
    public static BusinessUnitChangeParentUnitAction of() {
        return new BusinessUnitChangeParentUnitActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitChangeParentUnitAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitChangeParentUnitAction of(final BusinessUnitChangeParentUnitAction template) {
        BusinessUnitChangeParentUnitActionImpl instance = new BusinessUnitChangeParentUnitActionImpl();
        instance.setParentUnit(template.getParentUnit());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitChangeParentUnitAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitChangeParentUnitAction deepCopy(
            @Nullable final BusinessUnitChangeParentUnitAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitChangeParentUnitActionImpl instance = new BusinessUnitChangeParentUnitActionImpl();
        instance.setParentUnit(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier
                .deepCopy(template.getParentUnit()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitChangeParentUnitAction
     * @return builder
     */
    public static BusinessUnitChangeParentUnitActionBuilder builder() {
        return BusinessUnitChangeParentUnitActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitChangeParentUnitAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitChangeParentUnitActionBuilder builder(final BusinessUnitChangeParentUnitAction template) {
        return BusinessUnitChangeParentUnitActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitChangeParentUnitAction(Function<BusinessUnitChangeParentUnitAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeParentUnitAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeParentUnitAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitChangeParentUnitAction>";
            }
        };
    }
}
