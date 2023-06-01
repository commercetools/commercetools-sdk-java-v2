package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetLocaleChangeImpl;

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
 * SetLocaleChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLocaleChange setLocaleChange = SetLocaleChange.builder()
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
@JsonDeserialize(as = SetLocaleChangeImpl.class)
public interface SetLocaleChange extends Change {

    /**
     * discriminator value for SetLocaleChange
     */
    String SET_LOCALE_CHANGE = "SetLocaleChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>setLocale</code> on reviews</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *  <p>A locale of IETF language tag.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();
    /**
     *  <p>A locale of IETF language tag.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     *  <p>Update action for <code>setLocale</code> on reviews</p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     *  <p>A locale of IETF language tag.</p>
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final String previousValue);
    
    
    /**
     *  <p>A locale of IETF language tag.</p>
     * @param nextValue value to be set
     */
    
    public void setNextValue(final String nextValue);
    

    /**
     * factory method
     * @return instance of SetLocaleChange
     */
    public static SetLocaleChange of(){
        return new SetLocaleChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetLocaleChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLocaleChange of(final SetLocaleChange template) {
        SetLocaleChangeImpl instance = new SetLocaleChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetLocaleChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLocaleChange deepCopy(@Nullable final SetLocaleChange template) {
        if (template == null) {
            return null;
        }
        SetLocaleChangeImpl instance = new SetLocaleChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetLocaleChange
     * @return builder
     */
    public static SetLocaleChangeBuilder builder() {
        return SetLocaleChangeBuilder.of();
    }
    
    /**
     * create builder for SetLocaleChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLocaleChangeBuilder builder(final SetLocaleChange template) {
        return SetLocaleChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLocaleChange(Function<SetLocaleChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLocaleChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLocaleChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLocaleChange>";
            }
        };
    }
}
