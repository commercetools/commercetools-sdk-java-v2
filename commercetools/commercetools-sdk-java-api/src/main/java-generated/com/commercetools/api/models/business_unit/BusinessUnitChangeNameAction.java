package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.business_unit.BusinessUnitUpdateAction;
import com.commercetools.api.models.business_unit.BusinessUnitChangeNameActionImpl;

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
 *  <p>Updating the name on a Business Unit generates a BusinessUnitNameChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitChangeNameAction businessUnitChangeNameAction = BusinessUnitChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = BusinessUnitChangeNameActionImpl.class)
public interface BusinessUnitChangeNameAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitChangeNameAction
     */
    String CHANGE_NAME = "changeName";

    /**
     *  <p>New name to set.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>New name to set.</p>
     * @param name value to be set
     */
    
    public void setName(final String name);
    

    /**
     * factory method
     * @return instance of BusinessUnitChangeNameAction
     */
    public static BusinessUnitChangeNameAction of(){
        return new BusinessUnitChangeNameActionImpl();
    }
    

    /**
     * factory method to create a shallow copy BusinessUnitChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitChangeNameAction of(final BusinessUnitChangeNameAction template) {
        BusinessUnitChangeNameActionImpl instance = new BusinessUnitChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitChangeNameAction deepCopy(@Nullable final BusinessUnitChangeNameAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitChangeNameActionImpl instance = new BusinessUnitChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitChangeNameAction
     * @return builder
     */
    public static BusinessUnitChangeNameActionBuilder builder() {
        return BusinessUnitChangeNameActionBuilder.of();
    }
    
    /**
     * create builder for BusinessUnitChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitChangeNameActionBuilder builder(final BusinessUnitChangeNameAction template) {
        return BusinessUnitChangeNameActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitChangeNameAction(Function<BusinessUnitChangeNameAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitChangeNameAction>";
            }
        };
    }
}
