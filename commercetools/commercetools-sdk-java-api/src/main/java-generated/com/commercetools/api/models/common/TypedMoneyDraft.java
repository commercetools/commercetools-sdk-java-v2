
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.common.CentPrecisionMoneyDraftImpl.class, name = CentPrecisionMoneyDraft.CENT_PRECISION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.common.HighPrecisionMoneyDraftImpl.class, name = HighPrecisionMoneyDraft.HIGH_PRECISION) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = TypedMoneyDraftImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface TypedMoneyDraft extends Money {

    @NotNull
    @JsonProperty("type")
    public MoneyType getType();

    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

    public void setFractionDigits(final Integer fractionDigits);

    default <T> T withTypedMoneyDraft(Function<TypedMoneyDraft, T> helper) {
        return helper.apply(this);
    }
}
