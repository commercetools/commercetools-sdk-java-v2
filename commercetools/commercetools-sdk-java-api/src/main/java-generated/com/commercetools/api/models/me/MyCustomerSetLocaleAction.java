package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerSetLocaleActionImpl;

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
 * MyCustomerSetLocaleAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetLocaleAction myCustomerSetLocaleAction = MyCustomerSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = MyCustomerSetLocaleActionImpl.class)
public interface MyCustomerSetLocaleAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerSetLocaleAction
     */
    String SET_LOCALE = "setLocale";

    /**
     *  <p>Value to set. Must be one of the languages supported by the Project.</p>
     * @return locale
     */
    
    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>Value to set. Must be one of the languages supported by the Project.</p>
     * @param locale value to be set
     */
    
    public void setLocale(final String locale);
    

    /**
     * factory method
     * @return instance of MyCustomerSetLocaleAction
     */
    public static MyCustomerSetLocaleAction of(){
        return new MyCustomerSetLocaleActionImpl();
    }
    

    /**
     * factory method to create a shallow copy MyCustomerSetLocaleAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerSetLocaleAction of(final MyCustomerSetLocaleAction template) {
        MyCustomerSetLocaleActionImpl instance = new MyCustomerSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCustomerSetLocaleAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerSetLocaleAction deepCopy(@Nullable final MyCustomerSetLocaleAction template) {
        if (template == null) {
            return null;
        }
        MyCustomerSetLocaleActionImpl instance = new MyCustomerSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    /**
     * builder factory method for MyCustomerSetLocaleAction
     * @return builder
     */
    public static MyCustomerSetLocaleActionBuilder builder() {
        return MyCustomerSetLocaleActionBuilder.of();
    }
    
    /**
     * create builder for MyCustomerSetLocaleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetLocaleActionBuilder builder(final MyCustomerSetLocaleAction template) {
        return MyCustomerSetLocaleActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerSetLocaleAction(Function<MyCustomerSetLocaleAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetLocaleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetLocaleAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetLocaleAction>";
            }
        };
    }
}
