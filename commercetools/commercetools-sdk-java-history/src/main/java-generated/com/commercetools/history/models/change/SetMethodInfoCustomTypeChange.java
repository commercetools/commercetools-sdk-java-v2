
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoCustomTypeAction" rel="nofollow">Set MethodInfo CustomType</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMethodInfoCustomTypeChange setMethodInfoCustomTypeChange = SetMethodInfoCustomTypeChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetMethodInfoCustomTypeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetMethodInfoCustomTypeChangeImpl.class)
public interface SetMethodInfoCustomTypeChange extends Change {

    /**
     * discriminator value for SetMethodInfoCustomTypeChange
     */
    String SET_METHOD_INFO_CUSTOM_TYPE_CHANGE = "SetMethodInfoCustomTypeChange";

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
    @Valid
    @JsonProperty("previousValue")
    public CustomFields getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final CustomFields previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomFields nextValue);

    /**
     * factory method
     * @return instance of SetMethodInfoCustomTypeChange
     */
    public static SetMethodInfoCustomTypeChange of() {
        return new SetMethodInfoCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetMethodInfoCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetMethodInfoCustomTypeChange of(final SetMethodInfoCustomTypeChange template) {
        SetMethodInfoCustomTypeChangeImpl instance = new SetMethodInfoCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetMethodInfoCustomTypeChange copyDeep();

    /**
     * factory method to create a deep copy of SetMethodInfoCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetMethodInfoCustomTypeChange deepCopy(@Nullable final SetMethodInfoCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        SetMethodInfoCustomTypeChangeImpl instance = new SetMethodInfoCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomFields.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetMethodInfoCustomTypeChange
     * @return builder
     */
    public static SetMethodInfoCustomTypeChangeBuilder builder() {
        return SetMethodInfoCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetMethodInfoCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMethodInfoCustomTypeChangeBuilder builder(final SetMethodInfoCustomTypeChange template) {
        return SetMethodInfoCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetMethodInfoCustomTypeChange(Function<SetMethodInfoCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<SetMethodInfoCustomTypeChange> typeReference() {
        return new tools.jackson.core.type.TypeReference<SetMethodInfoCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMethodInfoCustomTypeChange>";
            }
        };
    }
}
