
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
 *  <p>Change triggered by the Set Slug update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetSlugChange setSlugChange = SetSlugChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetSlugChangeImpl.class)
public interface SetSlugChange extends Change {

    /**
     * discriminator value for SetSlugChange
     */
    String SET_SLUG_CHANGE = "SetSlugChange";

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
     * @return instance of SetSlugChange
     */
    public static SetSlugChange of() {
        return new SetSlugChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetSlugChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetSlugChange of(final SetSlugChange template) {
        SetSlugChangeImpl instance = new SetSlugChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetSlugChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetSlugChange deepCopy(@Nullable final SetSlugChange template) {
        if (template == null) {
            return null;
        }
        SetSlugChangeImpl instance = new SetSlugChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetSlugChange
     * @return builder
     */
    public static SetSlugChangeBuilder builder() {
        return SetSlugChangeBuilder.of();
    }

    /**
     * create builder for SetSlugChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetSlugChangeBuilder builder(final SetSlugChange template) {
        return SetSlugChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetSlugChange(Function<SetSlugChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetSlugChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetSlugChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetSlugChange>";
            }
        };
    }
}
