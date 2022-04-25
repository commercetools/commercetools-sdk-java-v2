
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PriceTierDraftImpl.class)
public interface PriceTierDraft {

    @NotNull
    @JsonProperty("minimumQuantity")
    public Long getMinimumQuantity();

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.
    *  For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
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
