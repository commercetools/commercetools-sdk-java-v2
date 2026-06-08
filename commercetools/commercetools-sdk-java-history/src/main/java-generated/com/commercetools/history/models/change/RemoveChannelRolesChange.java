
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRemoveRolesAction" rel="nofollow">Remove Roles</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveChannelRolesChange removeChannelRolesChange = RemoveChannelRolesChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RemoveChannelRolesChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveChannelRolesChangeImpl.class)
public interface RemoveChannelRolesChange extends Change {

    /**
     * discriminator value for RemoveChannelRolesChange
     */
    String REMOVE_CHANNEL_ROLES_CHANGE = "RemoveChannelRolesChange";

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
     * @return instance of RemoveChannelRolesChange
     */
    public static RemoveChannelRolesChange of() {
        return new RemoveChannelRolesChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveChannelRolesChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveChannelRolesChange of(final RemoveChannelRolesChange template) {
        RemoveChannelRolesChangeImpl instance = new RemoveChannelRolesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public RemoveChannelRolesChange copyDeep();

    /**
     * factory method to create a deep copy of RemoveChannelRolesChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveChannelRolesChange deepCopy(@Nullable final RemoveChannelRolesChange template) {
        if (template == null) {
            return null;
        }
        RemoveChannelRolesChangeImpl instance = new RemoveChannelRolesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue()).map(ArrayList::new).orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for RemoveChannelRolesChange
     * @return builder
     */
    public static RemoveChannelRolesChangeBuilder builder() {
        return RemoveChannelRolesChangeBuilder.of();
    }

    /**
     * create builder for RemoveChannelRolesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveChannelRolesChangeBuilder builder(final RemoveChannelRolesChange template) {
        return RemoveChannelRolesChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveChannelRolesChange(Function<RemoveChannelRolesChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveChannelRolesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveChannelRolesChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveChannelRolesChange>";
            }
        };
    }
}
