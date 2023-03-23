
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
 *  <p>Changing the parent of a Business Unit generates a BusinessUnitParentUnitChanged Message.</p>
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

    String CHANGE_PARENT_UNIT = "changeParentUnit";

    /**
     *  <p>New parent unit of the Business Unit.</p>
     * @return parentUnit
     */
    @NotNull
    @Valid
    @JsonProperty("parentUnit")
    public BusinessUnitResourceIdentifier getParentUnit();

    public void setParentUnit(final BusinessUnitResourceIdentifier parentUnit);

    public static BusinessUnitChangeParentUnitAction of() {
        return new BusinessUnitChangeParentUnitActionImpl();
    }

    public static BusinessUnitChangeParentUnitAction of(final BusinessUnitChangeParentUnitAction template) {
        BusinessUnitChangeParentUnitActionImpl instance = new BusinessUnitChangeParentUnitActionImpl();
        instance.setParentUnit(template.getParentUnit());
        return instance;
    }

    public static BusinessUnitChangeParentUnitActionBuilder builder() {
        return BusinessUnitChangeParentUnitActionBuilder.of();
    }

    public static BusinessUnitChangeParentUnitActionBuilder builder(final BusinessUnitChangeParentUnitAction template) {
        return BusinessUnitChangeParentUnitActionBuilder.of(template);
    }

    default <T> T withBusinessUnitChangeParentUnitAction(Function<BusinessUnitChangeParentUnitAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeParentUnitAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeParentUnitAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitChangeParentUnitAction>";
            }
        };
    }
}
