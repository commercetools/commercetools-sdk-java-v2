package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetExpectedDeliveryChangeImpl;

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
 * SetExpectedDeliveryChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetExpectedDeliveryChange setExpectedDeliveryChange = SetExpectedDeliveryChange.builder()
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
@JsonDeserialize(as = SetExpectedDeliveryChangeImpl.class)
public interface SetExpectedDeliveryChange extends Change {

    /**
     * discriminator value for SetExpectedDeliveryChange
     */
    String SET_EXPECTED_DELIVERY_CHANGE = "SetExpectedDeliveryChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Shape of the action for <code>setExpectedDelivery</code></p>
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
     *  <p>Shape of the action for <code>setExpectedDelivery</code></p>
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
     * @return instance of SetExpectedDeliveryChange
     */
    public static SetExpectedDeliveryChange of(){
        return new SetExpectedDeliveryChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetExpectedDeliveryChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetExpectedDeliveryChange of(final SetExpectedDeliveryChange template) {
        SetExpectedDeliveryChangeImpl instance = new SetExpectedDeliveryChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetExpectedDeliveryChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetExpectedDeliveryChange deepCopy(@Nullable final SetExpectedDeliveryChange template) {
        if (template == null) {
            return null;
        }
        SetExpectedDeliveryChangeImpl instance = new SetExpectedDeliveryChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetExpectedDeliveryChange
     * @return builder
     */
    public static SetExpectedDeliveryChangeBuilder builder() {
        return SetExpectedDeliveryChangeBuilder.of();
    }
    
    /**
     * create builder for SetExpectedDeliveryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetExpectedDeliveryChangeBuilder builder(final SetExpectedDeliveryChange template) {
        return SetExpectedDeliveryChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetExpectedDeliveryChange(Function<SetExpectedDeliveryChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetExpectedDeliveryChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetExpectedDeliveryChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetExpectedDeliveryChange>";
            }
        };
    }
}
