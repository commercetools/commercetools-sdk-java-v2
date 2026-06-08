
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.AttributeDefinition;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTypeRemoveAttributeDefinitionAction" rel="nofollow">Remove AttributeDefinition</a> update action.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("RemoveAttributeDefinitionChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public AttributeDefinition getPreviousValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final AttributeDefinition previousValue);

    /**
     * factory method
     * @return instance of RemoveAttributeDefinitionChange
     */
    public static RemoveAttributeDefinitionChange of() {
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

    public RemoveAttributeDefinitionChange copyDeep();

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
        instance.setPreviousValue(
            com.commercetools.history.models.common.AttributeDefinition.deepCopy(template.getPreviousValue()));
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
