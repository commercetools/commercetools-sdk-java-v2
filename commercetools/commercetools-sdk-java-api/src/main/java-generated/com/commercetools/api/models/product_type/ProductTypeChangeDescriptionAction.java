package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeChangeDescriptionActionImpl;

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
 * ProductTypeChangeDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeDescriptionAction productTypeChangeDescriptionAction = ProductTypeChangeDescriptionAction.builder()
 *             .description("{description}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductTypeChangeDescriptionActionImpl.class)
public interface ProductTypeChangeDescriptionAction extends ProductTypeUpdateAction {

    /**
     * discriminator value for ProductTypeChangeDescriptionAction
     */
    String CHANGE_DESCRIPTION = "changeDescription";

    /**
     *  <p>New value to set.</p>
     * @return description
     */
    @NotNull
    @JsonProperty("description")
    public String getDescription();

    /**
     *  <p>New value to set.</p>
     * @param description value to be set
     */
    
    public void setDescription(final String description);
    

    /**
     * factory method
     * @return instance of ProductTypeChangeDescriptionAction
     */
    public static ProductTypeChangeDescriptionAction of(){
        return new ProductTypeChangeDescriptionActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductTypeChangeDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeChangeDescriptionAction of(final ProductTypeChangeDescriptionAction template) {
        ProductTypeChangeDescriptionActionImpl instance = new ProductTypeChangeDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTypeChangeDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeChangeDescriptionAction deepCopy(@Nullable final ProductTypeChangeDescriptionAction template) {
        if (template == null) {
            return null;
        }
        ProductTypeChangeDescriptionActionImpl instance = new ProductTypeChangeDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    /**
     * builder factory method for ProductTypeChangeDescriptionAction
     * @return builder
     */
    public static ProductTypeChangeDescriptionActionBuilder builder() {
        return ProductTypeChangeDescriptionActionBuilder.of();
    }
    
    /**
     * create builder for ProductTypeChangeDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeDescriptionActionBuilder builder(final ProductTypeChangeDescriptionAction template) {
        return ProductTypeChangeDescriptionActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeChangeDescriptionAction(Function<ProductTypeChangeDescriptionAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeDescriptionAction>";
            }
        };
    }
}
