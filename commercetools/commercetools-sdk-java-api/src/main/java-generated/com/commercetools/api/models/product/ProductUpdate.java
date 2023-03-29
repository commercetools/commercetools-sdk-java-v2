
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductUpdate productUpdate = ProductUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductUpdateImpl.class)
public interface ProductUpdate
        extends com.commercetools.api.models.ResourceUpdate<ProductUpdate, ProductUpdateAction, ProductUpdateBuilder> {

    /**
     *  <p>Expected version of the Product on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Product.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ProductUpdateAction> getActions();

    /**
     *  <p>Expected version of the Product on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the Product.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final ProductUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the Product.</p>
     * @param actions values to be set
     */

    public void setActions(final List<ProductUpdateAction> actions);

    /**
     * factory method
     * @return instance of ProductUpdate
     */
    public static ProductUpdate of() {
        return new ProductUpdateImpl();
    }

    /**
     * factory method to create a shallow copy ProductUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductUpdate of(final ProductUpdate template) {
        ProductUpdateImpl instance = new ProductUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductUpdate deepCopy(@Nullable final ProductUpdate template) {
        if (template == null) {
            return null;
        }
        ProductUpdateImpl instance = new ProductUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product.ProductUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductUpdate
     * @return builder
     */
    public static ProductUpdateBuilder builder() {
        return ProductUpdateBuilder.of();
    }

    /**
     * create builder for ProductUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductUpdateBuilder builder(final ProductUpdate template) {
        return ProductUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductUpdate(Function<ProductUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ProductUpdate>";
            }
        };
    }
}
