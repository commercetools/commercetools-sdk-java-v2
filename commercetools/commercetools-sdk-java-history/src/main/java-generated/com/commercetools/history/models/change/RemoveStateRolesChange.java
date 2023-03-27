
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.StateRole;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveStateRolesChange
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
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public List<StateRole> getPreviousValue();

    /**
     *
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
     * set previousValue
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final StateRole... previousValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<StateRole> previousValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final StateRole... nextValue);

    /**
     * set nextValue
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
     * factory method to copy an instance of RemoveStateRolesChange
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
