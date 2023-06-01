package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Location;
import com.commercetools.history.models.change.RemoveLocationChangeImpl;

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
 * RemoveLocationChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveLocationChange removeLocationChange = RemoveLocationChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = RemoveLocationChangeImpl.class)
public interface RemoveLocationChange extends Change {

    /**
     * discriminator value for RemoveLocationChange
     */
    String REMOVE_LOCATION_CHANGE = "RemoveLocationChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>removeLocation</code> on zones</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Location getPreviousValue();
    /**
     *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Location getNextValue();

    /**
     *  <p>Update action for <code>removeLocation</code> on zones</p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final Location previousValue);
    
    
    /**
     *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
     * @param nextValue value to be set
     */
    
    public void setNextValue(final Location nextValue);
    

    /**
     * factory method
     * @return instance of RemoveLocationChange
     */
    public static RemoveLocationChange of(){
        return new RemoveLocationChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy RemoveLocationChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveLocationChange of(final RemoveLocationChange template) {
        RemoveLocationChangeImpl instance = new RemoveLocationChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemoveLocationChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveLocationChange deepCopy(@Nullable final RemoveLocationChange template) {
        if (template == null) {
            return null;
        }
        RemoveLocationChangeImpl instance = new RemoveLocationChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(com.commercetools.history.models.common.Location.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Location.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for RemoveLocationChange
     * @return builder
     */
    public static RemoveLocationChangeBuilder builder() {
        return RemoveLocationChangeBuilder.of();
    }
    
    /**
     * create builder for RemoveLocationChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveLocationChangeBuilder builder(final RemoveLocationChange template) {
        return RemoveLocationChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveLocationChange(Function<RemoveLocationChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveLocationChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveLocationChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveLocationChange>";
            }
        };
    }
}
