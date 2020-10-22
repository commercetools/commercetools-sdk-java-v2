package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.message.ProductDeletedMessageImpl;

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
@JsonDeserialize(as = ProductDeletedMessageImpl.class)
public interface ProductDeletedMessage extends Message {

    
    @NotNull
    @JsonProperty("removedImageUrls")
    public List<String> getRemovedImageUrls();
    
    @NotNull
    @Valid
    @JsonProperty("currentProjection")
    public ProductProjection getCurrentProjection();

    public void setRemovedImageUrls(final List<String> removedImageUrls);
    
    public void setCurrentProjection(final ProductProjection currentProjection);

    public static ProductDeletedMessageImpl of(){
        return new ProductDeletedMessageImpl();
    }
    

    public static ProductDeletedMessageImpl of(final ProductDeletedMessage template) {
        ProductDeletedMessageImpl instance = new ProductDeletedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setRemovedImageUrls(template.getRemovedImageUrls());
        instance.setCurrentProjection(template.getCurrentProjection());
        return instance;
    }

    default <T extends Accessor<ProductDeletedMessage>> T withProductDeletedMessage(Function<ProductDeletedMessage, T> helper) {
        return helper.apply(this);
    }
}
