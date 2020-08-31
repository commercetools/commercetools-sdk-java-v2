package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayloadImpl;

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
@JsonDeserialize(as = ProductRevertedStagedChangesMessagePayloadImpl.class)
public interface ProductRevertedStagedChangesMessagePayload extends MessagePayload {

    
    @NotNull
    @JsonProperty("removedImageUrls")
    public List<String> getRemovedImageUrls();

    public void setRemovedImageUrls(final List<String> removedImageUrls);

    public static ProductRevertedStagedChangesMessagePayloadImpl of(){
        return new ProductRevertedStagedChangesMessagePayloadImpl();
    }
    

    public static ProductRevertedStagedChangesMessagePayloadImpl of(final ProductRevertedStagedChangesMessagePayload template) {
        ProductRevertedStagedChangesMessagePayloadImpl instance = new ProductRevertedStagedChangesMessagePayloadImpl();
        instance.setRemovedImageUrls(template.getRemovedImageUrls());
        return instance;
    }

}
