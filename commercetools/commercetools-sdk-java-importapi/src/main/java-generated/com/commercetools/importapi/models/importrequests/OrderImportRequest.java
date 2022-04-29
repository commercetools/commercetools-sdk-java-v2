
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
*  <p>The request body to <a href="#import-orders">import Orders</a>. Contains data for <a href="/../api/projects/orders#order">Orders</a> to be created or updated in a commercetools Project.</p>
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

    public static com.fasterxml.jackson.core.type.TypeReference<OrderImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<OrderImportRequest>";
            }
        };
    }
}
