
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderImportRequestBuilder
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
public class OrderImportRequestBuilder implements Builder<OrderImportRequest> {

    private java.util.List<com.commercetools.importapi.models.orders.OrderImport> resources;

    /**
     *  <p>The order import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public OrderImportRequestBuilder resources(
            final com.commercetools.importapi.models.orders.OrderImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The order import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public OrderImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.orders.OrderImport> resources) {
        this.resources = resources;
        return this;
    }

    /**
     *  <p>The order import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public OrderImportRequestBuilder plusResources(
            final com.commercetools.importapi.models.orders.OrderImport... resources) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.addAll(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The order import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public OrderImportRequestBuilder plusResources(
            Function<com.commercetools.importapi.models.orders.OrderImportBuilder, com.commercetools.importapi.models.orders.OrderImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(builder.apply(com.commercetools.importapi.models.orders.OrderImportBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The order import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public OrderImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.orders.OrderImportBuilder, com.commercetools.importapi.models.orders.OrderImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources.add(builder.apply(com.commercetools.importapi.models.orders.OrderImportBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The order import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public OrderImportRequestBuilder addResources(
            Function<com.commercetools.importapi.models.orders.OrderImportBuilder, com.commercetools.importapi.models.orders.OrderImport> builder) {
        return plusResources(builder.apply(com.commercetools.importapi.models.orders.OrderImportBuilder.of()));
    }

    /**
     *  <p>The order import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public OrderImportRequestBuilder setResources(
            Function<com.commercetools.importapi.models.orders.OrderImportBuilder, com.commercetools.importapi.models.orders.OrderImport> builder) {
        return resources(builder.apply(com.commercetools.importapi.models.orders.OrderImportBuilder.of()));
    }

    /**
     *  <p>The order import resources of this request.</p>
     * @return resources
     */

    public java.util.List<com.commercetools.importapi.models.orders.OrderImport> getResources() {
        return this.resources;
    }

    /**
     * builds OrderImportRequest with checking for non-null required values
     * @return OrderImportRequest
     */
    public OrderImportRequest build() {
        Objects.requireNonNull(resources, OrderImportRequest.class + ": resources is missing");
        return new OrderImportRequestImpl(resources);
    }

    /**
     * builds OrderImportRequest without checking for non-null required values
     * @return OrderImportRequest
     */
    public OrderImportRequest buildUnchecked() {
        return new OrderImportRequestImpl(resources);
    }

    /**
     * factory method for an instance of OrderImportRequestBuilder
     * @return builder
     */
    public static OrderImportRequestBuilder of() {
        return new OrderImportRequestBuilder();
    }

    /**
     * create builder for OrderImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderImportRequestBuilder of(final OrderImportRequest template) {
        OrderImportRequestBuilder builder = new OrderImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
