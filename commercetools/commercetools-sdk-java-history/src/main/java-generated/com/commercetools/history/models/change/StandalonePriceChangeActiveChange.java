
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceChangeActiveAction" rel="nofollow">Change Active</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceChangeActiveChange standalonePriceChangeActiveChange = StandalonePriceChangeActiveChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceChangeActiveChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceChangeActiveChangeImpl.class)
public interface StandalonePriceChangeActiveChange extends Change {

    /**
     * discriminator value for StandalonePriceChangeActiveChange
     */
    String STANDALONE_PRICE_CHANGE_ACTIVE_CHANGE = "StandalonePriceChangeActiveChange";

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
    public Boolean getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Boolean getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Boolean previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Boolean nextValue);

    /**
     * factory method
     * @return instance of StandalonePriceChangeActiveChange
     */
    public static StandalonePriceChangeActiveChange of() {
        return new StandalonePriceChangeActiveChangeImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceChangeActiveChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceChangeActiveChange of(final StandalonePriceChangeActiveChange template) {
        StandalonePriceChangeActiveChangeImpl instance = new StandalonePriceChangeActiveChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public StandalonePriceChangeActiveChange copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceChangeActiveChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceChangeActiveChange deepCopy(
            @Nullable final StandalonePriceChangeActiveChange template) {
        if (template == null) {
            return null;
        }
        StandalonePriceChangeActiveChangeImpl instance = new StandalonePriceChangeActiveChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceChangeActiveChange
     * @return builder
     */
    public static StandalonePriceChangeActiveChangeBuilder builder() {
        return StandalonePriceChangeActiveChangeBuilder.of();
    }

    /**
     * create builder for StandalonePriceChangeActiveChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceChangeActiveChangeBuilder builder(final StandalonePriceChangeActiveChange template) {
        return StandalonePriceChangeActiveChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceChangeActiveChange(Function<StandalonePriceChangeActiveChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceChangeActiveChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceChangeActiveChange>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceChangeActiveChange>";
            }
        };
    }
}
