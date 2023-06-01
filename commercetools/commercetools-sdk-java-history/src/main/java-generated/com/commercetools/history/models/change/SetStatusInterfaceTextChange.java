package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetStatusInterfaceTextChangeImpl;

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
 * SetStatusInterfaceTextChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetStatusInterfaceTextChange setStatusInterfaceTextChange = SetStatusInterfaceTextChange.builder()
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
@JsonDeserialize(as = SetStatusInterfaceTextChangeImpl.class)
public interface SetStatusInterfaceTextChange extends Change {

    /**
     * discriminator value for SetStatusInterfaceTextChange
     */
    String SET_STATUS_INTERFACE_TEXT_CHANGE = "SetStatusInterfaceTextChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Shape of the action for <code>setStatusInterfaceText</code></p>
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
     *  <p>Shape of the action for <code>setStatusInterfaceText</code></p>
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
     * @return instance of SetStatusInterfaceTextChange
     */
    public static SetStatusInterfaceTextChange of(){
        return new SetStatusInterfaceTextChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetStatusInterfaceTextChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetStatusInterfaceTextChange of(final SetStatusInterfaceTextChange template) {
        SetStatusInterfaceTextChangeImpl instance = new SetStatusInterfaceTextChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetStatusInterfaceTextChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetStatusInterfaceTextChange deepCopy(@Nullable final SetStatusInterfaceTextChange template) {
        if (template == null) {
            return null;
        }
        SetStatusInterfaceTextChangeImpl instance = new SetStatusInterfaceTextChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetStatusInterfaceTextChange
     * @return builder
     */
    public static SetStatusInterfaceTextChangeBuilder builder() {
        return SetStatusInterfaceTextChangeBuilder.of();
    }
    
    /**
     * create builder for SetStatusInterfaceTextChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetStatusInterfaceTextChangeBuilder builder(final SetStatusInterfaceTextChange template) {
        return SetStatusInterfaceTextChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetStatusInterfaceTextChange(Function<SetStatusInterfaceTextChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetStatusInterfaceTextChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetStatusInterfaceTextChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetStatusInterfaceTextChange>";
            }
        };
    }
}
