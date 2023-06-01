package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetCompanyNameChangeImpl;

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
 * SetCompanyNameChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCompanyNameChange setCompanyNameChange = SetCompanyNameChange.builder()
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
@JsonDeserialize(as = SetCompanyNameChangeImpl.class)
public interface SetCompanyNameChange extends Change {

    /**
     * discriminator value for SetCompanyNameChange
     */
    String SET_COMPANY_NAME_CHANGE = "SetCompanyNameChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Shape of the action for <code>setCompanyName</code></p>
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
     *  <p>Shape of the action for <code>setCompanyName</code></p>
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
     * @return instance of SetCompanyNameChange
     */
    public static SetCompanyNameChange of(){
        return new SetCompanyNameChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetCompanyNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCompanyNameChange of(final SetCompanyNameChange template) {
        SetCompanyNameChangeImpl instance = new SetCompanyNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetCompanyNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCompanyNameChange deepCopy(@Nullable final SetCompanyNameChange template) {
        if (template == null) {
            return null;
        }
        SetCompanyNameChangeImpl instance = new SetCompanyNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetCompanyNameChange
     * @return builder
     */
    public static SetCompanyNameChangeBuilder builder() {
        return SetCompanyNameChangeBuilder.of();
    }
    
    /**
     * create builder for SetCompanyNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCompanyNameChangeBuilder builder(final SetCompanyNameChange template) {
        return SetCompanyNameChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCompanyNameChange(Function<SetCompanyNameChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCompanyNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCompanyNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCompanyNameChange>";
            }
        };
    }
}
