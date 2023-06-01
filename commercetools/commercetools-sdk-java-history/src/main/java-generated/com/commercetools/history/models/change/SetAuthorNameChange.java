package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetAuthorNameChangeImpl;

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
 * SetAuthorNameChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAuthorNameChange setAuthorNameChange = SetAuthorNameChange.builder()
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
@JsonDeserialize(as = SetAuthorNameChangeImpl.class)
public interface SetAuthorNameChange extends Change {

    /**
     * discriminator value for SetAuthorNameChange
     */
    String SET_AUTHOR_NAME_CHANGE = "SetAuthorNameChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Shape of the action for <code>setAuthorName</code></p>
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
     *  <p>Shape of the action for <code>setAuthorName</code></p>
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
     * @return instance of SetAuthorNameChange
     */
    public static SetAuthorNameChange of(){
        return new SetAuthorNameChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetAuthorNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAuthorNameChange of(final SetAuthorNameChange template) {
        SetAuthorNameChangeImpl instance = new SetAuthorNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetAuthorNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetAuthorNameChange deepCopy(@Nullable final SetAuthorNameChange template) {
        if (template == null) {
            return null;
        }
        SetAuthorNameChangeImpl instance = new SetAuthorNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetAuthorNameChange
     * @return builder
     */
    public static SetAuthorNameChangeBuilder builder() {
        return SetAuthorNameChangeBuilder.of();
    }
    
    /**
     * create builder for SetAuthorNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAuthorNameChangeBuilder builder(final SetAuthorNameChange template) {
        return SetAuthorNameChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAuthorNameChange(Function<SetAuthorNameChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAuthorNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAuthorNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAuthorNameChange>";
            }
        };
    }
}
