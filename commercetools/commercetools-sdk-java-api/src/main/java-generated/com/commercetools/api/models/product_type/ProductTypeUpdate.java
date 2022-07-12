
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeUpdate productTypeUpdate = ProductTypeUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeUpdateImpl.class)
public interface ProductTypeUpdate extends
        com.commercetools.api.models.ResourceUpdate<ProductTypeUpdate, ProductTypeUpdateAction, ProductTypeUpdateBuilder> {

    /**
     *  <p>Expected version of the ProductType on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the ProductType.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ProductTypeUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final ProductTypeUpdateAction... actions);

    public void setActions(final List<ProductTypeUpdateAction> actions);

    public static ProductTypeUpdate of() {
        return new ProductTypeUpdateImpl();
    }

    public static ProductTypeUpdate of(final ProductTypeUpdate template) {
        ProductTypeUpdateImpl instance = new ProductTypeUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static ProductTypeUpdateBuilder builder() {
        return ProductTypeUpdateBuilder.of();
    }

    public static ProductTypeUpdateBuilder builder(final ProductTypeUpdate template) {
        return ProductTypeUpdateBuilder.of(template);
    }

    default <T> T withProductTypeUpdate(Function<ProductTypeUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeUpdate>";
            }
        };
    }
}
