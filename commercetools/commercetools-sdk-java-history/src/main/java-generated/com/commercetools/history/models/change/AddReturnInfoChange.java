package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.ReturnInfo;
import com.commercetools.history.models.change.AddReturnInfoChangeImpl;

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
 * AddReturnInfoChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddReturnInfoChange addReturnInfoChange = AddReturnInfoChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = AddReturnInfoChangeImpl.class)
public interface AddReturnInfoChange extends Change {

    /**
     * discriminator value for AddReturnInfoChange
     */
    String ADD_RETURN_INFO_CHANGE = "AddReturnInfoChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>addReturnInfo</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ReturnInfo getNextValue();

    /**
     *  <p>Update action for <code>addReturnInfo</code></p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final ReturnInfo nextValue);
    

    /**
     * factory method
     * @return instance of AddReturnInfoChange
     */
    public static AddReturnInfoChange of(){
        return new AddReturnInfoChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy AddReturnInfoChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddReturnInfoChange of(final AddReturnInfoChange template) {
        AddReturnInfoChangeImpl instance = new AddReturnInfoChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of AddReturnInfoChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddReturnInfoChange deepCopy(@Nullable final AddReturnInfoChange template) {
        if (template == null) {
            return null;
        }
        AddReturnInfoChangeImpl instance = new AddReturnInfoChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(com.commercetools.history.models.common.ReturnInfo.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for AddReturnInfoChange
     * @return builder
     */
    public static AddReturnInfoChangeBuilder builder() {
        return AddReturnInfoChangeBuilder.of();
    }
    
    /**
     * create builder for AddReturnInfoChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddReturnInfoChangeBuilder builder(final AddReturnInfoChange template) {
        return AddReturnInfoChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddReturnInfoChange(Function<AddReturnInfoChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddReturnInfoChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddReturnInfoChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddReturnInfoChange>";
            }
        };
    }
}
