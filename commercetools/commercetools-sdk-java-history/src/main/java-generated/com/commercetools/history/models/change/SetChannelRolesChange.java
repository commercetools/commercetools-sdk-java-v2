
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.ChannelRoleEnum;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Set Roles update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetChannelRolesChange setChannelRolesChange = SetChannelRolesChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetChannelRolesChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetChannelRolesChangeImpl.class)
public interface SetChannelRolesChange extends Change {

    /**
     * discriminator value for SetChannelRolesChange
     */
    String SET_CHANNEL_ROLES_CHANGE = "SetChannelRolesChange";

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
    public List<ChannelRoleEnum> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public List<ChannelRoleEnum> getNextValue();

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
    public void setPreviousValue(final ChannelRoleEnum... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<ChannelRoleEnum> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final ChannelRoleEnum... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<ChannelRoleEnum> nextValue);

    /**
     * factory method
     * @return instance of SetChannelRolesChange
     */
    public static SetChannelRolesChange of() {
        return new SetChannelRolesChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetChannelRolesChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetChannelRolesChange of(final SetChannelRolesChange template) {
        SetChannelRolesChangeImpl instance = new SetChannelRolesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetChannelRolesChange copyDeep();

    /**
     * factory method to create a deep copy of SetChannelRolesChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetChannelRolesChange deepCopy(@Nullable final SetChannelRolesChange template) {
        if (template == null) {
            return null;
        }
        SetChannelRolesChangeImpl instance = new SetChannelRolesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue()).map(ArrayList::new).orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetChannelRolesChange
     * @return builder
     */
    public static SetChannelRolesChangeBuilder builder() {
        return SetChannelRolesChangeBuilder.of();
    }

    /**
     * create builder for SetChannelRolesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetChannelRolesChangeBuilder builder(final SetChannelRolesChange template) {
        return SetChannelRolesChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetChannelRolesChange(Function<SetChannelRolesChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetChannelRolesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetChannelRolesChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetChannelRolesChange>";
            }
        };
    }
}
