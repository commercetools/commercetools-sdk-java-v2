package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetVatIdChangeImpl;

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
 * SetVatIdChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetVatIdChange setVatIdChange = SetVatIdChange.builder()
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
@JsonDeserialize(as = SetVatIdChangeImpl.class)
public interface SetVatIdChange extends Change {

    /**
     * discriminator value for SetVatIdChange
     */
    String SET_VAT_ID_CHANGE = "SetVatIdChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Shape of the action for <code>setVatId</code></p>
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
     *  <p>Shape of the action for <code>setVatId</code></p>
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
     * @return instance of SetVatIdChange
     */
    public static SetVatIdChange of(){
        return new SetVatIdChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetVatIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetVatIdChange of(final SetVatIdChange template) {
        SetVatIdChangeImpl instance = new SetVatIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetVatIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetVatIdChange deepCopy(@Nullable final SetVatIdChange template) {
        if (template == null) {
            return null;
        }
        SetVatIdChangeImpl instance = new SetVatIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetVatIdChange
     * @return builder
     */
    public static SetVatIdChangeBuilder builder() {
        return SetVatIdChangeBuilder.of();
    }
    
    /**
     * create builder for SetVatIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetVatIdChangeBuilder builder(final SetVatIdChange template) {
        return SetVatIdChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetVatIdChange(Function<SetVatIdChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetVatIdChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetVatIdChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetVatIdChange>";
            }
        };
    }
}
