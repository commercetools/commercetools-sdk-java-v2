
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
 * SetMetaTitleChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMetaTitleChange setMetaTitleChange = SetMetaTitleChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetMetaTitleChangeImpl.class)
public interface SetMetaTitleChange extends Change {

    /**
     * discriminator value for SetMetaTitleChange
     */
    String SET_META_TITLE_CHANGE = "SetMetaTitleChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>setMetaTitle</code></p>
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
     *  <p>Shape of the action for <code>setMetaTitle</code></p>
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
     * @return instance of SetMetaTitleChange
     */
    public static SetMetaTitleChange of() {
        return new SetMetaTitleChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetMetaTitleChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetMetaTitleChange of(final SetMetaTitleChange template) {
        SetMetaTitleChangeImpl instance = new SetMetaTitleChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetMetaTitleChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetMetaTitleChange deepCopy(@Nullable final SetMetaTitleChange template) {
        if (template == null) {
            return null;
        }
        SetMetaTitleChangeImpl instance = new SetMetaTitleChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetMetaTitleChange
     * @return builder
     */
    public static SetMetaTitleChangeBuilder builder() {
        return SetMetaTitleChangeBuilder.of();
    }

    /**
     * create builder for SetMetaTitleChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMetaTitleChangeBuilder builder(final SetMetaTitleChange template) {
        return SetMetaTitleChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetMetaTitleChange(Function<SetMetaTitleChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetMetaTitleChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetMetaTitleChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMetaTitleChange>";
            }
        };
    }
}
