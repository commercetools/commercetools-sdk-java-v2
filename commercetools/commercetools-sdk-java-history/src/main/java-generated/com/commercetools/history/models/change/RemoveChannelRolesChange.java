package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.ChannelRole;
import com.commercetools.history.models.change.RemoveChannelRolesChangeImpl;

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
 * RemoveChannelRolesChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveChannelRolesChange removeChannelRolesChange = RemoveChannelRolesChange.builder()
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
@JsonDeserialize(as = RemoveChannelRolesChangeImpl.class)
public interface RemoveChannelRolesChange extends Change {

    /**
     * discriminator value for RemoveChannelRolesChange
     */
    String REMOVE_CHANNEL_ROLES_CHANGE = "RemoveChannelRolesChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *
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
    public List<ChannelRole> getPreviousValue();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public List<ChannelRole> getNextValue();

    /**
     * set change
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set previousValue
     * @param previousValue values to be set
     */
    
    @JsonIgnore
    public void setPreviousValue(final ChannelRole ...previousValue);
    /**
     * set previousValue
     * @param previousValue values to be set
     */
    
    public void setPreviousValue(final List<ChannelRole> previousValue);
    
    /**
     * set nextValue
     * @param nextValue values to be set
     */
    
    @JsonIgnore
    public void setNextValue(final ChannelRole ...nextValue);
    /**
     * set nextValue
     * @param nextValue values to be set
     */
    
    public void setNextValue(final List<ChannelRole> nextValue);

    /**
     * factory method
     * @return instance of RemoveChannelRolesChange
     */
    public static RemoveChannelRolesChange of(){
        return new RemoveChannelRolesChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy RemoveChannelRolesChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveChannelRolesChange of(final RemoveChannelRolesChange template) {
        RemoveChannelRolesChangeImpl instance = new RemoveChannelRolesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemoveChannelRolesChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveChannelRolesChange deepCopy(@Nullable final RemoveChannelRolesChange template) {
        if (template == null) {
            return null;
        }
        RemoveChannelRolesChangeImpl instance = new RemoveChannelRolesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(ArrayList::new)
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(ArrayList::new)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for RemoveChannelRolesChange
     * @return builder
     */
    public static RemoveChannelRolesChangeBuilder builder() {
        return RemoveChannelRolesChangeBuilder.of();
    }
    
    /**
     * create builder for RemoveChannelRolesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveChannelRolesChangeBuilder builder(final RemoveChannelRolesChange template) {
        return RemoveChannelRolesChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveChannelRolesChange(Function<RemoveChannelRolesChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveChannelRolesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveChannelRolesChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveChannelRolesChange>";
            }
        };
    }
}
