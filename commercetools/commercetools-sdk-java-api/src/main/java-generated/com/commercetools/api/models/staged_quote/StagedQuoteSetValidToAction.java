
package com.commercetools.api.models.staged_quote;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteSetValidToAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteSetValidToAction stagedQuoteSetValidToAction = StagedQuoteSetValidToAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteSetValidToActionImpl.class)
public interface StagedQuoteSetValidToAction extends StagedQuoteUpdateAction {

    String SET_VALID_TO = "setValidTo";

    /**
     *  <p>If <code>validTo</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
     */

    @JsonProperty("validTo")
    public ZonedDateTime getValidTo();

    public void setValidTo(final ZonedDateTime validTo);

    public static StagedQuoteSetValidToAction of() {
        return new StagedQuoteSetValidToActionImpl();
    }

    public static StagedQuoteSetValidToAction of(final StagedQuoteSetValidToAction template) {
        StagedQuoteSetValidToActionImpl instance = new StagedQuoteSetValidToActionImpl();
        instance.setValidTo(template.getValidTo());
        return instance;
    }

    public static StagedQuoteSetValidToActionBuilder builder() {
        return StagedQuoteSetValidToActionBuilder.of();
    }

    public static StagedQuoteSetValidToActionBuilder builder(final StagedQuoteSetValidToAction template) {
        return StagedQuoteSetValidToActionBuilder.of(template);
    }

    default <T> T withStagedQuoteSetValidToAction(Function<StagedQuoteSetValidToAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSetValidToAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSetValidToAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteSetValidToAction>";
            }
        };
    }
}
