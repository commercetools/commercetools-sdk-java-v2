package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeUpdateImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductTypeUpdateImpl.class)
public interface ProductTypeUpdate extends com.commercetools.api.models.ResourceUpdate<ProductTypeUpdate, ProductTypeUpdateAction, ProductTypeUpdateBuilder> {


    /**
     *  <p>Expected version of the ProductType on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    /**
     *  <p>Update actions to be performed on the ProductType.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ProductTypeUpdateAction> getActions();

    /**
     *  <p>Expected version of the ProductType on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @param version value to be set
     */
    
    public void setVersion(final Long version);
    
    
    /**
     *  <p>Update actions to be performed on the ProductType.</p>
     * @param actions values to be set
     */
    
    @JsonIgnore
    public void setActions(final ProductTypeUpdateAction ...actions);
    /**
     *  <p>Update actions to be performed on the ProductType.</p>
     * @param actions values to be set
     */
    
    public void setActions(final List<ProductTypeUpdateAction> actions);

    /**
     * factory method
     * @return instance of ProductTypeUpdate
     */
    public static ProductTypeUpdate of(){
        return new ProductTypeUpdateImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductTypeUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeUpdate of(final ProductTypeUpdate template) {
        ProductTypeUpdateImpl instance = new ProductTypeUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTypeUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeUpdate deepCopy(@Nullable final ProductTypeUpdate template) {
        if (template == null) {
            return null;
        }
        ProductTypeUpdateImpl instance = new ProductTypeUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream().map(com.commercetools.api.models.product_type.ProductTypeUpdateAction::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductTypeUpdate
     * @return builder
     */
    public static ProductTypeUpdateBuilder builder() {
        return ProductTypeUpdateBuilder.of();
    }
    
    /**
     * create builder for ProductTypeUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeUpdateBuilder builder(final ProductTypeUpdate template) {
        return ProductTypeUpdateBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeUpdate(Function<ProductTypeUpdate, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeUpdate>";
            }
        };
    }
}
