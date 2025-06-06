
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Set Name on Discount Codes.</li>
 *   <li>Set State Name on States.</li>
 *   <li>Set Name on Stores.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLocalizedNameChange setLocalizedNameChange = SetLocalizedNameChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetLocalizedNameChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetLocalizedNameChangeImpl.class)
public interface SetLocalizedNameChange extends Change {

    /**
     * discriminator value for SetLocalizedNameChange
     */
    String SET_LOCALIZED_NAME_CHANGE = "SetLocalizedNameChange";

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
    public LocalizedString getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final LocalizedString previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final LocalizedString nextValue);

    /**
     * factory method
     * @return instance of SetLocalizedNameChange
     */
    public static SetLocalizedNameChange of() {
        return new SetLocalizedNameChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetLocalizedNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLocalizedNameChange of(final SetLocalizedNameChange template) {
        SetLocalizedNameChangeImpl instance = new SetLocalizedNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetLocalizedNameChange copyDeep();

    /**
     * factory method to create a deep copy of SetLocalizedNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLocalizedNameChange deepCopy(@Nullable final SetLocalizedNameChange template) {
        if (template == null) {
            return null;
        }
        SetLocalizedNameChangeImpl instance = new SetLocalizedNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetLocalizedNameChange
     * @return builder
     */
    public static SetLocalizedNameChangeBuilder builder() {
        return SetLocalizedNameChangeBuilder.of();
    }

    /**
     * create builder for SetLocalizedNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLocalizedNameChangeBuilder builder(final SetLocalizedNameChange template) {
        return SetLocalizedNameChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLocalizedNameChange(Function<SetLocalizedNameChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLocalizedNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLocalizedNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLocalizedNameChange>";
            }
        };
    }
}
