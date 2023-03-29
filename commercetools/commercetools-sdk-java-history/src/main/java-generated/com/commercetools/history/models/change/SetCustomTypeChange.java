
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomTypeChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomTypeChange setCustomTypeChange = SetCustomTypeChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomTypeChangeImpl.class)
public interface SetCustomTypeChange extends Change {

    /**
     * discriminator value for SetCustomTypeChange
     */
    String SET_CUSTOM_TYPE_CHANGE = "SetCustomTypeChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for setting a custom type</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomFields getPreviousValue();

    /**
     *  <p>Update action for setting a custom type</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomFields nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final CustomFields previousValue);

    /**
     * factory method
     * @return instance of SetCustomTypeChange
     */
    public static SetCustomTypeChange of() {
        return new SetCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomTypeChange of(final SetCustomTypeChange template) {
        SetCustomTypeChangeImpl instance = new SetCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomTypeChange deepCopy(@Nullable final SetCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        SetCustomTypeChangeImpl instance = new SetCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(com.commercetools.history.models.common.CustomFields::deepCopy)
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.CustomFields::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetCustomTypeChange
     * @return builder
     */
    public static SetCustomTypeChangeBuilder builder() {
        return SetCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomTypeChangeBuilder builder(final SetCustomTypeChange template) {
        return SetCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomTypeChange(Function<SetCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomTypeChange>";
            }
        };
    }
}
