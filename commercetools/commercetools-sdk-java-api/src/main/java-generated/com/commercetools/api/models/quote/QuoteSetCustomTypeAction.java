
package com.commercetools.api.models.quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteSetCustomTypeActionImpl.class)
public interface QuoteSetCustomTypeAction extends QuoteUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the Quote with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Quote.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Quote.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static QuoteSetCustomTypeAction of() {
        return new QuoteSetCustomTypeActionImpl();
    }

    public static QuoteSetCustomTypeAction of(final QuoteSetCustomTypeAction template) {
        QuoteSetCustomTypeActionImpl instance = new QuoteSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static QuoteSetCustomTypeActionBuilder builder() {
        return QuoteSetCustomTypeActionBuilder.of();
    }

    public static QuoteSetCustomTypeActionBuilder builder(final QuoteSetCustomTypeAction template) {
        return QuoteSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withQuoteSetCustomTypeAction(Function<QuoteSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteSetCustomTypeAction>";
            }
        };
    }
}
