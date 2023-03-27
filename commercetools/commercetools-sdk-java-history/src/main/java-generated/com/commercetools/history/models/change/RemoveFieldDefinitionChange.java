
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.FieldDefinition;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveFieldDefinitionChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveFieldDefinitionChange removeFieldDefinitionChange = RemoveFieldDefinitionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveFieldDefinitionChangeImpl.class)
public interface RemoveFieldDefinitionChange extends Change {

    /**
     * discriminator value for RemoveFieldDefinitionChange
     */
    String REMOVE_FIELD_DEFINITION_CHANGE = "RemoveFieldDefinitionChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>removeFieldDefinition</code> on payments</p>
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
    public FieldDefinition getPreviousValue();

    /**
     *  <p>Update action for <code>removeFieldDefinition</code> on payments</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final FieldDefinition previousValue);

    /**
     * factory method
     * @return instance of RemoveFieldDefinitionChange
     */
    public static RemoveFieldDefinitionChange of() {
        return new RemoveFieldDefinitionChangeImpl();
    }

    /**
     * factory method to copy an instance of RemoveFieldDefinitionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveFieldDefinitionChange of(final RemoveFieldDefinitionChange template) {
        RemoveFieldDefinitionChangeImpl instance = new RemoveFieldDefinitionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for RemoveFieldDefinitionChange
     * @return builder
     */
    public static RemoveFieldDefinitionChangeBuilder builder() {
        return RemoveFieldDefinitionChangeBuilder.of();
    }

    /**
     * create builder for RemoveFieldDefinitionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveFieldDefinitionChangeBuilder builder(final RemoveFieldDefinitionChange template) {
        return RemoveFieldDefinitionChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveFieldDefinitionChange(Function<RemoveFieldDefinitionChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveFieldDefinitionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveFieldDefinitionChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveFieldDefinitionChange>";
            }
        };
    }
}
