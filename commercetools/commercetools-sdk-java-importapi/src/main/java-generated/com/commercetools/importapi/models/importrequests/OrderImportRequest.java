package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.orders.OrderImport;
import com.commercetools.importapi.models.importrequests.OrderImportRequestImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>An import request for multiple order import resources.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderImportRequestImpl.class)
public interface OrderImportRequest extends ImportRequest {

    /**
    *  <p>The order import resources of this request.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<OrderImport> getResources();

    public void setResources(final List<OrderImport> resources);

    public static OrderImportRequestImpl of(){
        return new OrderImportRequestImpl();
    }
    

    public static OrderImportRequestImpl of(final OrderImportRequest template) {
        OrderImportRequestImpl instance = new OrderImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    default <T> T withOrderImportRequest(Function<OrderImportRequest, T> helper) {
        return helper.apply(this);
    }
}
