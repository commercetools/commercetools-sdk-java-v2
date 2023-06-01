package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Reference;
import com.commercetools.history.models.change.SetStoresChangeImpl;

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
 * SetStoresChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetStoresChange setStoresChange = SetStoresChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SetStoresChangeImpl.class)
public interface SetStoresChange extends Change {

    /**
     * discriminator value for SetStoresChange
     */
    String SET_STORES_CHANGE = "SetStoresChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Shape of the action for <code>setStores</code></p>
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
    @Valid
    @JsonProperty("previousValue")
    public List<Reference> getPreviousValue();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<Reference> getNextValue();

    /**
     *  <p>Shape of the action for <code>setStores</code></p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set previousValue
     * @param previousValue values to be set
     */
    
    @JsonIgnore
    public void setPreviousValue(final Reference ...previousValue);
    /**
     * set previousValue
     * @param previousValue values to be set
     */
    
    public void setPreviousValue(final List<Reference> previousValue);
    
    /**
     * set nextValue
     * @param nextValue values to be set
     */
    
    @JsonIgnore
    public void setNextValue(final Reference ...nextValue);
    /**
     * set nextValue
     * @param nextValue values to be set
     */
    
    public void setNextValue(final List<Reference> nextValue);

    /**
     * factory method
     * @return instance of SetStoresChange
     */
    public static SetStoresChange of(){
        return new SetStoresChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetStoresChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetStoresChange of(final SetStoresChange template) {
        SetStoresChangeImpl instance = new SetStoresChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetStoresChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetStoresChange deepCopy(@Nullable final SetStoresChange template) {
        if (template == null) {
            return null;
        }
        SetStoresChangeImpl instance = new SetStoresChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream().map(com.commercetools.history.models.common.Reference::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream().map(com.commercetools.history.models.common.Reference::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetStoresChange
     * @return builder
     */
    public static SetStoresChangeBuilder builder() {
        return SetStoresChangeBuilder.of();
    }
    
    /**
     * create builder for SetStoresChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetStoresChangeBuilder builder(final SetStoresChange template) {
        return SetStoresChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetStoresChange(Function<SetStoresChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetStoresChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetStoresChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetStoresChange>";
            }
        };
    }
}
