
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeLocalizedNameChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLocalizedNameChange changeLocalizedNameChange = ChangeLocalizedNameChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeLocalizedNameChangeImpl.class)
public interface ChangeLocalizedNameChange extends Change {

    /**
     * discriminator value for ChangeLocalizedNameChange
     */
    String CHANGE_LOCALIZED_NAME_CHANGE = "ChangeLocalizedNameChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>changeName</code></p>
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
     *  <p>Shape of the action for <code>changeName</code></p>
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
     * @return instance of ChangeLocalizedNameChange
     */
    public static ChangeLocalizedNameChange of() {
        return new ChangeLocalizedNameChangeImpl();
    }

    /**
     * factory method to copy an instance of ChangeLocalizedNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeLocalizedNameChange of(final ChangeLocalizedNameChange template) {
        ChangeLocalizedNameChangeImpl instance = new ChangeLocalizedNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeLocalizedNameChange
     * @return builder
     */
    public static ChangeLocalizedNameChangeBuilder builder() {
        return ChangeLocalizedNameChangeBuilder.of();
    }

    /**
     * create builder for ChangeLocalizedNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLocalizedNameChangeBuilder builder(final ChangeLocalizedNameChange template) {
        return ChangeLocalizedNameChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeLocalizedNameChange(Function<ChangeLocalizedNameChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeLocalizedNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeLocalizedNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeLocalizedNameChange>";
            }
        };
    }
}
