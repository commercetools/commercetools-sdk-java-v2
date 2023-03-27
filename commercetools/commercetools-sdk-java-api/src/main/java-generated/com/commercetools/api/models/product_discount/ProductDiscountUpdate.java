
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountUpdate productDiscountUpdate = ProductDiscountUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountUpdateImpl.class)
public interface ProductDiscountUpdate extends
        com.commercetools.api.models.ResourceUpdate<ProductDiscountUpdate, ProductDiscountUpdateAction, ProductDiscountUpdateBuilder> {

    /**
     *  <p>Expected version of the ProductDiscount on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the ProductDiscount.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ProductDiscountUpdateAction> getActions();

    /**
     *  <p>Expected version of the ProductDiscount on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the ProductDiscount.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final ProductDiscountUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the ProductDiscount.</p>
     * @param actions values to be set
     */

    public void setActions(final List<ProductDiscountUpdateAction> actions);

    /**
     * factory method
     * @return instance of ProductDiscountUpdate
     */
    public static ProductDiscountUpdate of() {
        return new ProductDiscountUpdateImpl();
    }

    /**
     * factory method to copy an instance of ProductDiscountUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountUpdate of(final ProductDiscountUpdate template) {
        ProductDiscountUpdateImpl instance = new ProductDiscountUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * builder factory method for ProductDiscountUpdate
     * @return builder
     */
    public static ProductDiscountUpdateBuilder builder() {
        return ProductDiscountUpdateBuilder.of();
    }

    /**
     * create builder for ProductDiscountUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountUpdateBuilder builder(final ProductDiscountUpdate template) {
        return ProductDiscountUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountUpdate(Function<ProductDiscountUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountUpdate>";
            }
        };
    }
}
