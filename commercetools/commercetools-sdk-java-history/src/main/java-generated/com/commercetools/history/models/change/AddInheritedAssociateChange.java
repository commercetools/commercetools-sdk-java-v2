
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.InheritedAssociate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Add Associate update action on a parent of a Business Unit in cases where inheritance applies.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddInheritedAssociateChange addInheritedAssociateChange = AddInheritedAssociateChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AddInheritedAssociateChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddInheritedAssociateChangeImpl.class)
public interface AddInheritedAssociateChange extends Change {

    /**
     * discriminator value for AddInheritedAssociateChange
     */
    String ADD_INHERITED_ASSOCIATE_CHANGE = "AddInheritedAssociateChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public InheritedAssociate getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final InheritedAssociate nextValue);

    /**
     * factory method
     * @return instance of AddInheritedAssociateChange
     */
    public static AddInheritedAssociateChange of() {
        return new AddInheritedAssociateChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddInheritedAssociateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddInheritedAssociateChange of(final AddInheritedAssociateChange template) {
        AddInheritedAssociateChangeImpl instance = new AddInheritedAssociateChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public AddInheritedAssociateChange copyDeep();

    /**
     * factory method to create a deep copy of AddInheritedAssociateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddInheritedAssociateChange deepCopy(@Nullable final AddInheritedAssociateChange template) {
        if (template == null) {
            return null;
        }
        AddInheritedAssociateChangeImpl instance = new AddInheritedAssociateChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(
            com.commercetools.history.models.common.InheritedAssociate.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for AddInheritedAssociateChange
     * @return builder
     */
    public static AddInheritedAssociateChangeBuilder builder() {
        return AddInheritedAssociateChangeBuilder.of();
    }

    /**
     * create builder for AddInheritedAssociateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddInheritedAssociateChangeBuilder builder(final AddInheritedAssociateChange template) {
        return AddInheritedAssociateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddInheritedAssociateChange(Function<AddInheritedAssociateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddInheritedAssociateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddInheritedAssociateChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddInheritedAssociateChange>";
            }
        };
    }
}
