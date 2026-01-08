
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidUntilAction" rel="nofollow">Set Valid Until</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetValidUntilChange standalonePriceSetValidUntilChange = StandalonePriceSetValidUntilChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceSetValidUntilChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceSetValidUntilChangeImpl.class)
public interface StandalonePriceSetValidUntilChange extends Change {

    /**
     * discriminator value for StandalonePriceSetValidUntilChange
     */
    String STANDALONE_PRICE_SET_VALID_UNTIL_CHANGE = "StandalonePriceSetValidUntilChange";

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
     * @return instance of StandalonePriceSetValidUntilChange
     */
    public static StandalonePriceSetValidUntilChange of() {
        return new StandalonePriceSetValidUntilChangeImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceSetValidUntilChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceSetValidUntilChange of(final StandalonePriceSetValidUntilChange template) {
        StandalonePriceSetValidUntilChangeImpl instance = new StandalonePriceSetValidUntilChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public StandalonePriceSetValidUntilChange copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceSetValidUntilChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceSetValidUntilChange deepCopy(
            @Nullable final StandalonePriceSetValidUntilChange template) {
        if (template == null) {
            return null;
        }
        StandalonePriceSetValidUntilChangeImpl instance = new StandalonePriceSetValidUntilChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceSetValidUntilChange
     * @return builder
     */
    public static StandalonePriceSetValidUntilChangeBuilder builder() {
        return StandalonePriceSetValidUntilChangeBuilder.of();
    }

    /**
     * create builder for StandalonePriceSetValidUntilChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetValidUntilChangeBuilder builder(final StandalonePriceSetValidUntilChange template) {
        return StandalonePriceSetValidUntilChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceSetValidUntilChange(Function<StandalonePriceSetValidUntilChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetValidUntilChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetValidUntilChange>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceSetValidUntilChange>";
            }
        };
    }
}
