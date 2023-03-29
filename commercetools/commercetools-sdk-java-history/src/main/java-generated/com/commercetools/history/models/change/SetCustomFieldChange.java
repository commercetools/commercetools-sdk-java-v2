
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomFieldChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomFieldChange setCustomFieldChange = SetCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomFieldChangeImpl.class)
public interface SetCustomFieldChange extends Change {

    /**
     * discriminator value for SetCustomFieldChange
     */
    String SET_CUSTOM_FIELD_CHANGE = "SetCustomFieldChange";

    /**
     *  <p>Update action for setting a custom field</p>
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
     *  <p>Custom field name</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *
     * @return customTypeId
     */
    @NotNull
    @JsonProperty("customTypeId")
    public String getCustomTypeId();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p>Update action for setting a custom field</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Custom field name</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * set customTypeId
     * @param customTypeId value to be set
     */

    public void setCustomTypeId(final String customTypeId);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Object nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     * factory method
     * @return instance of SetCustomFieldChange
     */
    public static SetCustomFieldChange of() {
        return new SetCustomFieldChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomFieldChange of(final SetCustomFieldChange template) {
        SetCustomFieldChangeImpl instance = new SetCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomFieldChange deepCopy(@Nullable final SetCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        SetCustomFieldChangeImpl instance = new SetCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for SetCustomFieldChange
     * @return builder
     */
    public static SetCustomFieldChangeBuilder builder() {
        return SetCustomFieldChangeBuilder.of();
    }

    /**
     * create builder for SetCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomFieldChangeBuilder builder(final SetCustomFieldChange template) {
        return SetCustomFieldChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomFieldChange(Function<SetCustomFieldChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomFieldChange>";
            }
        };
    }
}
