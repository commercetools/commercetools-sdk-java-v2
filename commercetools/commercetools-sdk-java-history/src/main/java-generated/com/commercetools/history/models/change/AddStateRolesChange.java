
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.StateRoleEnum;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Add State roles update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddStateRolesChange addStateRolesChange = AddStateRolesChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AddStateRolesChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddStateRolesChangeImpl.class)
public interface AddStateRolesChange extends Change {

    /**
     * discriminator value for AddStateRolesChange
     */
    String ADD_STATE_ROLES_CHANGE = "AddStateRolesChange";

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
    @JsonProperty("previousValue")
    public List<StateRoleEnum> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public List<StateRoleEnum> getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final StateRoleEnum... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<StateRoleEnum> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final StateRoleEnum... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<StateRoleEnum> nextValue);

    /**
     * factory method
     * @return instance of AddStateRolesChange
     */
    public static AddStateRolesChange of() {
        return new AddStateRolesChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddStateRolesChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddStateRolesChange of(final AddStateRolesChange template) {
        AddStateRolesChangeImpl instance = new AddStateRolesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public AddStateRolesChange copyDeep();

    /**
     * factory method to create a deep copy of AddStateRolesChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddStateRolesChange deepCopy(@Nullable final AddStateRolesChange template) {
        if (template == null) {
            return null;
        }
        AddStateRolesChangeImpl instance = new AddStateRolesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue()).map(ArrayList::new).orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for AddStateRolesChange
     * @return builder
     */
    public static AddStateRolesChangeBuilder builder() {
        return AddStateRolesChangeBuilder.of();
    }

    /**
     * create builder for AddStateRolesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddStateRolesChangeBuilder builder(final AddStateRolesChange template) {
        return AddStateRolesChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddStateRolesChange(Function<AddStateRolesChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddStateRolesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddStateRolesChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddStateRolesChange>";
            }
        };
    }
}
