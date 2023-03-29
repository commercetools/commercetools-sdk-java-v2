
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.ChannelRole;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetChannelRolesChange
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
    public void setPreviousValue(final ChannelRole... previousValue);

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
    public void setNextValue(final ChannelRole... nextValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    public void setNextValue(final List<ChannelRole> nextValue);

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
