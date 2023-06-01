package com.commercetools.api.models.me;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.me.MyBusinessUnitUpdateAction;
import com.commercetools.api.models.me.MyBusinessUnitRemoveAssociateActionImpl;

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
 *     MyBusinessUnitRemoveAssociateAction myBusinessUnitRemoveAssociateAction = MyBusinessUnitRemoveAssociateAction.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = MyBusinessUnitRemoveAssociateActionImpl.class)
public interface MyBusinessUnitRemoveAssociateAction extends MyBusinessUnitUpdateAction {

    /**
     * discriminator value for MyBusinessUnitRemoveAssociateAction
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
     * @return instance of MyBusinessUnitRemoveAssociateAction
     */
    public static MyBusinessUnitRemoveAssociateAction of(){
        return new MyBusinessUnitRemoveAssociateActionImpl();
    }
    

    /**
     * factory method to create a shallow copy MyBusinessUnitRemoveAssociateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitRemoveAssociateAction of(final MyBusinessUnitRemoveAssociateAction template) {
        MyBusinessUnitRemoveAssociateActionImpl instance = new MyBusinessUnitRemoveAssociateActionImpl();
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyBusinessUnitRemoveAssociateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyBusinessUnitRemoveAssociateAction deepCopy(@Nullable final MyBusinessUnitRemoveAssociateAction template) {
        if (template == null) {
            return null;
        }
        MyBusinessUnitRemoveAssociateActionImpl instance = new MyBusinessUnitRemoveAssociateActionImpl();
        instance.setCustomer(com.commercetools.api.models.customer.CustomerResourceIdentifier.deepCopy(template.getCustomer()));
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitRemoveAssociateAction
     * @return builder
     */
    public static MyBusinessUnitRemoveAssociateActionBuilder builder() {
        return MyBusinessUnitRemoveAssociateActionBuilder.of();
    }
    
    /**
     * create builder for MyBusinessUnitRemoveAssociateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitRemoveAssociateActionBuilder builder(final MyBusinessUnitRemoveAssociateAction template) {
        return MyBusinessUnitRemoveAssociateActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitRemoveAssociateAction(Function<MyBusinessUnitRemoveAssociateAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitRemoveAssociateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitRemoveAssociateAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitRemoveAssociateAction>";
            }
        };
    }
}
