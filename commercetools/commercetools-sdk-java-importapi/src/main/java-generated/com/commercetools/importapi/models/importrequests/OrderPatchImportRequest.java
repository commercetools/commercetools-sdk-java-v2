
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.order_patches.OrderPatchImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The request body to import OrderPatches. The data to be imported are represented by OrderPatchImport.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPatchImportRequest orderPatchImportRequest = OrderPatchImportRequest.builder()
 *             .plusPatches(patchesBuilder -> patchesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("order-patch")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderPatchImportRequestImpl.class)
public interface OrderPatchImportRequest extends ImportRequest {

    /**
     * discriminator value for OrderPatchImportRequest
     */
    String ORDER_PATCH = "order-patch";

    /**
     *  <p>The order patches of this request</p>
     * @return patches
     */
    @NotNull
    @Valid
    @JsonProperty("patches")
    public List<OrderPatchImport> getPatches();

    /**
     *  <p>The order patches of this request</p>
     * @param patches values to be set
     */

    @JsonIgnore
    public void setPatches(final OrderPatchImport... patches);

    /**
     *  <p>The order patches of this request</p>
     * @param patches values to be set
     */

    public void setPatches(final List<OrderPatchImport> patches);

    /**
     * factory method
     * @return instance of OrderPatchImportRequest
     */
    public static OrderPatchImportRequest of() {
        return new OrderPatchImportRequestImpl();
    }

    /**
     * factory method to create a shallow copy OrderPatchImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderPatchImportRequest of(final OrderPatchImportRequest template) {
        OrderPatchImportRequestImpl instance = new OrderPatchImportRequestImpl();
        instance.setPatches(template.getPatches());
        return instance;
    }

    public OrderPatchImportRequest copyDeep();

    /**
     * factory method to create a deep copy of OrderPatchImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderPatchImportRequest deepCopy(@Nullable final OrderPatchImportRequest template) {
        if (template == null) {
            return null;
        }
        OrderPatchImportRequestImpl instance = new OrderPatchImportRequestImpl();
        instance.setPatches(Optional.ofNullable(template.getPatches())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.order_patches.OrderPatchImport::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderPatchImportRequest
     * @return builder
     */
    public static OrderPatchImportRequestBuilder builder() {
        return OrderPatchImportRequestBuilder.of();
    }

    /**
     * create builder for OrderPatchImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderPatchImportRequestBuilder builder(final OrderPatchImportRequest template) {
        return OrderPatchImportRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderPatchImportRequest(Function<OrderPatchImportRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderPatchImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPatchImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPatchImportRequest>";
            }
        };
    }
}
