package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerSetFirstNameActionImpl;

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
 *  <p>Setting the first name of the Customer produces the CustomerFirstNameSetMessage.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetFirstNameAction myCustomerSetFirstNameAction = MyCustomerSetFirstNameAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = MyCustomerSetFirstNameActionImpl.class)
public interface MyCustomerSetFirstNameAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerSetFirstNameAction
     */
    String SET_FIRST_NAME = "setFirstName";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return firstName
     */
    
    @JsonProperty("firstName")
    public String getFirstName();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param firstName value to be set
     */
    
    public void setFirstName(final String firstName);
    

    /**
     * factory method
     * @return instance of MyCustomerSetFirstNameAction
     */
    public static MyCustomerSetFirstNameAction of(){
        return new MyCustomerSetFirstNameActionImpl();
    }
    

    /**
     * factory method to create a shallow copy MyCustomerSetFirstNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerSetFirstNameAction of(final MyCustomerSetFirstNameAction template) {
        MyCustomerSetFirstNameActionImpl instance = new MyCustomerSetFirstNameActionImpl();
        instance.setFirstName(template.getFirstName());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCustomerSetFirstNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerSetFirstNameAction deepCopy(@Nullable final MyCustomerSetFirstNameAction template) {
        if (template == null) {
            return null;
        }
        MyCustomerSetFirstNameActionImpl instance = new MyCustomerSetFirstNameActionImpl();
        instance.setFirstName(template.getFirstName());
        return instance;
    }

    /**
     * builder factory method for MyCustomerSetFirstNameAction
     * @return builder
     */
    public static MyCustomerSetFirstNameActionBuilder builder() {
        return MyCustomerSetFirstNameActionBuilder.of();
    }
    
    /**
     * create builder for MyCustomerSetFirstNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetFirstNameActionBuilder builder(final MyCustomerSetFirstNameAction template) {
        return MyCustomerSetFirstNameActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerSetFirstNameAction(Function<MyCustomerSetFirstNameAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetFirstNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetFirstNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetFirstNameAction>";
            }
        };
    }
}
