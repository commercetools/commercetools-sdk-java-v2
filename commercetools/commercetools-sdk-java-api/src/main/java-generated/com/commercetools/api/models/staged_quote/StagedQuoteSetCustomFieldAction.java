
package com.commercetools.api.models.staged_quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * StagedQuoteSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteSetCustomFieldAction stagedQuoteSetCustomFieldAction = StagedQuoteSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteSetCustomFieldActionImpl.class)
public interface StagedQuoteSetCustomFieldAction extends StagedQuoteUpdateAction {

    /**
     * discriminator value for StagedQuoteSetCustomFieldAction
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
     * @return instance of StagedQuoteSetCustomFieldAction
     */
    public static StagedQuoteSetCustomFieldAction of() {
        return new StagedQuoteSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedQuoteSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteSetCustomFieldAction of(final StagedQuoteSetCustomFieldAction template) {
        StagedQuoteSetCustomFieldActionImpl instance = new StagedQuoteSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public StagedQuoteSetCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of StagedQuoteSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedQuoteSetCustomFieldAction deepCopy(@Nullable final StagedQuoteSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        StagedQuoteSetCustomFieldActionImpl instance = new StagedQuoteSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for StagedQuoteSetCustomFieldAction
     * @return builder
     */
    public static StagedQuoteSetCustomFieldActionBuilder builder() {
        return StagedQuoteSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for StagedQuoteSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteSetCustomFieldActionBuilder builder(final StagedQuoteSetCustomFieldAction template) {
        return StagedQuoteSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteSetCustomFieldAction(Function<StagedQuoteSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static StagedQuoteSetCustomFieldAction ofUnset(final String name) {
        return StagedQuoteSetCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteSetCustomFieldAction>";
            }
        };
    }
}
