package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.business_unit.BusinessUnitUpdateAction;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.business_unit.BusinessUnitRemoveAssociateActionImpl;

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
 *  <p>Removing an Associate from a Business Unit generates a BusinessUnitAssociateRemoved Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitRemoveAssociateAction businessUnitRemoveAssociateAction = BusinessUnitRemoveAssociateAction.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = BusinessUnitRemoveAssociateActionImpl.class)
public interface BusinessUnitRemoveAssociateAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitRemoveAssociateAction
     */
    String REMOVE_ASSOCIATE = "removeAssociate";

    /**
     *  <p>Associate to remove.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    /**
     *  <p>Associate to remove.</p>
     * @param customer value to be set
     */
    
    public void setCustomer(final CustomerResourceIdentifier customer);
    

    /**
     * factory method
     * @return instance of BusinessUnitRemoveAssociateAction
     */
    public static BusinessUnitRemoveAssociateAction of(){
        return new BusinessUnitRemoveAssociateActionImpl();
    }
    

    /**
     * factory method to create a shallow copy BusinessUnitRemoveAssociateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitRemoveAssociateAction of(final BusinessUnitRemoveAssociateAction template) {
        BusinessUnitRemoveAssociateActionImpl instance = new BusinessUnitRemoveAssociateActionImpl();
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitRemoveAssociateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitRemoveAssociateAction deepCopy(@Nullable final BusinessUnitRemoveAssociateAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitRemoveAssociateActionImpl instance = new BusinessUnitRemoveAssociateActionImpl();
        instance.setCustomer(com.commercetools.api.models.customer.CustomerResourceIdentifier.deepCopy(template.getCustomer()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitRemoveAssociateAction
     * @return builder
     */
    public static BusinessUnitRemoveAssociateActionBuilder builder() {
        return BusinessUnitRemoveAssociateActionBuilder.of();
    }
    
    /**
     * create builder for BusinessUnitRemoveAssociateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitRemoveAssociateActionBuilder builder(final BusinessUnitRemoveAssociateAction template) {
        return BusinessUnitRemoveAssociateActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitRemoveAssociateAction(Function<BusinessUnitRemoveAssociateAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveAssociateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveAssociateAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitRemoveAssociateAction>";
            }
        };
    }
}
