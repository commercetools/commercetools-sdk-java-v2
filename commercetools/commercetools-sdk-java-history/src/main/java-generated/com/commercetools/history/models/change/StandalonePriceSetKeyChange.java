
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetKeyChange standalonePriceSetKeyChange = StandalonePriceSetKeyChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceSetKeyChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceSetKeyChangeImpl.class)
public interface StandalonePriceSetKeyChange extends Change {

    /**
     * discriminator value for StandalonePriceSetKeyChange
     */
    String STANDALONE_PRICE_SET_KEY_CHANGE = "StandalonePriceSetKeyChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final String previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     * factory method
     * @return instance of StandalonePriceSetKeyChange
     */
    public static StandalonePriceSetKeyChange of() {
        return new StandalonePriceSetKeyChangeImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceSetKeyChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceSetKeyChange of(final StandalonePriceSetKeyChange template) {
        StandalonePriceSetKeyChangeImpl instance = new StandalonePriceSetKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public StandalonePriceSetKeyChange copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceSetKeyChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceSetKeyChange deepCopy(@Nullable final StandalonePriceSetKeyChange template) {
        if (template == null) {
            return null;
        }
        StandalonePriceSetKeyChangeImpl instance = new StandalonePriceSetKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceSetKeyChange
     * @return builder
     */
    public static StandalonePriceSetKeyChangeBuilder builder() {
        return StandalonePriceSetKeyChangeBuilder.of();
    }

    /**
     * create builder for StandalonePriceSetKeyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetKeyChangeBuilder builder(final StandalonePriceSetKeyChange template) {
        return StandalonePriceSetKeyChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceSetKeyChange(Function<StandalonePriceSetKeyChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetKeyChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetKeyChange>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceSetKeyChange>";
            }
        };
    }
}
