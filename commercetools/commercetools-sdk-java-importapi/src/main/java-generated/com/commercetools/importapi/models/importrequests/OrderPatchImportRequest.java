
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.order_patches.OrderPatchImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The request body to <a href="#import-orderpatches">import OrderPatches</a>. The data to be imported are represented by <a href="#orderpatchimport">OrderPatchImport</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderPatchImportRequestImpl.class)
public interface OrderPatchImportRequest extends ImportRequest {

    String ORDER_PATCH = "order-patch";

    /**
    *  <p>The order patches of this request</p>
    */
    @NotNull
    @Valid
    @JsonProperty("patches")
    public List<OrderPatchImport> getPatches();

    @JsonIgnore
    public void setPatches(final OrderPatchImport... patches);

    public void setPatches(final List<OrderPatchImport> patches);

    public static OrderPatchImportRequest of() {
        return new OrderPatchImportRequestImpl();
    }

    public static OrderPatchImportRequest of(final OrderPatchImportRequest template) {
        OrderPatchImportRequestImpl instance = new OrderPatchImportRequestImpl();
        instance.setPatches(template.getPatches());
        return instance;
    }

    public static OrderPatchImportRequestBuilder builder() {
        return OrderPatchImportRequestBuilder.of();
    }

    public static OrderPatchImportRequestBuilder builder(final OrderPatchImportRequest template) {
        return OrderPatchImportRequestBuilder.of(template);
    }

    default <T> T withOrderPatchImportRequest(Function<OrderPatchImportRequest, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderPatchImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPatchImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPatchImportRequest>";
            }
        };
    }
}
