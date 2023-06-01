package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.ChangeIsSearchableChangeImpl;

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
 * ChangeIsSearchableChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeIsSearchableChange changeIsSearchableChange = ChangeIsSearchableChange.builder()
 *             .change("{change}")
 *             .attributeName("{attributeName}")
 *             .nextValue(true)
 *             .previousValue(true)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ChangeIsSearchableChangeImpl.class)
public interface ChangeIsSearchableChange extends Change {

    /**
     * discriminator value for ChangeIsSearchableChange
     */
    String CHANGE_IS_SEARCHABLE_CHANGE = "ChangeIsSearchableChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>changeIsSearchable</code> on product types</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *  <p>The name of the updated attribute.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Boolean getNextValue();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Boolean getPreviousValue();

    /**
     *  <p>Update action for <code>changeIsSearchable</code> on product types</p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     *  <p>The name of the updated attribute.</p>
     * @param attributeName value to be set
     */
    
    public void setAttributeName(final String attributeName);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final Boolean nextValue);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final Boolean previousValue);
    

    /**
     * factory method
     * @return instance of ChangeIsSearchableChange
     */
    public static ChangeIsSearchableChange of(){
        return new ChangeIsSearchableChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy ChangeIsSearchableChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeIsSearchableChange of(final ChangeIsSearchableChange template) {
        ChangeIsSearchableChangeImpl instance = new ChangeIsSearchableChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeIsSearchableChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeIsSearchableChange deepCopy(@Nullable final ChangeIsSearchableChange template) {
        if (template == null) {
            return null;
        }
        ChangeIsSearchableChangeImpl instance = new ChangeIsSearchableChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for ChangeIsSearchableChange
     * @return builder
     */
    public static ChangeIsSearchableChangeBuilder builder() {
        return ChangeIsSearchableChangeBuilder.of();
    }
    
    /**
     * create builder for ChangeIsSearchableChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeIsSearchableChangeBuilder builder(final ChangeIsSearchableChange template) {
        return ChangeIsSearchableChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeIsSearchableChange(Function<ChangeIsSearchableChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeIsSearchableChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeIsSearchableChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeIsSearchableChange>";
            }
        };
    }
}
