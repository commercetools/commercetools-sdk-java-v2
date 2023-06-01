package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetMiddleNameChangeImpl;

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
 * SetMiddleNameChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMiddleNameChange setMiddleNameChange = SetMiddleNameChange.builder()
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
@JsonDeserialize(as = SetMiddleNameChangeImpl.class)
public interface SetMiddleNameChange extends Change {

    /**
     * discriminator value for SetMiddleNameChange
     */
    String SET_MIDDLE_NAME_CHANGE = "SetMiddleNameChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Shape of the action for <code>setMiddleName</code></p>
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
     *  <p>Shape of the action for <code>setMiddleName</code></p>
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
     * @return instance of SetMiddleNameChange
     */
    public static SetMiddleNameChange of(){
        return new SetMiddleNameChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetMiddleNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetMiddleNameChange of(final SetMiddleNameChange template) {
        SetMiddleNameChangeImpl instance = new SetMiddleNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetMiddleNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetMiddleNameChange deepCopy(@Nullable final SetMiddleNameChange template) {
        if (template == null) {
            return null;
        }
        SetMiddleNameChangeImpl instance = new SetMiddleNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetMiddleNameChange
     * @return builder
     */
    public static SetMiddleNameChangeBuilder builder() {
        return SetMiddleNameChangeBuilder.of();
    }
    
    /**
     * create builder for SetMiddleNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMiddleNameChangeBuilder builder(final SetMiddleNameChange template) {
        return SetMiddleNameChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetMiddleNameChange(Function<SetMiddleNameChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetMiddleNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetMiddleNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMiddleNameChange>";
            }
        };
    }
}
