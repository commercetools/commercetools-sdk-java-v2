package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerUpdateImpl;

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
 * MyCustomerUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerUpdate myCustomerUpdate = MyCustomerUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = MyCustomerUpdateImpl.class)
public interface MyCustomerUpdate extends com.commercetools.api.models.ResourceUpdate<MyCustomerUpdate, MyCustomerUpdateAction, MyCustomerUpdateBuilder> {


    /**
     *  <p>Expected version of the Customer on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    /**
     *  <p>Update actions to be performed on the Customer.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<MyCustomerUpdateAction> getActions();

    /**
     *  <p>Expected version of the Customer on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version value to be set
     */
    
    public void setVersion(final Long version);
    
    
    /**
     *  <p>Update actions to be performed on the Customer.</p>
     * @param actions values to be set
     */
    
    @JsonIgnore
    public void setActions(final MyCustomerUpdateAction ...actions);
    /**
     *  <p>Update actions to be performed on the Customer.</p>
     * @param actions values to be set
     */
    
    public void setActions(final List<MyCustomerUpdateAction> actions);

    /**
     * factory method
     * @return instance of MyCustomerUpdate
     */
    public static MyCustomerUpdate of(){
        return new MyCustomerUpdateImpl();
    }
    

    /**
     * factory method to create a shallow copy MyCustomerUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerUpdate of(final MyCustomerUpdate template) {
        MyCustomerUpdateImpl instance = new MyCustomerUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCustomerUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerUpdate deepCopy(@Nullable final MyCustomerUpdate template) {
        if (template == null) {
            return null;
        }
        MyCustomerUpdateImpl instance = new MyCustomerUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream().map(com.commercetools.api.models.me.MyCustomerUpdateAction::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for MyCustomerUpdate
     * @return builder
     */
    public static MyCustomerUpdateBuilder builder() {
        return MyCustomerUpdateBuilder.of();
    }
    
    /**
     * create builder for MyCustomerUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerUpdateBuilder builder(final MyCustomerUpdate template) {
        return MyCustomerUpdateBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerUpdate(Function<MyCustomerUpdate, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerUpdate>";
            }
        };
    }
}
