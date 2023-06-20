
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Specifies a Price tier that applies when the minimum quantity for the LineItem of a ProductVariant with the related Price is reached in a Cart.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PriceTierDraft priceTierDraft = PriceTierDraft.builder()
 *             .minimumQuantity(0.3)
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PriceTierDraftImpl.class)
public interface PriceTierDraft extends io.vrap.rmf.base.client.Draft<PriceTierDraft> {

    /**
     *  <p>Minimum quantity this Price tier is valid for.</p>
     *  <p>The minimum quantity is always greater than or equal to 2. The base Price is interpreted as valid for a minimum quantity equal to 1. A Price or StandalonePrice cannot contain more than one tier with the same <code>minimumQuantity</code>. In the case one of the constraint is not met an InvalidField is returned.</p>
     * @return minimumQuantity
     */
    @NotNull
    @JsonProperty("minimumQuantity")
    public Long getMinimumQuantity();

    /**
     *  <p>Money value that applies when the <code>minimumQuantity</code> is greater than or equal to the LineItem <code>quantity</code>.</p>
     *  <p>The <code>currencyCode</code> of a Price tier must be the same as the <code>currencyCode</code> in the <code>value</code> of the related Price.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    /**
     *  <p>Minimum quantity this Price tier is valid for.</p>
     *  <p>The minimum quantity is always greater than or equal to 2. The base Price is interpreted as valid for a minimum quantity equal to 1. A Price or StandalonePrice cannot contain more than one tier with the same <code>minimumQuantity</code>. In the case one of the constraint is not met an InvalidField is returned.</p>
     * @param minimumQuantity value to be set
     */

    public void setMinimumQuantity(final Long minimumQuantity);

    /**
     *  <p>Money value that applies when the <code>minimumQuantity</code> is greater than or equal to the LineItem <code>quantity</code>.</p>
     *  <p>The <code>currencyCode</code> of a Price tier must be the same as the <code>currencyCode</code> in the <code>value</code> of the related Price.</p>
     * @param value value to be set
     */

    public void setValue(final Money value);

    /**
     * factory method
     * @return instance of PriceTierDraft
     */
    public static PriceTierDraft of() {
        return new PriceTierDraftImpl();
    }

    /**
     * factory method to create a shallow copy PriceTierDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static PriceTierDraft of(final PriceTierDraft template) {
        PriceTierDraftImpl instance = new PriceTierDraftImpl();
        instance.setMinimumQuantity(template.getMinimumQuantity());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of PriceTierDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PriceTierDraft deepCopy(@Nullable final PriceTierDraft template) {
        if (template == null) {
            return null;
        }
        PriceTierDraftImpl instance = new PriceTierDraftImpl();
        instance.setMinimumQuantity(template.getMinimumQuantity());
        instance.setValue(com.commercetools.api.models.common.Money.deepCopy(template.getValue()));
        return instance;
    }

    /**
     * builder factory method for PriceTierDraft
     * @return builder
     */
    public static PriceTierDraftBuilder builder() {
        return PriceTierDraftBuilder.of();
    }

    /**
     * create builder for PriceTierDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceTierDraftBuilder builder(final PriceTierDraft template) {
        return PriceTierDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPriceTierDraft(Function<PriceTierDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PriceTierDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PriceTierDraft>() {
            @Override
            public String toString() {
                return "TypeReference<PriceTierDraft>";
            }
        };
    }
}
