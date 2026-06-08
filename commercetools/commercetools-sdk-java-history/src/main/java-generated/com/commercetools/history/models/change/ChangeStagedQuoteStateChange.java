
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.StagedQuoteState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteChangeStagedQuoteStateAction" rel="nofollow">ChangeStagedQuoteState</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeStagedQuoteStateChange changeStagedQuoteStateChange = ChangeStagedQuoteStateChange.builder()
 *             .change("{change}")
 *             .previousValue(StagedQuoteState.IN_PROGRESS)
 *             .nextValue(StagedQuoteState.IN_PROGRESS)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeStagedQuoteStateChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeStagedQuoteStateChangeImpl.class)
public interface ChangeStagedQuoteStateChange extends Change {

    /**
     * discriminator value for ChangeStagedQuoteStateChange
     */
    String CHANGE_STAGED_QUOTE_STATE_CHANGE = "ChangeStagedQuoteStateChange";

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
    @JsonProperty("previousValue")
    public StagedQuoteState getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public StagedQuoteState getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final StagedQuoteState previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final StagedQuoteState nextValue);

    /**
     * factory method
     * @return instance of ChangeStagedQuoteStateChange
     */
    public static ChangeStagedQuoteStateChange of() {
        return new ChangeStagedQuoteStateChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeStagedQuoteStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeStagedQuoteStateChange of(final ChangeStagedQuoteStateChange template) {
        ChangeStagedQuoteStateChangeImpl instance = new ChangeStagedQuoteStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeStagedQuoteStateChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeStagedQuoteStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeStagedQuoteStateChange deepCopy(@Nullable final ChangeStagedQuoteStateChange template) {
        if (template == null) {
            return null;
        }
        ChangeStagedQuoteStateChangeImpl instance = new ChangeStagedQuoteStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeStagedQuoteStateChange
     * @return builder
     */
    public static ChangeStagedQuoteStateChangeBuilder builder() {
        return ChangeStagedQuoteStateChangeBuilder.of();
    }

    /**
     * create builder for ChangeStagedQuoteStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeStagedQuoteStateChangeBuilder builder(final ChangeStagedQuoteStateChange template) {
        return ChangeStagedQuoteStateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeStagedQuoteStateChange(Function<ChangeStagedQuoteStateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeStagedQuoteStateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeStagedQuoteStateChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeStagedQuoteStateChange>";
            }
        };
    }
}
