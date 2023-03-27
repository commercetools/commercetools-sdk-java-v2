
package com.commercetools.api.models.staged_quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteUpdateAction stagedQuoteUpdateAction = StagedQuoteUpdateAction.changeStagedQuoteStateBuilder()
 *             stagedQuoteState(StagedQuoteState.IN_PROGRESS)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.staged_quote.StagedQuoteChangeStagedQuoteStateActionImpl.class, name = StagedQuoteChangeStagedQuoteStateAction.CHANGE_STAGED_QUOTE_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.staged_quote.StagedQuoteSetCustomFieldActionImpl.class, name = StagedQuoteSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.staged_quote.StagedQuoteSetCustomTypeActionImpl.class, name = StagedQuoteSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.staged_quote.StagedQuoteSetSellerCommentActionImpl.class, name = StagedQuoteSetSellerCommentAction.SET_SELLER_COMMENT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.staged_quote.StagedQuoteSetValidToActionImpl.class, name = StagedQuoteSetValidToAction.SET_VALID_TO),
        @JsonSubTypes.Type(value = com.commercetools.api.models.staged_quote.StagedQuoteTransitionStateActionImpl.class, name = StagedQuoteTransitionStateAction.TRANSITION_STATE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = StagedQuoteUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = StagedQuoteUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface StagedQuoteUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<StagedQuoteUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * builder for changeStagedQuoteState subtype
     * @return builder
     */
    public static com.commercetools.api.models.staged_quote.StagedQuoteChangeStagedQuoteStateActionBuilder changeStagedQuoteStateBuilder() {
        return com.commercetools.api.models.staged_quote.StagedQuoteChangeStagedQuoteStateActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.staged_quote.StagedQuoteSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.staged_quote.StagedQuoteSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.staged_quote.StagedQuoteSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.staged_quote.StagedQuoteSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setSellerComment subtype
     * @return builder
     */
    public static com.commercetools.api.models.staged_quote.StagedQuoteSetSellerCommentActionBuilder setSellerCommentBuilder() {
        return com.commercetools.api.models.staged_quote.StagedQuoteSetSellerCommentActionBuilder.of();
    }

    /**
     * builder for setValidTo subtype
     * @return builder
     */
    public static com.commercetools.api.models.staged_quote.StagedQuoteSetValidToActionBuilder setValidToBuilder() {
        return com.commercetools.api.models.staged_quote.StagedQuoteSetValidToActionBuilder.of();
    }

    /**
     * builder for transitionState subtype
     * @return builder
     */
    public static com.commercetools.api.models.staged_quote.StagedQuoteTransitionStateActionBuilder transitionStateBuilder() {
        return com.commercetools.api.models.staged_quote.StagedQuoteTransitionStateActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteUpdateAction(Function<StagedQuoteUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteUpdateAction>";
            }
        };
    }
}
