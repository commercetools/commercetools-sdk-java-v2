
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
 * ChangeLocalizedDescriptionChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLocalizedDescriptionChange changeLocalizedDescriptionChange = ChangeLocalizedDescriptionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeLocalizedDescriptionChangeImpl.class)
public interface ChangeLocalizedDescriptionChange extends Change {

    /**
     * discriminator value for ChangeLocalizedDescriptionChange
     */
    String CHANGE_LOCALIZED_DESCRIPTION_CHANGE = "ChangeLocalizedDescriptionChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>changeDescription</code></p>
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
     *  <p>Shape of the action for <code>changeDescription</code></p>
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
     * @return instance of ChangeLocalizedDescriptionChange
     */
    public static ChangeLocalizedDescriptionChange of() {
        return new ChangeLocalizedDescriptionChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeLocalizedDescriptionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeLocalizedDescriptionChange of(final ChangeLocalizedDescriptionChange template) {
        ChangeLocalizedDescriptionChangeImpl instance = new ChangeLocalizedDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeLocalizedDescriptionChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeLocalizedDescriptionChange deepCopy(@Nullable final ChangeLocalizedDescriptionChange template) {
        if (template == null) {
            return null;
        }
        ChangeLocalizedDescriptionChangeImpl instance = new ChangeLocalizedDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(com.commercetools.history.models.common.LocalizedString::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ChangeLocalizedDescriptionChange
     * @return builder
     */
    public static ChangeLocalizedDescriptionChangeBuilder builder() {
        return ChangeLocalizedDescriptionChangeBuilder.of();
    }

    /**
     * create builder for ChangeLocalizedDescriptionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLocalizedDescriptionChangeBuilder builder(final ChangeLocalizedDescriptionChange template) {
        return ChangeLocalizedDescriptionChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeLocalizedDescriptionChange(Function<ChangeLocalizedDescriptionChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeLocalizedDescriptionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeLocalizedDescriptionChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeLocalizedDescriptionChange>";
            }
        };
    }
}
