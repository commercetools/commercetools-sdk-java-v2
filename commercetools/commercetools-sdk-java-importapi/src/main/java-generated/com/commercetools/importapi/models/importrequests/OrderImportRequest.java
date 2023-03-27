
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
 *  <p>The request body to import Orders. Contains data for Orders to be created in a Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderImportRequest orderImportRequest = OrderImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderImportRequestImpl.class)
public interface OrderImportRequest extends ImportRequest {

    /**
     * discriminator value for OrderImportRequest
     */
    String ORDER = "order";

    /**
     *  <p>The order import resources of this request.</p>
     * @return resources
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<OrderImport> getResources();

    /**
     *  <p>The order import resources of this request.</p>
     * @param resources values to be set
     */

    @JsonIgnore
    public void setResources(final OrderImport... resources);

    /**
     *  <p>The order import resources of this request.</p>
     * @param resources values to be set
     */

    public void setResources(final List<OrderImport> resources);

    /**
     * factory method
     * @return instance of OrderImportRequest
     */
    public static OrderImportRequest of() {
        return new OrderImportRequestImpl();
    }

    /**
     * factory method to copy an instance of OrderImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderImportRequest of(final OrderImportRequest template) {
        OrderImportRequestImpl instance = new OrderImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    /**
     * builder factory method for OrderImportRequest
     * @return builder
     */
    public static OrderImportRequestBuilder builder() {
        return OrderImportRequestBuilder.of();
    }

    /**
     * create builder for OrderImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderImportRequestBuilder builder(final OrderImportRequest template) {
        return OrderImportRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderImportRequest(Function<OrderImportRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<OrderImportRequest>";
            }
        };
    }
}
