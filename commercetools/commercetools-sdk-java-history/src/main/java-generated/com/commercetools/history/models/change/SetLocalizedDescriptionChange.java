
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
 * SetLocalizedDescriptionChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLocalizedDescriptionChange setLocalizedDescriptionChange = SetLocalizedDescriptionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetLocalizedDescriptionChangeImpl.class)
public interface SetLocalizedDescriptionChange extends Change {

    /**
     * discriminator value for SetLocalizedDescriptionChange
     */
    String SET_LOCALIZED_DESCRIPTION_CHANGE = "SetLocalizedDescriptionChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>setDescription</code></p>
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
    @Valid
    @JsonProperty("previousValue")
    public LocalizedString getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    /**
     *  <p>Shape of the action for <code>setDescription</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final LocalizedString previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final LocalizedString nextValue);

    /**
     * factory method
     * @return instance of SetLocalizedDescriptionChange
     */
    public static SetLocalizedDescriptionChange of() {
        return new SetLocalizedDescriptionChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetLocalizedDescriptionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLocalizedDescriptionChange of(final SetLocalizedDescriptionChange template) {
        SetLocalizedDescriptionChangeImpl instance = new SetLocalizedDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetLocalizedDescriptionChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLocalizedDescriptionChange deepCopy(@Nullable final SetLocalizedDescriptionChange template) {
        if (template == null) {
            return null;
        }
        SetLocalizedDescriptionChangeImpl instance = new SetLocalizedDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetLocalizedDescriptionChange
     * @return builder
     */
    public static SetLocalizedDescriptionChangeBuilder builder() {
        return SetLocalizedDescriptionChangeBuilder.of();
    }

    /**
     * create builder for SetLocalizedDescriptionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLocalizedDescriptionChangeBuilder builder(final SetLocalizedDescriptionChange template) {
        return SetLocalizedDescriptionChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLocalizedDescriptionChange(Function<SetLocalizedDescriptionChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLocalizedDescriptionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLocalizedDescriptionChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLocalizedDescriptionChange>";
            }
        };
    }
}
