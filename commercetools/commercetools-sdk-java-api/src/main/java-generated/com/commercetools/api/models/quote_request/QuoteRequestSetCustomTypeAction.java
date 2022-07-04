
package com.commercetools.api.models.quote_request;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestSetCustomTypeActionImpl.class)
public interface QuoteRequestSetCustomTypeAction extends QuoteRequestUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the QuoteRequest with Custom Fields. If absent, any existing Type and Custom Fields are removed from the QuoteRequest.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the QuoteRequest.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static QuoteRequestSetCustomTypeAction of() {
        return new QuoteRequestSetCustomTypeActionImpl();
    }

    public static QuoteRequestSetCustomTypeAction of(final QuoteRequestSetCustomTypeAction template) {
        QuoteRequestSetCustomTypeActionImpl instance = new QuoteRequestSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static QuoteRequestSetCustomTypeActionBuilder builder() {
        return QuoteRequestSetCustomTypeActionBuilder.of();
    }

    public static QuoteRequestSetCustomTypeActionBuilder builder(final QuoteRequestSetCustomTypeAction template) {
        return QuoteRequestSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withQuoteRequestSetCustomTypeAction(Function<QuoteRequestSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestSetCustomTypeAction>";
            }
        };
    }
}
