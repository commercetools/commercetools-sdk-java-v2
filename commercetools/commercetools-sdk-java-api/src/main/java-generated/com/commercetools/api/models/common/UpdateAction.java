package com.commercetools.api.models.common;


import com.commercetools.api.models.common.UpdateActionImpl;

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
 * UpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UpdateAction updateAction = UpdateAction.builder()
 *             .action("{action}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = UpdateActionImpl.class)
public interface UpdateAction extends com.commercetools.api.models.ResourceUpdateAction<UpdateAction> {


    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * set action
     * @param action value to be set
     */
    
    public void setAction(final String action);
    

    /**
     * factory method
     * @return instance of UpdateAction
     */
    public static UpdateAction of(){
        return new UpdateActionImpl();
    }
    

    /**
     * factory method to create a shallow copy UpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static UpdateAction of(final UpdateAction template) {
        UpdateActionImpl instance = new UpdateActionImpl();
        instance.setAction(template.getAction());
        return instance;
    }

    /**
     * factory method to create a deep copy of UpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static UpdateAction deepCopy(@Nullable final UpdateAction template) {
        if (template == null) {
            return null;
        }
        UpdateActionImpl instance = new UpdateActionImpl();
        instance.setAction(template.getAction());
        return instance;
    }

    /**
     * builder factory method for UpdateAction
     * @return builder
     */
    public static UpdateActionBuilder builder() {
        return UpdateActionBuilder.of();
    }
    
    /**
     * create builder for UpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UpdateActionBuilder builder(final UpdateAction template) {
        return UpdateActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withUpdateAction(Function<UpdateAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<UpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<UpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<UpdateAction>";
            }
        };
    }
}
