
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoCustomFieldAction" rel="nofollow">Set MethodInfo CustomField</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMethodInfoCustomFieldChange setMethodInfoCustomFieldChange = SetMethodInfoCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetMethodInfoCustomFieldChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetMethodInfoCustomFieldChangeImpl.class)
public interface SetMethodInfoCustomFieldChange extends Change {

    /**
     * discriminator value for SetMethodInfoCustomFieldChange
     */
    String SET_METHOD_INFO_CUSTOM_FIELD_CHANGE = "SetMethodInfoCustomFieldChange";

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
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return customTypeId
     */
    @NotNull
    @JsonProperty("customTypeId")
    public String getCustomTypeId();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     */

    public void setCustomTypeId(final String customTypeId);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Object nextValue);

    /**
     * factory method
     * @return instance of SetMethodInfoCustomFieldChange
     */
    public static SetMethodInfoCustomFieldChange of() {
        return new SetMethodInfoCustomFieldChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetMethodInfoCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetMethodInfoCustomFieldChange of(final SetMethodInfoCustomFieldChange template) {
        SetMethodInfoCustomFieldChangeImpl instance = new SetMethodInfoCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetMethodInfoCustomFieldChange copyDeep();

    /**
     * factory method to create a deep copy of SetMethodInfoCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetMethodInfoCustomFieldChange deepCopy(@Nullable final SetMethodInfoCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        SetMethodInfoCustomFieldChangeImpl instance = new SetMethodInfoCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetMethodInfoCustomFieldChange
     * @return builder
     */
    public static SetMethodInfoCustomFieldChangeBuilder builder() {
        return SetMethodInfoCustomFieldChangeBuilder.of();
    }

    /**
     * create builder for SetMethodInfoCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMethodInfoCustomFieldChangeBuilder builder(final SetMethodInfoCustomFieldChange template) {
        return SetMethodInfoCustomFieldChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetMethodInfoCustomFieldChange(Function<SetMethodInfoCustomFieldChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<SetMethodInfoCustomFieldChange> typeReference() {
        return new tools.jackson.core.type.TypeReference<SetMethodInfoCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMethodInfoCustomFieldChange>";
            }
        };
    }
}
