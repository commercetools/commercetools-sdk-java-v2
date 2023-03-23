
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionUpdate productSelectionUpdate = ProductSelectionUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionUpdateImpl.class)
public interface ProductSelectionUpdate extends
        com.commercetools.api.models.ResourceUpdate<ProductSelectionUpdate, ProductSelectionUpdateAction, ProductSelectionUpdateBuilder> {

    /**
     *
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ProductSelectionUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final ProductSelectionUpdateAction... actions);

    public void setActions(final List<ProductSelectionUpdateAction> actions);

    public static ProductSelectionUpdate of() {
        return new ProductSelectionUpdateImpl();
    }

    public static ProductSelectionUpdate of(final ProductSelectionUpdate template) {
        ProductSelectionUpdateImpl instance = new ProductSelectionUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static ProductSelectionUpdateBuilder builder() {
        return ProductSelectionUpdateBuilder.of();
    }

    public static ProductSelectionUpdateBuilder builder(final ProductSelectionUpdate template) {
        return ProductSelectionUpdateBuilder.of(template);
    }

    default <T> T withProductSelectionUpdate(Function<ProductSelectionUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionUpdate>";
            }
        };
    }
}
