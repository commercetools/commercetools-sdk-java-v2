
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Permission;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRoleSetPermissionsAction" rel="nofollow">Set Permissions</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRoleAddPermissionAction" rel="nofollow">Add Permission</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRoleRemovePermissionAction" rel="nofollow">Remove Permission</a> update actions.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPermissionsChange setPermissionsChange = SetPermissionsChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetPermissionsChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetPermissionsChangeImpl.class)
public interface SetPermissionsChange extends Change {

    /**
     * discriminator value for SetPermissionsChange
     */
    String SET_PERMISSIONS_CHANGE = "SetPermissionsChange";

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
    public List<Permission> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public List<Permission> getNextValue();

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
    public void setPreviousValue(final Permission... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<Permission> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final Permission... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<Permission> nextValue);

    /**
     * factory method
     * @return instance of SetPermissionsChange
     */
    public static SetPermissionsChange of() {
        return new SetPermissionsChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetPermissionsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetPermissionsChange of(final SetPermissionsChange template) {
        SetPermissionsChangeImpl instance = new SetPermissionsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetPermissionsChange copyDeep();

    /**
     * factory method to create a deep copy of SetPermissionsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetPermissionsChange deepCopy(@Nullable final SetPermissionsChange template) {
        if (template == null) {
            return null;
        }
        SetPermissionsChangeImpl instance = new SetPermissionsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue()).map(ArrayList::new).orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetPermissionsChange
     * @return builder
     */
    public static SetPermissionsChangeBuilder builder() {
        return SetPermissionsChangeBuilder.of();
    }

    /**
     * create builder for SetPermissionsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPermissionsChangeBuilder builder(final SetPermissionsChange template) {
        return SetPermissionsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetPermissionsChange(Function<SetPermissionsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetPermissionsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetPermissionsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetPermissionsChange>";
            }
        };
    }
}
