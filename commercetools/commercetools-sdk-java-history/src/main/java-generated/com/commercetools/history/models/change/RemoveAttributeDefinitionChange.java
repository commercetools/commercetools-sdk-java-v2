package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.AttributeDefinition;
import com.commercetools.history.models.change.RemoveAttributeDefinitionChangeImpl;

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
 * RemoveAttributeDefinitionChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveAttributeDefinitionChange removeAttributeDefinitionChange = RemoveAttributeDefinitionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = RemoveAttributeDefinitionChangeImpl.class)
public interface RemoveAttributeDefinitionChange extends Change {

    /**
     * discriminator value for RemoveAttributeDefinitionChange
     */
    String REMOVE_ATTRIBUTE_DEFINITION_CHANGE = "RemoveAttributeDefinitionChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>removeAttributeDefinition</code> on product types</p>
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
    public AttributeDefinition getPreviousValue();

    /**
     *  <p>Update action for <code>removeAttributeDefinition</code> on product types</p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final AttributeDefinition previousValue);
    

    /**
     * factory method
     * @return instance of RemoveAttributeDefinitionChange
     */
    public static RemoveAttributeDefinitionChange of(){
        return new RemoveAttributeDefinitionChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy RemoveAttributeDefinitionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveAttributeDefinitionChange of(final RemoveAttributeDefinitionChange template) {
        RemoveAttributeDefinitionChangeImpl instance = new RemoveAttributeDefinitionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemoveAttributeDefinitionChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveAttributeDefinitionChange deepCopy(@Nullable final RemoveAttributeDefinitionChange template) {
        if (template == null) {
            return null;
        }
        RemoveAttributeDefinitionChangeImpl instance = new RemoveAttributeDefinitionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(com.commercetools.history.models.common.AttributeDefinition.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for RemoveAttributeDefinitionChange
     * @return builder
     */
    public static RemoveAttributeDefinitionChangeBuilder builder() {
        return RemoveAttributeDefinitionChangeBuilder.of();
    }
    
    /**
     * create builder for RemoveAttributeDefinitionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveAttributeDefinitionChangeBuilder builder(final RemoveAttributeDefinitionChange template) {
        return RemoveAttributeDefinitionChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveAttributeDefinitionChange(Function<RemoveAttributeDefinitionChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveAttributeDefinitionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveAttributeDefinitionChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveAttributeDefinitionChange>";
            }
        };
    }
}
