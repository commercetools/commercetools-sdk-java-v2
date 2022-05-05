
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Specifies a Price tier that applies when the minimum quantity for the <a href="ctp:api:type:LineItem">LineItem</a> of a ProductVariant with the related Price is reached in a Cart.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PriceTierDraftImpl.class)
public interface PriceTierDraft {

    /**
    *  <p>Minimum quantity this Price tier is valid for.</p>
    *  <p>The minimum quantity is always greater than or equal to 2. The base Price is interpreted as valid for a minimum quantity equal to 1.</p>
    */
    @NotNull
    @JsonProperty("minimumQuantity")
    public Long getMinimumQuantity();

    /**
    *  <p>Money value that applies when the <code>minimumQuantity</code> is greater than or equal to the <a href="ctp:api:type:LineItem">LineItem</a> <code>quantity</code>.</p>
    *  <p>The <code>currencyCode</code> of a Price tier must be the same as the <code>currencyCode</code> in the <code>value</code> of the related Price.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    public void setMinimumQuantity(final Long minimumQuantity);

    public void setValue(final Money value);

    public static PriceTierDraft of() {
        return new PriceTierDraftImpl();
    }

    public static PriceTierDraft of(final PriceTierDraft template) {
        PriceTierDraftImpl instance = new PriceTierDraftImpl();
        instance.setMinimumQuantity(template.getMinimumQuantity());
        instance.setValue(template.getValue());
        return instance;
    }

    public static PriceTierDraftBuilder builder() {
        return PriceTierDraftBuilder.of();
    }

    public static PriceTierDraftBuilder builder(final PriceTierDraft template) {
        return PriceTierDraftBuilder.of(template);
    }

    default <T> T withPriceTierDraft(Function<PriceTierDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PriceTierDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PriceTierDraft>() {
            @Override
            public String toString() {
                return "TypeReference<PriceTierDraft>";
            }
        };
    }
}
