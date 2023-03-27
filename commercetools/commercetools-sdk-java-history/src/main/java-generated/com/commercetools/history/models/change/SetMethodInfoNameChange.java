
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
 * SetMethodInfoNameChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMethodInfoNameChange setMethodInfoNameChange = SetMethodInfoNameChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetMethodInfoNameChangeImpl.class)
public interface SetMethodInfoNameChange extends Change {

    /**
     * discriminator value for SetMethodInfoNameChange
     */
    String SET_METHOD_INFO_NAME_CHANGE = "SetMethodInfoNameChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>setMethodInfoName</code></p>
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
     *  <p>Shape of the action for <code>setMethodInfoName</code></p>
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
     * @return instance of SetMethodInfoNameChange
     */
    public static SetMethodInfoNameChange of() {
        return new SetMethodInfoNameChangeImpl();
    }

    /**
     * factory method to copy an instance of SetMethodInfoNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetMethodInfoNameChange of(final SetMethodInfoNameChange template) {
        SetMethodInfoNameChangeImpl instance = new SetMethodInfoNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetMethodInfoNameChange
     * @return builder
     */
    public static SetMethodInfoNameChangeBuilder builder() {
        return SetMethodInfoNameChangeBuilder.of();
    }

    /**
     * create builder for SetMethodInfoNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMethodInfoNameChangeBuilder builder(final SetMethodInfoNameChange template) {
        return SetMethodInfoNameChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetMethodInfoNameChange(Function<SetMethodInfoNameChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetMethodInfoNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetMethodInfoNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMethodInfoNameChange>";
            }
        };
    }
}
