
package com.commercetools.api.models.quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * QuoteSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteSetCustomTypeAction quoteSetCustomTypeAction = QuoteSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteSetCustomTypeActionImpl.class)
public interface QuoteSetCustomTypeAction extends QuoteUpdateAction {

    /**
     * discriminator value for QuoteSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Quote with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Quote.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Quote.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Quote with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Quote.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Quote.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of QuoteSetCustomTypeAction
     */
    public static QuoteSetCustomTypeAction of() {
        return new QuoteSetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy QuoteSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteSetCustomTypeAction of(final QuoteSetCustomTypeAction template) {
        QuoteSetCustomTypeActionImpl instance = new QuoteSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public QuoteSetCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of QuoteSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteSetCustomTypeAction deepCopy(@Nullable final QuoteSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        QuoteSetCustomTypeActionImpl instance = new QuoteSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for QuoteSetCustomTypeAction
     * @return builder
     */
    public static QuoteSetCustomTypeActionBuilder builder() {
        return QuoteSetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for QuoteSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteSetCustomTypeActionBuilder builder(final QuoteSetCustomTypeAction template) {
        return QuoteSetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteSetCustomTypeAction(Function<QuoteSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteSetCustomTypeAction>";
            }
        };
    }
}
