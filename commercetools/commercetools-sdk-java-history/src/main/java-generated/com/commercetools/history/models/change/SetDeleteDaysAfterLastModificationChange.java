package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetDeleteDaysAfterLastModificationChangeImpl;

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
 * SetDeleteDaysAfterLastModificationChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDeleteDaysAfterLastModificationChange setDeleteDaysAfterLastModificationChange = SetDeleteDaysAfterLastModificationChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SetDeleteDaysAfterLastModificationChangeImpl.class)
public interface SetDeleteDaysAfterLastModificationChange extends Change {

    /**
     * discriminator value for SetDeleteDaysAfterLastModificationChange
     */
    String SET_DELETE_DAYS_AFTER_LAST_MODIFICATION_CHANGE = "SetDeleteDaysAfterLastModificationChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Shape of the action for <code>setDeleteDaysAfterLastModification</code></p>
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
    public Integer getPreviousValue();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    /**
     *  <p>Shape of the action for <code>setDeleteDaysAfterLastModification</code></p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final Integer previousValue);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final Integer nextValue);
    

    /**
     * factory method
     * @return instance of SetDeleteDaysAfterLastModificationChange
     */
    public static SetDeleteDaysAfterLastModificationChange of(){
        return new SetDeleteDaysAfterLastModificationChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetDeleteDaysAfterLastModificationChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDeleteDaysAfterLastModificationChange of(final SetDeleteDaysAfterLastModificationChange template) {
        SetDeleteDaysAfterLastModificationChangeImpl instance = new SetDeleteDaysAfterLastModificationChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetDeleteDaysAfterLastModificationChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDeleteDaysAfterLastModificationChange deepCopy(@Nullable final SetDeleteDaysAfterLastModificationChange template) {
        if (template == null) {
            return null;
        }
        SetDeleteDaysAfterLastModificationChangeImpl instance = new SetDeleteDaysAfterLastModificationChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetDeleteDaysAfterLastModificationChange
     * @return builder
     */
    public static SetDeleteDaysAfterLastModificationChangeBuilder builder() {
        return SetDeleteDaysAfterLastModificationChangeBuilder.of();
    }
    
    /**
     * create builder for SetDeleteDaysAfterLastModificationChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDeleteDaysAfterLastModificationChangeBuilder builder(final SetDeleteDaysAfterLastModificationChange template) {
        return SetDeleteDaysAfterLastModificationChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDeleteDaysAfterLastModificationChange(Function<SetDeleteDaysAfterLastModificationChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDeleteDaysAfterLastModificationChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDeleteDaysAfterLastModificationChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDeleteDaysAfterLastModificationChange>";
            }
        };
    }
}
