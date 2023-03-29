
package com.commercetools.api.models.staged_quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteChangeStagedQuoteStateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteChangeStagedQuoteStateAction stagedQuoteChangeStagedQuoteStateAction = StagedQuoteChangeStagedQuoteStateAction.builder()
 *             .stagedQuoteState(StagedQuoteState.IN_PROGRESS)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteChangeStagedQuoteStateActionImpl.class)
public interface StagedQuoteChangeStagedQuoteStateAction extends StagedQuoteUpdateAction {

    /**
     * discriminator value for StagedQuoteChangeStagedQuoteStateAction
     */
    String CHANGE_STAGED_QUOTE_STATE = "changeStagedQuoteState";

    /**
     *  <p>New state to be set for the Staged Quote.</p>
     * @return stagedQuoteState
     */
    @NotNull
    @JsonProperty("stagedQuoteState")
    public StagedQuoteState getStagedQuoteState();

    /**
     *  <p>New state to be set for the Staged Quote.</p>
     * @param stagedQuoteState value to be set
     */

    public void setStagedQuoteState(final StagedQuoteState stagedQuoteState);

    /**
     * factory method
     * @return instance of StagedQuoteChangeStagedQuoteStateAction
     */
    public static StagedQuoteChangeStagedQuoteStateAction of() {
        return new StagedQuoteChangeStagedQuoteStateActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedQuoteChangeStagedQuoteStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteChangeStagedQuoteStateAction of(final StagedQuoteChangeStagedQuoteStateAction template) {
        StagedQuoteChangeStagedQuoteStateActionImpl instance = new StagedQuoteChangeStagedQuoteStateActionImpl();
        instance.setStagedQuoteState(template.getStagedQuoteState());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedQuoteChangeStagedQuoteStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedQuoteChangeStagedQuoteStateAction deepCopy(
            @Nullable final StagedQuoteChangeStagedQuoteStateAction template) {
        if (template == null) {
            return null;
        }
        StagedQuoteChangeStagedQuoteStateActionImpl instance = new StagedQuoteChangeStagedQuoteStateActionImpl();
        instance.setStagedQuoteState(template.getStagedQuoteState());
        return instance;
    }

    /**
     * builder factory method for StagedQuoteChangeStagedQuoteStateAction
     * @return builder
     */
    public static StagedQuoteChangeStagedQuoteStateActionBuilder builder() {
        return StagedQuoteChangeStagedQuoteStateActionBuilder.of();
    }

    /**
     * create builder for StagedQuoteChangeStagedQuoteStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteChangeStagedQuoteStateActionBuilder builder(
            final StagedQuoteChangeStagedQuoteStateAction template) {
        return StagedQuoteChangeStagedQuoteStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteChangeStagedQuoteStateAction(
            Function<StagedQuoteChangeStagedQuoteStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteChangeStagedQuoteStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteChangeStagedQuoteStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteChangeStagedQuoteStateAction>";
            }
        };
    }
}
