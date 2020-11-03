package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.ProductImageAddedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductImageAddedMessageImpl.class)
public interface ProductImageAddedMessage extends Message {

    
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();
    
    @NotNull
    @Valid
    @JsonProperty("image")
    public Image getImage();
    
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);
    
    public void setImage(final Image image);
    
    public void setStaged(final Boolean staged);

    public static ProductImageAddedMessageImpl of(){
        return new ProductImageAddedMessageImpl();
    }
    

    public static ProductImageAddedMessageImpl of(final ProductImageAddedMessage template) {
        ProductImageAddedMessageImpl instance = new ProductImageAddedMessageImpl();
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
        instance.setVariantId(template.getVariantId());
        instance.setImage(template.getImage());
        instance.setStaged(template.getStaged());
        return instance;
    }

    default <T> T withProductImageAddedMessage(Function<ProductImageAddedMessage, T> helper) {
        return helper.apply(this);
    }
}
