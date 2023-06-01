package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetStatusInterfaceCodeChangeImpl;

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
 * SetStatusInterfaceCodeChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetStatusInterfaceCodeChange setStatusInterfaceCodeChange = SetStatusInterfaceCodeChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SetStatusInterfaceCodeChangeImpl.class)
public interface SetStatusInterfaceCodeChange extends Change {

    /**
     * discriminator value for SetStatusInterfaceCodeChange
     */
    String SET_STATUS_INTERFACE_CODE_CHANGE = "SetStatusInterfaceCodeChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Shape of the action for <code>setStatusInterfaceCode</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     *  <p>Shape of the action for <code>setStatusInterfaceCode</code></p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final String previousValue);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final String nextValue);
    

    /**
     * factory method
     * @return instance of SetStatusInterfaceCodeChange
     */
    public static SetStatusInterfaceCodeChange of(){
        return new SetStatusInterfaceCodeChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetStatusInterfaceCodeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetStatusInterfaceCodeChange of(final SetStatusInterfaceCodeChange template) {
        SetStatusInterfaceCodeChangeImpl instance = new SetStatusInterfaceCodeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetStatusInterfaceCodeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetStatusInterfaceCodeChange deepCopy(@Nullable final SetStatusInterfaceCodeChange template) {
        if (template == null) {
            return null;
        }
        SetStatusInterfaceCodeChangeImpl instance = new SetStatusInterfaceCodeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetStatusInterfaceCodeChange
     * @return builder
     */
    public static SetStatusInterfaceCodeChangeBuilder builder() {
        return SetStatusInterfaceCodeChangeBuilder.of();
    }
    
    /**
     * create builder for SetStatusInterfaceCodeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetStatusInterfaceCodeChangeBuilder builder(final SetStatusInterfaceCodeChange template) {
        return SetStatusInterfaceCodeChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetStatusInterfaceCodeChange(Function<SetStatusInterfaceCodeChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetStatusInterfaceCodeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetStatusInterfaceCodeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetStatusInterfaceCodeChange>";
            }
        };
    }
}
