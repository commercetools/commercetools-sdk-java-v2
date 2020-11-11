package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ClassificationShippingRateInputDraft;
import com.commercetools.api.models.cart.ScoreShippingRateInputDraft;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingRateInputDraftImpl implements ShippingRateInputDraft {

    private String type;

    @JsonCreator
    ShippingRateInputDraftImpl(@JsonProperty("type") final String type) {
        this.type = type;
    }
    public ShippingRateInputDraftImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }


}
