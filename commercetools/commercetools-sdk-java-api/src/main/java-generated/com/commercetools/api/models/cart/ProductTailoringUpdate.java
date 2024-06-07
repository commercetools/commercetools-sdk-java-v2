
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_tailoring.ProductTailoringUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringUpdate productTailoringUpdate = ProductTailoringUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringUpdateImpl.class)
public interface ProductTailoringUpdate {

    /**
     *  <p>Expected version of the ProductTailoring on which the changes apply. If the expected version does not match the actual version, a 409 Conflict is returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the ProductTailoring.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ProductTailoringUpdateAction> getActions();

    /**
     *  <p>Expected version of the ProductTailoring on which the changes apply. If the expected version does not match the actual version, a 409 Conflict is returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the ProductTailoring.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final ProductTailoringUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the ProductTailoring.</p>
     * @param actions values to be set
     */

    public void setActions(final List<ProductTailoringUpdateAction> actions);

    /**
     * factory method
     * @return instance of ProductTailoringUpdate
     */
    public static ProductTailoringUpdate of() {
        return new ProductTailoringUpdateImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringUpdate of(final ProductTailoringUpdate template) {
        ProductTailoringUpdateImpl instance = new ProductTailoringUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTailoringUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringUpdate deepCopy(@Nullable final ProductTailoringUpdate template) {
        if (template == null) {
            return null;
        }
        ProductTailoringUpdateImpl instance = new ProductTailoringUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_tailoring.ProductTailoringUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringUpdate
     * @return builder
     */
    public static ProductTailoringUpdateBuilder builder() {
        return ProductTailoringUpdateBuilder.of();
    }

    /**
     * create builder for ProductTailoringUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringUpdateBuilder builder(final ProductTailoringUpdate template) {
        return ProductTailoringUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringUpdate(Function<ProductTailoringUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringUpdate>";
            }
        };
    }
}
