package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.ProductPublishScope;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.product.ProductProjection;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.message.ProductPublishedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductPublishedMessageImpl.class)
public interface ProductPublishedMessage extends Message {

    
    @NotNull
    @JsonProperty("removedImageUrls")
    public List<JsonNode> getRemovedImageUrls();
    
    @NotNull
    @Valid
    @JsonProperty("productProjection")
    public ProductProjection getProductProjection();
    
    @NotNull
    @JsonProperty("scope")
    public ProductPublishScope getScope();

    public void setRemovedImageUrls(final List<JsonNode> removedImageUrls);
    
    public void setProductProjection(final ProductProjection productProjection);
    
    public void setScope(final ProductPublishScope scope);

    public static ProductPublishedMessageImpl of(){
        return new ProductPublishedMessageImpl();
    }
    

    public static ProductPublishedMessageImpl of(final ProductPublishedMessage template) {
        ProductPublishedMessageImpl instance = new ProductPublishedMessageImpl();
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
        instance.setProductProjection(template.getProductProjection());
        instance.setScope(template.getScope());
        return instance;
    }

}
