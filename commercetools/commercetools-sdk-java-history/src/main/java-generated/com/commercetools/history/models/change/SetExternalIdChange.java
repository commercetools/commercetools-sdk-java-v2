package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetExternalIdChangeImpl;

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
 * SetExternalIdChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetExternalIdChange setExternalIdChange = SetExternalIdChange.builder()
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
@JsonDeserialize(as = SetExternalIdChangeImpl.class)
public interface SetExternalIdChange extends Change {

    /**
     * discriminator value for SetExternalIdChange
     */
    String SET_EXTERNAL_ID_CHANGE = "SetExternalIdChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Shape of the action for <code>setExternalId</code></p>
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
     *  <p>Shape of the action for <code>setExternalId</code></p>
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
     * @return instance of SetExternalIdChange
     */
    public static SetExternalIdChange of(){
        return new SetExternalIdChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetExternalIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetExternalIdChange of(final SetExternalIdChange template) {
        SetExternalIdChangeImpl instance = new SetExternalIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetExternalIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetExternalIdChange deepCopy(@Nullable final SetExternalIdChange template) {
        if (template == null) {
            return null;
        }
        SetExternalIdChangeImpl instance = new SetExternalIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetExternalIdChange
     * @return builder
     */
    public static SetExternalIdChangeBuilder builder() {
        return SetExternalIdChangeBuilder.of();
    }
    
    /**
     * create builder for SetExternalIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetExternalIdChangeBuilder builder(final SetExternalIdChange template) {
        return SetExternalIdChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetExternalIdChange(Function<SetExternalIdChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetExternalIdChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetExternalIdChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetExternalIdChange>";
            }
        };
    }
}
