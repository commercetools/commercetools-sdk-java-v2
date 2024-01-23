
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
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Change Name on Cart Discounts.</li>
 *   <li>Change Name on Categories.</li>
 *   <li>Change Name on Channels.</li>
 *   <li>Change Name on Products.</li>
 *   <li>Change Name on Product Discounts.</li>
 *   <li>Change Name on Product Selections.</li>
 *   <li>Change Name on Shopping Lists.</li>
 *   <li>Change Name on Zones.</li>
 *  </ul>
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
     * @return instance of ChangeLocalizedNameChange
     */
    public static ChangeLocalizedNameChange of() {
        return new ChangeLocalizedNameChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeLocalizedNameChange
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
     * factory method to create a deep copy of ChangeLocalizedNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeLocalizedNameChange deepCopy(@Nullable final ChangeLocalizedNameChange template) {
        if (template == null) {
            return null;
        }
        ChangeLocalizedNameChangeImpl instance = new ChangeLocalizedNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getNextValue()));
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
