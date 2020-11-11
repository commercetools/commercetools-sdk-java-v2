package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditApplied;
import com.commercetools.api.models.order_edit.OrderEditNotProcessed;
import com.commercetools.api.models.order_edit.OrderEditPreviewFailure;
import com.commercetools.api.models.order_edit.OrderEditPreviewSuccess;
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
public final class OrderEditResultImpl implements OrderEditResult {

    private String type;

    @JsonCreator
    OrderEditResultImpl(@JsonProperty("type") final String type) {
        this.type = type;
    }
    public OrderEditResultImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }


}
