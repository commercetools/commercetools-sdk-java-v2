
package com.commercetools.api.models.staged_quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String CHANGE_STAGED_QUOTE_STATE = "changeStagedQuoteState";

    /**
     *  <p>The new quote staged state to be set for the Quote Staged.</p>
     */
    @NotNull
    @JsonProperty("stagedQuoteState")
    public StagedQuoteState getStagedQuoteState();

    public void setStagedQuoteState(final StagedQuoteState stagedQuoteState);

    public static StagedQuoteChangeStagedQuoteStateAction of() {
        return new StagedQuoteChangeStagedQuoteStateActionImpl();
    }

    public static StagedQuoteChangeStagedQuoteStateAction of(final StagedQuoteChangeStagedQuoteStateAction template) {
        StagedQuoteChangeStagedQuoteStateActionImpl instance = new StagedQuoteChangeStagedQuoteStateActionImpl();
        instance.setStagedQuoteState(template.getStagedQuoteState());
        return instance;
    }

    public static StagedQuoteChangeStagedQuoteStateActionBuilder builder() {
        return StagedQuoteChangeStagedQuoteStateActionBuilder.of();
    }

    public static StagedQuoteChangeStagedQuoteStateActionBuilder builder(
            final StagedQuoteChangeStagedQuoteStateAction template) {
        return StagedQuoteChangeStagedQuoteStateActionBuilder.of(template);
    }

    default <T> T withStagedQuoteChangeStagedQuoteStateAction(
            Function<StagedQuoteChangeStagedQuoteStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteChangeStagedQuoteStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteChangeStagedQuoteStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteChangeStagedQuoteStateAction>";
            }
        };
    }
}
