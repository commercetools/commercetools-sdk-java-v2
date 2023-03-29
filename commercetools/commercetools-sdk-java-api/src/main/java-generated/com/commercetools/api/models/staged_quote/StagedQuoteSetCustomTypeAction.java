
package com.commercetools.api.models.staged_quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
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

    /**
     * discriminator value for StagedQuoteSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the StagedQuote with Custom Fields. If absent, any existing Type and Custom Fields are removed from the StagedQuote.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the StagedQuote.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the StagedQuote with Custom Fields. If absent, any existing Type and Custom Fields are removed from the StagedQuote.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the StagedQuote.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of StagedQuoteSetCustomTypeAction
     */
    public static StagedQuoteSetCustomTypeAction of() {
        return new StagedQuoteSetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedQuoteSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteSetCustomTypeAction of(final StagedQuoteSetCustomTypeAction template) {
        StagedQuoteSetCustomTypeActionImpl instance = new StagedQuoteSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedQuoteSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedQuoteSetCustomTypeAction deepCopy(@Nullable final StagedQuoteSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        StagedQuoteSetCustomTypeActionImpl instance = new StagedQuoteSetCustomTypeActionImpl();
        instance.setType(Optional.ofNullable(template.getType())
                .map(com.commercetools.api.models.type.TypeResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setFields(Optional.ofNullable(template.getFields())
                .map(com.commercetools.api.models.type.FieldContainer::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedQuoteSetCustomTypeAction
     * @return builder
     */
    public static StagedQuoteSetCustomTypeActionBuilder builder() {
        return StagedQuoteSetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for StagedQuoteSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteSetCustomTypeActionBuilder builder(final StagedQuoteSetCustomTypeAction template) {
        return StagedQuoteSetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteSetCustomTypeAction(Function<StagedQuoteSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteSetCustomTypeAction>";
            }
        };
    }
}
