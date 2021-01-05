package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.order_edit.OrderEditResult;
import com.commercetools.api.models.order_edit.OrderEditPreviewFailureImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderEditPreviewFailureImpl.class)
public interface OrderEditPreviewFailure extends OrderEditResult {

    
    @NotNull
    @Valid
    @JsonProperty("errors")
    public List<ErrorObject> getErrors();

    @JsonIgnore
    public void setErrors(final ErrorObject ...errors);
    public void setErrors(final List<ErrorObject> errors);

    public static OrderEditPreviewFailure of(){
        return new OrderEditPreviewFailureImpl();
    }
    

    public static OrderEditPreviewFailure of(final OrderEditPreviewFailure template) {
        OrderEditPreviewFailureImpl instance = new OrderEditPreviewFailureImpl();
        instance.setErrors(template.getErrors());
        return instance;
    }

    public static OrderEditPreviewFailureBuilder builder(){
        return OrderEditPreviewFailureBuilder.of();
    }
    
    public static OrderEditPreviewFailureBuilder builder(final OrderEditPreviewFailure template){
        return OrderEditPreviewFailureBuilder.of(template);
    }
    

    default <T> T withOrderEditPreviewFailure(Function<OrderEditPreviewFailure, T> helper) {
        return helper.apply(this);
    }
}
