package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerSetLastNameActionImpl;

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
 *  <p>Setting the last name of the Customer produces the CustomerLastNameSetMessage.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetLastNameAction myCustomerSetLastNameAction = MyCustomerSetLastNameAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = MyCustomerSetLastNameActionImpl.class)
public interface MyCustomerSetLastNameAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerSetLastNameAction
     */
    String SET_LAST_NAME = "setLastName";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return lastName
     */
    
    @JsonProperty("lastName")
    public String getLastName();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param lastName value to be set
     */
    
    public void setLastName(final String lastName);
    

    /**
     * factory method
     * @return instance of MyCustomerSetLastNameAction
     */
    public static MyCustomerSetLastNameAction of(){
        return new MyCustomerSetLastNameActionImpl();
    }
    

    /**
     * factory method to create a shallow copy MyCustomerSetLastNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerSetLastNameAction of(final MyCustomerSetLastNameAction template) {
        MyCustomerSetLastNameActionImpl instance = new MyCustomerSetLastNameActionImpl();
        instance.setLastName(template.getLastName());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCustomerSetLastNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerSetLastNameAction deepCopy(@Nullable final MyCustomerSetLastNameAction template) {
        if (template == null) {
            return null;
        }
        MyCustomerSetLastNameActionImpl instance = new MyCustomerSetLastNameActionImpl();
        instance.setLastName(template.getLastName());
        return instance;
    }

    /**
     * builder factory method for MyCustomerSetLastNameAction
     * @return builder
     */
    public static MyCustomerSetLastNameActionBuilder builder() {
        return MyCustomerSetLastNameActionBuilder.of();
    }
    
    /**
     * create builder for MyCustomerSetLastNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetLastNameActionBuilder builder(final MyCustomerSetLastNameAction template) {
        return MyCustomerSetLastNameActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerSetLastNameAction(Function<MyCustomerSetLastNameAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetLastNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetLastNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetLastNameAction>";
            }
        };
    }
}
