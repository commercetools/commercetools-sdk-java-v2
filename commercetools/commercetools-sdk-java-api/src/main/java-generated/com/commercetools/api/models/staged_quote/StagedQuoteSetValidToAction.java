
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

    /**
     * discriminator value for StagedQuoteSetValidToAction
     */
    String SET_VALID_TO = "setValidTo";

    /**
     *  <p>If <code>validTo</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
     * @return validTo
     */

    @JsonProperty("validTo")
    public ZonedDateTime getValidTo();

    /**
     *  <p>If <code>validTo</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
     * @param validTo value to be set
     */

    public void setValidTo(final ZonedDateTime validTo);

    /**
     * factory method
     * @return instance of StagedQuoteSetValidToAction
     */
    public static StagedQuoteSetValidToAction of() {
        return new StagedQuoteSetValidToActionImpl();
    }

    /**
     * factory method to copy an instance of StagedQuoteSetValidToAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteSetValidToAction of(final StagedQuoteSetValidToAction template) {
        StagedQuoteSetValidToActionImpl instance = new StagedQuoteSetValidToActionImpl();
        instance.setValidTo(template.getValidTo());
        return instance;
    }

    /**
     * builder factory method for StagedQuoteSetValidToAction
     * @return builder
     */
    public static StagedQuoteSetValidToActionBuilder builder() {
        return StagedQuoteSetValidToActionBuilder.of();
    }

    /**
     * create builder for StagedQuoteSetValidToAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteSetValidToActionBuilder builder(final StagedQuoteSetValidToAction template) {
        return StagedQuoteSetValidToActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteSetValidToAction(Function<StagedQuoteSetValidToAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSetValidToAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSetValidToAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteSetValidToAction>";
            }
        };
    }
}
