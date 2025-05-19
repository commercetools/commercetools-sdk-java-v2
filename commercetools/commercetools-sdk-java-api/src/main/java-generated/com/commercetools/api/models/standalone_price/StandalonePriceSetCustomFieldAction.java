
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * StandalonePriceSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetCustomFieldAction standalonePriceSetCustomFieldAction = StandalonePriceSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceSetCustomFieldActionImpl.class)
public interface StandalonePriceSetCustomFieldAction extends StandalonePriceUpdateAction {

    /**
     * discriminator value for StandalonePriceSetCustomFieldAction
     */
    String SET_CUSTOM_FIELD = "setCustomField";

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of StandalonePriceSetCustomFieldAction
     */
    public static StandalonePriceSetCustomFieldAction of() {
        return new StandalonePriceSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceSetCustomFieldAction of(final StandalonePriceSetCustomFieldAction template) {
        StandalonePriceSetCustomFieldActionImpl instance = new StandalonePriceSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public StandalonePriceSetCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceSetCustomFieldAction deepCopy(
            @Nullable final StandalonePriceSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        StandalonePriceSetCustomFieldActionImpl instance = new StandalonePriceSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceSetCustomFieldAction
     * @return builder
     */
    public static StandalonePriceSetCustomFieldActionBuilder builder() {
        return StandalonePriceSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for StandalonePriceSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetCustomFieldActionBuilder builder(
            final StandalonePriceSetCustomFieldAction template) {
        return StandalonePriceSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceSetCustomFieldAction(Function<StandalonePriceSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static StandalonePriceSetCustomFieldAction ofUnset(final String name) {
        return StandalonePriceSetCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceSetCustomFieldAction>";
            }
        };
    }
}
