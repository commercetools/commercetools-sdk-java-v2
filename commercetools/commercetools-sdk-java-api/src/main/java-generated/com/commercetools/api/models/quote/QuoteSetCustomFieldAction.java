package com.commercetools.api.models.quote;

import com.commercetools.api.models.quote.QuoteUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.quote.QuoteSetCustomFieldActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * QuoteSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteSetCustomFieldAction quoteSetCustomFieldAction = QuoteSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = QuoteSetCustomFieldActionImpl.class)
public interface QuoteSetCustomFieldAction extends QuoteUpdateAction {

    /**
     * discriminator value for QuoteSetCustomFieldAction
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
     * @return instance of QuoteSetCustomFieldAction
     */
    public static QuoteSetCustomFieldAction of(){
        return new QuoteSetCustomFieldActionImpl();
    }
    

    /**
     * factory method to create a shallow copy QuoteSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteSetCustomFieldAction of(final QuoteSetCustomFieldAction template) {
        QuoteSetCustomFieldActionImpl instance = new QuoteSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of QuoteSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteSetCustomFieldAction deepCopy(@Nullable final QuoteSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        QuoteSetCustomFieldActionImpl instance = new QuoteSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for QuoteSetCustomFieldAction
     * @return builder
     */
    public static QuoteSetCustomFieldActionBuilder builder() {
        return QuoteSetCustomFieldActionBuilder.of();
    }
    
    /**
     * create builder for QuoteSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteSetCustomFieldActionBuilder builder(final QuoteSetCustomFieldAction template) {
        return QuoteSetCustomFieldActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteSetCustomFieldAction(Function<QuoteSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
    public static QuoteSetCustomFieldAction ofUnset(final String name) {
        return QuoteSetCustomFieldActionBuilder.of().name(name).build();
    }
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteSetCustomFieldAction>";
            }
        };
    }
}
