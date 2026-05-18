
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetCustomFieldAction" rel="nofollow">Set Custom Field</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetCustomFieldChange standalonePriceSetCustomFieldChange = StandalonePriceSetCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceSetCustomFieldChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceSetCustomFieldChangeImpl.class)
public interface StandalonePriceSetCustomFieldChange extends Change {

    /**
     * discriminator value for StandalonePriceSetCustomFieldChange
     */
    String STANDALONE_PRICE_SET_CUSTOM_FIELD_CHANGE = "StandalonePriceSetCustomFieldChange";

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
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return customTypeId
     */
    @NotNull
    @JsonProperty("customTypeId")
    public String getCustomTypeId();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     */

    public void setCustomTypeId(final String customTypeId);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Object nextValue);

    /**
     * factory method
     * @return instance of StandalonePriceSetCustomFieldChange
     */
    public static StandalonePriceSetCustomFieldChange of() {
        return new StandalonePriceSetCustomFieldChangeImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceSetCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceSetCustomFieldChange of(final StandalonePriceSetCustomFieldChange template) {
        StandalonePriceSetCustomFieldChangeImpl instance = new StandalonePriceSetCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public StandalonePriceSetCustomFieldChange copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceSetCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceSetCustomFieldChange deepCopy(
            @Nullable final StandalonePriceSetCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        StandalonePriceSetCustomFieldChangeImpl instance = new StandalonePriceSetCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceSetCustomFieldChange
     * @return builder
     */
    public static StandalonePriceSetCustomFieldChangeBuilder builder() {
        return StandalonePriceSetCustomFieldChangeBuilder.of();
    }

    /**
     * create builder for StandalonePriceSetCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetCustomFieldChangeBuilder builder(
            final StandalonePriceSetCustomFieldChange template) {
        return StandalonePriceSetCustomFieldChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceSetCustomFieldChange(Function<StandalonePriceSetCustomFieldChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceSetCustomFieldChange>";
            }
        };
    }
}
