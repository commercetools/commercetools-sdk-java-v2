
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ScoreShippingRateInputDraftImpl.class)
public interface ScoreShippingRateInputDraft extends ShippingRateInputDraft {

    String SCORE = "Score";

    @NotNull
    @JsonProperty("score")
    public Double getScore();

    public void setScore(final Double score);

    public static ScoreShippingRateInputDraft of() {
        return new ScoreShippingRateInputDraftImpl();
    }

    public static ScoreShippingRateInputDraft of(final ScoreShippingRateInputDraft template) {
        ScoreShippingRateInputDraftImpl instance = new ScoreShippingRateInputDraftImpl();
        instance.setScore(template.getScore());
        return instance;
    }

    public static ScoreShippingRateInputDraftBuilder builder() {
        return ScoreShippingRateInputDraftBuilder.of();
    }

    public static ScoreShippingRateInputDraftBuilder builder(final ScoreShippingRateInputDraft template) {
        return ScoreShippingRateInputDraftBuilder.of(template);
    }

    default <T> T withScoreShippingRateInputDraft(Function<ScoreShippingRateInputDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ScoreShippingRateInputDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ScoreShippingRateInputDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ScoreShippingRateInputDraft>";
            }
        };
    }
}
