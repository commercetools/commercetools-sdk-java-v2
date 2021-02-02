
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.orders.OrderImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>An import request for multiple order import resources.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderImportRequestImpl.class)
public interface OrderImportRequest extends ImportRequest {

    String ORDER = "order";

    /**
    *  <p>The order import resources of this request.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<OrderImport> getResources();

    @JsonIgnore
    public void setResources(final OrderImport... resources);

    public void setResources(final List<OrderImport> resources);

    public static OrderImportRequest of() {
        return new OrderImportRequestImpl();
    }

    public static OrderImportRequest of(final OrderImportRequest template) {
        OrderImportRequestImpl instance = new OrderImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public static OrderImportRequestBuilder builder() {
        return OrderImportRequestBuilder.of();
    }

    public static OrderImportRequestBuilder builder(final OrderImportRequest template) {
        return OrderImportRequestBuilder.of(template);
    }

    default <T> T withOrderImportRequest(Function<OrderImportRequest, T> helper) {
        return helper.apply(this);
    }
}
