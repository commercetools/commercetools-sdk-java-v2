package com.commercetools.api.models.quote_request;

import com.commercetools.api.models.quote_request.QuoteRequestUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.quote_request.QuoteRequestSetCustomTypeActionImpl;

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
 * QuoteRequestSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestSetCustomTypeAction quoteRequestSetCustomTypeAction = QuoteRequestSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = QuoteRequestSetCustomTypeActionImpl.class)
public interface QuoteRequestSetCustomTypeAction extends QuoteRequestUpdateAction {

    /**
     * discriminator value for QuoteRequestSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the QuoteRequest with Custom Fields. If absent, any existing Type and Custom Fields are removed from the QuoteRequest.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();
    /**
     *  <p>Sets the Custom Fields fields for the QuoteRequest.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the QuoteRequest with Custom Fields. If absent, any existing Type and Custom Fields are removed from the QuoteRequest.</p>
     * @param type value to be set
     */
    
    public void setType(final TypeResourceIdentifier type);
    
    
    /**
     *  <p>Sets the Custom Fields fields for the QuoteRequest.</p>
     * @param fields value to be set
     */
    
    public void setFields(final FieldContainer fields);
    

    /**
     * factory method
     * @return instance of QuoteRequestSetCustomTypeAction
     */
    public static QuoteRequestSetCustomTypeAction of(){
        return new QuoteRequestSetCustomTypeActionImpl();
    }
    

    /**
     * factory method to create a shallow copy QuoteRequestSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRequestSetCustomTypeAction of(final QuoteRequestSetCustomTypeAction template) {
        QuoteRequestSetCustomTypeActionImpl instance = new QuoteRequestSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of QuoteRequestSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRequestSetCustomTypeAction deepCopy(@Nullable final QuoteRequestSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        QuoteRequestSetCustomTypeActionImpl instance = new QuoteRequestSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for QuoteRequestSetCustomTypeAction
     * @return builder
     */
    public static QuoteRequestSetCustomTypeActionBuilder builder() {
        return QuoteRequestSetCustomTypeActionBuilder.of();
    }
    
    /**
     * create builder for QuoteRequestSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestSetCustomTypeActionBuilder builder(final QuoteRequestSetCustomTypeAction template) {
        return QuoteRequestSetCustomTypeActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestSetCustomTypeAction(Function<QuoteRequestSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestSetCustomTypeAction>";
            }
        };
    }
}
