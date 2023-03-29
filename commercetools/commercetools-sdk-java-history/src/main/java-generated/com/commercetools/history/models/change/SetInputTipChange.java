
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetInputTipChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetInputTipChange setInputTipChange = SetInputTipChange.builder()
 *             .change("{change}")
 *             .attributeName("{attributeName}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetInputTipChangeImpl.class)
public interface SetInputTipChange extends Change {

    /**
     * discriminator value for SetInputTipChange
     */
    String SET_INPUT_TIP_CHANGE = "SetInputTipChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setInputTip</code> on product types</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>The name of the updated attribute.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LocalizedString getPreviousValue();

    /**
     *  <p>Update action for <code>setInputTip</code> on product types</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>The name of the updated attribute.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final LocalizedString nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final LocalizedString previousValue);

    /**
     * factory method
     * @return instance of SetInputTipChange
     */
    public static SetInputTipChange of() {
        return new SetInputTipChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetInputTipChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetInputTipChange of(final SetInputTipChange template) {
        SetInputTipChangeImpl instance = new SetInputTipChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetInputTipChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetInputTipChange deepCopy(@Nullable final SetInputTipChange template) {
        if (template == null) {
            return null;
        }
        SetInputTipChangeImpl instance = new SetInputTipChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getNextValue()));
        instance.setPreviousValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for SetInputTipChange
     * @return builder
     */
    public static SetInputTipChangeBuilder builder() {
        return SetInputTipChangeBuilder.of();
    }

    /**
     * create builder for SetInputTipChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetInputTipChangeBuilder builder(final SetInputTipChange template) {
        return SetInputTipChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetInputTipChange(Function<SetInputTipChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetInputTipChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetInputTipChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetInputTipChange>";
            }
        };
    }
}
