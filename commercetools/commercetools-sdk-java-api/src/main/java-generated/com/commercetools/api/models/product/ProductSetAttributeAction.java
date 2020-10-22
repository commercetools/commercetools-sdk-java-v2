package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.product.ProductSetAttributeActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductSetAttributeActionImpl.class)
public interface ProductSetAttributeAction extends ProductUpdateAction {

    
    
    @JsonProperty("variantId")
    public Long getVariantId();
    
    
    @JsonProperty("sku")
    public String getSku();
    
    @NotNull
    @JsonProperty("name")
    public String getName();
    /**
    *  <p>If the attribute exists and the value is omitted or set to <code>null</code>, the attribute is removed.
    *  If the attribute exists and a value is provided, the new value is applied.
    *  If the attribute does not exist and a value is provided, it is added as a new attribute.</p>
    */
    
    @JsonProperty("value")
    public JsonNode getValue();
    
    
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);
    
    public void setSku(final String sku);
    
    public void setName(final String name);
    
    public void setValue(final JsonNode value);
    
    public void setStaged(final Boolean staged);

    public static ProductSetAttributeActionImpl of(){
        return new ProductSetAttributeActionImpl();
    }
    

    public static ProductSetAttributeActionImpl of(final ProductSetAttributeAction template) {
        ProductSetAttributeActionImpl instance = new ProductSetAttributeActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setStaged(template.getStaged());
        return instance;
    }

    default <T extends Accessor<ProductSetAttributeAction>> T withProductSetAttributeAction(Function<ProductSetAttributeAction, T> helper) {
        return helper.apply(this);
    }
}
