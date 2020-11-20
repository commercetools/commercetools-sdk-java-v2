package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.message.ProductVariantAddedMessageImpl;

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
@JsonDeserialize(as = ProductVariantAddedMessageImpl.class)
public interface ProductVariantAddedMessage extends Message {

    
    @NotNull
    @Valid
    @JsonProperty("variant")
    public ProductVariant getVariant();
    
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariant(final ProductVariant variant);
    
    public void setStaged(final Boolean staged);

    public static ProductVariantAddedMessageImpl of(){
        return new ProductVariantAddedMessageImpl();
    }
    

    public static ProductVariantAddedMessageImpl of(final ProductVariantAddedMessage template) {
        ProductVariantAddedMessageImpl instance = new ProductVariantAddedMessageImpl();
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
        instance.setVariant(template.getVariant());
        instance.setStaged(template.getStaged());
        return instance;
    }

    default <T> T withProductVariantAddedMessage(Function<ProductVariantAddedMessage, T> helper) {
        return helper.apply(this);
    }
}
