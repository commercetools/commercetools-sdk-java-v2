
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.StateRole;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the Remove State roles update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveStateRolesChange removeStateRolesChange = RemoveStateRolesChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveStateRolesChangeImpl.class)
public interface RemoveStateRolesChange extends Change {

    /**
     * discriminator value for RemoveStateRolesChange
     */
    String REMOVE_STATE_ROLES_CHANGE = "RemoveStateRolesChange";

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
    public List<StateRole> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public List<StateRole> getNextValue();

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
    public void setPreviousValue(final StateRole... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<StateRole> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final StateRole... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<StateRole> nextValue);

    /**
     * factory method
     * @return instance of RemoveStateRolesChange
     */
    public static RemoveStateRolesChange of() {
        return new RemoveStateRolesChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveStateRolesChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveStateRolesChange of(final RemoveStateRolesChange template) {
        RemoveStateRolesChangeImpl instance = new RemoveStateRolesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemoveStateRolesChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveStateRolesChange deepCopy(@Nullable final RemoveStateRolesChange template) {
        if (template == null) {
            return null;
        }
        RemoveStateRolesChangeImpl instance = new RemoveStateRolesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue()).map(ArrayList::new).orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for RemoveStateRolesChange
     * @return builder
     */
    public static RemoveStateRolesChangeBuilder builder() {
        return RemoveStateRolesChangeBuilder.of();
    }

    /**
     * create builder for RemoveStateRolesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveStateRolesChangeBuilder builder(final RemoveStateRolesChange template) {
        return RemoveStateRolesChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveStateRolesChange(Function<RemoveStateRolesChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveStateRolesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveStateRolesChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveStateRolesChange>";
            }
        };
    }
}
