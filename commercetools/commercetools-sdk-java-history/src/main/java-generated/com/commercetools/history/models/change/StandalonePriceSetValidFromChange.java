
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAction" rel="nofollow">Set Valid From</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetValidFromChange standalonePriceSetValidFromChange = StandalonePriceSetValidFromChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceSetValidFromChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceSetValidFromChangeImpl.class)
public interface StandalonePriceSetValidFromChange extends Change {

    /**
     * discriminator value for StandalonePriceSetValidFromChange
     */
    String STANDALONE_PRICE_SET_VALID_FROM_CHANGE = "StandalonePriceSetValidFromChange";

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
     * @return instance of StandalonePriceSetValidFromChange
     */
    public static StandalonePriceSetValidFromChange of() {
        return new StandalonePriceSetValidFromChangeImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceSetValidFromChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceSetValidFromChange of(final StandalonePriceSetValidFromChange template) {
        StandalonePriceSetValidFromChangeImpl instance = new StandalonePriceSetValidFromChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public StandalonePriceSetValidFromChange copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceSetValidFromChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceSetValidFromChange deepCopy(
            @Nullable final StandalonePriceSetValidFromChange template) {
        if (template == null) {
            return null;
        }
        StandalonePriceSetValidFromChangeImpl instance = new StandalonePriceSetValidFromChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceSetValidFromChange
     * @return builder
     */
    public static StandalonePriceSetValidFromChangeBuilder builder() {
        return StandalonePriceSetValidFromChangeBuilder.of();
    }

    /**
     * create builder for StandalonePriceSetValidFromChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetValidFromChangeBuilder builder(final StandalonePriceSetValidFromChange template) {
        return StandalonePriceSetValidFromChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceSetValidFromChange(Function<StandalonePriceSetValidFromChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetValidFromChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetValidFromChange>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceSetValidFromChange>";
            }
        };
    }
}
