
package com.commercetools.api.models.quote_request;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * QuoteRequestSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestSetCustomFieldAction quoteRequestSetCustomFieldAction = QuoteRequestSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestSetCustomFieldActionImpl.class)
public interface QuoteRequestSetCustomFieldAction extends QuoteRequestUpdateAction {

    /**
     * discriminator value for QuoteRequestSetCustomFieldAction
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
     * @return instance of QuoteRequestSetCustomFieldAction
     */
    public static QuoteRequestSetCustomFieldAction of() {
        return new QuoteRequestSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy QuoteRequestSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRequestSetCustomFieldAction of(final QuoteRequestSetCustomFieldAction template) {
        QuoteRequestSetCustomFieldActionImpl instance = new QuoteRequestSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public QuoteRequestSetCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of QuoteRequestSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRequestSetCustomFieldAction deepCopy(@Nullable final QuoteRequestSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        QuoteRequestSetCustomFieldActionImpl instance = new QuoteRequestSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for QuoteRequestSetCustomFieldAction
     * @return builder
     */
    public static QuoteRequestSetCustomFieldActionBuilder builder() {
        return QuoteRequestSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for QuoteRequestSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestSetCustomFieldActionBuilder builder(final QuoteRequestSetCustomFieldAction template) {
        return QuoteRequestSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestSetCustomFieldAction(Function<QuoteRequestSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static QuoteRequestSetCustomFieldAction ofUnset(final String name) {
        return QuoteRequestSetCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestSetCustomFieldAction>";
            }
        };
    }
}
