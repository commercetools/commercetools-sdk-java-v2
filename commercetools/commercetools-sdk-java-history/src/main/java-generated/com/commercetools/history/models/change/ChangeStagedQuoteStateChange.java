
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.StagedQuoteState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Update action for <code>changeStagedQuoteState</code> on <code>staged-quote</code></p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeStagedQuoteStateChange changeStagedQuoteStateChange = ChangeStagedQuoteStateChange.builder()
 *             .change("{change}")
 *             .nextValue(StagedQuoteState.IN_PROGRESS)
 *             .previousValue(StagedQuoteState.IN_PROGRESS)
 *             .build()
 * </code></pre>
 * </div>
 */
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
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public StagedQuoteState getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public StagedQuoteState getPreviousValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final StagedQuoteState nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final StagedQuoteState previousValue);

    /**
     * factory method
     * @return instance of ChangeStagedQuoteStateChange
     */
    public static ChangeStagedQuoteStateChange of() {
        return new ChangeStagedQuoteStateChangeImpl();
    }

    /**
     * factory method to copy an instance of ChangeStagedQuoteStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeStagedQuoteStateChange of(final ChangeStagedQuoteStateChange template) {
        ChangeStagedQuoteStateChangeImpl instance = new ChangeStagedQuoteStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
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
