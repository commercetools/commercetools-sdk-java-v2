
package com.commercetools.api.models.staged_quote;

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
 * StagedQuoteSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteSetCustomTypeAction stagedQuoteSetCustomTypeAction = StagedQuoteSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteSetCustomTypeActionImpl.class)
public interface StagedQuoteSetCustomTypeAction extends StagedQuoteUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the StagedQuote with Custom Fields. If absent, any existing Type and Custom Fields are removed from the StagedQuote.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the StagedQuote.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static StagedQuoteSetCustomTypeAction of() {
        return new StagedQuoteSetCustomTypeActionImpl();
    }

    public static StagedQuoteSetCustomTypeAction of(final StagedQuoteSetCustomTypeAction template) {
        StagedQuoteSetCustomTypeActionImpl instance = new StagedQuoteSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static StagedQuoteSetCustomTypeActionBuilder builder() {
        return StagedQuoteSetCustomTypeActionBuilder.of();
    }

    public static StagedQuoteSetCustomTypeActionBuilder builder(final StagedQuoteSetCustomTypeAction template) {
        return StagedQuoteSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withStagedQuoteSetCustomTypeAction(Function<StagedQuoteSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteSetCustomTypeAction>";
            }
        };
    }
}
